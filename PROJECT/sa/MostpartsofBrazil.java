package PROJECT.sa;
import PROJECT.*;
class MostpartsofBrazil extends gmt1
{public void accept0()throws InterruptedException
{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho;int mi;String a;int q;String g="P.M";
if(hours<=4)
{ho=24+(hours-4);
mi=minutes;
obg.func2();
System.out.println("\f"+"The time in Most parts of Brazil is "+ho+" hours "+mi+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho>12)
{ho=ho-12;
 g ="P.M";
}
System.out.println("The time in Most parts of Brazil according to Indian watch is "+ho+" hours "+mi+" minutes "+g); 
System.out.println();
Thread.sleep(1000);
for( q=0;q<E.length;q++)
{if(E[q].equalsIgnoreCase(S[0])==true)
{if(q==0)
{System.out.println("The day is "+E[E.length-1]);
}
else
{System.out.println("The day is "+E[q-1]);
 }
}
}
}
else
{ho=hours-4;
 mi=minutes;
 obg.func2();
System.out.println("\f"+"The time in Most parts of Brazil  is "+ho+" hours "+mi+" minutes ");
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
 System.out.println("The time in Most parts of Brazil  according to Indian watch is "+ho+" hours "+mi+" minutes "+a); 
 System.out.println();
 Thread.sleep(1000);
 for( ii=0;ii<E.length;ii++)
if(E[ii].equalsIgnoreCase(Z[0])==true)
{ System.out.println("The day is "+E[ii]);
}
}
}
}

  

