package com.goldcipher.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IODemo {

	public static void main(String[] args) {
		try {
			// System.out.println(0xf);
			// printFile("src/org/file/test/FileTest.java");
//			printFile1("src/org/file/test/FileTest.java");
			copyFile(new File("demo/raf.txt"), new File("demo/raf1.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用FileInputStream读取文件 单字节读取 适用小点的文件
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public static void printFile(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		int i = 0;
		int f = 1;
		while ((i = in.read()) != -1) {
			if (i <= 0xf) {
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(i) + "  ");
			if (f++ % 10 == 0) {
				System.out.println();
			}
		}
		in.close();
	}

	/**
	 * 使用FileInputStream读取文件 批量读取 适用于大文件
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public static void printFile1(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[8 * 1024];
		// int bytes=in.read(buf, 0, buf.length);
		int bytes = 0;
		int j = 1;
		// 只读取了一次，大文件可能读取不完整
		// for (int i = 0; i < bytes; i++) {
		// if(buf[i]<=0xf){
		// System.out.print("0");
		// }
		// System.out.print(Integer.toHexString(buf[i]&0xff)+" ");
		// if(j++%10==0){
		// System.out.println();
		// }
		// }

		// 读取完整文件
		while ((bytes = in.read(buf, 0, buf.length)) != -1) {
			for (int i = 0; i < bytes; i++) {
				if (buf[i] <= 0xf) {// 如果为负数
					System.out.print("0");
				}
				// byte类型8位，int类型32位，为避免数据转换错误，通过0xff将高24位清零
				System.out.print(Integer.toHexString(buf[i] & 0xff) + "  ");
				if (j++ % 10 == 0) {
					System.out.println();
				}
			}
		}
		in.close();
	}
	
	/**
	 * 复制文件
	 * 使用FileInputStream读取文件
	 * 使用FileOutputStream写入文件
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(File srcFile,File destFile) throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件："+srcFile+"不存在。");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"不是文件");
		}
		FileInputStream in=new FileInputStream(srcFile);
		FileOutputStream out=new FileOutputStream(destFile,true);
		byte[] bus=new byte[8*1024];
		int b;
		while((b=in.read(bus, 0, bus.length))!=-1){
			out.write(bus, 0, b);
			out.flush();
		}
		out.close();
		in.close();
	}
}
