package com.classic;

final class Class10
{
	private final int anInt75;
	private final int anInt77;
	private final int anInt81;
	private final String[][] aStringArrayArray1;
	int[] anIntArray23;
	int[] anIntArray24;
	static int[] anIntArray25;
	private final boolean[] aBoolArray1;
	static String[] aStringArray8 = new String[200];
	private final String[] aStringArray9;
	private final int[] anIntArray26;
	private final boolean aBool4;
	static int anInt90;
	private final int anInt91;
	private final boolean[] aBoolArray2;
	static String[] aStringArray10;
	private final String[][] aStringArrayArray2;
	private final int[] anIntArray27;
	private final int anInt98;
	private final int[] anIntArray28;
	private final String[][] aStringArrayArray3;
	private int anInt101;
	private final boolean[] aBoolArray3;
	private final int[] anIntArray29;
	private final int[] anIntArray30;
	private final boolean[] aBoolArray4;
	private int anInt103;
	private boolean[] aBoolArray5;
	private final int anInt106;
	private final int anInt109;
	private int anInt110 = 0;
	private final GameImage aClass46_2;
	private int anInt112;
	static String[] aStringArray11;
	private final int[] anIntArray31;
	static int anInt114;
	static Class38 aClass38_1;
	static int[] anIntArray32;
	private int anInt115;
	private int anInt117 = 0;
	private final int[] anIntArray33;
	private final int anInt120;
	private final int anInt123;
	static GameWindow gameWindow;
	private final int anInt127;
	private final int[] anIntArray34;
	static int anInt129;
	private final int[][] anIntArrayArray6;
	private int anInt131;
	private int anInt133;
	private int anInt135;
	private final int[] anIntArray35;

	private void method64(final int i, final String string, final int i_0_, final int i_1_, final int i_2_,
	        final int i_3_)
	{
		final int i_4_ = i_1_ + (aClass46_2.method315(i_2_) / 3);
		method103(20166, i_0_, i_4_, i_3_, string, i, i_2_);
	}

	int method65(final int i, final int i_5_, final int i_7_, final int i_8_)
	{
		anIntArray35[anInt135] = 10;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray27[anInt135] = i_7_ + -(i_8_ / 2);
		anIntArray30[anInt135] = -(i_5_ / 2) + i;
		anIntArray31[anInt135] = i_8_;
		anIntArray28[anInt135] = i_5_;
		return anInt135++;
	}

	void method66(final int index)
	{
		aBoolArray5[index] = false;
	}

	private void method67(final int i, final int i_10_, final int i_11_, final int i_12_, final int i_13_,
	        final int i_14_)
	{
		aClass46_2.method321(i_11_, 16777215, i_12_, i_13_, i, i_10_ + 1);
		aClass46_2.method341(i_13_, i_11_, i, anInt103);
		aClass46_2.method319(anInt103, i_12_, i_11_, i);
		aClass46_2.method341(i_13_, i_11_ + (i_12_ - 1), i, anInt91);
		aClass46_2.method319(anInt91, i_12_, i_11_, (i + -1) - -i_13_);
		if (anIntArray33[i_14_] == 1)
		{
			for (int i_15_ = 0; i_12_ > i_15_; i_15_++)
			{
				aClass46_2.method341(1, i_11_ + i_15_, i_15_ + i, 0);
				aClass46_2.method341(1, i_11_ + i_15_, (i - -i_13_) + (-1 - i_15_), 0);
			}
		}
		if (i_10_ != 0)
		{
			anInt115 = 32;
		}
	}

	void method68(final String string, final int i, final String string_16_, final int i_17_, final int i_18_,
	        final int i_19_, final String string_20_)
	{
		aStringArrayArray3[i][i_18_] = string_20_;
		if (i_19_ != 0)
		{
			aBoolArray5 = null;
		}
		anIntArrayArray6[i][i_18_] = i_17_;
		aStringArrayArray2[i][i_18_] = string;
		aStringArrayArray1[i][i_18_] = string_16_;
		if (this.anIntArray24[i] < (i_18_ + 1))
		{
			this.anIntArray24[i] = i_18_ - -1;
		}
	}

	void method69(final int index)
	{
		aBoolArray5[index] = true;
	}

	private void method70(final int i, int i_22_, final int i_23_, final int i_24_, final int[] is,
	        final String[] strings, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final int i_29_)
	{
		final int i_30_ = i_25_ / aClass46_2.method315(i_28_);
		if (i_22_ > (i_26_ - i_30_))
		{
			i_22_ = -i_30_ + i_26_;
		}
		if (i_22_ < 0)
		{
			i_22_ = 0;
		}
		this.anIntArray23[i_23_] = i_22_;
		if (i_30_ < i_26_)
		{
			final int i_31_ = i_29_ + i_24_ + -12;
			int i_32_ = ((i_25_ + -27) * i_30_) / i_26_;
			if (i_32_ < 6)
			{
				i_32_ = 6;
			}
			int i_33_ = (i_22_ * ((i_25_ - 27) + -i_32_)) / (i_26_ - i_30_);
			if ((anInt110 == 1) && (i_31_ <= anInt131) && (anInt131 <= (i_31_ + 12)))
			{
				if ((anInt133 > i) && (anInt133 < (i - -12)) && (i_22_ > 0))
				{
					i_22_--;
				}
				if ((((i - -i_25_) + -12) < anInt133) && ((i_25_ + i) > anInt133) && (i_22_ < (-i_30_ + i_26_)))
				{
					i_22_++;
				}
				this.anIntArray23[i_23_] = i_22_;
			}
			if ((anInt110 == 1) && (((anInt131 >= i_31_) && (anInt131 <= (i_31_ + 12)))
			        || ((anInt131 >= (i_31_ - 12)) && ((i_31_ - -24) >= anInt131) && aBoolArray3[i_23_])))
			{
				if ((anInt133 > (i + 12)) && (((i - -i_25_) + -12) > anInt133))
				{
					aBoolArray3[i_23_] = true;
					final int i_34_ = (anInt133 + -(i_32_ / 2)) - (i + 12);
					i_22_ = (i_34_ * i_26_) / (i_25_ + -24);
					if ((-i_30_ + i_26_) < i_22_)
					{
						i_22_ = i_26_ - i_30_;
					}
					if (i_22_ < 0)
					{
						i_22_ = 0;
					}
					this.anIntArray23[i_23_] = i_22_;
				}
			}
			else
			{
				aBoolArray3[i_23_] = false;
			}
			i_33_ = ((-i_32_ + i_25_ + -27) * i_22_) / (i_26_ - i_30_);
			method106(i_33_, i_32_, i, (byte) -40, i_29_, i_25_, i_24_);
		}
		final int i_35_ = -(aClass46_2.method315(i_28_) * i_30_) + i_25_;
		int i_36_ = ((i - -((5 * aClass46_2.method315(i_28_)) / 6)) + (i_35_ / 2));
		if (i_27_ == -5452)
		{
			for (int i_37_ = i_22_; i_26_ > i_37_; i_37_++)
			{
				if ((anInt112 != 0) && (anInt131 >= (i_24_ + 2))
				        && (anInt131 <= ((i_24_ + 2) - -aClass46_2.method328(strings[i_37_], -109, i_28_)))
				        && (i_36_ >= (anInt133 + -2))
				        && ((anInt133 + -2) > (i_36_ - aClass46_2.method315(i_28_))))
				{
					aBoolArray1[i_23_] = true;
					anIntArray33[i_23_] = GameWindow.bitwiseOr(i_37_, anInt112 << 16);
				}
				method103(20166, i_23_, i_36_, i_24_ - -2, strings[i_37_], is[i_37_], i_28_);
				i_36_ += (aClass46_2.method315(i_28_) + -GameImage.anInt568);
				if ((i_25_ + i) <= i_36_)
				{
					break;
				}
			}
		}
	}

	void method71(final int i)
	{
		for (int i_38_ = 0; anInt135 > i_38_; i_38_++)
		{
			if (aBoolArray5[i_38_])
			{
				if (anIntArray35[i_38_] != 0)
				{
					if (anIntArray35[i_38_] == 1)
					{
						method64(0, aStringArray9[i_38_], i_38_, anIntArray30[i_38_], anIntArray26[i_38_], (anIntArray27[i_38_]
						        - (aClass46_2.method328(aStringArray9[i_38_], -128, anIntArray26[i_38_]) / 2)));
					}
					else if (anIntArray35[i_38_] == 2)
					{
						method93(anIntArray30[i_38_], anIntArray28[i_38_], anIntArray31[i_38_], anIntArray27[i_38_]);
					}
					else if (anIntArray35[i_38_] != 3)
					{
						if (anIntArray35[i_38_] != 4)
						{
							if ((anIntArray35[i_38_] == 5) || (anIntArray35[i_38_] == 6))
							{
								method104(anIntArray26[i_38_], anIntArray30[i_38_], anIntArray28[i_38_], i_38_, anIntArray31[i_38_],
								        anIntArray27[i_38_], aStringArray9[i_38_]);
							}
							else if (anIntArray35[i_38_] != 7)
							{
								if (anIntArray35[i_38_] == 8)
								{
									method87(aStringArrayArray3[i_38_], anIntArray30[i_38_], anIntArray26[i_38_],
									        i_38_, anIntArray27[i_38_]);
								}
								else if (anIntArray35[i_38_] == 9)
								{
									method82((this.anIntArray23[i_38_]), anIntArray27[i_38_], anIntArray31[i_38_],
									        anIntArrayArray6[i_38_], anIntArray26[i_38_], aStringArrayArray3[i_38_],
									        (this.anIntArray24[i_38_]), i_38_, anIntArray30[i_38_],
									        anIntArray28[i_38_]);
								}
								else if (anIntArray35[i_38_] == 11)
								{
									method102(anIntArray28[i_38_], anIntArray30[i_38_], anIntArray27[i_38_],
									        anIntArray31[i_38_]);
								}
								else if (anIntArray35[i_38_] == 12)
								{
									method105(anIntArray27[i_38_], anIntArray30[i_38_], anIntArray26[i_38_]);
								}
								else if (anIntArray35[i_38_] == 14)
								{
									method67(anIntArray27[i_38_], 0, anIntArray30[i_38_], anIntArray28[i_38_],
									        anIntArray31[i_38_], i_38_);
								}
							}
							else
							{
								method97(aStringArrayArray3[i_38_], anIntArray26[i_38_], anIntArray30[i_38_], 12, i_38_,
								        anIntArray27[i_38_]);
							}
						}
						else
						{
							method70(anIntArray30[i_38_], this.anIntArray23[i_38_], i_38_, anIntArray27[i_38_],
							        anIntArrayArray6[i_38_], aStringArrayArray3[i_38_], anIntArray28[i_38_],
							        this.anIntArray24[i_38_], -5452, anIntArray26[i_38_], anIntArray31[i_38_]);
						}
					}
					else
					{
						method83(anIntArray30[i_38_], anIntArray31[i_38_], anIntArray27[i_38_], i + 6);
					}
				}
				else
				{
					method64(0, aStringArray9[i_38_], i_38_, anIntArray30[i_38_], anIntArray26[i_38_], anIntArray27[i_38_]);
				}
			}
		}
		if (i != -6)
		{
			method106(74, -101, -111, (byte) -81, 89, 0, -12);
		}
		anInt112 = 0;
	}

	int method72(final int i_39_, final boolean bool, final int i_40_, final int i_41_, final String string)
	{
		anIntArray35[anInt135] = 1;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray26[anInt135] = i_40_;
		aBoolArray2[anInt135] = bool;
		anIntArray27[anInt135] = i_41_;
		anIntArray30[anInt135] = i_39_;
		aStringArray9[anInt135] = string;
		return anInt135++;
	}

	int method73(final int i, final int i_42_, final int i_44_)
	{
		final int i_45_ = aClass46_2.anIntArray118[i];
		final int i_46_ = aClass46_2.anIntArray123[i];
		anIntArray35[anInt135] = 12;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray27[anInt135] = i_42_ + -(i_45_ / 2);
		anIntArray30[anInt135] = i_44_ + -(i_46_ / 2);
		anIntArray31[anInt135] = i_45_;
		anIntArray28[anInt135] = i_46_;
		anIntArray26[anInt135] = i;
		return anInt135++;
	}

	int method74(final int i, final int i_47_, final int i_48_, final int i_50_, final int i_51_, final boolean bool,
	        final int i_52_)
	{
		anIntArray35[anInt135] = 4;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray27[anInt135] = i_50_;
		anIntArray30[anInt135] = i_51_;
		anIntArray31[anInt135] = i_47_;
		anIntArray28[anInt135] = i_48_;
		aBoolArray2[anInt135] = bool;
		anIntArray26[anInt135] = i;
		anIntArray29[anInt135] = i_52_;
		this.anIntArray24[anInt135] = 0;
		this.anIntArray23[anInt135] = 0;
		aStringArrayArray3[anInt135] = new String[i_52_];
		anIntArrayArray6[anInt135] = new int[i_52_];
		aStringArrayArray2[anInt135] = new String[i_52_];
		aStringArrayArray1[anInt135] = new String[i_52_];
		return anInt135++;
	}

	void method75(final int i, final int i_54_)
	{
		this.anIntArray24[i_54_] = i;
	}

	int method76(final int i, final int i_55_, final int i_56_, final int i_57_, final boolean bool, final int i_58_,
	        final int i_59_, final int i_60_, final boolean bool_61_)
	{
		anIntArray35[anInt135] = i_60_;
		aBoolArray5[anInt135] = true;
		aBoolArray4[anInt135] = bool_61_;
		aBoolArray1[anInt135] = false;
		anIntArray26[anInt135] = i_59_;
		aBoolArray2[anInt135] = bool;
		anIntArray27[anInt135] = i_57_;
		anIntArray30[anInt135] = i_55_;
		anIntArray31[anInt135] = i_56_;
		anIntArray28[anInt135] = i_58_;
		anIntArray29[anInt135] = i;
		aStringArray9[anInt135] = "";
		return anInt135++;
	}

	static int getUnsignedByte(final byte value)
	{
		return value & 0xff;
	}

	int method78(final int i_63_, final int i_64_, final int i_65_, final int i_66_)
	{
		anIntArray35[anInt135] = 2;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray27[anInt135] = i_66_ - (i_64_ / 2);
		anIntArray30[anInt135] = i_65_ - (i_63_ / 2);
		anIntArray31[anInt135] = i_64_;
		anIntArray28[anInt135] = i_63_;
		return anInt135++;
	}

	static String method79(final int i, final int i_67_)
	{
		if (i != 1)
		{
			return null;
		}
		String string = new StringBuilder().append("").append(i_67_).toString();
		for (int i_68_ = string.length() + -3; 0 < i_68_; i_68_ -= 3)
		{
			string = new StringBuilder().append(string.substring(0, i_68_)).append(",").append(string.substring(i_68_))
			        .toString();
		}
		if (8 < string.length())
		{
			string = new StringBuilder().append("@gre@").append(string.substring(0, -8 + string.length()))
			        .append(" million @whi@(").append(string).append(")").toString();
		}
		else if (string.length() > 4)
		{
			string = new StringBuilder().append("@cya@").append(string.substring(0, -4 + string.length()))
			        .append("K @whi@(").append(string).append(")").toString();
		}
		return string;
	}

	int method80(final int i_69_, final int i_70_, final int i_71_, final boolean bool, final int i_72_, final int i_73_,
	        final int i_74_)
	{
		anIntArray35[anInt135] = 9;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray26[anInt135] = i_73_;
		aBoolArray2[anInt135] = bool;
		anIntArray27[anInt135] = i_71_;
		anIntArray30[anInt135] = i_69_;
		anIntArray31[anInt135] = i_74_;
		anIntArray28[anInt135] = i_72_;
		anIntArray29[anInt135] = i_70_;
		aStringArrayArray3[anInt135] = new String[i_70_];
		anIntArrayArray6[anInt135] = new int[i_70_];
		aStringArrayArray2[anInt135] = new String[i_70_];
		aStringArrayArray1[anInt135] = new String[i_70_];
		this.anIntArray24[anInt135] = 0;
		this.anIntArray23[anInt135] = 0;
		anIntArray33[anInt135] = -1;
		anIntArray34[anInt135] = -1;
		return anInt135++;
	}

	boolean method81(final int i)
	{
		if (aBoolArray5[i] && aBoolArray1[i])
		{
			aBoolArray1[i] = false;
			return true;
		}
		return false;
	}

	private void method82(int i, final int i_76_, final int i_77_, final int[] is, final int i_78_, final String[] strings,
	        final int i_79_, final int i_80_, final int i_81_, final int i_82_)
	{
		final int i_83_ = i_82_ / aClass46_2.method315(i_78_);
		if (i_79_ <= i_83_)
		{
			i = 0;
			this.anIntArray23[i_80_] = 0;
		}
		else
		{
			final int i_84_ = (i_76_ - 12) + i_77_;
			int i_85_ = (i_83_ * (i_82_ + -27)) / i_79_;
			if (6 > i_85_)
			{
				i_85_ = 6;
			}
			int i_86_ = ((i_82_ + -i_85_ + -27) * i) / (i_79_ - i_83_);
			if ((anInt110 == 1) && (i_84_ <= anInt131) && (anInt131 <= (i_84_ + 12)))
			{
				if ((anInt133 > i_81_) && ((i_81_ - -12) > anInt133) && (0 < i))
				{
					i--;
				}
				if ((anInt133 > ((i_81_ - -i_82_) + -12)) && ((i_82_ + i_81_) > anInt133) && (i < (-i_83_ + i_79_)))
				{
					i++;
				}
				this.anIntArray23[i_80_] = i;
			}
			if ((anInt110 != 1) || (((anInt131 < i_84_) || (anInt131 > (i_84_ - -12)))
			        && (((i_84_ + -12) > anInt131) || (anInt131 > (i_84_ + 24)) || !aBoolArray3[i_80_])))
			{
				aBoolArray3[i_80_] = false;
			}
			else if (((i_81_ + 12) < anInt133) && (anInt133 < (i_82_ + i_81_ + -12)))
			{
				aBoolArray3[i_80_] = true;
				final int i_87_ = (-i_81_ - 12) + anInt133 + -(i_85_ / 2);
				i = (i_87_ * i_79_) / (i_82_ + -24);
				if (i < 0)
				{
					i = 0;
				}
				if (i > (i_79_ - i_83_))
				{
					i = -i_83_ + i_79_;
				}
				this.anIntArray23[i_80_] = i;
			}
			i_86_ = ((-i_85_ + (i_82_ - 27)) * i) / (-i_83_ + i_79_);
			method106(i_86_, i_85_, i_81_, (byte) -40, i_77_, i_82_, i_76_);
		}
		anIntArray34[i_80_] = -1;
		final int i_88_ = i_82_ - (aClass46_2.method315(i_78_) * i_83_);
		int i_89_ = ((i_81_ + ((aClass46_2.method315(i_78_) * 5) / 6)) - -(i_88_ / 2));
		for (int i_90_ = i; i_90_ < i_79_; i_90_++)
		{
			int i_91_;
			if (aBoolArray2[i_80_])
			{
				i_91_ = 16777215;
			}
			else
			{
				i_91_ = 0;
			}
			if (((i_76_ + 2) <= anInt131)
			        && (anInt131 <= (aClass46_2.method328(strings[i_90_], -105, i_78_) + (i_76_ + 2)))
			        && (i_89_ >= (anInt133 + -2))
			        && ((anInt133 - 2) > (-aClass46_2.method315(i_78_) + i_89_)))
			{
				if (aBoolArray2[i_80_])
				{
					i_91_ = 8421504;
				}
				else
				{
					i_91_ = 16777215;
				}
				anIntArray34[i_80_] = i_90_;
				if (anInt112 == 1)
				{
					anIntArray33[i_80_] = i_90_;
					aBoolArray1[i_80_] = true;
				}
			}
			if ((i_90_ == anIntArray33[i_80_]) && aBool4)
			{
				i_91_ = 16711680;
			}
			aClass46_2.method361(strings[i_90_], is[i_90_], i_78_, i_89_, i_76_ + 2, i_91_);
			i_89_ += aClass46_2.method315(i_78_);
			if (i_89_ >= (i_82_ + i_81_))
			{
				break;
			}
		}
	}

	private void method83(final int i, final int i_92_, final int i_93_, final int i_94_)
	{
		aClass46_2.method341(i_92_, i, i_93_, i_94_);
	}

	static int method84(final byte[] is, final int i_95_)
	{
		return ((is[i_95_] << 8) & 0xff00) + (is[i_95_ + 1] & 0xff);
	}

	void method85(final int i, final int i_96_, final int i_97_, final int i_99_)
	{
		if (i_97_ != 0)
		{
			anInt112 = i_97_;
		}
		anInt110 = i;
		anInt131 = i_99_;
		anInt133 = i_96_;
		if (i_97_ == 1)
		{
			for (int i_100_ = 0; i_100_ < anInt135; i_100_++)
			{
				if (aBoolArray5[i_100_] && (anIntArray35[i_100_] == 10) && (anIntArray27[i_100_] <= anInt131)
				        && (anIntArray30[i_100_] <= anInt133)
				        && (anInt131 <= (anIntArray31[i_100_] + anIntArray27[i_100_]))
				        && ((anIntArray30[i_100_] - -anIntArray28[i_100_]) >= anInt133))
				{
					aBoolArray1[i_100_] = true;
				}
				if (aBoolArray5[i_100_] && (anIntArray35[i_100_] == 14) && (anIntArray27[i_100_] <= anInt131)
				        && (anInt133 >= anIntArray30[i_100_])
				        && ((anIntArray31[i_100_] + anIntArray27[i_100_]) >= anInt131)
				        && (anInt133 <= (anIntArray30[i_100_] + anIntArray28[i_100_])))
				{
					anIntArray33[i_100_] = 1 - anIntArray33[i_100_];
				}
			}
		}
		if (i == 1)
		{
			anInt117++;
		}
		else
		{
			anInt117 = 0;
		}
		if ((i_97_ == 1) || (anInt117 > 20))
		{
			for (int i_101_ = 0; i_101_ < anInt135; i_101_++)
			{
				if (aBoolArray5[i_101_] && (anIntArray35[i_101_] == 15) && (anInt131 >= anIntArray27[i_101_])
				        && (anInt133 >= anIntArray30[i_101_])
				        && (anInt131 <= (anIntArray31[i_101_] + anIntArray27[i_101_]))
				        && (anInt133 <= (anIntArray28[i_101_] + anIntArray30[i_101_])))
				{
					aBoolArray1[i_101_] = true;
				}
			}
			anInt117 -= 5;
		}
	}

	void method86(final int i)
	{
		if (i != 0)
		{
			if ((anInt101 != -1) && (aStringArray9[anInt101] != null) && aBoolArray5[anInt101])
			{
				final int i_103_ = aStringArray9[anInt101].length();
				if ((i == 8) && (0 < i_103_))
				{
					aStringArray9[anInt101] = aStringArray9[anInt101].substring(0, i_103_ - 1);
				}
				if (((i == 10) || (i == 13)) && (i_103_ > 0))
				{
					aBoolArray1[anInt101] = true;
				}
				final String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
				if (anIntArray29[anInt101] > i_103_)
				{
					for (int i_104_ = 0; string.length() > i_104_; i_104_++)
					{
						if (i == string.charAt(i_104_))
						{
							final StringBuilder stringbuilder = new StringBuilder();
							final String[] strings = aStringArray9;
							final int i_105_ = anInt101;
							strings[i_105_] = stringbuilder.append(strings[i_105_]).append((char) i).toString();
						}
					}
				}
				if (i == 9)
				{
					do
					{
						anInt101 = (anInt101 - -1) % anInt135;
					}
					while ((anIntArray35[anInt101] != 5) && (anIntArray35[anInt101] != 6));
				}
			}
		}
	}

	private void method87(final String[] strings, final int i, final int i_106_, final int i_108_, final int i_109_)
	{
		final int i_110_ = strings.length;
		int i_111_ = i + -(((i_110_ - 1) * aClass46_2.method315(i_106_)) / 2);
		for (int i_112_ = 0; i_110_ > i_112_; i_112_++)
		{
			int i_113_;
			if (aBoolArray2[i_108_])
			{
				i_113_ = 16777215;
			}
			else
			{
				i_113_ = 0;
			}
			final int i_114_ = aClass46_2.method328(strings[i_112_], -114, i_106_);
			if ((anInt131 >= (i_109_ + -(i_114_ / 2))) && (((i_114_ / 2) + i_109_) >= anInt131)
			        && ((anInt133 + -2) <= i_111_)
			        && ((anInt133 - 2) > (-aClass46_2.method315(i_106_) + i_111_)))
			{
				if (aBoolArray2[i_108_])
				{
					i_113_ = 8421504;
				}
				else
				{
					i_113_ = 16777215;
				}
				if (anInt112 == 1)
				{
					anIntArray33[i_108_] = i_112_;
					aBoolArray1[i_108_] = true;
				}
			}
			if (i_112_ == anIntArray33[i_108_])
			{
				if (aBoolArray2[i_108_])
				{
					i_113_ = 16711680;
				}
				else
				{
					i_113_ = 12582912;
				}
			}
			aClass46_2.method361(strings[i_112_], 0, i_106_, i_111_, i_109_ + -(i_114_ / 2), i_113_);
			i_111_ += aClass46_2.method315(i_106_);
		}
	}

	void method88(final int i, final String string, final int i_115_, final boolean bool, final String string_116_,
	        final String string_118_)
	{
		anInt114++;
		int i_119_ = this.anIntArray24[i]++;
		if (anIntArray29[i] <= i_119_)
		{
			this.anIntArray24[i]--;
			i_119_--;
			for (int i_120_ = 0; i_119_ > i_120_; i_120_++)
			{
				aStringArrayArray3[i][i_120_] = aStringArrayArray3[i][i_120_ + 1];
				anIntArrayArray6[i][i_120_] = anIntArrayArray6[i][i_120_ + 1];
				aStringArrayArray2[i][i_120_] = aStringArrayArray2[i][i_120_ + 1];
				aStringArrayArray1[i][i_120_] = aStringArrayArray1[i][i_120_ + 1];
			}
		}
		aStringArrayArray3[i][i_119_] = string;
		anIntArrayArray6[i][i_119_] = i_115_;
		aStringArrayArray2[i][i_119_] = string_116_;
		aStringArrayArray1[i][i_119_] = string_118_;
		if (bool)
		{
			this.anIntArray23[i] = 999999;
		}
	}

	String method89(final int i, final int i_121_, final int i_122_)
	{
		if (i != 13789)
		{
			method103(-36, 103, -51, -16, null, -105, 104);
		}
		return aStringArrayArray2[i_121_][i_122_];
	}

	int method90(final int i, final byte i_123_)
	{
		if (i_123_ != 52)
		{
			anInt90 = 29;
		}
		return anIntArray33[i];
	}

	void method91(final int i_124_)
	{
		anInt101 = i_124_;
	}

	int method92(final int i)
	{
		final int i_125_ = anIntArray34[i];
		return i_125_;
	}

	private void method93(final int i_126_, final int i_127_, final int i_128_, final int i_129_)
	{
		aClass46_2.method357(i_126_, i_127_ + i_126_, i_129_, i_129_ + i_128_);
		aClass46_2.method356(i_128_, i_129_, anInt103, i_126_, anInt91, i_127_);
		if (Class24.aBool16)
		{
			for (int i_130_ = i_129_ - (i_126_ & 0x3f); i_130_ < (i_129_ + i_128_); i_130_ += 128)
			{
				for (int i_131_ = -(0x1f & i_126_) + i_126_; (i_127_ + i_126_) > i_131_; i_131_ += 128)
				{
					aClass46_2.method320(i_130_, Class33.anInt368 + 6, i_131_, 128);
				}
			}
		}
		aClass46_2.method341(i_128_, i_126_, i_129_, anInt103);
		aClass46_2.method341(i_128_ - 2, i_126_ - -1, i_129_ + 1, anInt103);
		aClass46_2.method341(i_128_ + -4, i_126_ + 2, i_129_ + 2, anInt115);
		aClass46_2.method319(anInt103, i_127_, i_126_, i_129_);
		aClass46_2.method319(anInt103, i_127_ - 2, i_126_ + 1, i_129_ + 1);
		aClass46_2.method319(anInt115, i_127_ - 4, i_126_ + 2, i_129_ + 2);
		aClass46_2.method341(i_128_, (i_127_ + i_126_) - 1, i_129_, anInt91);
		aClass46_2.method341(i_128_ + -2, (i_126_ - -i_127_) + -2, i_129_ + 1, anInt91);
		aClass46_2.method341(i_128_ + -4, i_127_ + i_126_ + -3, i_129_ - -2, anInt123);
		aClass46_2.method319(anInt91, i_127_, i_126_, i_129_ + i_128_ + -1);
		aClass46_2.method319(anInt91, i_127_ - 2, i_126_ + 1, i_129_ + i_128_ + -2);
		aClass46_2.method319(anInt123, i_127_ + -4, i_126_ + 2, i_129_ + i_128_ + -3);
		aClass46_2.method323(-10624);
	}

	private int method94(final byte i, final int i_132_, final int i_133_, final int i_134_)
	{
		if (i != 42)
		{
			anInt103 = -94;
		}
		return Class34.method227(false, (i_132_ * Class42.anInt484) / 114, (i_134_ * IOException_Sub1.anInt671) / 114,
		        (i_133_ * Class51.anInt584) / 176);
	}

	int method95(final int i_135_, final int i_136_, final int i_137_, final int i_138_)
	{
		anIntArray35[anInt135] = 11;
		aBoolArray5[anInt135] = true;
		aBoolArray1[anInt135] = false;
		anIntArray27[anInt135] = i_135_ - (i_138_ / 2);
		anIntArray30[anInt135] = i_136_ - (i_137_ / 2);
		anIntArray31[anInt135] = i_138_;
		anIntArray28[anInt135] = i_137_;
		return anInt135++;
	}

	int method96(final int i, final int i_141_, final int i_142_, final int i_143_, final boolean bool,
	        final int i_144_, final boolean bool_145_, final int i_146_)
	{
		anIntArray35[anInt135] = 6;
		aBoolArray5[anInt135] = true;
		aBoolArray4[anInt135] = bool_145_;
		aBoolArray1[anInt135] = false;
		anIntArray26[anInt135] = i_141_;
		aBoolArray2[anInt135] = bool;
		anIntArray27[anInt135] = i;
		anIntArray30[anInt135] = i_144_;
		anIntArray31[anInt135] = i_146_;
		anIntArray28[anInt135] = i_143_;
		anIntArray29[anInt135] = i_142_;
		aStringArray9[anInt135] = "";
		return anInt135++;
	}

	private void method97(final String[] strings, final int i, final int i_147_, final int i_148_, final int i_149_,
	        final int i_150_)
	{
		int i_151_ = 0;
		if (i_148_ == 12)
		{
			final int i_152_ = strings.length;
			for (int i_153_ = 0; i_153_ < i_152_; i_153_++)
			{
				i_151_ += aClass46_2.method328(strings[i_153_], -116, i);
				if (i_153_ < (i_152_ + -1))
				{
					i_151_ += aClass46_2.method328("  ", i_148_ ^ ~0x61, i);
				}
			}
			int i_154_ = i_150_ - (i_151_ / 2);
			final int i_155_ = i_147_ + (aClass46_2.method315(i) / 3);
			for (int i_156_ = 0; i_152_ > i_156_; i_156_++)
			{
				int i_157_;
				if (!aBoolArray2[i_149_])
				{
					i_157_ = 0;
				}
				else
				{
					i_157_ = 16777215;
				}
				if ((i_154_ <= anInt131) && (anInt131 <= (i_154_ - -aClass46_2.method328(strings[i_156_], -121, i)))
				        && (anInt133 <= i_155_) && (anInt133 > (i_155_ + -aClass46_2.method315(i))))
				{
					if (!aBoolArray2[i_149_])
					{
						i_157_ = 16777215;
					}
					else
					{
						i_157_ = 8421504;
					}
					if (anInt112 == 1)
					{
						anIntArray33[i_149_] = i_156_;
						aBoolArray1[i_149_] = true;
					}
				}
				if (i_156_ == anIntArray33[i_149_])
				{
					if (!aBoolArray2[i_149_])
					{
						i_157_ = 12582912;
					}
					else
					{
						i_157_ = 16711680;
					}
				}
				aClass46_2.method361(strings[i_156_], 0, i, i_155_, i_154_, i_157_);
				i_154_ += aClass46_2.method328(new StringBuilder().append(strings[i_156_]).append("  ").toString(),
				        -104, i);
			}
		}
	}

	void method98(final boolean bool, final String string, final int i)
	{
		aStringArray9[i] = string;
		if (bool != true)
		{
			method79(48, 42);
		}
	}

	String method99(final int i, final int i_158_)
	{
		return aStringArrayArray1[i_158_][i];
	}

	String method100(final int i_161_)
	{
		if (aStringArray9[i_161_] == null)
		{
			return "null";
		}
		return aStringArray9[i_161_];
	}

	void method101(final int i)
	{
		this.anIntArray23[i] = 0;
		anIntArray34[i] = -1;
	}

	private void method102(final int i, final int i_163_, final int i_164_, final int i_165_)
	{
		aClass46_2.method321(i_163_, 0, i, i_165_, i_164_, 1);
		aClass46_2.method362(i, i_164_, i_165_, anInt109, i_163_);
		aClass46_2.method362(i + -2, i_164_ + 1, i_165_ + -2, anInt81, i_163_ + 1);
		aClass46_2.method362(i + -4, i_164_ + 2, i_165_ + -4, anInt120, i_163_ + 2);
		aClass46_2.method338(Class33.anInt368 + 2, i_163_, i_164_);
		aClass46_2.method338(3 - -Class33.anInt368, i_163_, i_164_ + i_165_ + -7);
		aClass46_2.method338(Class33.anInt368 + 4, i_163_ + i + -7, i_164_);
		aClass46_2.method338(Class33.anInt368 + 5, i_163_ + i + -7, (i_164_ - -i_165_) + -7);
	}

	private void method103(final int i, final int i_167_, final int i_168_, final int i_169_, final String string,
	        final int i_170_, final int i_171_)
	{
		if (i == 20166)
		{
			int i_172_;
			if (!aBoolArray2[i_167_])
			{
				i_172_ = 0;
			}
			else
			{
				i_172_ = 16777215;
			}
			aClass46_2.method361(string, i_170_, i_171_, i_168_, i_169_, i_172_);
		}
	}

	private void method104(final int i, final int i_173_, final int i_175_, final int i_176_, final int i_177_,
	        int i_178_, String string)
	{
		if (!aBoolArray4[i_176_] != true)
		{
			final int i_179_ = string.length();
			string = "";
			for (int i_180_ = 0; i_179_ > i_180_; i_180_++)
			{
				string = new StringBuilder().append(string).append("X").toString();
			}
		}
		if (anIntArray35[i_176_] == 5)
		{
			if ((anInt112 == 1) && (i_178_ <= anInt131) && ((i_173_ + -(i_175_ / 2)) <= anInt133)
			        && ((i_178_ + i_177_) >= anInt131) && (anInt133 <= (i_173_ - -(i_175_ / 2))))
			{
				anInt101 = i_176_;
			}
		}
		else if (anIntArray35[i_176_] == 6)
		{
			if ((anInt112 == 1) && (anInt131 >= (i_178_ - (i_177_ / 2))) && (anInt133 >= (i_173_ + -(i_175_ / 2)))
			        && (anInt131 <= ((i_177_ / 2) + i_178_)) && (((i_175_ / 2) + i_173_) >= anInt133))
			{
				anInt101 = i_176_;
			}
			i_178_ -= aClass46_2.method328(string, -102, i) / 2;
		}
		if (i_176_ == anInt101)
		{
			string = new StringBuilder().append(string).append("*").toString();
		}
		final int i_182_ = (aClass46_2.method315(i) / 3) + i_173_;
		method103(20166, i_176_, i_182_, i_178_, string, 0, i);
	}

	Class10(final GameImage class46, final int i)
	{
		aBool4 = true;
		anInt131 = 0;
		anInt101 = -1;
		anInt112 = 0;
		anInt135 = 0;
		anInt133 = 0;
		anIntArray28 = new int[i];
		aBoolArray3 = new boolean[i];
		aClass46_2 = class46;
		anIntArrayArray6 = new int[i][];
		anIntArray35 = new int[i];
		anIntArray26 = new int[i];
		this.anIntArray24 = new int[i];
		anIntArray27 = new int[i];
		aStringArrayArray1 = new String[i][];
		aBoolArray5 = new boolean[i];
		aStringArray9 = new String[i];
		this.anIntArray23 = new int[i];
		aStringArrayArray3 = new String[i][];
		aBoolArray4 = new boolean[i];
		anIntArray33 = new int[i];
		aBoolArray2 = new boolean[i];
		anIntArray31 = new int[i];
		aStringArrayArray2 = new String[i][];
		anIntArray29 = new int[i];
		anIntArray30 = new int[i];
		anIntArray34 = new int[i];
		aBoolArray1 = new boolean[i];
		anInt106 = method94((byte) 42, 114, 176, 114);
		anInt75 = method94((byte) 42, 14, 62, 14);
		anInt98 = method94((byte) 42, 208, 232, 200);
		anInt127 = method94((byte) 42, 129, 184, 96);
		anInt77 = method94((byte) 42, 95, 115, 53);
		anInt109 = method94((byte) 42, 142, 171, 117);
		anInt81 = method94((byte) 42, 122, 158, 98);
		anInt120 = method94((byte) 42, 100, 136, 86);
		anInt103 = method94((byte) 42, 146, 179, 135);
		anInt115 = method94((byte) 42, 112, 151, 97);
		anInt123 = method94((byte) 42, 102, 136, 88);
		anInt91 = method94((byte) 42, 93, 120, 84);
	}

	private void method105(final int i, final int i_183_, final int i_185_)
	{
		aClass46_2.method338(i_185_, i_183_, i);
	}

	private void method106(final int i, final int i_186_, final int i_187_, final byte i_188_, final int i_189_,
	        final int i_190_, final int i_191_)
	{
		final int i_192_ = (i_189_ + i_191_) - 12;
		aClass46_2.method362(i_190_, i_192_, 12, 0, i_187_);
		aClass46_2.method338(0 - -Class33.anInt368, i_187_ + 1, i_192_ + 1);
		aClass46_2.method338(Class33.anInt368 + 1, i_187_ + i_190_ + -12, i_192_ + 1);
		if (i_188_ != -40)
		{
			method106(119, -27, -7, (byte) 6, 62, 28, -36);
		}
		aClass46_2.method341(12, i_187_ + 13, i_192_, 0);
		aClass46_2.method341(12, (i_187_ + i_190_) - 13, i_192_, 0);
		aClass46_2.method356(11, i_192_ + 1, anInt75, i_187_ - -14, anInt106, i_190_ + -27);
		aClass46_2.method321(i_187_ + i + 14, anInt127, i_186_, 7, i_192_ + 3, 1);
		aClass46_2.method319(anInt98, i_186_, i - -i_187_ - -14, i_192_ - -2);
		aClass46_2.method319(anInt77, i_186_, i_187_ + i + 14, (i_192_ + 2) - -8);
	}

	static
	{
		anIntArray25 = new int[256];
		anInt90 = 0;
		anInt129 = 0;
		aClass38_1 = new Class38("INTBETA", "office", "_intbeta", 6);
	}
}
