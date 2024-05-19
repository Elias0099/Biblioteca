package pe.edu.proyect.gestion.biblioteca.upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
