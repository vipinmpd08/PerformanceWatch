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


