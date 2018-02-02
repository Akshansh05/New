package PROJECT.afr;
import PROJECT.*;
class Tanzenia  extends gmt implements timmfun
{public void accept5()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho4;int mi4;String a;
if(hours>=21)
{ho4=(hours+3)-24;
mi4=minutes;
obg.func2();
System.out.println("\f"+"The time in  Tanzenia   is "+ho4+" hours "+mi4+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Tanzenia according to Indian watch is "+ho4+" hours "+mi4+" minutes  A.M"); 
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
{ho4=hours+3;
 mi4=minutes;
 obg.func2();
System.out.println("\f"+"The time in Tanzenia is "+ho4+" hours "+mi4+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho4>12)
{ho4=ho4-12;
 a="P.M";
}
else if(ho4<12)
{ho4=ho4;
a="A.M";
}
else
{ho4=ho4;
a="NOON";
}
 System.out.println("The time in Tanzenia according to Indian watch is "+ho4+" hours "+mi4+" minutes "+a); 
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

  


