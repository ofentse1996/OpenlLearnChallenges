public class FizzBuzzChallenge{

    public static void main(String[] args) {


        System.out.println("\nFizz: ");     
        for (int i=1; i<100; i++) {
            if (i%3==0) 
            System.out.print(i +", ");          
        }           
                
        System.out.println("\n\nBuzz: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");          
        }
                
        System.out.println("\n\nFizzBuzz: ");           
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");            
        }
        System.out.println("\n");
        
    }

}

