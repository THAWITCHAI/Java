import java.util.Scanner;

public class max_mid {
    public static void main(String[] args) {
        int score[] = new int[10];
        int index_max=0,index_min=0;
        Scanner inputScore = new Scanner(System.in);
        System.out.println("---------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.print("Index["+i+"]>>");
            score[i] = inputScore.nextInt();
        }
        inputScore.close();

        int max=score[0],min=score[0];

        for (int index = 0; index < score.length; index++) {
            if(score[index] > max){
                max = score[index];
                index_max =index;
            }else if(min > score[index]){
                min=score[index];
                index_min=index;
            }
        }

        // for (int i = 0; i < score.length; i++) {
        //     if(score[i]<=min){
        //         min = score[i];
        //         index_min ++;
        //     }
        // }

        System.out.println("---------------------------");
        System.out.println("|---- Score Max >>"+max+" ---|");
        System.out.println("|------ Index ["+index_max+"] ------|");
        System.out.println("---------------------------");

        System.out.println("---------------------------");
        System.out.println("|---- Score Min >>"+min+" ---|");
        System.out.println("|------ Index ["+index_min+"] ------|");
        System.out.println("---------------------------");
    }
}
