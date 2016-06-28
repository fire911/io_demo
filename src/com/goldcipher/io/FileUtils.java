package com.goldcipher.io;

import java.io.File;
import java.io.IOException;

/**
 * 遍历目录
 * @author lene
 *
 */
public class FileUtils {

	public static void main(String[] args) {
		try {
			listDirectory(new File("src"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void  listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException("不是一个有效的目录");
		}
//		String[] fileNames=dir.list();//dir.list()只返回根目录下得文件或文件夹，不包换子文件与子文件夹
//		for (String string : fileNames) {
//			File f=new File(dir.getAbsolutePath()+"/"+string);
//			System.out.println(file.toString()+"/"+f.getName());
//			if(f.isDirectory()){
//				listDirectory(f);
//			}
//		}
		File[] files=dir.listFiles();//File 类提供了直接返回file对象的方法
		for (File file : files) {
			System.out.println(file.toString());
			if(file.isDirectory()){
				listDirectory(file);
			}
		}
	} 
}
