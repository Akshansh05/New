package PROJECT.afr;
import PROJECT.*;
class Sudan extends gmt implements timmfun
{public void accept4()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho3;int mi3;String a;
if(hours>=21)
{ho3=(hours+3)-24;
mi3=minutes;
obg.func2();
System.out.println("\f"+"The time in Sudan is "+ho3+" hours "+mi3+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Sudan according to Indian watch is "+ho3+" hours "+mi3+" minutes  A.M"); 
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
{ho3=hours+3;
 mi3=minutes;
 obg.func2();
System.out.println("\f"+"The time in Sudan is "+ho3+" hours "+mi3+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho3>12)
{ho3=ho3-12;
 a="P.M";
}
else if(ho3<12)
{ho3=ho3;
a="A.M";
}
else
{ho3=ho3;
a="NOON";
}
 System.out.println("The time in Sudan according to Indian watch is "+ho3+" hours "+mi3+" minutes "+a); 
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

  


