package PROJECT.sa;
import PROJECT.*;
import java.util.*;
import java.io.*;
public class main2 extends pro
{
public void accept3()throws IOException,InterruptedException
{
try{int choice2;
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to South America");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
System.out.println("There are 3 time zones in South America");
System.out.println();
System.out.println("press 1 for Time zone 1");
System.out.println("press 2 for Time zone 2");
System.out.println("press 3 for Time zone 3");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
choice2=Integer.parseInt(br2.readLine());
if(choice2>3||choice2<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
else{
switch(choice2)
 {case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
     case 1 :
     loadi obg=new loadi();
obg.func2();
System.out.println("\f"+"The Time in Time Zone 1 of South America is Back by 3 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Uruguay");
System.out.println("press 2 for Argentina");
System.out.println("press 3 for Eastern Brazil");
System.out.println("press 4 for Chile");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo2=Integer.parseInt(br2.readLine());
if(choo2>4||choo2<0)
{System.out.println("Wrong Choice Entered");
System.out.println("RE-Enter all data correctly");
accept3();}
switch(choo2)
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
 case 1 :
Uruguay ob1=new Uruguay();
ob1.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor12=Integer.parseInt(br2.readLine());
if(gor12==1)
{time fr=new time();
fr.we();}
else if(gor12==2)
{Uruguay  ob1121=new Uruguay  ();
ob1121.accept0();
ro();

  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 2 :
Argentina ob2=new Argentina();
ob2.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor13=Integer.parseInt(br2.readLine());
if(gor13==1)
{time fr1=new time();
fr1.we();}
else if(gor13==2)
{Argentina ob1131=new Argentina();
ob1131.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 3 :
EasternBrazil ob3=new EasternBrazil();
ob3.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor14=Integer.parseInt(br2.readLine());
if(gor14==1)
{accept3();}
else if(gor14==2)
{EasternBrazil ob1141=new EasternBrazil();
ob1141.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 4 :
Chile ob4=new Chile ();
ob4.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor15=Integer.parseInt(br2.readLine());
if(gor15==1)
{time fr2=new time();
fr2.we();}
else if(gor15==2)
{Chile ob1231=new Chile();
ob1231.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
}
break;
case 2 :
 loadi obg1=new loadi();
obg1.func2();
System.out.println("\f"+"The Time in Time Zone 2 of South America is Ahead of 2 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Venezuela");
System.out.println("press 2 for Paraguay");
System.out.println("press 3 for Bolivia");
System.out.println("press 4 for Amazon Basin");
System.out.println("press 5 for Most parts of Brazil");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo3=Integer.parseInt(br2.readLine());
if(choo3>5||choo3<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
switch(choo3) 
{case 0 :
    System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Venezuela ob5=new Venezuela();
ob5.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor11=Integer.parseInt(br2.readLine());
if(gor11==1)
{time fr2=new time();
fr2.we();}
else if(gor11==2)
{Venezuela ob1111=new Venezuela();
ob1111.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 2 :
Paraguay ob6=new Paraguay();
ob6.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor10=Integer.parseInt(br2.readLine());
if(gor10==1)
{time fr133=new time();
fr133.we();}
else if(gor10==2)
{Paraguay ob1101=new Paraguay();
ob1101.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 3 :
Bolivia ob7=new Bolivia();
loadi obg6=new loadi();
ob7.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor9=Integer.parseInt(br2.readLine());
if(gor9==1)
{time fr4=new time();
fr4.we();}
else if(gor9==2)
{Bolivia ob191=new Bolivia();
ob191.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 4 :
AmazonBasin ob8=new AmazonBasin();
ob8.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor8=Integer.parseInt(br2.readLine());
if(gor8==1)
{time fr5=new time();
fr5.we();}
else if(gor8==2)
{AmazonBasin ob181=new AmazonBasin();
ob181.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 5 :
MostpartsofBrazil ob9=new MostpartsofBrazil();
ob9.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor7=Integer.parseInt(br2.readLine());
if(gor7==1)
{time fr8=new time();
fr8.we();}
else if(gor7==2)
{MostpartsofBrazil ob171=new MostpartsofBrazil();
ob171.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
}
break;
case 3 :
 loadi obg2=new loadi();
obg2.func2();
System.out.println("\f"+"The Time in Time Zone 3 of South America is Ahead of 1 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Peru");
System.out.println("press 2 for Colombia");
System.out.println("press 3 for Elvador");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo4=Integer.parseInt(br2.readLine());
if(choo4>3||choo4<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
switch(choo4) 
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Peru ob10=new Peru();
ob10.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor6=Integer.parseInt(br2.readLine());
if(gor6==1)
{time fr122=new time();
fr122.we();}
else if(gor6==2)
{Peru ob161=new Peru();
ob161.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 2 :
Colombia ob11=new Colombia();
ob11.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor5=Integer.parseInt(br2.readLine());
if(gor5==1)
{time fr123=new time();
fr123.we();}
else if(gor5==2)
{Colombia ob151=new Colombia();
ob151.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
case 3 :
Elvador ob12=new Elvador();
ob12.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor4=Integer.parseInt(br2.readLine());
if(gor4==1)
{time fr124=new time();
fr124.we();}
else if(gor4==2)
{Elvador ob141=new Elvador();
ob141.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();}
break;
}
break;
}
}
}
catch(Exception e)
{System.out.println("Wrong Format Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept3();
}
}
}



