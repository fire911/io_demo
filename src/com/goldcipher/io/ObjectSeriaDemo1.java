package com.goldcipher.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 序列化和反序列化
 * @author lene
 *
 */
public class ObjectSeriaDemo1 {
	public static void main(String[] args) throws Exception{
		//对象序列化
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("demo/raf2.txt"));
		oos.writeObject(new Student(1, "martin", 25));
		oos.flush();
		oos.close();
		//对象反序列化
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo/raf2.txt"));
		System.out.println((Student)ois.readObject());
		ois.close();
	}
}
