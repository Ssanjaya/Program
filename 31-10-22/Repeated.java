package Modified;

public class Repeated {
    static int MAX_CHAR = 256;
    public static boolean isPalindrome(String str, int leftmost, int rightmost) {
        while(rightmost > leftmost)
            if (str.charAt(leftmost++) != str.charAt(rightmost--))
                return false;

        return true;
    }

    public static boolean check(String str)
    {
        int len = str.length();
        int[] freq = new int[MAX_CHAR];
        for (int i = 0; i < len; i++)
        {
            freq[str.charAt(i)]++;
            if (freq[str.charAt(i)] > 2)
                return true;
        }
        int k = 0;
        for (int i = 0; i < len; i++)
            if (freq[str.charAt(i)] > 1)
                str.replace(str.charAt(k++),str.charAt(i));
             str.replace(str.charAt(k), '\0');
        if (isPalindrome(str, 0, k - 1))
        {
            if ((k & 1) == 1) {
                if (k / 2 >= 1)
                    return (str.charAt(k / 2) == str.charAt(k / 2 - 1));
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "xyxyzxyxb";
        System.out.println(check(str));
    }
}
