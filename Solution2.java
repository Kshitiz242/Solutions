import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution2 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = fs.nextInt();
        while (t-- != 0) {
            long n = fs.nextLong();
            if (n==1) {
                out.println(1);
                out.println(1);
            }
            else if (n==2) {
                out.println(2);
                out.println(2+" "+1);
            }
            else{
                ArrayList<Long> ans = new ArrayList<>();
                ans.add(n);
                long v = Long.lowestOneBit(n), id = Long.numberOfTrailingZeros(v);
                long tmp = n, t2 = n & ~v;
                StringBuilder s = new StringBuilder(Long.toBinaryString(n));
                s.reverse();
                int len = s.length() - 1;
                while ((tmp | t2) == n || t2>= Long.highestOneBit(n) ) {
                    if ( (tmp|t2)==n ) {
                        ans.add(t2);
                    }
                    tmp = t2;
                    v = Long.lowestOneBit(tmp);
                    id = Long.numberOfTrailingZeros(v);
                    t2 = tmp & ~v;
                    for (int i = 0; i < id; i++) {
                        int val = s.charAt(i) - '0';
                        if (val == 1) {
                            t2 = t2 | (1 << i);
                        }
                    }
                }
                v = Long.highestOneBit(n);
                t2 = n & ~v;
                for(int i = 0 ; i<len ; i++){
                    int k = s.charAt(i)-'0';
                    t2 = k==1? (t2|(1<<i)) : t2;
                }
                if ((ans.get(ans.size()-1)|t2)==n) {
                    ans.add(t2);
                }
                out.println(ans);
            }
            
        }
        out.close();
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class FastScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
        while (!st.hasMoreTokens())
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
            }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
}
