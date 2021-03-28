package urjc.ist.streaming;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		LocalDate fecha_nacimiento;
		LocalDate fecha_muerte;
		LocalDate fecha_estreno;
		List<String> premios;
		List<String> productoras;
		List<String> etiquetas;
		List<Director> directores;
		List<Actor> actores;
		List<Usuario> usuarios = new ArrayList<Usuario>();	
		List<Capitulo> capitulos;	
		List<Temporada> temporadas;	
		
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
		 
		 fecha_nacimiento=LocalDate.of(1978, Month.AUGUST, 24);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor8=new Actor("Beth Jean","Riesgraf","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1986, Month.AUGUST, 27);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor9=new Actor("Jack","Kesy","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1989, Month.JULY, 21);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor10=new Actor("Rory Hugh","Culkin","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1967, Month.NOVEMBER, 1);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor11 = new Actor("Pierre","Padang Coffin","Louis",fecha_nacimiento, 21,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1964, Month.JULY, 26);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor12=new Actor("Sandra","Bullock","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1971, Month.MARCH, 10);
		 fecha_muerte=LocalDate.of(2020, Month.SEPTEMBER, 14);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor13=new Actor("Jon","Hamm","",fecha_nacimiento, 10,true,premios,fecha_muerte);
		 
		 fecha_nacimiento=LocalDate.of(1991, Month.APRIL, 4);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor14=new Actor("Jamie","Lynn Spears","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1994, Month.FEBRUARY, 14);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor15=new Actor("Paul","Butcher","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1989, Month.JULY, 14);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor16=new Actor("Sean","Flynn-Amir","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1989, Month.FEBRUARY, 21);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor17=new Actor("Kristin","Herrera","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1990, Month.JANUARY, 26);
		 premios = Arrays.asList("Actor revelacion");
		 Actor actor18=new Actor("Christopher","Massey","",fecha_nacimiento, 10,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1992, Month.APRIL, 4);
		 premios = Arrays.asList("Actriz revelacion");
		 Actor actor19=new Actor("Alexa","Nikolas","",fecha_nacimiento, 10,true,premios,null);
		 
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //////////////////////////////////////DIRECTORES//////////////////////////////////////////////

		 fecha_nacimiento=LocalDate.of(1971, Month.MARCH, 26);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director1 = new Director("Francis","Lawrence","",fecha_nacimiento, 41,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1967, Month.NOVEMBER, 1);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director2 = new Director("Pierre","Padang Coffin","Louis",fecha_nacimiento, 21,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1966, Month.DECEMBER, 1);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director3 = new Director("Chris","Renaud","",fecha_nacimiento, 2,true,premios,null);
		 
		 
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director4 = new Director("Adam","Schindler","",null, 2,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1971, Month.MARCH, 9);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director5 = new Director("Kyle","Balda","",fecha_nacimiento, 2,true,premios,null);
		 
		 fecha_nacimiento=LocalDate.of(1966, Month.JANUARY, 14);
		 premios = Arrays.asList("premio Grammy al mejor videoclip", "Premio Grammy latino por mejor video musical versiï¿½n corta");
		 Director director6 = new Director("Dan","Schneider","",fecha_nacimiento, 2,true,premios,null);
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////PELICULAS////////////////////////////////////////// 
		fecha_estreno=LocalDate.of(2009, Month.DECEMBER, 9);
		productoras = Arrays.asList("Warner", "Pixar");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor1,actor2);
		etiquetas= Arrays.asList("Etiqueta 1","Etiqueta 2","Etiqueta 3");
		Peliculas pelicula1= new Peliculas(false,"Soy Leyenda","Descripcion de Soy Leyenda",false,fecha_estreno,"Castellano",101,productoras,directores,actores,8,etiquetas);
		
		
		fecha_estreno=LocalDate.of(2014, Month.NOVEMBER, 20);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director1);
		actores=Arrays.asList(actor3,actor4);
		etiquetas= Arrays.asList("Etiqueta 4","Etiqueta 5");
		Peliculas pelicula2= new Peliculas(false,"Los Juegos del Hambre Parte 1","Descripcion de los Juegos del Hambre Parte 1",false,fecha_estreno,"Castellano",101,productoras,directores,actores,7,etiquetas);
		
		fecha_estreno=LocalDate.of(2010, Month.JULY, 9);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director2, director3);
		actores=Arrays.asList(actor5,actor6, actor7);
		etiquetas= Arrays.asList("Etiqueta 5","Etiqueta 6");
		Peliculas pelicula3= new Peliculas(false,"GRU: Mi villano favorito","Descripcion de GRU: Mi villano favorito",true,fecha_estreno,"Castellano",101,productoras,directores,actores,7,etiquetas);
		
		fecha_estreno=LocalDate.of(2015, Month.JULY, 12);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director4);
		actores=Arrays.asList(actor7,actor8,actor9, actor10);
		etiquetas= Arrays.asList("Etiqueta 7");
		Peliculas pelicula4= new Peliculas(false,"Intruders","Descripcion de Intruders",false,fecha_estreno,"Ingles",101,productoras,directores,actores,7,etiquetas);
		
		fecha_estreno=LocalDate.of(2015, Month.JUNE, 11);	
		productoras = Arrays.asList("Warner");
		directores=Arrays.asList(director2, director5);
		actores=Arrays.asList(actor11,actor12,actor13);
		etiquetas= Arrays.asList("Etiqueta 5","Etiqueta 6");
		Peliculas pelicula5= new Peliculas(false,"Minions","Descripcion de Minions",true,fecha_estreno,"Castellano",101,productoras,directores,actores,7,etiquetas);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		////////////////////////////////////////////////////SERIES////////////////////////////////////////// 
		//CAPITULOS//
		fecha_estreno = LocalDate.of(2005, Month.DECEMBER, 13);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor17,actor19);
		Capitulo capitulo1_temporada1_serie1 = new Capitulo("Bienvenida a la academia", "Capitulo 1 Temporada 1 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2005, Month.DECEMBER, 20);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16);
		Capitulo capitulo2_temporada1_serie1 = new Capitulo("Nuevas compañeras de cuarto", "Capitulo 2 Temporada 1 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2005, Month.DECEMBER, 27);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor18,actor19);
		Capitulo capitulo3_temporada1_serie1 = new Capitulo("La cámara indiscreta", "Capitulo 3 Temporada 1 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		
		
		
		fecha_estreno = LocalDate.of(2006, Month.JUNE, 12);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor17);
		Capitulo capitulo1_temporada2_serie1 = new Capitulo("De regreso en la ACP", "Capitulo 1 Temporada 2 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2006, Month.JUNE, 14);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor17,actor18);
		Capitulo capitulo2_temporada2_serie1 = new Capitulo("La cápsula del tiempo", "Capitulo 2 Temporada 2 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2006, Month.JUNE, 16);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor17);
		Capitulo capitulo3_temporada2_serie1 = new Capitulo("Elección", "Capitulo 3 Temporada 2 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		
		
		
		fecha_estreno = LocalDate.of(2007, Month.AUGUST, 10);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor17);
		Capitulo capitulo1_temporada3_serie1 = new Capitulo("Sorpresa", "Capitulo 1 Temporada 3 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2007, Month.AUGUST, 17);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor17,actor18);
		Capitulo capitulo2_temporada3_serie1 = new Capitulo("La novia de Chase", "Capitulo 2 Temporada 3 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2007, Month.AUGUST, 24);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor17, actor19);
		Capitulo capitulo3_temporada3_serie1 = new Capitulo("El decano guapo", "Capitulo 3 Temporada 3 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		fecha_estreno = LocalDate.of(2007, Month.AUGUST, 31);	
		directores=Arrays.asList(director6);
		actores=Arrays.asList(actor14,actor15,actor16,actor17,actor19);
		Capitulo capitulo4_temporada3_serie1 = new Capitulo("El tutor de Zoey", "Capitulo 4 Temporada 3 Zoey 101", fecha_estreno, "Castellano", 24, directores, actores);
		
		//TEMPORADAS//
		capitulos = Arrays.asList(capitulo1_temporada1_serie1, capitulo2_temporada1_serie1, capitulo3_temporada1_serie1);
		Temporada temporada1_serie1 = new Temporada(capitulos, "Temporada 1", "Zoey Brooks (Jamie Lynn Spears) es una chica de 13 años muy alegre y con gran talento para la moda...","Castellano", actores);
			
		capitulos = Arrays.asList(capitulo1_temporada2_serie1, capitulo2_temporada2_serie1, capitulo3_temporada2_serie1);
		Temporada temporada2_serie1 = new Temporada(capitulos, "Temporada 2", "Dana ha sido aceptada por un programa europeo de intercambio de estudiantes...","Castellano", actores);
		
		capitulos = Arrays.asList(capitulo1_temporada3_serie1, capitulo2_temporada3_serie1, capitulo3_temporada3_serie1, capitulo4_temporada3_serie1);
		Temporada temporada3_serie1 = new Temporada(capitulos, "Temporada 3", "Zoey y Lola se convertirán en las compañeras de cuarto de Quinn, quien pasó a ser compañera de Zoey y Lola...","Castellano", actores);
		
		
		temporadas = Arrays.asList(temporada1_serie1, temporada2_serie1, temporada3_serie1);
		
		Serie serie1= new Serie(temporadas, "Zoey 101", "La serie gira en torno a Zoey Brooks (Jamie Lynn Spears), una estudiante de un internado de California, PCA, que va conociendo a los que se convertirían en sus mejores amigos.", true,"Castellano" );
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		////////////////////////////////////////////////////CATALOGO////////////////////////////////////////// 
		Catalogo catalogo = new Catalogo();
		catalogo.addPelicula(pelicula1);
		catalogo.addPelicula(pelicula2);
		catalogo.addPelicula(pelicula3);
		catalogo.addPelicula(pelicula4);
		catalogo.addPelicula(pelicula5);
		catalogo.addSerie(serie1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////USUARIOS////////////////////////////////////////// 
		fecha_nacimiento = LocalDate.of(1995, Month.DECEMBER, 24);
		Usuario user1= new Usuario("Raul", "Gil Lopez", fecha_nacimiento, "53842198a", "normal");
		usuarios.add(user1);
		
		fecha_nacimiento = LocalDate.of(2013, Month.JUNE, 13);
		Usuario user2= new Usuario("Pablo", "Marin", fecha_nacimiento, "76543267Z", "premium");
		usuarios.add(user2);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////LISTA DE REPRODUCCION////////////////////////////////////////// 
		//USUARIO 1
		usuarios.get(usuarios.indexOf(user1)).getPlaylist().addPelicula(pelicula1);
		usuarios.get(usuarios.indexOf(user1)).getPlaylist().addLast_Rep_Pelicula(pelicula1, 50);
		//USUARIO 2
		usuarios.get(usuarios.indexOf(user2)).getPlaylist().addPelicula(pelicula3);
		usuarios.get(usuarios.indexOf(user2)).getPlaylist().addPelicula(pelicula5);
		usuarios.get(usuarios.indexOf(user2)).getPlaylist().removePelicula(pelicula5);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("************************************ Catalogo ************************************");
		System.out.println("");
		
		for(int i=0; i<catalogo.getPeliculas().size(); i++)
		{			
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
			System.out.println("\n\t\t- Director/es: ");
			for(int j=0; j<catalogo.getPeliculas().get(i).getDirectores().size(); j++)
			{
				String arg1 = "";
				String arg2 = "";
				arg1 = String.valueOf(catalogo.getPeliculas().get(i).getDirectores().get(j).getFecha_nacimiento());
				
				if(catalogo.getPeliculas().get(i).getDirectores().get(j).getFecha_muerte() == null)
					arg2 = "Actualidad";
				else
					arg2 = String.valueOf(catalogo.getPeliculas().get(i).getDirectores().get(j).getFecha_muerte());
				System.out.println("\t\t\t - "+catalogo.getPeliculas().get(i).getDirectores().get(j).getNombre()+" "+catalogo.getPeliculas().get(i).getReparto().get(j).getApellidos() + String.format(" (%s - %s)", arg1, arg2));
			}
			System.out.println("\n\t\t- Actor/es: ");
			for(int j=0; j<catalogo.getPeliculas().get(i).getReparto().size(); j++)
			{
				String arg1 = "";
				String arg2 = "";
				arg1 = String.valueOf(catalogo.getPeliculas().get(i).getReparto().get(j).getFecha_nacimiento());
				
				if(catalogo.getPeliculas().get(i).getReparto().get(j).getFecha_muerte() == null)
					arg2 = "Actualidad";
				else
					arg2 = String.valueOf(catalogo.getPeliculas().get(i).getReparto().get(j).getFecha_muerte());
				System.out.println("\t\t\t - "+catalogo.getPeliculas().get(i).getReparto().get(j).getNombre()+" "+catalogo.getPeliculas().get(i).getReparto().get(j).getApellidos() + String.format(" (%s - %s)", arg1, arg2));
			}
		}
		for(int i=0; i<catalogo.getSeries().size(); i++)
		{			
			System.out.println("\t* Serie "+(i+1)+":");
			System.out.println("\t\t- Titulo: "+catalogo.getSeries().get(i).getTitulo());
			System.out.println("\t\t- Descripcion: "+catalogo.getSeries().get(i).getDescripcion());
			String aux_infantil;
			if(catalogo.getSeries().get(i).isInfantil())
				aux_infantil = "SI";
			else
				aux_infantil = "NO";
			System.out.println("\t\t- Contenido Infantil: "+aux_infantil);
			System.out.println("\t\t- Lenguaje: "+catalogo.getSeries().get(i).getLenguaje());
			System.out.println("\t\t- Estreno del primer capitulo: "+catalogo.getSeries().get(i).getFecha_estreno_primero());
			System.out.println("\t\t- Estreno del capitulo mas reciente: "+catalogo.getSeries().get(i).getFecha_estreno_ultimo());				
			System.out.println("\n\t\t- Director/es: ");
			
			System.out.println("\n\t\t- Actor/es mas frecuentes de todos los capitulos de TODAS las temporadas: ");
			for(int j=0; j<catalogo.getSeries().get(i).getReparto().size(); j++)
			{
				String arg1 = "";
				String arg2 = "";
				arg1 = String.valueOf(catalogo.getSeries().get(i).getReparto().get(j).getFecha_nacimiento());
				
				if(catalogo.getSeries().get(i).getReparto().get(j).getFecha_muerte() == null)
					arg2 = "Actualidad";
				else
					arg2 = String.valueOf(catalogo.getSeries().get(i).getReparto().get(j).getFecha_muerte());
				System.out.println("\t\t\t - "+catalogo.getSeries().get(i).getReparto().get(j).getNombre()+" "+catalogo.getSeries().get(i).getReparto().get(j).getApellidos() + String.format(" (%s - %s)", arg1, arg2)+ " Ha aparecido "+ catalogo.getSeries().get(i).frecuenciaActor(catalogo.getSeries().get(i).getReparto().get(j))+" veces");
				
			}
			System.out.println("\n\t\t- Temporadas: ");
			for(int j =0; j<catalogo.getSeries().get(i).getTemporadas().size();j++)
			{
				System.out.println("\t\t\t * "+catalogo.getSeries().get(i).getTemporadas().get(j).getTitulo());
				for(int k = 0; k<catalogo.getSeries().get(i).getTemporadas().get(j).getCapitulos().size(); k++)
				{
					System.out.println("\t\t\t\t"+catalogo.getSeries().get(i).getTemporadas().get(j).getCapitulos().get(k).getId()+ " "+catalogo.getSeries().get(i).getTemporadas().get(j).getCapitulos().get(k).getTitulo());
				}
			}
			
		}
		System.out.println("**********************************************************************************\n");
		System.out.println("************************************ Usuarios ************************************");
		for(int i = 0; i<usuarios.size(); i++)
		{
			System.out.println("\n\t* Usuario "+(i+1)+":");
			System.out.println("\t\t- Nombre: "+usuarios.get(i).getNombre() + " "+usuarios.get(i).getApellidos());
			System.out.println("\t\t- Fecha de nacimiento: "+usuarios.get(i).getFecha_nacimiento());
			System.out.println("\t\t- Contenido Infantil: "+usuarios.get(i).isInfantil());
			System.out.println("\t\t- ID: "+usuarios.get(i).getIdentificacion());
			System.out.println("\t\t- Tipo de contrato: "+usuarios.get(i).getTipo_contrato());
			System.out.println("\n\t\t- Lista de reproduccion:");
			System.out.println("\t\t\t* Peliculas:");
			if(usuarios.get(i).getPlaylist().getPeliculas().size()==0)
				System.out.println("\t\t\t\t No se ha anadido ninguna pelicula todavia.");
			else 
			{
				for(int j = 0; j<usuarios.get(i).getPlaylist().getPeliculas().size(); j++)
				{
					int last_rep = usuarios.get(i).getPlaylist().getPeliculas().get(j).getLast_rep();
					String last_report="";
					if(last_rep == -1)
						last_report = "No se ha reproducido todavia";
					else
						last_report = "Minuto "+String.valueOf(last_rep);
					System.out.println("\t\t\t\t"+(j+1)+"- "+usuarios.get(i).getPlaylist().getPeliculas().get(j).getTitulo()+"\t - "+last_report);
				}
			}
			System.out.println("\n\t\t\t* Series:");
			if(usuarios.get(i).getPlaylist().getSeries().size()==0)
				System.out.println("\t\t\t\t No se ha anadido ninguna serie todavia.");
			else 
			{
			
			}
			String arg;
			if(usuarios.get(i).isInfantil())
				arg = "Infantil";
			else
				arg = "Todo";
			System.out.println("\n\t\t- Catalogo disponible para "+usuarios.get(i).getNombre()+String.format(" (%s) -", arg));
			System.out.println("\t\t\t * Peliculas:");
			for(int j=0; j<catalogo.getUserPeliculas(usuarios.get(i)).size(); j++)
			{
				System.out.println("\t\t\t\t"+(j+1)+" - "+catalogo.getUserPeliculas(usuarios.get(i)).get(j).getTitulo());
			}
			System.out.println("\t\t\t * Series:");
			for(int j=0; j<catalogo.getUserSeries(usuarios.get(i)).size(); j++)
			{
				System.out.println("\t\t\t\t"+(j+1)+" - "+catalogo.getUserSeries(usuarios.get(i)).get(j).getTitulo());
			}
			
			
		}
		
		
		
		System.out.println("\n**********************************************************************************\n");
		System.out.println();
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
