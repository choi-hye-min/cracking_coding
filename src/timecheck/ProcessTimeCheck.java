package timecheck;

public class ProcessTimeCheck {
    private long startTime;

    public ProcessTimeCheck() {
        this.startTime = System.currentTimeMillis();
    }

    public void processReport(){
        long time = System.currentTimeMillis() - this.startTime;
        System.out.println("ProcessTime :  "+(time));
    }
}
