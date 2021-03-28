package urjc.ist.streaming;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Peliculas {
	
	private boolean emision;
	private static int count=1;
	private int id;
	private String titulo;
	private String descripcion;
	private boolean infantil;
	private LocalDate fecha_estreno;
	private String lenguaje;
	private int duracion; // expresado en minutos
	private List<String> productoras;
	private List<Director> directores;
	private List<Actor> reparto;
	private int puntuacion;
	private int last_rep;
	private List<String> etiquetas;
	
	public Peliculas()
	{
		this.emision = false;
		this.id = Peliculas.count++;
		this.titulo = "";
		this.descripcion=	"";
		this.infantil= false;
		this.fecha_estreno= null;
		this.lenguaje = null;
		this.duracion = -1; 
		this.last_rep = -1;
		this.productoras = new ArrayList<String>(); 
		this.directores = new ArrayList<Director>();
		this.reparto = new ArrayList<Actor>();
		this.puntuacion = -1;
		this.etiquetas = new ArrayList<String>();
	}
		
	public Peliculas(boolean emision, String titulo, String descripcion, boolean infantil, LocalDate fecha_estreno,	String lenguaje,int duracion, List<String> productoras, List<Director> directores, List<Actor> reparto, int puntuacion, List<String> etiquetas) {
		 this.emision = emision;
		 this.id = Peliculas.count++;
		 this.titulo = titulo;
		 this.descripcion=	descripcion;
		 this.infantil= infantil;
		 this.fecha_estreno= fecha_estreno;
		 this.lenguaje = lenguaje;
		 this.duracion = duracion; 
		 this.last_rep = -1;
		 
		 
		 if(productoras.size()<=2) 
		 {
			this.productoras=productoras;
		 }
		 else 
	 	{
			throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Productoras");
		}
		if(directores.size()>3) {
			throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Directores");
		}else {
			this.directores=directores;
		}
		if(reparto.size()>5) {
			throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Productoras");
		}else {
			this.reparto=reparto;
		}
		 if(puntuacion<0 || puntuacion>10) 
		 {
			 throw new RuntimeException("Parametro puntuacion invalido (0<puntuacion<10)");
		 }
		 else 
		 {
			 this.puntuacion = puntuacion;
		 }
		 if(etiquetas.size()<=4) {
				this.etiquetas=etiquetas;
			}else {
				throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Etiqueras");
		 }
		 
		 
	}
	public Peliculas(Peliculas pelicula)
	{
		 this.emision = pelicula.emision;
		 this.id = pelicula.id;
		 this.titulo = pelicula.titulo;
		 this.descripcion=	pelicula.descripcion;
		 this.infantil= pelicula.infantil;
		 this.fecha_estreno= pelicula.fecha_estreno;
		 this.lenguaje = pelicula.lenguaje;
		 this.duracion = pelicula.duracion; 
		 this.last_rep = pelicula.last_rep;
		 this.productoras = pelicula.productoras;
		 this.directores = pelicula.directores;
		 this.reparto = pelicula.reparto;
		 this.puntuacion = pelicula.puntuacion;
		 this.etiquetas = pelicula.etiquetas;
	}
	
	public int getLast_rep() {
		return last_rep;
	}

	public void setLast_rep(int last_rep) {
		this.last_rep = last_rep;
	}

	public List<String> getProductoras() {
		return productoras;
	}

	public void setProductoras(List<String> productoras) {
		 if(productoras.size()<=2) {
				this.productoras=productoras;
			}else {
				throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Productoras");
			}
	}

	public List<Director> getDirectores() {
		return directores;
	}

	public void setDirectores(List<Director> directores) {
		if(directores.size()>3) {
			throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Directores");
		}else {
			this.directores=directores;
		}
	}

	public List<Actor> getReparto() {
		return reparto;
	}

	public void setReparto(List<Actor> reparto) {
		if(reparto.size()>5) {
			throw new RuntimeException("Numero m�ximo de elementos alcanzado en la lista Productoras");
		}else {
			this.reparto=reparto;
		}
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEmision() {
		return emision;
	}
	public void setEmision(boolean emision) {
		this.emision = emision;
	}
	public int getId() {
		return id;
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
	public boolean isinfantil() {
		return infantil;
	}
	public void setinfantil(boolean infantil) {
		this.infantil = infantil;
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

	public int getpuntuacion() {
		return puntuacion;
	}
	public void setpuntuacion(int puntuacion) {
		if(puntuacion<0 || puntuacion>10) 
		 {
			 throw new RuntimeException("Parametro puntuacion invalido (0<puntuacion<10)");
			 }
			 else 
			 {
				 this.puntuacion = puntuacion;
			 }
		}
		public List<String> getEtiquetas() {
			return etiquetas;
		}
		public void setEtiquetas(List<String> etiquetas) {
			this.etiquetas = etiquetas;
		}
		

}
