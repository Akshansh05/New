package PROJECT.afr;
import PROJECT.*;
class Ethopia extends gmt implements timmfun
{public void accept3()
{try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho2;int min2;String a;
if(hours>=21)
{ho2=(hours+3)-24;
min2=minutes;
obg.func2();
System.out.println("\f"+"The time in Ethopia is "+ho2+" hours "+min2+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Ethopia according to Indian watch is "+ho2+" hours "+min2+" minutes  A.M"); 
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
{ho2=hours+3;
 min2=minutes;
 obg.func2();
System.out.println("\f"+"The time in Ethopia is "+ho2+" hours "+min2+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho2>12)
{ho2=ho2-12;
 a="P.M";
}
else if(ho2<12)
{ho2=ho2;
a="A.M";
}
else
{ho2=ho2;
a="NOON";
}
 System.out.println("The time in Ethopia according to Indian watch is "+ho2+" hours "+min2+" minutes "+a); 
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

  


