package com.classic;

import java.awt.image.ImageConsumer;

final class Class45
{
	static Class24 aClass24_2;
	static ImageConsumer anImageConsumer1;
	static String[] aStringArray31 = { "Please enter the number of items to deposit", "and press enter" };
	static int[] anIntArray115;
	static String[] aStringArray32;
	static int anInt494;

	static Class24 method304(final int i, final int i_0_)
	{
		final Class24[] class24s = GameFrame.method488();
		for (int i_1_ = i_0_; class24s.length > i_1_; i_1_++)
		{
			final Class24 class24 = class24s[i_1_];
			if (i == class24.anInt293)
			{
				return class24;
			}
		}
		return null;
	}

	static
	{
		aClass24_2 = new Class24(2);
		anInt494 = 0;
	}
}
