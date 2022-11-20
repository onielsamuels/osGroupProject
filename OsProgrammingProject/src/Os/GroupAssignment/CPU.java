package Os.GroupAssignment;

public class CPU {
    boolean haslock;
    String whatTaskRunning;	//hold task CPU running on Process: ADD, REMOVE, RETRIEVE, CALCULATE
    int whichSharedResource; //holds which shared resource CPU is using now
    int whichProcessRunning; //hold which process running
    int data;  //hold data CPU processing




    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public boolean isHaslock() {
        return haslock;
    }
    public void setHaslock(boolean haslock) {
        this.haslock = haslock;
    }
    public String getWhatTaskRunning() {
        return whatTaskRunning;
    }
    public void setWhatTaskRunning(String whatTaskRunning) {
        this.whatTaskRunning = whatTaskRunning;
    }
    public int getWhichSharedResource() {
        return whichSharedResource;
    }
    public void setWhichSharedResource(int whichSharedResource) {
        this.whichSharedResource = whichSharedResource;
    }
    public int getWhichProcessRunning() {
        return whichProcessRunning;
    }
    public void setWhichProcessRunning(int whichProcessRunning) {
        this.whichProcessRunning = whichProcessRunning;
    }


}