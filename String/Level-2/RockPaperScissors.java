import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int playerWin=0, computerWin=0;
        for(int i=0;i<n;i++){
            int player=sc.nextInt();
            int computer=(int)(Math.random()*3)+1;
            if(player==computer) System.out.println("Draw");
            else if((player==1&&computer==3)||(player==2&&computer==1)||(player==3&&computer==2)){
                System.out.println("Player Wins"); playerWin++;
            }else{ System.out.println("Computer Wins"); computerWin++; }
        }
        System.out.println("Player Wins = "+playerWin);
        System.out.println("Computer Wins = "+computerWin);
    }
}