package PROJECT;
import java.io.*;
public class time extends timezone
{  public void we()throws IOException,InterruptedException
{try
{ System.out.println(); 
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to Time zone");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
Thread.sleep(1000);
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("|                                           ********* |");
Thread.sleep(1000); 
System.out.println("|                                           *    /  * |");
Thread.sleep(1000);
System.out.println("|press 1 to know What is Time Zone          *9  . 3 * |");
Thread.sleep(1000);
System.out.println("|press 2 to go to Time Zone of 3 Continents *   |   * |");
Thread.sleep(1000);
System.out.println("|press 0 to exit                            *   6   * |");
Thread.sleep(1000);
System.out.println("|                                           ********* |");
Thread.sleep(1000);
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
int choice100;
BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
Thread.sleep(1000);
System.out.println("Enter Your Choice");
choice100=Integer.parseInt(br3.readLine());
if(choice100>2||choice100<0)
{System.out.println("wrong choice was entered");
System.out.println();
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
we();
}
switch(choice100)
{ case 0 :
System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
 case 1 :
 func2();
 time1 ou=new time1();
 ou.ex();
  System.out.println();
  System.out.println("press 1 to go back to main menu");
  System.out.println("press 2 to remain on this page");
  System.out.println();
  System.out.println("Enter Your Choice");
int choice101=Integer.parseInt(br3.readLine());
if(choice101==1)
{func2();
we();}
else if(choice101==2)
{time1 ou1=new time1();
 ou1.ex();
}
else
{System.out.println("Wrong Choice Entered.Ultimately you chose to be on this page");
}

  break;
  case 2 :
  func2();
  wet1();
  break;
}
}
catch(Exception e)
{System.out.println("Wrong Format Entered");
System.out.println();
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
we();
}
}
}


