package m2d201;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.InputStream�ֽ�������
 * java.io.OutputStream�ֽ������
 * 
 * java.io.Reader�ַ�������
 * java.io.Writer�ַ������
 * �������춼�ǳ�����
 * 
 * 
 * ���������ʵ����java.io.Closeable�ӿڣ���close������������֮����Ҫ�رգ���ʡ��Դ
 * �����ʵ����java.io.Flushable�ӿڣ���flush�������������������֮��ˢ��һ�£���ֹ��ʧ����
 * �ļ�ר����
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * java.io.FileReader
 * java.io.FileWriter
 * 
 * ת�������ֽ���-->�ַ�����
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * ������
 * java.io.BufferedReader
 * java.io.BufferedWriter
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 
 * ������
 * java.io.DataInputStream
 * java.io.DataOutputStream
 * 
 * ��׼�����
 * java.io.PrintWriter
 * java.io.PrintStream
 * 
 * ������
 * java.io.ObjectInputStream
 * java.io.ObjectOutputStream
 * @author yyds
 *
 */



/*
 * java.io.FileInputStream �κ����͵��ļ����ɲ��ø�������ȡ
 * ���÷���int available()��������ʣ���δ�������ֽ�����
 * 		   long skip(long l)����l���ֽڲ���
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\Ӧ��\\����\\tes.txt");
			fis.skip(1);
			int readData=fis.read();//���������ݷ���-1
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
