package com.classic;

import java.awt.Component;

class AudioUnknown
{
	private long aLong5;
	private static Class12 aClass12_1;
	static boolean maybe_isStereo;
	static int sampleRate;
	private boolean aBool22 = false;
	int[] anIntArray87;
	private final int anInt387 = 32;
	private AClass4 anAClass4_1;
	private int anInt388;
	private static int anInt389;
	private int anInt390;
	private int anInt391;
	private long aLong6;
	private int anInt392;
	private int anInt393;
	private int anInt394;
	private long aLong7;
	private int anInt395;
	private final AClass4[] anAClass4Array1;
	private final AClass4[] anAClass4Array2;
	private boolean aBool23;

	static void method231(final int inSampleRate, final boolean maybe_inIsStereo, final int i_0_)
	{
		if ((inSampleRate < 8000) || (inSampleRate > 48000))
		{
			throw new IllegalArgumentException();
		}
		sampleRate = inSampleRate;
		maybe_isStereo = maybe_inIsStereo;
		anInt389 = i_0_;
	}

	synchronized void method232(final AClass4 aclass4)
	{
		anAClass4_1 = aclass4;
	}

	int method233() throws Exception
	{
		return anInt395;
	}

	synchronized void method234()
	{
		if (!aBool22)
		{
			long l = Class52.method377();
			try
			{
				if (l > (aLong5 + 6000L))
				{
					aLong5 = l - 6000L;
				}
				for (/**/; l > (aLong5 + 5000L); l = Class52.method377())
				{
					method238(256);
					aLong5 += 256000 / sampleRate;
				}
			}
			catch (final Exception exception)
			{
				aLong5 = l;
			}
			if (this.anIntArray87 != null)
			{
				try
				{
					if (aLong6 != 0L)
					{
						if (l < aLong6)
						{
							return;
						}
						method244(anInt395);
						aLong6 = 0L;
						aBool23 = true;
					}
					int i = method233();
					if ((anInt394 - i) > anInt391)
					{
						anInt391 = anInt394 - i;
					}
					int i_1_ = anInt390 + anInt388;
					if ((i_1_ + 256) > 16384)
					{
						i_1_ = 16128;
					}
					if ((i_1_ + 256) > anInt395)
					{
						anInt395 += 1024;
						if (anInt395 > 16384)
						{
							anInt395 = 16384;
						}
						method241();
						method244(anInt395);
						i = 0;
						aBool23 = true;
						if ((i_1_ + 256) > anInt395)
						{
							i_1_ = anInt395 - 256;
							anInt388 = i_1_ - anInt390;
						}
					}
					for (/**/; i < i_1_; i += 256)
					{
						method235(this.anIntArray87, 256);
						method240();
					}
					if (l > aLong7)
					{
						if (!aBool23)
						{
							if ((anInt391 == 0) && (anInt393 == 0))
							{
								method241();
								aLong6 = l + 2000L;
								return;
							}
							anInt388 = Math.min(anInt393, anInt391);
							anInt393 = anInt391;
						}
						else
						{
							aBool23 = false;
						}
						anInt391 = 0;
						aLong7 = l + 2000L;
					}
					anInt394 = i;
				}
				catch (final Exception exception)
				{
					method241();
					aLong6 = l + 2000L;
				}
			}
		}
	}

	private void method235(final int[] is, final int i)
	{
		int i_2_ = i;
		if (maybe_isStereo)
		{
			i_2_ <<= 1;
		}
		method111(is, 0, i_2_);
		anInt392 -= i;
		if ((anAClass4_1 != null) && (anInt392 <= 0))
		{
			anInt392 += sampleRate >> 4;
			method239(anAClass4_1);
			method237(anAClass4_1, anAClass4_1.method412());
			int i_3_ = 0;
			int i_4_ = 255;
			int i_5_ = 7;
			while_1_: while (i_4_ != 0)
			{
				int i_6_;
				int i_7_;
				if (i_5_ < 0)
				{
					i_6_ = i_5_ & 0x3;
					i_7_ = -(i_5_ >> 2);
				}
				else
				{
					i_6_ = i_5_;
					i_7_ = 0;
				}
				for (int i_8_ = (i_4_ >>> i_6_) & 0x11111111; i_8_ != 0; i_8_ >>>= 4)
				{
					if ((i_8_ & 0x1) != 0)
					{
						i_4_ &= (1 << i_6_) ^ 0xffffffff;
						AClass4 aclass4 = null;
						AClass4 aclass4_9_ = anAClass4Array1[i_6_];
						while (aclass4_9_ != null)
						{
							final AClass3 aclass3 = aclass4_9_.anAClass3_1;
							if ((aclass3 != null) && (aclass3.anInt631 > i_7_))
							{
								i_4_ |= 1 << i_6_;
								aclass4 = aclass4_9_;
								aclass4_9_ = aclass4_9_.anAClass4_2;
							}
							else
							{
								aclass4_9_.aBool32 = true;
								final int i_10_ = aclass4_9_.method411();
								i_3_ += i_10_;
								if (aclass3 != null)
								{
									aclass3.anInt631 += i_10_;
								}
								if (i_3_ >= anInt387)
								{
									break while_1_;
								}
								AClass4 aclass4_11_ = aclass4_9_.method417();
								if (aclass4_11_ != null)
								{
									final int i_12_ = aclass4_9_.anInt635;
									for (/**/; aclass4_11_ != null; aclass4_11_ = aclass4_9_.method414())
									{
										method237(aclass4_11_, ((i_12_ * aclass4_11_.method412()) >> 8));
									}
								}
								final AClass4 aclass4_13_ = aclass4_9_.anAClass4_2;
								aclass4_9_.anAClass4_2 = null;
								if (aclass4 == null)
								{
									anAClass4Array1[i_6_] = aclass4_13_;
								}
								else
								{
									aclass4.anAClass4_2 = aclass4_13_;
								}
								if (aclass4_13_ == null)
								{
									anAClass4Array2[i_6_] = aclass4;
								}
								aclass4_9_ = aclass4_13_;
							}
						}
					}
					i_6_ += 4;
					i_7_++;
				}
				i_5_--;
			}
			for (i_5_ = 0; i_5_ < 8; i_5_++)
			{
				AClass4 aclass4 = anAClass4Array1[i_5_];
				final AClass4[] aclass4s = anAClass4Array1;
				final int i_14_ = i_5_;
				anAClass4Array2[i_5_] = null;
				aclass4s[i_14_] = null;
				AClass4 aclass4_15_;
				for (/**/; aclass4 != null; aclass4 = aclass4_15_)
				{
					aclass4_15_ = aclass4.anAClass4_2;
					aclass4.anAClass4_2 = null;
				}
			}
		}
		if (anInt392 < 0)
		{
			anInt392 = 0;
		}
		if (anAClass4_1 != null)
		{
			anAClass4_1.method413(is, 0, i);
		}
		aLong5 = Class52.method377();
	}

	@SuppressWarnings("unused") // NOTE: Overridden.
	void method236(final Component component) throws Exception {}

	private void method237(final AClass4 aclass4, final int i)
	{
		final int i_16_ = i >> 5;
		final AClass4 aclass4_17_ = anAClass4Array2[i_16_];
		if (aclass4_17_ == null)
		{
			anAClass4Array1[i_16_] = aclass4;
		}
		else
		{
			aclass4_17_.anAClass4_2 = aclass4;
		}
		anAClass4Array2[i_16_] = aclass4;
		aclass4.anInt635 = i;
	}

	private void method238(final int i)
	{
		anInt392 -= i;
		if (anInt392 < 0)
		{
			anInt392 = 0;
		}
		if (anAClass4_1 != null)
		{
			anAClass4_1.method416(i);
		}
	}

	private static void method239(final AClass4 aclass4)
	{
		aclass4.aBool32 = false;
		if (aclass4.anAClass3_1 != null)
		{
			aclass4.anAClass3_1.anInt631 = 0;
		}
		for (AClass4 aclass4_18_ = aclass4.method417(); aclass4_18_ != null; aclass4_18_ = aclass4.method414())
		{
			method239(aclass4_18_);
		}
	}

	void method240() throws Exception
	{
		/* empty */
	}

	void method241()
	{
		/* empty */
	}

	static AudioUnknown method242(final Class32 class32, final Component component, final int i, int inSampleRate)
	{
		if ((i < 0) || (i >= 2))
		{
			throw new IllegalArgumentException();
		}
		if (inSampleRate < 256)
		{
			inSampleRate = 256;
		}
		Class37_Sub1 class37_sub1;
		try
		{
			final Class37_Sub1 class37_sub1_20_ = new Class37_Sub1();
			((AudioUnknown) class37_sub1_20_).anIntArray87 = new int[256 * (maybe_isStereo ? 2 : 1)];
			((AudioUnknown) class37_sub1_20_).anInt390 = inSampleRate;
			class37_sub1_20_.method236(component);
			((AudioUnknown) class37_sub1_20_).anInt395 = (inSampleRate & ~0x3ff) + 1024;
			if (((AudioUnknown) class37_sub1_20_).anInt395 > 16384)
			{
				((AudioUnknown) class37_sub1_20_).anInt395 = 16384;
			}
			class37_sub1_20_.method244(((AudioUnknown) class37_sub1_20_).anInt395);
			if ((anInt389 > 0) && (aClass12_1 == null))
			{
				aClass12_1 = new Class12();
				aClass12_1.aClass32_1 = class32;
				class32.method218(0, aClass12_1);
			}
			if (aClass12_1 != null)
			{
				if (aClass12_1.aClass37Array1[i] != null)
				{
					throw new IllegalArgumentException();
				}
				aClass12_1.aClass37Array1[i] = class37_sub1_20_;
			}
			class37_sub1 = class37_sub1_20_;
		}
		catch (final Throwable throwable)
		{
			return new AudioUnknown();
		}
		return class37_sub1;
	}

	synchronized void method243()
	{
		if (aClass12_1 != null)
		{
			boolean bool = true;
			for (int i = 0; i < 2; i++)
			{
				if (this == aClass12_1.aClass37Array1[i])
				{
					aClass12_1.aClass37Array1[i] = null;
				}
				if (aClass12_1.aClass37Array1[i] != null)
				{
					bool = false;
				}
			}
			if (bool)
			{
				aClass12_1.aBool5 = true;
				while (aClass12_1.aBool6)
				{
					Isaac.unknownSleep(68, 50L);
				}
				aClass12_1 = null;
			}
		}
		method241();
		this.anIntArray87 = null;
		aBool22 = true;
	}

	@SuppressWarnings("unused") // NOTE: Overridden.
	void method244(final int i) throws Exception {}

	static void method111(final int[] is, int i, int i_0_)
	{
		i_0_ = (i_0_ + i) - 7;
		while (i < i_0_)
		{
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_0_ += 7;
		while (i < i_0_)
		{
			is[i++] = 0;
		}
	}

	AudioUnknown()
	{
		aLong5 = Class52.method377();
		anInt391 = 0;
		aLong7 = 0L;
		anInt394 = 0;
		aLong6 = 0L;
		anInt392 = 0;
		anInt393 = 0;
		anAClass4Array2 = new AClass4[8];
		anAClass4Array1 = new AClass4[8];
		aBool23 = true;
	}
}
