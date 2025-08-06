public abstract class Animal {
    private String name;

    public Animal(){}

    public Animal(String name){
          System.out.println("Animal Parameterized Constructor invoked...");
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    abstract void eat();

    abstract void makeNoise();

    abstract void sleep();

    abstract void roam();
}
