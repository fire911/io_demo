package com.goldcipher.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
/**
 * 使用RandomAccessFile类对文件进行读写操作
 * @author lene
 *
 */
public class RafDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		File path=new File("demo");
		if(!path.exists())
			path.mkdirs();
		File file=new File(path, "raf.txt");
		if(!file.exists())
			file.createNewFile();
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
//		raf.seek(raf.length());//设置指针
		System.out.println(raf.getFilePointer());//指针默认从0开始
		raf.write('A');
		String s="中文";
		raf.write(s.getBytes());
		System.out.println(raf.length());
		raf.seek(0);//读取文件必须把指针移到头部
		byte[] bytes=new byte[(int) raf.length()];
		raf.read(bytes);
		String s1=new String(bytes);
		System.out.println(Arrays.toString(bytes));
		System.out.println(s1);
		raf.close();
	}

}
