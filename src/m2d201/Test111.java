package m2d201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		try {
			fis=new FileInputStream("D:\\应用\\虎牙\\tes.txt");
			
			byte[] bytes=new byte[4];
			int readData=fis.read(bytes);
			System.out.println(readData);
			System.out.println(new String(bytes,0,readData));
			
			readData=fis.read(bytes);
			System.out.println(readData);//只读到2个字节
			System.out.println(new String(bytes,0,readData));
			
			readData=fis.read(bytes);
			System.out.println(readData);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
