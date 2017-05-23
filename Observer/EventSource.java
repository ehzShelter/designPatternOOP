import java.util.Observable;
import java.util.Scanner;

class EventSource extends Observable implements Runnable {
    public void run() {
        while (true) {
            String response = new Scanner(System.in).nextLine();

            if (response != null && !response.trim().isEmpty()) {
                setChanged();
                notifyObservers(response);
            }
        }
    }
}
