// File Name : DisplayMessage.java
// Create a thread to implement Runnable

public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
          }
    }
}