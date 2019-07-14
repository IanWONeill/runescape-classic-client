package com.classic;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

abstract class AClass1 {
	
	static int anInt320;
	int port;
	static BigInteger aBigInteger1 = new BigInteger("10001", 16);
	String host;

	abstract Socket method174(boolean bool) throws IOException;

	Socket createSocket() throws IOException {
		return new Socket(this.host, this.port);
	}

	static int method176() {
		int result = StreamClass.method381(Class25.maybe_offset, Class52.integerData);
		if (result > 99999999) {
			result = 99999999 - result;
		}
		Class25.maybe_offset += 4;
		return result;
	}
}
