package m2d204;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//BufferedReader:����Ҫ�Զ���char����
public class Test4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * FileInputStream fis=new FileInputStream("D:\\Ӧ��\\����\\tes.txt");
		 * 
		 * InputStreamReader is=new InputStreamReader(fis);
		 * 
		 * BufferedReader br=new BufferedReader(is);
		 */
		FileReader fr=null;
		fr = new FileReader("D:\\Ӧ��\\����\\tes.txt");
		/*��һ�����Ĺ��췽������Ҫ����һ����ʱ�������������Ϊ���ڵ���
		 * �ⲿ�����װ�����������������װ��/������
		 */
		BufferedReader br=new BufferedReader(fr);
		
		//��һ��
		String fl1=br.readLine();//��ȡһ���ı��У��������з�
		System.out.println(fl1);
		//���ڶ���
		String fl2=br.readLine();
		System.out.println(fl2);
		
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		br.close();
	}

}
