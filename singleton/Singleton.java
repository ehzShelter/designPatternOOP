public final class Singleton {

    private static Singleton singleInstance = null;

    private Singleton() {}

    // Oracle JDBC API heavily depends on it
    // Only public static method then return instantiated object

    // for example
    //static Connection	getConnection(String url)
    // Attempts to establish a connection to the given database URL.

    public static synchronized Singleton getInstance() {
        // lazy instantiation
        // thread safe
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }

        return singleInstance;

    }

    protected void printMessage(String name) {
        System.out.println("Fuck you..! " + name +" is Singleton");
    }

}
