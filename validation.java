import java.io.*;
class validation extends mainmenu
{ static String A[]={"Akshansh"};
static String B[]={"12345"};
static int d=0;static int f=0;static int e=0;static int rr=0;static int rrr=0;
        

    public static void hi()throws Exception
{       try {     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.println();                       
System.out.println("\f"+"WELCOME TO OUR PROJECT");
System.out.println();
System.out.println("Enter Your User Name");
                   String str=br.readLine();
                      for(rr=0;rr<A.length;rr++)
                  { if (str.equals(A[rr])==true)
                     {System.out.println("correct User name");
                     try {  System.out.println( "Enter Your Password");
                         String pass=br.readLine();
                         for(rrr=0;rrr<A.length;rrr++)
                          { 
                             if(pass.equalsIgnoreCase(B[rrr])==true)
                             { func();
                                 acceptm();
                                }
                           else
                            {
                                  e++;
                                for(e=e;e<=3;e++)
                                {System.out.println("wrong password entered. password hint: number series.");
                                System.out.println("Re Enter password.");
                               pass=br.readLine();
                                 if(pass.equals(B[rrr])==true)
                                    { func();
                                        acceptm();}                                        
                                        }    
                         
                                                System.out.println("wrong password entered.You cannot open it");
                                                         System.out.println("You have to go back and open it as guest");
                                                         System.out.println("Going back....");
                                                         Thread.sleep(3000);
                                                         mainaccess fo=new mainaccess();
                                                         fo.hmm();
                                                  
                                      }
                                    }}
                                 catch(Exception e)
                                            {f++;
                                                for(f=f;f<=5;f++)
                                                {System.out.println("please check. Wrong user name or password is entered.");
                                                System.out.println("Re Enter user name.");
                                                 Thread.sleep(2000);
                                            hi();
                                     break;   }
                                     System.out.println();
                                  System.out.println("wrong User name or password is entered for 5 times.You cannot open it");
                                  System.out.println("You have to go back and open it as guest");
                                                 System.out.println("Going back....");
                                                         Thread.sleep(3000);
                                                         mainaccess fo2=new mainaccess();
                                                         fo2.hmm(); 
                                            }
                                        }
                                   
                                                else
                                                {    
                                                    d++;
                                                    for(d=d;d<=5;d++)
                                                   { System.out.println("wrong User name entered.");
                                                    System.out.println("Re Enter user name.");
                                                     Thread.sleep(2000);
                                                hi();                                                
                                                break;
                                            }System.out.println();
                                               System.out.println("wrong User name entered for 5 times.You cannot open it");
                                                         System.out.println("You have to go back and open it as guest");
                                                         System.out.println("Going back....");
                                                         Thread.sleep(3000);
                                                         mainaccess fo1=new mainaccess();
                                                         fo1.hmm();                     }
                                            }}
                                            catch(Exception e)
                                            {  System.out.println("please check. Wrong user name or password is entered.");
                                                System.out.println("Re Enter user name.");
                                                 Thread.sleep(2000);
                                            hi();      
                                            }
                                        }                          
}

                                                     
                                                               
