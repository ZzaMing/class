package chaptor9;

import java.util.Scanner;

public class SystemExit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 메뉴 LOOP
		while (true) {
			System.out.println("메뉴의 번호를 입력하세요 !");
			System.out.println("1.입력  2.검색  3.수정  4.삭제");
			System.out.print("메뉴 입력 >> ");
			int num = scan.nextInt();

			// 사용자가 입력한 숫자에 따라 분기
			switch (num) {
			case 1:
				System.out.println("입력합니다.");
				break;
			case 2:
				System.out.println("검색합니다.");
				break;
			case 3:
				System.out.println("수정합니다.");
				break;
			case 4:
				System.out.println("삭제합니다.");
				break;
			case 5:
				System.exit(0);
			}

		}

	}

}
