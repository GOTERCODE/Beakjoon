package q14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();
            int cnt = 0;

            while (true) {
                if (n >= 5 && (n - 5) % 2 == 0 || (n - 5) % 5 == 0) {
                    n -= 5;
                    cnt++;
                } else if (n >= 2) {
                    n -= 2;
                    cnt++;
                } else {
                	System.out.println(-1);
                	break;
                }

                if (n == 0) {
                	System.out.println(cnt);
                    break;
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}