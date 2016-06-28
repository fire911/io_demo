package com.goldcipher.io;

import java.io.File;
import java.io.IOException;
/**
 * File类常用API
 * @author lene
 *
 */
public class FileTest {
	
	public static void main(String[] args) throws IOException {
		//创建File对象
		File file=new File("src/org/file/test/ex/xxx.txt");
		if(!file.exists()){
			if(file.isDirectory()){
				System.out.println();
			}
			//file.createNewFile();
			System.out.println("有此文件"+file.length());
		}else{
			file.delete();
		}
		//System.out.println(System.getProperty("user.dir"));
	}
}
