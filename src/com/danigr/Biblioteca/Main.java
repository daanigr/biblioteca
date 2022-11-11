package com.danigr.Biblioteca;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Autor autor = new Autor();
        autor.setNombre("");
        autor.setApellidos("");
        autor.setFechaNacimiento("");
        autor.setLocalidadNacimiento("");

        System.out.println(autor.getNombre());
        System.out.println(autor.getApellidos());
        System.out.println(autor.getFechaNacimiento());
        System.out.println(autor.getLocalidadNacimiento());


        Genero genero = new Genero();

        genero.setId(1);
        genero.setNombre("");
        genero.setDescripcion("");

        System.out.println(genero.getId());
        System.out.println(genero.getNombre());
        System.out.println(genero.getDescripcion());


        Libro libro = new Libro();

        libro.setTitulo("");
        libro.setIsbn(1);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setFechaPublicacion("");

        System.out.println(libro.getTitulo());
        System.out.println(libro.getIsbn());
        System.out.println(libro.getAutor());
        System.out.println(libro.getGenero());
        System.out.println(libro.getFechaPublicacion());


        Prestamo prestamo = new Prestamo();

        prestamo.setId(1);
        prestamo.setFechaPrestamo("");
        prestamo.setFechaDevolucion("");

        System.out.println(prestamo.getId());
        System.out.println(prestamo.getFechaPrestamo());
        System.out.println(prestamo.getFechaDevolucion());


        Usuario usuario = new Usuario();

        usuario.setNombre("");
        usuario.setApellidos("");
        usuario.setDni("");
        usuario.setTelefono("");
        usuario.setDireccion("");
        usuario.setPoblacion("");

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getApellidos());
        System.out.println(usuario.getDni());
        System.out.println(usuario.getTelefono());
        System.out.println(usuario.getDireccion());
        System.out.println(usuario.getPoblacion());


    }
}