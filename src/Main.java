
import java.util.Scanner;

public class Main {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("enter first point coordinates x1,y1 of line 1");
	        int x1=sc.nextInt();
	        int y1=sc.nextInt();
	        
	        System.out.print("enter second point coordinates x2,y2 of line 1");
	        int x2=sc.nextInt();
	        int y2=sc.nextInt();
	        
	        System.out.print("enter first point coordinates x11,y11 of line 2");
	        int x11=sc.nextInt();
	        int y11=sc.nextInt();
	        
	        System.out.print("enter second point coordinates x22,y22 of line 2");
	        int x22=sc.nextInt();
	        int y22=sc.nextInt();
	        
	        double len1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1- y2,2));
	        double len2=Math.sqrt(Math.pow(x11-x22,2)+Math.pow(y11- y22,2));
	        
	        if(len1==len2) {
	        	 System.out.print("Line Equal");
	        }
	        else {
	        	System.out.print("Not Equal");
	        }
	        
	    }
	}
