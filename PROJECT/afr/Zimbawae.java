package PROJECT.afr;
import PROJECT.*;
class Zimbawae extends gmt implements timmfun
{public void accept9()
{try{loadi obg=new loadi();
obg.func2();
 acc();
System.out.println();
int ho8 ;int mi8;String a;
if(hours>=22)
{ho8=(hours+2)-24;
mi8=minutes;
obg.func2();
System.out.println("\f"+"The time in  Zimbawae  is "+ho8+" hours "+mi8+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Zimbawae according to Indian watch is "+ho8+" hours "+mi8+" minutes  A.M"); 
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
{ho8=hours+2;
 mi8=minutes;
 obg.func2();
System.out.println("\f"+"The time in Zimbawae is "+ho8+" hours "+mi8+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho8>12)
{ho8=ho8-12;
 a="P.M";
}
else if(ho8<12)
{ho8=ho8;
a="A.M";
}
else
{ho8=ho8;
a="NOON";
}
 System.out.println("The time in Zimbawae according to Indian watch is "+ho8+" hours "+mi8+" minutes "+a); 
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

  


