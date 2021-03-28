package urjc.ist.streaming;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	private String identificacion;  
	private String tipo_contrato;
	private boolean infantil;	
	private Playlist playlist;

	
	public Usuario()
	{
		this.nombre = "";
		this.apellidos = "";
		this.fecha_nacimiento = null;
		this.identificacion = "";
		this.tipo_contrato = "";
		this.infantil = false;
		this.playlist = new Playlist();
	}
	
	public Usuario(String nombre, String apellidos, LocalDate fecha_nacimiento, String identificacion, String tipo_contrato) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.identificacion = identificacion;
		this.playlist = new Playlist();
		
		
		if(!tipo_contrato.equals("normal") && !tipo_contrato.equals("superior") && !tipo_contrato.equals("premium"))
		{
			throw new RuntimeException("Error al agregar Usuario, tipo de contrato invalido.");
		}
		else
			this.tipo_contrato = tipo_contrato;
		
		
		this.infantil=!((LocalDate.now().getYear() - fecha_nacimiento.getYear()) > 13);
		
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
		
		this.infantil=!((LocalDate.now().getYear() - fecha_nacimiento.getYear()) > 13);
		
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
}
