public class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
//        System.out.println("My Dog is "+getName());
        System.out.println(getName() + " Cat is eating");
    }

    @Override
    void makeNoise() {
        System.out.println(getName() + " Cat is making noise");
    }

    @Override
    void sleep() {
        System.out.println(getName()+" Cat is sleeping");
    }

    @Override
    void roam() {
        System.out.println(getName()+" Cat is roaming");
    }
}
