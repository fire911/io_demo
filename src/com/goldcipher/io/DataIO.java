package com.goldcipher.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) throws IOException {
			DataInputStream dis=new DataInputStream(new FileInputStream("demo/raf.txt"));
			byte[] bus=new byte[8*1024];
			dis.readFully(bus, 0, bus.length);
			dis.close();
	}
}
