package com.classic;

import java.io.IOException;
import java.net.URL;

final class Class3
{
	static int anInt7 = 0;
	static int anInt8 = 0;
	static String aString2 = "";
	static String[] aStringArray4 = new String[100];
	static int[] anIntArray2;
	static int[] anIntArray3;

	static int method6(final long l, final int i)
	{
		Class36.method229(l, 12);
		if (i != 2000000)
		{
			return -65;
		}
		return PacketConstruction.aCalendar1.get(1);
	}

	static byte[] method7(final URL url, final boolean updateLoadingBar) throws IOException
	{
		final Class25 class25 = new Class25(GameFrame.aClass32_4, url, 2000000);
		if (updateLoadingBar)
		{
			Class48.drawLoadingBar(0, "");
		}
		while (!class25.method172())
		{
			Isaac.unknownSleep(49, 50L);
		}
		final ByteBuffer buffer = class25.getBuffer(-4);
		if (buffer == null)
		{
			throw new IOException("Couldn't download file");
		}
		if (updateLoadingBar)
		{
			Class48.drawLoadingBar(100, "");
		}
		
		return buffer.toByteArray();
	}
}
