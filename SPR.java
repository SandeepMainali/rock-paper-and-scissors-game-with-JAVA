import java.util.Random;
import java.util.Scanner;

public class SPR{
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Please Enter s, p, or r: ");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User Enter >> " + userMove);

        char[] arrMove = {'s','p','r'};  
        Random random = new Random();
        int guess = random.nextInt(3);
        System.out.println("Computer gave >> " + arrMove[guess]);

        if(userMove == arrMove[guess])
        {
            System.out.println("Draw");
        }
        else if(userMove == 's')
        {
            if(arrMove[guess]=='p')
            {
                System.out.println("User Won");
            }
            else
            {
                System.out.println("Computer Won");
            }
        }
        else if(userMove == 'p')
        { 
            if(arrMove[guess]=='r')
            {
                System.out.println("User Won");
            }
            else
            {
                System.out.println("Computer Won");
            }
        }
        else
        {
            if(arrMove[guess]=='s')
            {
                System.out.println("User Won");
            }
            else
            {
                System.out.println("Computer Won");
            }
        }
    
    }
}