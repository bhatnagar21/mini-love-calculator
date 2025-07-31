//love calculator with me 
import java.util.Scanner;
import java.util.Random;
   
    public class LoveCalculator{

      public static void main(String[]args){
              Scanner scanner = new Scanner(System.in);
               Random random = new Random();
      System.out.println("WELCOME TO THE MAGICAL LOVE CALCUALTOR AREA");
        
      System.out.print("ENTER YOUR NAME : ");
     String yourName = scanner.nextLine();
          
        System.out.print("ENTER YOUR CRUSH NAME : ");
        String crushName = scanner.nextLine();
   
        int loveScore = 50 + random.nextInt(51);

        System.out.println("Calculating love compatability between "+ yourName + "and " + crushName);
          try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // do nothing
        }


        System.out.println("LOVE SCORE : "+ loveScore + "%");

         if (loveScore > 86){
             System.out.println("GUYS !!! YOU ARE PERFET MATCH !! DESTINY WANTS UH TOGETHER");
       }else if (loveScore > 60){
             System.out.println("YOU BOTH HAVE GREAT CHEMISTRY !! JUST A LITTELE EFFORT NEEDED ");
       }else if(loveScore >40){
             System.out.println("UMMM...SOME MORE EFFORTS NEED , BUT LOVE FFINDS A WAY BAB !!");
       }else{
            System.out.println("NOT GREAT , NOT A MATCH, BUT BUT DONT LOSSE YOUR HOPES, WHO KNOWS? MIRACLES ALWASY HAPPENS");
    }
        System.out.println("THANKYOU FOR MAKING INTREST IN THIS");
         System.out.println("DONT FORGET TO LIKE COMMENT AND SUBSCRIBE");
      scanner.close();
   }
}
