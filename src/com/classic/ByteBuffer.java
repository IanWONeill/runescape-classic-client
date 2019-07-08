package com.classic;

import java.math.BigInteger;

class ByteBuffer extends Class27
{
	int position = 0;
	static int[] anIntArray142 = new int[100];
	byte[] buffer;
	static boolean[] aBoolArray10 = { false, false, false, false, false, false, false, false, false, false, false, false };
	static long aLong15 = 0L;

	private void method385(final int i, final byte[] is, final int i_0_, final int i_1_)
	{
		for (int i_2_ = i; i_2_ < (i_0_ + i); i_2_++)
		{
			is[i_2_] = (this.buffer[this.position++]);
		}
	}

	void putTribyte(final int value)
	{
		this.buffer[this.position++] = (byte) (value >> 16);
		this.buffer[this.position++] = (byte) (value >> 8);
		this.buffer[this.position++] = (byte) value;
	}

	int method387(final int i)
	{
		if (i != 18381)
		{
			method408(73, -120, null, -59);
		}
		if (this.buffer[this.position] < 0)
		{
			return 0x7fffffff & readInt();
		}
		return method392(false);
	}

	void put(final int value)
	{
		this.buffer[this.position++] = (byte) value;
	}

	void method389(final int i, final String string)
	{
		final int i_5_ = string.indexOf('\0');
		if (i_5_ >= 0)
		{
			throw new IllegalArgumentException("");
		}
		this.buffer[this.position++] = (byte) 0;
		this.position += Class33.method224(i, this.position, (byte) -122, string, string.length(), this.buffer);
		this.buffer[this.position++] = (byte) 0;
	}

	int method390(final int i)
	{
		final int i_6_ = ((this.buffer[this.position]) & 0xff);
		if (128 > i_6_)
		{
			return readByte();
		}
		return method392(false) - 32768;
	}

	static void method391(final int i, final Class44 class44)
	{
		Class41.aClass44_2 = class44;
		if (i != 1993313440)
		{
			method391(17, null);
		}
	}

	int method392(final boolean bool)
	{
		this.position += 2;
		return ((0xff & (this.buffer[this.position + -1]))
		        + (((this.buffer[this.position + -2]) & 0xff) << 8));
	}

	boolean method393(final int i)
	{
		this.position -= 4;
		final int i_7_ = Class1.method1(-1, this.position, this.buffer, i);
		final int i_8_ = readInt();
		if (i_8_ == i_7_)
		{
			return true;
		}
		return false;
	}

	void method394(final int i, final byte[] is, final byte i_9_, final int i_10_)
	{
		for (int i_11_ = i_10_; i_11_ < (i_10_ - -i); i_11_++)
		{
			this.buffer[this.position++] = is[i_11_];
		}
	}

	void putInt(final int value)
	{
		this.buffer[this.position++] = (byte) (value >> 24);
		this.buffer[this.position++] = (byte) (value >> 16);
		this.buffer[this.position++] = (byte) (value >> 8);
		this.buffer[this.position++] = (byte) value;
	}

	long method396(final byte i)
	{
		final long l = 0xffffffffL & readInt();
		final long l_13_ = 0xffffffffL & readInt();
		return l_13_ + (l << 32);
	}

	void putShort(final int value)
	{
		this.buffer[this.position++] = (byte) (value >> 8);
		this.buffer[this.position++] = (byte) value;
	}

	String method398(final int i)
	{
		final byte i_15_ = (this.buffer[this.position++]);
		if (i_15_ != 0)
		{
			throw new IllegalStateException("");
		}
		final int i_16_ = this.position;
		while ((this.buffer[this.position++]) != 0)
		{
			/* empty */
		}
		final int i_17_ = this.position - (i_16_ - i);
		if (i_17_ == 0)
		{
			return "";
		}
		return Class9.method62(i_17_, (byte) 121, i_16_, this.buffer);
	}

	void method399(final BigInteger biginteger, final BigInteger biginteger_18_)
	{
		final int i_19_ = this.position;
		this.position = 0;
		final byte[] is = new byte[i_19_];
		method385(0, is, i_19_, -745619704);
		final BigInteger biginteger_20_ = new BigInteger(is);
		final BigInteger biginteger_21_ = biginteger_20_.modPow(biginteger_18_, biginteger);
		final byte[] is_22_ = biginteger_21_.toByteArray();
		this.position = 0;
		putShort(is_22_.length);
		method394(is_22_.length, is_22_, (byte) -112, 0);
	}

	void method400(final int i, final int i_23_)
	{
		if ((0 <= i_23_) && (128 > i_23_))
		{
			put(i_23_);
		}
		else if ((0 <= i_23_) && (32768 > i_23_))
		{
			putShort(i_23_ + 32768);
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	void method401(final int i, final int i_24_)
	{
		this.buffer[-i_24_ + this.position + -2] = (byte) (i_24_ >> 8);
		this.buffer[(this.position - i_24_ - 1)] = (byte) i_24_;
	}

	void putString(final String value)
	{
		final int i = value.indexOf('\0');
		if (i >= 0)
		{
			throw new IllegalArgumentException("");
		}
		this.position += Class33.method224(0, this.position, (byte) -122, value, value.length(), this.buffer);
		this.buffer[this.position++] = (byte) 0;
	}

	ByteBuffer(final int i)
	{
		this.buffer = Class13.method109(23310, i);
	}

	int readByte()
	{
		return this.buffer[this.position++] & 0xFF;
	}

	int readInt()
	{
		this.position += 4;
		return ((0xff00 & ((this.buffer[this.position - 2]) << 8))
		        + ((((this.buffer[this.position - 4]) << 24) & ~0xffffff)
		                - -(((this.buffer[this.position - 3]) & 0xff) << 16))
		        + ((this.buffer[this.position - 1]) & 0xff));
	}

	ByteBuffer(final byte[] is)
	{
		this.buffer = is;
	}

	byte[] toByteArray()
	{
		final byte[] is = new byte[this.position];
		for (int i_27_ = 0; i_27_ < this.position; i_27_++)
		{
			is[i_27_] = this.buffer[i_27_];
		}
		return is;
	}

	byte method406(final int i)
	{
		if (i != -1)
		{
			method406(0);
		}
		return (this.buffer[this.position++]);
	}

	int method407(final byte i)
	{
		this.position += 2;
		int i_28_ = ((0xff00 & ((this.buffer[this.position + -2]) << 8))
		        + (0xff & (this.buffer[this.position + -1])));
		if (i_28_ > 32767)
		{
			i_28_ -= 65536;
		}
		return i_28_;
	}

	void method408(final int i, final int i_29_, final int[] is, final int i_30_)
	{
		if (i > -36)
		{
			method391(40, null);
		}
		final int i_31_ = this.position;
		this.position = i_29_;
		final int i_32_ = (-i_29_ + i_30_) / 8;
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		{
			int i_34_ = readInt();
			int i_35_ = readInt();
			int i_36_ = 0;
			final int i_37_ = -1640531527;
			int i_38_ = 32;
			while (i_38_-- > 0)
			{
				i_34_ = ((is[i_36_ & 0x3] + i_36_) ^ (i_35_ + ((i_35_ >>> 5) ^ (i_35_ << 4)))) + i_34_;
				i_36_ += i_37_;
				i_35_ += ((i_34_ + ((i_34_ >>> 5) ^ (i_34_ << 4))) ^ (i_36_ + is[(0x1e46 & i_36_) >>> 11]));
			}
			this.position -= 8;
			putInt(i_34_);
			putInt(i_35_);
		}
		this.position = i_31_;
	}
}
