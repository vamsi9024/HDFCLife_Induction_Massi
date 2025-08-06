public class Ostrich extends Bird{

    Ostrich(String name){
        super(name);
    }

    @Override
    void fly() {
        System.out.println(getName()+" Ostrich is flying");
    }

    @Override
    void eat() {
//        System.out.println("My Dog is "+getName());
        System.out.println(getName() + " Ostrich is eating");
    }

    @Override
    void makeNoise() {
        System.out.println(getName() + " Ostrich is making noise");
    }

    @Override
    void sleep() {
        System.out.println(getName()+" Ostrich is sleeping");
    }

//    @Override
//    void roam() {
//        System.out.println(getName()+" Parrot is sleeping");
//    }
}
