
import java.util.Random;
import java.util.Scanner;
public class rockpapersisscor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Random ra = new Random();
 System.out.println("Its your turn ");
 System.out.println("select your side");
  System.out.println(" 1-> Rock");
  System.out.println("2-> Sisscor");
  System.out.println("3-> paper");
  
    int a = sc.nextInt(3) ;
    switch (a) {
    case 1-> System.out.println("you selected Rock");
    case 2-> System.out.println("you selected Sisscor");
    case 3-> System.out.println("you selected Paper"); } 
   // default -> System.out.println("Play Peacefully");}
    
    System.out.println("Now Computer will Select his side");
    int b = ra.nextInt(3);
    		switch (b) {
    	    case 1-> System.out.println("Computer selected Rock");
    	    case 2-> System.out.println("Computer selected Sisscor");
    	    case 3-> System.out.println("Computer selected Paper"); }
    		
    	if (a==b) {System.out.println("Match draw");}
    	else if (a==1 && b==2) {System.out.println("PLayer win");}
    	else if (a==2 && b==1) {System.out.println("Computer win");}
    	else if (a==3 && b==1) {System.out.println("PLayer win");}
    	else if (a==1 && b==3) {System.out.println("Computer  win");}
    	else if (a==2 && b==3) {System.out.println("PLayer win");}
    	else if (a==3 && b==2) {System.out.println("Computer  win");}
    	
    	}
    	
    	
    	   
    	    
    

	}


