class loa 
{
public static void func()throws InterruptedException
{ int y;
 for(y=0;y<=100;y++)
 {System.out.println("\f"+"Loading"+y+"%");
     {for (int p=1;p<=y;p++)
         {System.out.print("-");
                    }
            Thread.sleep(100);
        }
    }
}
}       
