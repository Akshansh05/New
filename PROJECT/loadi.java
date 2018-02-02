package PROJECT;
 public class loadi 
{
public void func2()
{try{ int yy;
 for(yy=0;yy<=100;yy++)
 {System.out.println("\f"+"Loading"+yy+"%");
     {for (int pp=1;pp<=yy;pp++)
         {System.out.print("-");
                    }
            Thread.sleep(100);
        }
    }
}

catch (Exception e)
{
}
}
}       


