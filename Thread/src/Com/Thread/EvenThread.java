package Com.Thread;

public class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println(i);
            }
        }
    }
}