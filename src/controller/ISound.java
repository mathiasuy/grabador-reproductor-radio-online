package controller;

import java.util.ArrayList;

import datatypes.DtGrabados;

public interface ISound {

	public abstract void record(String url);
	public abstract ArrayList<DtGrabados> getListRecords();

}
