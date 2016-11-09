# PerformanceWatch

Simple API to log the performance attributes of any application.

# Documentation

Below example has four layers - UI, MIddleware, CLOUD and DB. All you have to do is, initialize the Watcher and keep splitting. 

<b>Initialize</b>
PerformanceWatchAPI watcher = new PerformanceWatchAPI("corelationid-abc123");

<b>Start</b>
watcher.start("UI.getSearchResults()");

<b>Split Response time</b>
watcher.splitWatch("UI.searchFormValidate()");

<b>end the transaction</b>
watcher.end("UI.getSearchResults()"); 


# Sample Output

Assume your application has various layers, and you want to trace the response time of individual components, that is possible with this framework. Below example has four layers - UI, MIddleware, CLOUD and DB. All you have to do is, initialize the Watcher and keep splitting. 

corelationid-abc123		UI.getSearchResults()				  0 ms (started)
corelationid-abc123		UI.searchFormValidate()				114 ms
corelationid-abc123		UI.getCityListData()				  203 ms
corelationid-abc123		UI.getSearchMixFilter()				516 ms
corelationid-abc123		MW.DB.getDBDetails()				  406 ms
corelationid-abc123		MW.TD.getSiteXML()					  411 ms
corelationid-abc123		MW.searchWServiceCall()				203 ms
corelationid-abc123		CLOUD.getProfileData()				2007 ms
corelationid-abc123		CLOUD.getLiteProfile()				403 ms
corelationid-abc123		MW.extractResponse()				  610 ms
corelationid-abc123		UI.processSResponse()				  1002 ms
corelationid-abc123		UI.getSearchResults()				  6376 ms (finished)
