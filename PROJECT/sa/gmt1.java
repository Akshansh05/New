package PROJECT.sa;
public class gmt1 extends indiantime implements timmefun
{public int hours;public int ii=0;
 public int minutes; 
public void acc()
{
try{accept();
if(hou>=5)
{hours=hou-5;
if (min<30)
{hours=hours-1;
minutes=60+(min-30);
}
 else
{minutes=min-30;
}
for( ii=0;ii<E.length;ii++)
{if(E[ii].equalsIgnoreCase(S[0])==true)
{ Z[0]=E[ii];
 if(hou==5)
 {for( ii=0;ii<E.length;ii++)
{if(E[ii].equalsIgnoreCase(S[0])==true)
{if(ii==0)
{Z[0]=E[0];}
else
{Z[0]=E[ii];}}}
    }
}
}
}
else
{hours=24+(hou-5);
 if (min<30)
{hours=hours-1;
minutes=60+(min-30);
}
 else
{minutes=min-30;
}
for( ii=0;ii<E.length;ii++)
{if(E[ii].equalsIgnoreCase(S[0])==true)
{if(ii==0)
{Z[0]=E[E.length-1];}
else
{Z[0]=E[ii-1];}}}
}
}
catch(Exception e)
{System.out.println("Wrong Format entered ");
}
}
}