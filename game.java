public class game{
  public static void main(String[] args){
    int position1=0;
    int position2=0;
    System.out.println("Welcome to Snake And Ladder Game!\n Player1 initial position is: "+position1+"\nPlayer2 initial position is: "+position2);
    int roll1=0;
    int roll2=0;
    while(position1!=100){
    roll1++;
    int ladder1=1;
    while(ladder1==1){
    int number=(int)Math.floor(Math.random() * 10) % 6+1;
    int chance =(int)Math.floor(Math.random() * 10 ) % 3;
    switch(chance){
    case 0: ladder1=0;
            break;
    case 1: position1+=number;
            break;
    case 2: ladder1=0; position1-=number;
            break;
  }
   if(position1<0){
     position1=0;}
   else if(position1>100){
     position1-=number;}
  }
}


 while(position2!=100){
    roll2++;
    int ladder2=1;
    while(ladder2==1){
    int number=(int)Math.floor(Math.random() * 10) % 6+1;
    int chance =(int)Math.floor(Math.random() * 10 ) % 3;
    switch(chance){
    case 0: ladder2=0;
            break;
    case 1: position2+=number;
            break;
    case 2: ladder2=0; position2-=number;
            break;
  }
   if(position2<0){
     position2=0;}
   else if(position2>100){
     position2-=number;}
   }
 }
  if(roll1>roll2) 
   System.out.println("Player 2 Won");
  else
   System.out.println("Player1 Won");
   }
}
