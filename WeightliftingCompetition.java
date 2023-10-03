
    import java.util.Scanner;
 public class WeightliftingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of athletes

            int maxStrength = 0;
            int minEndurance = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int strength = scanner.nextInt(); // strength of athlete
                int endurance = scanner.nextInt(); // endurance of athlete

                maxStrength = Math.max(maxStrength, strength);
                minEndurance = Math.min(minEndurance, endurance);
            }

            if (maxStrength > minEndurance) {
                System.out.println(-1); // impossible to choose w
            } else {
                System.out.println(minEndurance); // value of w
            }
        }
    }
}

