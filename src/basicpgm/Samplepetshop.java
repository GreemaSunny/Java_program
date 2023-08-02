package basicpgm;



import java.util.Scanner;

// Define the Animal interface
interface Animal {
    String getBreed();
    String getColor();
    double getPrice();
}

// Define the Bird interface
interface Bird {
    String getBreed();
    String getColor();
    double getPrice();
    boolean canFly();
}

// Define the PetFood interface
interface PetFood {
    String getName();
    String getType();
    double getPrice();
}

// Define a class to represent a specific breed of dog
class Dog implements Animal {
    private String breed;
    private String color;
    private double price;

    public Dog(String breed, String color, double price) {
        this.breed = breed;
        this.color = color;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

// Define a class to represent a specific breed of parrot
class Parrot implements Bird {
    private String breed;
    private String color;
    private double price;
    private boolean canFly;

    public Parrot(String breed, String color, double price, boolean canFly) {
        this.breed = breed;
        this.color = color;
        this.price = price;
        this.canFly = canFly;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean canFly() {
        return canFly;
    }
}

// Define a class to represent a specific brand of pet food
class PetFoodBrand implements PetFood {
    private String name;
    private String type;
    private double price;

    public PetFoodBrand(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
public class Samplepetshop {
	 public static void main(String[] args) {
	        // Create some example animals and birds
	        Animal[] animals = {
	            new Dog("Labrador Retriever", "Yellow", 500.0),
	            new Dog("Poodle", "White", 750.0),
	            new Dog("German Shepherd", "Black and Tan", 600.0),
	        };
	        Bird[] birds = {
	            new Parrot("African Grey", "Grey", 1000.0, true),
	            new Parrot("Cockatiel", "Yellow and Grey", 200.0, false),
	            new Parrot("Macaw", "Blue and Gold", 1500.0, true),
	        };

	        // Create some example pet foods
	        PetFood[] petFoods = {
	            new PetFoodBrand("Hill's Science Diet", "Dry Dog Food", 50.0),
	            new PetFoodBrand("Royal Canin", "Wet Cat Food", 2.5),
	            new PetFoodBrand("Purina ONE", "Dry Cat Food", 30.0),
	        };

	       

	        // Prompt the user to enter a breed name
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a breed name: ");
	        String breedName = input.nextLine();

	        // Search for the breed in the animal and bird arrays
	        boolean found = false;
	        for (Animal animal : animals) {
	            if (animal.getBreed().equalsIgnoreCase(breedName)) {
	                System.out.println("Breed: " + animal.getBreed());
	                System.out.println("Color: " + animal.getColor());
	                System.out.println("Price: " + animal.getPrice());
	                found = true;
	                break;
	            }
	        }
	        for (Bird bird : birds) {
	            if (bird.getBreed().equalsIgnoreCase(breedName)) {
	                System.out.println("Breed: " + bird.getBreed());
	                System.out.println("Color: " + bird.getColor());
	                System.out.println("Price: " + bird.getPrice());
	                System.out.println("Can fly: " + bird.canFly());
	                found = true;
	                break;
	            }
	        }

	        // If the breed wasn't found, display an error message
	        if (!found) {
	            System.out.println("Breed not found.");
	        }

	        // Display a list of available pet foods
	        System.out.println("Available pet foods:");
	        for (PetFood petFood : petFoods) {
	            System.out.println(petFood.getName() + " (" + petFood.getType() + "): " + petFood.getPrice());
}
}
}