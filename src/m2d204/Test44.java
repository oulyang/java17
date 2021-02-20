package m2d204;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Test44 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\应用\\虎牙\\tes.txt"));
		
		//BufferedWriter bws=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\应用\\虎牙\\tes.txt",true)));
		bw.write("1");
		bw.write("@");
		
		bw.flush();
		bw.close();
	}

}
