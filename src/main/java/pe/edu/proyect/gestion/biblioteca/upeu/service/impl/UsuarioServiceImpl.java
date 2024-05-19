package pe.edu.proyect.gestion.biblioteca.upeu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.proyect.gestion.biblioteca.upeu.entity.Usuario;
import pe.edu.proyect.gestion.biblioteca.upeu.repository.UsuarioRepository;
import pe.edu.proyect.gestion.biblioteca.upeu.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario Usuario) {
		return repository.save(Usuario);
	}

	@Override
	public Usuario obtenerUsuarioPorId(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario Usuario) {
		return repository.save(Usuario);
	}

	@Override
	public void eliminarUsuario(Long id) {
		repository.deleteById(id);

	}

}
