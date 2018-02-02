package PROJECT.aus;
import PROJECT.*;
class Esperane extends gmt2  
{public void accept0()throws InterruptedException
{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho;int mi;String a;int q;
if(hours>=16)
{ho=(hours+8)-24;
mi=minutes;
obg.func2();
System.out.println("\f"+"The time in Esperane is "+ho+" hours "+mi+" minutes ");
System.out.println();
 Thread.sleep(1000);
System.out.println("The time in Esperane according to Indian watch is "+ho+" hours "+mi+" minutes  A.M"); 
System.out.println();
 Thread.sleep(1000);
for( ii=0;ii<E.length;ii++)
{if(E[ii].equalsIgnoreCase(S[0])==true)
{if(ii==0)
{Z[0]=E[E.length-1];}
else
{Z[0]=E[ii-1];}}}
for( q=0;q<E.length;q++)
{if(E[q].equalsIgnoreCase(Z[0])==true)
{if(q==E.length-1)
{System.out.println("The day is "+E[0]);
}
else
{System.out.println("The day is "+E[q+1]);
 }
}
}
}
else
{ho=hours+8;
 mi=minutes;
 obg.func2();
System.out.println("\f"+"The time in Esperane is "+ho+" hours "+mi+" minutes ");
System.out.println();
 Thread.sleep(1000);
if(ho>12)
{ho=ho-12;
 a="P.M";
}
else if(ho<12)
{ho=ho;
a="A.M";
}
else
{ho=ho;
a="NOON";
}
 System.out.println("The time in Esperane according to Indian watch is "+ho+" hours "+mi+" minutes "+a); 
 System.out.println();
  Thread.sleep(1000);
 for( ii=0;ii<E.length;ii++)
if(E[ii].equalsIgnoreCase(Z[0])==true)
{ System.out.println("The day is "+E[ii]);
}
}
}
}

  

