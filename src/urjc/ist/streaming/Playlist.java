package urjc.ist.streaming;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Playlist {
	private List<Peliculas> peliculas;
	private List<Series> series;
	public Playlist(List<Peliculas> peliculas, List<Series> series, List<Integer> estado_peliculas, List<LocalDate> estado_series) {
		this.peliculas = peliculas;
		this.series = series;
		
	}
	public Playlist() {
		this.peliculas = new ArrayList<Peliculas>();
		this.series = new ArrayList<Series>();
		
	}
	
	public List<Peliculas> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(List<Peliculas> peliculas) {
		this.peliculas = peliculas;
	}
	public List<Series> getSeries() {
		return series;
	}
	public void setSeries(List<Series> series) {
		this.series = series;
	}
	public void addPelicula(Peliculas pelicula) {
		Peliculas pelicula_aux= new Peliculas(pelicula);
		
		this.peliculas.add(pelicula_aux);
	}
	public void addSerie(Series serie) {
		this.series.add(serie);
	}
	public void addLast_Rep_Pelicula(Peliculas pelicula, int minuto)
	{
		for(int i = 0; i<this.peliculas.size(); i++)
		{
			Peliculas aux = this.peliculas.get(i);
			if(pelicula.getTitulo() == aux.getTitulo())
			{
				System.out.println();
				this.peliculas.get(i).setLast_rep(minuto);
				return;
			}
		}
		throw new RuntimeException("No se ha encontrado la pelicula para guardar el estado.");
	}
	
	
}
