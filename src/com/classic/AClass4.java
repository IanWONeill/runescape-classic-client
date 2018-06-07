package com.classic;

abstract class AClass4 extends Class27
{
	boolean aBool32 = true;
	AClass3 anAClass3_1;
	int anInt635;
	AClass4 anAClass4_2;

	abstract int method411();

	int method412()
	{
		return 255;
	}

	abstract void method413(int[] is, int i, int i_0_);

	abstract AClass4 method414();

	void method415(final int[] is, final int i, final int i_1_)
	{
		if (this.aBool32)
		{
			method413(is, i, i_1_);
		}
		else
		{
			method416(i_1_);
		}
	}

	abstract void method416(int i);

	abstract AClass4 method417();
}
