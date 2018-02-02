package PROJECT;
import java.io.*;
 abstract class quiz extends load implements fun 
{ public void accept22()throws Exception
 { int ma;
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   System.out.println("\f"+"WELCOME TO QUIZ.LET'S TEST YOUR MENTAL LEVEL");
 System.out.println();
     System.out.println("press 1 to go back to main menu");
    System.out.println("press 2 to remain on this page");
    System.out.println();
    }
     public void acceptquiz1()throws Exception
 { int h=0;
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   try { 
    System.out.println("\f"+" Are you Ready ????");
    System.out.println(); 
    System.out.println("Q1: The point within the Earth where seismic waves originate is:?");
    Thread.sleep(1000);
    System.out.println();
    System.out.println("1) the epicenter.                2)the fault scarp.");
    Thread.sleep(1000);
    System.out.println("3) the origin.                   4)the focus.");
    int d;
    System.out.println();
     System.out.println("Enter your choice");
     String f=br.readLine();
     d=Integer.parseInt(f);
    if(d==4)
{System.out.println("correct answer");
Thread.sleep(2000);
 h++;}
else if(d<4)
{System.out.println("wrong answer");
System.out.println("correct answer is"+" 4"); 
Thread.sleep(2000);
}
else if(d>4||d==0)
{System.out.println("Wrong answer");
System.out.println("correct answer is"+" 4");
Thread.sleep(2000);
}}
catch(Exception e)
{System.out.println("wrong format entered");
Thread.sleep(2000);
}

    try{ System.out.println(); 
    System.out.println("\f"+"Q2: P-waves are: ?");
    Thread.sleep(1000);
    System.out.println();
    System.out.println("1)transverse surface waves.  2)compressional body waves.");
    Thread.sleep(1000);
    System.out.println("3)tensional surface waves.   4)shearing body waves.");
     int m;
    System.out.println();
     System.out.println("Enter your choice");
     String mo=br.readLine();
     m=Integer.parseInt(mo);
    if(m==2)
{System.out.println("correct answer");
Thread.sleep(2000);
 h++;}
else if(m<2||m>2||m==0)
{System.out.println("wrong answer");
System.out.println("correct answer is"+" 2");
Thread.sleep(2000); 
}}
catch(Exception e)
{System.out.println("wrong format entered");
Thread.sleep(2000);
}
    try{ System.out.println();
    System.out.println("\f"+"Q3: The Richter Scale is used to determine: ?");
    Thread.sleep(1000);
    System.out.println();
    System.out.println("1)intensity of earthquakes.  2)the magnitude of earthquakes."); 
    Thread.sleep(1000);
    System.out.println("3)the damage from earthquakes.   4)the number of casualties in an earthquake.");
  int mm;
    System.out.println();
     System.out.println("Enter your choice");
     String mob=br.readLine();
     mm=Integer.parseInt(mob);
    if(mm==2)
{System.out.println("correct answer");
Thread.sleep(2000);
h++;}
else if(mm<2||mm>2||mm==0)
{System.out.println("wrong answer");
System.out.println("correct answer is"+" 2");
Thread.sleep(2000); 
} }
catch(Exception e)
{System.out.println("wrong format entered");
Thread.sleep(2000);
}
try{ 
System.out.println();
    System.out.println("\f"+"Q4:The fastest seismic waves are: ?"); 
    Thread.sleep(1000);
    System.out.println();
    System.out.println("1)P-waves                 2)S-waves");   
    Thread.sleep(1000);
    System.out.println("3)Love Waves              4)Rayleigh Waves");
    
int mmm;
    System.out.println();
     System.out.println("Enter your choice");
     String mobi=br.readLine();
     mmm=Integer.parseInt(mobi);
    if(mmm==1)
{System.out.println("correct answer");
Thread.sleep(2000);
h++;}
else if(mmm<1||mmm>1||mmm==0)
{System.out.println("wrong answer");
System.out.println("correct answer is"+" 1");
Thread.sleep(2000);
}}
catch(Exception e)
{System.out.println("wrong format entered");
Thread.sleep(2000);
}
  try{  System.out.println();
    System.out.println("\f"+"Q5:A seismic gap is: ?");
    Thread.sleep(1000);
    System.out.println();
    System.out.println("1)the time between large earthquakes. "); 
    Thread.sleep(1000);
    System.out.println("2)the center of a tectonic plate where earthquakes rarely occur.");
    Thread.sleep(1000);
    System.out.println("3)a segment of an active fault where earthquakes have not occurred for a long time ");  
    Thread.sleep(1000);
    System.out.println("4)a large chasm opened by an earthquake.");

 int mmmm;
    System.out.println();
    System.out.println("Enter your choice");
    String mobil=br.readLine();
     mmmm=Integer.parseInt(mobil);
    if(mmmm==3)
{System.out.println("correct answer");
Thread.sleep(1000);
h++;}
else if(mmmm<3||mmmm>3||mmmm==0)
{System.out.println("wrong answer");
System.out.println("correct answer is"+" 3");
Thread.sleep(2000);
} }
catch(Exception e)
{System.out.println("wrong format entered");
Thread.sleep(2000);
}
try{System.out.println();
System.out.println("Wait for your RESULT. Calculating...");
Thread.sleep(2000);
func1();
System.out.println();
System.out.println("\f"+"Your marks is "+h+" out of 5");
System.out.println();
Thread.sleep(2000);
if(h<=2)
{ System.out.println("your mental level is low");
}
 if(h==3)
{ System.out.println("your mental level is medium");
}
  
 if(h>3&&h!=5)
{ System.out.println("your mental level is good");
}        
if(h==5)
{ System.out.println("your mental level is high");
}
System.out.println();
Thread.sleep(2000);
System.out.println("\f"+"Thank's for playing Quiz game");
System.out.println();
Thread.sleep(2000);
System.out.println("\f"+"Thank's for selecting Topic SEISMIC WAVES");
System.out.println();
Thread.sleep(2000);
System.out.println("\f"+"THE END");
} 
catch(Exception e)
{
}      
}

}

