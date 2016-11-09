package in.vipindas.perfwatch.service;

import in.vipindas.perfwatch.api.PerformanceWatchAPI;

public class PerfCLOUDServInvoker {

	
	/**
	 * Suppose this is a method will get some data from Cloud
	 * @throws InterruptedException
	 */
	public static void makeCLOUDCall() throws InterruptedException {
		 PerformanceWatchAPI watcher = new PerformanceWatchAPI();
	    
		 //Call profile data
		 watcher.splitWatch("CLOUD.getProfileData()");
	     Thread.sleep(400);		
	     
	     //Call lite profile
	     watcher.splitWatch("CLOUD.getLiteProfile()");
	     Thread.sleep(600);	     
	}

}
