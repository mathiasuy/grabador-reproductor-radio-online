package datatypes;

import java.util.Date;
import java.util.HashMap;

import model.Evento;

public class DtGrabable {

	private int id; 
	private String nombre;
	private String descripcion;
	private String nombreArchivo;
	private String tipo;
	private Date fechaAgregado;
	
	
	public DtGrabable(int id, String nombre, String descripcion, String nombreArchivo,String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.fechaAgregado = new Date();
		this.nombreArchivo = nombreArchivo;
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


	public Date getFechaAgregado() {
		return fechaAgregado;
	}


	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	public String getTipo() {
		return tipo;
	}
}
