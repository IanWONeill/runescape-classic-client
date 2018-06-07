package com.classic;

import java.math.BigInteger;

final class RuntimeException_Sub1 extends RuntimeException
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	String aString21;
	static int anInt676;
	Throwable aThrowable1;
	static int anInt677;
	static BigInteger aBigInteger2 = (new BigInteger(
	        "ca950472ae9765185bf290ff54a823b1d29b46dc3cf676203bb871efa278d9c49e16defc53ff479305123454505082f4700b0da381047f51b872f9bbeea653f21fd248a10ff5239b30234add35913cb6068d316edd418611334ae047fcd9acb7b0c13b30393a26204dc85183e0a95555c01bee800440e974bb9b441f464f4057",
	        16));
	static String[] aStringArray41 = new String[200];
	static Class24 aClass24_3 = new Class24("RC", 1);
	static int[] anIntArray150;
	static String[] aStringArray42;
	static Class24 aClass24_4;

	RuntimeException_Sub1(final Throwable throwable, final String string)
	{
		this.aString21 = string;
		this.aThrowable1 = throwable;
	}

	static int method461(String string, final byte[] is, final boolean bool)
	{
		anInt677++;
		final int i = Class10.method84(-94, is, 0);
		string = string.toUpperCase();
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < string.length(); i_1_++)
		{
			i_0_ = (i_0_ * 61) + (string.charAt(i_1_) + -32);
		}
		int i_2_ = (i * 10) + 2;
		for (int i_3_ = 0; i > i_3_; i_3_++)
		{
			final int i_4_ = ((0xff & is[(i_3_ * 10) + 5]) + ((0xff & is[(i_3_ * 10) - -3]) * 65536)
			        + ((is[(i_3_ * 10) + 2] & 0xff) * 16777216) + ((is[(i_3_ * 10) + 4] & 0xff) * 256));
			final int i_5_ = (((is[(i_3_ * 10) - -10] & 0xff) * 256)
			        + (((0xff & is[(i_3_ * 10) + 9]) * 65536) - -(is[(i_3_ * 10) + 11] & 0xff)));
			if (i_0_ == i_4_)
			{
				return i_2_;
			}
			i_2_ += i_5_;
		}
		if (bool)
		{
			method461(null, null, true);
		}
		return 0;
	}

	static int method462(final byte i)
	{
		anInt676++;
		return Class3.method6(System.currentTimeMillis(), 2000000);
	}
}
