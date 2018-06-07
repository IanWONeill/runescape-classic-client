package com.classic;

final class Class1
{
	static Class39 aClass39_1 = null;
	static int anInt1 = 0;
	static int anInt2;
	static int[][] anIntArrayArray1;
	static int[] anIntArray1;
	static int anInt3;

	static int method1(final int i, final int i_0_, final byte[] is, final int i_1_)
	{
		anInt3++;
		int i_2_ = -1;
		for (int i_3_ = i_1_; i_0_ > i_3_; i_3_++)
		{
			i_2_ = (i_2_ >>> 8) ^ Class44.anIntArray114[(is[i_3_] ^ i_2_) & 0xff];
		}
		i_2_ ^= i;
		return i_2_;
	}

	static void method2(final int i, final Class27 class27, final Class27 class27_4_)
	{
		if (class27.aClass27_1 != null)
		{
			class27.method178(124);
		}
		anInt2++;
		class27.aClass27_2 = class27_4_;
		class27.aClass27_1 = class27_4_.aClass27_1;
		class27.aClass27_1.aClass27_2 = class27;
		class27.aClass27_2.aClass27_1 = class27;
	}
}
