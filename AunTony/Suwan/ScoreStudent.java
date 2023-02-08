import java.util.Scanner;

class ScoreStudent{
    private int score,sum,scoreMax = 20;
    public void sc(int score){
        this.score = score;
        sum = scoreMax/score*100;
        System.out.println(sum);
    }
}