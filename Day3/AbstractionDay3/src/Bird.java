public abstract class Bird extends Animal{

    Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    void roam() {
        System.out.println(getName()+" Bird is roaming");
    }

}
