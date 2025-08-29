# Sistema de Fidelización GCO

Este proyecto implementa un sistema de fidelización para el grupo empresarial GCO, permitiendo gestionar clientes y su relación con las diferentes marcas del grupo.

## 🔍 Descripción General

El sistema está construido con una arquitectura moderna de tres capas:

- Frontend en React + Vite
- Backend en Spring Boot
- Base de datos MySQL

## 🚀 Backend

# Sistema de Fidelización de Clientes 🏢

## 📌 Descripción General del Backend

Este proyecto es una API REST desarrollada con Spring Boot que gestiona un sistema de fidelización de clientes. Permite administrar información de clientes, países, departamentos, ciudades, tipos de identificación, marcas y programas de fidelización, proporcionando una estructura robusta para la gestión de datos empresariales.

## 📂 Estructura del Backend

```
src/
├── main/
│   ├── java/com/example/aplicacion_prueba/
│   │   ├── controllers/     # Controladores REST
│   │   ├── models/          # Entidades JPA
│   │   ├── repositories/    # Repositorios JPA
│   │   ├── services/        # Lógica de negocio
│   │   └── AplicacionPruebaApplication.java
│   └── resources/
│       └── application.properties  # Configuración de la aplicación
```

### Componentes Principales:

- **Controllers**: Manejan las peticiones HTTP y definen los endpoints de la API
- **Models**: Definen las entidades y sus relaciones
- **Repositories**: Gestionan el acceso a datos mediante JPA
- **Services**: Implementan la lógica de negocio
- **Resources**: Contienen configuraciones y archivos estáticos

## 🛠️ Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal
- **Spring Boot 3.5.5**: Framework para desarrollo de aplicaciones Java
- **Spring Data JPA**: Para la persistencia de datos
- **MySQL**: Sistema de gestión de base de datos
- **Maven**: Gestor de dependencias y construcción
- **Spring Boot DevTools**: Herramientas de desarrollo y hot-reload
- **Spring Web**: Para desarrollo de APIs REST

## ⚙️ Implementaciones y Procesos

### Endpoints Principales

- **Clientes**: CRUD de clientes
  - GET /clientes: Listar todos los clientes
  - GET /clientes/{id}: Obtener cliente por ID
  - POST /clientes: Crear nuevo cliente
- **Gestión Geográfica**:

  - Países
  - Departamentos
  - Ciudades

- **Configuración**:
  - Tipos de Identificación
  - Marcas
  - Programas de Fidelización

### Características

- Arquitectura REST
- Validaciones de datos
- Respuestas HTTP estandarizadas

## 🗄️ Base de Datos

### Motor de Base de Datos

- MySQL 8
- Base de datos: `fidelizacion_db`

### Configuración

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fidelizacion_db
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### Modelos Principales

- Cliente
- Pais
- Departamento
- Ciudad
- TipoIdentificacion
- Marca
- Fidelizacion

## 🚀 Guía de Instalación y Ejecución

1. **Prerrequisitos**

   - Java 17 o superior
   - MySQL 8
   - Maven

2. **Clonar el repositorio**

   ```bash
   git clone https://github.com/ParraC19/Pureba-TecnicaGCO.git
   cd aplicacion-prueba
   ```

3. **Configurar la base de datos**

   - Crear una base de datos MySQL llamada `fidelizacion_db`
   - Actualizar las credenciales en `application.properties`

4. **Compilar y ejecutar**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

El servidor se iniciará en `http://localhost:8080`

## 📖 Uso del Proyecto

### Ejemplo de Peticiones

1. **Crear un Cliente**

   ```bash
   curl -X POST http://localhost:8080/clientes \
   -H "Content-Type: application/json" \
   -d '{
     "nombre": "Juan Pérez",
     "tipoIdentificacion": {"id": 1},
     "numeroIdentificacion": "123456789"
   }'
   ```

2. **Obtener Todos los Clientes**
   ```bash
   curl http://localhost:8080/clientes
   ```


## 💻 Frontend

# Frontend Fidelización GCO

![Logo GCO](src/assets/images/gco_logo_sinfondo.png)

## 📌 Descripción General

Este proyecto frontend está desarrollado para GCO, implementando un sistema de fidelización de clientes que permite el registro y vinculación con diferentes marcas comerciales. La aplicación presenta una interfaz moderna con un carrusel de imágenes de marcas y un formulario de registro interactivo que se conecta con un backend para gestionar la información de los clientes.

## 📂 Estructura del Proyecto de Fidelización de Clientes GCO

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


## 🗄️ Base de Datos

### Estructura

El script `fidelizacion-db.sql` define el esquema de la base de datos con las siguientes tablas:

- **paises**: Catálogo de países
- **departamentos**: Divisiones administrativas de los países
- **ciudades**: Ciudades asociadas a departamentos
- **tipos_identificacion**: Tipos de documentos de identidad
- **marcas**: Marcas del grupo GCO
- **clientes**: Información de los clientes
- **fidelizacion**: Relación entre clientes y marcas

### Relaciones

- Cliente → Ciudad (Ubicación)
- Cliente → Tipo Identificación
- Fidelización → Cliente y Marca
- Ciudad → Departamento → País

## 🛠️ Instalación y Despliegue

### Requisitos Previos

- Java 17 JDK
- Node.js 18+
- MySQL 8.0+
- Maven

### Base de Datos

1. Crear la base de datos:

```bash
mysql -u root -p < fidelizacion-db.sql
```

### Backend

1. Navegar al directorio del backend:

```bash
cd aplicacion-prueba
```

2. Construir el proyecto:

```bash
mvn clean install
```

3. Ejecutar la aplicación:

```bash
mvn spring-boot:run
```

### Frontend

1. Navegar al directorio del frontend:

```bash
cd front-prueba
```

2. Instalar dependencias:

```bash
npm install
```

3. Iniciar el servidor de desarrollo:

```bash
npm run dev
```
