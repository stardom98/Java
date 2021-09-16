class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        //d.meow(); <--This will print an error
    }
}