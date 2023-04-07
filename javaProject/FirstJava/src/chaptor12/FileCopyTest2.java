package chaptor12;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		
		//원본파일 : 파일 데이터를 읽어와야 한다.
		//복사본 : 원파일의 데이터를 써야한다.
		
		try {
			
			InputStream in = new FileInputStream("D:\\test\\test.zip");
			OutputStream out = new FileOutputStream("D:\\test\\testcopy.zip");
			
			//카피한 파일의 사이즈
			int copyByte = 0;
			//배열에 담기는 데이터의 사이즈
			int byteDataSize = 0;
			//데이터를 담아서 전송할 배열
			byte[] bufData = new byte[1024*2];
			//2kb 사이즈의 배열 생성, 데이터를 배열에 저장해서 읽고 쓴다.
			
			System.out.println("파일 복사 시작");
			
			while(true) {
				
				byteDataSize = in.read(bufData); 
				// 전달한 배열에 byte 데이터를 담고 몇개 데이터를 전달하는지 반환
				//더이상 보낼 데이터가 없으면 -1 반환.
				if(byteDataSize == -1) {
					break;
				}
				//파일에 데이터를 쓴다.
				out.write(bufData, 0 ,byteDataSize);
				
				copyByte += byteDataSize; //복사한 파일의 사이즈 증가 연산.
			}
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다." + copyByte + "byte");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
