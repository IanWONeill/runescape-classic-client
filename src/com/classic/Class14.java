package com.classic;

final class Class14
{
	static void method112(final byte[] is, int i, final byte[] is_1_, int i_2_, int i_3_)
	{
		if (is_1_ == is)
		{
			if (i_2_ == i)
			{
				return;
			}
			if ((i_2_ > i) && (i_2_ < (i_3_ + i)))
			{
				i = --i_3_ + i;
				i_2_ += i_3_;
				i_3_ = i - i_3_;
				i_3_ += 7;
				while (i >= i_3_)
				{
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
					is_1_[i_2_--] = is[i--];
				}
				i_3_ -= 7;
				while (i >= i_3_)
				{
					is_1_[i_2_--] = is[i--];
				}
				return;
			}
		}
		i_3_ += i;
		i_3_ -= 7;
		while (i < i_3_)
		{
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
			is_1_[i_2_++] = is[i++];
		}
		i_3_ += 7;
		while (i < i_3_)
		{
			is_1_[i_2_++] = is[i++];
		}
	}
}
