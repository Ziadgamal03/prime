import java.util.Scanner;

public class main extends Calc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inp.nextInt();
        Calc calc1 = new Calc();
        boolean prime=calc1.primen(num);
        if(prime==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
