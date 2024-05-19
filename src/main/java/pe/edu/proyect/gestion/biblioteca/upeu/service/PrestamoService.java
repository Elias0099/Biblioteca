package pe.edu.proyect.gestion.biblioteca.upeu.service;

import java.util.List;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Prestamo;

public interface PrestamoService {

    List<Prestamo> listarTodosLosPrestamos();

    Prestamo guardarPrestamo(Prestamo prestamo);

    Prestamo obtenerPrestamoPorId(Long id);

    Prestamo actualizarPrestamo(Prestamo prestamo);

    void eliminarPrestamo(Long id);
}
