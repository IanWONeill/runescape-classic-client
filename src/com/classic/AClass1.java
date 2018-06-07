package com.classic;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

abstract class AClass1 {
	
	static int anInt320;
	static int[] anIntArray81;
	int anInt321;
	static int anInt322;
	static BigInteger aBigInteger1 = new BigInteger("10001", 16);
	static int anInt323;
	String aString11;

	abstract Socket method174(boolean bool) throws IOException;

	Socket method175(final boolean bool) throws IOException {
		anInt322++;
		if (bool != true) {
			method176((byte) 122);
		}
		return new Socket(this.aString11, this.anInt321);
	}

	static int method176(final byte i) {
		anInt323++;
		int i_0_ = Class16_Sub1.method381(Class25.anInt302, Class52.aByteArray20, (byte) 120);
		if (i_0_ > 99999999) {
			i_0_ = 99999999 - i_0_;
		}
		Class25.anInt302 += 4;
		if (i != -123) {
			method176((byte) 47);
		}
		return i_0_;
	}
}
