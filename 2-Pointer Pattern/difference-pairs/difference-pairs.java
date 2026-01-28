import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] ip = new int[n];

            for (int i = 0; i < n; i++) {
                ip[i] = sc.nextInt();
            }

            Arrays.sort(ip); // IMPORTANT

            int i = 0, j = 1;
            int found = 0;

            while (i < n && j < n) {
                if (i == j) {
                    j++;
                    continue;
                }

                int diff = ip[j] - ip[i];

                if (diff == b) {
                    found = 1;
                    break;
                } else if (diff < b) {
                    j++;
                } else {
                    i++;
                }
            }

            System.out.println(found);
        }
    }
}
