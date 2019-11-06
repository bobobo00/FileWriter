package cn.io.study02;
/**
 * 文件字符输出流
 * 1，创建源
 * 2，选择流
 * 3，操作  ：写出内容
 * 4，释放资源
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOtest05 {
	public static void main(String[] args) {
	File src=new File("aaa.txt");
	Writer writer=null;
	try {
		writer=new FileWriter(src);
		char[] flush= {'尚','学','t'};
		writer.write(flush,0,flush.length);
		writer.append("beautiful").append("gril");
		writer.flush();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(null!=writer) {
			writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
   }
}

