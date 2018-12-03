package controller;

public class Factory {

//	public ISound getISound() {
//		return new Sound();
//	}
	
	public IGrabables getIGrabables() {
		return new Grabables();
	}
	
}
