package pe.edu.proyect.gestion.biblioteca.upeu.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Prestamo;
import pe.edu.proyect.gestion.biblioteca.upeu.repository.PrestamoRepository;
import pe.edu.proyect.gestion.biblioteca.upeu.service.PrestamoService;
import java.util.List;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoServiceImpl(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    @Override
    public List<Prestamo> listarTodosLosPrestamos() {
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo obtenerPrestamoPorId(Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @Override
    public Prestamo actualizarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void eliminarPrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }
}
