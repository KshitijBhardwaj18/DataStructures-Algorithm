public class pallindromeSB {
    public static void main(String[] args) {
        String str = "abcdcba";
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            ans.append(str.charAt(i));
        }

        System.out.println(ans.toString().equals(str));

    }
}
