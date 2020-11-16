public class Dog extends Pet {
    // Instance variable(s)
    public String breed;
    public String name;
    public int age;
    // Constructors
    public Dog(String name, int age, String breed) {
        super(name,age);
        this.breed = breed;
    }
    public Dog() {
        super();
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof!");
    }

    // toString method
    public String toString() {
        String str = "Name: " + this.name + ", Age: " + this.age + ", Breed: " + this.breed;
        return str;
    }
    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String newb) {
        this.breed = newb;
    }
}