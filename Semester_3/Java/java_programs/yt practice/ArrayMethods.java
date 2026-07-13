import java.util.Arrays;

public class ArrayMethods{
    public static void main(String[] args){
        int a[] = {10,5,19,12,23, 15};
        int b[] = new int[5];

        Arrays.sort(a);
        System.out.println("After sorting Elements of a:");
        for(int i=0; i<=5;i++){
            System.out.print(a[i] + "\t");
        }

        int pos = Arrays.binarySearch(a, 19);
        System.out.println("Index of 19 is:"+ pos);

        boolean flag = Arrays.equals(a,b);
        System.out.println("Are a and b equal:"+ flag);

        System.arraycopy(a, 0, b, 0, 5);
        System.out.println("element of b are:");
        for(int i = 0; i<5; i++){
            System.out.println(b[i]+ " ");
        }
    }
}
