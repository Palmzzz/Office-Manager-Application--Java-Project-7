package model;

import controller.OfficeManager;

public class Listener extends OfficeManager {

	private String listener;
	
	public Listener(String listener) {
	super();
	this.listener = listener;
	}

	public String getListener() {
		return listener;
	}
	
	public void setListener(String listener) {
		this.listener = listener;
	}
	
	public Listener getStatus(Machine machineType) {
		return machineType.displayStatus();
	}
	
	

}
