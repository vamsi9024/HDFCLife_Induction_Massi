public class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
//        System.out.println("My Dog is "+getName());
        System.out.println(getName() + " Dog is eating");
    }

    @Override
    void makeNoise() {
        System.out.println(getName() + " Dog is making noise");
    }

    @Override
    void sleep() {
        System.out.println(getName()+" Dog is sleeping");
    }

    @Override
    void roam() {
        System.out.println(getName()+" Dog is sleeping");
    }
}
