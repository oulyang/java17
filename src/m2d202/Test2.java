package m2d202;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.FileOutputStream
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("D:\\Ӧ��\\����\\tes.txt",true);
			byte[] bytes= {97,98,99,100};
			//fos.write(bytes);//���ԭ�ļ����ٸ�д����������
			fos.write(bytes);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
