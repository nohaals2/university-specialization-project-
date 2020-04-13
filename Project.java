package ADTs;


import ADTs.*;
import java.util.*;

public class Project {
  
public  static void main (String [] args){
	
Scanner S = new Scanner (System.in);
StackAsArray stack = new StackAsArray(10);

System.out.print("Enter your name :");
String name =S.next();
System.out.print("\nEnter your ID Number:");
String ID =S.next();
         System.out.println("");
        

    
    stack.push (new String("* 1.   computer engineering     *"));
    stack.push (new String("* 2.   Software engineering     *"));
    stack.push (new String("* 3.   Accounting               *"));
    stack.push (new String("* 4.   Kindergarten             *"));
    stack.push (new String("* 5.   English Literature       *"));

          System.out.println("The removed last specialization is: " +stack.pop());
               System.out.println("The top University specializatio  is: " +stack.getTop());
                 System.out.println("Please Write the number of University specialization :");
    Enumeration i= stack.getEnumeration();
    while (i.hasMoreElements()) {
         Object o = i.nextElement();
         System.out.println(o ); }

          int num =S.nextInt();
             switch (num){
             	

             	
case 5: 
System.out.println(" Your University specialization is computer engineering");

	break;
	
	
case 4: 
System.out.println(" Your University specialization is Software engineering");

	break;


case 3: 
System.out.println(" Your University specialization is Accounting  ");

     break;
     
     
case 2: System.out.println("Your University specialization is Kindergarten  ");
 
     break;
     
case 1: System.out.println("Your University specialization is English Literature");

     break;
  
    default: 
     System.out.println("Please Select from (1 to 5)");
    break;}
    
      System.out.println("Thank you");
    }
}


