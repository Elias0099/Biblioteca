package pe.edu.proyect.gestion.biblioteca.upeu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "estado", nullable = false)
    private int estado;

    @OneToMany(mappedBy = "categoria")
    private List<Libro> libros;

    public Categoria() {
    }
    
    public Categoria(String nombre, int estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public Categoria(String nombre, int estado, List<Libro> libros) {
		this.nombre = nombre;
		this.estado = estado;
		this.libros = libros;
	}

	public Categoria(Long id, String nombre, int estado, List<Libro> libros) {
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.libros = libros;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
