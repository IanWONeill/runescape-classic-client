package com.classic;

final class Class38
{
	static int[][] anIntArrayArray12;
	static String[] aStringArray26;
	static int[] anIntArray88;
	static int anInt396;
	static int anInt398 = 0;
	int anInt399;
	static GameFrame gameFrame = null;
	static String[] aStringArray27;
	static int[] anIntArray89;

	Class38(final String string, final String string_0_, final String string_1_, final int i)
	{
		this.anInt399 = i;
	}

	static int method245(int i, final byte i_2_)
	{
		if (i_2_ <= 121)
		{
			method245(-126, (byte) 29);
		}
		i = (0x55555555 & i) + ((i >>> 1) & ~0x2aaaaaaa);
		i = ((~0x33333332 & i) >>> 2) + (0x33333333 & i);
		i = (i + (i >>> 4)) & 0xf0f0f0f;
		i += i >>> 8;
		i += i >>> 16;
		return i & 0xff;
	}

	@Override
	public String toString()
	{
		throw new IllegalStateException();
	}

	static byte[] method246(final int i)
	{
		final byte[] is = new byte[256];
		for (int i_3_ = -128; i_3_ < 127; i_3_++)
		{
			int i_4_ = (byte) i_3_;
			i_4_ ^= 0xffffffff;
			final int i_5_ = 0x80 & i_4_;
			final int i_6_ = (i_4_ & 0x7d) >> 4;
			int i_7_ = 0xf & i_4_;
			i_7_ |= 0x10;
			i_7_ = (i_7_ << 1) + 1;
			int i_8_ = i_7_ << (i_6_ + 2);
			i_8_ -= 132;
			if (i_5_ != 0)
			{
				i_8_ = -i_8_;
			}
			is[Class52.method378(i_3_, 255)] = (byte) (i_8_ / 256);
		}
		return is;
	}
}
