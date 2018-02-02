package PROJECT.aus;
import PROJECT.*;
import java.util.*;
import java.io.*;
public class main3 extends pro
{
public void accept4()throws IOException,InterruptedException
{
try{int choice2;
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to Australia");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
System.out.println("There are 3 time zones in Australia");
System.out.println();
System.out.println("press 1 for Time zone 1");
System.out.println("press 2 for Time zone 2");
System.out.println("press 3 for Time zone 3");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
choice2=Integer.parseInt(br2.readLine());
if(choice2>4||choice2<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
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
System.out.println("\f"+"The Time in Time Zone 1 of Australia is Ahead of 10 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Brisbane");
System.out.println("press 2 for Canberra");
System.out.println("press 3 for Wagga Wagga");
System.out.println("press 4 for Victoria");
System.out.println("press 5 for Tasmania");
System.out.println("press 6 for Great Barrier Reef");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo2=Integer.parseInt(br2.readLine());
if(choo2>6||choo2<0)
{System.out.println("Wrong Choice Entered");
accept4();}
switch(choo2)
{case 0 :
System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
 case 1 :
Brisbane ob1=new Brisbane();
ob1.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor12=Integer.parseInt(br2.readLine());
if(gor12==1)
{time fr=new time();
fr.we();}
else if(gor12==2)
{Brisbane  ob1121=new Brisbane ();
ob1121.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered.Ultimately you chose to be on this page");}
break;
case 2 :
Canberra ob11112=new Canberra();
ob11112.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor13=Integer.parseInt(br2.readLine());
if(gor13==1)
{time fr1=new time();
fr1.we();}
else if(gor13==2)
{Canberra ob11131=new Canberra();
ob11131.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 3 :
WaggaWagga ob2=new WaggaWagga();
ob2.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor113=Integer.parseInt(br2.readLine());
if(gor113==1)
{time fr1=new time();
fr1.we();}
else if(gor113==2)
{WaggaWagga ob1131=new WaggaWagga();
ob1131.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 4 :
Victoria ob3=new Victoria();
ob3.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor14=Integer.parseInt(br2.readLine());
if(gor14==1)
{time fr2=new time();
fr2.we();}
else if(gor14==2)
{Victoria ob1141=new Victoria();
ob1141.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 5 :
Tasmania ob4=new Tasmania ();
ob4.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor15=Integer.parseInt(br2.readLine());
if(gor15==1)
{time fr3=new time();
fr3.we();}
else if(gor15==2)
{Tasmania ob1231=new Tasmania();
ob1231.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 6:
GreatBarrierReef ob13=new GreatBarrierReef ();
ob13.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor151=Integer.parseInt(br2.readLine());
if(gor151==1)
{time fr4=new time();
fr4.we();}
else if(gor151==2)
{GreatBarrierReef ob12331=new GreatBarrierReef();
ob12331.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
}
break;
case 2 :
 loadi obg1=new loadi();
obg1.func2();
System.out.println("\f"+"The Time in Time Zone 2 of Australia is Ahead of 9 Hours 30 Minutes From G.M.T");
System.out.println();
System.out.println("press 1 for Darwin");
System.out.println("press 2 for Alice Springs");
System.out.println("press 3 for Adelaide");
System.out.println("press 4 for Port Augusta");
System.out.println("press 5 for Whyalla");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo3=Integer.parseInt(br2.readLine());
if(choo3>5||choo3<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
switch(choo3) 
{case 0 :
    System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Darwin ob5=new Darwin();
ob5.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor11=Integer.parseInt(br2.readLine());
if(gor11==1)
{time fr5=new time();
fr5.we();}
else if(gor11==2)
{Darwin ob1111=new Darwin();
ob1111.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 2 :
AliceSprings ob6=new AliceSprings ();
ob6.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor10=Integer.parseInt(br2.readLine());
if(gor10==1)
{time fr6=new time();
fr6.we();}
else if(gor10==2)
{AliceSprings  ob1101=new AliceSprings ();
ob1101.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 3 :
Adelaide ob7=new Adelaide();
loadi obg6=new loadi();
ob7.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor9=Integer.parseInt(br2.readLine());
if(gor9==1)
{time fr7=new time();
fr7.we();}
else if(gor9==2)
{Adelaide  ob191=new Adelaide ();
ob191.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 4 :
PortAugusta ob8=new PortAugusta();
ob8.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor8=Integer.parseInt(br2.readLine());
if(gor8==1)
{time fr8=new time();
fr8.we();}
else if(gor8==2)
{PortAugusta ob181=new PortAugusta();
ob181.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 5 :
Whyalla ob9=new Whyalla();
ob9.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor7=Integer.parseInt(br2.readLine());
if(gor7==1)
{time fr9=new time();
fr9.we();}
else if(gor7==2)
{Whyalla ob171=new Whyalla();
ob171.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
}
break;
case 3 :
 loadi obg2=new loadi();
obg2.func2();
System.out.println("\f"+"The Time in Time Zone 3 of Australia is Ahead of 8 Hours From G.M.T");
System.out.println();
System.out.println("press 1 for Perth");
System.out.println("press 2 for Albany");
System.out.println("press 3 for Esperane");
System.out.println("press 4 for Morrent Magnet");
System.out.println("press 0 to exit");
System.out.println();
System.out.println("Enter with your choice number");
int choo4=Integer.parseInt(br2.readLine());
if(choo4>4||choo4<0)
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
switch(choo4) 
{case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
case 1 :
Perth ob10=new Perth();
ob10.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor6=Integer.parseInt(br2.readLine());
if(gor6==1)
{time fr10=new time();
fr10.we();}
else if(gor6==2)
{Perth ob161=new Perth();
ob161.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 2 :
Albany ob11=new Albany();
ob11.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor5=Integer.parseInt(br2.readLine());
if(gor5==1)
{time fr11=new time();
fr11.we();}
else if(gor5==2)
{Albany ob151=new Albany();
ob151.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 3 :
Esperane ob12=new Esperane();
ob12.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor4=Integer.parseInt(br2.readLine());
if(gor4==1)
{time fr12=new time();
fr12.we();}
else if(gor4==2)
{Esperane ob141=new Esperane();
ob141.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
break;
case 4 :
MorrentMagnet ob13=new MorrentMagnet();
ob13.accept0();
System.out.println();
System.out.println("press 1 to go back to main menu");
System.out.println("press 2 to remain on this page and reset your time.");
int gor3=Integer.parseInt(br2.readLine());
if(gor3==1)
{time fr13=new time();
fr13.we();}
else if(gor3==2)
{MorrentMagnet ob131=new MorrentMagnet();
ob131.accept0();
ro();}
else
{System.out.println("Wrong Choice Entered");
System.out.println("Re-Enter your choice correctly");
Thread.sleep(2000);
accept4();}
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
accept4();
}
}
}



