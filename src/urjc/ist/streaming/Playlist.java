package urjc.ist.streaming;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Playlist 
{
	private List<Peliculas> peliculas;
	private List<Serie> series;
	
	public Playlist() 
	{
		this.peliculas = new ArrayList<Peliculas>();
		this.series = new ArrayList<Serie>();
		
	}
	
	public Playlist(List<Peliculas> peliculas, List<Serie> series, List<Integer> estado_peliculas, List<LocalDate> estado_series) 
	{
		this.peliculas = peliculas;
		this.series = series;
		
	}
	
	
	public List<Peliculas> getPeliculas() 
	{
		return peliculas;
	}
	public void setPeliculas(List<Peliculas> peliculas) 
	{
		this.peliculas = peliculas;
	}
	public List<Serie> getSeries() 
	{
		return series;
	}
	public void setSeries(List<Serie> series) 
	{
		this.series = series;
	}
	public void addPelicula(Peliculas pelicula) 
	{
		Peliculas pelicula_aux= new Peliculas(pelicula);
		
		this.peliculas.add(pelicula_aux);
	}
	public void removePelicula(Peliculas pelicula)
	{
		for(int i = 0; i<this.peliculas.size(); i++)
		{
			
			Peliculas aux = this.peliculas.get(i);
			if(pelicula.getId() == aux.getId())
			{
				this.peliculas.remove(aux);
				return;
			}
		}
		throw new RuntimeException("No se ha encontrado la pelicula para borrarla.");
		
	}
	public void addLast_Rep_Pelicula(Peliculas pelicula, int minuto)
	{
		for(int i = 0; i<this.peliculas.size(); i++)
		{
			Peliculas aux = this.peliculas.get(i);
			if(pelicula.getId() == aux.getId())
			{
				System.out.println();
				this.peliculas.get(i).setLast_rep(minuto);
				return;
			}
		}
		throw new RuntimeException("No se ha encontrado la pelicula para guardar el estado.");
	}
	public void addSerie(Serie serie) 
	{
		this.series.add(serie);
	}
	public void removeSerie(Serie serie)
	{
		for(int i = 0; i<this.series.size(); i++)
		{
			
			Serie aux = this.series.get(i);
			if(serie.getTitulo() == aux.getTitulo())
			{
				this.series.remove(aux);
				return;
			}
		}
		throw new RuntimeException("No se ha encontrado la serie para borrarla.");
		
	}
	
	
	
}
