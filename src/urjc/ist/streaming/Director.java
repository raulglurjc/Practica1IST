package urjc.ist.streaming;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
public class Director {
	private String nombre;
	private String apellidos;
	private String pseudonimo;
	private LocalDate fecha_nacimiento;
	private int participaciones;
	private boolean activo;
	private List<String> premios;
	private LocalDate fecha_muerte;
	
	
	public Director()
	{
		this.nombre = "";
		this.apellidos = "";
		this.pseudonimo = "";
		this.fecha_nacimiento = null;
		this.participaciones = 0;
		this.activo = false;
		this.fecha_muerte = null;
		this.premios = new ArrayList<String>();
	}
	public Director(String nombre, String apellidos, String pseudonimo, LocalDate fecha_nacimiento, int participaciones, boolean activo, List<String> premios, LocalDate fecha_muerte) 
	{		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pseudonimo = pseudonimo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.participaciones = participaciones;
		this.activo = activo;
		this.fecha_muerte = fecha_muerte;
		if(premios.size()<=10)
			this.premios=premios;
		else
			throw new RuntimeException("Numero maximo de elementos alcanzado en la lista Directores/premios");
				
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellidos() 
	{
		return apellidos;
	}
	public void setApellidos(String apellidos) 
	{
		this.apellidos = apellidos;
	}
	public String getPseudonimo() 
	{
		return pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) 
	{
		this.pseudonimo = pseudonimo;
	}
	public LocalDate getFecha_nacimiento() 
	{
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) 
	{
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getParticipaciones() 
	{
		return participaciones;
	}
	public void setParticipaciones(int participaciones) 
	{
		this.participaciones = participaciones;
	}
	public boolean getActivo() 
	{
		return activo;
	}
	public void setActivo(boolean activo) 
	{
		this.activo = activo;
	}
	public List<String> getPremios() 
	{
		return premios;
	}
	public void setPremios(List<String> premios) 
	{
		if(premios.size()<=10)
			this.premios=premios;
		else
			throw new RuntimeException("Numero maximo de elementos alcanzado en la lista Directores/premios");
			
	}
	public LocalDate getFecha_muerte() 
	{
		return fecha_muerte;
	}
	public void setFecha_muerte(LocalDate fecha_muerte) 
	{
		this.fecha_muerte = fecha_muerte;
	}
	public boolean haFallecido() 
	{
		 if(this.fecha_muerte == null)
	         return false;	     
	     return true;
	}
	public boolean tienePseudonimo() 
	{
		 if(this.pseudonimo == "")		 
	        return false;	    
		 return true;
	}
	
}