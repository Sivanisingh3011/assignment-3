class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }

    void sound(String type) {
        System.out.println("Dogs " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Calls the sound method of Animal class

        Dog dog = new Dog();
        dog.sound(); // Calls the overridden sound method in Dog class
        dog.sound("howl"); // Calls the overloaded sound method in Dog class
    }
}
