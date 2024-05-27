package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();						//char로 변환 후 한 글자씩 추출하기 위해 문자열로 입력받음
		sc.close();
		
		int cnt = 0;								//사이클 카운트

		if (st.length() == 1) {						//입력값이 10보다 작을시 0을 붙여서 두자리수로 만들기
			st = st + "0";
		}

		Integer save = Integer.parseInt(st);		//입력받은 문자를 정수로 파싱하여 저장(반복문에서 비교하기위해)
		
		char[] chN = new char[2];				
		chN = st.toCharArray();						//입력받은 값을 한 글자씩 배열에 저장

		int[] N = new int[2];						//연산식에서 쓰일 2개의 정수 배열


		for (int i = 0; i < 2; i++) {				//반복문에 들어갈 최초의 피연산자 대입 (최초의 연산은 입력값의 각 자릿수를 더한다)
			N[i] = chN[i] - 48;
		}

		while (true) {								//무한 데이터타입 변환 지옥 ON
			String add = N[0] + N[1] + "";			//한 글자씩 추출하기 위해 string으로 선언 후 각 자릿수끼리 하나의 정수로 합친뒤 
			char[] addCh = add.toCharArray();		// char로 변환
			String Nst = N[0] + "" + N[1];
			Integer NN = Integer.parseInt(Nst);	

			N[0] = N[1];							//피연산자 업데이트
			N[1] = addCh[add.length() - 1] - 48;	//연산식의 오른쪽 숫자와 결과값 가장 오른쪽 숫자를 피연산자로 대입

			Nst = N[0] + "" + N[1];					
			NN = Integer.parseInt(Nst);				//결과값을 구하고 처음 입력받은 값과 비교하기 위해 정수로 파싱

			cnt++;

			if (NN == save) {						//연산 결과가 최초의 입력값과 동일 할 시 사이클 카운트를 출력하고 종료
				System.out.println(cnt);			
				break;
			}										//동일하지 않을시 업데이트 된 연산자를 가지고 다시반복

		}

	}

}


