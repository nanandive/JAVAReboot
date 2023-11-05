package codingtest;

import java.util.Scanner;

class ex02 {
	public String solution(String str) {
		String answer="";
		for(char x: str.toCharArray()) {
			
			if(x>=65 && x<=123) answer+=(char)(x-32);
			else answer+=(char)(x+=32);
		}
		return answer;			
	}
				
				/*System.out.println(x);*/
			/*
			 * if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x) else answer+=
			 * Character.toLowerCase(x);
			 */
			

			
	
	public static void main(String[] args) {
		ex02 T = new ex02();
		Scanner kb = new Scanner(System.in);
		String str =kb.next();
		System.out.println(T.solution(str));
	}

}