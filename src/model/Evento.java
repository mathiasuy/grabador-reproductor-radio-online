package model;

import java.time.LocalDateTime;
import java.util.Date;

public class Evento {
	
	private static int idGlobal = 0;
	
	private int id;
	private String nombre;
	private String descripcion;
	private String nombreArchivo;
	private LocalDateTime horaFin;
	private LocalDateTime horaInicio;
	private Date fechaAgregado;
	
	public Evento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Evento(String nombre, String descripcion, String nombreArchivo, LocalDateTime horaFin,
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public LocalDateTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalDateTime horaFin) {
		this.horaFin = horaFin;
	}

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getId() {
		return id;
	}

	public Date getFechaAgregado() {
		return fechaAgregado;
	}

	
	
	
}
