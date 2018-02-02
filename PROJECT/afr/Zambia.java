package PROJECT.afr;
import PROJECT.*;
class Zambia extends gmt implements timmfun
{public void accept10()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho9 ;int mi9;String a;
if(hours>=22)
{ho9=(hours+2)-24;
mi9=minutes;
obg.func2();
System.out.println("\f"+"The time in  Zambia  is "+ho9+" hours "+mi9+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Zambia according to Indian watch is "+ho9+" hours "+mi9+" minutes  A.M"); 
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
{ho9=hours+2;
 mi9=minutes;
 obg.func2();
System.out.println("\f"+"The time in Zambia is "+ho9+" hours "+mi9+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho9>12)
{ho9=ho9-12;
 a="P.M";
}
else if(ho9<12)
{ho9=ho9;
a="A.M";
}
else
{ho9=ho9;
a="NOON";
}
 System.out.println("The time in Zambia according to Indian watch is "+ho9+" hours "+mi9+" minutes "+a); 
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

  


