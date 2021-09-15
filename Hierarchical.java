class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing");
	}
}

class Hierarchical {
	public static void main(String[] args){
		Dog d = new Dog();
		d.bark();
		d.eat();
		//d.meow(); <--This will print an error
	}
}