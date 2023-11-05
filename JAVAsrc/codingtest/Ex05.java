ackage codingtest;

import java.util.Scanner;

public class Ex05 {

	public String solution(String str) {
		/* a#b!GE*T@ 알파벳을 가리키고있을때 */
		String answer;
		char[] s= str.toCharArray();
		int lt =0, rt= str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[lt])) rt--;
			else {
				char tmp =s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;		
			}					
		}
		answer =String.valueOf(s);	
		
		return answer;
		
	}
	
	public static void main(String[] args){
		Ex05 T = new Ex05();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
	}
	
}
