/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket;

import java.util.*;
import java.lang.*;

/**
 *
 * @author SHIVAM
 */

   /* Problem Statement - Cricket Scoreboard.

This program shows scoreboard of a cricket match between 2 teams considering ODI format.

 */



/**
 *
 * @author Shivam
 */
public class Cricket
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   // Cricket Tournament begins now!
        System.out.println("\t\t\t\t\tWelcome to Cricket Tournament");
        Scanner sc = new Scanner(System.in);
      
                System.out.println("\n\nEnter number of overs\n");
                int over = sc.nextInt();
               
                
                
                // First Innings Starts now
                
                int totrun=0,wktfall=0,extras=0,a;
                System.out.println("Team1 is Batting Now\n\n");
                for(int j=1;j<=over&&wktfall<10;j++)
                {
                    System.out.println("Over:" +j );
                    for(int ball=1;ball<7&&wktfall<10;ball++)
                    {
                        
                        System.out.println("SCORE: "+totrun+"/"+wktfall);
                        System.out.println("EXTRAS: " +extras );
                        
                        System.out.println("Ball no: " +ball );
                        System.out.println("\n\nSelect what happens on ball\n\n");
                        
                        System.out.println("1.No run scored");
                        System.out.println("2. 1 run scored");
                        System.out.println("3. 2 run scored");
                        System.out.println("4. 3 run scored");
                        System.out.println("5. Wow, its a 4!!!");
                        System.out.println("6. Wow, its a 6!!!");
                        System.out.println("7. Wide!!! ");
                        System.out.println("8. No ball!!");
                        
                        System.out.println("9. Caught out!");
                        System.out.println("10. Lbw");
                        System.out.println("11. Clean bowled!!!");
                        System.out.println("12. Hit wicket!!!");
                        System.out.println("13. Runout!\n\n");
                        
                         a= sc.nextInt();
                        // Switch case represents here all the possibilities that can occur when player is batting.
                        switch(a)
                            
                        {   
                            
                            // Runs Scored 
                            case 1:
                                 System.out.println("No run scored");
                                 break;
                                 
                            case 2:
                                
                                 System.out.println("1 run scored");
                                 totrun++;
                                 
                                 
                                break;
                                 
                            case 3:
                                
                                 System.out.println("2 run scored");
                                 totrun= totrun+2;
                                 break;
                                 
                            case 4:
                                
                                 System.out.println("3 run scored");
                                 totrun= totrun+3;
                                
                                 break;
                                 
                             
                           case 5:
                                
                                 System.out.println("Four!!");
                                 totrun= totrun+4;
                                 break;     
                                 
                           case 6:
                                
                                 System.out.println("Six!!");
                                 totrun= totrun+6;
                                 
                                 break; 
                              // Extras   
                           case 7:
                                
                                 System.out.println("wide");
                                 totrun= totrun+1;
                                 extras++;
                                 ball--;
                                 break; 
                                 
                            case 8:
                                
                                 System.out.println("No ball!!");
                                 totrun= totrun+1;
                                 extras++;
                                 ball--;
                                 
                                 break;     
                                 
                                 
                                 // Wickets 
                            case 9:
                                
                                 System.out.println("caught out!!!");
                                 wktfall++;
                                 
                                 break;
                                 
                            case 10:
                                
                                 System.out.println(" Lbw!!");
                                 wktfall++;
                                 break;
                                 
                            case 11:
                                
                                System.out.println(" clean bowled!!");
                                 wktfall++;
                                 break;
                                 
                            case 12:
                                
                                System.out.println(" Hit wicket!!");
                                 wktfall++;
                                 break;
                                 
                            case 13:
                                
                                System.out.println(" Run out!!");
                                 wktfall++;
                                 break;
                                 
                            
                                  
                            
                        }
                        System.out.println("End of an over");
                        
                        System.out.println("\nOvers Completed: \n"+j);
                        
                        

                        
                        
                        
                      }
                }
                System.out.println("\nEnd of first innings\n\n");
                
                System.out.println("Team1 Scorecard: "+totrun+"/"+wktfall);
                System.out.println("\n\n\nSecond innings begins:\n\nTeam2 is Batting Now\n");
                
                int target = totrun+1;
                
                int totrun2=0,wktfall2=0,extras2=0,b;
                
                for(int j=1;j<=over && wktfall2<10&&totrun2<target;j++)
                {
                    System.out.println("Over:" +j );
                    for(int ball=1;ball<7 && wktfall2<10&&totrun2<target;ball++)
                    {
                        System.out.println("SCORE: "+totrun2+"/"+wktfall2);
                        System.out.println("EXTRAS: " +extras2 );
                        
                        System.out.println("Ball no: " +ball );
                        System.out.println("\n\nSelect what happens on ball\n\n");
                       
                        System.out.println("1.No run scored");
                        System.out.println("2. 1 run scored");
                        System.out.println("3. 2 run scored");
                        System.out.println("4. 3 run scored");
                        System.out.println("5. Wow, its a 4!!!");
                        System.out.println("6. Wow, its a 6!!!");
                        System.out.println("7. Wide!!! ");
                        System.out.println("8. No ball!!");
                        System.out.println("9. Caught out!");
                        System.out.println("10. Lbw");
                        System.out.println("11. Clean bowled!!!");
                        System.out.println("12. Hit wicket!!!");
                        System.out.println("13. Runout!\n\n");
                        
                         b= sc.nextInt();
                         // Switch case represents here all the possibilities that can occur when player is batting.
                        switch(b)
                            
                        {
                            case 1:
                                 System.out.println("No run scored");
                                 break;
                                 
                            case 2:
                                
                                 System.out.println("1 run scored");
                                 totrun2++;
                                 break;
                                 
                            case 3:
                                
                                 System.out.println("2 run scored");
                                 totrun2= totrun2+2;
                                 break;
                                 
                            case 4:
                                
                                 System.out.println("3 run scored");
                                 totrun2= totrun2+3;
                                 break;
                                 
                             
                           case 5:
                                
                                 System.out.println("Four!!");
                                 totrun2= totrun2+4;
                                 break;     
                                 
                           case 6:
                                
                                 System.out.println("Six!!");
                                 totrun2= totrun2+6;
                                 
                                 break; 
                                 
                           case 7:
                                
                                 System.out.println("Wide");
                                 totrun2= totrun2+1;
                                 extras2++;
                                 ball--;
                                 break; 
                                 
                            case 8:
                                
                                 System.out.println("No ball!!");
                                 totrun2= totrun2+1;
                                 extras2++;
                                 ball--;
                                 
                                 break;     
                                 
                            case 9:
                                
                                 System.out.println("Caught out!!!");
                                 wktfall2++;
                                 break;
                                 
                            case 10:
                                
                                 System.out.println(" Lbw!!");
                                 wktfall2++;
                                 break;
                                 
                            case 11:
                                
                                System.out.println(" Clean bowled!!");
                                 wktfall2++;
                                 break;
                                 
                            case 12:
                                
                                System.out.println(" Hit wicket!!");
                                 wktfall2++;
                                 break;
                                 
                            case 13:
                                
                                System.out.println(" Run out!!");
                                 wktfall2++;
                                 break;
                             
                                  
                            
                        }
                        System.out.println("\n\nEnd of over\n");
                        System.out.println("Overs Completed: "+j);
                        
                        
                        
                        
                        
                       
                    }
                    
                }
               System.out.println("Innings2 end!!!");
               
               int diff=totrun-totrun2;
               
               int wktleft= 10 - wktfall2;

               System.out.println("\nSummary:\n");
               System.out.println("Team1 Score: "+totrun+"/"+wktfall);
               System.out.println("\nTeam2 Score: "+totrun2+"/"+wktfall2);
               // Final result of match after completion of both innings successfully
               if(totrun>totrun2)
                   System.out.println("Team1 wins!!Congratulations by " +diff+" runs.");
               else if(totrun<totrun2)
                   System.out.println("Team2 wins!!Congratulations by " +wktleft+" wickets.");
               else
                   System.out.println("The match ended in a tie!!!");
               
                    
                    
               
                
        // TODO code application logic here
    }
                
    
  }




