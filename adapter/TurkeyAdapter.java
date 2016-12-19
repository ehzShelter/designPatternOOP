// Duck is company's old vendor
// ADAPTER will make it adaptive the new one with the old one
// Turkey is company's new vendor


// first, you need to implement the interface of the type
// you are adapting to
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    // next we need to get a reference to the object we are adapting
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    // finally implement the interface of Duck but You are
    // adapting the new things from old one :P :P
    public void quack() {
        turkey.gobble();
    }

    // Turkey also fly but they fly to longer distance than Duck
    // That's the reason behind the loop
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
