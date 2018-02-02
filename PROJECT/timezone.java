package PROJECT;
import PROJECT.afr.*;
import PROJECT.sa.*;
import PROJECT.aus.*;
import java.io.*;
public class timezone extends loadi
{
public void wet1()throws IOException,InterruptedException
{
try{int choice1;
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to Time zone");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
System.out.println("press 1 for continent Africa");
System.out.println("press 2 for continent South America ");
System.out.println("press 3 for continent Australia");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter Your Choice");
choice1=Integer.parseInt(br1.readLine());
switch(choice1)
{case 0 :
System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
main ez=new main();
func2();
ez.accept2();
break;
case 2 :
main2 ez1=new main2();
func2();
ez1.accept3();
break;
case 3 :
main3 ez2=new main3();
func2();
ez2.accept4();
break;
}
if (choice1>3||choice1<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
wet1();
}}
catch(Exception e)
{System.out.println("Wrong Format Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
wet1();
}
}
}
