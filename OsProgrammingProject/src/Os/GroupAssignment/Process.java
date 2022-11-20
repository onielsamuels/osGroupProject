package Os.GroupAssignment;

import java.util.Date;

public class Process {
	int pID; //(uniquely assigned between 1 and 20) 
	String task; //1 Add, 2 Remove, 3 Retrieve 4 Calculate
	int priority; //Priority (integer value 1 – 5 with 1 being the highest)
 	 
    int arrival_time; // (randomized number between 0 and 29) 
	Date start_time; // (system time) 
	Date end_time; // (system time) 
	int	blocked_time; // (numeric value) 
	int	Burst_time; // (randomized number between 1 to 5 seconds) 
	
	public int getpID() {
		return pID;
	} 
	
	public void setpID(int pID) {
		this.pID = pID;
	}
	 
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getArrival_time() {
		return arrival_time;
	}
	
	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}
	
	public int getBlocked_time() {
		return blocked_time;
	}
	
	public void setBlocked_time(int blocked_time) {
		this.blocked_time = blocked_time;
	}
	
	public int getBurst_time() {
		return Burst_time;
	}
	
	public void setBurst_time(int burst_time) {
		Burst_time = burst_time;
	}
	
	
	public void outProcess() {
		System.out.println(pID);
	}

}
