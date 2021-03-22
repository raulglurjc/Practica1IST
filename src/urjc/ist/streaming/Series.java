package urjc.ist.streaming;

import java.time.LocalDate;
import java.util.List;

public class Series {
	private List<Temporada> temporadas;
	private String titulo;
	private String descripcion;
	private boolean infantil;
	private LocalDate fecha_estreno_primero;
	private LocalDate fecha_estreno_ultimo;
	private String lenguaje;
	private List<Actor> reparto;
	public Series(List<Temporada> temporadas, String titulo, String descripcion, boolean infantil, LocalDate fecha_estreno_primero, LocalDate fecha_estreno_ultimo, String lenguaje, List<Actor> reparto) {
		
		this.temporadas = temporadas;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.infantil = infantil;
		
		this.fecha_estreno_primero = temporadas.get(0).getCapitulos().get(0).getFecha_estreno();
		this.fecha_estreno_ultimo = temporadas.get(-1).getCapitulos().get(-1).getFecha_estreno();
		
		this.lenguaje = lenguaje;
		this.reparto = reparto;
		for(int i=0;i<temporadas.size();i++) {			
				for(int j=0;j<temporadas.get(i).getCapitulos().size();j++) {
					this.reparto.addAll(temporadas.get(i).getCapitulos().get(j).getReparto());
				}
			
		}
	}
	public List<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
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
	public boolean isInfantil() {
		return infantil;
	}
	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	public LocalDate getFecha_estreno_primero() {
		return fecha_estreno_primero;
	}
	public void setFecha_estreno_primero(LocalDate fecha_estreno_primero) {
		this.fecha_estreno_primero = fecha_estreno_primero;
	}
	public LocalDate getFecha_estreno_ultimo() {
		return fecha_estreno_ultimo;
	}
	public void setFecha_estreno_ultimo(LocalDate fecha_estreno_ultimo) {
		this.fecha_estreno_ultimo = fecha_estreno_ultimo;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> reparto) {
		this.reparto = reparto;
	}
	
}

