package com.classic;

import java.awt.image.ColorModel;

final class Camera
{
	private final int[] anIntArray91;
	private int[] anIntArray92;
	private int anInt417;
	private final int anInt418;
	private int[] anIntArray93;
	private final int[] anIntArray94;
	private int[][] anIntArrayArray13;
	static Class44 aClass44_2;
	static ColorModel aColorModel1;
	private int anInt421;
	private final int[] anIntArray95;
	private int anInt422;
	private final int[] anIntArray96;
	private final int[] anIntArray97;
	static long aLong14;
	private int anInt425;
	private int[][] anIntArrayArray14;
	private final boolean aBool24 = false;
	int anInt426;
	private int anInt427;
	private int anInt428;
	private final int maxModelCount;
	private int anInt432;
	private long[] aLongArray2;
	private final int[] anIntArray98;
	private Class51[] aClass51Array1;
	static String[] aStringArray28 = new String[100];
	private int anInt433;
	private int anInt434;
	private int[] anIntArray99;
	private int anInt435;
	private final Model[] aClass23Array2;
	private int anInt436;
	private final int[][] anIntArrayArray15;
	int anInt437;
	private int halfHeight;
	private int anInt440;
	private byte[][] aByteArrayArray12;
	private int anInt441;
	private int modelCount;
	private int anInt448;
	private final int[] modelIntArray;
	private final int anInt451;
	private final int[] anIntArray101;
	private final GameImage gameImage;
	private boolean[] aBoolArray8;
	private final int anInt456;
	private boolean aBool25;
	private final int[] anIntArray102;
	private int[][] anIntArrayArray16;
	private int anInt460;
	private final int[] anIntArray103;
	private final int anInt462;
	private int halfWidth;
	int anInt464;
	int anInt465;
	private int[][] anIntArrayArray17;
	private boolean aBool26;
	private final int[] anIntArray104;
	private final Model[] modelArray;
	private final int[] anIntArray105;
	private int anInt469;
	private int[] anIntArray106;
	private final int[] anIntArray107;
	private final int[] anIntArray108;
	private int anInt474;
	private final int[] anIntArray109;
	Model aClass23_3;
	private int anInt478;
	private int anInt480;
	private final CameraModel[] cameraModels;
	private int anInt482;

	private void method259(final int[] is, int i, int i_0_, final Model class23, int i_2_, final int[] is_3_,
	        int i_4_, final int[] is_5_)
	{
		if (i_2_ != -2)
		{
			if (0 <= i_2_)
			{
				if (anInt422 <= i_2_)
				{
					i_2_ = 0;
				}
				method289(i_2_, 69);
				final int i_6_ = is_3_[0];
				final int i_7_ = is_5_[0];
				final int i_8_ = is[0];
				final int i_9_ = i_6_ - is_3_[1];
				final int i_10_ = i_7_ + -is_5_[1];
				final int i_11_ = -is[1] + i_8_;
				i_4_--;
				final int i_12_ = is_3_[i_4_] - i_6_;
				final int i_13_ = is_5_[i_4_] + -i_7_;
				final int i_14_ = is[i_4_] + -i_8_;
				if (anIntArray92[i_2_] != 1)
				{
					int i_15_ = ((i_12_ * i_7_) + -(i_6_ * i_13_)) << 11;
					final int i_16_ = (((i_8_ * i_13_) - (i_14_ * i_7_)) << ((-anInt482 + 5 + 4) - -6));
					int i_17_ = ((i_6_ * i_14_) + -(i_8_ * i_12_)) << ((-anInt482 + 5) - -6);
					int i_18_ = ((i_7_ * i_9_) + -(i_10_ * i_6_)) << 11;
					final int i_19_ = (((i_8_ * i_10_) + -(i_11_ * i_7_)) << ((5 - (anInt482 - 4)) + 6));
					int i_20_ = ((i_11_ * i_6_) - (i_9_ * i_8_)) << ((-anInt482 + 5) - -6);
					int i_21_ = ((i_12_ * i_10_) - (i_9_ * i_13_)) << 5;
					final int i_22_ = (((i_13_ * i_11_) + -(i_14_ * i_10_)) << (-anInt482 + 5 + 4));
					int i_23_ = ((i_9_ * i_14_) - (i_12_ * i_11_)) >> (anInt482 + -5);
					final int i_24_ = i_16_ >> 4;
					final int i_25_ = i_19_ >> 4;
					final int i_26_ = i_22_ >> 4;
					final int i_27_ = anInt421 + -anInt432;
					int i_28_ = anInt434;
					int i_29_ = anInt428 - -(i_28_ * anInt421);
					i_21_ += i_23_ * i_27_;
					i_18_ += i_27_ * i_20_;
					i_15_ += i_27_ * i_17_;
					int i_30_ = 1;
					if (aBool26)
					{
						if ((0x1 & anInt421) == 1)
						{
							i_15_ += i_17_;
							i_21_ += i_23_;
							anInt421++;
							i_29_ += i_28_;
							i_18_ += i_20_;
						}
						i_28_ <<= 1;
						i_30_ = 2;
						i_20_ <<= 1;
						i_17_ <<= 1;
						i_23_ <<= 1;
					}
					if (class23.aBool11)
					{
						for (i_0_ = anInt421; i_0_ < anInt425; i_0_ += i_30_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_31_ = class51.anInt589 >> 8;
							int i_32_ = -i + i_31_;
							if (i_32_ <= 0)
							{
								i_29_ += i_28_;
								i_15_ += i_17_;
								i_18_ += i_20_;
								i_21_ += i_23_;
							}
							else
							{
								int i_33_ = class51.anInt581;
								final int i_34_ = ((-i_33_ + class51.anInt585) / i_32_);
								if (-halfWidth > i)
								{
									i_33_ += i_34_ * (-i + -halfWidth);
									i = -halfWidth;
									i_32_ = -i + i_31_;
								}
								if (i_31_ > halfWidth)
								{
									i_31_ = halfWidth;
									i_32_ = -i + i_31_;
								}
								GameImage.method322(i_29_ + i, i_19_, anIntArrayArray16[i_2_], 0, i_34_,
								        i_18_ + (i_25_ * i), i_22_, i_16_, i_33_, 0, i_15_ + (i_24_ * i), (i_26_ * i) + i_21_,
								        i_32_, anIntArray91);
								i_15_ += i_17_;
								i_18_ += i_20_;
								i_21_ += i_23_;
								i_29_ += i_28_;
							}
						}
					}
					else if (!!aBoolArray8[i_2_])
					{
						for (i_0_ = anInt421; anInt425 > i_0_; i_0_ += i_30_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_35_ = class51.anInt589 >> 8;
							int i_36_ = -i + i_35_;
							if (i_36_ <= 0)
							{
								i_29_ += i_28_;
								i_15_ += i_17_;
								i_21_ += i_23_;
								i_18_ += i_20_;
							}
							else
							{
								int i_37_ = class51.anInt581;
								final int i_38_ = ((-i_37_ + class51.anInt585) / i_36_);
								if (i < -halfWidth)
								{
									i_37_ = (i_38_ * (-i + -halfWidth)) + i_37_;
									i = -halfWidth;
									i_36_ = i_35_ - i;
								}
								if (halfWidth < i_35_)
								{
									i_35_ = halfWidth;
									i_36_ = i_35_ - i;
								}
								IOException_Sub1.method459(anIntArrayArray16[i_2_], i_36_, anIntArray91, i_21_ - -(i_26_ * i),
								        i_19_, 0, i_22_, (i_25_ * i) + i_18_, i_37_, i_38_, i_29_ + i,
								        0, 0, i_16_, (i_24_ * i) + i_15_);
								i_21_ += i_23_;
								i_18_ += i_20_;
								i_15_ += i_17_;
								i_29_ += i_28_;
							}
						}
					}
					else
					{
						for (i_0_ = anInt421; anInt425 > i_0_; i_0_ += i_30_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_39_ = class51.anInt589 >> 8;
							int i_40_ = -i + i_39_;
							if (0 >= i_40_)
							{
								i_15_ += i_17_;
								i_29_ += i_28_;
								i_21_ += i_23_;
								i_18_ += i_20_;
							}
							else
							{
								int i_41_ = class51.anInt581;
								final int i_42_ = ((-i_41_ + class51.anInt585) / i_40_);
								if (i < -halfWidth)
								{
									i_41_ = (i_42_ * (-i + -halfWidth)) + i_41_;
									i = -halfWidth;
									i_40_ = -i + i_39_;
								}
								if (halfWidth < i_39_)
								{
									i_39_ = halfWidth;
									i_40_ = -i + i_39_;
								}
								StreamClass.method382(i_41_, anIntArray91, i_18_ - -(i_25_ * i),
								        anIntArrayArray16[i_2_], i_16_, i_21_ - -(i_26_ * i), 0, i_19_, 0,
								        (i_24_ * i) + i_15_, i_40_, i_29_ + i, i_22_, i_42_);
								i_21_ += i_23_;
								i_29_ += i_28_;
								i_18_ += i_20_;
								i_15_ += i_17_;
							}
						}
					}
				}
				else
				{
					int i_43_ = ((i_7_ * i_12_) + -(i_13_ * i_6_)) << 12;
					final int i_44_ = ((i_13_ * i_8_) - (i_7_ * i_14_)) << (-anInt482 + 16);
					int i_45_ = ((i_6_ * i_14_) + -(i_8_ * i_12_)) << (-anInt482 + 5 + 7);
					int i_46_ = ((i_7_ * i_9_) + -(i_10_ * i_6_)) << 12;
					final int i_47_ = (((i_10_ * i_8_) + -(i_7_ * i_11_)) << ((-anInt482 + 5 + 7) - -4));
					int i_48_ = ((i_11_ * i_6_) + -(i_9_ * i_8_)) << (-anInt482 + 5 + 7);
					int i_49_ = ((i_12_ * i_10_) + -(i_9_ * i_13_)) << 5;
					final int i_50_ = (((i_11_ * i_13_) + -(i_14_ * i_10_)) << ((-anInt482 + 5) - -4));
					int i_51_ = ((i_9_ * i_14_) + -(i_11_ * i_12_)) >> (anInt482 + -5);
					final int i_52_ = i_44_ >> 4;
					final int i_53_ = i_47_ >> 4;
					final int i_54_ = i_50_ >> 4;
					final int i_55_ = anInt421 + -anInt432;
					int i_56_ = anInt434;
					int i_57_ = (i_56_ * anInt421) + anInt428;
					i_46_ += i_48_ * i_55_;
					int i_58_ = 1;
					i_49_ += i_51_ * i_55_;
					i_43_ += i_55_ * i_45_;
					if (aBool26 == true)
					{
						if ((anInt421 & 0x1) == 1)
						{
							i_49_ += i_51_;
							i_46_ += i_48_;
							anInt421++;
							i_57_ += i_56_;
							i_43_ += i_45_;
						}
						i_56_ <<= 1;
						i_45_ <<= 1;
						i_48_ <<= 1;
						i_58_ = 2;
						i_51_ <<= 1;
					}
					if (class23.aBool11)
					{
						for (i_0_ = anInt421; i_0_ < anInt425; i_0_ += i_58_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_59_ = class51.anInt589 >> 8;
							int i_60_ = i_59_ - i;
							if (i_60_ <= 0)
							{
								i_49_ += i_51_;
								i_57_ += i_56_;
								i_46_ += i_48_;
								i_43_ += i_45_;
							}
							else
							{
								int i_61_ = class51.anInt581;
								final int i_62_ = ((-i_61_ + class51.anInt585) / i_60_);
								if (-halfWidth > i)
								{
									i_61_ += (-halfWidth - i) * i_62_;
									i = -halfWidth;
									i_60_ = -i + i_59_;
								}
								if (i_59_ > halfWidth)
								{
									i_59_ = halfWidth;
									i_60_ = -i + i_59_;
								}
								Class21.method132(0, (i_54_ * i) + i_49_, i_62_ << 2, i_50_, anIntArrayArray16[i_2_],
								        i_61_, anIntArray91, (i_53_ * i) + i_46_, i_47_, i_44_, 16256,
								        (i_52_ * i) + i_43_, i_57_ + i, i_60_, 0);
								i_46_ += i_48_;
								i_49_ += i_51_;
								i_43_ += i_45_;
								i_57_ += i_56_;
							}
						}
					}
					else if (aBoolArray8[i_2_] != true)
					{
						for (i_0_ = anInt421; i_0_ < anInt425; i_0_ += i_58_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_63_ = class51.anInt589 >> 8;
							int i_64_ = -i + i_63_;
							if (0 >= i_64_)
							{
								i_43_ += i_45_;
								i_57_ += i_56_;
								i_46_ += i_48_;
								i_49_ += i_51_;
							}
							else
							{
								int i_65_ = class51.anInt581;
								final int i_66_ = ((-i_65_ + class51.anInt585) / i_64_);
								if (-halfWidth > i)
								{
									i_65_ += i_66_ * (-i + -halfWidth);
									i = -halfWidth;
									i_64_ = -i + i_63_;
								}
								if (i_63_ > halfWidth)
								{
									i_63_ = halfWidth;
									i_64_ = -i + i_63_;
								}
								Class52.method380(anIntArray91, i_43_ + (i_52_ * i), i_64_, i_44_, i_47_, i_57_ + i,
								        i_66_ << 2, i_49_ + (i_54_ * i), i_50_, 0, anIntArrayArray16[i_2_], 0,
								        (i_53_ * i) + i_46_, i_65_);
								i_57_ += i_56_;
								i_43_ += i_45_;
								i_49_ += i_51_;
								i_46_ += i_48_;
							}
						}
					}
					else
					{
						for (i_0_ = anInt421; anInt425 > i_0_; i_0_ += i_58_)
						{
							final Class51 class51 = aClass51Array1[i_0_];
							i = class51.anInt588 >> 8;
							int i_67_ = class51.anInt589 >> 8;
							int i_68_ = -i + i_67_;
							if (0 >= i_68_)
							{
								i_46_ += i_48_;
								i_49_ += i_51_;
								i_43_ += i_45_;
								i_57_ += i_56_;
							}
							else
							{
								int i_69_ = class51.anInt581;
								final int i_70_ = ((-i_69_ + class51.anInt585) / i_68_);
								if (i < -halfWidth)
								{
									i_69_ = (i_70_ * (-i + -halfWidth)) + i_69_;
									i = -halfWidth;
									i_68_ = -i + i_67_;
								}
								if (halfWidth < i_67_)
								{
									i_67_ = halfWidth;
									i_68_ = -i + i_67_;
								}
								Class47.method367(anIntArray91, i_49_ + (i_54_ * i), i_70_, i_50_, 0,
								        anIntArrayArray16[i_2_], i_57_ - -i, i_43_ + (i_52_ * i), -1504, i_68_, i_44_,
								        i_47_, i_69_, (i_53_ * i) + i_46_, 0, 0);
								i_46_ += i_48_;
								i_49_ += i_51_;
								i_43_ += i_45_;
								i_57_ += i_56_;
							}
						}
					}
				}
			}
			else
			{
				for (int i_71_ = 0; i_71_ < anInt418; i_71_++)
				{
					if (anIntArray104[i_71_] == i_2_)
					{
						anIntArray93 = anIntArrayArray15[i_71_];
						break;
					}
					if (i_71_ == (anInt418 + -1))
					{
						final int i_72_ = (int) (anInt418 * Math.random());
						anIntArray104[i_72_] = i_2_;
						i_2_ = -i_2_ + -1;
						final int i_73_ = ((i_2_ >> 10) & 0x1f) * 8;
						final int i_74_ = ((0x3e7 & i_2_) >> 5) * 8;
						final int i_75_ = (i_2_ & 0x1f) * 8;
						for (int i_76_ = 0; 256 > i_76_; i_76_++)
						{
							final int i_77_ = i_76_ * i_76_;
							final int i_78_ = (i_73_ * i_77_) / 65536;
							final int i_79_ = (i_77_ * i_74_) / 65536;
							final int i_80_ = (i_75_ * i_77_) / 65536;
							anIntArrayArray15[i_72_][-i_76_ + 255] = ((i_78_ << 16) + (i_79_ << 8)) - -i_80_;
						}
						anIntArray93 = anIntArrayArray15[i_72_];
					}
				}
				int i_81_ = anInt434;
				int i_82_ = anInt428 - -(i_81_ * anInt421);
				int i_83_ = 1;
				if (true != !aBool26)
				{
					if ((0x1 & anInt421) == 1)
					{
						i_82_ += i_81_;
						anInt421++;
					}
					i_81_ <<= 1;
					i_83_ = 2;
				}
				if (class23.aBool10)
				{
					for (i_0_ = anInt421; i_0_ < anInt425; i_0_ += i_83_)
					{
						final Class51 class51 = aClass51Array1[i_0_];
						i = class51.anInt588 >> 8;
						int i_84_ = class51.anInt589 >> 8;
						int i_85_ = -i + i_84_;
						if (0 >= i_85_)
						{
							i_82_ += i_81_;
						}
						else
						{
							int i_86_ = class51.anInt581;
							final int i_87_ = ((-i_86_ + class51.anInt585) / i_85_);
							if (i < -halfWidth)
							{
								i_86_ = ((-halfWidth - i) * i_87_) + i_86_;
								i = -halfWidth;
								i_85_ = -i + i_84_;
							}
							if (halfWidth < i_84_)
							{
								i_84_ = halfWidth;
								i_85_ = -i + i_84_;
							}
							Class7.method49(i_87_, anIntArray93, (byte) -115, i_82_ + i, 0, -i_85_, anIntArray91,
							        i_86_);
							i_82_ += i_81_;
						}
					}
				}
				else if (aBool24)
				{
					for (i_0_ = anInt421; i_0_ < anInt425; i_0_ += i_83_)
					{
						final Class51 class51 = aClass51Array1[i_0_];
						i = class51.anInt588 >> 8;
						int i_88_ = class51.anInt589 >> 8;
						int i_89_ = -i + i_88_;
						if (i_89_ <= 0)
						{
							i_82_ += i_81_;
						}
						else
						{
							int i_90_ = class51.anInt581;
							final int i_91_ = ((-i_90_ + class51.anInt585) / i_89_);
							if (i < -halfWidth)
							{
								i_90_ += i_91_ * (-i + -halfWidth);
								i = -halfWidth;
								i_89_ = i_88_ - i;
							}
							if (i_88_ > halfWidth)
							{
								i_88_ = halfWidth;
								i_89_ = -i + i_88_;
							}
							GameImage.method309(i_90_, -20704, anIntArray93, i_91_, -i_89_, anIntArray91, i_82_ + i, 0);
							i_82_ += i_81_;
						}
					}
				}
				else
				{
					for (i_0_ = anInt421; anInt425 > i_0_; i_0_ += i_83_)
					{
						final Class51 class51 = aClass51Array1[i_0_];
						i = class51.anInt588 >> 8;
						int i_92_ = class51.anInt589 >> 8;
						int i_93_ = -i + i_92_;
						if (i_93_ <= 0)
						{
							i_82_ += i_81_;
						}
						else
						{
							int i_94_ = class51.anInt581;
							final int i_95_ = ((-i_94_ + class51.anInt585) / i_93_);
							if (i < -halfWidth)
							{
								i_94_ = (i_95_ * (-i + -halfWidth)) + i_94_;
								i = -halfWidth;
								i_93_ = -i + i_92_;
							}
							if (i_92_ > halfWidth)
							{
								i_92_ = halfWidth;
								i_93_ = i_92_ - i;
							}
							GameFrame.method489(i_82_ + i, -i_93_, i_94_, anIntArray93, anIntArray91, i_95_, 0);
							i_82_ += i_81_;
						}
					}
				}
			}
		}
	}

	private void method260(final int[] is, int i_96_, final int[] is_97_, int i_98_, final int i_99_,
	        int i_100_, final int i_101_, final int[] is_102_, final Model class23, int i_103_)
	{
		if (i_99_ == 3)
		{
			final int i_104_ = is[0] + anInt432;
			final int i_105_ = is[1] + anInt432;
			final int i_106_ = anInt432 + is[2];
			final int i_107_ = is_102_[0];
			final int i_108_ = is_102_[1];
			final int i_109_ = is_102_[2];
			final int i_110_ = is_97_[0];
			final int i_111_ = is_97_[1];
			final int i_112_ = is_97_[2];
			final int i_113_ = halfHeight + anInt432 + -1;
			int i_114_ = 0;
			int i_115_ = 0;
			int i_116_ = 0;
			int i_117_ = 0;
			int i_118_ = 12345678;
			int i_119_ = -12345678;
			if (i_104_ != i_106_)
			{
				if (i_106_ > i_104_)
				{
					i_118_ = i_104_;
					i_116_ = i_110_ << 8;
					i_114_ = i_107_ << 8;
					i_119_ = i_106_;
				}
				else
				{
					i_118_ = i_106_;
					i_116_ = i_112_ << 8;
					i_119_ = i_104_;
					i_114_ = i_109_ << 8;
				}
				i_117_ = ((-i_110_ + i_112_) << 8) / (-i_104_ + i_106_);
				i_115_ = ((-i_107_ + i_109_) << 8) / (-i_104_ + i_106_);
				if (i_118_ < 0)
				{
					i_116_ -= i_118_ * i_117_;
					i_114_ -= i_118_ * i_115_;
					i_118_ = 0;
				}
				if (i_113_ < i_119_)
				{
					i_119_ = i_113_;
				}
			}
			int i_120_ = 0;
			int i_121_ = 0;
			int i_122_ = 0;
			int i_123_ = 0;
			int i_124_ = 12345678;
			int i_125_ = -12345678;
			if (i_104_ != i_105_)
			{
				if (i_105_ <= i_104_)
				{
					i_120_ = i_108_ << 8;
					i_122_ = i_111_ << 8;
					i_124_ = i_105_;
					i_125_ = i_104_;
				}
				else
				{
					i_120_ = i_107_ << 8;
					i_122_ = i_110_ << 8;
					i_125_ = i_105_;
					i_124_ = i_104_;
				}
				i_121_ = ((i_108_ - i_107_) << 8) / (i_105_ - i_104_);
				i_123_ = ((-i_110_ + i_111_) << 8) / (i_105_ - i_104_);
				if (i_124_ < 0)
				{
					i_122_ -= i_123_ * i_124_;
					i_120_ -= i_124_ * i_121_;
					i_124_ = 0;
				}
				if (i_125_ > i_113_)
				{
					i_125_ = i_113_;
				}
			}
			int i_126_ = 0;
			int i_127_ = 0;
			int i_128_ = 0;
			int i_129_ = 0;
			int i_130_ = 12345678;
			int i_131_ = -12345678;
			if (i_106_ != i_105_)
			{
				i_127_ = ((-i_108_ + i_109_) << 8) / (-i_105_ + i_106_);
				if (i_106_ <= i_105_)
				{
					i_131_ = i_105_;
					i_130_ = i_106_;
					i_128_ = i_112_ << 8;
					i_126_ = i_109_ << 8;
				}
				else
				{
					i_126_ = i_108_ << 8;
					i_130_ = i_105_;
					i_131_ = i_106_;
					i_128_ = i_111_ << 8;
				}
				i_129_ = ((-i_111_ + i_112_) << 8) / (-i_105_ + i_106_);
				if (i_131_ > i_113_)
				{
					i_131_ = i_113_;
				}
				if (i_130_ < 0)
				{
					i_126_ -= i_127_ * i_130_;
					i_128_ -= i_129_ * i_130_;
					i_130_ = 0;
				}
			}
			anInt421 = i_118_;
			if (i_124_ < anInt421)
			{
				anInt421 = i_124_;
			}
			if (anInt421 > i_130_)
			{
				anInt421 = i_130_;
			}
			anInt425 = i_119_;
			if (i_125_ > anInt425)
			{
				anInt425 = i_125_;
			}
			if (anInt425 < i_131_)
			{
				anInt425 = i_131_;
			}
			int i_132_ = 0;
			for (i_96_ = anInt421; i_96_ < anInt425; i_96_++)
			{
				if ((i_96_ < i_118_) || (i_96_ >= i_119_))
				{
					i_100_ = -655360;
					i_103_ = 655360;
				}
				else
				{
					i_98_ = i_132_ = i_116_;
					i_103_ = i_100_ = i_114_;
					i_116_ += i_117_;
					i_114_ += i_115_;
				}
				if ((i_96_ >= i_124_) && (i_96_ < i_125_))
				{
					if (i_120_ < i_103_)
					{
						i_98_ = i_122_;
						i_103_ = i_120_;
					}
					if (i_100_ < i_120_)
					{
						i_132_ = i_122_;
						i_100_ = i_120_;
					}
					i_120_ += i_121_;
					i_122_ += i_123_;
				}
				if ((i_96_ >= i_130_) && (i_131_ > i_96_))
				{
					if (i_103_ > i_126_)
					{
						i_98_ = i_128_;
						i_103_ = i_126_;
					}
					if (i_100_ < i_126_)
					{
						i_100_ = i_126_;
						i_132_ = i_128_;
					}
					i_126_ += i_127_;
					i_128_ += i_129_;
				}
				final Class51 class51 = aClass51Array1[i_96_];
				class51.anInt588 = i_103_;
				class51.anInt585 = i_132_;
				class51.anInt589 = i_100_;
				class51.anInt581 = i_98_;
			}
			if ((anInt432 + -halfHeight) > anInt421)
			{
				anInt421 = anInt432 + -halfHeight;
			}
		}
		else if (i_99_ != 4)
		{
			anInt425 = anInt421 = is[0] += anInt432;
			for (i_96_ = 1; i_96_ < i_99_; i_96_++)
			{
				int i_133_;
				if ((i_133_ = is[i_96_] += anInt432) >= anInt421)
				{
					if (i_133_ > anInt425)
					{
						anInt425 = i_133_;
					}
				}
				else
				{
					anInt421 = i_133_;
				}
			}
			if (anInt425 >= (anInt432 - -halfHeight))
			{
				anInt425 = anInt432 + halfHeight + -1;
			}
			if (anInt421 < (anInt432 + -halfHeight))
			{
				anInt421 = anInt432 - halfHeight;
			}
			if (anInt425 <= anInt421)
			{
				return;
			}
			for (i_96_ = anInt421; i_96_ < anInt425; i_96_++)
			{
				final Class51 class51 = aClass51Array1[i_96_];
				class51.anInt588 = 655360;
				class51.anInt589 = -655360;
			}
			final int i_134_ = i_99_ + -1;
			int i_135_ = is[0];
			int i_136_ = is[i_134_];
			if (i_135_ >= i_136_)
			{
				if (i_135_ > i_136_)
				{
					int i_137_ = is_102_[i_134_] << 8;
					final int i_138_ = (((is_102_[0] + -is_102_[i_134_]) << 8) / (-i_136_ + i_135_));
					int i_139_ = is_97_[i_134_] << 8;
					final int i_140_ = (((-is_97_[i_134_] + is_97_[0]) << 8) / (-i_136_ + i_135_));
					if (i_135_ > anInt425)
					{
						i_135_ = anInt425;
					}
					if (0 > i_136_)
					{
						i_137_ -= i_136_ * i_138_;
						i_139_ -= i_136_ * i_140_;
						i_136_ = 0;
					}
					for (i_96_ = i_136_; i_96_ <= i_135_; i_96_++)
					{
						final Class51 class51 = aClass51Array1[i_96_];
						class51.anInt581 = class51.anInt585 = i_139_;
						class51.anInt588 = class51.anInt589 = i_137_;
						i_139_ += i_140_;
						i_137_ += i_138_;
					}
				}
			}
			else
			{
				int i_141_ = is_102_[0] << 8;
				final int i_142_ = (((is_102_[i_134_] + -is_102_[0]) << 8) / (-i_135_ + i_136_));
				int i_143_ = is_97_[0] << 8;
				final int i_144_ = ((-is_97_[0] + is_97_[i_134_]) << 8) / (i_136_ - i_135_);
				if (0 > i_135_)
				{
					i_141_ -= i_142_ * i_135_;
					i_143_ -= i_144_ * i_135_;
					i_135_ = 0;
				}
				if (i_136_ > anInt425)
				{
					i_136_ = anInt425;
				}
				for (i_96_ = i_135_; i_136_ >= i_96_; i_96_++)
				{
					final Class51 class51 = aClass51Array1[i_96_];
					class51.anInt581 = class51.anInt585 = i_143_;
					class51.anInt588 = class51.anInt589 = i_141_;
					i_143_ += i_144_;
					i_141_ += i_142_;
				}
			}
			for (i_96_ = 0; i_96_ < i_134_; i_96_++)
			{
				final int i_145_ = i_96_ - -1;
				i_135_ = is[i_96_];
				i_136_ = is[i_145_];
				if (i_136_ <= i_135_)
				{
					if (i_135_ > i_136_)
					{
						int i_146_ = is_102_[i_145_] << 8;
						final int i_147_ = (((is_102_[i_96_] + -is_102_[i_145_]) << 8) / (i_135_ - i_136_));
						int i_148_ = is_97_[i_145_] << 8;
						final int i_149_ = (((-is_97_[i_145_] + is_97_[i_96_]) << 8) / (-i_136_ + i_135_));
						if (anInt425 < i_135_)
						{
							i_135_ = anInt425;
						}
						if (0 > i_136_)
						{
							i_146_ -= i_136_ * i_147_;
							i_148_ -= i_149_ * i_136_;
							i_136_ = 0;
						}
						for (int i_150_ = i_136_; i_150_ <= i_135_; i_150_++)
						{
							final Class51 class51 = aClass51Array1[i_150_];
							if (i_146_ > class51.anInt589)
							{
								class51.anInt585 = i_148_;
								class51.anInt589 = i_146_;
							}
							if (class51.anInt588 > i_146_)
							{
								class51.anInt581 = i_148_;
								class51.anInt588 = i_146_;
							}
							i_148_ += i_149_;
							i_146_ += i_147_;
						}
					}
				}
				else
				{
					int i_151_ = is_102_[i_96_] << 8;
					final int i_152_ = (((is_102_[i_145_] - is_102_[i_96_]) << 8) / (-i_135_ + i_136_));
					int i_153_ = is_97_[i_96_] << 8;
					final int i_154_ = (((is_97_[i_145_] - is_97_[i_96_]) << 8) / (-i_135_ + i_136_));
					if (0 > i_135_)
					{
						i_153_ -= i_135_ * i_154_;
						i_151_ -= i_135_ * i_152_;
						i_135_ = 0;
					}
					if (i_136_ > anInt425)
					{
						i_136_ = anInt425;
					}
					for (int i_155_ = i_135_; i_136_ >= i_155_; i_155_++)
					{
						final Class51 class51 = aClass51Array1[i_155_];
						if (class51.anInt588 > i_151_)
						{
							class51.anInt581 = i_153_;
							class51.anInt588 = i_151_;
						}
						if (i_151_ > class51.anInt589)
						{
							class51.anInt585 = i_153_;
							class51.anInt589 = i_151_;
						}
						i_151_ += i_152_;
						i_153_ += i_154_;
					}
				}
			}
			if (anInt421 < (anInt432 + -halfHeight))
			{
				anInt421 = anInt432 + -halfHeight;
			}
		}
		else
		{
			final int i_156_ = is[0] + anInt432;
			final int i_157_ = is[1] + anInt432;
			final int i_158_ = anInt432 + is[2];
			final int i_159_ = anInt432 + is[3];
			final int i_160_ = is_102_[0];
			final int i_161_ = is_102_[1];
			final int i_162_ = is_102_[2];
			final int i_163_ = is_102_[3];
			final int i_164_ = is_97_[0];
			final int i_165_ = is_97_[1];
			final int i_166_ = is_97_[2];
			final int i_167_ = is_97_[3];
			final int i_168_ = halfHeight + anInt432 + -1;
			int i_169_ = 0;
			int i_170_ = 0;
			int i_171_ = 0;
			int i_172_ = 0;
			int i_173_ = 12345678;
			int i_174_ = -12345678;
			if (i_156_ != i_159_)
			{
				i_170_ = ((i_163_ - i_160_) << 8) / (-i_156_ + i_159_);
				i_172_ = ((i_167_ - i_164_) << 8) / (-i_156_ + i_159_);
				if (i_159_ > i_156_)
				{
					i_171_ = i_164_ << 8;
					i_169_ = i_160_ << 8;
					i_174_ = i_159_;
					i_173_ = i_156_;
				}
				else
				{
					i_171_ = i_167_ << 8;
					i_169_ = i_163_ << 8;
					i_173_ = i_159_;
					i_174_ = i_156_;
				}
				if (i_174_ > i_168_)
				{
					i_174_ = i_168_;
				}
				if (0 > i_173_)
				{
					i_169_ -= i_170_ * i_173_;
					i_171_ -= i_172_ * i_173_;
					i_173_ = 0;
				}
			}
			int i_175_ = 0;
			int i_176_ = 0;
			int i_177_ = 0;
			int i_178_ = 0;
			int i_179_ = 12345678;
			int i_180_ = -12345678;
			if (i_157_ != i_156_)
			{
				i_176_ = ((-i_160_ + i_161_) << 8) / (-i_156_ + i_157_);
				if (i_157_ > i_156_)
				{
					i_175_ = i_160_ << 8;
					i_177_ = i_164_ << 8;
					i_180_ = i_157_;
					i_179_ = i_156_;
				}
				else
				{
					i_179_ = i_157_;
					i_175_ = i_161_ << 8;
					i_180_ = i_156_;
					i_177_ = i_165_ << 8;
				}
				i_178_ = ((-i_164_ + i_165_) << 8) / (-i_156_ + i_157_);
				if (i_179_ < 0)
				{
					i_177_ -= i_179_ * i_178_;
					i_175_ -= i_176_ * i_179_;
					i_179_ = 0;
				}
				if (i_168_ < i_180_)
				{
					i_180_ = i_168_;
				}
			}
			int i_181_ = 0;
			int i_182_ = 0;
			int i_183_ = 0;
			int i_184_ = 0;
			int i_185_ = 12345678;
			int i_186_ = -12345678;
			if (i_157_ != i_158_)
			{
				i_182_ = ((-i_161_ + i_162_) << 8) / (-i_157_ + i_158_);
				i_184_ = ((-i_165_ + i_166_) << 8) / (-i_157_ + i_158_);
				if (i_158_ <= i_157_)
				{
					i_185_ = i_158_;
					i_183_ = i_166_ << 8;
					i_186_ = i_157_;
					i_181_ = i_162_ << 8;
				}
				else
				{
					i_181_ = i_161_ << 8;
					i_185_ = i_157_;
					i_183_ = i_165_ << 8;
					i_186_ = i_158_;
				}
				if (i_185_ < 0)
				{
					i_181_ -= i_185_ * i_182_;
					i_183_ -= i_184_ * i_185_;
					i_185_ = 0;
				}
				if (i_168_ < i_186_)
				{
					i_186_ = i_168_;
				}
			}
			int i_187_ = 0;
			int i_188_ = 0;
			int i_189_ = 0;
			int i_190_ = 0;
			int i_191_ = 12345678;
			int i_192_ = -12345678;
			if (i_158_ != i_159_)
			{
				if (i_159_ > i_158_)
				{
					i_191_ = i_158_;
					i_187_ = i_162_ << 8;
					i_192_ = i_159_;
					i_189_ = i_166_ << 8;
				}
				else
				{
					i_189_ = i_167_ << 8;
					i_192_ = i_158_;
					i_191_ = i_159_;
					i_187_ = i_163_ << 8;
				}
				i_190_ = ((-i_166_ + i_167_) << 8) / (-i_158_ + i_159_);
				i_188_ = ((-i_162_ + i_163_) << 8) / (-i_158_ + i_159_);
				if (i_191_ < 0)
				{
					i_187_ -= i_188_ * i_191_;
					i_189_ -= i_191_ * i_190_;
					i_191_ = 0;
				}
				if (i_168_ < i_192_)
				{
					i_192_ = i_168_;
				}
			}
			anInt421 = i_173_;
			if (i_179_ < anInt421)
			{
				anInt421 = i_179_;
			}
			if (i_185_ < anInt421)
			{
				anInt421 = i_185_;
			}
			anInt425 = i_174_;
			if (anInt421 > i_191_)
			{
				anInt421 = i_191_;
			}
			if (i_180_ > anInt425)
			{
				anInt425 = i_180_;
			}
			if (i_186_ > anInt425)
			{
				anInt425 = i_186_;
			}
			if (anInt425 < i_192_)
			{
				anInt425 = i_192_;
			}
			int i_193_ = 0;
			for (i_96_ = anInt421; i_96_ < anInt425; i_96_++)
			{
				if ((i_173_ > i_96_) || (i_96_ >= i_174_))
				{
					i_100_ = -655360;
					i_103_ = 655360;
				}
				else
				{
					i_103_ = i_100_ = i_169_;
					i_98_ = i_193_ = i_171_;
					i_169_ += i_170_;
					i_171_ += i_172_;
				}
				if ((i_179_ <= i_96_) && (i_180_ > i_96_))
				{
					if (i_103_ > i_175_)
					{
						i_98_ = i_177_;
						i_103_ = i_175_;
					}
					if (i_100_ < i_175_)
					{
						i_193_ = i_177_;
						i_100_ = i_175_;
					}
					i_175_ += i_176_;
					i_177_ += i_178_;
				}
				if ((i_96_ >= i_185_) && (i_96_ < i_186_))
				{
					if (i_103_ > i_181_)
					{
						i_103_ = i_181_;
						i_98_ = i_183_;
					}
					if (i_181_ > i_100_)
					{
						i_100_ = i_181_;
						i_193_ = i_183_;
					}
					i_181_ += i_182_;
					i_183_ += i_184_;
				}
				if ((i_96_ >= i_191_) && (i_192_ > i_96_))
				{
					if (i_187_ < i_103_)
					{
						i_98_ = i_189_;
						i_103_ = i_187_;
					}
					if (i_187_ > i_100_)
					{
						i_193_ = i_189_;
						i_100_ = i_187_;
					}
					i_189_ += i_190_;
					i_187_ += i_188_;
				}
				final Class51 class51 = aClass51Array1[i_96_];
				class51.anInt588 = i_103_;
				class51.anInt589 = i_100_;
				class51.anInt585 = i_193_;
				class51.anInt581 = i_98_;
			}
			if (anInt421 < (anInt432 + -halfHeight))
			{
				anInt421 = anInt432 + -halfHeight;
			}
		}
		if (aBool25 && (anInt441 < anInt462) && (anInt421 <= anInt433) && (anInt433 < anInt425))
		{
			final Class51 class51 = aClass51Array1[anInt433];
			if ((anInt474 >= (class51.anInt588 >> 8)) && (anInt474 <= (class51.anInt589 >> 8))
			        && (class51.anInt589 >= class51.anInt588) && !class23.aBool13
			        && (class23.aByteArray12[i_101_] == 0))
			{
				aClass23Array2[anInt441] = class23;
				anIntArray99[anInt441] = i_101_;
				anInt441++;
			}
		}
	}

	void method261(final int i, final int i_194_, final int i_195_, final int i_196_, int i_198_)
	{
		if ((i_198_ == 0) && (i == 0) && (i_194_ == 0))
		{
			i_198_ = 32;
		}
		for (int i_199_ = 0; modelCount > i_199_; i_199_++)
		{
			modelArray[i_199_].method138(i_194_, i, i_195_, i_198_, 12345678, i_196_);
		}
	}

	private void method262(final int i, final CameraModel[] class26s, final int i_200_, final int i_201_)
	{
		if (i_201_ < i_200_)
		{
			int i_202_ = i_201_ + -1;
			int i_203_ = i_200_ + 1;
			final int i_204_ = (i_200_ + i_201_) / 2;
			final CameraModel class26 = class26s[i_204_];
			class26s[i_204_] = class26s[i_201_];
			class26s[i_201_] = class26;
			final int i_205_ = class26.anInt314;
			while (i_202_ < i_203_)
			{
				do
				{
					i_203_--;
				}
				while (i_205_ > class26s[i_203_].anInt314);
				do
				{
					i_202_++;
				}
				while (i_205_ < class26s[i_202_].anInt314);
				if (i_203_ > i_202_)
				{
					final CameraModel class26_206_ = class26s[i_202_];
					class26s[i_202_] = class26s[i_203_];
					class26s[i_203_] = class26_206_;
				}
			}
			method262(2, class26s, i_203_, i_201_);
			method262(i ^ 0x0, class26s, i_200_, i_203_ - -1);
		}
		if (i != 2)
		{
			anIntArray99 = null;
		}
	}

	int method263(final int i, int i_207_)
	{
		if (i_207_ == 12345678)
		{
			return 0;
		}
		method289(i_207_, i ^ 0x5c);
		if (0 <= i_207_)
		{
			return anIntArrayArray16[i_207_][0];
		}
		if (i_207_ < i)
		{
			i_207_ = -(i_207_ + 1);
			final int i_208_ = (0x7f32 & i_207_) >> 10;
			final int i_209_ = (i_207_ >> 5) & 0x1f;
			final int i_210_ = 0x1f & i_207_;
			return ((i_210_ << 3) + (i_208_ << 19)) - -(i_209_ << 11);
		}
		return 0;
	}

	private boolean method264(final int i, final int i_212_, final boolean bool, final int i_213_,
	        final int i_214_)
	{
		if ((bool && (i <= i_214_)) || (i_214_ > i))
		{
			if (i > i_213_)
			{
				return true;
			}
			if (i_214_ < i_212_)
			{
				return true;
			}
			if (i_213_ < i_212_)
			{
				return true;
			}
			return !bool;
		}
		if (i_213_ > i)
		{
			return true;
		}
		if (i_212_ < i_214_)
		{
			return true;
		}
		if (i_213_ > i_212_)
		{
			return true;
		}
		return bool;
	}

	int method265(final int i, final int i_216_, final int i_217_, final int i_218_, final int i_219_, final int i_220_,
	        final int i_222_)
	{
		anIntArray101[anInt478] = i_222_;
		anIntArray96[anInt478] = i_216_;
		anIntArray98[anInt478] = i_218_;
		anIntArray108[anInt478] = i_217_;
		anIntArray102[anInt478] = i;
		anIntArray105[anInt478] = i_219_;
		anIntArray107[anInt478] = 0;
		final int i_223_ = this.aClass23_3.method158(i_216_, i_218_, i_217_);
		final int i_224_ = this.aClass23_3.method158(i_216_, i_218_ + -i_219_, i_217_);
		final int[] is = { i_223_, i_224_ };
		this.aClass23_3.method144(is, 0, 0, -1062, 2);
		this.aClass23_3.anIntArray60[anInt478] = i_220_;
		this.aClass23_3.aByteArray12[anInt478++] = (byte) 0;
		return anInt478 - 1;
	}

	int[] method266()
	{
		return anIntArray99;
	}

	void method267(final Model model)
	{
		if (model == null)
		{
			System.out.println("Warning tried to add null object!");
		}
		if (modelCount < maxModelCount)
		{
			modelIntArray[modelCount] = 0;
			modelArray[modelCount++] = model;
		}
	}

	void cleanupModels()
	{
		method273(1);
		for (int index = 0; index < modelCount; index++)
		{
			modelArray[index] = null;
		}
		modelCount = 0;
	}

	void method269(final int i, final int i_227_, int i_228_, int i_229_, final int i_230_, final int i_231_,
	        int i_233_)
	{
		i_229_ &= 0x3ff;
		i_228_ &= 0x3ff;
		i_233_ &= 0x3ff;
		anInt480 = 0x3ff & (-i_233_ + 1024);
		anInt417 = 0x3ff & (-i_228_ + 1024);
		anInt448 = 0x3ff & (-i_229_ + 1024);
		int i_234_ = 0;
		int i_235_ = 0;
		int i_236_ = i_231_;
		if (i_229_ != 0)
		{
			final int i_237_ = GameWindow.anIntArray151[i_229_];
			final int i_238_ = GameWindow.anIntArray151[i_229_ + 1024];
			final int i_239_ = ((i_235_ * i_238_) - (i_236_ * i_237_)) >> 15;
			i_236_ = ((i_238_ * i_236_) + (i_237_ * i_235_)) >> 15;
			i_235_ = i_239_;
		}
		if (i_228_ != 0)
		{
			final int i_240_ = GameWindow.anIntArray151[i_228_ - -1024];
			final int i_241_ = GameWindow.anIntArray151[i_228_];
			final int i_242_ = ((i_234_ * i_240_) + (i_241_ * i_236_)) >> 15;
			i_236_ = ((i_240_ * i_236_) + -(i_234_ * i_241_)) >> 15;
			i_234_ = i_242_;
		}
		if (i_233_ != 0)
		{
			final int i_243_ = GameWindow.anIntArray151[i_233_];
			final int i_244_ = GameWindow.anIntArray151[i_233_ + 1024];
			final int i_245_ = ((i_235_ * i_243_) + (i_234_ * i_244_)) >> 15;
			i_235_ = ((i_244_ * i_235_) + -(i_243_ * i_234_)) >> 15;
			i_234_ = i_245_;
		}
		anInt436 = -i_235_ + i;
		anInt427 = i_230_ + -i_236_;
		anInt440 = -i_234_ + i_227_;
	}

	void method270(final int i, final int i_246_)
	{
		if (anIntArrayArray16[i_246_] != null)
		{
			final int[] is = anIntArrayArray16[i_246_];
			for (int i_247_ = 0; i_247_ < 64; i_247_++)
			{
				int i_248_ = i_247_ + 4032;
				final int i_249_ = is[i_248_];
				for (int i_250_ = 0; i_250_ < 63; i_250_++)
				{
					is[i_248_] = is[i_248_ + -64];
					i_248_ -= 64;
				}
				anIntArrayArray16[i_246_][i_248_] = i_249_;
			}
			if (i != 1041214728)
			{
				method290();
			}
			final int i_251_ = 4096;
			for (int i_252_ = 0; i_251_ > i_252_; i_252_++)
			{
				final int i_253_ = is[i_252_];
				is[i_252_ + i_251_] = Class52.method378(i_253_ - (i_253_ >>> 3), 16316671);
				is[(i_251_ * 2) + i_252_] = Class52.method378(i_253_ + -(i_253_ >>> 2), 16316671);
				is[(i_251_ * 3) - -i_252_] = Class52.method378(16316671, i_253_ + -(i_253_ >>> 3) + -(i_253_ >>> 2));
			}
		}
	}

	void method271(final int i, final int i_254_, final boolean bool, final int[] is, final byte[] is_255_)
	{
		aByteArrayArray12[i] = is_255_;
		anIntArrayArray17[i] = is;
		anIntArray92[i] = i_254_;
		aLongArray2[i] = 0L;
		aBoolArray8[i] = bool;
		anIntArrayArray16[i] = null;
		method289(i, 116);
	}

	private void method272(final int i, final int i_256_)
	{
		final CameraModel class26 = cameraModels[i_256_];
		final Model class23 = class26.aClass23_2;
		final int i_257_ = class26.anInt308;
		final int[] is = class23.anIntArrayArray10[i_257_];
		final int i_258_ = 0;
		final int i_259_ = 0;
		final int i_260_ = 1;
		final int i_261_ = class23.anIntArray51[is[0]];
		final int i_262_ = class23.anIntArray66[is[i]];
		final int i_263_ = class23.anIntArray74[is[0]];
		class23.anIntArray69[i_257_] = 1;
		class23.anIntArray71[i_257_] = 0;
		class26.anInt316 = i_258_;
		class26.anInt318 = (i_261_ * i_258_) - (-(i_259_ * i_262_) - (i_263_ * i_260_));
		class26.anInt319 = i_260_;
		class26.anInt307 = i_259_;
		int i_264_ = class23.anIntArray74[is[0]];
		int i_265_ = i_264_;
		int i_266_ = class23.anIntArray65[is[0]];
		int i_267_ = i_266_;
		if (i_266_ > class23.anIntArray65[is[1]])
		{
			i_266_ = class23.anIntArray65[is[1]];
		}
		else
		{
			i_267_ = class23.anIntArray65[is[1]];
		}
		int i_268_ = class23.anIntArray63[is[1]];
		int i_269_ = class23.anIntArray63[is[0]];
		int i_270_ = class23.anIntArray74[is[1]];
		if (i_265_ >= i_270_)
		{
			if (i_264_ > i_270_)
			{
				i_264_ = i_270_;
			}
		}
		else
		{
			i_265_ = i_270_;
		}
		i_270_ = class23.anIntArray65[is[1]];
		if (i_270_ <= i_267_)
		{
			if (i_266_ > i_270_)
			{
				i_266_ = i_270_;
			}
		}
		else
		{
			i_267_ = i_270_;
		}
		i_270_ = class23.anIntArray63[is[1]];
		if (i_269_ >= i_270_)
		{
			if (i_270_ < i_268_)
			{
				i_268_ = i_270_;
			}
		}
		else
		{
			i_269_ = i_270_;
		}
		class26.anInt315 = i_267_ - -20;
		class26.anInt317 = i_265_;
		class26.anInt305 = i_264_;
		class26.anInt306 = i_266_ + -20;
		class26.anInt304 = i_269_;
		class26.anInt309 = i_268_;
	}

	private void method273(final int i)
	{
		anInt478 = 0;
		this.aClass23_3.method150(i);
	}

	void method274(final int i, int i_271_, final int i_272_)
	{
		if ((i_271_ == 0) && (i == 0) && (i_272_ == 0))
		{
			i_271_ = 32;
		}
		for (int i_274_ = 0; i_274_ < modelCount; i_274_++)
		{
			modelArray[i_274_].method139(i_272_, i, i_271_);
		}
	}

	private int method275(final int i, final int i_275_, final int i_276_, final int i_277_, final int i_278_,
	        final int i_279_)
	{
		if (i != -10643)
		{
			return -33;
		}
		if (i_278_ == i_279_)
		{
			return i_277_;
		}
		return (i_277_ + (((-i_277_ + i_276_) * (i_275_ - i_278_)) / (i_279_ - i_278_)));
	}

	private void method276(final int i_280_)
	{
		int i_281_;
		if (anIntArray92[i_280_] != 0)
		{
			i_281_ = 128;
		}
		else
		{
			i_281_ = 64;
		}
		final int[] is = anIntArrayArray16[i_280_];
		int i_282_ = 0;
		for (int i_284_ = 0; i_281_ > i_284_; i_284_++)
		{
			for (int i_285_ = 0; i_285_ < i_281_; i_285_++)
			{
				int i_286_ = (anIntArrayArray17[i_280_][(aByteArrayArray12[i_280_][i_285_ + (i_281_ * i_284_)]
				        & 0xff)]);
				i_286_ &= 0xf8f8ff;
				if (i_286_ != 0)
				{
					if (i_286_ == 16253183)
					{
						aBoolArray8[i_280_] = true;
						i_286_ = 0;
					}
				}
				else
				{
					i_286_ = 1;
				}
				is[i_282_++] = i_286_;
			}
		}
		for (int i_287_ = 0; i_287_ < i_282_; i_287_++)
		{
			final int i_288_ = is[i_287_];
			is[i_287_ + i_282_] = Class52.method378(16316671, i_288_ - (i_288_ >>> 3));
			is[i_287_ + (i_282_ * 2)] = Class52.method378(16316671, i_288_ + -(i_288_ >>> 2));
			is[i_287_ + (i_282_ * 3)] = Class52.method378(i_288_ + -(i_288_ >>> 3) + -(i_288_ >>> 2), 16316671);
		}
	}

	void method277(final int i)
	{
		this.aClass23_3.aByteArray12[i] = (byte) 1;
	}

	void method278(final int i, final int i_290_, final int i_291_, final int i_292_, final int i_293_,
	        final int i_294_, final int i_295_)
	{
		halfHeight = i_291_;
		anInt432 = i_292_;
		if (i_290_ != 256)
		{
			anInt435 = 116;
		}
		halfWidth = i;
		aClass51Array1 = new Class51[i_291_ - -i_292_];
		anInt482 = i_293_;
		anInt428 = i_294_;
		anInt434 = i_295_;
		for (int i_296_ = 0; (i_291_ + i_292_) > i_296_; i_296_++)
		{
			aClass51Array1[i_296_] = new Class51();
		}
	}

	private boolean method279(int i_297_, final CameraModel[] class26s, int i_298_)
	{
		for (;;)
		{
			final CameraModel class26 = class26s[i_297_];
			for (int i_299_ = i_297_ + 1; i_298_ >= i_299_; i_299_++)
			{
				final CameraModel class26_300_ = class26s[i_299_];
				if (!method296((byte) -63, class26_300_, class26))
				{
					break;
				}
				class26s[i_297_] = class26_300_;
				class26s[i_299_] = class26;
				i_297_ = i_299_;
				if (i_297_ == i_298_)
				{
					anInt435 = i_297_ + -1;
					anInt469 = i_297_;
					return true;
				}
			}
			final CameraModel class26_301_ = class26s[i_298_];
			for (int i_302_ = i_298_ + -1; i_297_ <= i_302_; i_302_--)
			{
				final CameraModel class26_303_ = class26s[i_302_];
				if (!method296((byte) -63, class26_301_, class26_303_))
				{
					break;
				}
				class26s[i_298_] = class26_303_;
				i_298_ = i_302_;
				class26s[i_302_] = class26_301_;
				if (i_297_ == i_298_)
				{
					anInt469 = i_298_ + 1;
					anInt435 = i_298_;
					return true;
				}
			}
			if (i_298_ <= (i_297_ + 1))
			{
				anInt469 = i_297_;
				anInt435 = i_298_;
				return false;
			}
			if (!method279(i_297_ + 1, class26s, i_298_))
			{
				anInt469 = i_297_;
				return false;
			}
			i_298_ = anInt435;
		}
	}

	private boolean method280(final CameraModel class26, final int i, final CameraModel class26_304_)
	{
		final Model class23 = class26.aClass23_2;
		final Model class23_305_ = class26_304_.aClass23_2;
		final int i_306_ = class26.anInt308;
		final int i_307_ = class26_304_.anInt308;
		final int[] is = class23.anIntArrayArray10[i_306_];
		final int[] is_308_ = class23_305_.anIntArrayArray10[i_307_];
		final int i_309_ = class23.anIntArray64[i_306_];
		final int i_310_ = class23_305_.anIntArray64[i_307_];
		int i_311_ = class23_305_.anIntArray51[is_308_[0]];
		int i_312_ = class23_305_.anIntArray66[is_308_[0]];
		int i_313_ = class23_305_.anIntArray74[is_308_[0]];
		int i_314_ = class26_304_.anInt316;
		int i_315_ = class26_304_.anInt307;
		int i_316_ = class26_304_.anInt319;
		int i_317_ = class23_305_.anIntArray69[i_307_];
		boolean bool = false;
		int i_318_ = class26_304_.anInt318;
		for (int i_319_ = 0; i_319_ < i_309_; i_319_++)
		{
			final int i_320_ = is[i_319_];
			final int i_321_ = ((i_314_ * (i_311_ + -class23.anIntArray51[i_320_]))
			        + ((i_312_ + -class23.anIntArray66[i_320_]) * i_315_)
			        + ((i_313_ + -class23.anIntArray74[i_320_]) * i_316_));
			if (((-i_317_ > i_321_) && (i_318_ < 0)) || ((i_317_ < i_321_) && (0 < i_318_)))
			{
				bool = true;
				break;
			}
		}
		if (bool == false)
		{
			return true;
		}
		i_315_ = class26.anInt307;
		i_313_ = class23.anIntArray74[is[0]];
		i_318_ = class26.anInt318;
		i_317_ = class23.anIntArray69[i_306_];
		i_312_ = class23.anIntArray66[is[0]];
		i_316_ = class26.anInt319;
		i_311_ = class23.anIntArray51[is[0]];
		int i_322_ = 0;
		i_314_ = class26.anInt316;
		for (int i_323_ = 0; i_310_ > i_323_; i_323_++)
		{
			final int i_324_ = is_308_[i_323_];
			final int i_325_ = ((((i_312_ + -class23_305_.anIntArray66[i_324_]) * i_315_)
			        + ((i_311_ + -class23_305_.anIntArray51[i_324_]) * i_314_))
			        - -((i_313_ + -class23_305_.anIntArray74[i_324_]) * i_316_));
			if (((i_325_ < -i_317_) && (0 < i_318_)) || ((i_325_ > i_317_) && (i_318_ < 0)))
			{
				i_322_ = 1;
				break;
			}
		}
		if ((i_322_ ^ 0xffffffff) == i)
		{
			return true;
		}
		return false;
	}

	void method281(final int index, final int value)
	{
		anIntArray107[index] = value;
	}

	int method282(final int i)
	{
		if (i != -1)
		{
			this.anInt465 = -90;
		}
		return anInt441;
	}

	void method283(final int i)
	{
		anInt478 -= i;
		this.aClass23_3.method149(i * 2, i);
		if (0 > anInt478)
		{
			anInt478 = 0;
		}
	}

	private boolean method284(final boolean bool, final int i, final int i_329_, final int i_330_, final int i_331_)
	{
		if (i_331_ != 1024)
		{
			anInt482 = 103;
		}
		if ((bool && (i <= i_330_)) || (i_330_ > i))
		{
			if (i_329_ > i_330_)
			{
				return true;
			}
			return !bool;
		}
		if (i_330_ > i_329_)
		{
			return true;
		}
		return bool;
	}

	private boolean method285(final int[] is, final int[] is_332_, final int i, final int[] is_333_,
	        final int[] is_334_)
	{
		final int i_335_ = is.length;
		final int i_336_ = is_334_.length;
		int i_337_ = 0;
		int i_339_;
		int i_338_ = i_339_ = is_332_[0];
		int i_340_ = 0;
		int i_342_;
		int i_341_ = i_342_ = is_333_[0];
		for (int i_343_ = 1; i_343_ < i_335_; i_343_++)
		{
			if (is_332_[i_343_] >= i_339_)
			{
				if (i_338_ < is_332_[i_343_])
				{
					i_338_ = is_332_[i_343_];
				}
			}
			else
			{
				i_339_ = is_332_[i_343_];
				i_340_ = i_343_;
			}
		}
		int i_344_ = 0;
		for (int i_345_ = 1; i_345_ < i_336_; i_345_++)
		{
			if (i_342_ <= is_333_[i_345_])
			{
				if (is_333_[i_345_] > i_341_)
				{
					i_341_ = is_333_[i_345_];
				}
			}
			else
			{
				i_342_ = is_333_[i_345_];
				i_344_ = i_345_;
			}
		}
		if (i_338_ <= i_342_)
		{
			return false;
		}
		if (i_341_ <= i_339_)
		{
			return false;
		}
		int i_346_;
		boolean bool;
		int i_347_;
		if (is_333_[i_344_] > is_332_[i_340_])
		{
			i_347_ = i_340_;
			for (/**/; is_332_[i_340_] < is_333_[i_344_]; i_340_ = (i_335_ + i_340_ + -1) % i_335_)
			{
				/* empty */
			}
			for (/**/; is_332_[i_347_] < is_333_[i_344_]; i_347_ = (i_347_ - -1) % i_335_)
			{
				/* empty */
			}
			final int i_348_ = method275(-10643, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
			        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
			final int i_349_ = method275(i ^ 0x797e, is_333_[i_344_], is[i_347_], is[(i_335_ + i_347_ + -1) % i_335_],
			        is_332_[(i_347_ + (-1 - -i_335_)) % i_335_], is_332_[i_347_]);
			final int i_350_ = is_334_[i_344_];
			bool = (i_350_ > i_349_) | (i_350_ > i_348_);
			if (method284(bool, i_348_, i_349_, i_350_, i ^ ~0x54ec))
			{
				return true;
			}
			i_346_ = (i_344_ + 1) % i_336_;
			if (i_340_ == i_347_)
			{
				i_337_ = 1;
			}
			i_344_ = (i_344_ - (1 - i_336_)) % i_336_;
		}
		else
		{
			i_346_ = i_344_;
			for (/**/; is_332_[i_340_] > is_333_[i_344_]; i_344_ = (i_336_ + i_344_ + -1) % i_336_)
			{
				/* empty */
			}
			for (/**/; is_332_[i_340_] > is_333_[i_346_]; i_346_ = (i_346_ - -1) % i_336_)
			{
				/* empty */
			}
			final int i_351_ = is[i_340_];
			final int i_352_ = method275(-10643, is_332_[i_340_], is_334_[i_344_], is_334_[(i_344_ + 1) % i_336_],
			        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
			final int i_353_ = method275(-10643, is_332_[i_340_], is_334_[i_346_],
			        is_334_[(i_346_ - (-i_336_ + 1)) % i_336_], is_333_[((i_346_ - -i_336_) + -1) % i_336_],
			        is_333_[i_346_]);
			bool = (i_352_ > i_351_) | (i_351_ < i_353_);
			if (method284(!bool, i_352_, i_353_, i_351_, 1024))
			{
				return true;
			}
			i_347_ = (i_340_ + 1) % i_335_;
			i_340_ = ((i_340_ + -1) - -i_335_) % i_335_;
			if (i_346_ == i_344_)
			{
				i_337_ = 2;
			}
		}
		while (i_337_ == 0)
		{
			if (is_332_[i_340_] < is_332_[i_347_])
			{
				if (is_333_[i_344_] > is_332_[i_340_])
				{
					if (is_332_[i_340_] < is_333_[i_346_])
					{
						final int i_354_ = is[i_340_];
						final int i_355_ = method275(-10643, is_332_[i_340_], is[i_347_],
						        is[(i_347_ - 1 - -i_335_) % i_335_], (is_332_[(i_335_ + i_347_ + -1) % i_335_]),
						        is_332_[i_347_]);
						final int i_356_ = method275(i + 10074, is_332_[i_340_], is_334_[i_344_],
						        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
						final int i_357_ = method275(i + 10074, is_332_[i_340_], is_334_[i_346_],
						        is_334_[(((i_346_ + -1) - -i_336_) % i_336_)],
						        is_333_[((i_346_ + i_336_ + -1) % i_336_)], is_333_[i_346_]);
						if (method264(i_354_, i_355_, bool, i_357_, i_356_))
						{
							return true;
						}
						i_340_ = (i_340_ + i_335_ + -1) % i_335_;
						if (i_340_ == i_347_)
						{
							i_337_ = 1;
						}
					}
					else
					{
						final int i_358_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ - -1) % i_335_],
						        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
						final int i_359_ = method275(-10643, is_333_[i_346_], is[i_347_],
						        is[((i_347_ - -i_335_) + -1) % i_335_], (is_332_[((i_347_ + -1) - -i_335_) % i_335_]),
						        is_332_[i_347_]);
						final int i_360_ = method275(-10643, is_333_[i_346_], is_334_[i_344_],
						        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ - -1) % i_336_], is_333_[i_344_]);
						final int i_361_ = is_334_[i_346_];
						if (method264(i_358_, i_359_, bool, i_361_, i_360_))
						{
							return true;
						}
						i_346_ = (i_346_ - -1) % i_336_;
						if (i_344_ == i_346_)
						{
							i_337_ = 2;
						}
					}
				}
				else if (is_333_[i_344_] < is_333_[i_346_])
				{
					final int i_362_ = method275(-10643, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
					final int i_363_ = method275(i + 10074, is_333_[i_344_], is[i_347_],
					        is[(i_335_ + i_347_ + -1) % i_335_], is_332_[(i_335_ + i_347_ + -1) % i_335_],
					        is_332_[i_347_]);
					final int i_364_ = is_334_[i_344_];
					final int i_365_ = method275(-10643, is_333_[i_344_], is_334_[i_346_],
					        is_334_[(i_346_ - 1 - -i_336_) % i_336_], is_333_[(i_336_ + (i_346_ - 1)) % i_336_],
					        is_333_[i_346_]);
					if (method264(i_362_, i_363_, bool, i_365_, i_364_))
					{
						return true;
					}
					i_344_ = (i_344_ - (-i_336_ + 1)) % i_336_;
					if (i_346_ == i_344_)
					{
						i_337_ = 2;
					}
				}
				else
				{
					final int i_366_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
					final int i_367_ = method275(i + 10074, is_333_[i_346_], is[i_347_],
					        is[(i_335_ + (i_347_ - 1)) % i_335_], is_332_[(i_347_ - 1 - -i_335_) % i_335_],
					        is_332_[i_347_]);
					final int i_368_ = method275(i ^ 0x797e, is_333_[i_346_], is_334_[i_344_],
					        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
					final int i_369_ = is_334_[i_346_];
					if (method264(i_366_, i_367_, bool, i_369_, i_368_))
					{
						return true;
					}
					i_346_ = (i_346_ + 1) % i_336_;
					if (i_346_ == i_344_)
					{
						i_337_ = 2;
					}
				}
			}
			else if (is_333_[i_344_] <= is_332_[i_347_])
			{
				if (is_333_[i_344_] >= is_333_[i_346_])
				{
					final int i_370_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
					final int i_371_ = method275(-10643, is_333_[i_346_], is[i_347_],
					        is[((i_347_ + -1) - -i_335_) % i_335_], is_332_[(i_347_ + i_335_ + -1) % i_335_],
					        is_332_[i_347_]);
					final int i_372_ = method275(-10643, is_333_[i_346_], is_334_[i_344_],
					        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
					final int i_373_ = is_334_[i_346_];
					if (method264(i_370_, i_371_, bool, i_373_, i_372_))
					{
						return true;
					}
					i_346_ = (i_346_ + 1) % i_336_;
					if (i_344_ == i_346_)
					{
						i_337_ = 2;
					}
				}
				else
				{
					final int i_374_ = method275(-10643, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
					final int i_375_ = method275(-10643, is_333_[i_344_], is[i_347_],
					        is[(i_347_ + i_335_ + -1) % i_335_], is_332_[(i_347_ + i_335_ + -1) % i_335_],
					        is_332_[i_347_]);
					final int i_376_ = is_334_[i_344_];
					final int i_377_ = method275(-10643, is_333_[i_344_], is_334_[i_346_],
					        is_334_[((i_346_ - -i_336_) + -1) % i_336_], is_333_[(i_336_ + i_346_ + -1) % i_336_],
					        is_333_[i_346_]);
					if (method264(i_374_, i_375_, bool, i_377_, i_376_))
					{
						return true;
					}
					i_344_ = (i_344_ - 1 - -i_336_) % i_336_;
					if (i_344_ == i_346_)
					{
						i_337_ = 2;
					}
				}
			}
			else if (is_332_[i_347_] >= is_333_[i_346_])
			{
				final int i_378_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ - -1) % i_335_],
				        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
				final int i_379_ = method275(-10643, is_333_[i_346_], is[i_347_],
				        is[((i_347_ - -i_335_) + -1) % i_335_], is_332_[(i_335_ + (i_347_ - 1)) % i_335_],
				        is_332_[i_347_]);
				final int i_380_ = method275(-10643, is_333_[i_346_], is_334_[i_344_], is_334_[(i_344_ + 1) % i_336_],
				        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
				final int i_381_ = is_334_[i_346_];
				if (method264(i_378_, i_379_, bool, i_381_, i_380_))
				{
					return true;
				}
				i_346_ = (i_346_ + 1) % i_336_;
				if (i_346_ == i_344_)
				{
					i_337_ = 2;
				}
			}
			else
			{
				final int i_382_ = method275(i ^ 0x797e, is_332_[i_347_], is[i_340_], is[(i_340_ - -1) % i_335_],
				        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
				final int i_383_ = is[i_347_];
				final int i_384_ = method275(-10643, is_332_[i_347_], is_334_[i_344_], is_334_[(i_344_ - -1) % i_336_],
				        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
				final int i_385_ = method275(i + 10074, is_332_[i_347_], is_334_[i_346_],
				        is_334_[(i_346_ - (1 - i_336_)) % i_336_], is_333_[(i_346_ + i_336_ + -1) % i_336_],
				        is_333_[i_346_]);
				if (method264(i_382_, i_383_, bool, i_385_, i_384_))
				{
					return true;
				}
				i_347_ = (i_347_ - -1) % i_335_;
				if (i_340_ == i_347_)
				{
					i_337_ = 1;
				}
			}
		}
		if (i != -20717)
		{
			method282(45);
		}
		while_11_: do
		{
			for (;;)
			{
				if (i_337_ != 1)
				{
					break while_11_;
				}
				if (is_332_[i_340_] >= is_333_[i_344_])
				{
					if (is_333_[i_346_] <= is_333_[i_344_])
					{
						final int i_386_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ - -1) % i_335_],
						        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
						final int i_387_ = method275(i + 10074, is_333_[i_346_], is[i_347_],
						        is[(i_335_ + (i_347_ - 1)) % i_335_], (is_332_[(i_347_ + i_335_ + -1) % i_335_]),
						        is_332_[i_347_]);
						final int i_388_ = method275(-10643, is_333_[i_346_], is_334_[i_344_],
						        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
						final int i_389_ = is_334_[i_346_];
						if (method264(i_386_, i_387_, bool, i_389_, i_388_))
						{
							return true;
						}
						i_346_ = (i_346_ + 1) % i_336_;
						if (i_346_ == i_344_)
						{
							i_337_ = 0;
						}
					}
					else
					{
						final int i_390_ = method275(i ^ 0x797e, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
						        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
						final int i_391_ = method275(-10643, is_333_[i_344_], is[i_347_],
						        is[((i_347_ - -i_335_) + -1) % i_335_], (is_332_[(i_335_ + (i_347_ - 1)) % i_335_]),
						        is_332_[i_347_]);
						final int i_392_ = is_334_[i_344_];
						final int i_393_ = method275(-10643, is_333_[i_344_], is_334_[i_346_],
						        is_334_[(((i_346_ - -i_336_) + -1) % i_336_)],
						        is_333_[((i_336_ + (i_346_ - 1)) % i_336_)], is_333_[i_346_]);
						if (method264(i_390_, i_391_, bool, i_393_, i_392_))
						{
							return true;
						}
						i_344_ = (i_336_ + i_344_ + -1) % i_336_;
						if (i_344_ == i_346_)
						{
							i_337_ = 0;
						}
					}
				}
				else
				{
					if (is_332_[i_340_] < is_333_[i_346_])
					{
						break;
					}
					final int i_394_ = method275(-10643, is_333_[i_346_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
					final int i_395_ = method275(i ^ 0x797e, is_333_[i_346_], is[i_347_],
					        is[(i_347_ - (-i_335_ + 1)) % i_335_], (is_332_[(i_347_ + (-1 - -i_335_)) % i_335_]),
					        is_332_[i_347_]);
					final int i_396_ = method275(-10643, is_333_[i_346_], is_334_[i_344_],
					        is_334_[(i_344_ + 1) % i_336_], is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
					final int i_397_ = is_334_[i_346_];
					if (method264(i_394_, i_395_, bool, i_397_, i_396_))
					{
						return true;
					}
					i_346_ = (i_346_ - -1) % i_336_;
					if (i_346_ == i_344_)
					{
						i_337_ = 0;
					}
				}
			}
			final int i_398_ = is[i_340_];
			final int i_399_ = method275(-10643, is_332_[i_340_], is_334_[i_344_], is_334_[(i_344_ - -1) % i_336_],
			        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
			final int i_400_ = method275(-10643, is_332_[i_340_], is_334_[i_346_],
			        is_334_[(i_336_ + i_346_ + -1) % i_336_], is_333_[(i_346_ + i_336_ + -1) % i_336_],
			        is_333_[i_346_]);
			if (method284(!bool, i_399_, i_400_, i_398_, 1024))
			{
				return true;
			}
			return false;
		}
		while (false);
		while (i_337_ == 2)
		{
			if (is_333_[i_344_] < is_332_[i_340_])
			{
				if (is_333_[i_344_] < is_332_[i_347_])
				{
					final int i_401_ = method275(-10643, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
					        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
					final int i_402_ = method275(-10643, is_333_[i_344_], is[i_347_],
					        is[(i_335_ + i_347_ + -1) % i_335_], is_332_[(i_347_ + i_335_ + -1) % i_335_],
					        is_332_[i_347_]);
					final int i_403_ = is_334_[i_344_];
					if (method284(bool, i_401_, i_402_, i_403_, 1024))
					{
						return true;
					}
					return false;
				}
				final int i_404_ = method275(-10643, is_332_[i_347_], is[i_340_], is[(i_340_ - -1) % i_335_],
				        is_332_[(i_340_ - -1) % i_335_], is_332_[i_340_]);
				final int i_405_ = is[i_347_];
				final int i_406_ = method275(-10643, is_332_[i_347_], is_334_[i_344_], is_334_[(i_344_ + 1) % i_336_],
				        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
				final int i_407_ = method275(i + 10074, is_332_[i_347_], is_334_[i_346_],
				        is_334_[(i_336_ + (i_346_ - 1)) % i_336_], is_333_[(i_346_ - (-i_336_ + 1)) % i_336_],
				        is_333_[i_346_]);
				if (method264(i_404_, i_405_, bool, i_407_, i_406_))
				{
					return true;
				}
				i_347_ = (i_347_ - -1) % i_335_;
				if (i_347_ == i_340_)
				{
					i_337_ = 0;
				}
			}
			else if (is_332_[i_347_] <= is_332_[i_340_])
			{
				final int i_408_ = method275(-10643, is_332_[i_347_], is[i_340_], is[(i_340_ - -1) % i_335_],
				        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
				final int i_409_ = is[i_347_];
				final int i_410_ = method275(i ^ 0x797e, is_332_[i_347_], is_334_[i_344_],
				        is_334_[(i_344_ - -1) % i_336_], is_333_[(i_344_ - -1) % i_336_], is_333_[i_344_]);
				final int i_411_ = method275(-10643, is_332_[i_347_], is_334_[i_346_],
				        is_334_[(i_336_ + (i_346_ - 1)) % i_336_], is_333_[((i_346_ - -i_336_) + -1) % i_336_],
				        is_333_[i_346_]);
				if (method264(i_408_, i_409_, bool, i_411_, i_410_))
				{
					return true;
				}
				i_347_ = (i_347_ + 1) % i_335_;
				if (i_347_ == i_340_)
				{
					i_337_ = 0;
				}
			}
			else
			{
				final int i_412_ = is[i_340_];
				final int i_413_ = method275(-10643, is_332_[i_340_], is[i_347_], is[(i_335_ + i_347_ + -1) % i_335_],
				        is_332_[(i_335_ + i_347_ + -1) % i_335_], is_332_[i_347_]);
				final int i_414_ = method275(-10643, is_332_[i_340_], is_334_[i_344_], is_334_[(i_344_ + 1) % i_336_],
				        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
				final int i_415_ = method275(-10643, is_332_[i_340_], is_334_[i_346_],
				        is_334_[(i_336_ + i_346_ + -1) % i_336_], is_333_[(i_346_ + i_336_ + -1) % i_336_],
				        is_333_[i_346_]);
				if (method264(i_412_, i_413_, bool, i_415_, i_414_))
				{
					return true;
				}
				i_340_ = (i_340_ - 1 - -i_335_) % i_335_;
				if (i_340_ == i_347_)
				{
					i_337_ = 0;
				}
			}
		}
		if (is_333_[i_344_] > is_332_[i_340_])
		{
			final int i_416_ = is[i_340_];
			final int i_417_ = method275(-10643, is_332_[i_340_], is_334_[i_344_], is_334_[(i_344_ + 1) % i_336_],
			        is_333_[(i_344_ + 1) % i_336_], is_333_[i_344_]);
			final int i_418_ = method275(i ^ 0x797e, is_332_[i_340_], is_334_[i_346_],
			        is_334_[(i_336_ + (i_346_ - 1)) % i_336_], is_333_[(i_336_ + i_346_ + -1) % i_336_],
			        is_333_[i_346_]);
			if (method284(!bool, i_417_, i_418_, i_416_, i + 21741))
			{
				return true;
			}
			return false;
		}
		final int i_419_ = method275(-10643, is_333_[i_344_], is[i_340_], is[(i_340_ + 1) % i_335_],
		        is_332_[(i_340_ + 1) % i_335_], is_332_[i_340_]);
		final int i_420_ = method275(-10643, is_333_[i_344_], is[i_347_], is[((i_335_ + i_347_) - 1) % i_335_],
		        is_332_[(i_335_ + i_347_ + -1) % i_335_], is_332_[i_347_]);
		final int i_421_ = is_334_[i_344_];
		if (method284(bool, i_419_, i_420_, i_421_, i + 21741))
		{
			return true;
		}
		return false;
	}

	void method286(final int i, final int i_422_)
	{
		aBool25 = true;
		anInt474 = i_422_ - anInt428;
		anInt433 = i;
		anInt441 = 0;
	}

	private void method287(final int i_424_)
	{
		final CameraModel class26 = cameraModels[i_424_];
		final Model class23 = class26.aClass23_2;
		final int i_425_ = class26.anInt308;
		final int[] is = class23.anIntArrayArray10[i_425_];
		final int i_426_ = class23.anIntArray64[i_425_];
		int i_427_ = class23.anIntArray71[i_425_];
		final int i_428_ = class23.anIntArray51[is[0]];
		final int i_429_ = class23.anIntArray66[is[0]];
		final int i_430_ = class23.anIntArray74[is[0]];
		final int i_431_ = class23.anIntArray51[is[1]] - i_428_;
		final int i_432_ = -i_429_ + class23.anIntArray66[is[1]];
		final int i_433_ = -i_430_ + class23.anIntArray74[is[1]];
		final int i_434_ = class23.anIntArray51[is[2]] + -i_428_;
		final int i_435_ = class23.anIntArray66[is[2]] + -i_429_;
		final int i_436_ = class23.anIntArray74[is[2]] + -i_430_;
		int i_437_ = (i_436_ * i_432_) + -(i_433_ * i_435_);
		int i_438_ = (i_433_ * i_434_) - (i_431_ * i_436_);
		int i_439_ = (i_431_ * i_435_) + -(i_434_ * i_432_);
		if (i_427_ == -1)
		{
			i_427_ = 0;
			while ((25000 < i_437_) || (25000 < i_438_) || (25000 < i_439_) || (i_437_ < -25000) || (-25000 > i_438_)
			        || (-25000 > i_439_))
			{
				i_437_ >>= 1;
				i_439_ >>= 1;
				i_438_ >>= 1;
				i_427_++;
			}
			class23.anIntArray71[i_425_] = i_427_;
			class23.anIntArray69[i_425_] = (int) (anInt456
			        * Math.sqrt((i_437_ * i_437_) - (-(i_438_ * i_438_) - (i_439_ * i_439_))));
		}
		else
		{
			i_439_ >>= i_427_;
			i_437_ >>= i_427_;
			i_438_ >>= i_427_;
		}
		class26.anInt307 = i_438_;
		class26.anInt318 = (i_429_ * i_438_) + (i_428_ * i_437_) + (i_439_ * i_430_);
		class26.anInt319 = i_439_;
		class26.anInt316 = i_437_;
		int i_440_ = class23.anIntArray74[is[0]];
		int i_441_ = i_440_;
		int i_442_ = class23.anIntArray65[is[0]];
		int i_443_ = i_442_;
		int i_444_ = class23.anIntArray63[is[0]];
		int i_445_ = i_444_;
		for (int i_446_ = 1; i_426_ > i_446_; i_446_++)
		{
			int i_447_ = class23.anIntArray74[is[i_446_]];
			if (i_441_ < i_447_)
			{
				i_441_ = i_447_;
			}
			else if (i_440_ > i_447_)
			{
				i_440_ = i_447_;
			}
			i_447_ = class23.anIntArray65[is[i_446_]];
			if (i_443_ < i_447_)
			{
				i_443_ = i_447_;
			}
			else if (i_447_ < i_442_)
			{
				i_442_ = i_447_;
			}
			i_447_ = class23.anIntArray63[is[i_446_]];
			if (i_445_ >= i_447_)
			{
				if (i_447_ < i_444_)
				{
					i_444_ = i_447_;
				}
			}
			else
			{
				i_445_ = i_447_;
			}
		}
		class26.anInt315 = i_443_;
		class26.anInt317 = i_441_;
		class26.anInt305 = i_440_;
		class26.anInt309 = i_444_;
		class26.anInt304 = i_445_;
		class26.anInt306 = i_442_;
	}

	private void method288(int i, int i_449_, int i_450_)
	{
		final int i_451_ = (-anInt448 + 1024) & 0x3ff;
		final int i_452_ = (-anInt417 + 1024) & 0x3ff;
		final int i_453_ = (-anInt480 - -1024) & 0x3ff;
		if (i_453_ != 0)
		{
			final int i_454_ = GameWindow.anIntArray151[i_453_];
			final int i_455_ = GameWindow.anIntArray151[i_453_ + 1024];
			final int i_456_ = ((i_455_ * i_450_) + (i_454_ * i)) >> 15;
			i = (-(i_454_ * i_450_) + (i_455_ * i)) >> 15;
			i_450_ = i_456_;
		}
		if (i_451_ != 0)
		{
			final int i_457_ = GameWindow.anIntArray151[i_451_];
			final int i_458_ = GameWindow.anIntArray151[i_451_ + 1024];
			final int i_459_ = ((i_458_ * i) - (i_449_ * i_457_)) >> 15;
			i_449_ = ((i_457_ * i) + (i_449_ * i_458_)) >> 15;
			i = i_459_;
		}
		if (i_452_ != 0)
		{
			final int i_461_ = GameWindow.anIntArray151[i_452_];
			final int i_462_ = GameWindow.anIntArray151[i_452_ + 1024];
			final int i_463_ = ((i_462_ * i_450_) + (i_449_ * i_461_)) >> 15;
			i_449_ = (-(i_461_ * i_450_) + (i_449_ * i_462_)) >> 15;
			i_450_ = i_463_;
		}
		if (i_449_ > AClass1.anInt320)
		{
			AClass1.anInt320 = i_449_;
		}
		if (AClass1_Sub1.anInt642 > i_449_)
		{
			AClass1_Sub1.anInt642 = i_449_;
		}
		if (i > Class34.anInt371)
		{
			Class34.anInt371 = i;
		}
		if (Class17.anInt193 > i_450_)
		{
			Class17.anInt193 = i_450_;
		}
		if (CameraModel.anInt312 > i)
		{
			CameraModel.anInt312 = i;
		}
		if (Class19.anInt207 < i_450_)
		{
			Class19.anInt207 = i_450_;
		}
	}

	private void method289(final int i, final int i_464_)
	{
		if (i_464_ < 19)
		{
			anIntArray106 = null;
		}
		if (0 <= i)
		{
			aLongArray2[i] = ByteBuffer.aLong15++;
			if (anIntArrayArray16[i] == null)
			{
				if (anIntArray92[i] != 0)
				{
					for (int i_465_ = 0; i_465_ < anIntArrayArray13.length; i_465_++)
					{
						if (anIntArrayArray13[i_465_] == null)
						{
							anIntArrayArray13[i_465_] = new int[65536];
							anIntArrayArray16[i] = anIntArrayArray13[i_465_];
							method276(i);
							return;
						}
					}
					long l = 1073741824L;
					int i_466_ = 0;
					for (int i_467_ = 0; anInt422 > i_467_; i_467_++)
					{
						if ((i_467_ != i) && (anIntArray92[i_467_] == 1) && (anIntArrayArray16[i_467_] != null)
						        && (aLongArray2[i_467_] < l))
						{
							l = aLongArray2[i_467_];
							i_466_ = i_467_;
						}
					}
					anIntArrayArray16[i] = anIntArrayArray16[i_466_];
					anIntArrayArray16[i_466_] = null;
					method276(i);
				}
				else
				{
					for (int i_468_ = 0; anIntArrayArray14.length > i_468_; i_468_++)
					{
						if (anIntArrayArray14[i_468_] == null)
						{
							anIntArrayArray14[i_468_] = new int[16384];
							anIntArrayArray16[i] = anIntArrayArray14[i_468_];
							method276(i);
							return;
						}
					}
					long l = 1073741824L;
					int i_469_ = 0;
					for (int i_470_ = 0; anInt422 > i_470_; i_470_++)
					{
						if ((i_470_ != i) && (anIntArray92[i_470_] == 0) && (anIntArrayArray16[i_470_] != null)
						        && (l > aLongArray2[i_470_]))
						{
							i_469_ = i_470_;
							l = aLongArray2[i_470_];
						}
					}
					anIntArrayArray16[i] = anIntArrayArray16[i_469_];
					anIntArrayArray16[i_469_] = null;
					method276(i);
				}
			}
		}
	}

	void method290()
	{
		aBool26 = gameImage.aBool28;
		final int i = (this.anInt437 * halfWidth) >> anInt482;
		AClass1.anInt320 = 0;
		final int i_471_ = (this.anInt437 * halfHeight) >> anInt482;
		Class17.anInt193 = 0;
		CameraModel.anInt312 = 0;
		Class34.anInt371 = 0;
		AClass1_Sub1.anInt642 = 0;
		Class19.anInt207 = 0;
		method288(-i_471_, this.anInt437, -i);
		method288(i_471_, this.anInt437, -i);
		method288(-i_471_, this.anInt437, i);
		method288(i_471_, this.anInt437, i);
		method288(-halfHeight, 0, -halfWidth);
		method288(halfHeight, 0, -halfWidth);
		method288(-halfHeight, 0, halfWidth);
		method288(halfHeight, 0, halfWidth);
		AClass1.anInt320 = anInt427 + AClass1.anInt320;
		CameraModel.anInt312 = anInt436 + CameraModel.anInt312;
		AClass1_Sub1.anInt642 = anInt427 + AClass1_Sub1.anInt642;
		Class34.anInt371 = anInt436 + Class34.anInt371;
		Class17.anInt193 = anInt440 + Class17.anInt193;
		Class19.anInt207 = anInt440 + Class19.anInt207;
		modelArray[modelCount] = this.aClass23_3;
		this.aClass23_3.anInt274 = 2;
		for (int i_472_ = 0; i_472_ < modelCount; i_472_++)
		{
			modelArray[i_472_].method145(anInt448, anInt417, anInt440, anInt451, anInt480, anInt427, anInt482,
			        anInt436, 0);
		}
		modelArray[modelCount].method145(anInt448, anInt417, anInt440, anInt451, anInt480, anInt427, anInt482,
		        anInt436, 0);
		anInt460 = 0;
		for (int i_473_ = 0; i_473_ < modelCount; i_473_++)
		{
			final Model class23 = modelArray[i_473_];
			if (class23.aBool14)
			{
				for (int i_474_ = 0; i_474_ < class23.anInt248; i_474_++)
				{
					final int i_475_ = class23.anIntArray64[i_474_];
					boolean bool_476_ = false;
					final int[] is = class23.anIntArrayArray10[i_474_];
					for (int i_477_ = 0; i_477_ < i_475_; i_477_++)
					{
						final int i_478_ = class23.anIntArray74[is[i_477_]];
						if ((i_478_ > anInt451) && (i_478_ < this.anInt437))
						{
							bool_476_ = true;
							break;
						}
					}
					if (bool_476_)
					{
						int i_479_ = 0;
						for (int i_480_ = 0; i_480_ < i_475_; i_480_++)
						{
							final int i_481_ = class23.anIntArray65[is[i_480_]];
							if (-halfWidth < i_481_)
							{
								i_479_ |= 0x1;
							}
							if (halfWidth > i_481_)
							{
								i_479_ |= 0x2;
							}
							if (i_479_ == 3)
							{
								break;
							}
						}
						if (i_479_ == 3)
						{
							i_479_ = 0;
							for (int i_482_ = 0; i_475_ > i_482_; i_482_++)
							{
								final int i_483_ = (class23.anIntArray63[is[i_482_]]);
								if (-halfHeight < i_483_)
								{
									i_479_ |= 0x1;
								}
								if (i_483_ < halfHeight)
								{
									i_479_ |= 0x2;
								}
								if (i_479_ == 3)
								{
									break;
								}
							}
							if (i_479_ == 3)
							{
								final CameraModel class26 = cameraModels[anInt460];
								class26.aClass23_2 = class23;
								class26.anInt308 = i_474_;
								method287(anInt460);
								int i_484_;
								if (0 > class26.anInt318)
								{
									i_484_ = (class23.anIntArray62[i_474_]);
								}
								else
								{
									i_484_ = (class23.anIntArray59[i_474_]);
								}
								if (i_484_ != 12345678)
								{
									int i_485_ = 0;
									for (int i_486_ = 0; i_486_ < i_475_; i_486_++)
									{
										i_485_ += (class23.anIntArray74[is[i_486_]]);
									}
									class26.anInt314 = ((i_485_ / i_475_) + class23.anInt239);
									class26.anInt310 = i_484_;
									anInt460++;
								}
							}
						}
					}
				}
			}
		}
		Model class23 = this.aClass23_3;
		if (class23.aBool14)
		{
			for (int i_487_ = 0; class23.anInt248 > i_487_; i_487_++)
			{
				final int[] is = class23.anIntArrayArray10[i_487_];
				final int i_488_ = is[0];
				final int i_489_ = class23.anIntArray65[i_488_];
				final int i_490_ = class23.anIntArray63[i_488_];
				final int i_491_ = class23.anIntArray74[i_488_];
				if ((i_491_ > anInt451) && (i_491_ < this.anInt464))
				{
					final int i_492_ = (anIntArray102[i_487_] << anInt482) / i_491_;
					final int i_493_ = (anIntArray105[i_487_] << anInt482) / i_491_;
					if (((i_489_ + -(i_492_ / 2)) <= halfWidth) && (-halfWidth <= (i_489_ - -(i_492_ / 2)))
					        && ((-i_493_ + i_490_) <= halfHeight) && (-halfHeight <= i_490_))
					{
						final CameraModel class26 = cameraModels[anInt460];
						class26.aClass23_2 = class23;
						class26.anInt308 = i_487_;
						method272(0, anInt460);
						class26.anInt314 = (i_491_ + class23.anIntArray74[is[1]]) / 2;
						anInt460++;
					}
				}
			}
		}
		if (anInt460 != 0)
		{
			method262(2, cameraModels, anInt460 + -1, 0);
			method291(cameraModels, 0, anInt460, 100);
			for (int i_494_ = 0; i_494_ < anInt460; i_494_++)
			{
				final CameraModel class26 = cameraModels[i_494_];
				class23 = class26.aClass23_2;
				final int i_495_ = class26.anInt308;
				if (class23 == this.aClass23_3)
				{
					final int[] is = class23.anIntArrayArray10[i_495_];
					final int i_496_ = is[0];
					final int i_497_ = class23.anIntArray65[i_496_];
					final int i_498_ = class23.anIntArray63[i_496_];
					final int i_499_ = class23.anIntArray74[i_496_];
					final int i_500_ = (anIntArray102[i_495_] << anInt482) / i_499_;
					final int i_501_ = (anIntArray105[i_495_] << anInt482) / i_499_;
					final int i_502_ = i_498_ + -class23.anIntArray63[is[1]];
					int i_503_ = (((-i_497_ + class23.anIntArray65[is[1]]) * i_502_) / i_501_);
					i_503_ = class23.anIntArray65[is[1]] - i_497_;
					int i_504_ = i_497_ + -(i_500_ / 2);
					final int i_505_ = anInt432 - -i_498_ - i_501_;
					gameImage.drawEntity(i_500_, i_501_, (256 << anInt482) / i_499_, i_504_ + anInt428,
					        anIntArray101[i_495_], i_503_, i_505_, -1);
					if (aBool25 && (anInt441 < anInt462))
					{
						i_504_ = (((anIntArray107[i_495_] << anInt482) / i_499_) + i_504_);
						if ((i_505_ <= anInt433) && ((i_505_ + i_501_) >= anInt433) && (i_504_ <= anInt474)
						        && (anInt474 <= (i_504_ - -i_500_)) && !class23.aBool13
						        && (class23.aByteArray12[i_495_] == 0))
						{
							aClass23Array2[anInt441] = class23;
							anIntArray99[anInt441] = i_495_;
							anInt441++;
						}
					}
				}
				else
				{
					int i_506_ = 0;
					int i_507_ = 0;
					final int i_508_ = class23.anIntArray64[i_495_];
					final int[] is = class23.anIntArrayArray10[i_495_];
					if (class23.anIntArray72[i_495_] != 12345678)
					{
						if (class26.anInt318 >= 0)
						{
							i_507_ = (class23.anInt266 + class23.anIntArray72[i_495_]);
						}
						else
						{
							i_507_ = (-class23.anIntArray72[i_495_] + class23.anInt266);
						}
					}
					for (int i_509_ = 0; i_509_ < i_508_; i_509_++)
					{
						final int i_510_ = is[i_509_];
						anIntArray95[i_509_] = class23.anIntArray51[i_510_];
						anIntArray106[i_509_] = class23.anIntArray66[i_510_];
						anIntArray103[i_509_] = class23.anIntArray74[i_510_];
						if (class23.anIntArray72[i_495_] == 12345678)
						{
							if (class26.anInt318 < 0)
							{
								i_507_ = (-(class23.anIntArray56[i_510_]) + class23.anInt266
								        + (class23.aByteArray13[i_510_]));
							}
							else
							{
								i_507_ = (class23.anInt266 + (class23.aByteArray13[i_510_])
								        + (class23.anIntArray56[i_510_]));
							}
						}
						if (class23.anIntArray74[i_510_] >= anInt451)
						{
							anIntArray97[i_506_] = class23.anIntArray65[i_510_];
							anIntArray109[i_506_] = class23.anIntArray63[i_510_];
							anIntArray94[i_506_] = i_507_;
							if (class23.anIntArray74[i_510_] > this.anInt426)
							{
								anIntArray94[i_506_] += ((-this.anInt426 + (class23.anIntArray74[i_510_]))
								        / this.anInt465);
							}
							i_506_++;
						}
						else
						{
							int i_511_;
							if (i_509_ != 0)
							{
								i_511_ = is[i_509_ + -1];
							}
							else
							{
								i_511_ = is[i_508_ + -1];
							}
							if (anInt451 <= class23.anIntArray74[i_511_])
							{
								final int i_512_ = (-(class23.anIntArray74[i_511_]) + (class23.anIntArray74[i_510_]));
								final int i_513_ = (-(((-(class23.anIntArray66[i_511_])
								        + (class23.anIntArray66[i_510_]))
								        * ((class23.anIntArray74[i_510_]) + -anInt451)) / i_512_)
								        + (class23.anIntArray66[i_510_]));
								final int i_514_ = (-((((class23.anIntArray74[i_510_]) + -anInt451)
								        * ((class23.anIntArray51[i_510_]) - (class23.anIntArray51[i_511_]))) / i_512_)
								        + (class23.anIntArray51[i_510_]));
								anIntArray97[i_506_] = (i_514_ << anInt482) / anInt451;
								anIntArray109[i_506_] = (i_513_ << anInt482) / anInt451;
								anIntArray94[i_506_] = i_507_;
								i_506_++;
							}
							if (i_509_ == (i_508_ - 1))
							{
								i_511_ = is[0];
							}
							else
							{
								i_511_ = is[i_509_ - -1];
							}
							if (anInt451 <= class23.anIntArray74[i_511_])
							{
								final int i_515_ = (class23.anIntArray74[i_510_] - (class23.anIntArray74[i_511_]));
								final int i_516_ = (class23.anIntArray66[i_510_]
								        - (((-(class23.anIntArray66[i_511_]) + (class23.anIntArray66[i_510_]))
								                * ((class23.anIntArray74[i_510_]) + -anInt451)) / i_515_));
								final int i_517_ = (class23.anIntArray51[i_510_]
								        - ((((class23.anIntArray74[i_510_]) + -anInt451)
								                * ((class23.anIntArray51[i_510_]) - (class23.anIntArray51[i_511_])))
								                / i_515_));
								anIntArray97[i_506_] = (i_517_ << anInt482) / anInt451;
								anIntArray109[i_506_] = (i_516_ << anInt482) / anInt451;
								anIntArray94[i_506_] = i_507_;
								i_506_++;
							}
						}
					}
					for (int i_518_ = 0; i_508_ > i_518_; i_518_++)
					{
						if (0 <= anIntArray94[i_518_])
						{
							if (anIntArray94[i_518_] > 255)
							{
								anIntArray94[i_518_] = 255;
							}
						}
						else
						{
							anIntArray94[i_518_] = 0;
						}
						if (0 <= class26.anInt310)
						{
							if (anIntArray92[class26.anInt310] == 1)
							{
								anIntArray94[i_518_] <<= 9;
							}
							else
							{
								anIntArray94[i_518_] <<= 6;
							}
						}
					}
					method260(anIntArray109, 0, anIntArray94, 0, i_506_, 0, i_495_, anIntArray97, class23, 0);
					if (anInt421 < anInt425)
					{
						method259(anIntArray103, 0, 0, class23, class26.anInt310, anIntArray95, i_508_, anIntArray106);
					}
				}
			}
			aBool25 = false;
		}
	}

	private void method291(final CameraModel[] class26s, final int i, final int i_519_, final int i_520_)
	{
		for (int i_521_ = i; i_519_ >= i_521_; i_521_++)
		{
			class26s[i_521_].aBool17 = false;
			class26s[i_521_].anInt313 = i_521_;
			class26s[i_521_].anInt311 = -1;
		}
		int i_522_ = 0;
		for (;;)
		{
			if (class26s[i_522_].aBool17)
			{
				i_522_++;
			}
			else
			{
				if (i_519_ == i_522_)
				{
					break;
				}
				final CameraModel class26 = class26s[i_522_];
				class26.aBool17 = true;
				int i_523_ = i_522_;
				int i_524_ = i_522_ + i_520_;
				if (i_519_ <= i_524_)
				{
					i_524_ = i_519_ + -1;
				}
				for (int i_525_ = i_524_; i_525_ >= (i_523_ + 1); i_525_--)
				{
					final CameraModel class26_526_ = class26s[i_525_];
					if ((class26_526_.anInt315 > class26.anInt306) && (class26.anInt315 > class26_526_.anInt306)
					        && (class26.anInt309 < class26_526_.anInt304) && (class26.anInt304 > class26_526_.anInt309)
					        && (class26.anInt313 != class26_526_.anInt311)
					        && !method296((byte) -63, class26, class26_526_) && method280(class26_526_, -1, class26))
					{
						method279(i_523_, class26s, i_525_);
						i_523_ = anInt469;
						if (class26_526_ != class26s[i_525_])
						{
							i_525_++;
						}
						class26_526_.anInt311 = class26.anInt313;
					}
				}
			}
		}
	}

	static byte[] method292(final byte[] is, final int i, final String string, final int i_527_)
	{
		if (i_527_ != 293484812)
		{
			method292(null, -86, null, -66);
		}
		return IOException_Sub1.method460(i, (byte) -68, is, null, string);
	}

	void method293(final int i, final int i_528_, final int i_529_, final int i_530_)
	{
		aLongArray2 = new long[i_529_];
		aBoolArray8 = new boolean[i_529_];
		anIntArrayArray17 = new int[i_529_][];
		if (i_528_ != 13803)
		{
			method278(71, 119, -51, 38, -95, 56, 8);
		}
		anInt422 = i_529_;
		anIntArray92 = new int[i_529_];
		anIntArrayArray14 = new int[i_530_][];
		aByteArrayArray12 = new byte[i_529_][];
		anIntArrayArray13 = new int[i][];
		anIntArrayArray16 = new int[i_529_][];
		ByteBuffer.aLong15 = 0L;
	}

	void removeModel(final Model model, final int i)
	{
		if (i != 1)
		{
			method284(true, 116, 86, -18, -124);
		}
		for (int index = 0; modelCount > index; index++)
		{
			if (modelArray[index] == model)
			{
				modelCount--;
				for (int index2 = index; modelCount > index2; index2++)
				{
					modelArray[index2] = modelArray[index2 + 1];
					modelIntArray[index2] = modelIntArray[index2 + 1];
				}
			}
		}
	}

	Model[] method295(final int i)
	{
		if (i != -18238)
		{
			return null;
		}
		return aClass23Array2;
	}

	private boolean method296(final byte i, final CameraModel class26, final CameraModel class26_533_)
	{
		if (class26_533_.anInt315 <= class26.anInt306)
		{
			return true;
		}
		if (class26_533_.anInt306 >= class26.anInt315)
		{
			return true;
		}
		if (class26_533_.anInt304 <= class26.anInt309)
		{
			return true;
		}
		if (class26_533_.anInt309 >= class26.anInt304)
		{
			return true;
		}
		if (class26_533_.anInt317 <= class26.anInt305)
		{
			return true;
		}
		if (class26_533_.anInt305 > class26.anInt317)
		{
			return false;
		}
		final Model class23 = class26.aClass23_2;
		final Model class23_534_ = class26_533_.aClass23_2;
		final int i_535_ = class26.anInt308;
		final int i_536_ = class26_533_.anInt308;
		final int[] is = class23.anIntArrayArray10[i_535_];
		final int[] is_537_ = class23_534_.anIntArrayArray10[i_536_];
		final int i_538_ = class23.anIntArray64[i_535_];
		final int i_539_ = class23_534_.anIntArray64[i_536_];
		int i_540_ = class23_534_.anIntArray51[is_537_[0]];
		int i_541_ = class23_534_.anIntArray66[is_537_[0]];
		int i_542_ = class23_534_.anIntArray74[is_537_[0]];
		int i_543_ = class26_533_.anInt316;
		if (i != -63)
		{
			method293(57, -117, 87, 100);
		}
		int i_544_ = class26_533_.anInt307;
		int i_545_ = class26_533_.anInt319;
		int i_546_ = class23_534_.anIntArray69[i_536_];
		int i_547_ = class26_533_.anInt318;
		boolean bool = false;
		for (int i_548_ = 0; i_538_ > i_548_; i_548_++)
		{
			final int i_549_ = is[i_548_];
			final int i_550_ = ((i_544_ * (i_541_ + -class23.anIntArray66[i_549_]))
			        + (i_545_ * (i_542_ - class23.anIntArray74[i_549_]))
			        + (i_543_ * (i_540_ - class23.anIntArray51[i_549_])));
			if (((-i_546_ > i_550_) && (0 > i_547_)) || ((i_550_ > i_546_) && (0 < i_547_)))
			{
				bool = true;
				break;
			}
		}
		if (!bool)
		{
			return true;
		}
		i_544_ = class26.anInt307;
		i_540_ = class23.anIntArray51[is[0]];
		i_542_ = class23.anIntArray74[is[0]];
		i_543_ = class26.anInt316;
		i_541_ = class23.anIntArray66[is[0]];
		bool = false;
		i_547_ = class26.anInt318;
		i_546_ = class23.anIntArray69[i_535_];
		i_545_ = class26.anInt319;
		for (int i_551_ = 0; i_539_ > i_551_; i_551_++)
		{
			final int i_552_ = is_537_[i_551_];
			final int i_553_ = (((i_540_ + -class23_534_.anIntArray51[i_552_]) * i_543_)
			        - (-(i_545_ * (i_542_ + -class23_534_.anIntArray74[i_552_]))
			                + -(i_544_ * (i_541_ - (class23_534_.anIntArray66[i_552_])))));
			if (((-i_546_ > i_553_) && (0 < i_547_)) || ((i_553_ > i_546_) && (0 > i_547_)))
			{
				bool = true;
				break;
			}
		}
		if (bool == false)
		{
			return true;
		}
		int[] is_554_;
		int[] is_555_;
		if (i_538_ == 2)
		{
			is_554_ = new int[4];
			is_555_ = new int[4];
			final int i_556_ = is[1];
			final int i_557_ = is[0];
			is_554_[0] = class23.anIntArray65[i_557_] - 20;
			is_554_[1] = class23.anIntArray65[i_556_] + -20;
			is_554_[2] = class23.anIntArray65[i_556_] + 20;
			is_554_[3] = class23.anIntArray65[i_557_] + 20;
			is_555_[0] = is_555_[3] = class23.anIntArray63[i_557_];
			is_555_[1] = is_555_[2] = class23.anIntArray63[i_556_];
		}
		else
		{
			is_554_ = new int[i_538_];
			is_555_ = new int[i_538_];
			for (int i_558_ = 0; i_558_ < i_538_; i_558_++)
			{
				final int i_559_ = is[i_558_];
				is_554_[i_558_] = class23.anIntArray65[i_559_];
				is_555_[i_558_] = class23.anIntArray63[i_559_];
			}
		}
		int[] is_560_;
		int[] is_561_;
		if (i_539_ != 2)
		{
			is_560_ = new int[i_539_];
			is_561_ = new int[i_539_];
			for (int i_562_ = 0; i_562_ < i_539_; i_562_++)
			{
				final int i_563_ = is_537_[i_562_];
				is_561_[i_562_] = class23_534_.anIntArray65[i_563_];
				is_560_[i_562_] = class23_534_.anIntArray63[i_563_];
			}
		}
		else
		{
			is_560_ = new int[4];
			is_561_ = new int[4];
			final int i_564_ = is_537_[1];
			final int i_565_ = is_537_[0];
			is_561_[0] = class23_534_.anIntArray65[i_565_] + -20;
			is_561_[1] = class23_534_.anIntArray65[i_564_] - 20;
			is_561_[2] = class23_534_.anIntArray65[i_564_] + 20;
			is_561_[3] = class23_534_.anIntArray65[i_565_] - -20;
			is_560_[0] = is_560_[3] = class23_534_.anIntArray63[i_565_];
			is_560_[1] = is_560_[2] = class23_534_.anIntArray63[i_564_];
		}
		return !method285(is_554_, is_555_, i + -20654, is_560_, is_561_);
	}

	Camera(final GameImage gameImage, final int maxModels, final int maxCameraModels, final int i_567_)
	{
		anIntArray95 = new int[40];
		anIntArray94 = new int[40];
		anInt428 = 256;
		anInt434 = 512;
		anInt441 = 0;
		anInt422 = 0;
		anIntArray97 = new int[40];
		anInt456 = 4;
		this.anInt437 = 1000;
		anInt432 = 256;
		anInt462 = 100;
		aBool25 = false;
		halfHeight = 192;
		anInt451 = 5;
		aClass23Array2 = new Model[anInt462];
		this.anInt464 = 1000;
		anIntArray109 = new int[40];
		anIntArray103 = new int[40];
		anIntArray106 = new int[40];
		anIntArray99 = new int[anInt462];
		halfWidth = 256;
		this.anInt465 = 20;
		anInt478 = 0;
		aBool26 = false;
		anInt418 = 50;
		anIntArray104 = new int[anInt418];
		this.anInt426 = 10;
		anInt482 = 8;
		anIntArrayArray15 = new int[anInt418][256];
		maxModelCount = maxModels;
		this.gameImage = gameImage;
		halfHeight = gameImage.menuDefaultWidth / 2;
		halfWidth = gameImage.menuDefaultHeight / 2;
		modelCount = 0;
		anIntArray91 = gameImage.imagePixelArray;
		cameraModels = new CameraModel[maxCameraModels];
		anInt460 = 0;
		modelArray = new Model[maxModelCount];
		modelIntArray = new int[maxModelCount];
		for (int index = 0; maxCameraModels > index; index++)
		{
			cameraModels[index] = new CameraModel();
		}
		anInt478 = 0;
		this.aClass23_3 = new Model(i_567_ * 2, i_567_);
		anIntArray101 = new int[i_567_];
		anIntArray102 = new int[i_567_];
		if (Class47.aByteArray18 == null)
		{
			Class47.aByteArray18 = new byte[17691];
		}
		anInt448 = 0;
		anInt480 = 0;
		anInt436 = 0;
		anIntArray98 = new int[i_567_];
		anIntArray96 = new int[i_567_];
		anIntArray107 = new int[i_567_];
		anInt417 = 0;
		anInt427 = 0;
		anInt440 = 0;
		anIntArray108 = new int[i_567_];
		anIntArray105 = new int[i_567_];
		for (int i_569_ = 0; 256 > i_569_; i_569_++)
		{
			GameWindow.anIntArray152[i_569_] = (int) (Math.sin(0.02454369 * i_569_) * 32768.0);
			GameWindow.anIntArray152[i_569_ + 256] = (int) (32768.0 * Math.cos(0.02454369 * i_569_));
		}
		for (int i_570_ = 0; i_570_ < 1024; i_570_++)
		{
			GameWindow.anIntArray151[i_570_] = (int) (32768.0 * Math.sin(i_570_ * 0.00613592315));
			GameWindow.anIntArray151[i_570_ + 1024] = (int) (32768.0 * Math.cos(i_570_ * 0.00613592315));
		}
	}
}
