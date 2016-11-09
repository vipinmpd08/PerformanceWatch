package in.vipindas.perfwatch.api;

import in.vipindas.perfwatch.vo.PerformanceWatchVO;

public class PerformanceWatchAPI {

	//Local variable for each thread
	private static ThreadLocal<PerformanceWatchVO> threadLocal = new ThreadLocal<PerformanceWatchVO>();
	
	public PerformanceWatchAPI() {
    	if(null == getWatcherVO()) {
    		setWatcherVO(new PerformanceWatchVO());
    	}		
	}
	
    public PerformanceWatchAPI(String sessionId) {
    	if(null == getWatcherVO()) {
    		setWatcherVO(new PerformanceWatchVO(sessionId));
    	}
    }
    
    public static PerformanceWatchVO getWatcherVO() {
    	return threadLocal.get();
    }
    
    public static void setWatcherVO(PerformanceWatchVO vo) {
    	threadLocal.set(vo);
    }

    /**
     * Start method, here you set the start time and endtime
     * @param methodName
     */
    public void start(String methodName) {
    	getWatcherVO().setStartTime(System.currentTimeMillis());
    	getWatcherVO().setSplitTime(System.currentTimeMillis());
    	getWatcherVO().setEndTime(System.currentTimeMillis());
        System.out.println(getWatcherVO().getSessionId()+"\t\t" + methodName + "\t\t\t\t"+(getWatcherVO().getEndTime() - getWatcherVO().getSplitTime()) + " ms (started)");
    }

    /**
     * Default split method
     */
    public void splitWatch() {
        splitWatch("");
    }

    /**
     * Method which will split the flow, add breakdowns in between
     * @param methodName
     */
    public void splitWatch(String methodName) {
    	getWatcherVO().setEndTime(System.currentTimeMillis());
        System.out.println(getWatcherVO().getSessionId()+"\t\t" + methodName + "\t\t\t\t" + (getWatcherVO().getEndTime() - getWatcherVO().getSplitTime()) + " ms");
        getWatcherVO().setSplitTime(getWatcherVO().getEndTime());
    }

    /**
     * Default method
     */
    public void end() {
        end("");
    }
    
    /**
     * Call this at the end of the transaction
     * @param tag
     */
    public void end(String tag) {
    	getWatcherVO().setEndTime(System.currentTimeMillis());
        System.out.println(getWatcherVO().getSessionId()+"\t\t" + tag + "\t\t\t\t" + (getWatcherVO().getEndTime() - getWatcherVO().getStartTime()) + " ms (finished)");
    }

}
