import java.util.Observable;
import java.util.Observer;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource subject = new EventSource();

        // remember Observer is an abstract class
        Observer o1 = new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("First Observer getting response: " + arg);
            }
        };

        Observer o2 = new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Second Observer response too: " + arg);
            }
        };


        subject.addObserver(o2);
        subject.addObserver(o1);


        Thread th = new Thread(subject);
        th.start();
    }
}
