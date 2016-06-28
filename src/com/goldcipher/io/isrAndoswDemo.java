package com.goldcipher.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class isrAndoswDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("src/org/file/test/DataIO.java");
		InputStreamReader isr=new InputStreamReader(in);
//		int c;
//		while((c=isr.read())!=-1){
//			System.out.print((char)c);
//		}	
		char[] chars=new char[60]; 
		int b;
		while((b=isr.read(chars))!=-1){
			System.out.print(new String(chars,0,b));
		}
		in.close();
		isr.close();
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src/org/file/test/Test.java",true), "UTF-8");
		osw.write("OutputStreamWriter写入");
		osw.flush();
		osw.close();
	}

}
