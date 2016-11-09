package in.vipindas.perfwatch.vo;

public class PerformanceWatchVO {

    private long startTime;
    private long splitTime;
    private long endTime;
    private String sessionId;
     
    public PerformanceWatchVO() {
	}
     
    public PerformanceWatchVO(String sessionId) {
    	this.sessionId = sessionId;
	}
    
    public String getSessionId() {
		return sessionId;
	}
    
    public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
    
    public long getEndTime() {
		return endTime;
	}
    
    public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
    
    public long getSplitTime() {
		return splitTime;
	}
    
    public void setSplitTime(long splitTime) {
		this.splitTime = splitTime;
	}
    
    public long getStartTime() {
		return startTime;
	}
    
    public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
    
    

}
