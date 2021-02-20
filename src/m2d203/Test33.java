package m2d203;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			fw=new FileWriter("D:\\”¶”√\\ª¢—¿\\tes.txt");
			char[] chars= {'1','3','5'};
			fw.write(chars);
			fw.write("\n");
			/*
			 * int writeCount=0; while((writeCount=fw.write(chars))!=-1){
			 * System.out.println(new String(chars,0,writeCount)); }
			 */
			fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
