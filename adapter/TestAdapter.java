class TestAdapter {
    public static void main(String... args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("");

        TurkeyAdapter turkeyBird = new TurkeyAdapter(new WildTurkey());
        turkeyBird.quack();
        turkeyBird.fly();
    }
}
