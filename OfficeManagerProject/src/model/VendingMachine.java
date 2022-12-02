package model;

public class VendingMachine extends Machine {

	public VendingMachine() {
		super();
		this.machineType = "VND";
	}

	@Override
	public void processTheJob() {
		Job job = this.getAssignJob();
		Machine vendingMachine = new VendingMachine();
		String owner = job.getOwner();
		vendingMachine.acceptJob(job);
		if (owner != "1");
		{
			System.out.println("10p has been taken from your account");
		}
		if (owner == "1");
		System.out.println("Thank you, you get free food as a member of senior management");
		vendingMachine.resetJob();
	}


		
	}






