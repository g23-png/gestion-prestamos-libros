# 📚 Sistema de Gestión de Préstamos de Libros

## 📌 Descripción

Este proyecto implementa un sistema de gestión de préstamos de libros desarrollado en Java, utilizando el paradigma de Programación Orientada a Objetos (POO).

El sistema permite registrar libros, usuarios, gestionar préstamos y devoluciones, facilitando el control y organización de una biblioteca de manera eficiente.

---

## 🎯 Objetivo

Desarrollar una solución que permita automatizar el proceso de préstamos de libros, aplicando buenas prácticas de programación y principios de POO.

---

## ⚙️ Funcionalidades

* 📖 Registro de libros
* 👤 Registro de usuarios
* 🔄 Gestión de préstamos
* ✅ Gestión de devoluciones
* 📊 Control de disponibilidad de libros

---

## 🧠 Principios de Programación Orientada a Objetos

### 🔹 Encapsulamiento

Se implementa mediante atributos privados y métodos públicos (getters y setters), garantizando la protección de los datos y el acceso controlado a la información.

### 🔹 Herencia

Se utiliza una clase base `Persona`, de la cual heredan otras clases como `Usuario`, permitiendo la reutilización de atributos comunes y una mejor organización del código.

### 🔹 Polimorfismo

Se aplica mediante la sobrescritura de métodos (por ejemplo, `toString()`), permitiendo diferentes comportamientos según el tipo de objeto.

---

## 🏗️ Estructura del Proyecto

```
gestion-prestamos-libros/
│
├── Biblioteca.java
├── Libro.java
├── Usuario.java
├── Persona.java
├── Prestamo.java
├── Devolucion.java
├── GestionLibro.java
├── GestionUsuario.java
├── GestionPrestamo.java
├── GestionDevolucion.java
├── UML.jpg
└── README.md
```

---

## 🚀 Cómo ejecutar el proyecto

### 🔹 Requisitos

* Java JDK 8 o superior
* NetBeans / IntelliJ IDEA / Eclipse

### 🔹 Pasos

1. Clonar el repositorio:

```bash
git clone https://github.com/g23-png/gestion-prestamos-libros.git
```

2. Abrir el proyecto en tu entorno de desarrollo (NetBeans recomendado)

3. Ejecutar la clase principal:

```
Biblioteca.java
```

---

## 🖼️ Diagrama UML

El sistema incluye un diagrama de clases que representa la estructura y relaciones entre las entidades del sistema.

📎 Archivo: `UML.jpg`

---

## 🎥 Video de presentación

(Agregar aquí el link del video)

---

## 👤 Autor

**Daniel Gonzalez**

---

## 📚 Bibliografía

* Oracle. (2023). Documentación oficial de Java
* Deitel, P. & Deitel, H. *Java: Cómo programar*
* Sommerville, I. *Ingeniería de Software*

---
