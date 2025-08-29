# Sistema de Fidelización de Clientes 🏢

## 📌 Descripción General del Backend

Este proyecto es una API REST desarrollada con Spring Boot que gestiona un sistema de fidelización de clientes. Permite administrar información de clientes, países, departamentos, ciudades, tipos de identificación, marcas y programas de fidelización, proporcionando una estructura robusta para la gestión de datos empresariales.

## 📂 Estructura del Proyecto

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
