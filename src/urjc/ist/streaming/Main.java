package urjc.ist.streaming;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Main {
	public Catalogo catalogo = new Catalogo();
	public static void main(String[] args) {
		LocalDate fecha_nacimiento;
		LocalDate fecha_estreno;
		List<String> premios;
		List<String> productoras;
		List<String> etiquetas;
		List<Director> directores;
		List<Actor> actores;
		 
		Catalogo catalogo = new Catalogo();
		
		 fecha_nacimiento=LocalDate.of(1968, Month.SEPTEMBER, 25);
		 premios = Arrays.asList("Goya a mejor actor", "Actir revelacion");
		 Actor actor1=new Actor("Will","Smith","",fecha_nacimiento, 39,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1983, Month.APRIL, 15);
		 premios = Arrays.asList("Goya a mejor actriz");
		 Actor actor2=new Actor("Alice","Braga","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1971, Month.MARCH, 26);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versi�n corta");
		 Director director1 = new Director("Francis","Lawrence","",fecha_nacimiento, 41,true,premios,null);
		 
		
		 
		 fecha_estreno=LocalDate.of(2009, Month.DECEMBER, 9);
		productoras = Arrays.asList("Warner", "Pixar");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor1,actor2);
		etiquetas= Arrays.asList("Etiqueta 1","Etiqueta 2","Etiqueta 3");
		Peliculas pelicula1= new Peliculas(false,"Soy Leyenda","Una descripcion",false,fecha_estreno,"Espa�ol",101,productoras,directores,actores,8,etiquetas);
		
		catalogo.addPelicula(pelicula1);
		
		
		
		
		fecha_nacimiento=LocalDate.of(1990, Month.AUGUST, 15);
		 premios = Arrays.asList("Actir revelacion");
		 Actor actor3=new Actor("Jennifer","Lawrence","",fecha_nacimiento, 26,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1992, Month.OCTOBER, 12);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor4=new Actor("Josh","Hutcherson","",fecha_nacimiento, 12,true,premios,null);

		 fecha_estreno=LocalDate.of(2014, Month.NOVEMBER, 20);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor3,actor4);
		etiquetas= Arrays.asList("Etiqueta 4","Etiqueta 5");
		Peliculas pelicula2= new Peliculas(false,"Los Juegos del Hambre Parte 1","Una descripcion",false,fecha_estreno,"Espa�ol",101,productoras,directores,actores,7,etiquetas);
			
		catalogo.addPelicula(pelicula2);
		
		
		
		
		System.out.println("* Catalogo:");
		System.out.println("");
		
		List<Peliculas> peliculasCatalogo = catalogo.getPeliculas();
		for(int i=0; i<peliculasCatalogo.size(); i++)
		{
			String titulo = peliculasCatalogo.get(i).getTitulo();
			System.out.println("\t- Pelicula "+peliculasCatalogo.get(i).getId()+":");
			System.out.println("\t\tTitulo: "+titulo);
		}
		
		fecha_nacimiento = LocalDate.of(1995, Month.DECEMBER, 24);
		Usuario user1= new Usuario("Raúl", "Gil López", fecha_nacimiento, "53842198a", "normal", false);
		
		user1.getLista().addPelicula(pelicula1);
		user1.getLista().addLast_Rep_Pelicula(pelicula1, 50);
		System.out.println("Usuario 1:");
		System.out.println("\t - Nombre: "+user1.getNombre() + " "+user1.getApellidos());
		System.out.println("\t - Fecha de nacimiento: "+user1.getFecha_nacimiento());
		System.out.println("\t - ID: "+user1.getIdentificacion());
		System.out.println("\t - Tipo de contrato: "+user1.getTipo_contrato());
		System.out.println("\n");
		System.out.println("\t - Lista de reproduccion:");
		
		System.out.println("\t\t* Peliculas *");
		if(user1.getLista().getPeliculas().size()==0)
			System.out.println("\t\t\t No se ha añadido ninguna pelicula todavia.");
		else 
		{
			for(int j = 0; j<user1.getLista().getPeliculas().size(); j++)
			{
				int last_rep = user1.getLista().getPeliculas().get(j).getLast_rep();
				String last_report="";
				if(last_rep == -1)
					last_report = "No se ha reproducido todavía";
				else
					last_report = "Minuto "+String.valueOf(last_rep);
				System.out.println("\t\t\t"+(j+1)+"- "+user1.getLista().getPeliculas().get(j).getTitulo()+"\t - "+last_report);
			}
		}
		System.out.println("\n\t\t* Series *");
		if(user1.getLista().getSeries().size()==0)
			System.out.println("\t\t\t No se ha añadido ninguna serie todavia.");
		else
		{
			
		}
				
	}

	
	
	
	
	
}
