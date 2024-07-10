import java.util.Scanner;

public class example {
    public static int main(String[] args) {

        // String s;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int res = firstUniqChar(s);
        return res;
    }

    public static int firstUniqChar(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
