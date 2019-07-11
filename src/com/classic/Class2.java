package com.classic;

import java.io.IOException;
import java.net.URL;

final class Class2
{
	static String[] aStringArray1 = new String[5000];
	static String[] aStringArray2;
	static int anInt4;
	static int anInt5;
	static String[] aStringArray3 = new String[100];
	static String aString1;
	static int anInt6;

	static void method3(final int i, final ByteBuffer class27_sub1)
	{
		if (Class27_Sub1_Sub1.aClass39_5 != null)
		{
			try
			{
				Class27_Sub1_Sub1.aClass39_5.method247(0L);
				Class27_Sub1_Sub1.aClass39_5.method248((class27_sub1.buffer), 24, i);
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
		anInt6++;
	}

	static void method4(final byte[] is)
	{
		anInt5++;
		if (Class45.anImageConsumer1 != null)
		{
			Class45.anImageConsumer1.setPixels(0, 0, IOException_Sub1.anInt672, Isaac.anInt60, Camera.aColorModel1,
			        is, 0, IOException_Sub1.anInt672);
			Class45.anImageConsumer1.imageComplete(3);
		}
	}

	static byte[] method5(final int index, final int i_1_, final String fileTitle) throws IOException
	{
		anInt4++;
		if (Class19.aByteArrayArray11[index] != null)
		{
			return Class19.aByteArrayArray11[index];
		}
		Class3.aString2 = fileTitle;
		Class3.anInt8 = i_1_;
		if (AClass1_Sub1.aClass47_1 != null)
		{
			final byte[] is = AClass1_Sub1.aClass47_1.method368(index);
			if ((is != null) && (Class44.method302(is.length, is) == Class21.anIntArray47[index]))
			{
				Class19.aByteArrayArray11[index] = Class24.method169(is);
				return Class19.aByteArrayArray11[index];
			}
		}
		final URL url = new URL(Class5.baseUrl, "content" + index + "_" + Long.toHexString(Class21.anIntArray47[index]));
		byte[] is = null;
		for (int i_3_ = 0; i_3_ < 3; i_3_++)
		{
			byte[] is_4_;
			try
			{
				is = Class3.method7(url, true);
				if (Class44.method302(is.length, is) != Class21.anIntArray47[index])
				{
					continue;
				}
				if (AClass1_Sub1.aClass47_1 != null)
				{
					AClass1_Sub1.aClass47_1.method366(is, is.length, index);
				}
				Class19.aByteArrayArray11[index] = Class24.method169(is);
				is_4_ = Class19.aByteArrayArray11[index];
			}
			catch (final IOException ioexception)
			{
				if (i_3_ == 2)
				{
					throw ioexception;
				}
				continue;
			}
			return is_4_;
		}
		if (is == null)
		{
			throw new IOException(new StringBuilder().append("Couldn't download file #").append(index).append(": crc=")
			        .append(Class21.anIntArray47[index]).toString());
		}
		final StringBuilder stringbuilder = new StringBuilder(new StringBuilder().append("Couldn't download file #")
		        .append(index).append(": crc=").append(Class21.anIntArray47[index]).toString());
		stringbuilder.append(new StringBuilder().append(" len=").append(is.length).toString());
		for (int i_5_ = 0; (i_5_ < is.length) && (i_5_ < 5); i_5_++)
		{
			stringbuilder.append(new StringBuilder().append(" ").append(is[i_5_]).toString());
		}
		throw new IOException(stringbuilder.toString());
	}
}
