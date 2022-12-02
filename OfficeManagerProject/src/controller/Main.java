package controller;

public class Main {

	public static void main(String[] args) {
	OfficeManager om = new OfficeManager();
	om.assignAllJobs();
	om.processJob();
	System.out.println("Hello");
	}
}

// The main class is used to initiate the process 
// I would like to build on this, and add a scanner / input reader 
// With building on this I am then able to have a good front facing interface
// which will be more user friendly 
// for example: "Hello, which machine would you like to use"
// option - "Vending machine" - Enter you staff number - "1234"
// Thank you, your food is now free as a member of senior management 