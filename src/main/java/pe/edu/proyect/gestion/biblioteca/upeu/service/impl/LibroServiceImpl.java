package pe.edu.proyect.gestion.biblioteca.upeu.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Libro;
import pe.edu.proyect.gestion.biblioteca.upeu.repository.LibroRepository;
import pe.edu.proyect.gestion.biblioteca.upeu.service.LibroService;
import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    private final LibroRepository libroRepository;

    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public List<Libro> listarTodosLosLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro obtenerLibroPorId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
