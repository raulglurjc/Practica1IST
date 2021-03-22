package urjc.ist.streaming;

import java.time.LocalDate;
import java.util.List;

public class Temporada {
	private List <Capitulo> capitulos;
	private String titulo;
	private String descripcion;
	private LocalDate fecha_estreno;
	private String lenguaje;
	private int duracion; // expresado en minutos
	private List<Actor> reparto;  // List<Actor> reparto;
	public Temporada(List<Capitulo> capitulos, String titulo, String descripcion, String lenguaje, List<Actor> reparto) {
		this.capitulos = capitulos;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_estreno = capitulos.get(0).getFecha_estreno();
		this.lenguaje = lenguaje;
		
		
		int duracion=0;
		for(int i=0; i<capitulos.size(); i++)
		{
			duracion = duracion + capitulos.get(i).getDuracion();
		}
		this.duracion = duracion;
		
		
		for(int i=0;i<capitulos.size();i++) 
			this.reparto.addAll(this.capitulos.get(i).getReparto());
		
	}
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
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
	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> reparto) {
		this.reparto = reparto;
	}
	
}
