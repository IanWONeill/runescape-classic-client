package com.classic;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class Class27_Sub1_Sub1 extends ByteBuffer
{
	static int[] anIntArray146;
	static int[] anIntArray147;
	static int portOffset;
	private int anInt665;
	static String[] aStringArray39 = { "Enter number of items to stake and press enter" };
	static int[] anIntArray148;
	private static byte[] aByteArray27;
	static Class39 aClass39_5;

	void method454(final int i)
	{
		if (i != -1192)
		{
			aByteArray27 = null;
		}
		anInt665 = this.position * 8;
	}

	Class27_Sub1_Sub1(final int i)
	{
		super(i);
	}

	static void readFromPath(final String string, final byte[] is, final int length) throws IOException
	{
		final InputStream inputstream = Class51.method376(string);
		final DataInputStream datainputstream = new DataInputStream(inputstream);
		try
		{
			datainputstream.readFully(is, 0, length);
		}
		catch (final EOFException eofexception) {}
		datainputstream.close();
	}

	int method456(int i_1_)
	{
		int i_2_ = anInt665 >> 3;
		int i_3_ = -(anInt665 & 0x7) + 8;
		int i_4_ = 0;
		anInt665 += i_1_;
		for (/**/; i_3_ < i_1_; i_3_ = 8)
		{
			i_4_ += ((Class4.anIntArray4[i_3_] & this.buffer[i_2_++]) << (-i_3_ + i_1_));
			i_1_ -= i_3_;
		}
		if (i_3_ == i_1_)
		{
			i_4_ += (this.buffer[i_2_] & Class4.anIntArray4[i_3_]);
		}
		else
		{
			i_4_ += (this.buffer[i_2_] >> (-i_1_ + i_3_)) & Class4.anIntArray4[i_1_];
		}
		return i_4_;
	}

	int method457(final int i)
	{
		if (i != 32253)
		{
			method458();
		}
		return anInt665;
	}

	void method458()
	{
		this.position = (anInt665 + 7) / 8;
	}

	static
	{
		anIntArray146 = new int[256];
		anIntArray147 = new int[2048];
		anIntArray148 = new int[512];
		aByteArray27 = new byte[64];
		for (int i = 0; i < 256; i++)
		{
			anIntArray148[i] = (int) (32768.0 * Math.sin(0.02454369 * i));
			anIntArray148[i + 256] = (int) (32768.0 * Math.cos(0.02454369 * i));
		}
		for (int i = 0; i < 1024; i++)
		{
			anIntArray147[i] = (int) (Math.sin(i * 0.00613592315) * 32768.0);
			anIntArray147[i + 1024] = (int) (Math.cos(i * 0.00613592315) * 32768.0);
		}
		for (int i = 0; i < 10; i++)
		{
			aByteArray27[i] = (byte) (i + 48);
		}
		for (int i = 0; 26 > i; i++)
		{
			aByteArray27[i - -10] = (byte) (i + 65);
		}
		for (int i = 0; 26 > i; i++)
		{
			aByteArray27[i + 36] = (byte) (i + 97);
		}
		aByteArray27[63] = (byte) 36;
		aByteArray27[62] = (byte) -93;
		for (int i = 0; 10 > i; i++)
		{
			anIntArray146[i + 48] = i;
		}
		for (int i = 0; i < 26; i++)
		{
			anIntArray146[65 - -i] = i + 10;
		}
		for (int i = 0; i < 26; i++)
		{
			anIntArray146[i + 97] = i + 36;
		}
		anIntArray146[163] = 62;
		anIntArray146[36] = 63;
		aClass39_5 = null;
	}
}
