# **Microservicio de productos**

[![Licencia](https://img.shields.io/badge/license-Custom-orange)](LICENSE)  
[![Java](https://img.shields.io/badge/language-Java-blue)](https://www.java.com/)

## **Descripción**
Esta proyecto es un microservicio con **Arquitectura Hexagonal**, que utiliza como base el proyecto **common-lib** subido en este mismo perfil.

---

## **Características principales**
- **Arquitectura Hexagonal:** Separación clara entre lógica de negocio e infraestructura.
- **Alta cohesión y bajo acoplamiento:** Uso extensivo de interfaces para desacoplar la lógica de negocio de las implementaciones técnicas.
---

## **Estructura del Proyecto**
El proyecto está estructura en base a los principios de la arquitectura hexagonal:

```plaintext
src/main/java
├── es.bxg.productservice
│   ├── application    # Lógica de aplicación y casos de uso
│   ├── domain         # Entidades, agregados, y lógica de dominio
│   ├── infrastructure # Adaptadores y configuración técnica
│   ├── loader         # Módulo de arranque de la aplicación

```

## Licencia

Este software está disponible bajo la [Licencia de Uso Personal y Educativo](LICENSE).

- **Uso permitido:** Fines personales, educativos o de investigación no comercial.
- **Uso prohibido:** Fines comerciales, redistribución pública o uso por empresas privadas.

Para obtener más información o consultar sobre licencias comerciales, contacta a [tu correo].