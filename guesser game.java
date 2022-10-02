import java.util.Scanner;
class Guesser 

{
    int gnum;
    int guessingNum()
    {
        System.out.println("Guesser,kindly guess a number!");
        Scanner scan = new Scanner(System.in);
        gnum=scan.nextInt();
        return gnum;
    }
}
class Players

{
    int pnum;
    int predictingNum()
    {
        System.out.println("players,kindly predict a number!");
        Scanner scan = new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    void collectNumFromGuessor()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }
    void collectNumFromPlayers()
    {
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();
        
        numFromPlayer1 = p1.predictingNum();
        numFromPlayer2 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }
    void compare()
    {
        if(numFromPlayer1==numFromGuesser)
        {
            System.out.println("player1 has won the game");
        }
        else if(numFromPlayer2==numFromGuesser)
        {
            System.out.println("player2 has won the game");
        }
        else if(numFromPlayer3==numFromGuesser)
        {
            System.out.println("player3 has won the game");
        }
        else
        {
         System.out.println("game lost,try again");
        }
        
    }
}
public class Main
{

public static void main (String[] args)
{
    Umpire u = new Umpire();
    u.collectNumFromGuessor();
    u.collectNumFromPlayers();
    u.compare();
}
}

        
        
        
    
    



    