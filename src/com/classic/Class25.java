package com.classic;

import java.awt.Font;
import java.awt.FontMetrics;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

final class Class25 implements Runnable
{
	static int[] anIntArray79;
	static int anInt295;
	static int anInt296;
	static int anInt297;
	static int anInt298;
	private final Class27_Sub1 aClass27_Sub1_1;
	private Class20 aClass20_2;
	private Class20 aClass20_3;
	static int anInt299;
	private final URL anURL2;
	private Class20 aClass20_4;
	static int anInt300;
	private final Class32 aClass32_2;
	static int anInt301;
	static int anInt302;
	private int anInt303;
	private DataInputStream aDataInputStream1;

	static boolean method170(final int i, final int i_0_, final Applet_Sub1 applet_sub1, String string)
	{
		anInt301++;
		boolean bool = false;
		string = string.toLowerCase();
		boolean bool_1_ = false;
		if (string.startsWith("helvetica"))
		{
			string = string.substring(9);
		}
		if (string.startsWith("h"))
		{
			string = string.substring(1);
		}
		if (string.startsWith("f"))
		{
			string = string.substring(1);
			bool = true;
		}
		if (string.startsWith("d"))
		{
			string = string.substring(1);
			bool_1_ = true;
		}
		if (string.endsWith(".jf"))
		{
			string = string.substring(0, string.length() - 3);
		}
		int i_2_ = 0;
		if (string.endsWith("b"))
		{
			i_2_ = 1;
			string = string.substring(0, string.length() + -1);
		}
		if (i_0_ != 29112)
		{
			return true;
		}
		if (string.endsWith("p"))
		{
			string = string.substring(0, -1 + string.length());
		}
		final int i_3_ = Integer.parseInt(string);
		final Font font = new Font("Helvetica", i_2_, i_3_);
		final FontMetrics fontmetrics = applet_sub1.getFontMetrics(font);
		final String string_4_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		Class10.anInt90 = 855;
		for (int i_5_ = 0; 95 > i_5_; i_5_++)
		{
			if (!Class52.method379(i_5_, bool_1_, i, font, 126, string_4_.charAt(i_5_), applet_sub1, fontmetrics))
			{
				return false;
			}
		}
		Class16.aByteArrayArray8[i] = new byte[Class10.anInt90];
		for (int i_6_ = 0; i_6_ < Class10.anInt90; i_6_++)
		{
			Class16.aByteArrayArray8[i][i_6_] = Class22.aByteArray11[i_6_];
		}
		if ((i_2_ == 1) && Class27_Sub1.aBoolArray10[i])
		{
			Class27_Sub1.aBoolArray10[i] = false;
			if (!method170(i, 29112, applet_sub1, new StringBuilder().append("f").append(i_3_).append("p").toString()))
			{
				return false;
			}
		}
		if (bool && !Class27_Sub1.aBoolArray10[i])
		{
			Class27_Sub1.aBoolArray10[i] = false;
			if (!method170(i, i_0_ ^ 0x0, applet_sub1,
			        new StringBuilder().append("d").append(i_3_).append("p").toString()))
			{
				return false;
			}
		}
		return true;
	}

	Class27_Sub1 method171(final int i)
	{
		anInt299++;
		if ((anInt303 ^ 0xffffffff) == i)
		{
			return aClass27_Sub1_1;
		}
		return null;
	}

	synchronized boolean method172(final int i)
	{
		anInt297++;
		if (anInt303 >= 2)
		{
			return true;
		}
		if (anInt303 == 0)
		{
			if (aClass20_2 == null)
			{
				aClass20_2 = aClass32_2.method216(anURL2, false);
			}
			if (aClass20_2.anInt216 == 0)
			{
				return false;
			}
			if (aClass20_2.anInt216 != 1)
			{
				anInt303++;
				aClass20_2 = null;
				return false;
			}
		}
		if (anInt303 == 1)
		{
			if (aClass20_4 == null)
			{
				aClass20_4 = aClass32_2.method221(anURL2.getHost(), 0, 443);
			}
			if (aClass20_4.anInt216 == 0)
			{
				return false;
			}
			if (aClass20_4.anInt216 != 1)
			{
				aClass20_4 = null;
				anInt303++;
				return false;
			}
		}
		if (aDataInputStream1 == null)
		{
			try
			{
				if (anInt303 == 0)
				{
					aDataInputStream1 = (DataInputStream) aClass20_2.anObject2;
				}
				if (anInt303 == 1)
				{
					final Socket socket = (Socket) aClass20_4.anObject2;
					socket.setSoTimeout(10000);
					final OutputStream outputstream = socket.getOutputStream();
					outputstream.write(17);
					outputstream.write(Class46_Sub1.method409(
					        new StringBuilder().append("JAGGRAB ").append(anURL2.getFile()).append("\n\n").toString(),
					        false));
					aDataInputStream1 = new DataInputStream(socket.getInputStream());
				}
				aClass27_Sub1_1.anInt608 = 0;
			}
			catch (final IOException ioexception)
			{
				finalize();
				anInt303++;
			}
		}
		if (aClass20_3 == null)
		{
			aClass20_3 = aClass32_2.method218(5, 0, this);
		}
		if (aClass20_3.anInt216 == 0)
		{
			return false;
		}
		if (aClass20_3.anInt216 != 1)
		{
			finalize();
			anInt303++;
		}
		return false;
	}

	@Override
	public void run()
	{
		anInt296++;
		try
		{
			int i;
			for (/**/; (aClass27_Sub1_1.aByteArray24.length > aClass27_Sub1_1.anInt608); aClass27_Sub1_1.anInt608 += i)
			{
				i = (aDataInputStream1.read(aClass27_Sub1_1.aByteArray24, aClass27_Sub1_1.anInt608,
				        (aClass27_Sub1_1.aByteArray24.length + -aClass27_Sub1_1.anInt608)));
				if (0 > i)
				{
					break;
				}
			}
			if (aClass27_Sub1_1.anInt608 == aClass27_Sub1_1.aByteArray24.length)
			{
				throw new Exception(new StringBuilder().append("HG1: ").append(aClass27_Sub1_1.aByteArray24.length)
				        .append(" ").append(anURL2).toString());
			}
			synchronized (this)
			{
				finalize();
				anInt303 = 3;
			}
		}
		catch (final Exception exception)
		{
			synchronized (this)
			{
				finalize();
				anInt303++;
			}
		}
	}

	static boolean method173(final byte i, final char c)
	{
		anInt298++;
		return ((('0' <= c) && (c <= '9')) || ((c >= 'A') && (c <= 'Z')) || (('a' <= c) && (c <= 'z')));
	}

	@Override
	protected void finalize()
	{
		anInt295++;
		if (aClass20_2 != null)
		{
			if (aClass20_2.anObject2 != null)
			{
				try
				{
					((DataInputStream) aClass20_2.anObject2).close();
				}
				catch (final Exception exception)
				{
					/* empty */
				}
			}
			aClass20_2 = null;
		}
		if (aClass20_4 != null)
		{
			if (aClass20_4.anObject2 != null)
			{
				try
				{
					((Socket) aClass20_4.anObject2).close();
				}
				catch (final Exception exception)
				{
					/* empty */
				}
			}
			aClass20_4 = null;
		}
		if (aDataInputStream1 != null)
		{
			try
			{
				aDataInputStream1.close();
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			aDataInputStream1 = null;
		}
		aClass20_3 = null;
	}

	Class25(final Class32 class32, final URL url, final int i)
	{
		anURL2 = url;
		aClass32_2 = class32;
		aClass27_Sub1_1 = new Class27_Sub1(i);
	}
}
