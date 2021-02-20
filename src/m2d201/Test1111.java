package m2d201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		try {
			fis=new FileInputStream("D:\\”¶”√\\ª¢—¿\\tes.txt");
			
			byte[] bytes=new byte[4];
			/*
			int readData=0;
			while((readData=fis.read(bytes))!=-1){
				System.out.println(new String(bytes,0,readData));
			}
			*/
			
			while(true) {
				int readData=fis.read(bytes);	
				if(readData==-1) {
					break;
				}
				System.out.println(new String(bytes,0,readData));
			}
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
