package m2d201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.InputStream字节输入流
 * java.io.OutputStream字节输出流
 * 
 * java.io.Reader字符输入流
 * java.io.Writer字符输出流
 * 上述首领都是抽象类
 * 
 * 
 * 输入输出流实现了java.io.Closeable接口，有close方法，用完流之后需要关闭，节省资源
 * 输出流实现了java.io.Flushable接口，有flush方法，在输出最终数据之后刷新一下，防止丢失数据
 * 文件专属流
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * java.io.FileReader
 * java.io.FileWriter
 * 
 * 转换流（字节流-->字符流）
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * 缓冲流
 * java.io.BufferedReader
 * java.io.BufferedWriter
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 
 * 数据流
 * java.io.DataInputStream
 * java.io.DataOutputStream
 * 
 * 标准输出流
 * java.io.PrintWriter
 * java.io.PrintStream
 * 
 * 对象流
 * java.io.ObjectInputStream
 * java.io.ObjectOutputStream
 * @author yyds
 *
 */



/*
 * java.io.FileInputStream 任何类型的文件都可采用该流来读取
 * 常用方法int available()返回流中剩余的未读到的字节数量
 * 		   long skip(long l)跳过l个字节不读
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\应用\\虎牙\\tes.txt");
			fis.skip(1);
			int readData=fis.read();//读不到数据返回-1
			System.out.println(fis.available());
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
