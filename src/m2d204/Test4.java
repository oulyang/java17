package m2d204;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//BufferedReader:不需要自定义char数组
public class Test4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * FileInputStream fis=new FileInputStream("D:\\应用\\虎牙\\tes.txt");
		 * 
		 * InputStreamReader is=new InputStreamReader(fis);
		 * 
		 * BufferedReader br=new BufferedReader(is);
		 */
		FileReader fr=null;
		fr = new FileReader("D:\\应用\\虎牙\\tes.txt");
		/*当一个流的构造方法中需要传入一个流时，传入的流被称为：节点流
		 * 外部负责包装的这个流被称作：包装流/处理流
		 */
		BufferedReader br=new BufferedReader(fr);
		
		//读一行
		String fl1=br.readLine();//读取一个文本行，不带换行符
		System.out.println(fl1);
		//读第二行
		String fl2=br.readLine();
		System.out.println(fl2);
		
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		br.close();
	}

}
