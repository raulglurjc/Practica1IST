package urjc.ist.streaming;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
		List<Usuario> usuarios = new ArrayList<Usuario>();		 
		Catalogo catalogo = new Catalogo();
		//////////////////////////////////////ACTORES//////////////////////////////////////////////
		 fecha_nacimiento=LocalDate.of(1968, Month.SEPTEMBER, 25);
		 premios = Arrays.asList("Goya a mejor actor", "Actir revelacion");
		 Actor actor1=new Actor("Will","Smith","",fecha_nacimiento, 39,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1983, Month.APRIL, 15);
		 premios = Arrays.asList("Goya a mejor actriz");
		 Actor actor2=new Actor("Alice","Braga","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1990, Month.AUGUST, 15);
		 premios = Arrays.asList("Actir revelacion");
		 Actor actor3=new Actor("Jennifer","Lawrence","",fecha_nacimiento, 26,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1992, Month.OCTOBER, 12);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor4=new Actor("Josh","Hutcherson","",fecha_nacimiento, 12,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1961, Month.AUGUST, 16);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor5=new Actor("Steve","Carell","",fecha_nacimiento, 18,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1980, Month.JANUARY, 18);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor6=new Actor("Jason","Segel","",fecha_nacimiento, 5,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1993, Month.MAY, 14);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor7=new Actor("Miranda","Cosgrove","",fecha_nacimiento, 10,true,premios,null);
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //////////////////////////////////////DIRECTORES//////////////////////////////////////////////

		 fecha_nacimiento=LocalDate.of(1971, Month.MARCH, 26);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versi�n corta");
		 Director director1 = new Director("Francis","Lawrence","",fecha_nacimiento, 41,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1967, Month.NOVEMBER, 1);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versi�n corta");
		 Director director2 = new Director("Pierre","Padang Coffin","Louis",fecha_nacimiento, 21,true,premios,null);
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////PELICULAS////////////////////////////////////////// 
		fecha_estreno=LocalDate.of(2009, Month.DECEMBER, 9);
		productoras = Arrays.asList("Warner", "Pixar");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor1,actor2);
		etiquetas= Arrays.asList("Etiqueta 1","Etiqueta 2","Etiqueta 3");
		Peliculas pelicula1= new Peliculas(false,"Soy Leyenda","Descripcion de Soy Leyenda",false,fecha_estreno,"Espa�ol",101,productoras,directores,actores,8,etiquetas);
		
		
		fecha_estreno=LocalDate.of(2014, Month.NOVEMBER, 20);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor3,actor4);
		etiquetas= Arrays.asList("Etiqueta 4","Etiqueta 5");
		Peliculas pelicula2= new Peliculas(false,"Los Juegos del Hambre Parte 1","Descripcion de los Juegos del Hambre Parte 1",false,fecha_estreno,"Espa�ol",101,productoras,directores,actores,7,etiquetas);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////CATALOGO////////////////////////////////////////// 
		
		catalogo.addPelicula(pelicula1);
		catalogo.addPelicula(pelicula2);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////USUARIOS////////////////////////////////////////// 
		fecha_nacimiento = LocalDate.of(1995, Month.DECEMBER, 24);
		Usuario user1= new Usuario("Raúl", "Gil López", fecha_nacimiento, "53842198a", "normal");
		usuarios.add(user1);
		
		fecha_nacimiento = LocalDate.of(2013, Month.JUNE, 13);
		Usuario user2= new Usuario("Pablo", "Marin", fecha_nacimiento, "76543267Z", "premium");
		usuarios.add(user2);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		
		usuarios.get(usuarios.indexOf(user1)).getLista().addPelicula(pelicula1);
		usuarios.get(usuarios.indexOf(user1)).getLista().addLast_Rep_Pelicula(pelicula1, 50);
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("************************ Catalogo ************************");
		System.out.println("");
		
		for(int i=0; i<catalogo.getPeliculas().size(); i++)
		{
			String titulo = catalogo.getPeliculas().get(i).getTitulo();
			System.out.println("\t* Pelicula "+catalogo.getPeliculas().get(i).getId()+":");
			System.out.println("\t\t- Titulo: "+catalogo.getPeliculas().get(i).getTitulo());
			System.out.println("\t\t- Descripcion: "+catalogo.getPeliculas().get(i).getDescripcion());
			String aux_infantil;
			if(catalogo.getPeliculas().get(i).isinfantil())
				aux_infantil = "SI";
			else
				aux_infantil = "NO";
			System.out.println("\t\t- Contenido Infantil: "+aux_infantil);
			System.out.println("\t\t- Lenguaje: "+catalogo.getPeliculas().get(i).getLenguaje());
			System.out.println("\t\t- Fecha de Estreno: "+catalogo.getPeliculas().get(i).getFecha_estreno());
			System.out.println("\n");
		}
		System.out.println("**********************************************************\n");
		System.out.println("************************ Usuarios ************************");
		for(int i = 0; i<usuarios.size(); i++)
		{
			System.out.println("\n\t* Usuario "+(i+1)+":");
			System.out.println("\t\t- Nombre: "+usuarios.get(i).getNombre() + " "+usuarios.get(i).getApellidos());
			System.out.println("\t\t- Fecha de nacimiento: "+usuarios.get(i).getFecha_nacimiento());
			System.out.println("\t\t- ID: "+usuarios.get(i).getIdentificacion());
			System.out.println("\t\t- Tipo de contrato: "+usuarios.get(i).getTipo_contrato());
			System.out.println("\n\t\t- Lista de reproduccion:");
			System.out.println("\t\t\t* Peliculas:");
			if(usuarios.get(i).getLista().getPeliculas().size()==0)
				System.out.println("\t\t\t\t No se ha añadido ninguna pelicula todavia.");
			else 
			{
				for(int j = 0; j<usuarios.get(i).getLista().getPeliculas().size(); j++)
				{
					int last_rep = usuarios.get(i).getLista().getPeliculas().get(j).getLast_rep();
					String last_report="";
					if(last_rep == -1)
						last_report = "No se ha reproducido todavía";
					else
						last_report = "Minuto "+String.valueOf(last_rep);
					System.out.println("\t\t\t\t"+(j+1)+"- "+usuarios.get(i).getLista().getPeliculas().get(j).getTitulo()+"\t - "+last_report);
				}
			}
			System.out.println("\n\t\t\t* Series:");
			if(usuarios.get(i).getLista().getSeries().size()==0)
				System.out.println("\t\t\t\t No se ha añadido ninguna serie todavia.");
			else 
			{
			
			}
			String arg;
			if(usuarios.get(i).isInfantil())
				arg = "Infantil";
			else
				arg = "Todo";
			System.out.println("\n\t\t- Catalogo disponible para "+usuarios.get(i).getNombre()+String.format(" (%s) -", arg));
			
		}
		
		
		
		System.out.println("\n**********************************************************\n");
		System.out.println();
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
