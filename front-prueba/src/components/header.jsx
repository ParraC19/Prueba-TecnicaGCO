import logo from '/public/images/gco_logo_sinfondo.png'
import iconos from '/public/images/gco_iconos_logo.png'

export function Header() {
    return (
    <header className='w-full h-20 flex items-center justify-center border-b-2 border-gray-200'>
        <div className='w-full h-16 flex justify-center items-center flex-row'>
            <img src={iconos} alt="iconosLogo" className='h-full'/>
            <img src={logo} alt="LogoGCO" className='h-full' />
            <img src={iconos} alt="iconosLogo" className='h-full transform scale-x-[-1]' />
        </div>
        
    </header>)
}

