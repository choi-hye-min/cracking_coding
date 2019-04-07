package timecheck;

public class ProcessTimeCheck {
    private long startTime;

    public ProcessTimeCheck() {
        this.startTime = System.nanoTime();
    }

    public void processReport() {
        float time = (System.nanoTime() - this.startTime)/1000000f;
        System.out.println("ProcessTime :  "+(time)+" sec");
    }
}
