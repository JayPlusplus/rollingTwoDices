package rollingTwoDices;

import java.util.Random;

public class RollingTwoDices {

	public static void main(String[] args) {
        int dienum1,dienum2;
        Random rnd = new Random();
        Random rnd2 = new Random();
        
        while (true) {
        	dienum1 = rnd.nextInt(6) + 1;
        	dienum2 = rnd2.nextInt(6) + 1;
        	System.out.println("User rolls " + dienum1 + " & " + dienum2);
        	if (dienum1 == dienum2) {
            	dienum1 = rnd.nextInt(6) + 1;
            	dienum2 = rnd2.nextInt(6) + 1;
            	System.out.println("Move " + (dienum1 + dienum2) + " Spaces and roll again getting...");
        	}
        	else {
        		break;
        	}
        }
        
        
        System.out.println("Move " + (dienum1 + dienum1) + " Spaces and stop");
    }

}
