import PROJECT.*;
import java.io.*;
 public class mainmenu  extends d
{            public static void acceptm()throws IOException,InterruptedException 
{          try      
   {           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               int choice;String strp;
       System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
     System.out.println("WELCOME TO OUR PROJECT");
     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(" Group member- Akshansh Ohm");
         System.out.println("press 1 for Topic TIME ZONE");
         System.out.println("press 2 for Topic SEISMIC WAVES");
          System.out.println("press 0 to exit");
          System.out.println();
          System.out.println("Enter Your Choice");
        strp=br.readLine();
        choice=Integer.parseInt(strp);
        if (choice>2||choice<0)
        {System.out.println("Wrong Choice Entered ");
            System.out.println();
        System.out.println("RE-Enter Your Choice. please enter 1 or 2 or 0.Options are given again");
         Thread.sleep(2000);
         acceptm();
       
        }

      switch(choice)
{ case 1 :
func();
time ob1=new time();
ob1.we();
break;
case 2 :
func();
seismicwaves ob2=new seismicwaves ();
ob2.acceptz();
break;
case 0 :
    System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;

}
}
catch(Exception e)
{
System.out.println(" wrong format entered");
System.out.println();
System.out.println("RE-Enter Your Choice.press 1 or 2 or 0.Options are given again");
        Thread.sleep(2000);
        acceptm();
       
}
}
}
