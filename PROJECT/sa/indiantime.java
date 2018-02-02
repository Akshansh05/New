package PROJECT.sa;
import java.io.*;
import PROJECT.*;
 class indiantime extends d
{
int hou;int f;
int min;String S[]=new String[7];String day1;String day2;
public void accept()throws Exception
{try{System.out.println();
System.out.println("\f"+"Current Date & Time at India : "+Date());
System.out.println();
  System.out.println("First Enter time & date of INDIA. According to your choice");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("press 1 for Setting time according to 12 hour clock");
System.out.println("press 2 for Setting time according to 24 hour clock");
System.out.println("press 0to exit");
System.out.println();
System.out.println("Enter Your Choice");
int toi;
toi=Integer.parseInt(br.readLine());
if (toi>2||toi<0)
{System.out.println("Wrong Choice entered ");
System.out.println();
System.out.println("RE enter all data correctly ");
Thread.sleep(2000);
accept();
}
switch(toi)
 {case 0 :
    System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
     case 1 :
int hour;
int minute;String a="a.m";String b="p.m";
System.out.println("enter hour according to 12 hour clock ");
hour=Integer.parseInt(br.readLine());
if(hour>12||hour<0)
{System.out.println("Wrong time entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
else{System.out.println();
System.out.println("enter minute");
minute=Integer.parseInt(br.readLine());
if(minute>59||minute<0)
{System.out.println("Wrong time entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
else{System.out.println();
System.out.println("press 1 if it is A.M ");
System.out.println("press 2 if it is  P.M ");
System.out.println();
System.out.println("enter your choice ");
int choi=Integer.parseInt(br.readLine());
if (choi>2||choi<=0)
{System.out.println("Wrong Choice entered ");
System.out.println();
System.out.println("RE enter all data correctly ");
Thread.sleep(2000);
accept();
}
switch(choi)
{case 1 :
if(hour==12)
{hou=hour-12;
}
else
{hou=hour;
}
break;
case 2 :
if(hour!=12)
{hou=hour+12;
}
if(hour==12)
{hou=hour;
}
break;
}
System.out.println();
System.out.println("enter day ");
day1=br.readLine();
String h[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
if(day1.equalsIgnoreCase(h[0])==false&&day1.equalsIgnoreCase(h[1])==false&&day1.equalsIgnoreCase(h[2])==false&&day1.equalsIgnoreCase(h[3])==false&&day1.equalsIgnoreCase(h[4])==false&&day1.equalsIgnoreCase(h[5])==false&&day1.equalsIgnoreCase(h[6])==false )
{System.out.println("Wrong day entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
else
{for(f=0;f<h.length;f++)
{if(day1.equalsIgnoreCase(h[f])==true)
{ S[0]=h[f]; 
    }
}

min=minute;
System.out.println();

System.out.println("you have set "+hou+" hrs "+min+" mins");
System.out.println();
System.out.println("you have set date as "+S[0]);
Thread.sleep(2000);
}}}
break;
case 2 :
int hour1;
int minute1;
System.out.println("enter hour according to 24 hour clock ");
hour1=Integer.parseInt(br.readLine());
if(hour1>=24||hour1<0)
{System.out.println("Wrong time entered ");
System.out.println();
System.out.println("RE enter all data correctly");
accept();
}
else{System.out.println();
System.out.println("enter minute");
minute1=Integer.parseInt(br.readLine());
if(minute1>59||minute1<0)
{System.out.println("Wrong time entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
else
{System.out.println();
System.out.println("enter day ");
day2=br.readLine();
String G[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
if(day2.equalsIgnoreCase(G[0])==false&&day2.equalsIgnoreCase(G[1])==false&&day2.equalsIgnoreCase(G[2])==false&&day2.equalsIgnoreCase(G[3])==false&&day2.equalsIgnoreCase(G[4])==false&&day2.equalsIgnoreCase(G[5])==false&&day2.equalsIgnoreCase(G[6])==false )
{System.out.println("Wrong day entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
else
{for(f=0;f<G.length;f++)
{if(day2.equalsIgnoreCase(G[f])==true)
{S[0]=G[f]; 
    }
}
hou=hour1;
min=minute1;
System.out.println();
System.out.println("you have set "+hour1+" hrs "+min+" mins");
System.out.println();
System.out.println("you have set date as "+S[0]);
Thread.sleep(2000);
break;
}
}
}
}

}
catch(Exception e)
{System.out.println("Wrong Format entered ");
System.out.println();
System.out.println("RE enter all data correctly");
Thread.sleep(2000);
accept();
}
}
}

