class Animal{
	protected String breed = "Germen";
	public void speak(){
		System.out.println("Bow Bow");
		}
}

class Dogg extends Animal {
	private String ageGroup = "Puppy";
	public static void main(String[] args) {
	Dogg tomy = new Dogg();
	tomy.speak();
	System.out.println(tomy.breed + " " + tomy.ageGroup);
	}
}

	
	



































