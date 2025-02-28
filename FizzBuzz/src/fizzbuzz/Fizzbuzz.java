package fizzbuzz;
import java.util.Scanner;

public class Fizzbuzz {
    
    public Fizzbuzz(){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                Buzz objbuzz = new Buzz();
            }else if(i%3==0){
                Fizz objfizz = new Fizz();
            }else{
                System.out.println(i);
            }
        }
    }
}
