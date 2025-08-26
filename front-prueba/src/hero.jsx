import { useState } from "react";
import useMetodosHTTP from "./helpers/metodosHTTP.jsx";

const initialForm = {
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

function Hero() {
  const [formData, setFormData] = useState(initialForm);
  const [tiposIdentificacion, setTiposIdentificacion] = useState([]);
  const [pais, setPais] = useState([]);
  const [departamento, setDepartamento] = useState([]);
  const [ciudad, setCiudad] = useState([]);
  const [marca, setMarca] = useState([]);

  const handleChange = (e) => {
    const { name, value } = e.target;

    // Para los selects que son objetos (tipoIdentificacion, pais, departamento, ciudad, marca)
    if (name === "tipoIdentificacion") {
      setFormData({
        ...formData,
        tipoIdentificacion: {
          ...formData.tipoIdentificacion,
          idTipoIdentificacion: Number(value),
        },
      });
    } else if (name === "pais") {
      setFormData({
        ...formData,
        pais: {
          ...formData.pais,
          idPais: Number(value),
        },
      });
    } else if (name === "departamento") {
      setFormData({
        ...formData,
        departamento: {
          ...formData.departamento,
          idDepartamento: Number(value),
        },
      });
    } else if (name === "ciudad") {
      setFormData({
        ...formData,
        ciudad: {
          ...formData.ciudad,
          idCiudad: Number(value),
        },
      });
    } else if (name === "marca") {
      setFormData({
        ...formData,
        marca: {
          ...formData.marca,
          idMarca: Number(value),
        },
      });
    } else {
      // Para inputs simples como nombre, apellidos, direccion, fechaNacimiento, numeroIdentificacion
      setFormData({
        ...formData,
        [name]: value,
      });
    }
  };

  // IMPORTANTE: Ahora pasamos setFormData e initialForm al hook
  const { handleSubmit } = useMetodosHTTP(
    setPais,
    setDepartamento,
    setCiudad,
    setTiposIdentificacion,
    setMarca,
    formData,
    setFormData,
    initialForm
  );

  return (
    <div className="relative py-6 sm:max-w-3xl sm:mx-auto">
      <div className="relative px-6 py-10 bg-white mx-4 md:mx-0 shadow rounded-3xl sm:p-10">
        <div className="max-w-2xl mx-auto">
          {/* Encabezado */}
          <div className="text-center mb-6">
            <h2 className="text-2xl font-bold text-blue-600">
              Registro de Fidelización
            </h2>
            <p className="text-gray-500">
              Ingresa tus datos para unirte al programa
            </p>
          </div>

          {/* Formulario */}
          <form onSubmit={handleSubmit}>
            <div className="mt-5 grid grid-cols-1 sm:grid-cols-2 gap-5">
              {/* Tipo de identificación */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Tipo de identificación
                </label>
                <select
                  name="tipoIdentificacion"
                  value={formData.tipoIdentificacion.idTipoIdentificacion}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                >
                  <option value="">Seleccione</option>
                  {tiposIdentificacion.map((tipo) => (
                    <option
                      className="text-gray-700"
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
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Número de identificación
                </label>
                <input
                  type="text"
                  name="numeroIdentificacion"
                  value={formData.numeroIdentificacion}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                />
              </div>

              {/* Nombres */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Nombres
                </label>
                <input
                  type="text"
                  name="nombre"
                  value={formData.nombre}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                />
              </div>

              {/* Apellidos */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Apellidos
                </label>
                <input
                  type="text"
                  name="apellidos"
                  value={formData.apellidos}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                />
              </div>

              {/* Fecha de nacimiento */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Fecha de nacimiento
                </label>
                <input
                  type="date"
                  name="fechaNacimiento"
                  value={formData.fechaNacimiento}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                />
              </div>

              {/* Dirección */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Dirección
                </label>
                <input
                  type="text"
                  name="direccion"
                  value={formData.direccion}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                />
              </div>

              {/* País */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  País
                </label>
                <select
                  name="pais"
                  value={formData.pais.idPais}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                >
                  <option value="">Seleccione</option>
                  {pais.map((pais) => (
                    <option
                      className="text-gray-700"
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
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Departamento
                </label>
                <select
                  name="departamento"
                  value={formData.departamento.idDepartamento}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                >
                  <option value="">Seleccione</option>
                  {departamento.map((dep) => (
                    <option
                      className="text-gray-700"
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
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Ciudad
                </label>
                <select
                  name="ciudad"
                  value={formData.ciudad.idCiudad}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                >
                  <option value="">Seleccione</option>
                  {ciudad.map((city) => (
                    <option
                      className="text-gray-700"
                      key={city.idCiudad}
                      value={city.idCiudad}
                    >
                      {city.ciudad}
                    </option>
                  ))}
                </select>
              </div>

              {/* Marca */}
              <div>
                <label className="font-semibold text-sm text-gray-600 pb-1 block">
                  Marca
                </label>
                <select
                  name="marca"
                  value={formData.marca.idMarca}
                  onChange={handleChange}
                  required
                  className="border rounded-lg px-3 py-2 mt-1 w-full text-sm focus:border-blue-500 focus:ring-2 focus:ring-blue-500"
                >
                  <option value="">Seleccione</option>
                  {marca.map((brand) => (
                    <option
                      className="text-gray-700"
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
                className="py-2 px-4 bg-blue-600 hover:bg-blue-700 focus:ring-blue-500 text-white w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md rounded-lg"
              >
                Registrarse
              </button>
            </div>

            {/* Link */}
            <div className="flex items-center justify-center mt-4">
              <a
                href="#"
                className="text-xs text-gray-500 uppercase hover:underline"
              >
                ¿Ya tienes cuenta? Inicia sesión
              </a>
            </div>
          </form>
          
        </div>
      </div>
    </div>
  );
}

export default Hero;