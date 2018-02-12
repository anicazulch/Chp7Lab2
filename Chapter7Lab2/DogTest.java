// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        
        Labrador lab = new Labrador("Lily", "yellow");
        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(lab.getName() + "'s average weight is " + lab.avgBreedWeight());
        
        Yorkshire york = new Yorkshire("Yvonne");
        System.out.println(york.getName() + " says " + york.speak());
        System.out.println(york.getName() + "'s average weight is " + york.avgBreedWeight());
    }
}
