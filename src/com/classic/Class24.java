package com.classic;

final class Class24
{
	static int anInt292;
	static Class39 aClass39_2 = null;
	int anInt293;
	static boolean aBool16;
	static int anInt294;
	static int[] anIntArray78;
	static String[] aStringArray18;
	static byte[] aByteArray14 = new byte[520];

	@Override
	public String toString()
	{
		anInt294++;
		throw new IllegalStateException();
	}

	static byte[] method169(final boolean bool, final byte[] is, final byte i)
	{
		anInt292++;
		final int i_0_ = ((((is[0] << 16) & 0xff0000) + ((is[1] & 0xff) << 8)) - -(0xff & is[2]));
		final int i_2_ = (((is[3] & 0xff) << 16) - -(0xff00 & (is[4] << 8))) + (is[5] & 0xff);
		if (i_0_ == i_2_)
		{
			final byte[] is_3_ = new byte[is.length + -6];
			Class14.method112(is, 6, is_3_, 0, is_3_.length);
			return is_3_;
		}
		Class48.drawLoadingBar(0, "Unpacking ");
		final byte[] is_4_ = new byte[i_0_];
		Class8.method58(is_4_, i_0_, is, i_2_, 6);
		return is_4_;
	}

	Class24(final String string, final int i)
	{
		this.anInt293 = i;
	}

	static
	{
		aBool16 = true;
	}
}
