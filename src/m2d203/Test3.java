package m2d203;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//FileReaderֻ�ܶ���ͨ�ı�
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr=new FileReader("D:\\Ӧ��\\����\\tes.txt");
			char[] chars=new char[2];
			int readCount=0;
			while((readCount=fr.read(chars))!=-1){
				System.out.println(new String(chars,0,readCount));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
