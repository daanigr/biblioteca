package com.danigr.Biblioteca;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Autor a = new Autor();
        a.setNombre("");
        a.setApellidos("");
        a.setFechaNacimiento("");
        a.setLocalidadNacimiento("");

        System.out.println(a.getNombre());
        System.out.println(a.getApellidos());
        System.out.println(a.getFechaNacimiento());
        System.out.println(a.getLocalidadNacimiento());


        Genero aa = new Genero();

        aa.setId(1);
        aa.setNombre("");
        aa.setDescripcion("");

        System.out.println(aa.getId());
        System.out.println(aa.getNombre());
        System.out.println(aa.getDescripcion());


        Libro aaa = new Libro();

        aaa.setTitulo("");
        aaa.setIsbn(1);
        aaa.setAutor("");
        aaa.setGenero("");
        aaa.setFechaPublicacion("");

        System.out.println(aaa.getTitulo());
        System.out.println(aaa.getIsbn());
        System.out.println(aaa.getAutor());
        System.out.println(aaa.getGenero());
        System.out.println(aaa.getFechaPublicacion());


        Prestamo aaaa = new Prestamo();

        aaaa.setId(1);
        aaaa.setFechaPrestamo("");
        aaaa.setFechaDevolucion("");

        System.out.println(aaaa.setId());
        System.out.println(aaaa.getFechaPrestamo());
        System.out.println(aaaa.getFechaDevolucion());


        Usuario aaaaa = new Usuario();

        aaaaa.setNombre("");
        aaaaa.setApellidos("");
        aaaaa.setDni("");
        aaaaa.setTelefono("");
        aaaaa.setDireccion("");
        aaaaa.setPoblacion("");

        System.out.println(aaaaa.getNombre());
        System.out.println(aaaaa.getApellidos());
        System.out.println(aaaaa.getDni());
        System.out.println(aaaaa.getTelefono());
        System.out.println(aaaaa.getDireccion());
        System.out.println(aaaaa.getPoblacion());


    }
}