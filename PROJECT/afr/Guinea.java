package PROJECT.afr;
import PROJECT.*;
class Guinea extends gmt implements timmfun
{public void accept11()
{try{ loadi obg=new loadi();
obg.func2();
acc();
System.out.println();
int ho10 ;int mi10;String a;
if(hours<=24)
{ho10=hours;
 mi10=minutes;
 obg.func2();
System.out.println("\f"+"The time in Guinea is "+ho10+" hours "+mi10+" minutes ");
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
else if(ho10==24)
{ho10=ho10-12;
 a="A.M";
}
else
{ho10=ho10;
a="NOON";
}
 System.out.println("The time in Guinea according to Indian watch is "+ho10+" hours "+mi10+" minutes "+a); 
 System.out.println();
 Thread.sleep(1000);
System.out.println("The day is "+Z[0]);
}
}
catch(Exception e)
{
}
}
}

  


