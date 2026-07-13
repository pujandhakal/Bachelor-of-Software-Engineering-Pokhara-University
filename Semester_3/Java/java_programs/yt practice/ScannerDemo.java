import java.util.Scanner;

class ScannerDemo{
    public static void main(String[] args){
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        s = a+b;
        System.out.println("Sum is:"+ s);
    }
}
