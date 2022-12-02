package model;

public class CoffeeMachine extends Machine {

	public CoffeeMachine() {
		super();
		this.machineType = "CFE";
	}

	@Override
	public void processTheJob() {

	}

	public void processTheJob (Job job) {
		Machine coffeeMachine = new CoffeeMachine();
		String owner = job.getOwner();
		coffeeMachine.acceptJob(job);
		if (owner != "1");
		{
			System.out.println("10p has been taken from your account");
		}
		if (owner == "1");
		System.out.println("Thank you, you have a free coffee as a member of senior management");
		coffeeMachine.resetJob();
	}


	}
