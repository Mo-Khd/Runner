package Runner;

import java.io.*;
import java.util.Scanner;

public class Score{
	String max;
	String Score;
	char c; char c1; char c3;
	char c2;char m;char m1;
	private Scanner scan;
	  public Score(String Score){
		  this.Score=Score;
		  load(new File("input.txt"));
		  save();
	  }
	  public void load(File file){
		  try
	        {
			  
	            scan = new Scanner(file);
	           
	            String value = scan.nextLine();
	            max=value;
	            
	           //System.out.println(value);
	           // while(scan.hasNext()){
	            //	System.out.println(Score);
	            		
	            		 c=value.charAt(3);
	            		 c1=value.charAt(2); 
	            		 m=value.charAt(0);
	            		
	            	
	            	
	          //  }
	        }
	        catch(IOException i )
	        {
	            System.out.println("Error. "+i);
	        }
	  }
	  public void save()
	    {
	        FileWriter out;
	       
       		 c2=Score.charAt(2);
       		c3=Score.charAt(3);
       		m1=Score.charAt(0);
       		
	        if(((m==m1)&&((c2==c1&&c3>c)||(c2>c1&&c3>c)||c2>c1))||(m1>m)){
	        try
	        {
	        	
	        	out = new FileWriter("input.txt");	
	        	out.write(Score);
	            out.close();
	        }
	        catch(IOException i)
	        {
	            System.out.println("Error: "+i.getMessage());
	        }
	    } 
	    }
}