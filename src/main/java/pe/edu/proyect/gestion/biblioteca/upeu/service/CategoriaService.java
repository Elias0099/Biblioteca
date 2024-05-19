package pe.edu.proyect.gestion.biblioteca.upeu.service;

import java.util.List;
import pe.edu.proyect.gestion.biblioteca.upeu.entity.Categoria;

public interface CategoriaService {

    public List<Categoria> listarTodasLasCategorias();

    public Categoria guardarCategoria(Categoria categoria);

    public Categoria obtenerCategoriaPorId(Long id);

    public Categoria actualizarCategoria(Categoria categoria);

    public void eliminarCategoria(Long id);
}
