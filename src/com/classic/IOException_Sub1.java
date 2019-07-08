package com.classic;

import java.io.IOException;

final class IOException_Sub1 extends IOException
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static int[] anIntArray149;
	static int anInt671 = 114;
	static int anInt672;
	static Class38 aClass38_8 = new Class38("WTWIP", "office", "_wip", 3);
	static String[] aStringArray40;
	static int anInt675;

	static void method459(final int[] is, final int i, final int i_0_, final int[] is_1_, int i_2_, final int i_3_,
	        int i_4_, final int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, final int i_12_,
	        int i_13_)
	{
		if (i_0_ > 0)
		{
			int i_14_ = 0;
			int i_15_ = 0;
			if (i_2_ != 0)
			{
				i_15_ = (i_6_ / i_2_) << 6;
				i_14_ = (i_13_ / i_2_) << 6;
			}
			i_8_ <<= 2;
			if (0 <= i_14_)
			{
				if (i_14_ > 4032)
				{
					i_14_ = 4032;
				}
			}
			else
			{
				i_14_ = 0;
			}
			for (int i_16_ = i_0_; 0 < i_16_; i_16_ -= 16)
			{
				i_11_ = i_14_;
				i_2_ += i_5_;
				i_10_ = i_15_;
				i_13_ += i_12_;
				i_6_ = i_3_ + i_6_;
				if (i_2_ != 0)
				{
					i_14_ = (i_13_ / i_2_) << 6;
					i_15_ = (i_6_ / i_2_) << 6;
				}
				if (i_14_ >= 0)
				{
					if (i_14_ > 4032)
					{
						i_14_ = 4032;
					}
				}
				else
				{
					i_14_ = 0;
				}
				final int i_17_ = (-i_10_ + i_15_) >> 4;
				final int i_18_ = (i_14_ + -i_11_) >> 4;
				i_11_ += i_7_ & 0xc0000;
				int i_19_ = i_7_ >> 20;
				i_7_ = i_8_ + i_7_;
				if (i_16_ < 16)
				{
					for (int i_20_ = 0; i_16_ > i_20_; i_20_++)
					{
						if ((i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_) != 0)
						{
							is_1_[i_9_] = i_4_;
						}
						i_9_++;
						i_10_ = i_17_ + i_10_;
						i_11_ += i_18_;
						if ((0x3 & i_20_) == 3)
						{
							i_11_ = (0xfff & i_11_) - -(i_7_ & 0xc0000);
							i_19_ = i_7_ >> 20;
							i_7_ = i_8_ + i_7_;
						}
					}
				}
				else
				{
					if (0 != (i_4_ = is[(i_10_ & 0xfc0) - -(i_11_ >> 6)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if ((i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_9_++;
					i_10_ = i_17_ + i_10_;
					i_11_ += i_18_;
					if ((i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_10_ = i_17_ + i_10_;
					i_9_++;
					if (0 != (i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					i_19_ = i_7_ >> 20;
					i_11_ = (0xc0000 & i_7_) + (i_11_ & 0xfff);
					if (0 != (i_4_ = is[(0xfc0 & i_10_) - -(i_11_ >> 6)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_7_ = i_8_ + i_7_;
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if ((i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if ((i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_10_ = i_17_ + i_10_;
					i_11_ += i_18_;
					i_9_++;
					if (0 != (i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_10_ = i_17_ + i_10_;
					i_9_++;
					i_11_ += i_18_;
					i_11_ = (i_11_ & 0xfff) - -(0xc0000 & i_7_);
					i_19_ = i_7_ >> 20;
					if ((i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_7_ = i_8_ + i_7_;
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if ((i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if (0 != (i_4_ = is[(0xfc0 & i_10_) + (i_11_ >> 6)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_10_ = i_17_ + i_10_;
					i_11_ += i_18_;
					i_9_++;
					if ((i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_9_++;
					i_11_ += i_18_;
					i_10_ = i_17_ + i_10_;
					i_11_ = (i_7_ & 0xc0000) + (0xfff & i_11_);
					i_19_ = i_7_ >> 20;
					i_7_ = i_8_ + i_7_;
					if (0 != (i_4_ = is[(0xfc0 & i_10_) - -(i_11_ >> 6)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_9_++;
					i_11_ += i_18_;
					i_10_ = i_17_ + i_10_;
					if (0 != (i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_9_++;
					i_10_ = i_17_ + i_10_;
					if ((i_4_ = is[(i_10_ & 0xfc0) + (i_11_ >> 6)] >>> i_19_) != 0)
					{
						is_1_[i_9_] = i_4_;
					}
					i_11_ += i_18_;
					i_10_ = i_17_ + i_10_;
					i_9_++;
					if (0 != (i_4_ = is[(i_11_ >> 6) + (0xfc0 & i_10_)] >>> i_19_))
					{
						is_1_[i_9_] = i_4_;
					}
					i_9_++;
				}
			}
		}
	}

	IOException_Sub1(final String string)
	{
		super(string);
	}

	static byte[] method460(final int i, final byte i_21_, final byte[] is, byte[] is_22_, String string)
	{
		final int i_23_ = ((0xff & is[0]) * 256) - -(is[1] & 0xff);
		int i_24_ = 0;
		string = string.toUpperCase();
		if (i_21_ != -68)
		{
			anIntArray149 = null;
		}
		for (int i_25_ = 0; string.length() > i_25_; i_25_++)
		{
			i_24_ = (i_24_ * 61) + (string.charAt(i_25_) + -32);
		}
		int i_26_ = (i_23_ * 10) + 2;
		for (int i_27_ = 0; i_23_ > i_27_; i_27_++)
		{
			final int i_28_ = (((0xff & is[(i_27_ * 10) + 4]) * 256)
			        + (((0xff & is[(i_27_ * 10) + 2]) * 16777216) - -((0xff & is[(i_27_ * 10) + 3]) * 65536))
			        + (is[(i_27_ * 10) - -5] & 0xff));
			final int i_29_ = ((((0xff & is[(i_27_ * 10) + 6]) * 65536) + ((is[(i_27_ * 10) + 7] & 0xff) * 256))
			        - -(0xff & is[(i_27_ * 10) - -8]));
			final int i_30_ = (((is[(i_27_ * 10) + 10] & 0xff) * 256) + ((is[(i_27_ * 10) + 9] & 0xff) * 65536)
			        + (is[(i_27_ * 10) + 11] & 0xff));
			if (i_28_ == i_24_)
			{
				if (is_22_ == null)
				{
					is_22_ = new byte[i + i_29_];
				}
				if (i_30_ != i_29_)
				{
					Class8.method58(is_22_, i_29_, is, i_30_, i_26_);
				}
				else
				{
					for (int i_31_ = 0; i_29_ > i_31_; i_31_++)
					{
						is_22_[i_31_] = is[i_26_ + i_31_];
					}
				}
				return is_22_;
			}
			i_26_ += i_30_;
		}
		return null;
	}
}
