import { useState } from "react";
import useGet from "../config/gets.jsx";
import usePost from "../config/posts.jsx";
import CarruselFondo from "./Carrusel.jsx";

/* Formulario inicial */
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

/* Estado de gets y sets de para guardar los datos de los inputs */
function Formulario() {
  const [dataFormulario, setdataFormulario] = useState(formularioInicial);
  const [tiposIdentificacion, setTiposIdentificacion] = useState([]);
  const [pais, setPais] = useState([]);
  const [departamento, setDepartamento] = useState([]);
  const [ciudad, setCiudad] = useState([]);
  const [marca, setMarca] = useState([]);

  /* Metodos http get(mostrar) */
  useGet(
    setPais,
    setDepartamento,
    setCiudad,
    setTiposIdentificacion,
    setMarca,
    dataFormulario
  );

  /* handleChange para recibir el cambio en los values de los input */
  const handleChange = (e) => {
    const { name, value } = e.target;

    /* Especificacion de selects que traen informacion por seleccion unica */
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
      /* Para inputs simples como nombre, apellidos, direccion, fechaNacimiento, numeroIdentificacion */
      setdataFormulario({
        ...dataFormulario,
        [name]: value,
      });
    }
  };

  /* Hook para enviar los valores del formulario a bd */
  const { handleSubmit } = usePost(setdataFormulario, formularioInicial);

  return (
    /* Seccion principal */
    <section className="relative pt-20 h-screen w-full  flex items-center justify-center bg-gray-100">
      <div className="absolute inset-0 pt-20">
        <CarruselFondo />
      </div>
      {/* Tarjeta de contenido */}
      <div className="relative px-6 py-10 bg-neutral-900/80 mx-4 md:mx-0 shadow sm:p-10 z-10 w-1/3 ">
        <div className="max-w-2xl mx-auto z-10">
          {/* Encabezado */}
          <div className="text-center mb-6 z-10">
            <h2 className="fuente-titulos text-2xl font-bold text-gray-200">
              Registro de Fidelización
            </h2>
            <p className="fuente-titulos text-gray-300">
              Ingresa tus datos para unirte al programa
            </p>
          </div>

          {/* Formulario */}
          <form onSubmit={handleSubmit} className="z-10">
            <div className="mt-5 grid grid-cols-2  gap-5">
              {/* Tipo de identificación */}
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
                  {tiposIdentificacion.map((tipo) => (
                    <option
                      className="text-gray-600"
                      key={tipo.idTipoIdentificacion}
                      value={tipo.idTipoIdentificacion}
                    >
                      {tipo.tipoIdentificacion}
                    </option>
                  ))}
                </select>
              </div>

              {/* Número de identificación */}
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
                  autocomplete="on"
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              {/* Nombres */}
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
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-300 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              {/* Apellidos */}
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
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              {/* Fecha de nacimiento */}
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
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              {/* Dirección */}
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
                  className="border-0 border-b-2 py-2 mt-1 w-full text-sm text-gray-100 focus:border-2 focus:border-gray-300 focus:ps-2 focus:outline-none"
                />
              </div>

              {/* País */}
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
                  {pais.map((pais) => (
                    <option
                      className="text-gray-600"
                      key={pais.idPais}
                      value={pais.idPais}
                    >
                      {pais.pais}
                    </option>
                  ))}
                </select>
              </div>

              {/* Departamento */}
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
                  {departamento.map((dep) => (
                    <option
                      className="text-gray-600"
                      key={dep.idDepartamento}
                      value={dep.idDepartamento}
                    >
                      {dep.departamento}
                    </option>
                  ))}
                </select>
              </div>

              {/* Ciudad */}
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
                  {ciudad.map((c) => (
                    <option
                      className="text-gray-600"
                      key={c.idCiudad}
                      value={c.idCiudad}
                    >
                      {c.ciudad}
                    </option>
                  ))}
                </select>
              </div>

              {/* Marca */}
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
                  {marca.map((brand) => (
                    <option
                      className="text-gray-600"
                      key={brand.idMarca}
                      value={brand.idMarca}
                    >
                      {brand.marca}
                    </option>
                  ))}
                </select>
              </div>
            </div>

            {/* Botón */}
            <div className="mt-6">
              <button
                type="submit"
                className="py-2 px-4 bg-gray-200   hover:scale-105  text-gray-800 w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md cursor-pointer "
              >
                Registrarse
              </button>
            </div>

            {/* Link */}
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
