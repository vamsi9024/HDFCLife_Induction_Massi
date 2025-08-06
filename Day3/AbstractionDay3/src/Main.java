//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---Bat Created----");
        Animal bat=new Bat("bat_Animal");
        bat.eat();
        bat.makeNoise();
        bat.sleep();
        bat.roam();
        System.out.println();

        System.out.println("---Cat Created----");
        Animal cat=new Cat("Cat_Animal");
        cat.eat();
        cat.makeNoise();
        cat.sleep();
        cat.roam();
        System.out.println();

        System.out.println("---Dog Created----");
        Animal dog=new Dog("Dog_Animal");
        dog.eat();
        dog.makeNoise();
        dog.sleep();
        dog.roam();
        System.out.println();

        System.out.println("---Parrot Created----");
        Animal parrot=new Parrot("Parrot_Bird");
        parrot.eat();
        parrot.makeNoise();
        parrot.sleep();
        parrot.roam();

        Parrot pa=(Parrot)parrot;
        pa.fly();  //DownCasting
        System.out.println();

        System.out.println("---Ostrich Created----");
        Animal ostrich=new Ostrich("Ostrich_Bird");
        ostrich.eat();
        ostrich.makeNoise();
        ostrich.sleep();
        ostrich.roam();

        Ostrich os=(Ostrich) ostrich;
        os.fly();  //DownCasting
        System.out.println();







    }
}