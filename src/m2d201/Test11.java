package m2d201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\应用\\虎牙\\tes.txt");
			
			/*
			int readData=0;
			while((readData=fis.read())!=-1){
				System.out.println(readData);
			}
			*/
			while(true) {
				int readData=fis.read();//读不到数据返回-1
				if(readData==-1) {
					break;
				}
				System.out.println(readData);
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
