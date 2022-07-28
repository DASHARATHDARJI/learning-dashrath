package Thisandsuper;

	class TestAnimal extends Dog  {  
	    
		TestAnimal()  
	    {  
	        // calling base class constructor  
	        super();        // here we are calling our super for getting information
	        System.out.println("The eyes of the Dog is blue.");  // to print the dog blue
	    }  
	    // main() method start  
	    public static void main(String[] args)  
	    {  
	        // call default constructor of the TestAnimal
	        new TestAnimal();  
	        System.out.println();  
}
	}
