package com.classic;

import java.io.IOException;
import java.net.URL;

import org.custom.Custom;

final class Class2
{
	static String[] modelNames = new String[5000];
	static String[] aStringArray3 = new String[100];
	static String aString1;

	static void method3(final int i, final ByteBuffer class27_sub1)
	{
		if (Class27_Sub1_Sub1.aClass39_5 != null)
		{
			try
			{
				Class27_Sub1_Sub1.aClass39_5.method247(0L);
				Class27_Sub1_Sub1.aClass39_5.method248((class27_sub1.buffer), 24, i);
			}
			catch (final Exception exception) {}
		}
	}

	static void method4(final byte[] is)
	{
		if (Class45.anImageConsumer1 != null)
		{
			Class45.anImageConsumer1.setPixels(0, 0, IOException_Sub1.anInt672, Isaac.anInt60, Camera.aColorModel1,
			        is, 0, IOException_Sub1.anInt672);
			Class45.anImageConsumer1.imageComplete(3);
		}
	}

	static byte[] method5(final int packIndex, final int percentage, final String fileTitle) throws IOException
	{
		if (DataFileVariables.contentPackData[packIndex] != null)
		{
			return DataFileVariables.contentPackData[packIndex];
		}
		Class3.maybe_loadingText = fileTitle;
		Class3.loadingPercentage = percentage;
		if (AClass1_Sub1.aClass47_1 != null)
		{
			final byte[] is = AClass1_Sub1.aClass47_1.method368(packIndex);
			if ((is != null) && (Class44.maybe_crc(is.length, is) == Class21.contentPackCrcs[packIndex]))
			{
				DataFileVariables.contentPackData[packIndex] = Class2.method169(is);
				return DataFileVariables.contentPackData[packIndex];
			}
		}
		
		final URL url = new URL(Class36.baseUrl, "content" + packIndex + "_" + Long.toHexString(Class21.contentPackCrcs[packIndex]));
		byte[] is = null;
		for (int i_3_ = 0; i_3_ < 3; i_3_++)
		{
			byte[] is_4_;
			try
			{
				is = Class3.method7(url, true);
				if (Class44.maybe_crc(is.length, is) != Class21.contentPackCrcs[packIndex])
				{
					continue;
				}
				if (AClass1_Sub1.aClass47_1 != null)
				{
					AClass1_Sub1.aClass47_1.method366(is, is.length, packIndex);
				}
				DataFileVariables.contentPackData[packIndex] = Class2.method169(is);
				is_4_ = DataFileVariables.contentPackData[packIndex];
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
			throw new IOException(new StringBuilder().append("Couldn't download file #").append(packIndex).append(": crc=")
			        .append(Class21.contentPackCrcs[packIndex]).toString());
		}
		final StringBuilder stringbuilder = new StringBuilder(new StringBuilder().append("Couldn't download file #")
		        .append(packIndex).append(": crc=").append(Class21.contentPackCrcs[packIndex]).toString());
		stringbuilder.append(new StringBuilder().append(" len=").append(is.length).toString());
		for (int i_5_ = 0; (i_5_ < is.length) && (i_5_ < 5); i_5_++)
		{
			stringbuilder.append(new StringBuilder().append(" ").append(is[i_5_]).toString());
		}
		throw new IOException(stringbuilder.toString());
	}

	static byte[] method169(final byte[] is)
	{
		final int i_0_ = ((((is[0] << 16) & 0xff0000) + ((is[1] & 0xff) << 8)) - -(0xff & is[2]));
		final int i_2_ = (((is[3] & 0xff) << 16) - -(0xff00 & (is[4] << 8))) + (is[5] & 0xff);
		if (i_0_ == i_2_)
		{
			final byte[] is_3_ = new byte[is.length - 6];
			Class14.method112(is, 6, is_3_, 0, is_3_.length);
			return is_3_;
		}
		Class48.drawLoadingBar(0, "Unpacking ");
		final byte[] is_4_ = new byte[i_0_];
		DataFileDecrypter.unpackData(is_4_, i_0_, is, 6);
		return is_4_;
	}
}
