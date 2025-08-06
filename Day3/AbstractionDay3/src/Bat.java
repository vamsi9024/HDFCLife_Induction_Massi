public class Bat extends Animal {

    Bat(String name) {
        super(name);
    }

    @Override
    void eat() {
//        System.out.println("My Dog is "+getName());
        System.out.println(getName() + " Bat is eating");
    }

    @Override
    void makeNoise() {
        System.out.println(getName() + " Bat is making noise");
    }

    @Override
    void sleep() {
        System.out.println(getName()+" Bat is sleeping");
    }

    @Override
    void roam() {
        System.out.println(getName()+" Bat is roaming");
    }
}
