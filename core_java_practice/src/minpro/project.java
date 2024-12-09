package minpro;

import java.util.*;
class Guesser{
    int numGuesser;//to store guessed no
    int numGuesser(){//to do the activity of storing num
        Scanner s=new Scanner(System.in);
        System.out.println("guess number:");
        numGuesser =s.nextInt();
        if(numGuesser>10){
            System.out.println("plzz enter b/w 1 to 10:");
            numGuesser =s.nextInt();
        }
        return numGuesser;
    }
}
class play1{
    int numplayer;
    int numplayer(){
        Scanner s=new Scanner(System.in);
        System.out.println("guess num from player:");
        numplayer=s.nextInt();
        if(numplayer>10){
            System.out.println("plzz enter b/w 1 to 10:");
            numplayer=s.nextInt();
        }
        return numplayer;
    }
}
class ump {
    int nFromGuesser;//collecting all guessed nums from guesser,player1,player2,player3
    int nFromplayer;
    int nFromplayer2;
    int nFromplayer3;

    void collectFGuesser() {// method to collect the nums from guessor
        Guesser r = new Guesser();//invoking the guesser method here
        nFromGuesser = r.numGuesser();//collecting the guessed num  from guesser
    }

    void collectFplayer() {//method to collect the nums from player
        play1 y = new play1();//invoking the player method here
        play1 y2 = new play1();//creating player2 from the same method
        play1 y3 = new play1();//creating player3 from same method
        nFromplayer = y.numplayer();//storing the player1 guessed num
        nFromplayer2 = y2.numplayer();//storing the player2 guessed num
        nFromplayer3 = y3.numplayer();//storing the player3  guessed num
    }

    void comp() {//comparing the nums from guessors and players
        if (nFromGuesser == nFromplayer)
        {
            if (nFromGuesser == nFromplayer && nFromGuesser == nFromplayer3)
            {
                System.out.println("all won tie");
                collectFGuesser();//invoking the (entire program again)method guesser and player when tie(bcoz whole program invoked at ump class guesser and  player
                collectFplayer();
                comp();

            }
            else if (nFromGuesser == nFromplayer2)
            {
                System.out.println("player1 and player2 won");
                collectFGuesser();
                collectFplayer();
                comp();

            }
            else if (nFromGuesser == nFromplayer3)
            {
                System.out.println("player1 and player3 won");
                collectFGuesser();
                collectFplayer();
                comp();
            }
            else
            {
                System.out.println("player1 won");
            }
        }
        else if (nFromGuesser == nFromplayer2)
        {
            if (nFromGuesser == nFromplayer3)
            {
                System.out.println("player2  and player3 won");
                collectFGuesser();
                collectFplayer();
                comp();
            }
            else
            {
                System.out.println("player2 won");
            }
        }
        else if (nFromGuesser == nFromplayer3)
        {
            System.out.println("player3 won");
        } else {
            System.out.println("lost");
        }
    }
}

public class project {
    public static void main(String args[]){
        //Guuesser g=new Guuesser();
        //int num=g.numGuesser();
        // System.out.println(num);

        //play1 p=new play1();
        // int num2=p.numplayer();
        // System.out.println(num2);

       ump u=new ump();//calling the umpire and his methods
        u.collectFGuesser();
        u.collectFplayer();
        u.comp();
    }
}
