package PROJECT.afr;
import PROJECT.*;
import java.util.*;
import java.io.*;
public class main extends pro 
{
public void accept2()throws IOException,InterruptedException
{
try{int choice2;
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to Africa");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
System.out.println("There are 4 time zones in africa");
System.out.println();
System.out.println("press 1 for Time zone 1");
System.out.println("press 2 for Time zone 2");
System.out.println("press 3 for Time zone 3");
System.out.println("press 4 for Time zone 4");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
choice2=Integer.parseInt(br2.readLine());
if(choice2>4||choice2<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();
}
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
System.out.println("\f"+"The Time in Time Zone 1 of Africa is Ahead of 3 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Madagascar");
System.out.println("press 2 for Ethiopia");
System.out.println("press 3 for Sudan");
System.out.println("press 4 for Tanzenia");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo2=Integer.parseInt(br2.readLine());
if(choo2>4||choo2<0)
{System.out.println("Wrong Choice Entered");
accept2();
}
switch(choo2)
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
 case 1 :
mada ob1=new mada();
ob1.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor12=Integer.parseInt(br2.readLine());
if(gor12==1)
{time fr=new time();
fr.we();}
else if(gor12==2)
{mada  ob1121=new mada ();
ob1121.accept0();
 ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 2 :
Ethopia ob2=new Ethopia();
ob2.accept3();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor13=Integer.parseInt(br2.readLine());
if(gor13==1)
{time fr1=new time();
fr1.we();}
else if(gor13==2)
{Ethopia ob1131=new Ethopia();
ob1131.accept3();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 3 :
Sudan ob3=new Sudan();
ob3.accept4();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor14=Integer.parseInt(br2.readLine());
if(gor14==1)
{time fr2=new time();
fr2.we();}
else if(gor14==2)
{Sudan ob1141=new Sudan();
ob1141.accept4();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 4 :
Tanzenia ob4=new Tanzenia ();
ob4.accept5();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor15=Integer.parseInt(br2.readLine());
if(gor15==1)
{time fr3=new time();
fr3.we();;}
else if(gor15==2)
{Tanzenia ob1231=new Tanzenia();
ob1231.accept5();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
}
break;
case 2 :
 loadi obg1=new loadi();
obg1.func2();
System.out.println("\f"+"The Time in Time Zone 2 of Africa is Ahead of 2 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Egypt");
System.out.println("press 2 for Libiya");
System.out.println("press 3 for South Africa");
System.out.println("press 4 for Zimbawae");
System.out.println("press 5 for Zambia");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo3=Integer.parseInt(br2.readLine());
if(choo3>5||choo3<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
switch(choo3) 
{case(0):
System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Egypt ob5=new Egypt();
ob5.accept6();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor11=Integer.parseInt(br2.readLine());
if(gor11==1)
{time fr4=new time();
fr4.we();}
else if(gor11==2)
{Egypt ob1111=new Egypt();
ob1111.accept6();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 2 :
Libya ob6=new Libya();
ob6.accept7();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor10=Integer.parseInt(br2.readLine());
if(gor10==1)
{time fr5=new time();
fr5.we();}
else if(gor10==2)
{Libya ob1101=new Libya();
ob1101.accept7();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 3 :
SouthAfrica ob7=new SouthAfrica();
loadi obg6=new loadi();
ob7.accept8();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor9=Integer.parseInt(br2.readLine());
if(gor9==1)
{time fr6=new time();
fr6.we();}
else if(gor9==2)
{SouthAfrica ob191=new SouthAfrica();
ob191.accept8();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 4 :
Zimbawae ob8=new Zimbawae();
ob8.accept9();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor8=Integer.parseInt(br2.readLine());
if(gor8==1)
{time fr7=new time();
fr7.we();}
else if(gor8==2)
{Zimbawae ob181=new Zimbawae();
ob181.accept9();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 5 :
Zambia ob9=new Zambia();
ob9.accept10();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor7=Integer.parseInt(br2.readLine());
if(gor7==1)
{time fr9=new time();
fr9.we();}
else if(gor7==2)
{Zambia ob171=new Zambia();
ob171.accept10();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
}
break;
case 3 :
 loadi obg2=new loadi();
obg2.func2();
System.out.println("\f"+"The Time in Time Zone 3 of Africa is Ahead of 1 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Algeria");
System.out.println("press 2 for Niger");
System.out.println("press 3 for Chad");
System.out.println("press 4 for Angola");
System.out.println("press 5 for Namibia");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo4=Integer.parseInt(br2.readLine());
if(choo4>5||choo4<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
switch(choo4) 
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Algeria ob10=new Algeria();
ob10.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor6=Integer.parseInt(br2.readLine());
if(gor6==1)
{time fr10=new time();
fr10.we();}
else if(gor6==2)
{Algeria ob161=new Algeria();
ob161.accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 2 :
Niger ob11=new Niger();
ob11.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor5=Integer.parseInt(br2.readLine());
if(gor5==1)
{time fr11=new time();
fr11.we();}
else if(gor5==2)
{Niger ob151=new Niger();
ob151.accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 3 :
Chad ob12=new Chad();
ob12.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor4=Integer.parseInt(br2.readLine());
if(gor4==1)
{time fr12=new time();
fr12.we();}
else if(gor4==2)
{Chad ob141=new Chad();
ob141.accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 4 :
Angola ob13=new Angola();
ob13.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor3=Integer.parseInt(br2.readLine());
if(gor3==1)
{time fr13=new time();
fr13.we();}
else if(gor3==2)
{Angola ob131=new Angola();
ob131.accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 5 :
Namibia ob144=new Namibia();
ob144.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor2=Integer.parseInt(br2.readLine());
if(gor2==1)
{time fr14=new time();
fr14.we();}
else if(gor2==2)
{Namibia ob145=new Namibia();
ob145.accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
}
break;
case 4 :
 loadi obg3=new loadi();
obg3.func2();
System.out.println("\f"+"The Time in Time Zone 4 of Africa is Having same tie as G.M.T");
System.out.println();
System.out.println("press 1 for Guinea");
System.out.println("press 2 for Liberia");
System.out.println("press 0 to exit");
System.out.println("Enter with your choice number");
int choo5=Integer.parseInt(br2.readLine());
if(choo5>2||choo5<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
switch(choo5) 
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Guinea ob11=new Guinea();
ob11.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor=Integer.parseInt(br2.readLine());
if(gor==1)
{time fr15=new time();
fr15.we();}
else if(gor==2)
{Guinea ob111=new Guinea();
ob111.accept11();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
break;
case 2 :
Liberia ob12=new Liberia();
ob12.accept11();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor1=Integer.parseInt(br2.readLine());
if(gor1==1)
{accept2();}
else if(gor1==2)
{Liberia ob121=new Liberia();
ob121.accept11();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept2();}
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
accept2();
}
}
}



