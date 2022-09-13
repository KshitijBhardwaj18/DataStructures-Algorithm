package easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static int fun(int n){
        if(n<=1){
            return 1;
        }

        return n * fun(n-1);
    }

    static int sum(int n){
        if(n<=1){
            return 1;
        }

        return n +  sum(n-1);
    }
}
