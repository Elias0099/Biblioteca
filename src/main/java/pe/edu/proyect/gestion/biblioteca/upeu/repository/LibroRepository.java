package pe.edu.proyect.gestion.biblioteca.upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
