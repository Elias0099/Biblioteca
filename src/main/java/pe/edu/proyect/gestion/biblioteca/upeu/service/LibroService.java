package pe.edu.proyect.gestion.biblioteca.upeu.service;

import java.util.List;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Libro;

public interface LibroService {

    public List<Libro> listarTodosLosLibros();

    public Libro guardarLibro(Libro libro);

    public Libro obtenerLibroPorId(Long id);

    public Libro actualizarLibro(Libro libro);

    public void eliminarLibro(Long id);
}
