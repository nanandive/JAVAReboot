import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		for(int i =1; i<10; i=i+1) {
			System.out.println(2*i+"");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("===========");

		for(int i =2; i<10; i=i+1)
		{
			System.out.println(2*i+"");
			System.out.println(3*i+"");
			System.out.println(2*i+"");
			System.out.println(2*i+"");
			System.out.println(2*i+"");
			
			
			System.out.println("============");
			
			for (int j = 2; j <10; j++) 
			{
				System.out.println(j * i +" ");
			}
			
			System.out.println();
		}
	}
}



		