package com.classic;

final class Class18
{
	static int[] anIntArray41;
	static String[] aStringArray15;
	static int anInt195;

	static String method131(final int i, final String string, final int i_0_)
	{
		anInt195++;
		String string_1_ = "";
		if (i_0_ != 97)
		{
			method131(-44, null, -34);
		}
		for (int i_2_ = 0; i > i_2_; i_2_++)
		{
			if (i_2_ < string.length())
			{
				final char c = string.charAt(i_2_);
				if ((c < 'a') || (c > 'z'))
				{
					if ((c >= 'A') && ('Z' >= c))
					{
						string_1_ = new StringBuilder().append(string_1_).append(c).toString();
					}
					else if ((c >= '0') && ('9' >= c))
					{
						string_1_ = new StringBuilder().append(string_1_).append(c).toString();
					}
					else
					{
						string_1_ = new StringBuilder().append(string_1_).append('_').toString();
					}
				}
				else
				{
					string_1_ = new StringBuilder().append(string_1_).append(c).toString();
				}
			}
			else
			{
				string_1_ = new StringBuilder().append(string_1_).append(" ").toString();
			}
		}
		return string_1_;
	}
}
