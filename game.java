public class game{
  public static void main(String[] args){
    int position=0;
    System.out.println("Welcome to Snake And Ladder Game!\n Your initial position is :"+position);
    int number=(int)Math.floor(Math.random() * 10) % 6;
    System.out.println("You Got :" +(number+1));
    
    int chance= (int)Math.floor(Math.random() * 10) % 3;
      switch(chance){
       case 0: System.out.println("No Play");
       break;
       case 1: System.out.println("Its a Ladder, Move Forward");
       break;
       case 2: System.out.println("Its a Snake, Move Backward");
       break;
       }
    }
 }
