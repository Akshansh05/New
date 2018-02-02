 import java.util.*;
import java.text.*;
import java.io.*;   

class mainaccess extends validation
{
 public static void hmm()throws IOException,InterruptedException
{      try{   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("\fW");Thread.sleep(100);System.out.print("E");Thread.sleep(100);System.out.print("L");Thread.sleep(100);
    System.out.print("C");Thread.sleep(100);System.out.print("O");Thread.sleep(100);System.out.print("M");Thread.sleep(100);
    System.out.print("E");Thread.sleep(100);System.out.print(" ");Thread.sleep(100);System.out.print(" T");Thread.sleep(100);
    System.out.print("O");Thread.sleep(100);System.out.print(" ");Thread.sleep(100);System.out.print("T");Thread.sleep(100);
    System.out.print("H");Thread.sleep(100);System.out.print("E");Thread.sleep(100);System.out.print("  ");Thread.sleep(100);
    System.out.print("P");Thread.sleep(100);System.out.print("R");Thread.sleep(100);System.out.print("O");Thread.sleep(100);
    System.out.print("J");Thread.sleep(100);System.out.print("E");Thread.sleep(100);System.out.print("C");Thread.sleep(100);
    System.out.print("T");Thread.sleep(100);System.out.print("  ");Thread.sleep(100);System.out.print("O");Thread.sleep(100);
    System.out.print("N");Thread.sleep(100);System.out.print(" ");Thread.sleep(100);System.out.print("S");Thread.sleep(100);
    System.out.print("I");Thread.sleep(100);System.out.print("E");Thread.sleep(100);System.out.print("S");Thread.sleep(100);
    System.out.print("M");Thread.sleep(100);System.out.print("I");Thread.sleep(100);System.out.print("C");Thread.sleep(100);
    System.out.print("  ");Thread.sleep(100);System.out.print("&");Thread.sleep(100);System.out.print(" ");Thread.sleep(100);
    System.out.print("T");Thread.sleep(100);System.out.print("I");Thread.sleep(100);System.out.print("M");Thread.sleep(100);
    System.out.print("E");Thread.sleep(100);System.out.print(" ");Thread.sleep(100);System.out.print("Z");Thread.sleep(100);
    System.out.print("O");Thread.sleep(100);System.out.print("N");Thread.sleep(100);System.out.println("E");Thread.sleep(100);
    
 System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
     System.out.println("WELCOME TO OUR PROJECT");
     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
     Thread.sleep(100);
     System.out.println();
     System.out.println("You are accessing project on : "+Date());
     Thread.sleep(100);
     System.out.println();
     System.out.println("press 1 if you are Administrator");
     System.out.println("press 2 if you are Guest");
     System.out.println("press 0 to exit");
     System.out.println();
     System.out.println("Enter Your Choice");
     String stry=br.readLine();
     int dd=Integer.parseInt(stry);
     switch(dd)
     { case 1 :
         {
            func();            
             hi();
             break;
        }
        case 2 :
        {func();
            acceptm();
            break;
        }
       case 0 :
     {System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
  }
}
        
       
     if(dd>2||dd<0)
     {System.out.println("Wrong choice Entered");
         System.out.println();
         System.out.println("RE enter your choice.The options are given here. Press 1 or 2 or 0");
     Thread.sleep(2000);
     hmm();
         
    }}
    catch(Exception e)
     {System.out.println("Wrong format entered");
         System.out.println();
         System.out.println("RE enter your choice.The options are given here. Press 1 or 2 or 0");
         Thread.sleep(2000);
         hmm();
}
}
 
}