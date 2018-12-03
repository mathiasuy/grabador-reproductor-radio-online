package datatypes;

import java.time.LocalDateTime;
import java.util.Date;

public class DtEvento {

	private static int idGlobal = 0;
	
	private int id;
	private String nombre;
	private String descripcion;
	private String nombreArchivo;
	private LocalDateTime horaFin;
	private LocalDateTime horaInicio;
	private Date fechaAgregado;
	
	public DtEvento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public DtEvento(String nombre, String descripcion, String nombreArchivo, LocalDateTime horaFin,
			LocalDateTime horaInicio) {
		super();
		this.id = idGlobal++; 
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.nombreArchivo = nombreArchivo;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public LocalDateTime getHoraFin() {
		return horaFin;
	}

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public int getId() {
		return id;
	}

	public Date getFechaAgregado() {
		return fechaAgregado;
	}

	
}
