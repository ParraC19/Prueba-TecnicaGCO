# Sistema de Fidelización GCO

Este proyecto implementa un sistema de fidelización para el grupo empresarial GCO, permitiendo gestionar clientes y su relación con las diferentes marcas del grupo.

## 🔍 Descripción General

El sistema está construido con una arquitectura moderna de tres capas:

- Frontend en React + Vite
- Backend en Spring Boot
- Base de datos MySQL

## 🚀 Backend

### Tecnologías Utilizadas

- Java 17
- Spring Boot 3.5.5
- Spring Data JPA
- MySQL Connector
- Spring Boot DevTools

### Estructura del Proyecto

```
aplicacion-prueba/
├── src/main/
│   ├── java/com/example/aplicacion_prueba/
│   │   ├── controllers/
│   │   ├── models/
│   │   ├── repositories/
│   │   └── services/
│   └── resources/
│       └── application.properties
```

### Componentes Principales

- **Controladores**: Manejan las peticiones HTTP y definen los endpoints REST
- **Modelos**: Definen las entidades JPA (Cliente, Fidelización, Ciudad, etc.)
- **Repositorios**: Interfaces para el acceso a datos
- **Servicios**: Implementan la lógica de negocio

### Configuración

La conexión a la base de datos y otras configuraciones se encuentran en `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fidelizacion_db
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## 💻 Frontend

### Tecnologías Utilizadas

- React 19.1.1
- Vite 7.1.2
- TailwindCSS 4.1.12
- SweetAlert2 11.22.4

### Estructura del Proyecto

```
front-prueba/
├── src/
│   ├── assets/
│   │   └── images/
│   ├── components/
│   ├── config/
│   ├── helpers/
│   └── routers/
```

### Componentes Principales

- **Carrusel**: Muestra las marcas del grupo
- **Header**: Navegación principal
- **Hero**: Sección principal de la landing page

### Scripts Disponibles

```bash
npm run dev      # Inicia el servidor de desarrollo
```

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
