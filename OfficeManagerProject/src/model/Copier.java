package model;

public class Copier extends Machine {

	private int copies;

	public Copier() {
		super();
		this.machineType = "CPY";
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}


	@Override
	public void processTheJob() {
		Machine copier = new Copier();
		Job job = this.getAssignJob();
		copier.acceptJob(job);
		for (int index = 0; index < copies; index++) {
			System.out.println(index + copies + "printed.");
		}
		copier.resetJob();
	}

}
