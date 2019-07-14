package com.classic;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class Class28
{
	private long aLong1;
	private RandomAccessFile aRandomAccessFile1;
	private final long aLong2;
	private void method179() throws IOException
	{
		if (aRandomAccessFile1 != null)
		{
			aRandomAccessFile1.close();
			aRandomAccessFile1 = null;
		}
	}

	static byte[] method180(final int i, final byte[] is, final int i_1_)
	{
		final byte[] is_2_ = new byte[i];
		for (int i_3_ = 0; i > i_3_; i_3_++)
		{
			is_2_[i_3_] = Class48.aByteArray19[Class52.bitwiseAnd(is[i_1_ + i_3_], 255)];
		}
		return is_2_;
	}

	void method181(final long l) throws IOException
	{
		aRandomAccessFile1.seek(l);
		aLong1 = l;
	}

	@Override
	protected void finalize() throws Throwable
	{
		if (aRandomAccessFile1 != null)
		{
			System.out.println("");
			method179();
		}
	}

	int method182(final byte[] is, final int i_4_, final int i_5_) throws IOException
	{
		final int i_6_ = aRandomAccessFile1.read(is, i_4_, i_5_);
		if (0 < i_6_)
		{
			aLong1 += i_6_;
		}
		return i_6_;
	}

	void method183(final int i, final int i_8_, final byte[] is) throws IOException
	{
		if (aLong2 < (aLong1 + i))
		{
			aRandomAccessFile1.seek(aLong2);
			aRandomAccessFile1.write(1);
			throw new EOFException();
		}
		aRandomAccessFile1.write(is, i_8_, i);
		aLong1 += i;
	}

	long method184() throws IOException
	{
		return aRandomAccessFile1.length();
	}

	Class28(final File file, final String string, long l) throws IOException
	{
		if (-1L == l)
		{
			l = 9223372036854775807L;
		}
		if (l < file.length())
		{
			file.delete();
		}
		aRandomAccessFile1 = new RandomAccessFile(file, string);
		aLong2 = l;
		aLong1 = 0L;
		final int i = aRandomAccessFile1.read();
		if ((i != -1) && !string.equals("r"))
		{
			aRandomAccessFile1.seek(0L);
			aRandomAccessFile1.write(i);
		}
		aRandomAccessFile1.seek(0L);
	}
}
