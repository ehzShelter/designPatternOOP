class TestSingleton {
    public static void main(String... args) {
        Singleton foo = Singleton.getInstance();
        Singleton baz = Singleton.getInstance();

        System.out.println(foo);
        foo.printMessage("Abrar");
        System.out.println(baz);
        baz.printMessage("Sohan");
    }
}
