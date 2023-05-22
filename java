import java.util.Random;
import java.util.Scanner;

public class Game {
    
    public qtatic void main(String[] args) {
        
        Random r = new Random();
        int essai = 0;
        int justprix = r.nextInt(200)
        int prix = 0;
        
        while(justprix != prix){
        
            System.out.println("Entrez un numér entre 0 et 200");
            Scanner scan = new Scanner(system.in);
            
            if(justprix > prix){
                System.out.println("C'est plus !");
            } else{
                System.out.println("C'est moins");
            }
            prix = scan.nextInt();
            
        }
        System.out.print("Bravo ! le justprix est : "+ justprix);
        System.out.println("En "+essai + "essais");
        
        
    }
}
