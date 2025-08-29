import logo from "/src/assets/images/gco_logo_sinfondo.png";
import iconos from "/src/assets/images/gco_iconos_logo.png";

export function Header() {
  return (
    <header className="w-full h-20 flex items-center justify-center border-gray-200 fixed z-50 top-0 bg-neutral-900">
      <div className="w-full h-16 flex justify-center items-center flex-row ">
        <div className="w-1/3 h-full flex justify-center items-center">
        <img src={iconos} alt="iconosLogo" className="size-1/2 md:h-1/3 md:w-1/5" />
        <img src={logo} alt="LogoGCO" className="h-full"/>
        <img
          src={iconos}
          alt="iconosLogo"
          className="size-1/2 transform scale-x-[-1] md:h-1/3 md:w-1/5"
        />
        </div>
      </div>
    </header>
  );
}
