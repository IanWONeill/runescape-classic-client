package com.classic;

final class Class29
{
	static int anInt333;
	private static long[] aLongArray1;
	static int anInt334;
	static int anInt335;
	static int anInt336;
	static int anInt337;
	static int anInt338;
	static int anInt339;
	static int anInt340;
	static int anInt341;
	static int anInt342;
	static int anInt343;
	static int anInt344;
	static int anInt345;
	static int anInt346;
	private Class46_Sub1 aClass46_Sub1_1;
	static int anInt347;
	static int anInt348;
	private Class9[] aClass9Array1;
	static int anInt349;
	static int anInt350;
	static int anInt351;
	private int anInt352 = 0;
	static int anInt353;
	private int anInt354 = 0;
	private int anInt355 = 0;
	static int[] anIntArray83 = new int[100];
	private final int anInt356;
	static int anInt357;
	private String aString12;
	static int anInt358;
	static int anInt359;
	static int anInt360;
	static int anInt361;
	static int anInt362;
	static int anInt363;
	static int anInt364;
	static int anInt365;
	static int anInt366;

	void method185(final String string, final String string_0_, final int i, final int i_1_, final int i_2_,
	        final int i_3_, final int i_4_, final byte i_5_)
	{
		anInt361++;
		method188(true, 0, i_2_, i_4_, string_0_, i, string, null, null, i_1_, i_3_, null);
	}

	int method186(final int i, final byte i_6_)
	{
		anInt333++;
		return aClass9Array1[i].anInt68;
	}

	String method187(final int i, final int i_7_)
	{
		anInt359++;
		return aClass9Array1[i].aString5;
	}

	private void method188(final boolean bool, final int i, final int i_9_, final int i_10_, final String string,
	        final int i_11_, final String string_12_, final String string_13_, final String string_14_, final int i_15_,
	        final int i_16_, final String string_17_)
	{
		if (bool != true)
		{
			aClass46_Sub1_1 = null;
		}
		anInt362++;
		if (aClass9Array1.length == anInt354)
		{
			final Class9[] class9s = aClass9Array1;
			aClass9Array1 = new Class9[anInt354 + 10];
			for (int i_18_ = 0; i_18_ < aClass9Array1.length; i_18_++)
			{
				if (i_18_ >= anInt354)
				{
					aClass9Array1[i_18_] = new Class9();
				}
				else
				{
					aClass9Array1[i_18_] = class9s[i_18_];
				}
			}
		}
		aClass9Array1[anInt354++].method60(i_15_, string_12_, string_17_, i, string_14_, i_16_, i_11_, -30365,
		        string_13_, i_10_, i_9_, string);
		method191(26684);
	}

	private int method189(final boolean bool, final int i, final int i_19_, final int i_20_, final boolean bool_21_,
	        final int i_22_)
	{
		anInt340++;
		if ((anInt355 == 0) || (anInt352 == 0))
		{
			return -1;
		}
		if (bool_21_)
		{
			aClass46_Sub1_1.method327(i_22_, i_20_, anInt355, 160, 84, 13684944, anInt352);
		}
		final int i_23_ = 1 + aClass46_Sub1_1.method315((byte) 97, anInt356);
		int i_24_ = i_23_ + i_20_ + -3;
		int i_25_ = -1;
		if (aString12 != null)
		{
			if ((i_22_ < i_19_) && ((-i_23_ + i_24_ + 3) < i) && (i < (i_24_ + 3)) && (i_19_ < (anInt355 + i_22_)))
			{
				if (!bool_21_)
				{
					return -2;
				}
				i_25_ = -2;
			}
			if (bool_21_)
			{
				aClass46_Sub1_1.method324(aString12, 0, anInt356, 65535, i_22_ + 2, i_24_);
			}
			i_24_ += i_23_;
		}
		for (int i_26_ = 0; i_26_ < anInt354; i_26_++)
		{
			int i_27_ = 16777215;
			if ((i_22_ < i_19_) && (((i_24_ + 3) - i_23_) < i) && ((i_24_ + 3) > i) && ((anInt355 + i_22_) > i_19_))
			{
				i_27_ = 16776960;
				if (!bool_21_)
				{
					return i_26_;
				}
				i_25_ = i_26_;
			}
			if (bool_21_)
			{
				aClass46_Sub1_1.method324(
				        new StringBuilder().append(aClass9Array1[i_26_].aString4).append(" ")
				                .append(aClass9Array1[i_26_].aString3).toString(),
				        0, anInt356, i_27_, i_22_ + 2, i_24_);
			}
			i_24_ += i_23_;
		}
		return i_25_;
	}

	void method190(final boolean bool)
	{
		anInt354 = 0;
		anInt336++;
		method191(26684);
	}

	private void method191(final int i)
	{
		anInt341++;
		final int i_28_ = 1 + aClass46_Sub1_1.method315((byte) 111, anInt356);
		if (aString12 != null)
		{
			anInt352 = i_28_;
			anInt355 = aClass46_Sub1_1.method328(aString12, -107, anInt356) - -5;
		}
		else
		{
			anInt355 = 0;
			anInt352 = 0;
		}
		for (int i_29_ = 0; anInt354 > i_29_; i_29_++)
		{
			anInt352 += i_28_;
			final int i_30_ = ((aClass46_Sub1_1.method328(new StringBuilder().append(aClass9Array1[i_29_].aString4)
			        .append(" ").append(aClass9Array1[i_29_].aString3).toString(), -108, anInt356)) + 5);
			if (anInt355 < i_30_)
			{
				anInt355 = i_30_;
			}
		}
	}

	int method192(final int i, final int i_31_)
	{
		if (i != 1891)
		{
			return -20;
		}
		anInt338++;
		return aClass9Array1[i_31_].anInt66;
	}

	void method193(final int i, final String string, final String string_32_, final int i_33_, final int i_34_,
	        final int i_35_, final int i_36_)
	{
		method188(true, 0, i_33_, i_36_, string, i, string_32_, null, null, i_34_, 0, null);
		if (i_35_ != 2743)
		{
			anInt352 = -74;
		}
		anInt345++;
	}

	Class29(final Class46_Sub1 class46_sub1, final int i)
	{
		this(class46_sub1, i, null);
	}

	static Class38[] method194(final byte i)
	{
		anInt334++;
		return (new Class38[] { Class22.aClass38_3, Class47.aClass38_6, Class27.aClass38_4, IOException_Sub1.aClass38_8,
		        Class16_Sub1.aClass38_7, Class12.aClass38_2, Class10.aClass38_1 });
	}

	void method195(final String string, final int i, final String string_37_, final int i_38_, final int i_39_,
	        final int i_40_)
	{
		method188(true, 0, i_40_, i, string_37_, i_38_, string, null, null, i_39_, 0, null);
		anInt342++;
	}

	void method196(final String string, final int i, final String string_41_, final byte i_42_, final int i_43_)
	{
		anInt349++;
		method188(true, 0, i, i_43_, string_41_, 0, string, null, null, 0, 0, null);
	}

	int method197(final int i, final int i_45_, final int i_46_, final int i_47_, final int i_48_)
	{
		anInt344++;
		return method189(false, i_45_, i, i_46_, false, i_47_);
	}

	int method198(final int i)
	{
		anInt351++;
		return anInt354;
	}

	void method199(final int i)
	{
		anInt335++;
		if (anInt354 != 0)
		{
			final int[] is = new int[anInt354];
			final Object[] objects = new Object[anInt354];
			for (int i_49_ = 0; i_49_ < anInt354; i_49_++)
			{
				final Class9 class9 = aClass9Array1[i_49_];
				is[i_49_] = class9.anInt72;
				objects[i_49_] = class9;
			}
			if (i != 10)
			{
				method205(-107, (byte) 51);
			}
			Class46_Sub1.method410(is, objects, (byte) 122);
			for (int i_50_ = 0; i_50_ < anInt354; i_50_++)
			{
				aClass9Array1[i_50_] = (Class9) objects[i_50_];
			}
		}
	}

	int method200(final boolean bool, final int i)
	{
		anInt365++;
		return aClass9Array1[i].anInt64;
	}

	String method201(final int i, final int i_51_)
	{
		if (i != 0)
		{
			anIntArray83 = null;
		}
		anInt364++;
		return aClass9Array1[i_51_].aString3;
	}

	void method202(final int i, final int i_52_)
	{
		anInt366++;
		if ((0 <= i) && (i < anInt354))
		{
			final Class9 class9 = aClass9Array1[i];
			for (int i_53_ = i; i_53_ < (anInt354 + -1); i_53_++)
			{
				aClass9Array1[i_53_] = aClass9Array1[i_53_ + 1];
			}
			aClass9Array1[--anInt354] = class9;
			method191(26684);
		}
	}

	int method203(final int i, final int i_54_)
	{
		if (i != 0)
		{
			aLongArray1 = null;
		}
		anInt360++;
		return aClass9Array1[i_54_].anInt72;
	}

	int method204(final int i, final int i_55_, final byte i_56_, final int i_57_, final int i_58_)
	{
		anInt346++;
		return method189(false, i_58_, i_57_, i_55_, true, i);
	}

	String method205(final int i, final byte i_59_)
	{
		anInt357++;
		if (i_59_ < 111)
		{
			aClass46_Sub1_1 = null;
		}
		return aClass9Array1[i].aString4;
	}

	static String method206(final int i, final Class27_Sub1 class27_sub1, final int i_60_)
	{
		anInt337++;
		String string;
		try
		{
			int i_61_ = class27_sub1.method390(0);
			if (i_61_ > i_60_)
			{
				i_61_ = i_60_;
			}
			final byte[] is = new byte[i_61_];
			class27_sub1.anInt608 += Class41.aClass44_2.method301(is, (byte) -11, (class27_sub1.aByteArray24), 0,
			        (class27_sub1.anInt608), i_61_);
			final String string_62_ = Class9.method62(i_61_, (byte) 87, 0, is);
			string = string_62_;
		}
		catch (final Exception exception)
		{
			return "Cabbage";
		}
		return string;
	}

	int method207(final boolean bool)
	{
		anInt347++;
		return anInt355;
	}

	void method208(final int i, final String string, final String string_63_, final byte i_64_, final String string_65_,
	        final String string_66_)
	{
		if (i_64_ > -8)
		{
			aString12 = null;
		}
		method188(true, 0, i, 0, string_66_, 0, string_65_, string, null, 0, 0, string_63_);
		anInt363++;
	}

	Class29(final Class46_Sub1 class46_sub1, final int i, final String string)
	{
		aString12 = string;
		aClass46_Sub1_1 = class46_sub1;
		aClass9Array1 = new Class9[10];
		anInt356 = i;
		for (int i_67_ = 0; 10 > i_67_; i_67_++)
		{
			aClass9Array1[i_67_] = new Class9();
		}
		method191(26684);
	}

	void method209(final String string, final byte i, final String string_68_, final int i_69_)
	{
		anInt350++;
		method188(true, 0, i_69_, 0, string_68_, 0, string, null, null, 0, 0, null);
	}

	int method210(final int i)
	{
		anInt353++;
		if (i != 0)
		{
			aClass9Array1 = null;
		}
		return anInt352;
	}

	int method211(final boolean bool, final int i)
	{
		anInt348++;
		return aClass9Array1[i].anInt67;
	}

	static String method212(final int i)
	{
		anInt339++;
		String string = "";
		while (Class16_Sub1.aByteArray23[Class19.anInt208] != 0)
		{
			string = new StringBuilder().append(string).append((char) Class16_Sub1.aByteArray23[Class19.anInt208++])
			        .toString();
		}
		if (i != 8854)
		{
			method212(3);
		}
		Class19.anInt208++;
		return string;
	}

	void method213(final boolean bool, final int i, final int i_71_, final String string, final int i_72_,
	        final int i_73_, final int i_74_, final int i_75_, final String string_76_)
	{
		method188(bool, i_75_, i, i_74_, string, i_71_, string_76_, null, null, i_72_, i_73_, null);
		anInt343++;
	}

	int method214(final int i, final byte i_77_)
	{
		anInt358++;
		return aClass9Array1[i].anInt65;
	}

	static
	{
		aLongArray1 = new long[256];
		for (int i = 0; 256 > i; i++)
		{
			long l = i;
			for (int i_78_ = 0; 8 > i_78_; i_78_++)
			{
				if ((l & 0x1L) == 1L)
				{
					l = (l >>> 1) ^ ~0x3693a86a2878f0bdL;
				}
				else
				{
					l >>>= 1;
				}
			}
			aLongArray1[i] = l;
		}
	}
}
