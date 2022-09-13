package easy;



public class CountNumberOfZero {
    public static void main(String[] args) {
        System.out.println(count(5000343));
    }

    static int count(int n){
        return helper(n,0);
    }
    //special call to return same value to  same calls
    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }

        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
