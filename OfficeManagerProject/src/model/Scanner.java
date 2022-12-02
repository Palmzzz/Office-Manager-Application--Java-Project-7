package model;

public class Scanner extends Machine {

	public Scanner() {
		super();
		this.machineType = "SCN";
	}

	public void processTheJob() {
		Job job = this.assignJob;
		if (job != null) {
			job.setOwner(this.machineType);
			job.setJobCode("PRT");
		}
		
	}
	
	public Job extractJob() {
		Job job = this.assignJob;
		this.assignJob = null;
		return job;
	}
}
	
