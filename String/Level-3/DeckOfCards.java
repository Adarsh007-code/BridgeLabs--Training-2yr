import java.util.Scanner;
public class DeckOfCards{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int players=sc.nextInt();
        int cards=sc.nextInt();
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[52];
        int k=0;
        for(int i=0;i<suits.length;i++) for(int j=0;j<ranks.length;j++) deck[k++]=ranks[j]+" of "+suits[i];
        for(int i=0;i<52;i++){
            int r=i+(int)(Math.random()*(52-i));
            String t=deck[i]; deck[i]=deck[r]; deck[r]=t;
        }
        k=0;
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1));
            for(int j=0;j<cards;j++) System.out.println(deck[k++]);
            System.out.println();
        }
    }
}