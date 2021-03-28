package urjc.ist.streaming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Serie {
	private List<Temporada> temporadas;
	private String titulo;
	private String descripcion;
	private boolean infantil;
	private LocalDate fecha_estreno_primero;
	private LocalDate fecha_estreno_ultimo;
	private String lenguaje;
	private List<Actor> reparto;
	
	

	public Serie()
	{
		this.temporadas = new ArrayList<Temporada>();
		this.titulo = "";
		this.descripcion = "";
		this.infantil = false;		
		this.fecha_estreno_primero = null;
		this.fecha_estreno_ultimo = null;		
		this.lenguaje = "";
		this.reparto = new ArrayList<Actor>();
	}
	
	public Serie(List<Temporada> temporadas, String titulo, String descripcion, boolean infantil, String lenguaje) 
	{
		
		this.temporadas = temporadas;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.infantil = infantil;
		
		this.fecha_estreno_primero = temporadas.get(0).getCapitulos().get(0).getFecha_estreno();
		this.fecha_estreno_ultimo = temporadas.get(temporadas.size() - 1).getCapitulos().get(temporadas.get(temporadas.size() - 1).getCapitulos().size() - 1).getFecha_estreno();
		
		this.lenguaje = lenguaje;
		
		
		
		List<Integer> frecuencia = new ArrayList<Integer>();
		List<Actor> nombre = new ArrayList<Actor>();
		for(int i = 0; i<temporadas.size(); i++)
		{
			for(int j=0; j<temporadas.get(i).getCapitulos().size(); j++)
			{
				for(int k = 0; k<temporadas.get(i).getCapitulos().get(j).getReparto().size(); k++)
				{
					if(!nombre.contains(temporadas.get(i).getCapitulos().get(j).getReparto().get(k)))
					{
						nombre.add(temporadas.get(i).getCapitulos().get(j).getReparto().get(k));
						frecuencia.add(1);
					}
					else
					{
						int index = nombre.indexOf(temporadas.get(i).getCapitulos().get(j).getReparto().get(k));
						int last = frecuencia.get(index);
						frecuencia.set(index, last+1);
					}
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
	public List<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	public void addTemporada(Temporada temporada)
	{
		this.temporadas.add(temporada);
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
	public int frecuenciaActor(Actor actor)
	{
		int frecuencia=0;
		for(int i = 0; i<temporadas.size(); i++)
		{
			for(int j=0; j<temporadas.get(i).getCapitulos().size(); j++)
			{
				for(int k = 0; k<temporadas.get(i).getCapitulos().get(j).getReparto().size(); k++)
				{
					if(actor.getNombre() == temporadas.get(i).getCapitulos().get(j).getReparto().get(k).getNombre() && actor.getApellidos() == temporadas.get(i).getCapitulos().get(j).getReparto().get(k).getApellidos())
					{
						frecuencia=frecuencia+1;
						break;
					}
					
				}
			}
		}
		return frecuencia;
	}
	
	public void actualizarFechas()
	{
		this.fecha_estreno_primero = temporadas.get(0).getCapitulos().get(0).getFecha_estreno();
		this.fecha_estreno_ultimo = temporadas.get(temporadas.size() - 1).getCapitulos().get(temporadas.get(temporadas.size() - 1).getCapitulos().size() - 1).getFecha_estreno();
	}
	
}

