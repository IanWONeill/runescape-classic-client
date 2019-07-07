package com.classic;

final class Class44
{
	private byte[] aByteArray17;
	private final int[] anIntArray111;
	static String[] aStringArray30 = { "Type the number of items to buy and press enter" };
	static int[] anIntArray112;
	private int[] anIntArray113;
	static int[] anIntArray114 = new int[256];

	int method301(final byte[] is, final byte i, final byte[] is_0_, int i_1_, final int i_2_, int i_3_)
	{
		if (i_3_ == 0)
		{
			return 0;
		}
		if (i != -11)
		{
			aByteArray17 = null;
		}
		i_3_ = i_1_ + i_3_;
		int i_4_ = 0;
		int i_5_ = i_2_;
		for (;;)
		{
			final byte i_6_ = is_0_[i_5_];
			if (0 > i_6_)
			{
				i_4_ = anIntArray113[i_4_];
			}
			else
			{
				i_4_++;
			}
			int i_7_;
			if (0 > (i_7_ = anIntArray113[i_4_]))
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x40 & i_6_) != 0)
			{
				i_4_ = anIntArray113[i_4_];
			}
			else
			{
				i_4_++;
			}
			if ((i_7_ = anIntArray113[i_4_]) < 0)
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x20 & i_6_) != 0)
			{
				i_4_ = anIntArray113[i_4_];
			}
			else
			{
				i_4_++;
			}
			if ((i_7_ = anIntArray113[i_4_]) < 0)
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x10 & i_6_) == 0)
			{
				i_4_++;
			}
			else
			{
				i_4_ = anIntArray113[i_4_];
			}
			if (0 > (i_7_ = anIntArray113[i_4_]))
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x8 & i_6_) == 0)
			{
				i_4_++;
			}
			else
			{
				i_4_ = anIntArray113[i_4_];
			}
			if ((i_7_ = anIntArray113[i_4_]) < 0)
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x4 & i_6_) != 0)
			{
				i_4_ = anIntArray113[i_4_];
			}
			else
			{
				i_4_++;
			}
			if ((i_7_ = anIntArray113[i_4_]) < 0)
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((i_6_ & 0x2) == 0)
			{
				i_4_++;
			}
			else
			{
				i_4_ = anIntArray113[i_4_];
			}
			if (0 > (i_7_ = anIntArray113[i_4_]))
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_3_ <= i_1_)
				{
					break;
				}
				i_4_ = 0;
			}
			if ((0x1 & i_6_) == 0)
			{
				i_4_++;
			}
			else
			{
				i_4_ = anIntArray113[i_4_];
			}
			if ((i_7_ = anIntArray113[i_4_]) < 0)
			{
				is[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
				if (i_1_ >= i_3_)
				{
					break;
				}
				i_4_ = 0;
			}
			i_5_++;
		}
		return i_5_ + -i_2_ + 1;
	}

	static int method302(final int i, final byte[] is)
	{
		return Class1.method1(-1, i, is, 0);
	}

	int method303(final byte[] is, final byte i, int i_8_, final byte[] is_9_, final int i_10_, int i_11_)
	{
		int i_12_ = 0;
		i_8_ += i_11_;
		int i_13_ = i_10_ << 3;
		for (/**/; i_8_ > i_11_; i_11_++)
		{
			final int i_14_ = is_9_[i_11_] & 0xff;
			final int i_15_ = anIntArray111[i_14_];
			final int i_16_ = aByteArray17[i_14_];
			if (i_16_ == 0)
			{
				throw new RuntimeException(new StringBuilder().append("").append(i_14_).toString());
			}
			int i_17_ = i_13_ >> 3;
			int i_18_ = 0x7 & i_13_;
			i_12_ &= -i_18_ >> 31;
			final int i_19_ = i_17_ + ((i_18_ - -i_16_ - 1) >> 3);
			i_13_ += i_16_;
			i_18_ += 24;
			is[i_17_] = (byte) (i_12_ = GameWindow.method485(i_12_, i_15_ >>> i_18_));
			if (i_19_ > i_17_)
			{
				i_17_++;
				i_18_ -= 8;
				is[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
				if (i_17_ < i_19_)
				{
					i_17_++;
					i_18_ -= 8;
					is[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
					if (i_19_ > i_17_)
					{
						i_17_++;
						i_18_ -= 8;
						is[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
						if (i_19_ > i_17_)
						{
							i_18_ -= 8;
							i_17_++;
							is[i_17_] = (byte) (i_12_ = i_15_ << -i_18_);
						}
					}
				}
			}
		}
		return ((i_13_ + 7) >> 3) + -i_10_;
	}

	Class44(final byte[] is)
	{
		final int i = is.length;
		aByteArray17 = is;
		anIntArray111 = new int[i];
		final int[] is_20_ = new int[33];
		anIntArray113 = new int[8];
		int i_21_ = 0;
		for (int i_22_ = 0; i > i_22_; i_22_++)
		{
			final int i_23_ = is[i_22_];
			if (i_23_ != 0)
			{
				final int i_24_ = 1 << (32 - i_23_);
				final int i_25_ = is_20_[i_23_];
				anIntArray111[i_22_] = i_25_;
				int i_26_;
				if ((i_25_ & i_24_) == 0)
				{
					i_26_ = i_25_ | i_24_;
					for (int i_27_ = i_23_ + -1; i_27_ >= 1; i_27_--)
					{
						final int i_28_ = is_20_[i_27_];
						if (i_25_ != i_28_)
						{
							break;
						}
						final int i_29_ = 1 << (-i_27_ + 32);
						if ((i_28_ & i_29_) == 0)
						{
							is_20_[i_27_] = GameWindow.method485(i_29_, i_28_);
						}
						else
						{
							is_20_[i_27_] = is_20_[i_27_ - 1];
							break;
						}
					}
				}
				else
				{
					i_26_ = is_20_[i_23_ + -1];
				}
				is_20_[i_23_] = i_26_;
				for (int i_30_ = i_23_ + 1; 32 >= i_30_; i_30_++)
				{
					if (i_25_ == is_20_[i_30_])
					{
						is_20_[i_30_] = i_26_;
					}
				}
				int i_31_ = 0;
				for (int i_32_ = 0; i_32_ < i_23_; i_32_++)
				{
					int i_33_ = -2147483648 >>> i_32_;
					if ((i_25_ & i_33_) == 0)
					{
						i_31_++;
					}
					else
					{
						if (anIntArray113[i_31_] == 0)
						{
							anIntArray113[i_31_] = i_21_;
						}
						i_31_ = anIntArray113[i_31_];
					}
					if (anIntArray113.length <= i_31_)
					{
						final int[] is_34_ = new int[anIntArray113.length * 2];
						for (int i_35_ = 0; i_35_ < anIntArray113.length; i_35_++)
						{
							is_34_[i_35_] = anIntArray113[i_35_];
						}
						anIntArray113 = is_34_;
					}
					i_33_ >>>= 1;
				}
				anIntArray113[i_31_] = i_22_ ^ 0xffffffff;
				if (i_31_ >= i_21_)
				{
					i_21_ = i_31_ + 1;
				}
			}
		}
	}

	static
	{
		for (int i = 0; 256 > i; i++)
		{
			int i_36_ = i;
			for (int i_37_ = 0; i_37_ < 8; i_37_++)
			{
				if ((0x1 & i_36_) != 1)
				{
					i_36_ >>>= 1;
				}
				else
				{
					i_36_ = (i_36_ >>> 1) ^ ~0x12477cdf;
				}
			}
			anIntArray114[i] = i_36_;
		}
	}
}
