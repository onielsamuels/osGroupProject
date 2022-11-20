package Os.GroupAssignment;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Driver {


	 static String[] TASKS = {"ADD", "REMOVE", "RETRIEVE", "CALCULATE"};


	 //Driver 
	public static void main(String[] args) {
		//create list of process variable using data Structure List
		 //List<Process> process = new ArrayList<Process>();
		
		 Hashtable<Integer,Process> process = new Hashtable<Integer,Process>();
//		 List<Integer> sharedResource = new ArrayList<>();

		 ArrayList<Map.Entry<Integer, Integer>> Resource = new ArrayList<Map.Entry<Integer, Integer>>();

		 Hashtable<Integer,Integer> sharedResource = new Hashtable<>();

		 Pair<Integer, Integer> p = new Pair<>

		 int whichTask = 0;
		 int taskPriority = 0;
		 int processArrivalTime =  0;
		 int burstTime = 0;
		 Date timenow = new Date();
		 
		 
		 for(int i=1;i<=20;i++)
		 {
			 sharedResource.put(i, getRandom(1,100));
			 //create variable using Process Datatype
			 Process p = new Process();	
			 p.setpID(i); //sett PID
			 
			 //select and set task
			 whichTask = getRandom(0,3);
			 p.setTask(TASKS[whichTask]);
			 
			 //set priority
			 taskPriority = getRandom(1,5);
			 p.setPriority(taskPriority);
			 
			 //set arrival time
			 processArrivalTime = getRandom(0,29);
			 p.setArrival_time(processArrivalTime);			 
			 
			 
			 
			 //set burst time random from 1 to 5 inclusive
			 burstTime = getRandom(1,5);
			 p.setBurst_time(burstTime);
			 
			 process.put(i, p);			 
		 }//end of Process set up for loop	 
		 
		 
		 for(int i=1;i<=20;i++)
		 {
			 process.get(i).outProcess();

		 }





	}//end of main driver
	
	
	
	
	static int getRandom(int min,int max)
	{
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}

}
