
public class Ex10 {

	public static void main(String[] args) {
		int num =0;
		while (true) 
		{
			num = num +1;
			
			if(num %2 ==0)
			{
				continue;
			}
		
			if(num>10)
			{
				break;
			}
			System.out.println(num);
		}
			System.out.println("while문 종료");
	}

}
