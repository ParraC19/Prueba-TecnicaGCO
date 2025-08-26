import { useEffect } from "react";
import Swal from "sweetalert2";

function useMetodosHTTP(
  setPais,
  setDepartamento,
  setCiudad,
  setTiposIdentificacion,
  setMarca,
  formData,
  setFormData,
  initialForm // Recibimos el initialForm como parámetro
) {
  // Cargar datos iniciales
  useEffect(() => {
    // Cargar tipos de identificación
    fetch("http://localhost:8080/tipo-identificacion")
      .then((res) => res.json())
      .then((data) => setTiposIdentificacion(data))
      .catch((err) => console.error("Error cargando tipos:", err));

    // Cargar países
    fetch("http://localhost:8080/paises")
      .then((res) => res.json())
      .then((data) => setPais(data))
      .catch((err) => console.error("Error cargando paises:", err));

    // Cargar marcas
    fetch("http://localhost:8080/marca")
      .then((res) => res.json())
      .then((data) => setMarca(data))
      .catch((err) => console.error("Error cargando marcas:", err));
  }, []);

  // Cuando cambia país → cargar departamentos
  useEffect(() => {
    if (formData.pais.idPais) {
      fetch(
        `http://localhost:8080/departamentos/paises/${formData.pais.idPais}`
      )
        .then((res) => res.json())
        .then((data) => setDepartamento(data))
        .catch((err) => console.error("Error cargando departamentos:", err));
    } else {
      setDepartamento([]);
      setCiudad([]);
    }
  }, [formData.pais.idPais]);

  // Cuando cambia departamento → cargar ciudades
  useEffect(() => {
    if (formData.departamento.idDepartamento) {
      fetch(
        `http://localhost:8080/ciudades/departamentos/${formData.departamento.idDepartamento}`
      )
        .then((res) => res.json())
        .then((data) => setCiudad(data))
        .catch((err) => console.error("Error cargando ciudades:", err));
    } else {
      setCiudad([]);
    }
  }, [formData.departamento.idDepartamento]);

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const clienteResponse = await fetch("http://localhost:8080/cliente", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          tipoIdentificacion: {
            idTipoIdentificacion:
              formData.tipoIdentificacion.idTipoIdentificacion,
          },
          nombre: formData.nombre,
          apellidos: formData.apellidos,
          fechaNacimiento: formData.fechaNacimiento,
          numeroIdentificacion: formData.numeroIdentificacion,
          direccion: formData.direccion,
          ciudad: { idCiudad: formData.ciudad.idCiudad },
        }),
      });

      if (!clienteResponse.ok) {
        throw new Error("Error en la petición: " + clienteResponse.status);
      }

      const clienteData = await clienteResponse.json();

      await fetch("http://localhost:8080/fidelizacion", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          cliente: { idCliente: clienteData.idCliente },
          marca: { idMarca: Number(formData.marca.idMarca) },
        }),
      });

      // AQUÍ ESTÁ LA CORRECCIÓN: Ahora sí podemos usar setFormData e initialForm
      setFormData(initialForm);

      // También limpiamos los arrays dependientes para un reset completo
      setDepartamento([]);
      setCiudad([]);

      Swal.fire({
        title: "Good job!",
        text: "You clicked the button!",
        icon: "success",
      });
    } catch (error) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Something went wrong!",
      });
    }
  };

  return { handleSubmit };
}

export default useMetodosHTTP;
