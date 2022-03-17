import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int numberCounter = 0, stepValue;
        System.out.println("Insert a number: ");
        a = scanner.nextInt();
        int newNumber=a, result = 0,sum;


        while (newNumber != 0) {
            newNumber/= 10;
            numberCounter++;
        }
        newNumber=a;
        while (newNumber!=0){
            stepValue = newNumber %10 ;
            sum=0;

            for (int i = 1; i <numberCounter ; i++) {
                sum= stepValue;
              
            }
            result += sum;
            newNumber/= 10;

        }
        System.out.println(result);
    }


}


