package chaptor9;

public class RandomTest {

	public static void main(String[] args) {

		//특정 범위의 난수 추출
		double num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
		for (int i=0; i <6; i++) {
			int num2 = (int)(Math.random()*45)+1;
			System.out.println(num2);
		}

	}

}
