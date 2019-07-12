package com.classic;

import java.math.BigInteger;

class ByteBuffer extends Class27
{
	int position = 0;
	static int[] anIntArray142 = new int[100];
	byte[] buffer;
	static boolean[] aBoolArray10 = { false, false, false, false, false, false, false, false, false, false, false, false };
	static long aLong15 = 0L;

	private void readBytes(final int destOffset, final byte[] dest, final int i_0_)
	{
		for (int index = destOffset; index < (i_0_ + destOffset); index++)
		{
			dest[index] = this.buffer[this.position++];
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
		return readUnsignedShort();
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
		this.position += Class33.method224(i, this.position, string, string.length(), this.buffer);
		this.buffer[this.position++] = (byte) 0;
	}

	int method390()
	{
		final int i_6_ = ((this.buffer[this.position]) & 0xff);
		if (128 > i_6_)
		{
			return readUnsignedByte();
		}
		return readUnsignedShort() - 32768;
	}

	static void method391(final int i, final Class44 class44)
	{
		Camera.aClass44_2 = class44;
		if (i != 1993313440)
		{
			method391(17, null);
		}
	}

	int readUnsignedShort()
	{
		this.position += 2;
		return ((0xff & (this.buffer[this.position - 1]))
		        + (((this.buffer[this.position - 2]) & 0xff) << 8));
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

	void writeBytes(final int length, final byte[] src, final int srcOffset)
	{
		for (int index = srcOffset; index < (srcOffset + length); index++)
		{
			this.buffer[this.position++] = src[index];
		}
	}

	void putInt(final int value)
	{
		this.buffer[this.position++] = (byte) (value >> 24);
		this.buffer[this.position++] = (byte) (value >> 16);
		this.buffer[this.position++] = (byte) (value >> 8);
		this.buffer[this.position++] = (byte) value;
	}

	long method396()
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

	String readString()
	{
		final byte i_15_ = this.buffer[this.position++];
		if (i_15_ != 0)
		{
			throw new IllegalStateException("");
		}
		final int startPos = this.position;
		while ((this.buffer[this.position++]) != 0);
		final int maybe_length = this.position - (startPos + 1);
		if (maybe_length == 0)
		{
			return "";
		}
		return Class9.method62(maybe_length, startPos, this.buffer);
	}

	void encodeWithRSA(final BigInteger modulus, final BigInteger exponent)
	{
		final int pointerPosition = this.position;
		this.position = 0;
		
		final byte[] encodedBuffer = new byte[pointerPosition];
		readBytes(0, encodedBuffer, pointerPosition);
		
		final BigInteger biginteger_20_ = new BigInteger(encodedBuffer);
		final BigInteger biginteger_21_ = biginteger_20_.modPow(exponent, modulus);
		final byte[] result = biginteger_21_.toByteArray();
		this.position = 0;
		putShort(result.length);
		writeBytes(result.length, result, 0);
	}

	void method400(final int i_23_)
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

	void method401(final int i_24_)
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
		this.position += Class33.method224(0, this.position, value, value.length(), this.buffer);
		this.buffer[this.position++] = (byte) 0;
	}

	ByteBuffer(final int i)
	{
		this.buffer = Class13.method109(23310, i);
	}

	int readUnsignedByte()
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

	byte readByte()
	{
		return this.buffer[this.position++];
	}

	int method407()
	{
		this.position += 2;
		int i_28_ = ((0xff00 & ((this.buffer[this.position - 2]) << 8))
		        + (0xff & (this.buffer[this.position - 1])));
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
