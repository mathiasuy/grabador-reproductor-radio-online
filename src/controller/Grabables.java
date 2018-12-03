package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import datatypes.DtGrabable;
import datatypes.DtGrabados;
import manejadores.MGrabables;
import model.Emisora;
import model.Grabable;

public class Grabables implements IGrabables{

	private static final String DIRECTORIO = (new File("")).getAbsolutePath() + "\\records\\";	
	
	@Override
	public ArrayList<DtGrabable> getGrabables(){
		return MGrabables.getInstance().listarGrabables();
	}
	
	@Override
	public ArrayList<DtGrabados> getListRecords() {
		File dir = new File(DIRECTORIO);
		String[] ficheros = dir.list();
		ArrayList<DtGrabados> grabados = new ArrayList<>();
		
		if (ficheros != null)
			  for (int x=0;x<ficheros.length;x++)
			    grabados.add(new DtGrabados(ficheros[x], new Date()));
		
		return grabados;
	}	
	
	@Override
	public void precarga() {
		Grabable gr = new Emisora(0,"DelSol", "Emisora de radio", "DelSol", "99.5", "FM", "https://radio3.dl.uy:9952/?type=http&nocache=2780", "Uruguay","Montevideo","mp3");
		MGrabables.getInstance().add(gr);
		gr = new Emisora(1,"Oceano", "Emisora de radio", "Oceano", "93.9", "FM", "http://radio3.oceanofm.com:8010/listen.mp3", "Uruguay","Montevideo","mp3");
		MGrabables.getInstance().add(gr);
		gr = new Emisora(2,"Azul", "Emisora de radio", "Azul", "101.9", "FM", "http://195.154.182.222:3320/stream", "Uruguay","Montevideo","mp3");
		MGrabables.getInstance().add(gr);
		gr = new Emisora(3,"Sport890", "Emisora de radio", "Deportes", "890", "AM", "http://d1a7butsko8nkd.cloudfront.net/sport.mp3", "Uruguay","Montevideo","mp3");
		MGrabables.getInstance().add(gr);
//		gr = new Emisora(4,"Espectador", "Emisora de radio", "Deportes", "810", "AM", "http://streaming.espectador.com/envivoaac", "Uruguay","Montevideo","aac");
//		MGrabables.getInstance().add(gr);
	}
	
}
