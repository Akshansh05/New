package PROJECT.afr;
import PROJECT.*;
class Libya extends gmt implements timmfun
{public void accept7()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho6 ;int mi6;String a;
if(hours>=22)
{ho6=(hours+2)-24;
mi6=minutes;

System.out.println("\f"+"The time in  Libya  is "+ho6+" hours "+mi6+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Libya according to Indian watch is "+ho6+" hours "+mi6+" minutes  A.M"); 
System.out.println();
Thread.sleep(1000);
for( ii=0;ii<E.length;ii++)
{if(E[ii].equalsIgnoreCase(Z[0])==true)
{if(ii==E.length-1)
{System.out.println("The day is "+E[0]);
}
else
{System.out.println("The day is "+E[ii+1]);
 }
}
}
}
else
{ho6=hours+2;
 mi6=minutes;
 obg.func2();
System.out.println("\f"+"The time in Libya is "+ho6+" hours "+mi6+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho6>12)
{ho6=ho6-12;
 a="P.M";
}
else if(ho6<12)
{ho6=ho6;
a="A.M";
}
else
{ho6=ho6;
a="NOON";
}
 System.out.println("The time in Libya according to Indian watch is "+ho6+" hours "+mi6+" minutes "+a); 
 System.out.println();
 Thread.sleep(1000);
 for( ii=0;ii<E.length;ii++)
 if(E[ii].equalsIgnoreCase(Z[0])==true)
{ System.out.println("The day is "+E[ii]);
}
}
}
catch(Exception e)
{
}
}
}

  


