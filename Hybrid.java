class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        Animal a = new Animal();
        a.eat();
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        Animal a = new Animal();
        a.eat();
        System.out.println("Meowing");
    }
}

class Hybrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}