package com.Base64Encoding;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encoder e=Base64.getEncoder();
		String o="aaj tujhe payar aaya hai";
		byte[] arr=o.getBytes(StandardCharsets.ISO_8859_1);
		
		String base64encodedString=e.encodeToString(arr);
		System.out.println("Original String: " + o); System.out.println("Base64 Encoded String :" + base64encodedString);

		
		
	}

}
