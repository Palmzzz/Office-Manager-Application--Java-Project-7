package model;
/**
 * 
 */

import java.util.ArrayList;

import controller.OfficeManager;

public abstract class Machine {

	private boolean online; 
	private boolean error;
	protected Job assignJob; // use the protected modifier when you need to only allow access to the code
								// within the package or when its subclassed.
	protected String machineType;
	private ArrayList<Listener> listeners;

	public Machine() { 
		online = true;
		error = false;
		assignJob = null;
		machineType = null;
	}



	public boolean resetTheError() { // error should be false, when we 'reset the error'
		return error = false;
	}

	public Job resetJob() {
		return assignJob = null;
	}

	public abstract void processTheJob(); // abstract because we are going to call this in our machines

	public void acceptJob(Job job) {
		// if no current job
		// if machine is online
		// if error isn't happening
		if (assignJob == null && online == true && error == false && job.getJobCode() == machineType)
			;
		assignJob = job;

	}

	public String getMachineType() {
		return machineType;

	}

	public boolean isOnline() {
		return online = true;
	}
	
	public boolean isOffline() {
		return online = false;
	}

	public boolean isError() {
		return error = true;
	}
	
	public boolean noError() {
		return error = false;
	}

	public Job getAssignJob() {
		return assignJob;
	}


	public void setOnline(boolean online) {
		this.online = online;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public void setAssignJob(Job assignJob) {
		this.assignJob = assignJob;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	
	// The listener scans to see the state of the machine
	// online, offline or error state. 
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void tellListener (OfficeManager listener) {
		if (online == true || online == false || error == true || error == false) {
			displayStatus();
		}
	}
	
	public Listener displayStatus() {
		for (Listener listener : listeners) {
			if (online = true) {
				listener.getStatus(this);
				System.out.println("Machine online");
			}
			if (online = false) {
				listener.getStatus(this);
				System.out.println("Machine online");
			}
			if (error = false ) {
				listener.getStatus(this);
				System.out.println("No error");
			}
			if (error = true) {
				listener.getStatus(this);
				System.out.println("Error");
			}
		}
		return null;
	}
	
	
	

}
