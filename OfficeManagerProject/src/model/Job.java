package model;

public class Job {

	private String jobCode;
	private String owner;
	private String description;

	
	
	public Job(String jobCode, String owner, String description) { // constructor for job
		this.jobCode = jobCode;
		this.owner = owner;
		this.description = description;
	}

	public String getJobCode() {
		return jobCode;
	}
	
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public String getDescription() {
		return description;
	}
}
