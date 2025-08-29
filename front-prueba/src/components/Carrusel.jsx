import { useState, useEffect } from "react";

/* Imagenes fondo main section */
function CarruselFondo() {
  const imagenes = [
    "/src/assets/images/imagenAmericanino.jpg",
    "/src/assets/images/imagenAmericanEagle.jpg",
    "/src/assets/images/imagenChevignon.jpg",
    "/src/assets/images/imagenEspirit.jpg",
    "/src/assets/images/imagenNafNaf.jpg",
    "/src/assets/images/imagenRifle.jpg"
  ];

  const [current, setCurrent] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setCurrent((prev) => (prev + 1) % imagenes.length);
    }, 4000);
    return () => clearInterval(interval);
  }, [imagenes.length]);

  return (
    <section className="relative w-full h-full flex items-center object-contain pt-20 ">
      {/* Fondo con carrusel */}
      {imagenes.map((src, index) => (
        <img
          key={index}
          src={src}
          alt={`slide-${index}`}
          className={`absolute inset-0 w-full h-full object-fill transition-opacity duration-1000  ${
            index === current ? "opacity-100" : "opacity-0"
          }`}
        />
      ))}

      {/* Capa oscura opcional para legibilidad */}
      <div className="absolute inset-0 bg-neutral-800/90"></div>

      

      
    </section>
  );
}



export default CarruselFondo;
