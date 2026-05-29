# Calculadora Spring Boot REST API

Una API REST sencilla construida con Spring Boot que proporciona operaciones aritméticas básicas (`+`, `-`, `*`, `/`).

## 📖 Documentación Interactiva (Docsify)

Este proyecto cuenta con una plataforma de documentación interactiva dinámica y moderna construida con **Docsify**. Esta integra de forma centralizada:
- Guías de uso y arquitectura.
- La consola interactiva de **Swagger UI** (OpenAPI 3.1.1) para realizar pruebas en vivo sobre el endpoint `/calcular`.
- Enlaces rápidos a archivos técnicos del repositorio (`GEMINI.md`).

### Cómo visualizar la documentación interactiva localmente

Docsify genera la documentación en tiempo real directamente en el navegador. Puedes servir el directorio `/docs` utilizando cualquier servidor local simple:

#### Opción A: Python (Preinstalado en la mayoría de sistemas)
```bash
python -m http.server 3000 --directory docs
```

#### Opción B: Node.js / npm
```bash
npx serve docs
```

Una vez que el servidor esté corriendo, abre [http://localhost:3000](http://localhost:3000) en tu navegador preferido.

---

## 🚀 Inicio Rápido del Backend

Si quieres compilar y arrancar la API REST directamente en tu entorno local:

### Construir el Proyecto
```bash
./mvnw clean compile
```

### Ejecutar las Pruebas Unitarias
```bash
./mvnw test
```

### Iniciar la Aplicación
```bash
./mvnw spring-boot:run
```
La API estará disponible por defecto en [http://localhost:8080/calcular](http://localhost:8080/calcular).

---

## 📂 Enlaces de Referencia Rápida
* 📂 **[Directorio Docs/ (Docsify)](file:///C:/Users/Alumnos_IBT/calculadoraspring/docs/):** Archivos del portal estático de documentación.
* 📄 **[GEMINI.md](file:///C:/Users/Alumnos_IBT/calculadoraspring/GEMINI.md):** Manual detallado de desarrollo, estándares y cobertura del proyecto.
* 📄 **[openapi.yaml](file:///C:/Users/Alumnos_IBT/calculadoraspring/docs/openapi.yaml):** Especificación Swagger / OpenAPI 3.1.1 en YAML.
