package com.BinaryToDecimal;

import java.util.function.Function;

public class BinaryToDecimal {




	public static void main(String...args) {
		Integer i=fbinToDec.apply(1000100011);
		System.out.println(i);
	}

	static Function<Integer,Integer> fbinToDec=i->{

		int binary=i;
		int power=0;
		int dec=0;
		while(binary!=0) {
			int lastDigit=binary%10;
			dec+=lastDigit*Math.pow(2, power);
			power++;
			binary/=10;

		}
		return dec;
	};

}
