package urjc.ist.streaming;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
private List<Peliculas> peliculas;
private List<Series> series;
public Catalogo(List<Peliculas> peliculas, List<Series> series) {
	
	this.peliculas = peliculas;
	this.series = series;
}
public Catalogo() {
	this.peliculas = new ArrayList<Peliculas>();
	this.series = new ArrayList<Series>();
}
public List<Peliculas> getPeliculas() {
	return peliculas;
}
public void setPeliculas(List<Peliculas> peliculas) {
	this.peliculas = peliculas;
}
public void addPelicula(Peliculas pelicula) {
	this.peliculas.add(pelicula);
}
public List<Series> getSeries() {
	return series;
}
public void setSeries(List<Series> series) {
	this.series = series;
}
public void addSerie(Series serie) {
	this.series.add(serie);
}
}