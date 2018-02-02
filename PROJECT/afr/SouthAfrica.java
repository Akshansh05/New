package PROJECT.afr;
import PROJECT.*;
class SouthAfrica extends gmt implements timmfun
{public void accept8()
{try{loadi obg=new loadi();
obg.func2(); 
acc();
System.out.println();
int ho7 ;int mi7;String a;
if(hours>=22)
{ho7=(hours+2)-24;
mi7=minutes;

System.out.println("\f"+"The time in  South Africa   is "+ho7+" hours "+mi7+" minutes ");
System.out.println();
Thread.sleep(1000);
System.out.println("The time in South Africa according to Indian watch is "+ho7+" hours "+mi7+" minutes  A.M"); 
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
{ho7=hours+2;
 mi7=minutes;
 obg.func2();
System.out.println("\f"+"The time in South Africa is "+ho7+" hours "+mi7+" minutes ");
System.out.println();
Thread.sleep(1000);
if(ho7>12)
{ho7=ho7-12;
 a="P.M";
}
else if(ho7<12)
{ho7=ho7;
a="A.M";
}
else
{ho7=ho7;
a="NOON";
}
 System.out.println("The time in South Africa according to Indian watch is "+ho7+" hours "+mi7+" minutes "+a); 
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

  


