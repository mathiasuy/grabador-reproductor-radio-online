package model;

import java.util.ArrayList;
import java.util.HashMap;

public class TablaTiempo {

	ArrayList<Evento> viejos;
	ArrayList<Evento> actuales;
	ArrayList<Evento> futuros;
	
	HashMap<Integer, Evento> hora;
	HashMap<Integer, Evento> minuto;
	HashMap<Integer, Evento> dia;
	
	//Cuando se levanta una lista de programas, se chequea que no sea de una fecha pasada, si lo es, se borra
	//Tambien se debe comprobar la fecha mas reciente en la lista de programas para ver si no hay una del dia actual que deba ir.
	
}
