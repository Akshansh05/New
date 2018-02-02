package PROJECT.afr;
import PROJECT.*;
class Algeria extends gmt implements timmfun
{public void accept11()
{ try{loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho10 ;int mi10;String a;
if(hours>=23)
{ho10=(hours+1)-24;
mi10=minutes;
obg.func2();
System.out.println("\f"+"The time in  Algeria  is "+ho10+" hours "+mi10+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in Algeria according to Indian watch is "+ho10+" hours "+mi10+" minutes  A.M"); 
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
{ho10=hours+1;
 mi10=minutes;
 obg.func2();
System.out.println("\f"+"The time in Algeria is "+ho10+" hours "+mi10+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho10>12)
{ho10=ho10-12;
 a="P.M";
}
else if(ho10<12)
{ho10=ho10;
a="A.M";
}
else
{ho10=ho10;
a="NOON";
}
 System.out.println("The time in Algeria according to Indian watch is "+ho10+" hours "+mi10+" minutes "+a); 
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

  


