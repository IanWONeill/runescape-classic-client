package com.classic;

import java.math.BigInteger;

class Class27_Sub1 extends Class27
{
	static int anInt605;
	static int anInt606;
	static int anInt607;
	int anInt608 = 0;
	static int anInt609;
	static int anInt610;
	static int anInt611;
	static int anInt612;
	static int anInt613;
	static int anInt614;
	static int anInt615;
	static int[] anIntArray142 = new int[100];
	static int anInt616;
	byte[] aByteArray24;
	static int anInt617;
	static int anInt618;
	static int anInt619;
	static int anInt620;
	static boolean[] aBoolArray10 = { false, false, false, false, false, false, false, false, false, false, false,
	        false };
	static int anInt621;
	static int anInt622;
	static int anInt623;
	static int anInt624;
	static long aLong15 = 0L;
	static int anInt625;
	static int anInt626;
	static int anInt627;
	static int anInt628;
	static int anInt629;

	private void method385(final int i, final byte[] is, final int i_0_, final int i_1_)
	{
		anInt611++;
		for (int i_2_ = i; i_2_ < (i_0_ + i); i_2_++)
		{
			is[i_2_] = (this.aByteArray24[this.anInt608++]);
		}
	}

	void method386(final int i, final int i_3_)
	{
		this.aByteArray24[this.anInt608++] = (byte) (i_3_ >> 16);
		anInt614++;
		this.aByteArray24[this.anInt608++] = (byte) (i_3_ >> 8);
		this.aByteArray24[this.anInt608++] = (byte) i_3_;
	}

	int method387(final int i)
	{
		anInt615++;
		if (i != 18381)
		{
			method408(73, -120, null, -59);
		}
		if (this.aByteArray24[this.anInt608] < 0)
		{
			return 0x7fffffff & method404((byte) 109);
		}
		return method392(false);
	}

	void method388(final int i, final int i_4_)
	{
		this.aByteArray24[this.anInt608++] = (byte) i_4_;
		anInt617++;
		if (i != -31566)
		{
			this.anInt608 = 107;
		}
	}

	void method389(final int i, final String string)
	{
		anInt607++;
		final int i_5_ = string.indexOf('\0');
		if (i_5_ >= 0)
		{
			throw new IllegalArgumentException("");
		}
		this.aByteArray24[this.anInt608++] = (byte) 0;
		this.anInt608 += Class33.method224(i, this.anInt608, (byte) -122, string, string.length(), this.aByteArray24);
		this.aByteArray24[this.anInt608++] = (byte) 0;
	}

	int method390(final int i)
	{
		anInt628++;
		final int i_6_ = ((this.aByteArray24[this.anInt608]) & 0xff);
		if (128 > i_6_)
		{
			return method403(false);
		}
		return method392(false) - 32768;
	}

	static void method391(final int i, final Class44 class44)
	{
		anInt605++;
		Class41.aClass44_2 = class44;
		if (i != 1993313440)
		{
			method391(17, null);
		}
	}

	int method392(final boolean bool)
	{
		this.anInt608 += 2;
		anInt610++;
		return ((0xff & (this.aByteArray24[this.anInt608 + -1]))
		        + (((this.aByteArray24[this.anInt608 + -2]) & 0xff) << 8));
	}

	boolean method393(final int i)
	{
		this.anInt608 -= 4;
		anInt612++;
		final int i_7_ = Class1.method1(-1, this.anInt608, this.aByteArray24, i);
		final int i_8_ = method404((byte) -99);
		if (i_8_ == i_7_)
		{
			return true;
		}
		return false;
	}

	void method394(final int i, final byte[] is, final byte i_9_, final int i_10_)
	{
		anInt616++;
		for (int i_11_ = i_10_; i_11_ < (i_10_ - -i); i_11_++)
		{
			this.aByteArray24[this.anInt608++] = is[i_11_];
		}
	}

	void method395(final int i, final boolean bool)
	{
		this.aByteArray24[this.anInt608++] = (byte) (i >> 24);
		anInt613++;
		this.aByteArray24[this.anInt608++] = (byte) (i >> 16);
		this.aByteArray24[this.anInt608++] = (byte) (i >> 8);
		this.aByteArray24[this.anInt608++] = (byte) i;
	}

	long method396(final byte i)
	{
		anInt626++;
		final long l = 0xffffffffL & method404((byte) -77);
		final long l_13_ = 0xffffffffL & method404((byte) -30);
		return l_13_ + (l << 32);
	}

	void method397(final int i, final byte i_14_)
	{
		this.aByteArray24[this.anInt608++] = (byte) (i >> 8);
		anInt606++;
		this.aByteArray24[this.anInt608++] = (byte) i;
	}

	String method398(final int i)
	{
		anInt624++;
		final byte i_15_ = (this.aByteArray24[this.anInt608++]);
		if (i_15_ != 0)
		{
			throw new IllegalStateException("");
		}
		final int i_16_ = this.anInt608;
		while ((this.aByteArray24[this.anInt608++]) != 0)
		{
			/* empty */
		}
		final int i_17_ = this.anInt608 - (i_16_ - i);
		if (i_17_ == 0)
		{
			return "";
		}
		return Class9.method62(i_17_, (byte) 121, i_16_, this.aByteArray24);
	}

	void method399(final byte i, final BigInteger biginteger, final BigInteger biginteger_18_)
	{
		anInt622++;
		final int i_19_ = this.anInt608;
		this.anInt608 = 0;
		final byte[] is = new byte[i_19_];
		method385(0, is, i_19_, -745619704);
		final BigInteger biginteger_20_ = new BigInteger(is);
		final BigInteger biginteger_21_ = biginteger_20_.modPow(biginteger_18_, biginteger);
		final byte[] is_22_ = biginteger_21_.toByteArray();
		this.anInt608 = 0;
		method397(is_22_.length, (byte) 104);
		method394(is_22_.length, is_22_, (byte) -112, 0);
	}

	void method400(final int i, final int i_23_)
	{
		anInt619++;
		if ((0 <= i_23_) && (128 > i_23_))
		{
			method388(-31566, i_23_);
		}
		else if ((0 <= i_23_) && (32768 > i_23_))
		{
			method397(i_23_ + 32768, (byte) 113);
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	void method401(final int i, final int i_24_)
	{
		anInt629++;
		this.aByteArray24[-i_24_ + this.anInt608 + -2] = (byte) (i_24_ >> 8);
		this.aByteArray24[(this.anInt608 - i_24_ - 1)] = (byte) i_24_;
	}

	void method402(final boolean bool, final String string)
	{
		if (bool)
		{
			method402(true, null);
		}
		anInt620++;
		final int i = string.indexOf('\0');
		if (i >= 0)
		{
			throw new IllegalArgumentException("");
		}
		this.anInt608 += Class33.method224(0, this.anInt608, (byte) -122, string, string.length(), this.aByteArray24);
		this.aByteArray24[this.anInt608++] = (byte) 0;
	}

	Class27_Sub1(final int i)
	{
		this.aByteArray24 = Class13.method109(23310, i);
	}

	int method403(final boolean bool)
	{
		anInt623++;
		return 0xff & (this.aByteArray24[this.anInt608++]);
	}

	int method404(final byte i)
	{
		this.anInt608 += 4;
		anInt618++;
		return ((0xff00 & ((this.aByteArray24[this.anInt608 - 2]) << 8))
		        + ((((this.aByteArray24[this.anInt608 + -4]) << 24) & ~0xffffff)
		                - -(((this.aByteArray24[this.anInt608 + -3]) & 0xff) << 16))
		        + ((this.aByteArray24[this.anInt608 - 1]) & 0xff));
	}

	Class27_Sub1(final byte[] is)
	{
		this.aByteArray24 = is;
	}

	byte[] method405(final byte i)
	{
		anInt627++;
		final byte[] is = new byte[this.anInt608];
		for (int i_27_ = 0; i_27_ < this.anInt608; i_27_++)
		{
			is[i_27_] = this.aByteArray24[i_27_];
		}
		return is;
	}

	byte method406(final int i)
	{
		if (i != -1)
		{
			method406(0);
		}
		anInt625++;
		return (this.aByteArray24[this.anInt608++]);
	}

	int method407(final byte i)
	{
		anInt609++;
		this.anInt608 += 2;
		int i_28_ = ((0xff00 & ((this.aByteArray24[this.anInt608 + -2]) << 8))
		        + (0xff & (this.aByteArray24[this.anInt608 + -1])));
		if (i_28_ > 32767)
		{
			i_28_ -= 65536;
		}
		return i_28_;
	}

	void method408(final int i, final int i_29_, final int[] is, final int i_30_)
	{
		anInt621++;
		if (i > -36)
		{
			method391(40, null);
		}
		final int i_31_ = this.anInt608;
		this.anInt608 = i_29_;
		final int i_32_ = (-i_29_ + i_30_) / 8;
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		{
			int i_34_ = method404((byte) -98);
			int i_35_ = method404((byte) -41);
			int i_36_ = 0;
			final int i_37_ = -1640531527;
			int i_38_ = 32;
			while (i_38_-- > 0)
			{
				i_34_ = ((is[i_36_ & 0x3] + i_36_) ^ (i_35_ + ((i_35_ >>> 5) ^ (i_35_ << 4)))) + i_34_;
				i_36_ += i_37_;
				i_35_ += ((i_34_ + ((i_34_ >>> 5) ^ (i_34_ << 4))) ^ (i_36_ + is[(0x1e46 & i_36_) >>> 11]));
			}
			this.anInt608 -= 8;
			method395(i_34_, true);
			method395(i_35_, true);
		}
		this.anInt608 = i_31_;
	}
}
