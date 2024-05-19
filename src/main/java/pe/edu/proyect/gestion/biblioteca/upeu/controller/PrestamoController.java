package pe.edu.proyect.gestion.biblioteca.upeu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Prestamo;
import pe.edu.proyect.gestion.biblioteca.upeu.service.PrestamoService;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
@CrossOrigin("*")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamoService.listarTodosLosPrestamos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> obtenerPrestamo(@PathVariable(name = "id") Long id) {
        Prestamo prestamo = prestamoService.obtenerPrestamoPorId(id);
        if (prestamo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(prestamo);
    }

    @PostMapping
    public ResponseEntity<Prestamo> guardarPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo prestamoGuardado = prestamoService.guardarPrestamo(prestamo);
        return ResponseEntity.ok(prestamoGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizarPrestamo(@PathVariable(name = "id") Long id, @RequestBody Prestamo prestamo) {
        Prestamo prestamoExistente = prestamoService.obtenerPrestamoPorId(id);
        if (prestamoExistente == null) {
            return ResponseEntity.notFound().build();
        }
        // Actualiza los campos necesarios del préstamo
        prestamoExistente.setFechaPrestamo(prestamo.getFechaPrestamo());
        prestamoExistente.setFechaDevolucion(prestamo.getFechaDevolucion());

        Prestamo prestamoActualizado = prestamoService.actualizarPrestamo(prestamoExistente);
        return ResponseEntity.ok(prestamoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrestamo(@PathVariable(name = "id") Long id) {
        prestamoService.eliminarPrestamo(id);
        return ResponseEntity.noContent().build();
    }
}
