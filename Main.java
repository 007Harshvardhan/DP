import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int n = s.length();
    List<Integer> a = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
            a.add(0);
        }
        a.set(a.size() - 1, a.get(a.size() - 1) + 1);
    }

    int a1 = 0, a2 = 1;
    int M = 1000000007; // Assuming you have a constant M

    for (int i : a) {
        if (i > 1) {
            a1 += i - 1;
            a2 = (int) ((a2 * (long) i) % M);
        }
    }

    System.out.println(a1 + " " + (a2 * fact(a1, M) % M));
}

 public static int fact(int n, int M) {
    int res = 1;
    for (int i = 2; i <= n; i++) {
        res = (int) ((res * (long) i) % M);
    }
    return res;
    }
}
    

