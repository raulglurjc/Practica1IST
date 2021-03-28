package urjc.ist.streaming;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Peliculas> peliculas;
	private List<Serie> series;


	public Catalogo() {
		this.peliculas = new ArrayList<Peliculas>();
		this.series = new ArrayList<Serie>();
	}
	public Catalogo(List<Peliculas> peliculas, List<Serie> series) {
		
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
	public void addPelicula(Peliculas pelicula) 
	{
		this.peliculas.add(pelicula);
	}
	public List<Serie> getSeries() 
	{
		return series;
	}
	public void setSeries(List<Serie> series) 
	{
		this.series = series;
	}
	public void addSerie(Serie serie) 
	{
		this.series.add(serie);
	}
	public List<Peliculas> getUserPeliculas(Usuario usuario) 
	{
		List<Peliculas> lista = new ArrayList<Peliculas>();
		if(usuario.isInfantil())
		{
			for(int i = 0; i<peliculas.size(); i++)
			{
				if(peliculas.get(i).isinfantil())
					lista.add(peliculas.get(i));
			}
		}
		else
		{
			for(int i = 0; i<peliculas.size(); i++)		
				lista.add(peliculas.get(i));		
		}
		
		return lista;
	}
	public List<Serie> getUserSeries(Usuario usuario) 
	{
		List<Serie> lista = new ArrayList<Serie>();
		for(int i = 0; i<series.size(); i++)
		{
			if(series.get(i).isInfantil())
				lista.add(series.get(i));
		}
		return lista;
	} 
}