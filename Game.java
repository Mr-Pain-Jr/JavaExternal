package task_05_02_game;
import java.lang.Math;
import java.util.Scanner;

public class Game {

    int[] mass = new int[100];
    String attempts = "";
    int number = 1;
    int attempt = 0;
    int minRange = 0;
    int maxRange = 100;
    Scanner sc = new Scanner(System.in);


    public Game(){
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
    }

    public void createNumber(){
        this.number= (int) (Math.random() * 100);
    }


    public void regTry() {
        System.out.println("Enter your num(between " +minRange+" and "+maxRange+")");
        this.attempt = sc.nextInt();
    }


    public void doTry(){
        if(this.attempt == this.number){
            System.out.println("Congratulations!! You won!");
            System.out.print("Your attempts: "+attempts);
        }else if(this.attempt < this.number){
            System.out.println("Guessed number is greather than yours");
            this.minRange = this.attempt;
        }else if(this.attempt > this.number){
            System.out.println("Guessed number is less than yours");
            this.maxRange = this.attempt;
        }
    }


    public void startGame(){
        createNumber();
        while (this.attempt != this.number){
            regTry();
            if(this.attempt<this.minRange){
                System.out.println("Can't use. You already know that your num is bigger than " + this.minRange+"!!!");
                continue;
            }else if (this.attempt>this.maxRange){
                System.out.println("Can't use. You already know that your num is less than " + this.maxRange+"!!!");
                continue;
            }
            this.attempts+=attempt+", ";
            doTry();
        }
    }

}
