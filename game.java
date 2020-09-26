public class game{
  public static void main(String[] args){
    int position=0;
    System.out.println("Welcome to Snake And Ladder Game!\n Your initial position is :"+position);
    int roll=0;
    while(position!=100){
    roll++;
    int number=(int)Math.floor(Math.random() * 10) % 6;
    System.out.println("You Got :" +(number+1));
    
    int chance= (int)Math.floor(Math.random() * 10) % 3;
      switch(chance){
       case 0: System.out.println("No Play");
       break;
       case 1: System.out.println("Its a Ladder, Move Forward");
               position+=(number+1);
       break;
       case 2: System.out.println("Its a Snake, Move Backward");
               position-=(number+1);
       break;
       }
       if(position<0){
          position=0;}
       else if(position>100){
          position-=(number+1);}
       System.out.println("Current Position: " + position);
    }
     System.out.println("The Dice was rolled "+roll+" times to win the game");
  }
}
