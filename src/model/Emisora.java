package model;

import datatypes.DtEmisora;
import datatypes.DtGrabable;

public class Emisora extends Grabable{

	private String banda;
	private String frecuencia;
	private String url;
	
	public Emisora(int id, String nombre, String descripcion, String nombreArchivo, String banda, String frecuencia,
			String url,String  pais,String localidad, String tipo) {
		super(id, nombre, descripcion, nombreArchivo,pais,localidad,tipo);
		this.banda = banda;
		this.frecuencia = frecuencia;
		this.url = url;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public DtGrabable getDt() {
		return new DtEmisora(super.getId(), super.getNombre(), super.getDescripcion(), super.getNombreArchivo(), this.banda, this.frecuencia, this.url,super.getTipo());
	}
	
	
}
