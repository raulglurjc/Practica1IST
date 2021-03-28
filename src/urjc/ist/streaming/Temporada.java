package urjc.ist.streaming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private List<Capitulo> capitulos;
	private String titulo;
	private String descripcion;
	private LocalDate fecha_estreno;
	private String lenguaje;
	private int duracion; 
	private List<Actor> reparto;
	
	
	
	public Temporada()
	{
		this.capitulos = new ArrayList<Capitulo>();
		this.titulo = "";
		this.descripcion = "";
		this.fecha_estreno = null;
		this.lenguaje = "";
		this.duracion = -1;
		this.reparto = new ArrayList<Actor>();
	}
	
	public Temporada(List<Capitulo> capitulos, String titulo, String descripcion, String lenguaje, List<Actor> reparto) {
		this.capitulos = capitulos;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_estreno = capitulos.get(0).getFecha_estreno();
		this.lenguaje = lenguaje;
		
		
		int duracion=0;
		for(int i=0; i<capitulos.size(); i++)
		{
			this.duracion = duracion + capitulos.get(i).getDuracion();
		}
		
		List<Integer> frecuencia = new ArrayList<Integer>();
		List<Actor> nombre = new ArrayList<Actor>();
		
		for(int i=0; i<capitulos.size(); i++)
		{
			for(int j = 0; j<capitulos.get(i).getReparto().size(); j++)
			{
				if(!nombre.contains(capitulos.get(i).getReparto().get(j)))
				{
					nombre.add(capitulos.get(i).getReparto().get(j));
					frecuencia.add(1);
				}
				else
				{
					int index = nombre.indexOf(capitulos.get(i).getReparto().get(j));
					int last = frecuencia.get(index);
					frecuencia.set(index, last+1);
				}
			}
		}
		
			List<Integer> max_frecuencia = new ArrayList<Integer>();
			List<Actor> max_nombre = new ArrayList<Actor>();
			
			for(int i = 0; i<5; i++)
			{
				int max_freq = frecuencia.get(0);
				for(int j = 1; j<nombre.size(); j++)
				{
					if(max_freq < frecuencia.get(j))
						max_freq = frecuencia.get(j);
				}
				
				max_frecuencia.add(frecuencia.get(frecuencia.indexOf(max_freq)));
				max_nombre.add(nombre.get(frecuencia.indexOf(max_freq)));
				nombre.remove(nombre.get(frecuencia.indexOf(max_freq)));
				frecuencia.remove(frecuencia.indexOf(max_freq));
				
			}
		
		this.reparto = max_nombre;
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
