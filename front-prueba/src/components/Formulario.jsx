import { useState } from "react";
import useGet from "../config/Gets.jsx";
import usePost from "/src/config/Posts.jsx";
import CarruselFondo from "./Carrusel.jsx";

const formularioInicial = {
  tipoIdentificacion: { idTipoIdentificacion: "" },
  numeroIdentificacion: "",
  nombre: "",
  apellidos: "",
  fechaNacimiento: "",
  direccion: "",
  ciudad: { idCiudad: "" },
  departamento: { idDepartamento: "" },
  pais: { idPais: "" },
  marca: { idMarca: "" },
};


function Formulario() {
  const [dataFormulario, setdataFormulario] = useState(formularioInicial);
  const [tiposIdentificacion, setTiposIdentificacion] = useState([]);
  const [pais, setPais] = useState([]);
  const [departamento, setDepartamento] = useState([]);
  const [ciudad, setCiudad] = useState([]);
  const [marca, setMarca] = useState([]);

  
  useGet(
    setPais,
    setDepartamento,
    setCiudad,
    setTiposIdentificacion,
    setMarca,
    dataFormulario
  );

  
  const handleChange = (e) => {
    const { name, value } = e.target;

    
    if (name === "tipoIdentificacion") {
      setdataFormulario({
        ...dataFormulario,
        tipoIdentificacion: {
          ...dataFormulario.tipoIdentificacion,
          idTipoIdentificacion: Number(value),
        },
      });
    } else if (name === "pais") {
      setdataFormulario({
        ...dataFormulario,
        pais: {
          ...dataFormulario.pais,
          idPais: Number(value),
        },
      });
    } else if (name === "departamento") {
      setdataFormulario({
        ...dataFormulario,
        departamento: {
          ...dataFormulario.departamento,
          idDepartamento: Number(value),
        },
      });
    } else if (name === "ciudad") {
      setdataFormulario({
        ...dataFormulario,
        ciudad: {
          ...dataFormulario.ciudad,
          idCiudad: Number(value),
        },
      });
    } else if (name === "marca") {
      setdataFormulario({
        ...dataFormulario,
        marca: {
          ...dataFormulario.marca,
          idMarca: Number(value),
        },
      });
    } else {
      
      setdataFormulario({
        ...dataFormulario,
        [name]: value,
      });
    }
  };

  
  const { handleSubmit } = usePost(
    dataFormulario,
    setdataFormulario,
    formularioInicial,
    setDepartamento,
    setCiudad
  );

  return (
    
    <section className="relative pt-20 h-screen w-full  flex items-center justify-center bg-gray-100">
      <div className="absolute inset-0 pt-20">
        <CarruselFondo />
      </div>
      
      <div className="relative px-6 py-10 bg-neutral-900/80 mx-4 md:mx-0 shadow sm:p-10 z-10 w-1/3 ">
        <div className="max-w-2xl mx-auto z-10">
          
          <div className="text-center mb-6 z-10">
            <h2 className="fuente-titulos text-2xl font-bold text-gray-200">
              Registro de Fidelización
            </h2>
            <p className="fuente-titulos text-gray-300">
              Ingresa tus datos para unirte al programa
            </p>
          </div>

          
          <form onSubmit={handleSubmit} className="z-10">
            <div className="mt-5 grid grid-cols-2  gap-5">
              
              <div>
                <label className="font-semibold text-sm text-gray-100 pb-1 block">
                  Tipo de identificación
                </label>
                <select
                  name="tipoIdentificacion"
                  value={dataFormulario.tipoIdentificacion.idTipoIdentificacion}
                  onChange={handleChange}
                  required
                  className="border-0 border-b-2  py-2 mt-1 w-full text-sm text-gray-100  focus:border-gray-300 focus:ring-1 focus:ring-gray-300 focus:outline-none"
                >
                  <option value="" className="text-gray-600">
                    Seleccione
                  </option>
                  {tiposIdentificacion.map((index) => (
                    <option
                      className="text-gray-600"
                      key={index.idTipoIdentificacion}
                      value={index.idTipoIdentificacion}
                    >
                      {index.tipoIdentificacion}
                    </option>
                  ))}
                </select>
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Número de identificación
                </label>
                <input
                  type="text"
                  name="numeroIdentificacion"
                  value={dataFormulario.numeroIdentificacion}
                  onChange={handleChange}
                  required
                  autoComplete="off"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Nombres
                </label>
                <input
                  type="text"
                  name="nombre"
                  value={dataFormulario.nombre}
                  onChange={handleChange}
                  required
                  autoComplete="off"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-300 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Apellidos
                </label>
                <input
                  type="text"
                  name="apellidos"
                  value={dataFormulario.apellidos}
                  onChange={handleChange}
                  required
                  autoComplete="off"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Fecha de nacimiento
                </label>
                <input
                  type="date"
                  name="fechaNacimiento"
                  value={dataFormulario.fechaNacimiento}
                  onChange={handleChange}
                  required
                  autoComplete="off"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Dirección
                </label>
                <input
                  type="text"
                  name="direccion"
                  value={dataFormulario.direccion}
                  onChange={handleChange}
                  required
                  autoComplete="off"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  País
                </label>
                <select
                  name="pais"
                  value={dataFormulario.pais.idPais}
                  onChange={handleChange}
                  required
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                >
                  <option value="" className="text-gray-600">
                    Seleccione
                  </option>
                  {pais.map((index) => (
                    <option
                      className="text-gray-600"
                      key={index.idPais}
                      value={index.idPais}
                    >
                      {index.pais}
                    </option>
                  ))}
                </select>
              </div>

             
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Departamento
                </label>
                <select
                  name="departamento"
                  value={dataFormulario.departamento.idDepartamento}
                  onChange={handleChange}
                  required
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none "
                >
                  <option value="" className="text-gray-600">
                    Seleccione
                  </option>
                  {departamento.map((index) => (
                    <option
                      className="text-gray-600"
                      key={index.idDepartamento}
                      value={index.idDepartamento}
                    >
                      {index.departamento}
                    </option>
                  ))}
                </select>
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Ciudad
                </label>
                <select
                  name="ciudad"
                  value={dataFormulario.ciudad.idCiudad}
                  onChange={handleChange}
                  required
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                >
                  <option value="" className="text-gray-600">
                    Seleccione
                  </option>
                  {ciudad.map((index) => (
                    <option
                      className="text-gray-600"
                      key={index.idCiudad}
                      value={index.idCiudad}
                    >
                      {index.ciudad}
                    </option>
                  ))}
                </select>
              </div>

              
              <div>
                <label className="font-semibold text-sm text-gray-300 pb-1 block">
                  Marca
                </label>
                <select
                  name="marca"
                  value={dataFormulario.marca.idMarca}
                  onChange={handleChange}
                  required
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                >
                  <option value="" className="text-gray-600">
                    Seleccione
                  </option>
                  {marca.map((index) => (
                    <option
                      className="text-gray-600"
                      key={index.idMarca}
                      value={index.idMarca}
                    >
                      {index.marca}
                    </option>
                  ))}
                </select>
              </div>
            </div>

            
            <div className="mt-6">
              <button
                type="submit"
                className="py-2 px-4 bg-gray-200   hover:scale-105  text-gray-800 w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md cursor-pointer "
              >
                Registrarse
              </button>
            </div>

           
            <div className="flex items-center justify-center mt-4">
              <a
                href="#"
                className="text-xs text-gray-200 uppercase hover:underline"
              >
                ¿Ya tienes cuenta? Inicia sesión
              </a>
            </div>
          </form>
        </div>
      </div>
    </section>
  );
}

export default Formulario;
