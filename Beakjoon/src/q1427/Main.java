package q1427;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String tc = br.readLine();
		
		int arr[] = new int[tc.length()];

		for (int i = 0; i <= tc.length()-1; i++) {
			
			arr[i] = tc.charAt(i)-48;
		}

		Arrays.sort(arr);

		for (int i = tc.length()-1; i >= 0; i--) {
			bw.write(arr[i] + "");
			
		}

		bw.flush();
		bw.close();
	}

}
