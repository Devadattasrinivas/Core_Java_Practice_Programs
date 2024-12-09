package ineuron;
import java.util.*;
//gueseer game with guesser ,three players,and a umpire
class guesser {
    int numGuess;
    int numG() {
        Scanner s = new Scanner(System.in);
        System.out.println("guess the number from guesser:");
         numGuess = s.nextInt();
         return numG();
    }
}
class Player{
    int playNum;
    int playN(){
        Scanner s=new Scanner(System.in);
        System.out.println("guess the number from Player :");
        playNum=s.nextInt();
        return playN();
    }
}
class umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void CollectnumFromGuesser(){
        guesser g=new guesser();
        numFromGuesser=g.numG();
    }
    void CollectNumFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1= p1.playN();
        numFromPlayer2= p2.playN();
        numFromPlayer3= p3.playN();
    }
    void compare(){
            if(numFromGuesser==numFromPlayer1){
                System.out.println("player1 won ");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("player2 won ");
            } else if(numFromGuesser==numFromPlayer3){
                System.out.println("player3 won ");
            }else{
                System.out.println("lost the game");
            }

    }
}


public class minipro {
    public static void main(String args[]){
    umpire u=new umpire();
    u.CollectnumFromGuesser();
    u.CollectNumFromPlayer();
    u.compare();

    }
}
