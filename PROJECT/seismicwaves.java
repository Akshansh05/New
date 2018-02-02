package PROJECT;
import java.util.*;
import java.io.*;
 public class seismicwaves extends def implements fun
{  public void acceptz()throws IOException,InterruptedException
{  try{   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int ch;
System.out.println();
System.out.println("\f"+"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("Welcome to Seismic Waves");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println();
Thread.sleep(1000);
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("|                                                                  *    *    *  |");
Thread.sleep(1000);
System.out.println("|                                                                    *  *  *    |"); 
Thread.sleep(1000);
System.out.println("|                                                                      *        |");
System.out.println("| Press 1 to know WHAT IS SEISMIC WAVE ?                              * *       |");
Thread.sleep(1000);
System.out.println("|Press 2 to know WHAT ARE THE TYPES OF SEISMIC WAVES ?               * * *      |"); 
Thread.sleep(1000);
System.out.println("|Press 3 to know WHERE DO SEISMIC WAVES ARE FORMED ?                * * * *     | " );
Thread.sleep(1000);
System.out.println("|Press 4 to know CAUSES OF EARHKQUAKE ?                            * * * * *    |");
Thread.sleep(1000);
System.out.println("|Press 5 to know HOW THEY ARE STUDIED ?                           * * * * * *   |");
Thread.sleep(1000);
System.out.println("|Press 6 to know HOW THEIR MAGNITUDE IS MEASURED ?               * * * * * * *  | ");
Thread.sleep(1000);
System.out.println("|Press 8 to know AFTERMATH OF EARHTQUAKE ?                                      | ");
Thread.sleep(1000);
System.out.println("|Press 9 to play QUIZ ?                                                         | ");
Thread.sleep(1000);
System.out.println("|Press 0 to exit ?                                                              | ");
Thread.sleep(1000);
System.out.println();
Thread.sleep(1000);
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
Thread.sleep(1000);
System.out.println("Enter your choice");
String str=br.readLine();
ch=Integer.parseInt(str);
if(ch>9||ch<0)
{
System.out.println("wrong choice was entered");
System.out.println();
System.out.println("RE_Enter Your choice. The Option is between 0 to 8.Please enter correctly");
Thread.sleep(2000);
acceptz();
}
switch(ch)
 { case 0 :
     System.out.println("Thanks For Seeing our Project");
     Thread.sleep(1000);
     System.exit(0);
   System.out.println("INVALID INPUT");
 break;
  
     case 1 :
     func1();
     accepta();
     acceptbbm();
     System.out.println("Enter your choice");
String strmm=br.readLine();
int ss;
ss=Integer.parseInt(strmm);
if(ss==1)
{func1();
acceptz();
}
else if(ss==2)
{ accepta(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
break;
 case 2 :
     
 func1();
 acceptb();//body
 accept146();//press1
  System.out.println();
         System.out.println("Enter your choice");
String strmkm=br.readLine();
int ssk;
ssk=Integer.parseInt(strmkm);
if(ssk==1)
{func1();
acceptz();
}
else if(ssk==2)
{ acceptb(); 
ro();
  }
else if(ssk==3)
{ func1();
accept147();
int cho;
     System.out.println();
     System.out.println("Enter your choice");
     String str1=br.readLine();
     cho=Integer.parseInt(str1);
     if(cho>3||cho<0)
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
     switch(cho)
     { case 1 ://body
       func1();
         acceptc();
       accept146();
        System.out.println();
         System.out.println("Enter your choice");
String strmkkm=br.readLine();
int sskk;
sskk=Integer.parseInt(strmkkm);
if(sskk==1)
{func1();
acceptz();
}

else if(sskk==2)
{acceptc();
ro();
  }
else if(sskk==3)
    { func1();
        accept149();        
       int choi;
       System.out.println();
       System.out.println("Enter your choice");
       String str2=br.readLine();
       choi=Integer.parseInt(str2);
      if(choi>3||choi<0)
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
       switch(choi)
       { case 1 :
           func1();
           acceptd();//primary
           acceptbbm();
           System.out.println();
            System.out.println("Enter your choice");
String strmkkkm=br.readLine();
int sskkk;
sskkk=Integer.parseInt(strmkkkm);
if(sskkk==1)
{func1();
acceptz();
}
else if(sskkk==2)
{acceptd();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();}          
           break;
           case 2 ://secondary
          func1();
           accepte();
          acceptbbm();
          System.out.println();
           System.out.println("Enter your choice");
String strmkkkkm=br.readLine();
int sskkkk;
sskkkk=Integer.parseInt(strmkkkkm);
if(sskkkk==1)
{func1();
acceptz();
}
else if(sskkkk==2)
{accepte();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();}
  break;}
  
}
       else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}        
                      
  
           break;
        case 2 :
        func1();
        acceptsur();
        accept146();
        System.out.println();
         System.out.println("Enter your choice");
String strmfm=br.readLine();
int sfs;
sfs=Integer.parseInt(strmfm);
if(sfs==1)
{func1();
acceptz();
}
else if(sfs==2)
{ acceptsur();
}
else if(sfs==3)
{ func1();
 acceptsubsub();
int choic;
       System.out.println();
       System.out.println("Enter your choice");
       String strx=br.readLine();
       choic=Integer.parseInt(strx);
       if(choic>3||choic<0)
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        switch(choic)
       { case 1 :
        func1();
           acceptsursubsub();
        acceptbbm();
        System.out.println("Enter your choice");
String strmfam=br.readLine();
int ssf;
ssf=Integer.parseInt(strmfam);
if(ssf==1)
{func1();
acceptz();
}
else if(ssf==2)
{ acceptsursubsub();
ro();}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
        case 2 :
        func1();
        accept6();
         acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
String stmrmfmaa=br.readLine();
int smsqf;
smsqf=Integer.parseInt(stmrmfmaa);
if(smsqf==1)
{func1();
acceptz();
}
else if(smsqf==2)
{ accept6();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}break;
        case 3 :
        func1();
        accept7();
        acceptbbm();
        System.out.println();
        System.out.println("Enter your choice");
String strmffm=br.readLine();
int ssff;
ssff=Integer.parseInt(strmffm);
if(ssff==1)
{func1();
acceptz();
}
else if(ssff==2)
{ accept7();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
    }

}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        
    break;
    
    case 3 :
    func1();
     accept8();
     acceptbbm();
      System.out.println();
      System.out.println("Enter your choice");
String strmfffm=br.readLine();
int ssfff;
ssfff=Integer.parseInt(strmfffm);
if(ssfff==1)
{func1();
acceptz();
}
else if(ssfff==2)
{ accept8();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
     break;
    } 
}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}     
    break;
    case 3 ://form
    func1();
    accept9();
    System.out.println();
    accept146();
     System.out.println("Enter your choice");
String strmffffm=br.readLine();
int ssffff;
ssffff=Integer.parseInt(strmffffm);
if(ssffff==1)
{func1();
acceptz();
}
else if(ssffff==2)
{ accept9();
}
else if(ssffff==3)
{ func1();
accept99();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
    int chhoic;
       System.out.println();
       System.out.println("Enter your choice");
       String strxy=br.readLine();
       chhoic=Integer.parseInt(strxy);
       if(chhoic>2||chhoic<0)
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
switch(chhoic)
       { case 1 :
           func1();
        accept10();
        System.out.println();
    acceptbbm();
     System.out.println("Enter your choice");
String strmfffffm=br.readLine();
int ssfffff;
ssfffff=Integer.parseInt(strmfffffm);
if(ssfffff==1)
{func1();
acceptz();
}
else if(ssfffff==2)
{ accept10();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
        case 2 :
        func1();
        accept11();
         System.out.println();
    acceptbbm();
     System.out.println("Enter your choice");
String strmfffffmm=br.readLine();
int ssfffffm;
ssfffffm=Integer.parseInt(strmfffffmm);
if(ssfffffm==1)
{func1();
acceptz();
}
else if(ssfffffm==2)
{ accept11();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
    }
    break;
    case 4 :
    func1();
    accept12();
    acceptbbm();
     System.out.println();
    System.out.println("Enter your choice");
    String strmma=br.readLine();
int ssa;
ssa=Integer.parseInt(strmma);
if(ssa==1)
{func1();
acceptz();
}
else if(ssa==2)
{ accept12(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
    break;
     case 5 :
     func1();
    accept13();
     acceptbbm();
    System.out.println("Enter your choice");
    String strmmaa=br.readLine();
int ssaa;
ssaa=Integer.parseInt(strmmaa);
if(ssaa==1)
{func1();
acceptz();
}
else if(ssaa==2)
{ accept13(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
    break;
    case 6 :
    func1();
    accept14();
    System.out.println();
    accept146();
    System.out.println("Enter your choice");
String strmffffmw=br.readLine();
int ssffffw;
ssffffw=Integer.parseInt(strmffffmw);
if(ssffffw==1)
{func1();
acceptz();
}
else if(ssffffw==2)
{ accept14();
}
else if(ssffffw==3)
{ func1();
accept14w();
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
    int chhhoic;
       System.out.println();
       System.out.println("Enter your choice");
       String strxyz=br.readLine();
       chhhoic=Integer.parseInt(strxyz);
       if(chhhoic>2||chhhoic<0)
       {System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
switch(chhhoic)
       { case 1 :
           func1();
        accept15();
        System.out.println();
        acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
    String strmmawa=br.readLine();
int ssawa;
ssawa=Integer.parseInt(strmmawa);
if(ssawa==1)
{
func1();
acceptz();
}
else if(ssawa==2)
{ accept15(); 
ro();}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
        case 2 :
        func1();
        accept16();
        System.out.println();
        acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
    String strmmawwa=br.readLine();
int ssawwa;
ssawwa=Integer.parseInt(strmmawwa);
if(ssawwa==1)
{func1();
acceptz();
}
else if(ssawwa==2)
{ accept16(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
    }
    break;
    case 7 :
    func1();
        accept17();
        int chhhhoic;
       System.out.println();
       System.out.println("Enter your choice");
       String strxyza=br.readLine();
       chhhhoic=Integer.parseInt(strxyza);
       if(chhhhoic>3||chhhhoic<0)
       {System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
        }
        switch(chhhhoic)
       { case 1 :
           func1();
        accept18();
        System.out.println();
        acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
    String strmmawwwa=br.readLine();
int ssawwwa;
ssawwwa=Integer.parseInt(strmmawwwa);
if(ssawwwa==1)
{
func1();
acceptz();
}
else if(ssawwwa==2)
{ accept18(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
        case 2 :
        func1();
        accept19();
        System.out.println();
        acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
    String strmmawwaz=br.readLine();
int ssawwaz;
ssawwaz=Integer.parseInt(strmmawwaz);
if(ssawwaz==1)
{func1();
acceptz();
}
else if(ssawwaz==2)
{ accept19(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();}
        break;
        case 3 :
        func1();
        accept20();
        System.out.println();
        acceptbbm();
         System.out.println();
        System.out.println("Enter your choice");
    String strmzmawwa=br.readLine();
int ssawzwa;
ssawzwa=Integer.parseInt(strmzmawwa);
if(ssawzwa==1)
{
func1();
acceptz();
}
else if(ssawzwa==2)
{ accept20(); 
ro();
  }
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
        break;
    }
    break;
     case 8 :
     func1();
        accept21();
        acceptbbm();
    System.out.println("Enter your choice");
    String strmmaaa=br.readLine();
int ssaaa;
ssaaa=Integer.parseInt(strmmaaa);
if(ssaaa==1)
{
func1();
acceptz();
}
else if(ssaaa==2)
{ accept21();
ro();
}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();}
        break;
     case 9 :
     func1();
     accept22();
     int ma;
System.out.println("Enter your choice");
     String fa=br.readLine();
     ma=Integer.parseInt(fa);
     if(ma==1)
{
func1();
acceptz();
}
else if(ma==2)
{ acceptquiz1(); 
ro();}
else
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}    
   break;
    }
}
catch(Exception e)
{System.out.println("Wrong Choice Entered.");
System.out.println();
System.out.println("RE-Enter All Your Choices from beginning correctly");
Thread.sleep(2000);
acceptz();
}
}
}

    
 
        

    
        
        
        
           
           
                              
         