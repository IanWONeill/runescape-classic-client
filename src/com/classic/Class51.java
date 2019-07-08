package com.classic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

final class Class51
{
	int anInt581;
	static int anInt582;
	static int clientVersion = 235;
	static int anInt584 = 176;
	int anInt585;
	static int anInt586;
	static int anInt587;
	int anInt588;
	int anInt589;

	static boolean method374(final char c)
	{
		anInt587++;
		if (Character.isISOControl(c))
		{
			return false;
		}
		if (Class25.isAlphaNumeric(c))
		{
			return true;
		}
		char[] cs = GameImageMiddleMan.aCharArray2;
		for (int i_0_ = 0; i_0_ < cs.length; i_0_++)
		{
			final char c_1_ = cs[i_0_];
			if (c == c_1_)
			{
				return true;
			}
		}
		cs = mudclient.aCharArray4;
		for (int i_2_ = 0; cs.length > i_2_; i_2_++)
		{
			final char c_3_ = cs[i_2_];
			if (c == c_3_)
			{
				return true;
			}
		}
		return false;
	}

	static void method375(final Object[] objects, final int i, final int i_4_, final int[] is, final int i_5_)
	{
		anInt582++;
		if (i_5_ != 1)
		{
			anInt584 = 20;
		}
		if (i_4_ > i)
		{
			final int i_6_ = (i - -i_4_) / 2;
			int i_7_ = i;
			final int i_8_ = is[i_6_];
			is[i_6_] = is[i_4_];
			is[i_4_] = i_8_;
			final Object object = objects[i_6_];
			objects[i_6_] = objects[i_4_];
			objects[i_4_] = object;
			final int i_9_ = i_8_ != 2147483647 ? 1 : 0;
			for (int i_10_ = i; i_10_ < i_4_; i_10_++)
			{
				if (((i_9_ & i_10_) + i_8_) > is[i_10_])
				{
					final int i_11_ = is[i_10_];
					is[i_10_] = is[i_7_];
					is[i_7_] = i_11_;
					final Object object_12_ = objects[i_10_];
					objects[i_10_] = objects[i_7_];
					objects[i_7_++] = object_12_;
				}
			}
			is[i_4_] = is[i_7_];
			is[i_7_] = i_8_;
			objects[i_4_] = objects[i_7_];
			objects[i_7_] = object;
			method375(objects, i, i_7_ + -1, is, i_5_ + 0);
			method375(objects, i_7_ + 1, i_4_, is, 1);
		}
	}

	static InputStream method376(final String string, final byte i) throws IOException
	{
		anInt586++;
		InputStream inputstream;
		if (Class47.anURL3 == null)
		{
			inputstream = new BufferedInputStream(new FileInputStream(string));
		}
		else
		{
			final URL url = new URL(Class47.anURL3, string);
			inputstream = url.openStream();
		}
		return inputstream;
	}
}
