package manejadores;

import java.util.ArrayList;

import datatypes.DtGrabable;
import model.Grabable;

public class MGrabables {

	ArrayList<Grabable> manejadorGrabables = new ArrayList<>();
	
	private static MGrabables instance = null;
	
	
	public static MGrabables getInstance() {
		if (instance == null)
			instance = new MGrabables();
		return instance;
	}
	
	public void add (Grabable gra) {
		this.manejadorGrabables.add(gra);
	}
	
	public ArrayList<DtGrabable> listarGrabables(){
		ArrayList<DtGrabable> lista = new ArrayList<>();
		manejadorGrabables.forEach(grabable->{
			lista.add(grabable.getDt());
		});
		return lista;
	}
}
