package q15815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		Stack stack = new Stack<>();
		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < st.length(); i++) {
			String s = st.charAt(i) + "";
			arr.add(s);
		}

		int size = arr.size();

		for (int i = 0; i < size; i++) {
			
			stack.push(arr.get(i));
			if(stack.size()==size) {
				break;
			}
			stack.push(arr.get(size - (i + 1)));
			
			if(stack.size()==size) {
				break;
			}

		}
		
		Calc cal = new Calc();

		System.out.println(stack);
		
		

	}

}
