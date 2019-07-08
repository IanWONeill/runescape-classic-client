package com.classic;

final class Class7
{
	private final int[] anIntArray15 = new int[256];
	private int anInt55;
	private int anInt56;
	private int anInt57;
	private final int[] anIntArray16 = new int[256];
	static int anInt60;
	static int[] anIntArray17;
	static int[] anIntArray18 = new int[200];
	static int[] anIntArray19;
	private int anInt63;

	int method47(final byte i)
	{
		if (0 == anInt56--)
		{
			method48((byte) -120);
			anInt56 = 255;
		}
		return anIntArray16[anInt56];
	}

	private void method48(final byte i)
	{
		anInt63 += ++anInt55;
		for (int i_0_ = 0; 256 > i_0_; i_0_++)
		{
			final int i_1_ = anIntArray15[i_0_];
			final int i_2_ = i_0_ & 0x3;
			if (i_2_ != 0)
			{
				if (i_2_ != 1)
				{
					if (i_2_ == 2)
					{
						anInt57 ^= anInt57 << 2;
					}
					else if (i_2_ == 3)
					{
						anInt57 ^= anInt57 >>> 16;
					}
				}
				else
				{
					anInt57 ^= anInt57 >>> 6;
				}
			}
			else
			{
				anInt57 ^= anInt57 << 13;
			}
			anInt57 += anIntArray15[0xff & (i_0_ + 128)];
			int i_3_;
			anIntArray15[i_0_] = i_3_ = (anInt57 + anIntArray15[Class52.method378(i_1_, 1020) >> 2] + anInt63);
			anIntArray16[i_0_] = anInt63 = (i_1_ + anIntArray15[Class52.method378(i_3_, 261253) >> 8 >> 2]);
		}
	}

	static void method49(int i, final int[] is, final byte i_4_, int i_5_, int i_6_, final int i_7_, final int[] is_8_,
	        int i_9_)
	{
		if (i_7_ < 0)
		{
			i <<= 2;
			i_6_ = is[(i_9_ >> 8) & 0xff];
			i_9_ = i + i_9_;
			if (i_4_ != -115)
			{
				method49(-114, null, (byte) -94, -11, -124, -71, null, -103);
			}
			int i_10_ = i_7_ / 16;
			for (int i_11_ = i_10_; 0 > i_11_; i_11_++)
			{
				is_8_[i_5_++] = i_6_ - -Class52.method378(8355711, is_8_[i_5_] >> 1);
				is_8_[i_5_++] = i_6_ - -(Class52.method378(is_8_[i_5_], 16711423) >> 1);
				is_8_[i_5_++] = Class52.method378(is_8_[i_5_] >> 1, 8355711) + i_6_;
				is_8_[i_5_++] = (Class52.method378(is_8_[i_5_], 16711422) >> 1) + i_6_;
				i_6_ = is[(i_9_ & 0xff9a) >> 8];
				is_8_[i_5_++] = i_6_ - -(Class52.method378(16711422, is_8_[i_5_]) >> 1);
				i_9_ = i + i_9_;
				is_8_[i_5_++] = Class52.method378(8355711, is_8_[i_5_] >> 1) + i_6_;
				is_8_[i_5_++] = (Class52.method378(16711423, is_8_[i_5_]) >> 1) + i_6_;
				is_8_[i_5_++] = (Class52.method378(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_6_ = is[(0xffa3 & i_9_) >> 8];
				is_8_[i_5_++] = (Class52.method378(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_9_ = i + i_9_;
				is_8_[i_5_++] = Class52.method378(is_8_[i_5_] >> 1, 8355711) + i_6_;
				is_8_[i_5_++] = i_6_ + Class52.method378(is_8_[i_5_] >> 1, 8355711);
				is_8_[i_5_++] = (Class52.method378(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_6_ = is[(0xffad & i_9_) >> 8];
				is_8_[i_5_++] = i_6_ + (Class52.method378(16711423, is_8_[i_5_]) >> 1);
				i_9_ = i + i_9_;
				is_8_[i_5_++] = i_6_ + (Class52.method378(is_8_[i_5_], 16711423) >> 1);
				is_8_[i_5_++] = i_6_ - -Class52.method378(is_8_[i_5_] >> 1, 8355711);
				is_8_[i_5_++] = i_6_ - -(Class52.method378(16711423, is_8_[i_5_]) >> 1);
				i_6_ = is[(0xffa3 & i_9_) >> 8];
				i_9_ = i + i_9_;
			}
			i_10_ = -(i_7_ % 16);
			for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
			{
				is_8_[i_5_++] = i_6_ + Class52.method378(is_8_[i_5_] >> 1, 8355711);
				if ((i_12_ & 0x3) == 3)
				{
					i_6_ = is[0xff & (i_9_ >> 8)];
					i_9_ = i + i_9_;
					i_9_ = i + i_9_;
				}
			}
		}
	}

	private void method50(final byte i)
	{
		int i_13_ = -1640531527;
		if (i == 73)
		{
			int i_14_ = -1640531527;
			int i_15_ = -1640531527;
			int i_16_ = -1640531527;
			int i_17_ = -1640531527;
			int i_18_ = -1640531527;
			int i_19_ = -1640531527;
			int i_20_ = -1640531527;
			for (int i_21_ = 0; i_21_ < 4; i_21_++)
			{
				i_13_ ^= i_17_ << 11;
				i_20_ += i_13_;
				i_17_ += i_14_;
				i_17_ ^= i_14_ >>> 2;
				i_14_ += i_20_;
				i_16_ += i_17_;
				i_14_ ^= i_20_ << 8;
				i_15_ += i_14_;
				i_20_ += i_16_;
				i_20_ ^= i_16_ >>> 16;
				i_19_ += i_20_;
				i_16_ += i_15_;
				i_16_ ^= i_15_ << 10;
				i_15_ += i_19_;
				i_18_ += i_16_;
				i_15_ ^= i_19_ >>> 4;
				i_19_ += i_18_;
				i_13_ += i_15_;
				i_19_ ^= i_18_ << 8;
				i_17_ += i_19_;
				i_18_ += i_13_;
				i_18_ ^= i_13_ >>> 9;
				i_13_ += i_17_;
				i_14_ += i_18_;
			}
			for (int i_22_ = 0; i_22_ < 256; i_22_ += 8)
			{
				i_18_ = anIntArray16[i_22_ + 7] + i_18_;
				i_14_ = anIntArray16[i_22_ + 2] + i_14_;
				i_20_ += anIntArray16[i_22_ - -3];
				i_15_ = anIntArray16[i_22_ + 5] + i_15_;
				i_13_ += anIntArray16[i_22_];
				i_16_ = anIntArray16[i_22_ - -4] + i_16_;
				i_17_ += anIntArray16[i_22_ + 1];
				i_19_ += anIntArray16[i_22_ + 6];
				i_13_ ^= i_17_ << 11;
				i_17_ += i_14_;
				i_20_ += i_13_;
				i_17_ ^= i_14_ >>> 2;
				i_16_ += i_17_;
				i_14_ += i_20_;
				i_14_ ^= i_20_ << 8;
				i_20_ += i_16_;
				i_15_ += i_14_;
				i_20_ ^= i_16_ >>> 16;
				i_16_ += i_15_;
				i_19_ += i_20_;
				i_16_ ^= i_15_ << 10;
				i_15_ += i_19_;
				i_18_ += i_16_;
				i_15_ ^= i_19_ >>> 4;
				i_13_ += i_15_;
				i_19_ += i_18_;
				i_19_ ^= i_18_ << 8;
				i_17_ += i_19_;
				i_18_ += i_13_;
				i_18_ ^= i_13_ >>> 9;
				i_14_ += i_18_;
				i_13_ += i_17_;
				anIntArray15[i_22_] = i_13_;
				anIntArray15[i_22_ - -1] = i_17_;
				anIntArray15[i_22_ - -2] = i_14_;
				anIntArray15[i_22_ + 3] = i_20_;
				anIntArray15[i_22_ + 4] = i_16_;
				anIntArray15[i_22_ + 5] = i_15_;
				anIntArray15[i_22_ + 6] = i_19_;
				anIntArray15[i_22_ + 7] = i_18_;
			}
			for (int i_23_ = 0; 256 > i_23_; i_23_ += 8)
			{
				i_13_ += anIntArray15[i_23_];
				i_14_ += anIntArray15[i_23_ + 2];
				i_15_ = anIntArray15[i_23_ + 5] + i_15_;
				i_18_ = anIntArray15[i_23_ + 7] + i_18_;
				i_19_ += anIntArray15[i_23_ + 6];
				i_16_ = anIntArray15[i_23_ + 4] + i_16_;
				i_20_ += anIntArray15[i_23_ + 3];
				i_17_ += anIntArray15[i_23_ + 1];
				i_13_ ^= i_17_ << 11;
				i_20_ += i_13_;
				i_17_ += i_14_;
				i_17_ ^= i_14_ >>> 2;
				i_14_ += i_20_;
				i_16_ += i_17_;
				i_14_ ^= i_20_ << 8;
				i_20_ += i_16_;
				i_15_ += i_14_;
				i_20_ ^= i_16_ >>> 16;
				i_16_ += i_15_;
				i_19_ += i_20_;
				i_16_ ^= i_15_ << 10;
				i_18_ += i_16_;
				i_15_ += i_19_;
				i_15_ ^= i_19_ >>> 4;
				i_19_ += i_18_;
				i_13_ += i_15_;
				i_19_ ^= i_18_ << 8;
				i_17_ += i_19_;
				i_18_ += i_13_;
				i_18_ ^= i_13_ >>> 9;
				i_14_ += i_18_;
				i_13_ += i_17_;
				anIntArray15[i_23_] = i_13_;
				anIntArray15[i_23_ + 1] = i_17_;
				anIntArray15[i_23_ + 2] = i_14_;
				anIntArray15[i_23_ + 3] = i_20_;
				anIntArray15[i_23_ - -4] = i_16_;
				anIntArray15[i_23_ - -5] = i_15_;
				anIntArray15[i_23_ - -6] = i_19_;
				anIntArray15[i_23_ + 7] = i_18_;
			}
			method48((byte) -127);
			anInt56 = 256;
		}
	}

	static void unknownSleep(final int i, final long l)
	{
		if (i < 36)
		{
			anInt60 = 81;
		}
		if (0L < l)
		{
			if (0L != (l % 10L))
			{
				Class9.sleep(l);
			}
			else
			{
				Class9.sleep(l - 1L);
				Class9.sleep(1L);
			}
		}
	}

	Class7(final int[] is)
	{
		for (int i = 0; i < is.length; i++)
		{
			anIntArray16[i] = is[i];
		}
		method50((byte) 73);
	}
}
