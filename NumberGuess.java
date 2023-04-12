import java.io.OutputStream;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

class NumberGuess{
    public static void main(String[] args){
        NumberGuess n=new NumberGuess();
        n.game();
    }
    public void game(){
        Random rand=new Random();
        int a=rand.nextInt(1,100);        
        System.out.println("enter number of trials");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int count=0;
        int score=b;
        int g=0;
        while(count<b && g!=a){
            String r=JOptionPane.showInputDialog(null,"Enter a number","Guessing Game",3);
            score--;
            g=Integer.parseInt(r);
            count++;
            JOptionPane.showMessageDialog(null, ""+guess(g,a,count,score));
            
        }
        if(count>=b){
            JOptionPane.showMessageDialog(null, "Trials are over");            
        }
        String[] response={"YES","NO"};
        ImageIcon icon=new ImageIcon("");

        int k=JOptionPane.showOptionDialog(null,"Do you want to play again?","secrete msg",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        icon,response,0);
        if(k==0)
            game();
        else    
            return;
    }
    public static String guess(int g,int n,int count,int score){
        if(g<=0||g>100)
            return "Invallid Number!";
        else if(g<n)
            return "Your number is lower than expected number!"+"\nTrials done :"+count+"\nScore : "+score;
        else if(g>n)
            return "Your number is greater than expected number!"+"\nTrials done :"+count+"\nScore : "+score;
        else if(g==n)
            return "Correct!!"+"\nTrials done :"+count+"\nScore : "+score;
        else 
            return "Your guess is incorrect!!";
    }
}
