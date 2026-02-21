import java.io.*;
import java.util.*;

public class MakeAPalindrome {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            if (k == 1) {
                sb.append("YES\n");
                continue;
            }

            int l = 0, r = n - 1;
            while (l < r && a[l] == a[r]) {
                l++;
                r--;
            }

            if (l >= r) {
                sb.append("YES\n");
                continue;
            }

            int x = a[l];

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == x) count++;
            }

            if (count < k) {
                sb.append("NO\n");
                continue;
            }

            int need = k;
            l = 0;
            while (l < n && need > 0) {
                if (a[l] == x) need--;
                l++;
            }

            need = k;
            r = n - 1;
            while (r >= 0 && need > 0) {
                if (a[r] == x) need--;
                r--;
            }

            if (l - 1 < r + 1) sb.append("NO\n");
            else sb.append("YES\n");
        }

        System.out.print(sb);
    }
}