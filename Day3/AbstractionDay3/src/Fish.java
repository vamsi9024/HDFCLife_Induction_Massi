public class Fish extends Animal{

    Fish(String name) {
        super(name);
    }

    @Override
    void eat() {
//        System.out.println("My Dog is "+getName());
        System.out.println(getName() + " Fish is eating");
    }

    @Override
    void makeNoise() {
        System.out.println(getName() + " Fish is making noise");
    }

    @Override
    void sleep() {
        System.out.println(getName()+" Fish is sleeping");
    }

    @Override
    void roam() {
        System.out.println(getName()+" Fish is sleeping");
    }
}
