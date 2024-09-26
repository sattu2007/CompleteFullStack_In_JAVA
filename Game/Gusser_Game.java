import java.util.*;

 class Guesser{
    int guessNum;

    int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly gess the number");
        guessNum =sc.nextInt();
        return guessNum;
    }
 }

 class Player{
    int guessNum;

   int guessNum(int playerNum){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player "+playerNum+" kindly gess the number");
        guessNum =sc.nextInt();
        return guessNum;
    }
 }


class Umpire{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGusser =g.guessNum();
    }
    void collectNumFromPlayer(){
        Player p1 = new Player();
        Player p2= new Player();
        Player p3 = new Player();
        numFromPlayer1= p1.guessNum(1);
        numFromPlayer2 = p2.guessNum(2);
        numFromPlayer3 = p3.guessNum(3);
    }

    void compare(){
        if(numFromGusser == numFromPlayer1 && numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3){
            System.out.println("All Three Player won the game!");
        }else if(numFromGusser == numFromPlayer1 && numFromGusser==numFromPlayer2){
            System.out.println("Player 1 and Player 2 won the game!");
        }else if(numFromGusser ==numFromPlayer1 && numFromGusser==numFromPlayer3){
            System.out.println("Player 1 and Player 3 won the game!");
        }
        else if(numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3){
            System.out.println("Player 2 and Player 3 won the game!");
        }
        else if(numFromGusser==numFromPlayer1){
            System.out.println("Player 1 won the game!"); 
        }
        else if(numFromGusser ==numFromPlayer2){
            System.out.println("Player 2 won the game!");
        }
        else if(numFromGusser ==numFromPlayer3){
            System.out.println("Player 3 won the game!");
        }
        else{
            System.out.println("Lost the game try again!");
            System.out.println();
            collectNumFromGuesser();
            collectNumFromPlayer();
            compare();
        }

    }
}



public class Gusser_Game{
    public static void main(String[] args){
        Umpire u =new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}