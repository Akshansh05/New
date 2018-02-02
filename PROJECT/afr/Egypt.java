package PROJECT.afr;
import PROJECT.*;
class Egypt  extends gmt implements timmfun
{public void accept6()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho5;int mi5;String a;
if(hours>=22)
{ho5=(hours+2)-24;
mi5=minutes;
obg.func2();
System.out.println("\f"+"The time in  Egypt  is "+ho5+" hours "+mi5+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Egypt according to Indian watch is "+ho5+" hours "+mi5+" minutes  A.M"); 
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
{ho5=hours+2;
 mi5=minutes;
 obg.func2();
System.out.println("\f"+"The time in Egypt is "+ho5+" hours "+mi5+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho5>12)
{ho5=ho5-12;
 a="P.M";
}
else if(ho5<12)
{ho5=ho5;
a="A.M";
}
else
{ho5=ho5;
a="NOON";
}
 System.out.println("The time in Egypt according to Indian watch is "+ho5+" hours "+mi5+" minutes "+a); 
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

  


