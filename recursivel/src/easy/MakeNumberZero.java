package easy;

public class MakeNumberZero {
    public static void main(String[] args) {
        //It's a leetcode question in this we  need to return the number pf steps
        //requires to make a number zero such that when it's even divide by 2 and when odd reduce 1
        System.out.println(reduce(41));
    }

    static int reduce(int num){
        return helper(num,0);
    }

    private static int helper(int num, int steps) {
        if(num == 0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);

    }
}
