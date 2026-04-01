package com.AndaZac.Web.model;

public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String categoria; // "Andamios", "Maquinaria", "Otros"
    private String imagenUrl; // La ruta de la foto, ej: "assets/img/gallery/project1.png"

    // Constructor vacío (necesario para Spring)
    public Producto() {
    }

    // Constructor con todos los datos
    public Producto(Long id, String nombre, String descripcion, String categoria, String imagenUrl) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.imagenUrl = imagenUrl;
    }

    // Getters y Setters (Para que Thymeleaf pueda leer los datos)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
}