package pe.edu.proyect.gestion.biblioteca.upeu.service;

import java.util.List;

import pe.edu.proyect.gestion.biblioteca.upeu.entity.Usuario;

public interface UsuarioService {

public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario guardarUsuario(Usuario Usuario);
	
	public Usuario obtenerUsuarioPorId(Long id);
	
	public Usuario actualizarUsuario(Usuario Usuario);
	
	public void eliminarUsuario(Long id);
	
}
