package game;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int points = 0;

        Info[] quiz = new Info[4];

        quiz[0] =new Info("Jak nazywa się stolica Polski?", "A: Gozdnica", "B: Poznan",
                "C: Warszawa");
        quiz[2] =new Info("jak nazywa sie moja narzeczona?", "A: Martyna", "B: Marlena",
                "C: Karolina");
        quiz[3] =new Info("Jak mam na imię?", "A:Pawel", "B: Artur", "C: Szymon");

        System.out.println();
        System.out.println(quiz[0].getQuestions());
        System.out.println();
        System.out.println(quiz[0].getAnswer(1) + " " + quiz[0].getAnswer2(2)+ " " + quiz[0].getAnswer3(3));

        String answer1 = "";

        answer1 = sc.nextLine();

        if(answer1.equals("C")){
            System.out.println("Correct!");
            points += 1;


        }else{
            System.out.println("Incorrect");
            System.out.println("Correct answer is: " + quiz[0].getAnswer3(3));
        }

        System.out.println();
        System.out.println(quiz[2].getQuestions());
        System.out.println();
        System.out.println(quiz[2].getAnswer(2) + " " + quiz[2].getAnswer2(2)+ " " + quiz[2].getAnswer3(3));

        String answer2 = "";

        answer2 = sc.nextLine();

        if(answer2.equals("A")){
            System.out.println("Correct!");
            points += 1;


        }else{
            System.out.println("Incorrect");
            System.out.println("Correct answer is: " + quiz[2].getAnswer(2));

        }

        System.out.println();
        System.out.println(quiz[3].getQuestions());
        System.out.println();
        System.out.println(quiz[3].getAnswer(1) + " " + quiz[3].getAnswer2(2) + " " + quiz[3].getAnswer3(3));

        String answer3 = "";

        answer3 = sc.nextLine();

        if(answer3.equals("B")){
            System.out.println("Correct!");
            points += 1;

        }else{
            System.out.println("Incorrect");
            System.out.println("Correct answer is: " + quiz[3].getAnswer2(2));
        }



        System.out.println("Your score: " + points);





    }
}
