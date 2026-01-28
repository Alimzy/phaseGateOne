import java.util.Random;
import java.util.Scanner;


public class Arithmetic{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();

System.out.println("Solve this subtraction equation");

int count = 0;

for(int counter = 1; counter <= 10; counter++){
int subtraction;
int firstDigit = random.nextInt(1,100);
int secondDigit = random.nextInt(1,100);

if (secondDigit > firstDigit){
subtraction = secondDigit - firstDigit;
 System.out.println(secondDigit + "-" + firstDigit);
}else{
subtraction = firstDigit - secondDigit;
 System.out.println(firstDigit + "-" + secondDigit);
}


System.out.println("Enter answer: ");
int answer = input.nextInt();

if(answer == subtraction){
System.out.println("you are correct");
count += 1;
}else{
System.out.println("incorrect");
System.out.println("Enter answer: ");
 answer = input.nextInt();
}

}


if(count > 5){
System.out.println("Your final score is: " + count + " Superb!!!");
}else{
System.out.println("Your final score is: " + count + " poor!!!,you can do better");
}





}
}

