package com.classic;

final class Class43
{
	static String[] aStringArray29 = { "Please enter the number of items to withdraw", "and press enter" };
	static int anInt486;
	Class27 aClass27_3 = new Class27();
	private Class27 aClass27_4;

	Class27 method297()
	{
		final Class27 class27 = aClass27_4;
		if (class27 == this.aClass27_3)
		{
			aClass27_4 = null;
			return null;
		}
		aClass27_4 = class27.aClass27_2;
		return class27;
	}

	static String method298(final CharSequence charsequence)
	{
		if (charsequence == null)
		{
			return null;
		}
		int i_0_ = 0;
		int i_1_;
		for (i_1_ = charsequence.length(); ((i_1_ > i_0_)
		        && EngineHandle.method17(charsequence.charAt(i_0_))); i_0_++)
		{
			/* empty */
		}
		for (/**/; ((i_0_ < i_1_) && EngineHandle.method17(charsequence.charAt(i_1_ + -1))); i_1_--)
		{
			/* empty */
		}
		final int i_2_ = -i_0_ + i_1_;
		if ((i_2_ < 1) || (12 < i_2_))
		{
			return null;
		}
		final StringBuilder stringbuilder = new StringBuilder(i_2_);
		for (int i_4_ = i_0_; i_1_ > i_4_; i_4_++)
		{
			final char c = charsequence.charAt(i_4_);
			if (Class51.method374(c))
			{
				final char c_5_ = Class4.method9(c);
				if (c_5_ != '\0')
				{
					stringbuilder.append(c_5_);
				}
			}
		}
		if (0 == stringbuilder.length())
		{
			return null;
		}
		return stringbuilder.toString();
	}

	Class27 method299()
	{
		final Class27 class27 = this.aClass27_3.aClass27_2;
		if (class27 == this.aClass27_3)
		{
			aClass27_4 = null;
			return null;
		}
		aClass27_4 = class27.aClass27_2;
		return class27;
	}

	public Class43()
	{
		this.aClass27_3.aClass27_1 = this.aClass27_3;
		this.aClass27_3.aClass27_2 = this.aClass27_3;
	}

	void method300(final Class27 class27)
	{
		if (class27.aClass27_1 != null)
		{
			class27.method178();
		}
		class27.aClass27_1 = this.aClass27_3;
		class27.aClass27_2 = this.aClass27_3.aClass27_2;
		class27.aClass27_1.aClass27_2 = class27;
		class27.aClass27_2.aClass27_1 = class27;
	}
}
