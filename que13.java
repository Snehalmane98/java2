/*:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed item

*/
import java.util.Scanner;
public class que13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       int pen=10,pencil=5,notebook=20,bottle=30,colorbox=50,ch,c;
       System.out.println("what you want to purchase?");
       System.out.println("Enter 1.pen 2.Pencil 3.notebook 4.bottle 5.ColorBox 6.Exit ");
       int flag=1;
       while(flag!=0)
       {
    	   System.out.println("Enter your choice");
    	   ch=s.nextInt();
    	   switch(ch)
    	   {
    	   case 1: System.out.println("how many pen you want?");
    	           c=s.nextInt();
    	           pen=pen*c;
    	           break;
    	   case 2:  System.out.println("how many pencil you want?");
                    c=s.nextInt();
                    pencil=pencil*c;
                    break;    
    	   case 3:  System.out.println("how many notebook you want?");
                    c=s.nextInt();
                    notebook=notebook*c;
                    break;         
    	   case 4:  System.out.println("how many bottle you want?");
                    c=s.nextInt();
                    bottle=bottle*c;
                    break; 
    	   case 5: System.out.println("how many colourbox you want?");
    	           c=s.nextInt();
    	           colorbox=colorbox*ch;
    	           break;
    	   case 6: System.out.println("Exit");
    	           flag=0;
    	        		   break;
                    
                    
    	   }            
       }
                 int total=pen+pencil+notebook+bottle+colorbox;
                 System.out.println("Total purchase is Rs"+total+"/-");
       
	}

}
/*what you want to purchase?
Enter 1.pen 2.Pencil 3.notebook 4.bottle 5.ColorBox 6.Exit 
Enter your choice
1
how many pen you want?
2
Enter your choice
2
how many pencil you want?
3
Enter your choice
3
how many notebook you want?
4
Enter your choice
5
how many colourbox you want?

4
Enter your choice
5
how many colourbox you want?
4
Enter your choice
6
Exit
Total purchase is Rs1395/-
*/