import Swal from "sweetalert2";

/* FUncion para guardar los datos del formulario en bd */
function usePost(setdataFormulario, formularioInicial) {
  const handleSubmit = async (e) => {
    e.preventDefault();

    /* Metodo http para tabla cliente POST */
    try {
      const clienteResponse = await fetch("http://localhost:8080/clientes", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ // Datos a enviar
          tipoIdentificacion: {
            idTipoIdentificacion:
              dataFormulario.tipoIdentificacion.idTipoIdentificacion,
          },
          nombre: dataFormulario.nombre,
          apellidos: dataFormulario.apellidos,
          fechaNacimiento: dataFormulario.fechaNacimiento,
          numeroIdentificacion: dataFormulario.numeroIdentificacion,
          direccion: dataFormulario.direccion,
          ciudad: { idCiudad: dataFormulario.ciudad.idCiudad },
        }),
      });

      if (!clienteResponse.ok) {
        throw new Error("Error en la petición: " + clienteResponse.status);
      }

      const clienteData = await clienteResponse.json();

      /* Metodo http para tabla fidelizacion POST */
      await fetch("http://localhost:8080/fidelizaciones", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ // Datos a enviar
          cliente: { idCliente: clienteData.idCliente },
          marca: { idMarca: Number(dataFormulario.marca.idMarca) },
        }),
      });

      /* Funcion para resetear formulario - departamento - ciudad */
      setdataFormulario(formularioInicial);
      setDepartamento([]);
      setCiudad([]);

      /* Alertas */
      Swal.fire({
        title: "Registro exitoso!",
        text: "Gracias por tu fidelidad!",
        icon: "success",
      });
    } catch (error) {
      Swal.fire({
        icon: "error",
        title: "Oopsi...",
        text: "Algo salio mal!",
      });
    }
  };
  return { handleSubmit };
}
export default usePost;
