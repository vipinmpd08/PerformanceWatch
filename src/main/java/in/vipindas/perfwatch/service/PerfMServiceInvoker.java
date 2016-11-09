package in.vipindas.perfwatch.service;

import in.vipindas.perfwatch.api.PerformanceWatchAPI;

public class PerfMServiceInvoker {


	public static void getSearchResults() throws InterruptedException {
		
		 PerformanceWatchAPI watcher = new PerformanceWatchAPI();
		 
		 //Make DB call
	     watcher.splitWatch("MW.DB.getDBDetails()");
	     //Assume it takes 400 ms
	     Thread.sleep(400);
	       
	     //Parse site xml
	     watcher.splitWatch("MW.TD.getSiteXML()");
	     Thread.sleep(200);	  

	     //Make MRP service call
	     watcher.splitWatch("MW.searchWServiceCall()");
	     Thread.sleep(2000);	
	     
	     //Make CLOUD call
	     PerfCLOUDServInvoker.makeCLOUDCall();
	     
	     //Combine the results and send VO back to UI
	     watcher.splitWatch("MW.extractResponse()");
	     Thread.sleep(1000);	     
	     
	}
	
	
}
