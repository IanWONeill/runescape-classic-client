package com.classic;

final class Class35
{
	static int[] anIntArray85;
	static long aLong4;
	static int anInt376;
	static int anInt377 = 0;

	static int method228(final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_,
	        final int i_3_, final int i_4_)
	{
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
		{
			int i_8_ = (i_4_ + (bool ? i_7_ : -i_7_) + -i_2_) * i_3_;
			if (i_8_ < -100)
			{
				i_8_ = -100;
			}
			else if (100 < i_8_)
			{
				i_8_ = 100;
			}
			int i_9_ = i + i_8_;
			if (10 > i_9_)
			{
				i_9_ = 10;
			}
			i_6_ += (i_9_ * i_0_) / 100;
		}
		return i_6_;
	}
}
