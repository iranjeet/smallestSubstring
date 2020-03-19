package trial;
import java.util.*;
import java.awt.*;
public class StringLength {
  
	    public static void main(String[] args) 
	    { 
	    	System.out.println("checkGit status");
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the String To get longest number");
	        String str = sc.next();
	        int n = str.length(); 
	        int k = 1,max=1,p; 
	         int arr[] = new int[10*n]; 
	          arr[str.charAt(0)] = 0; 
	  	        for (int i = 1; i < n; i++) { 
	            p = arr[str.charAt(i)]; 
	            if (p == -1 || i - k > p) 
	               k++; 
	  
	            else { 
	                if (k > max) 
	                    max= k; 
	  
	                k = i - p; 
	            } 
	            arr[str.charAt(i)] = i; 
	        } 
	  
	        if (k > max) 
	            max = k; 
	               
	        System.out.println(max); 
	   
	    } 
	} 

