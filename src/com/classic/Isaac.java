package com.classic;

// https://en.wikipedia.org/wiki/ISAAC_(cipher)
final class Isaac
{
	private final int[] mm = new int[256];
	private int anInt55;
	private int gen;
	private int anInt57;
	private final int[] rsl = new int[256];
	static int anInt60;
	static int[] anIntArray17;
	static int[] anIntArray18 = new int[200];
	static int[] anIntArray19;
	private int anInt63;

	int random()
	{
		if (0 == gen--)
		{
			isaac();
			gen = 255;
		}
		return rsl[gen];
	}

	private void isaac()
	{
		anInt63 += ++anInt55;
		for (int index = 0; index < 256; index++)
		{
			final int x = mm[index];

			switch(index & 0x3)
			{
				case 0: anInt57 ^= anInt57 << 13; break;
				case 1: anInt57 ^= anInt57 >>> 6; break;
				case 2: anInt57 ^= anInt57 << 2; break;
				case 3: anInt57 ^= anInt57 >>> 16; break;
			}

			anInt57 += mm[(index + 128) & 0xff];
			int i_3_;
			mm[index] = i_3_ = (anInt57 + mm[Class52.bitwiseAnd(x, 1020) >> 2] + anInt63);
			rsl[index] = anInt63 = (x + mm[Class52.bitwiseAnd(i_3_, 261253) >> 8 >> 2]);
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
				is_8_[i_5_++] = i_6_ - -Class52.bitwiseAnd(8355711, is_8_[i_5_] >> 1);
				is_8_[i_5_++] = i_6_ - -(Class52.bitwiseAnd(is_8_[i_5_], 16711423) >> 1);
				is_8_[i_5_++] = Class52.bitwiseAnd(is_8_[i_5_] >> 1, 8355711) + i_6_;
				is_8_[i_5_++] = (Class52.bitwiseAnd(is_8_[i_5_], 16711422) >> 1) + i_6_;
				i_6_ = is[(i_9_ & 0xff9a) >> 8];
				is_8_[i_5_++] = i_6_ - -(Class52.bitwiseAnd(16711422, is_8_[i_5_]) >> 1);
				i_9_ = i + i_9_;
				is_8_[i_5_++] = Class52.bitwiseAnd(8355711, is_8_[i_5_] >> 1) + i_6_;
				is_8_[i_5_++] = (Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1) + i_6_;
				is_8_[i_5_++] = (Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_6_ = is[(0xffa3 & i_9_) >> 8];
				is_8_[i_5_++] = (Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_9_ = i + i_9_;
				is_8_[i_5_++] = Class52.bitwiseAnd(is_8_[i_5_] >> 1, 8355711) + i_6_;
				is_8_[i_5_++] = i_6_ + Class52.bitwiseAnd(is_8_[i_5_] >> 1, 8355711);
				is_8_[i_5_++] = (Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1) + i_6_;
				i_6_ = is[(0xffad & i_9_) >> 8];
				is_8_[i_5_++] = i_6_ + (Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1);
				i_9_ = i + i_9_;
				is_8_[i_5_++] = i_6_ + (Class52.bitwiseAnd(is_8_[i_5_], 16711423) >> 1);
				is_8_[i_5_++] = i_6_ - -Class52.bitwiseAnd(is_8_[i_5_] >> 1, 8355711);
				is_8_[i_5_++] = i_6_ - -(Class52.bitwiseAnd(16711423, is_8_[i_5_]) >> 1);
				i_6_ = is[(0xffa3 & i_9_) >> 8];
				i_9_ = i + i_9_;
			}
			i_10_ = -(i_7_ % 16);
			for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
			{
				is_8_[i_5_++] = i_6_ + Class52.bitwiseAnd(is_8_[i_5_] >> 1, 8355711);
				if ((i_12_ & 0x3) == 3)
				{
					i_6_ = is[0xff & (i_9_ >> 8)];
					i_9_ = i + i_9_;
					i_9_ = i + i_9_;
				}
			}
		}
	}

	private void init()
	{
		// NOTE: 0x9E3779B9 is 2^32 over phi.
		int unk1 = 0x9E3779B9;
		int unk2 = 0x9E3779B9;
		int unk3 = 0x9E3779B9;
		int unk4 = 0x9E3779B9;
		int unk5 = 0x9E3779B9;
		int unk6 = 0x9E3779B9;
		int unk7 = 0x9E3779B9;
		int unk8 = 0x9E3779B9;
		
		for (int count = 0; count < 4; count++)
		{
			unk1 ^= unk5 << 11; unk8 += unk1; unk5 += unk2;
			unk5 ^= unk2 >>> 2; unk2 += unk8; unk4 += unk5;
			unk2 ^= unk8 << 8; unk3 += unk2; unk8 += unk4;
			unk8 ^= unk4 >>> 16; unk7 += unk8; unk4 += unk3;
			unk4 ^= unk3 << 10; unk3 += unk7; unk6 += unk4;
			unk3 ^= unk7 >>> 4; unk7 += unk6; unk1 += unk3;
			unk7 ^= unk6 << 8; unk5 += unk7; unk6 += unk1;
			unk6 ^= unk1 >>> 9; unk1 += unk5; unk2 += unk6;
		}
		
		for (int index = 0; index < 256; index += 8)
		{
			unk6 = rsl[index + 7] + unk6;
			unk2 = rsl[index + 2] + unk2;
			unk8 += rsl[index + 3];
			unk3 = rsl[index + 5] + unk3;
			unk1 += rsl[index + 0];
			unk4 = rsl[index + 4] + unk4;
			unk5 += rsl[index + 1];
			unk7 += rsl[index + 6];
			unk1 ^= unk5 << 11;
			unk5 += unk2;
			unk8 += unk1;
			unk5 ^= unk2 >>> 2;
			unk4 += unk5;
			unk2 += unk8;
			unk2 ^= unk8 << 8;
			unk8 += unk4;
			unk3 += unk2;
			unk8 ^= unk4 >>> 16;
			unk4 += unk3;
			unk7 += unk8;
			unk4 ^= unk3 << 10;
			unk3 += unk7;
			unk6 += unk4;
			unk3 ^= unk7 >>> 4;
			unk1 += unk3;
			unk7 += unk6;
			unk7 ^= unk6 << 8;
			unk5 += unk7;
			unk6 += unk1;
			unk6 ^= unk1 >>> 9;
			unk2 += unk6;
			unk1 += unk5;
			mm[index + 0] = unk1;
			mm[index + 1] = unk5;
			mm[index + 2] = unk2;
			mm[index + 3] = unk8;
			mm[index + 4] = unk4;
			mm[index + 5] = unk3;
			mm[index + 6] = unk7;
			mm[index + 7] = unk6;
		}
		
		for (int index = 0; 256 > index; index += 8)
		{
			unk1 += mm[index + 0];
			unk2 += mm[index + 2];
			unk3 = mm[index + 5] + unk3;
			unk6 = mm[index + 7] + unk6;
			unk7 += mm[index + 6];
			unk4 = mm[index + 4] + unk4;
			unk8 += mm[index + 3];
			unk5 += mm[index + 1];
			unk1 ^= unk5 << 11;
			unk8 += unk1;
			unk5 += unk2;
			unk5 ^= unk2 >>> 2;
			unk2 += unk8;
			unk4 += unk5;
			unk2 ^= unk8 << 8;
			unk8 += unk4;
			unk3 += unk2;
			unk8 ^= unk4 >>> 16;
			unk4 += unk3;
			unk7 += unk8;
			unk4 ^= unk3 << 10;
			unk6 += unk4;
			unk3 += unk7;
			unk3 ^= unk7 >>> 4;
			unk7 += unk6;
			unk1 += unk3;
			unk7 ^= unk6 << 8;
			unk5 += unk7;
			unk6 += unk1;
			unk6 ^= unk1 >>> 9;
			unk2 += unk6;
			unk1 += unk5;
			mm[index + 0] = unk1;
			mm[index + 1] = unk5;
			mm[index + 2] = unk2;
			mm[index + 3] = unk8;
			mm[index + 4] = unk4;
			mm[index + 5] = unk3;
			mm[index + 6] = unk7;
			mm[index + 7] = unk6;
		}
		isaac();
		gen = 256;
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

	Isaac(final int[] seed)
	{
		for (int i = 0; i < seed.length; i++)
		{
			rsl[i] = seed[i];
		}
		init();
	}
}
