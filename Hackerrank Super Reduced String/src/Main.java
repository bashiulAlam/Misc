import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        //int length = s.length();
        int flag = 0;
        while(s.length() > 1) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < s.length() - 1; i++) {
                if (ch[i] == ch[i + 1]) {
                    //s = s.replace(String.valueOf(s.charAt(i + 1)), "");
                    //s = s.replace(String.valueOf(s.charAt(i)), "");
                    s = s.substring(0, i) + s.substring(i + 2);
                    System.out.println("Reduced : " + s);
                    flag = 0;
                    break;
                } else flag = 1;
            }
            if (flag == 1)
                break;
        }
        if (s.length() != 0)
            return s;
        else return "Empty String";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(superReducedString(s));
    }
}
