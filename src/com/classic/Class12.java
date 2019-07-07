package com.classic;

final class Class12 implements Runnable
{
	static Class38 aClass38_2;
	static int anInt138;
	Class32 aClass32_1;
	AudioUnknown[] aClass37Array1 = new AudioUnknown[2];
	boolean aBool5 = false;
	static int anInt139;
	static int anInt140 = 0;
	boolean aBool6 = false;

	static int method108(final byte i)
	{
		anInt138++;
		final int i_0_ = Class10.method84(-99, Class52.aByteArray20, Class25.anInt302);
		Class25.anInt302 += 2;
		return i_0_;
	}

	@Override
	public void run()
	{
		anInt139++;
		this.aBool6 = true;
		do
		{
			try
			{
				try
				{
					while (!this.aBool5)
					{
						for (int i = 0; 2 > i; i++)
						{
							final AudioUnknown class37 = this.aClass37Array1[i];
							if (class37 != null)
							{
								class37.method234();
							}
						}
						Class7.unknownSleep(43, 10L);
						Class34.method226((byte) -106, null, this.aClass32_1);
					}
				}
				catch (final Exception exception)
				{
					Class9.method61(exception, 83, null);
					this.aBool6 = false;
					break;
				}
				this.aBool6 = false;
			}
			catch (final Exception object)
			{
				this.aBool6 = false;
				throw object;
			}
		}
		while (false);
	}

	static
	{
		aClass38_2 = new Class38("WTI", "office", "_wti", 5);
	}
}
