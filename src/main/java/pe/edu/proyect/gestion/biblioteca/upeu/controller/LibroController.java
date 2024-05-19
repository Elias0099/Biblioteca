package pe.edu.proyect.gestion.biblioteca.upeu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Libro;
import pe.edu.proyect.gestion.biblioteca.upeu.service.LibroService;

import java.util.List;

@RestController
@RequestMapping("/libros")
@CrossOrigin("*")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarTodosLosLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibro(@PathVariable("id") Long id) {
        Libro libro = libroService.obtenerLibroPorId(id);
        if (libro == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(libro);
    }

    @PostMapping
    public ResponseEntity<Libro> guardarLibro(@RequestBody Libro libro) {
        Libro libroGuardado = libroService.guardarLibro(libro);
        return ResponseEntity.ok(libroGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizarLibro(@PathVariable("id") Long id, @RequestBody Libro libro) {
        Libro libroExistente = libroService.obtenerLibroPorId(id);
        if (libroExistente == null) {
            return ResponseEntity.notFound().build();
        }
        libroExistente.setTitulo(libro.getTitulo());
        libroExistente.setAutor(libro.getAutor());
        libroExistente.setCategoria(libro.getCategoria()); // Actualiza la categoría

        Libro libroActualizado = libroService.actualizarLibro(libroExistente);
        return ResponseEntity.ok(libroActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable("id") Long id) {
        libroService.eliminarLibro(id);
        return ResponseEntity.noContent().build();
    }
}
