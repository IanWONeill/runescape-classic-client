package com.classic;

import java.awt.event.ActionEvent;

final class Class34
{
	static Class38 aClass38_5;
	static int anInt371;
	static Class44 aClass44_1 = new Class44(new byte[] { 22, 22, 22, 22, 22, 22, 21, 22, 22, 20, 22, 22, 22, 21, 22, 22,
	        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 3, 8, 22, 16, 22, 16, 17, 7, 13, 13, 13, 16,
	        7, 10, 6, 16, 10, 11, 12, 12, 12, 12, 13, 13, 14, 14, 11, 14, 19, 15, 17, 8, 11, 9, 10, 10, 10, 10, 11, 10,
	        9, 7, 12, 11, 10, 10, 9, 10, 10, 12, 10, 9, 8, 12, 12, 9, 14, 8, 12, 17, 16, 17, 22, 13, 21, 4, 7, 6, 5, 3,
	        6, 6, 5, 4, 10, 7, 5, 6, 4, 4, 6, 10, 5, 4, 4, 5, 7, 6, 10, 6, 10, 22, 19, 22, 14, 22, 22, 22, 22, 22, 22,
	        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
	        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
	        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
	        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
	        22, 22, 22, 22, 22, 22, 21, 22, 21, 22, 22, 22, 21, 22, 22 });

	static int method225(final byte[] is, final int i, final byte i_0_)
	{
		int i_1_ = ((256 * Class10.method77(is[i], (byte) -115)) - -Class10.method77(is[i + 1], (byte) -115));
		if (i_1_ > 32767)
		{
			i_1_ -= 65536;
		}
		return i_1_;
	}

	static void method226(final byte i, final Object object, final Class32 class32)
	{
		if (class32.anEventQueue1 != null)
		{
			for (int i_2_ = 0; ((50 > i_2_) && (null != class32.anEventQueue1.peekEvent())); i_2_++)
			{
				Class7.unknownSleep(93, 1L);
			}
			try
			{
				if (object != null)
				{
					class32.anEventQueue1.postEvent(new ActionEvent(object, 1001, "dummy"));
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
	}

	static int method227(final boolean bool, final int i, final int i_3_, final int i_4_)
	{
		if (bool)
		{
			aClass38_5 = null;
		}
		return i_4_ + (i_3_ << 16) + (i << 8);
	}
}
