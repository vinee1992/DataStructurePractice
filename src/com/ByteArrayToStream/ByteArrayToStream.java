package com.ByteArrayToStream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Google is god";
byte[] b=str.getBytes(StandardCharsets.UTF_8);		

InputStream is=new ByteArrayInputStream(b);

		
	}
	
	
    /*
     * Read String from InputStream and closes it
     */
	public static String streamToString(InputStream is, Charset encoding) {
		
		
		
		BufferedReader br= BufferedReader(new InputStreamReader(is, encoding));
	}


	private static BufferedReader BufferedReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated method stub
		return null;
	}
}
