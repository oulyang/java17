package m2d202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("D:\\应用\\虎牙\\tes.txt");
			fos=new FileOutputStream("D:\\应用\\虎牙\\ttt.txt");
			byte[] bytes=new byte[1024*1024];
			int readCount=0;
			while((readCount=fis.read())!=-1) {
				fos.write(bytes,0,readCount);
			}
			fos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
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
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
