package controller;

import java.util.ArrayList;

import datatypes.DtGrabable;
import datatypes.DtGrabados;

public interface IGrabables {

	public abstract ArrayList<DtGrabable> getGrabables();
	public abstract void precarga();
	public abstract ArrayList<DtGrabados> getListRecords();

}
