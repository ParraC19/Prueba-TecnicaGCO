import { useEffect } from "react";


function useGet(setPais,
  setDepartamento,
  setCiudad,
  setTiposIdentificacion,
  setMarca,
  dataFormulario,){
    
    /* Cargar datos iniciales */
  useEffect(() => {
    /* Tipos identificacion */
    fetch("http://localhost:8080/tipo-identificaciones")
      .then((res) => res.json())
      .then((data) => setTiposIdentificacion(data))
      .catch((err) => console.error("Error cargando tipos:", err));

    /* Paises */
    fetch("http://localhost:8080/paises")
      .then((res) => res.json())
      .then((data) => setPais(data))
      .catch((err) => console.error("Error cargando paises:", err));

    /* Marcas */
    fetch("http://localhost:8080/marcas")
      .then((res) => res.json())
      .then((data) => setMarca(data))
      .catch((err) => console.error("Error cargando marcas:", err));
  }, []);

  /* Cambiaar departamento segun el pais */
  useEffect(() => {
    if (dataFormulario.pais.idPais) {
      fetch(
        `http://localhost:8080/departamentos/paises/${dataFormulario.pais.idPais}`
      )
        .then((res) => res.json())
        .then((data) => setDepartamento(data))
        .catch((err) => console.error("Error cargando departamentos:", err));
        
    } else {
      setDepartamento([]);
      setCiudad([]);
    }
  }, [dataFormulario.pais.idPais]);

  /* Cambiar la ciudad segun departamento */
  useEffect(() => {
    if (dataFormulario.departamento.idDepartamento) {
      fetch(
        `http://localhost:8080/ciudades/departamentos/${dataFormulario.departamento.idDepartamento}`
      )
        .then((res) => res.json())
        .then((data) => setCiudad(data))
        .catch((err) => console.error("Error cargando ciudades:", err));
    } else {
      setCiudad([]);
    }
  }, [dataFormulario.departamento.idDepartamento]);
}

export default useGet;