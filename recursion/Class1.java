import java.util.Scanner;
// Sum of First N number using recursion.
public class Class1{
    public static void main(String[] args) {
        System.out.print("Enter the number :- ");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = find_sum(n);
        System.out.println("Sum of the 0 to"+n+"is :- "+ans);
    }
    private static int find_sum(int n){
        if (n==0) return 0;
        return n+find_sum(n-1);
    }
}