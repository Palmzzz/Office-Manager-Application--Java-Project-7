package controller;

import java.util.ArrayList;

import model.CoffeeMachine;
import model.Copier;
import model.Job;
import model.Machine;
import model.Printer;
import model.Scanner;
import model.VendingMachine;

public class OfficeManager {
	private ArrayList<Machine> machines;
	private String currentMachine; // current machine is an int, as each machine in array, will be e.g. 1, scanner,
									// 2, printer

	private ArrayList<Job> availableJobs; // list of available jobs

	public OfficeManager() {

		currentMachine = null; // current machine when idle, is 0, no machine, null
		availableJobs = new ArrayList<Job>(); // arraylist of available jobs for processing
		machines = new ArrayList<Machine>(); // arraylist of the 5 machines that can be used
		createJob();
		createMachines();
	}


	public void createMachines() { // for testing from lab
		machines.add(new Printer());
		machines.add(new Scanner());
		machines.add(new VendingMachine());
		machines.add(new Copier());
		machines.add(new CoffeeMachine());
	}

	public void setMachines(ArrayList<Machine> machines) {
		this.machines = machines;
	}

	public ArrayList<Machine> getMachines(ArrayList<Machine> machines) {
		return machines;
	}

	public int getSizeOfAvailableJobs() {
		return availableJobs.size();
	}

	public String getCurrentMachine() { //
		return currentMachine;
	}

// listening is sub class of office manager when setting up 


	public ArrayList<Job> getAvailableJob() {
		return availableJobs;
	}

	public void setAvailableJobs(ArrayList<Job> availableJobs) {
		this.availableJobs = availableJobs;
	}

	public void createJob(Job job) {
		availableJobs.add(job);
	}

	public Machine getMachineFromJob(Job job) { // will let us find the machine, that is equal to the job we want
		String code = job.getJobCode(); // the same job we have in the job, will make it equal to that machine
		for (Machine machine : machines) {
			String machineCode = machine.getMachineType();
			if (code.equals(machineCode)) {
				return machine;
			}
		}
		return null;
	}

	public void assignAllJobs() {
		for (Job job : availableJobs) {
			Machine m = getMachineFromJob(job);
			if (m != null) {
				m.acceptJob(job);
			}
		}
	}

	public void assignJob(Job job, Machine machine) {
		if (availableJobs.contains(job)) {
			Machine m = getMachineFromJob(job);
			if (m != null) {
				m.acceptJob(job);
			} else {
				System.out.println("Your job could not be assigned, please retry");
			}
		}
	}

	public void addMachine(Machine m) {
		machines.add(m);
	}

	public void createJob() {
		availableJobs.add(new Job("CPY", "John", "Copy this page")); // for testing at a later date
		availableJobs.add(new Job("SCN", "Diana", "Scan this"));
		availableJobs.add(new Job("VND", "Tony", "Buy some chocolate"));
		availableJobs.add(new Job("PRT", "Janice", "Print this document"));
		availableJobs.add(new Job("CFE", "Ian", "Make a coffee"));
	}


	public void processJob() {
		for (Machine machine : machines) {
			machine.processTheJob();
			if (machine instanceof Scanner) {
				Job job = ((Scanner) machine).extractJob();
				Machine printer = getMachineFromJob(job);
				printer.acceptJob(job);
				printer.processTheJob();
			}
		}
		availableJobs.removeAll(availableJobs);

	}

	public ArrayList<Machine> getMachines() {
		return machines;
	}

	public ArrayList<Job> getAvailableJobs() {
		return availableJobs;
	}

	public void setCurrentMachine(String currentMachine) {
		this.currentMachine = currentMachine;
	}

}
