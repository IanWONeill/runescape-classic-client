package com.classic;

import java.io.IOException;
import java.net.URL;

final class Class3
{
	static int anInt7 = 0;
	static int anInt8 = 0;
	static String aString2 = "";
	static String[] aStringArray4 = new String[100];
	static int anInt9;
	static int[] anIntArray2;
	static int[] anIntArray3;
	static int anInt10;

	static int method6(final long l, final int i)
	{
		Class36.method229(l, 12);
		anInt10++;
		if (i != 2000000)
		{
			return -65;
		}
		return PacketConstruction.aCalendar1.get(1);
	}

	static byte[] method7(final URL url, final boolean bool, final byte i) throws IOException
	{
		anInt9++;
		final Class25 class25 = new Class25(GameFrame.aClass32_4, url, 2000000);
		if (bool)
		{
			Class48.method370(0, 10140, "");
		}
		while (!class25.method172())
		{
			Class7.method51(49, 50L);
		}
		final ByteBuffer class27_sub1 = class25.method171(-4);
		if (class27_sub1 == null)
		{
			throw new IOException("Couldn't download file");
		}
		if (bool)
		{
			Class48.method370(100, 10140, "");
		}
		return class27_sub1.method405((byte) -19);
	}
}
