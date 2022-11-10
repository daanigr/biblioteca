package com.danigr.Biblioteca;

public class Prestamo {

    private String id;
    private String fechaPrestamo;
    private String fechaDevolucion;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
