import java.util.Scanner ;


public class Main {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner ( System.in) ;
        System.out.println (" Gib dein Gewicht ein : ") ;
        int Gewicht = newScanner.nextInt() ;
        System.out.println (" Gib deine Höhe ein : ");
        int Höhe = newScanner.nextInt();
        System.out.println ("Dein Body-Mass index :" + Gewicht/Höhe*Höhe);
    }
}