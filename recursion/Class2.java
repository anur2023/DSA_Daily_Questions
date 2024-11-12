import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        System.out.print("Enter the number :- ");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = find_fact(n);
        System.out.println("Factorial of entered number is "+ans);
    }
    private static int find_fact(int n){
        if (n==0) return 1;
        return n*find_fact(n-1);
    }
    
}
