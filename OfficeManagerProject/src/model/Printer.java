package model;

public class Printer extends Machine {

	public Printer() {
		super();
		this.machineType = "PRT";
	}

	@Override
	public void processTheJob() {
		Job job1 = this.getAssignJob(); 
		Machine printer = new Printer();
		//String owner = job.getOwner();
		printer.acceptJob(job1);
		job1.getDescription();
		printer.resetJob();
	}

	}

//create a printer
// get assigned job or current job
// get description from the job
// accept the job
// print out the description 
// reset job