package abstract_java;

public abstract class Animal {
	     String name;
	     int age;
	    
	     public abstract void makeSound();
	}

	 class Dog extends Animal {
	    public Dog() {
	        super();
	    }

	    public void makeSound() {
	        System.out.println("bark");
	    }
	}

	 class Cat extends Animal {
	    public Cat() {
	        super();
	    }

	    public void makeSound() {
	        System.out.println("Meow");
	    }
	}

   class abstract_keyword {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        Cat c = new Cat(); 
	        
	        d.makeSound();
	        c.makeSound();
	    }
	}



  
  
  
  
  
  
  
  
