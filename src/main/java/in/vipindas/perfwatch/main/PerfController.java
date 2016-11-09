package in.vipindas.perfwatch.main;

import in.vipindas.perfwatch.api.PerformanceWatchAPI;
import in.vipindas.perfwatch.service.PerfMServiceInvoker;

public class PerfController {
	
	/**
	 * Assum this as a controller method or Java Main Entry point
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {	       
		   
	       PerformanceWatchAPI watcher = new PerformanceWatchAPI("corelationid-abc123");
	       
	       //Start of the method
	       watcher.start("UI.getSearchResults()");
	       //Assume basic request parsing takes 100 ms
	       Thread.sleep(100);
	       
	       //Form validate
	       watcher.splitWatch("UI.searchFormValidate()");
	       //Assume form validation takes 200 ms
	       Thread.sleep(200);
	       
	       //City List parsing method
	       watcher.splitWatch("UI.getCityListData()");
	       //City list data takes 500 ms
	       Thread.sleep(500);
	       
	       //Interline logic
	       watcher.splitWatch("UI.getSearchMixFilter()");
	       Thread.sleep(400);
		   
	       //Real service call happenes throgh invoker
	       PerfMServiceInvoker.getSearchResults();
	       
	       //After sertvice call Process response and VO
	       watcher.splitWatch("UI.processSResponse()");
	       Thread.sleep(500);
	       
	       //Return to Model and View
	       watcher.end("UI.getSearchResults()"); 

	}

}
