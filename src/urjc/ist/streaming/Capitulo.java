package urjc.ist.streaming;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Capitulo {
	private static int count=1;
	private int id;
	private String titulo;
	private String descripcion;
	private LocalDate fecha_estreno;
	private String lenguaje;
	private int duracion; // expresado en minutos
	private List<Director> directores;
	private List<Actor> reparto;
	
	
	
	public Capitulo()
	{
		this.id = Capitulo.count++;
		this.titulo = "";
		this.descripcion = "";
		this.fecha_estreno = null;
		this.lenguaje = "";
		this.duracion = -1;
		this.directores = new ArrayList<Director>();
		this.reparto = new ArrayList<Actor>();
	}
	
	public Capitulo(String titulo, String descripcion, LocalDate fecha_estreno, String lenguaje, int duracion, List<Director> directores, List<Actor> reparto) 
	{		
		this.id = Capitulo.count++;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_estreno = fecha_estreno;
		this.lenguaje = lenguaje;
		this.duracion = duracion;
		if(directores.size()>3) {
			throw new RuntimeException("Numero máximo de elementos alcanzado en la lista Directores");
		}else {
			this.directores=directores;
		}
		if(reparto.size()>5) {
			throw new RuntimeException("Numero máximo de elementos alcanzado en la lista Productoras");
		}else {
			this.reparto=reparto;
		}
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Capitulo.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha_estreno() {
		return fecha_estreno;
	}
	public void setFecha_estreno(LocalDate fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public List<Director> getDirectores() {
		return directores;
	}
	public void setDirectores(List<Director> directores) {
		if(directores.size()>3) {
			throw new RuntimeException("Numero máximo de elementos alcanzado en la lista Directores");
		}else {
			this.directores=directores;
		}
	}
	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> reparto) {
		if(reparto.size()>5) {
			throw new RuntimeException("Numero máximo de elementos alcanzado en la lista Productoras");
		}else {
			this.reparto=reparto;
		}
	}
	
	
}
