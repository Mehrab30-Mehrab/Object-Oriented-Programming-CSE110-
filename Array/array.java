import java.io.*;
import java.util.*;

public class array {
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
            int[] p = new int[n];
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = fs.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            boolean ok = true;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    ok = false;
                    break;
                }
            }

            sb.append(ok ? "YES\n" : "NO\n");
        }

        System.out.print(sb);
    }
}