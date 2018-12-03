package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import datatypes.DtGrabable;

public abstract class Grabable {

	private int id; 
	private String nombre;
	private String descripcion;
	private String nombreArchivo;
	private Date fechaAgregado;
	private String pais;
	private String localidad;
	private String tipo;
	private HashMap<Integer, Evento> eventos = new HashMap<>();
	
	
	public Grabable(int id, String nombre, String descripcion, String nombreArchivo, String pais, String localidad, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaAgregado = new Date();
		this.nombreArchivo = nombreArchivo;
		this.tipo = tipo;
	}

	public void agregarEvento(Evento ev) {
		this.eventos.put(ev.getId(),ev);
	}
	
	public void quitarEvento(int id) {
		this.eventos.remove(id);
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
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


	public Date getFechaAgregado() {
		return fechaAgregado;
	}


	public int getId() {
		return id;
	}
	
	public abstract DtGrabable getDt();
}
