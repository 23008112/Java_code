public class poly2 {
    public static void main(String[] args) {
        Anil anil = new Anil();
        anil.makeSound();
    }
    
}
//Override

class Animal{
    public void makeSound()
    {
        System.out.println("animal sound");
    }
}

class Anil{
    public void makeSound()
    {
        System.out.println("bow bow/// keeeeeeeee");
    }
}

