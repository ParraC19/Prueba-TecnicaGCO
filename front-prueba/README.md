# Frontend Fidelización GCO

![Logo GCO](src/assets/images/gco_logo_sinfondo.png)

## 📌 Descripción General

Este proyecto frontend está desarrollado para GCO, implementando un sistema de fidelización de clientes que permite el registro y vinculación con diferentes marcas comerciales. La aplicación presenta una interfaz moderna con un carrusel de imágenes de marcas y un formulario de registro interactivo que se conecta con un backend para gestionar la información de los clientes.

## 📂 Estructura del Proyecto de Fidelización de Clientes GCO

![Logo GCO](src/assets/images/gco_logo_sinfondo.png)

## 📌 Descripción General

Este proyecto es una aplicación web desarrollada para GCO que permite gestionar la fidelización de clientes para diferentes marcas comerciales. La aplicación proporciona un formulario de registro interactivo donde los clientes pueden inscribirse en el programa de fidelización, seleccionando su marca preferida y proporcionando sus datos personales.

## 📂 Estructura del Proyecto

```
front-prueba/
├── public/
│   ├── fonts/
│   │   └── Belgrano-Regular.ttf
│   └── vite.svg
├── src/
│   ├── assets/
│   │   └── images/
│   │       ├── gco_iconos_logo.png
│   │       ├── gco_logo_sinfondo.png
│   │       └── [otras imágenes de marcas]
│   ├── components/
│   │   ├── Carrusel.jsx
│   │   |── Header.jsx
|   |   └── Formulario.jsx
│   ├── helpers/
│   │   |── gets.jsx
|   |   └── posts.jsx
│   ├── App.jsx
│   ├── global.css
│   ├── index.css
│   └── main.jsx
├── index.html
├── package.json
├── vite.config.js
├── postcss.config.js
└── tailwind.config.js
```

### Organización del Frontend

- **components/**: Componentes reutilizables
  - `header.jsx`: Encabezado con logo de la aplicación
  - `carrusel.jsx`: Carrusel de imágenes de marcas
- **config/**: Utilidades y servicios
  - `gets.jsx & posts.jsx`: Hook personalizado para gestionar peticiones HTTP
- **assets/**: Recursos estáticos (imágenes)

## 🛠️ Tecnologías Utilizadas

### Core

- **React v19.1.1**: Framework principal para la construcción de la interfaz de usuario
- **React DOM v19.1.1**: Renderizado de componentes React en el navegador
- **Vite v7.1.2**: Herramienta de construcción y desarrollo que proporciona un entorno rápido

### Estilos y UI

- **Tailwind CSS v4.1.12**: Framework de utilidades CSS para el diseño
- **SweetAlert2 v11.22.4**: Biblioteca para mostrar alertas y notificaciones elegantes

### Desarrollo y Calidad de Código

- **ESLint v9.33.0**: Herramienta de linting para mantener la calidad del código
- **@vitejs/plugin-react-swc**: Plugin para la compilación rápida de React
- **eslint-plugin-react-hooks**: Reglas de ESLint para Hooks de React
- **TypeScript Types**: Tipos para React y React DOM (@types/react, @types/react-dom)

## ⚙️ Implementaciones y Procesos

### Principales Funcionalidades

1. **Componentes Principales**

   - `Header`: Barra de navegación superior con logo e iconos de GCO
   - `Formulario`: Componente principal para el registro de fidelización
   - `CarruselFondo`: Carrusel de imágenes de marcas comerciales

2. **Integración con Backend**

   - Endpoints consumidos (`http://localhost:8080`):
     - `/tipo-identificacion`: Obtención de tipos de documento
     - `/paises`: Listado de países disponibles
     - `/departamentos/paises/{id}`: Departamentos por país
     - `/ciudades/departamentos/{id}`: Ciudades por departamento
     - `/marca`: Listado de marcas disponibles
     - `/cliente`: Registro de nuevos clientes
     - `/fidelizacion`: Registro de fidelización cliente-marca

3. **Gestión de Estado**

   - Estados independientes para cada selector (país, departamento, ciudad)
   - Estados dependientes con useEffect para actualización en cascada
   - Hook personalizado `gets.jsx & posts.jsx` para centralizar lógica de peticiones

4. **UI/UX**
   - Validaciones de formulario HTML5
   - Feedback visual con SweetAlert2
   - Carrusel de imágenes con transiciones suaves

## 🚀 Guía de Instalación y Ejecución

### Requisitos Previos

- Node.js (versión compatible con React 19.x)
- npm o yarn
- Backend del sistema corriendo en `localhost:8080`

### Pasos de Instalación

1. **Instalar dependencias**

   ```bash
   npm install
   ```

2. **Scripts Disponibles**

   ```bash
   npm run dev      # Inicia el servidor de desarrollo
   npm run build    # Construye la aplicación para producción
   npm run preview  # Vista previa de la build de producción
   npm run lint     # Ejecuta el linting del código
   ```

3. **Variables de Entorno**
   - El backend debe estar corriendo en `http://localhost:8080`
   - Asegurarse de tener acceso a los endpoints necesarios

## 📖 Uso del Proyecto

1. Acceder a la aplicación a través del navegador
2. Completar el formulario de registro con:
   - Datos personales
   - Tipo y número de identificación
   - Ubicación
   - Marca de preferencia
3. Enviar el formulario para registrar la fidelización

## 📝 Notas de Desarrollo

- La fuente Belgrano se utiliza como tipografía principal
- Las peticiones HTTP están centralizadas en hooks personalizados
- Se utiliza SweetAlert2 para las notificaciones del sistema

## 👥 Contribuir

1. Hacer fork del repositorio
2. Crear una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit de tus cambios (`git commit -m 'Add: AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir un Pull Request

## 📄 Dependencias Principales

```json
{
  "react": "^19.1.1",
  "react-dom": "^19.1.1",
  "sweetalert2": "^11.22.4",
  "tailwindcss": "^4.1.12",
  "vite": "^7.1.2"
}
```

---

Desarrollado con ❤️ para GCO © 2025
