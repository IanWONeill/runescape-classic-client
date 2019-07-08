package com.classic;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

class GameImage implements ImageProducer, ImageObserver
{
	int menuDefaultHeight;
	private int[] anIntArray116;
	int[][] anIntArrayArray19;
	boolean aBool27 = false;
	int menuDefaultWidth;
	private int anInt517 = 0;
	int[][] anIntArrayArray20;
	private int anInt522;
	private int[] anIntArray117;
	int[] anIntArray118;
	int[] imagePixelArray;
	private final int[] anIntArray120;
	private int[] anIntArray121;
	private int anInt536;
	private int anInt537 = 0;
	private ColorModel aColorModel2;
	int[] anIntArray122;
	int[] anIntArray123;
	private Image image;
	private int[] anIntArray124;
	boolean aBool28;
	int[] anIntArray125;
	static int[] anIntArray126 = new int[100];
	private static int[] charIndexes;
	private final int[] anIntArray128;
	private int[] anIntArray129;
	private final boolean[] aBoolArray9;
	byte[][] aByteArrayArray13;
	private int[] anIntArray130;
	private int[] anIntArray131;
	private int anInt567;
	static String[] aStringArray33;
	private ImageConsumer anImageConsumer2;
	static int[] anIntArray132;
	static int anInt568;
	static int anInt569;
	static int[] anIntArray133;
	static int[] anIntArray134;

	private void method305(final int i, final int i_0_, final int i_1_, final String string, final int i_2_,
	        final int i_3_)
	{
		method361(string, i_2_, i_1_, i_0_, i - (method328(string, -117, i_1_) / 2), i_3_);
	}

	void method306(final int i)
	{
		final int i_5_ = (this.anIntArray123[i] * this.anIntArray118[i]);
		final int[] is = this.anIntArrayArray20[i];
		final int[] is_6_ = new int[32768];
		for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
		{
			final int i_8_ = is[i_7_];
			is_6_[(0x3e0 & (i_8_ >> 6)) + ((i_8_ >> 9) & 0x7c00) + ((i_8_ & 0xf8) >> 3)]++;
		}
		final int[] is_9_ = new int[256];
		is_9_[0] = 16711935;
		final int[] is_10_ = new int[256];
		for (int i_11_ = 0; 32768 > i_11_; i_11_++)
		{
			final int i_12_ = is_6_[i_11_];
			if (i_12_ > is_10_[255])
			{
				for (int i_13_ = 1; i_13_ < 256; i_13_++)
				{
					if (i_12_ > is_10_[i_13_])
					{
						for (int i_14_ = 255; i_13_ < i_14_; i_14_--)
						{
							is_9_[i_14_] = is_9_[i_14_ + -1];
							is_10_[i_14_] = is_10_[i_14_ + -1];
						}
						is_9_[i_13_] = (Class52.method378(248, i_11_ << 3)
						        + (((Class52.method378(i_11_, 31744) << 9) - -Class52.method378(63488, i_11_ << 6))
						                + 263172));
						is_10_[i_13_] = i_12_;
						break;
					}
				}
			}
			is_6_[i_11_] = -1;
		}
		final byte[] is_15_ = new byte[i_5_];
		for (int i_16_ = 0; i_16_ < i_5_; i_16_++)
		{
			final int i_17_ = is[i_16_];
			final int i_18_ = ((((i_17_ & 0xf80000) >> 9) - -((i_17_ & 0xf8) >> 3)) + ((i_17_ >> 6) & 0x3e0));
			int i_19_ = is_6_[i_18_];
			if (i_19_ == -1)
			{
				int i_20_ = 999999999;
				final int i_21_ = 0xff & (i_17_ >> 16);
				final int i_22_ = (0xff8b & i_17_) >> 8;
				final int i_23_ = 0xff & i_17_;
				for (int i_24_ = 0; i_24_ < 256; i_24_++)
				{
					final int i_25_ = is_9_[i_24_];
					final int i_26_ = 0xff & (i_25_ >> 16);
					final int i_27_ = (i_25_ & 0xff5e) >> 8;
					final int i_28_ = i_25_ & 0xff;
					final int i_29_ = (((-i_28_ + i_23_) * (-i_28_ + i_23_)) + ((-i_26_ + i_21_) * (-i_26_ + i_21_))
					        + ((i_22_ - i_27_) * (-i_27_ + i_22_)));
					if (i_20_ > i_29_)
					{
						i_20_ = i_29_;
						i_19_ = i_24_;
					}
				}
				is_6_[i_18_] = i_19_;
			}
			is_15_[i_16_] = (byte) i_19_;
		}
		this.aByteArrayArray13[i] = is_15_;
		this.anIntArrayArray19[i] = is_9_;
		this.anIntArrayArray20[i] = null;
	}

	private int method307(final int i_31_)
	{
		if (i_31_ == 0)
		{
			return PacketConstruction.aByteArrayArray8[i_31_][8] - 2;
		}
		return PacketConstruction.aByteArrayArray8[i_31_][8] + -1;
	}

	private void method308(int i, int i_32_, final int i_33_, final int i_34_, int i_35_, final int i_36_,
	        final byte i_37_, int i_38_, final int[] is_39_, final int i_40_)
	{
		if (i_37_ > -57)
		{
			this.aBool27 = true;
		}
		for (i = i_36_; 0 > i; i++)
		{
			this.imagePixelArray[i_38_++] = is_39_[(i_32_ >> 17) + ((i_35_ >> 17) * i_34_)];
			i_35_ = i_40_ + i_35_;
			i_32_ = i_33_ + i_32_;
		}
	}

	static void method309(int i, final int i_41_, final int[] is, int i_42_, final int i_43_, final int[] is_44_,
	        int i_45_, int i_46_)
	{
		if (i_43_ < 0)
		{
			i_46_ = is[0xff & (i >> 8)];
			i_42_ <<= 1;
			i = i_42_ + i;
			if (i_41_ != -20704)
			{
				method310(78, null);
			}
			int i_47_ = i_43_ / 8;
			for (int i_48_ = i_47_; 0 > i_48_; i_48_++)
			{
				is_44_[i_45_++] = i_46_;
				is_44_[i_45_++] = i_46_;
				i_46_ = is[(0xffc8 & i) >> 8];
				i = i_42_ + i;
				is_44_[i_45_++] = i_46_;
				is_44_[i_45_++] = i_46_;
				i_46_ = is[(i >> 8) & 0xff];
				i = i_42_ + i;
				is_44_[i_45_++] = i_46_;
				is_44_[i_45_++] = i_46_;
				i_46_ = is[(i >> 8) & 0xff];
				is_44_[i_45_++] = i_46_;
				i = i_42_ + i;
				is_44_[i_45_++] = i_46_;
				i_46_ = is[0xff & (i >> 8)];
				i = i_42_ + i;
			}
			i_47_ = -(i_43_ % 8);
			for (int i_49_ = 0; i_49_ < i_47_; i_49_++)
			{
				is_44_[i_45_++] = i_46_;
				if ((i_49_ & 0x1) == 1)
				{
					i_46_ = is[(i & 0xff56) >> 8];
					i = i_42_ + i;
				}
			}
		}
	}

	static void method310(final int i, final String string)
	{
		if (i != 3)
		{
			method309(-87, -49, null, -71, -95, null, 85, -125);
		}
		System.out.println(new StringBuilder().append("Error: ").append(Class6.method22(string, "%0a", "\n", i ^ ~0x78))
		        .toString());
	}

	void method311(int i, int i_50_, int i_51_, final int i_52_, final int i_53_, int i_55_)
	{
		try
		{
			final int i_56_ = this.anIntArray118[i_53_];
			final int i_57_ = this.anIntArray123[i_53_];
			int i_58_ = 0;
			int i_59_ = 0;
			int i_60_ = (i_56_ << 16) / i_50_;
			int i_61_ = (i_57_ << 16) / i_51_;
			if (aBoolArray9[i_53_])
			{
				final int i_62_ = this.anIntArray125[i_53_];
				final int i_63_ = this.anIntArray122[i_53_];
				if ((i_62_ == 0) || (i_63_ == 0))
				{
					return;
				}
				i = ((i_62_ + (anIntArray128[i_53_] * i_50_) + -1) / i_62_) + i;
				if (((anIntArray128[i_53_] * i_50_) % i_62_) != 0)
				{
					i_58_ = ((-((anIntArray128[i_53_] * i_50_) % i_62_) + i_62_) << 16) / i_50_;
				}
				if (((i_51_ * anIntArray120[i_53_]) % i_63_) != 0)
				{
					i_59_ = ((i_63_ - ((i_51_ * anIntArray120[i_53_]) % i_63_)) << 16) / i_51_;
				}
				i_61_ = (i_63_ << 16) / i_51_;
				i_60_ = (i_62_ << 16) / i_50_;
				i_55_ = (((i_63_ + (i_51_ * anIntArray120[i_53_]) + -1) / i_63_) + i_55_);
				i_51_ = (i_51_ * (this.anIntArray123[i_53_] + -(i_59_ >> 16))) / i_63_;
				i_50_ = ((this.anIntArray118[i_53_] - (i_58_ >> 16)) * i_50_) / i_62_;
			}
			int i_64_ = i - -(i_55_ * this.menuDefaultHeight);
			if (i_55_ < anInt537)
			{
				final int i_65_ = anInt537 + -i_55_;
				i_59_ += i_65_ * i_61_;
				i_51_ -= i_65_;
				i_55_ = 0;
				i_64_ += i_65_ * this.menuDefaultHeight;
			}
			int i_66_ = this.menuDefaultHeight - i_50_;
			if (i < anInt517)
			{
				final int i_67_ = -i + anInt517;
				i_50_ -= i_67_;
				i_58_ += i_60_ * i_67_;
				i = 0;
				i_66_ += i_67_;
				i_64_ += i_67_;
			}
			if ((i_51_ + i_55_) >= anInt536)
			{
				i_51_ -= i_51_ + (i_55_ - (anInt536 + -1));
			}
			if (anInt567 <= (i_50_ + i))
			{
				final int i_68_ = (i - -1) + i_50_ + -anInt567;
				i_50_ -= i_68_;
				i_66_ += i_68_;
			}
			int i_69_ = 1;
			if (!!this.aBool28)
			{
				i_69_ = 2;
				i_61_ += i_61_;
				i_66_ += this.menuDefaultHeight;
				if ((i_55_ & 0x1) != 0)
				{
					i_51_--;
					i_64_ += this.menuDefaultHeight;
				}
			}
			method355(i_59_, i_61_, i_52_, i_69_, i_51_, i_56_, 0, this.anIntArrayArray20[i_53_], i_58_, i_66_, i_60_,
			        this.imagePixelArray, i_64_, i_50_);
		}
		catch (final Exception exception)
		{
			System.out.println("error in sprite clipping routine");
		}
	}

	void method312(final int i, final int i_70_, final int i_71_, final int i_72_, final int i_73_, final int i_74_)
	{
		this.anIntArray118[i_72_] = i_71_;
		this.anIntArray123[i_72_] = i_74_;
		aBoolArray9[i_72_] = false;
		anIntArray128[i_72_] = 0;
		anIntArray120[i_72_] = 0;
		this.anIntArray125[i_72_] = i_71_;
		this.anIntArray122[i_72_] = i_74_;
		final int i_75_ = i_71_ * i_74_;
		this.anIntArrayArray20[i_72_] = new int[i_75_];
		if (i >= 91)
		{
			int i_76_ = 0;
			for (int i_77_ = i_73_; (i_71_ + i_73_) > i_77_; i_77_++)
			{
				for (int i_78_ = i_70_; i_78_ < (i_70_ - -i_74_); i_78_++)
				{
					this.anIntArrayArray20[i_72_][i_76_++] = (this.imagePixelArray[i_77_ - -(i_78_ * this.menuDefaultHeight)]);
				}
			}
		}
	}

	void method313(final int i, final int i_79_, final int i_80_, final int i_82_, final String string)
	{
		method337(string, i_79_, i_80_, i_82_, 0, i);
	}

	private void method314(final int i, final int i_84_, int i_85_, final int i_86_, final int i_87_, final int i_88_,
	        int i_89_, int i_90_, final int i_91_, int i_92_, final int i_94_, final int[] is, final int[] is_95_,
	        int i_96_, int i_97_, final byte[] is_98_)
	{
		final int i_99_ = (i >> 16) & 0xff;
		final int i_100_ = (i >> 8) & 0xff;
		final int i_101_ = 0xff & i;
		try
		{
			final int i_102_ = i_89_;
			for (int i_103_ = -i_88_; 0 > i_103_; i_103_++)
			{
				final int i_104_ = (i_92_ >> 16) * i_91_;
				int i_105_ = i_85_ >> 16;
				int i_106_ = i_84_;
				if (i_105_ < anInt517)
				{
					final int i_107_ = anInt517 - i_105_;
					i_106_ -= i_107_;
					i_105_ = anInt517;
					i_89_ = (i_87_ * i_107_) + i_89_;
				}
				if (anInt567 <= (i_106_ + i_105_))
				{
					final int i_108_ = i_106_ + (i_105_ - anInt567);
					i_106_ -= i_108_;
				}
				i_97_ = -i_97_ + 1;
				if (i_97_ != 0)
				{
					for (int i_109_ = i_105_; (i_105_ - -i_106_) > i_109_; i_109_++)
					{
						i_90_ = is_98_[(i_89_ >> 16) + i_104_] & 0xff;
						if (i_90_ != 0)
						{
							i_90_ = is[i_90_];
							final int i_110_ = 0xff & (i_90_ >> 16);
							final int i_111_ = 0xff & i_90_;
							final int i_112_ = (0xffd6 & i_90_) >> 8;
							if ((i_110_ != i_112_) || (i_112_ != i_111_))
							{
								is_95_[i_109_ + i_96_] = i_90_;
							}
							else
							{
								is_95_[i_109_ - -i_96_] = ((((i_110_ * i_99_) >> 8) << 16) + ((i_101_ * i_111_) >> 8)
								        + (((i_112_ * i_100_) >> 8) << 8));
							}
						}
						i_89_ = i_87_ + i_89_;
					}
				}
				i_92_ += i_86_;
				i_89_ = i_102_;
				i_96_ += this.menuDefaultHeight;
				i_85_ += i_94_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in transparent sprite plot routine");
		}
	}

	int method315(final int i_114_)
	{
		if (i_114_ == 0)
		{
			return 12;
		}
		if (i_114_ == 1)
		{
			return 14;
		}
		if (i_114_ == 2)
		{
			return 14;
		}
		if (i_114_ == 3)
		{
			return 15;
		}
		if (i_114_ == 4)
		{
			return 15;
		}
		if (i_114_ == 5)
		{
			return 19;
		}
		if (i_114_ == 6)
		{
			return 24;
		}
		if (i_114_ == 7)
		{
			return 29;
		}
		return method307(i_114_);
	}

	void spriteClip1(int i, int i_115_, final int i_116_, int i_117_, int i_119_)
	{
		try
		{
			final int i_121_ = this.anIntArray118[i_116_];
			final int i_122_ = this.anIntArray123[i_116_];
			int i_123_ = 0;
			int i_124_ = 0;
			int i_125_ = (i_121_ << 16) / i;
			int i_126_ = (i_122_ << 16) / i_119_;
			if (aBoolArray9[i_116_])
			{
				final int i_127_ = this.anIntArray125[i_116_];
				final int i_128_ = this.anIntArray122[i_116_];
				if ((i_127_ == 0) || (i_128_ == 0))
				{
					return;
				}
				i_115_ = ((((i_128_ + (anIntArray120[i_116_] * i_119_)) - 1) / i_128_) + i_115_);
				if (((anIntArray128[i_116_] * i) % i_127_) != 0)
				{
					i_123_ = ((i_127_ + -((anIntArray128[i_116_] * i) % i_127_)) << 16) / i;
				}
				if (((anIntArray120[i_116_] * i_119_) % i_128_) != 0)
				{
					i_124_ = ((i_128_ - ((anIntArray120[i_116_] * i_119_) % i_128_)) << 16) / i_119_;
				}
				i_126_ = (i_128_ << 16) / i_119_;
				i_125_ = (i_127_ << 16) / i;
				i_117_ += (i_127_ + (anIntArray128[i_116_] * i) + -1) / i_127_;
				i = (i * (this.anIntArray118[i_116_] - (i_123_ >> 16))) / i_127_;
				i_119_ = (i_119_ * (this.anIntArray123[i_116_] - (i_124_ >> 16))) / i_128_;
			}
			int i_129_ = (i_115_ * this.menuDefaultHeight) + i_117_;
			int i_130_ = -i + this.menuDefaultHeight;
			if (i_115_ < anInt537)
			{
				final int i_131_ = -i_115_ + anInt537;
				i_119_ -= i_131_;
				i_115_ = 0;
				i_124_ += i_126_ * i_131_;
				i_129_ += i_131_ * this.menuDefaultHeight;
			}
			if (i_117_ < anInt517)
			{
				final int i_132_ = anInt517 - i_117_;
				i_130_ += i_132_;
				i_129_ += i_132_;
				i_117_ = 0;
				i_123_ += i_125_ * i_132_;
				i -= i_132_;
			}
			if ((i_115_ - -i_119_) >= anInt536)
			{
				i_119_ -= i_115_ + i_119_ + -anInt536 + 1;
			}
			if ((i_117_ - -i) >= anInt567)
			{
				final int i_133_ = (i_117_ + i) - (anInt567 - 1);
				i_130_ += i_133_;
				i -= i_133_;
			}
			int i_134_ = 1;
			if (this.aBool28 == true)
			{
				i_134_ = 2;
				i_126_ += i_126_;
				i_130_ += this.menuDefaultHeight;
				if ((i_115_ & 0x1) != 0)
				{
					i_129_ += this.menuDefaultHeight;
					i_119_--;
				}
			}
			method340(0, i_134_, i_119_, this.anIntArrayArray20[i_116_], i_124_, i_129_, i, i_123_, i_130_, i_121_,
			        i_125_, this.imagePixelArray, i_126_);
		}
		catch (final Exception exception)
		{
			System.out.println("error in sprite clipping routine");
		}
	}

	private void method317(final int i, final int i_135_, int i_136_, int i_138_, final byte[] is, final int[] is_139_,
	        final int i_140_, int i_141_, final int i_142_)
	{
		try
		{
			final int i_143_ = -(i_138_ >> 2);
			i_138_ = -(0x3 & i_138_);
			for (int i_144_ = -i; i_144_ < 0; i_144_++)
			{
				for (int i_145_ = i_143_; 0 > i_145_; i_145_++)
				{
					if (0 == is[i_136_++])
					{
						i_141_++;
					}
					else
					{
						is_139_[i_141_++] = i_142_;
					}
					if (is[i_136_++] != 0)
					{
						is_139_[i_141_++] = i_142_;
					}
					else
					{
						i_141_++;
					}
					if (0 != is[i_136_++])
					{
						is_139_[i_141_++] = i_142_;
					}
					else
					{
						i_141_++;
					}
					if (0 == is[i_136_++])
					{
						i_141_++;
					}
					else
					{
						is_139_[i_141_++] = i_142_;
					}
				}
				for (int i_146_ = i_138_; i_146_ < 0; i_146_++)
				{
					if (is[i_136_++] != 0)
					{
						is_139_[i_141_++] = i_142_;
					}
					else
					{
						i_141_++;
					}
				}
				i_141_ = i_140_ + i_141_;
				i_136_ += i_135_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println(new StringBuilder().append("plotletter: ").append(exception).toString());
			exception.printStackTrace();
		}
	}

	void method318(final int i, final int i_147_, final int i_148_, final int i_149_)
	{
		if (i_147_ != -13292)
		{
			method362(-4, 124, -80, -62, -111);
		}
		if ((i >= anInt517) && (i_148_ >= anInt537) && (anInt567 > i) && (anInt536 > i_148_))
		{
			this.imagePixelArray[((i_148_ * this.menuDefaultHeight) + i)] = i_149_;
		}
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer imageconsumer)
	{
		if (imageconsumer == anImageConsumer2)
		{
			anImageConsumer2 = null;
		}
	}

	void method319(final int i, int i_150_, int i_151_, final int i_152_)
	{
		if ((i_152_ >= anInt517) && (anInt567 > i_152_))
		{
			if (anInt537 > i_151_)
			{
				i_150_ -= -i_151_ + anInt537;
				i_151_ = anInt537;
			}
			if (anInt536 < (i_151_ + i_150_))
			{
				i_150_ = -i_151_ + anInt536;
			}
			if (i_150_ > 0)
			{
				final int i_153_ = (i_151_ * this.menuDefaultHeight) + i_152_;
				for (int i_154_ = 0; i_154_ < i_150_; i_154_++)
				{
					this.imagePixelArray[i_153_ + (i_154_ * this.menuDefaultHeight)] = i;
				}
			}
		}
	}

	void method320(int i_155_, final int i_156_, int i_157_, final int i_158_)
	{
		if (aBoolArray9[i_156_])
		{
			i_157_ = anIntArray120[i_156_] + i_157_;
			i_155_ = anIntArray128[i_156_] + i_155_;
		}
		int i_159_ = (i_157_ * this.menuDefaultHeight) + i_155_;
		int i_160_ = 0;
		int i_161_ = this.anIntArray123[i_156_];
		int i_162_ = this.anIntArray118[i_156_];
		int i_163_ = -i_162_ + this.menuDefaultHeight;
		if (anInt537 > i_157_)
		{
			final int i_164_ = -i_157_ + anInt537;
			i_161_ -= i_164_;
			i_159_ += i_164_ * this.menuDefaultHeight;
			i_157_ = anInt537;
			i_160_ += i_164_ * i_162_;
		}
		int i_165_ = 0;
		if (i_155_ < anInt517)
		{
			final int i_166_ = anInt517 - i_155_;
			i_165_ += i_166_;
			i_162_ -= i_166_;
			i_155_ = anInt517;
			i_159_ += i_166_;
			i_163_ += i_166_;
			i_160_ += i_166_;
		}
		if (anInt536 <= (i_161_ + i_157_))
		{
			i_161_ -= (i_161_ + i_157_ + 1) - anInt536;
		}
		if (anInt567 <= (i_162_ + i_155_))
		{
			final int i_167_ = (i_155_ + 1) - (-i_162_ - -anInt567);
			i_163_ += i_167_;
			i_162_ -= i_167_;
			i_165_ += i_167_;
		}
		if ((i_162_ > 0) && (0 < i_161_))
		{
			int i_168_ = 1;
			if (this.aBool28 == true)
			{
				i_163_ += this.menuDefaultHeight;
				if ((0x1 & i_157_) != 0)
				{
					i_159_ += this.menuDefaultHeight;
					i_161_--;
				}
				i_168_ = 2;
				i_165_ = this.anIntArray118[i_156_] + i_165_;
			}
			if (this.anIntArrayArray20[i_156_] != null)
			{
				method336(i_162_, 0, i_160_, this.anIntArrayArray20[i_156_], i_161_, i_165_, this.imagePixelArray, i_158_,
				        i_159_, i_168_, i_163_);
			}
			else
			{
				method345(i_162_, this.anIntArrayArray19[i_156_], i_165_, i_168_, i_158_, i_163_, i_161_, i_159_,
				        i_160_, this.aByteArrayArray13[i_156_], this.imagePixelArray);
			}
		}
	}

	void method321(int i, final int i_169_, int i_170_, int i_171_, int i_172_, final int i_173_)
	{
		if (i < anInt537)
		{
			i_170_ -= anInt537 - i;
			i = anInt537;
		}
		if (i_172_ < anInt517)
		{
			i_171_ -= -i_172_ + anInt517;
			i_172_ = anInt517;
		}
		if (anInt567 < (i_172_ - -i_171_))
		{
			i_171_ = anInt567 - i_172_;
		}
		if ((i_170_ + i) > anInt536)
		{
			i_170_ = -i + anInt536;
		}
		int i_174_ = -i_171_ + this.menuDefaultHeight;
		int i_175_ = i_173_;
		if (this.aBool28 == true)
		{
			i_174_ += this.menuDefaultHeight;
			if ((0x1 & i) != 0)
			{
				i_170_--;
				i++;
			}
			i_175_ = 2;
		}
		int i_176_ = i_172_ - -(this.menuDefaultHeight * i);
		for (int i_177_ = -i_170_; i_177_ < 0; i_177_ += i_175_)
		{
			for (int i_178_ = -i_171_; i_178_ < 0; i_178_++)
			{
				this.imagePixelArray[i_176_++] = i_169_;
			}
			i_176_ += i_174_;
		}
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer imageconsumer)
	{
		if (imageconsumer != anImageConsumer2)
		{
			return false;
		}
		return true;
	}

	static void method322(int i, final int i_179_, final int[] is, int i_180_, int i_181_, int i_182_, final int i_183_,
	        final int i_184_, int i_186_, int i_187_, int i_188_, int i_189_, final int i_190_, final int[] is_191_)
	{
		if (i_190_ > 0)
		{
			int i_192_ = 0;
			int i_193_ = 0;
			i_181_ <<= 2;
			if (i_189_ != 0)
			{
				i_192_ = (i_188_ / i_189_) << 6;
				i_193_ = (i_182_ / i_189_) << 6;
			}
			if (0 <= i_192_)
			{
				if (i_192_ > 4032)
				{
					i_192_ = 4032;
				}
			}
			else
			{
				i_192_ = 0;
			}
			for (int i_195_ = i_190_; 0 < i_195_; i_195_ -= 16)
			{
				i_188_ += i_184_;
				i_182_ += i_179_;
				i_180_ = i_193_;
				i_187_ = i_192_;
				i_189_ += i_183_;
				if (i_189_ != 0)
				{
					i_193_ = (i_182_ / i_189_) << 6;
					i_192_ = (i_188_ / i_189_) << 6;
				}
				if (i_192_ < 0)
				{
					i_192_ = 0;
				}
				else if (i_192_ > 4032)
				{
					i_192_ = 4032;
				}
				final int i_196_ = (i_192_ + -i_187_) >> 4;
				final int i_197_ = (i_193_ + -i_180_) >> 4;
				i_187_ += i_186_ & 0xc0000;
				int i_198_ = i_186_ >> 20;
				i_186_ = i_181_ + i_186_;
				if (i_195_ >= 16)
				{
					is_191_[i++] = ((Class52.method378(is_191_[i], 16711423) >> 1)
					        + (is[(i_187_ >> 6) + Class52.method378(4032, i_180_)] >>> i_198_));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((Class52.method378(16711423, is_191_[i]) >> 1)
					        + (is[Class52.method378(i_180_, 4032) + (i_187_ >> 6)] >>> i_198_));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[Class52.method378(i_180_, 4032) + (i_187_ >> 6)] >>> i_198_)
					        - -(Class52.method378(16711422, is_191_[i]) >> 1));
					i_187_ += i_196_;
					i_180_ += i_197_;
					is_191_[i++] = ((is[Class52.method378(i_180_, 4032) + (i_187_ >> 6)] >>> i_198_)
					        + Class52.method378(8355711, is_191_[i] >> 1));
					i_187_ += i_196_;
					i_180_ += i_197_;
					i_187_ = (0xfff & i_187_) + (0xc0000 & i_186_);
					i_198_ = i_186_ >> 20;
					is_191_[i++] = ((Class52.method378(is_191_[i], 16711422) >> 1)
					        + (is[(i_187_ >> 6) + Class52.method378(4032, i_180_)] >>> i_198_));
					i_186_ = i_181_ + i_186_;
					i_187_ += i_196_;
					i_180_ += i_197_;
					is_191_[i++] = ((is[(i_187_ >> 6) + Class52.method378(i_180_, 4032)] >>> i_198_)
					        - -Class52.method378(8355711, is_191_[i] >> 1));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[(i_187_ >> 6) + Class52.method378(i_180_, 4032)] >>> i_198_)
					        + (Class52.method378(is_191_[i], 16711423) >> 1));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[(i_187_ >> 6) + Class52.method378(i_180_, 4032)] >>> i_198_)
					        - -(Class52.method378(16711423, is_191_[i]) >> 1));
					i_180_ += i_197_;
					i_187_ += i_196_;
					i_198_ = i_186_ >> 20;
					i_187_ = (0xfff & i_187_) + (i_186_ & 0xc0000);
					is_191_[i++] = ((is[Class52.method378(i_180_, 4032) + (i_187_ >> 6)] >>> i_198_)
					        - -Class52.method378(8355711, is_191_[i] >> 1));
					i_186_ = i_181_ + i_186_;
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[Class52.method378(i_180_, 4032) - -(i_187_ >> 6)] >>> i_198_)
					        + Class52.method378(is_191_[i] >> 1, 8355711));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[(i_187_ >> 6) + Class52.method378(i_180_, 4032)] >>> i_198_)
					        + Class52.method378(is_191_[i] >> 1, 8355711));
					i_187_ += i_196_;
					i_180_ += i_197_;
					is_191_[i++] = ((is[Class52.method378(4032, i_180_) + (i_187_ >> 6)] >>> i_198_)
					        - -(Class52.method378(is_191_[i], 16711423) >> 1));
					i_187_ += i_196_;
					i_180_ += i_197_;
					i_198_ = i_186_ >> 20;
					i_187_ = (0xfff & i_187_) + (0xc0000 & i_186_);
					is_191_[i++] = ((is[(i_187_ >> 6) + Class52.method378(i_180_, 4032)] >>> i_198_)
					        + Class52.method378(8355711, is_191_[i] >> 1));
					i_186_ = i_181_ + i_186_;
					i_187_ += i_196_;
					i_180_ += i_197_;
					is_191_[i++] = (Class52.method378(8355711, is_191_[i] >> 1)
					        + (is[Class52.method378(i_180_, 4032) - -(i_187_ >> 6)] >>> i_198_));
					i_180_ += i_197_;
					i_187_ += i_196_;
					is_191_[i++] = ((is[Class52.method378(4032, i_180_) + (i_187_ >> 6)] >>> i_198_)
					        + Class52.method378(is_191_[i] >> 1, 8355711));
					i_187_ += i_196_;
					i_180_ += i_197_;
					is_191_[i++] = ((Class52.method378(16711422, is_191_[i]) >> 1)
					        + (is[Class52.method378(i_180_, 4032) + (i_187_ >> 6)] >>> i_198_));
				}
				else
				{
					for (int i_199_ = 0; i_199_ < i_195_; i_199_++)
					{
						is_191_[i++] = ((is[Class52.method378(4032, i_180_) - -(i_187_ >> 6)] >>> i_198_)
						        - -Class52.method378(is_191_[i] >> 1, 8355711));
						i_180_ += i_197_;
						i_187_ += i_196_;
						if ((0x3 & i_199_) == 3)
						{
							i_198_ = i_186_ >> 20;
							i_187_ = (0xfff & i_187_) + (0xc0000 & i_186_);
							i_186_ = i_181_ + i_186_;
						}
					}
				}
			}
		}
	}

	void method323(final int i)
	{
		anInt537 = 0;
		anInt567 = this.menuDefaultHeight;
		anInt517 = 0;
		anInt536 = this.menuDefaultWidth;
		if (i != -10624)
		{
			method312(91, -82, -73, -75, -28, 35);
		}
	}

	void method324(final String string, final int i, final int i_200_, final int i_201_, final int i_202_,
	        final int i_203_)
	{
		method361(string, i, i_200_, i_203_, i_202_, i_201_);
	}

	void method325(final int i, final int i_204_, final int i_205_, final int i_206_, final int i_207_,
	        final int i_208_)
	{
		for (int i_209_ = i_206_; i_209_ < (i_206_ - -i); i_209_++)
		{
			for (int i_210_ = i_207_; i_210_ < (i_208_ + i_207_); i_210_++)
			{
				int i_211_ = 0;
				int i_212_ = 0;
				int i_213_ = 0;
				int i_214_ = 0;
				for (int i_215_ = -i_204_ + i_209_; i_215_ <= (i_209_ - -i_204_); i_215_++)
				{
					if ((i_215_ >= 0) && (this.menuDefaultHeight > i_215_))
					{
						for (int i_216_ = i_210_ - i_205_; (i_205_ + i_210_) >= i_216_; i_216_++)
						{
							if ((0 <= i_216_) && (this.menuDefaultWidth > i_216_))
							{
								final int i_217_ = (this.imagePixelArray[i_215_ + (i_216_ * (this.menuDefaultHeight))]);
								i_213_ = (i_217_ & 0xff) + i_213_;
								i_211_ += (i_217_ >> 16) & 0xff;
								i_214_++;
								i_212_ += (0xff84 & i_217_) >> 8;
							}
						}
					}
				}
				this.imagePixelArray[i_209_ + (i_210_ * this.menuDefaultHeight)] = (i_213_ / i_214_)
				        + (((i_211_ / i_214_) << 16) - -((i_212_ / i_214_) << 8));
			}
		}
	}

	@Override
	public void startProduction(final ImageConsumer imageconsumer)
	{
		addConsumer(imageconsumer);
	}

	private void method326(final int i, final int i_218_, final boolean bool, final int i_219_, final byte[] is,
	        final int i_221_)
	{
		int i_222_ = is[i + 5] + i_219_;
		int i_223_ = -is[i - -6] + i_221_;
		int i_224_ = is[i + 3];
		int i_225_ = is[i + 4];
		int i_226_ = (is[i] * 16384) - (-is[i + 2] + -(is[i + 1] * 128));
		int i_227_ = i_222_ - -(i_223_ * this.menuDefaultHeight);
		int i_228_ = -i_224_ + this.menuDefaultHeight;
		int i_229_ = 0;
		if (anInt537 > i_223_)
		{
			final int i_230_ = -i_223_ + anInt537;
			i_223_ = anInt537;
			i_226_ += i_230_ * i_224_;
			i_227_ += i_230_ * this.menuDefaultHeight;
			i_225_ -= i_230_;
		}
		if (anInt517 > i_222_)
		{
			final int i_231_ = -i_222_ + anInt517;
			i_222_ = anInt517;
			i_227_ += i_231_;
			i_228_ += i_231_;
			i_229_ += i_231_;
			i_226_ += i_231_;
			i_224_ -= i_231_;
		}
		if ((i_223_ - -i_225_) >= anInt536)
		{
			i_225_ -= (i_223_ + -anInt536) - (-i_225_ - 1);
		}
		if ((i_224_ + i_222_) >= anInt567)
		{
			final int i_232_ = i_224_ + (i_222_ - -1) + -anInt567;
			i_228_ += i_232_;
			i_224_ -= i_232_;
			i_229_ += i_232_;
		}
		if ((i_224_ > 0) && (i_225_ > 0))
		{
			if (bool)
			{
				method359(i_227_, this.imagePixelArray, i_226_, i_224_, i_225_, i_229_, i_228_, i_218_, is);
			}
			else
			{
				method317(i_225_, i_229_, i_226_, i_224_, is, this.imagePixelArray, i_228_, i_227_, i_218_);
			}
		}
	}

	void method327(int i, int i_233_, int i_234_, final int i_235_, final int i_236_, final int i_237_, int i_238_)
	{
		if (anInt537 > i_233_)
		{
			i_238_ -= -i_233_ + anInt537;
			i_233_ = anInt537;
		}
		if (i < anInt517)
		{
			i_234_ -= -i + anInt517;
			i = anInt517;
		}
		if (anInt536 < (i_233_ + i_238_))
		{
			i_238_ = -i_233_ + anInt536;
		}
		if (i_236_ < 68)
		{
			this.aBool27 = false;
		}
		if (anInt567 < (i_234_ + i))
		{
			i_234_ = anInt567 - i;
		}
		final int i_239_ = 256 - i_235_;
		final int i_240_ = i_235_ * ((0xff1623 & i_237_) >> 16);
		final int i_241_ = (0xff & (i_237_ >> 8)) * i_235_;
		final int i_242_ = (0xff & i_237_) * i_235_;
		int i_243_ = -i_234_ + this.menuDefaultHeight;
		int i_244_ = 1;
		if (this.aBool28 != false)
		{
			i_244_ = 2;
			i_243_ += this.menuDefaultHeight;
			if ((i_233_ & 0x1) != 0)
			{
				i_233_++;
				i_238_--;
			}
		}
		int i_245_ = (i_233_ * this.menuDefaultHeight) + i;
		for (int i_246_ = 0; i_246_ < i_238_; i_246_ += i_244_)
		{
			for (int i_247_ = -i_234_; 0 > i_247_; i_247_++)
			{
				final int i_248_ = ((0xff & (this.imagePixelArray[i_245_] >> 16)) * i_239_);
				final int i_249_ = i_239_ * ((this.imagePixelArray[i_245_] & 0xff4e) >> 8);
				final int i_250_ = (this.imagePixelArray[i_245_] & 0xff) * i_239_;
				final int i_251_ = (((i_242_ - -i_250_) >> 8) + (((i_241_ - -i_249_) >> 8) << 8)
				        + (((i_240_ - -i_248_) >> 8) << 16));
				this.imagePixelArray[i_245_++] = i_251_;
			}
			i_245_ += i_243_;
		}
	}

	int method328(final String string, final int i, final int i_252_)
	{
		if (i >= -99)
		{
			method337(null, 127, 110, 66, -102, -115);
		}
		int i_253_ = 0;
		final byte[] is = PacketConstruction.aByteArrayArray8[i_252_];
		for (int i_254_ = 0; string.length() > i_254_; i_254_++)
		{
			if ((string.charAt(i_254_) == '@') && (string.length() > (i_254_ + 4))
			        && (string.charAt(i_254_ - -4) == '@'))
			{
				i_254_ += 4;
			}
			else if ((string.charAt(i_254_) != '~') || (string.length() <= (i_254_ + 4))
			        || (string.charAt(i_254_ + 4) != '~'))
			{
				char c = string.charAt(i_254_);
				if ((0 > c) || (c >= charIndexes.length))
				{
					c = ' ';
				}
				i_253_ += is[charIndexes[c] + 7];
			}
			else
			{
				i_254_ += 4;
			}
		}
		return i_253_;
	}

	void method329(final int i, final int i_255_, final int i_256_, final int i_257_, final int i_258_,
	        final byte i_259_)
	{
		final int i_260_ = -i_258_ + 256;
		final int i_261_ = i_258_ * ((0xff884f & i_256_) >> 16);
		final int i_262_ = i_258_ * ((i_256_ & 0xffc1) >> 8);
		final int i_263_ = i_258_ * (i_256_ & 0xff);
		if (i_259_ == 33)
		{
			int i_264_ = -i_255_ + i_257_;
			if (i_264_ < 0)
			{
				i_264_ = 0;
			}
			int i_265_ = i_255_ + i_257_;
			if (this.menuDefaultWidth <= i_265_)
			{
				i_265_ = this.menuDefaultWidth + -1;
			}
			int i_266_ = 1;
			if (this.aBool28 == true)
			{
				i_266_ = 2;
				if ((i_264_ & 0x1) != 0)
				{
					i_264_++;
				}
			}
			for (int i_267_ = i_264_; i_265_ >= i_267_; i_267_ += i_266_)
			{
				final int i_268_ = -i_257_ + i_267_;
				final int i_269_ = (int) Math.sqrt((i_255_ * i_255_) + -(i_268_ * i_268_));
				int i_270_ = -i_269_ + i;
				if (0 > i_270_)
				{
					i_270_ = 0;
				}
				int i_271_ = i_269_ + i;
				if (i_271_ >= this.menuDefaultHeight)
				{
					i_271_ = this.menuDefaultHeight - 1;
				}
				int i_272_ = i_270_ - -(i_267_ * this.menuDefaultHeight);
				for (int i_273_ = i_270_; i_271_ >= i_273_; i_273_++)
				{
					final int i_274_ = ((0xff & (this.imagePixelArray[i_272_] >> 16)) * i_260_);
					final int i_275_ = (i_260_ * (0xff & this.imagePixelArray[i_272_]));
					final int i_276_ = (i_260_ * ((this.imagePixelArray[i_272_] & 0xff23) >> 8));
					final int i_277_ = ((((i_276_ + i_262_) >> 8) << 8) + (((i_274_ + i_261_) >> 8) << 16)
					        + ((i_275_ + i_263_) >> 8));
					this.imagePixelArray[i_272_++] = i_277_;
				}
			}
		}
	}

	private void method330(final int i, final int[] is, final int i_278_, int i_279_, final int i_280_, int i_281_,
	        int i_282_, final int[] is_283_, final int i_284_, final int i_285_, int i_286_)
	{
		final int i_287_ = -(i_282_ >> 2);
		i_282_ = -(i_282_ & 0x3);
		int i_288_ = -i_280_;
		if (i_285_ <= -62)
		{
			for (/**/; 0 > i_288_; i_288_ += i)
			{
				for (int i_289_ = i_287_; 0 > i_289_; i_289_++)
				{
					i_279_ = is[i_286_++];
					if (i_279_ == 0)
					{
						i_281_++;
					}
					else
					{
						is_283_[i_281_++] = i_279_;
					}
					i_279_ = is[i_286_++];
					if (i_279_ != 0)
					{
						is_283_[i_281_++] = i_279_;
					}
					else
					{
						i_281_++;
					}
					i_279_ = is[i_286_++];
					if (i_279_ != 0)
					{
						is_283_[i_281_++] = i_279_;
					}
					else
					{
						i_281_++;
					}
					i_279_ = is[i_286_++];
					if (i_279_ != 0)
					{
						is_283_[i_281_++] = i_279_;
					}
					else
					{
						i_281_++;
					}
				}
				for (int i_290_ = i_282_; i_290_ < 0; i_290_++)
				{
					i_279_ = is[i_286_++];
					if (i_279_ != 0)
					{
						is_283_[i_281_++] = i_279_;
					}
					else
					{
						i_281_++;
					}
				}
				i_281_ = i_284_ + i_281_;
				i_286_ = i_278_ + i_286_;
			}
		}
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer imageconsumer)
	{
		System.out.println("TDLR");
	}

	void method331()
	{
		final int i_291_ = this.menuDefaultHeight * this.menuDefaultWidth;
		if (this.aBool28 == false)
		{
			for (int i_292_ = 0; i_292_ < i_291_; i_292_++)
			{
				this.imagePixelArray[i_292_] = 0;
			}
		}
		else
		{
			int i_293_ = 0;
			for (int i_294_ = -this.menuDefaultWidth; i_294_ < 0; i_294_ += 2)
			{
				for (int i_295_ = -this.menuDefaultHeight; 0 > i_295_; i_295_++)
				{
					this.imagePixelArray[i_293_++] = 0;
				}
				i_293_ += this.menuDefaultHeight;
			}
		}
	}

	private synchronized void completePixels()
	{
		if (anImageConsumer2 != null)
		{
			anImageConsumer2.setPixels(0, 0, this.menuDefaultHeight, this.menuDefaultWidth, aColorModel2, this.imagePixelArray, 0,
			        this.menuDefaultHeight);
			anImageConsumer2.imageComplete(2);
		}
	}

	void method333(int i, final int i_297_, final int i_298_, final int i_299_, final String string, final int i_300_,
	        final boolean bool)
	{
		try
		{
			int i_301_ = 0;
			final byte[] is = PacketConstruction.aByteArrayArray8[i_298_];
			int i_302_ = 0;
			int i_303_ = 0;
			for (int i_304_ = 0; i_304_ < string.length(); i_304_++)
			{
				if (('@' == string.charAt(i_304_)) && (string.length() > (i_304_ + 4))
				        && ('@' == string.charAt(4 + i_304_)))
				{
					i_304_ += 4;
				}
				else if ((string.charAt(i_304_) != '~') || ((i_304_ + 4) >= string.length())
				        || ('~' != string.charAt(i_304_ - -4)))
				{
					int i_305_ = string.charAt(i_304_);
					if ((0 > i_305_) || (charIndexes.length <= i_305_))
					{
						i_305_ = 32;
					}
					i_301_ += is[charIndexes[i_305_] + 7];
				}
				else
				{
					i_304_ += 4;
				}
				if (' ' == string.charAt(i_304_))
				{
					i_303_ = i_304_;
				}
				if (('%' == string.charAt(i_304_)) && bool)
				{
					i_301_ = 1000;
					i_303_ = i_304_;
				}
				if (i_297_ < i_301_)
				{
					if (i_303_ <= i_302_)
					{
						i_303_ = i_304_;
					}
					method305(i_300_, i, i_298_, string.substring(i_302_, i_303_), 0, i_299_);
					i_301_ = 0;
					i += method315(i_298_);
					i_302_ = i_304_ = i_303_ + 1;
				}
			}
			if (0 < i_301_)
			{
				method305(i_300_, i, i_298_, string.substring(i_302_), 0, i_299_);
			}
		}
		catch (final Exception exception)
		{
			System.out.println(new StringBuilder().append("centrepara: ").append(exception).toString());
			exception.printStackTrace();
		}
	}

	private void method334(int i, final int[] is, int i_306_, final int i_308_, int i_309_, final int i_311_,
	        final int i_312_, final int i_313_, int i_314_)
	{
		for (int i_315_ = i_311_; 0 > i_315_; i_315_++)
		{
			i_309_ = is[(i_308_ * (i_306_ >> 17)) + (i_314_ >> 17)];
			i_306_ += i_313_;
			i_314_ += i_312_;
			if (i_309_ == 0)
			{
				i++;
			}
			else
			{
				this.imagePixelArray[i++] = i_309_;
			}
		}
	}

	@Override
	public boolean imageUpdate(final Image image, final int i, final int i_316_, final int i_317_, final int i_318_,
	        final int i_319_)
	{
		return true;
	}

	void method335(final int i, final int i_320_, final int i_321_, final String string, final int i_322_,
	        final int i_323_)
	{
		if (i_320_ != 255)
		{
			method350(-99, null, null, -42);
		}
		method305(i_323_, i_322_, i_321_, string, 0, i);
	}

	private void method336(final int i, int i_324_, int i_325_, final int[] is, final int i_326_, final int i_327_,
	        final int[] is_328_, final int i_329_, int i_330_, final int i_331_, final int i_333_)
	{
		final int i_334_ = -i_329_ + 256;
		for (int i_335_ = -i_326_; i_335_ < 0; i_335_ = i_331_ + i_335_)
		{
			for (int i_336_ = -i; 0 > i_336_; i_336_++)
			{
				i_324_ = is[i_325_++];
				if (i_324_ != 0)
				{
					final int i_337_ = is_328_[i_330_];
					is_328_[i_330_++] = (Class52
					        .method378(((Class52.method378(16711935, i_324_) * i_329_)
					                + (Class52.method378(16711935, i_337_) * i_334_)), -16711936)
					        - -Class52.method378(((Class52.method378(i_337_, 65280) * i_334_)
					                + (Class52.method378(i_324_, 65280) * i_329_)), 16711680)) >> 8;
				}
				else
				{
					i_330_++;
				}
			}
			i_330_ += i_333_;
			i_325_ += i_327_;
		}
	}

	private void method337(final String string, final int i, final int i_338_, final int i_340_, final int i_341_,
	        final int i_342_)
	{
		method361(string, i_341_, i_338_, i_340_, -method328(string, -120, i_338_) + i, i_342_);
	}

	void method338(final int i, int i_343_, int i_344_)
	{
		if (aBoolArray9[i])
		{
			i_343_ += anIntArray120[i];
			i_344_ += anIntArray128[i];
		}
		int i_346_ = i_344_ + (i_343_ * this.menuDefaultHeight);
		int i_347_ = 0;
		int i_348_ = this.anIntArray123[i];
		int i_349_ = this.anIntArray118[i];
		int i_350_ = -i_349_ + this.menuDefaultHeight;
		if (i_343_ < anInt537)
		{
			final int i_351_ = -i_343_ + anInt537;
			i_348_ -= i_351_;
			i_346_ += i_351_ * this.menuDefaultHeight;
			i_343_ = anInt537;
			i_347_ += i_349_ * i_351_;
		}
		int i_352_ = 0;
		if ((i_348_ + i_343_) >= anInt536)
		{
			i_348_ -= i_348_ + (i_343_ - anInt536) + 1;
		}
		if (anInt517 > i_344_)
		{
			final int i_353_ = anInt517 - i_344_;
			i_349_ -= i_353_;
			i_350_ += i_353_;
			i_344_ = anInt517;
			i_352_ += i_353_;
			i_346_ += i_353_;
			i_347_ += i_353_;
		}
		if ((i_344_ + i_349_) >= anInt567)
		{
			final int i_354_ = ((i_344_ + i_349_) - anInt567) + 1;
			i_349_ -= i_354_;
			i_352_ += i_354_;
			i_350_ += i_354_;
		}
		if ((i_349_ > 0) && (0 < i_348_))
		{
			int i_355_ = 1;
			if (this.aBool28 != false)
			{
				i_350_ += this.menuDefaultHeight;
				i_352_ += this.anIntArray118[i];
				i_355_ = 2;
				if ((i_343_ & 0x1) != 0)
				{
					i_346_ += this.menuDefaultHeight;
					i_348_--;
				}
			}
			if (this.anIntArrayArray20[i] != null)
			{
				method330(i_355_, this.anIntArrayArray20[i], i_352_, 0, i_348_, i_346_, i_349_, this.imagePixelArray,
				        i_350_, -94, i_347_);
			}
			else
			{
				method344(this.imagePixelArray, this.aByteArrayArray13[i], i_348_, i_350_, i_349_, this.anIntArrayArray19[i],
				        i_352_, i_355_, i_347_, i_346_);
			}
		}
	}

	void method339(final int i)
	{
		anInt522 = i;
	}

	private void method340(int i, final int i_357_, final int i_358_, final int[] is, int i_359_, int i_361_,
	        final int i_362_, int i_363_, final int i_364_, final int i_365_, final int i_366_, final int[] is_367_,
	        final int i_368_)
	{
		try
		{
			final int i_369_ = i_363_;
			for (int i_370_ = -i_358_; 0 > i_370_; i_370_ += i_357_)
			{
				final int i_371_ = i_365_ * (i_359_ >> 16);
				for (int i_372_ = -i_362_; 0 > i_372_; i_372_++)
				{
					i = is[i_371_ + (i_363_ >> 16)];
					if (i != 0)
					{
						is_367_[i_361_++] = i;
					}
					else
					{
						i_361_++;
					}
					i_363_ += i_366_;
				}
				i_359_ += i_368_;
				i_363_ = i_369_;
				i_361_ = i_364_ + i_361_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in plot_scale");
		}
	}

	void method341(int i, final byte i_373_, final int i_374_, int i_375_, final int i_376_)
	{
		if ((i_374_ >= anInt537) && (i_374_ < anInt536))
		{
			if (anInt517 > i_375_)
			{
				i -= anInt517 - i_375_;
				i_375_ = anInt517;
			}
			if (anInt567 < (i_375_ + i))
			{
				i = -i_375_ + anInt567;
			}
			if (0 < i)
			{
				final int i_377_ = (i_374_ * this.menuDefaultHeight) + i_375_;
				for (int i_378_ = 0; i_378_ < i; i_378_++)
				{
					this.imagePixelArray[i_377_ + i_378_] = i_376_;
				}
				if (i_373_ > -6)
				{
					drawEntity(-125, 49, 75, -48, 125, 93, 26, -53);
				}
			}
		}
	}

	static boolean method342(final Class38 class38)
	{
		return ((Class47.aClass38_6 == class38) || (Class27.aClass38_4 == class38)
		        || (IOException_Sub1.aClass38_8 == class38) || (Class12.aClass38_2 == class38)
		        || (Class10.aClass38_1 == class38));
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer imageconsumer)
	{
		anImageConsumer2 = imageconsumer;
		imageconsumer.setDimensions(this.menuDefaultHeight, this.menuDefaultWidth);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(aColorModel2);
		imageconsumer.setHints(14);
	}

	void method343(final int i)
	{
		final int i_379_ = this.menuDefaultHeight * this.menuDefaultWidth;
		for (int i_380_ = 0; i_379_ > i_380_; i_380_++)
		{
			final int i_381_ = 0xffffff & this.imagePixelArray[i_380_];
			this.imagePixelArray[i_380_] = ((Class52.method378(15790327, i_381_) >>> 4)
			        + (Class52.method378(i_381_ >>> 2, 1077886783) + Class52.method378(-2139127937, i_381_ >>> 1))
			        + Class52.method378(i_381_ >>> 3, 1612652319));
		}
		if (i != -1248297852)
		{
			this.anIntArray123 = null;
		}
	}

	private void method344(final int[] is, final byte[] is_382_, final int i_383_, final int i_384_, int i_385_,
	        final int[] is_386_, final int i_387_, final int i_388_, int i_389_, int i_390_)
	{
		final int i_391_ = -(i_385_ >> 2);
		i_385_ = -(i_385_ & 0x3);
		for (int i_392_ = -i_383_; 0 > i_392_; i_392_ += i_388_)
		{
			for (int i_393_ = i_391_; i_393_ < 0; i_393_++)
			{
				byte i_394_ = is_382_[i_389_++];
				if (i_394_ == 0)
				{
					i_390_++;
				}
				else
				{
					is[i_390_++] = is_386_[Class52.method378(255, i_394_)];
				}
				i_394_ = is_382_[i_389_++];
				if (i_394_ != 0)
				{
					is[i_390_++] = is_386_[Class52.method378(255, i_394_)];
				}
				else
				{
					i_390_++;
				}
				i_394_ = is_382_[i_389_++];
				if (i_394_ != 0)
				{
					is[i_390_++] = is_386_[Class52.method378(255, i_394_)];
				}
				else
				{
					i_390_++;
				}
				i_394_ = is_382_[i_389_++];
				if (i_394_ == 0)
				{
					i_390_++;
				}
				else
				{
					is[i_390_++] = is_386_[Class52.method378(255, i_394_)];
				}
			}
			for (int i_395_ = i_385_; i_395_ < 0; i_395_++)
			{
				final byte i_396_ = is_382_[i_389_++];
				if (i_396_ != 0)
				{
					is[i_390_++] = is_386_[Class52.method378(i_396_, 255)];
				}
				else
				{
					i_390_++;
				}
			}
			i_389_ += i_387_;
			i_390_ += i_384_;
		}
	}

	private void method345(final int i_397_, final int[] is, final int i_398_, final int i_399_, final int i_400_,
	        final int i_401_, final int i_402_, int i_403_, int i_404_, final byte[] is_405_, final int[] is_406_)
	{
		final int i_407_ = -i_400_ + 256;
		for (int i_408_ = -i_402_; i_408_ < 0; i_408_ = i_399_ + i_408_)
		{
			for (int i_409_ = -i_397_; 0 > i_409_; i_409_++)
			{
				int i_410_ = is_405_[i_404_++];
				if (i_410_ != 0)
				{
					i_410_ = is[0xff & i_410_];
					final int i_411_ = is_406_[i_403_];
					is_406_[i_403_++] = (((Class52.method378(((i_400_ * Class52.method378(i_410_, 65280))
					        - -(i_407_ * Class52.method378(65280, i_411_))), 16711680))
					        + (Class52.method378(-16711936, ((Class52.method378(i_411_, 16711935) * i_407_)
					                + (i_400_ * Class52.method378(i_410_, 16711935)))))) >> 8);
				}
				else
				{
					i_403_++;
				}
			}
			i_404_ += i_398_;
			i_403_ = i_401_ + i_403_;
		}
	}

	private void method346(final int i, final int i_412_, int i_413_, final int i_414_, int i_415_, final int[] is,
	        final int i_416_, final int i_417_, int i_418_, final int[] is_420_, final int i_421_, final int i_422_,
	        final int i_423_, int i_424_)
	{
		final int i_425_ = (i_412_ >> 16) & 0xff;
		final int i_426_ = (i_412_ >> 8) & 0xff;
		final int i_427_ = i_412_ & 0xff;
		try
		{
			final int i_428_ = i_415_;
			for (int i_429_ = -i_422_; 0 > i_429_; i_429_ += i_423_)
			{
				final int i_430_ = (i_418_ >> 16) * i;
				for (int i_431_ = -i_421_; 0 > i_431_; i_431_++)
				{
					i_424_ = is_420_[(i_415_ >> 16) - -i_430_];
					i_415_ += i_417_;
					if (i_424_ == 0)
					{
						i_413_++;
					}
					else
					{
						final int i_432_ = (0xffd9f7 & i_424_) >> 16;
						final int i_433_ = (i_424_ >> 8) & 0xff;
						final int i_434_ = i_424_ & 0xff;
						if ((i_432_ != i_433_) || (i_433_ != i_434_))
						{
							is[i_413_++] = i_424_;
						}
						else
						{
							is[i_413_++] = ((((i_432_ * i_425_) >> 8) << 16) + ((i_427_ * i_434_) >> 8)
							        + (((i_426_ * i_433_) >> 8) << 8));
						}
					}
				}
				i_418_ = i_416_ + i_418_;
				i_413_ += i_414_;
				i_415_ = i_428_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in plot_scale");
		}
	}

	void spriteClipUnknown(int i_435_, int i_436_, int i_437_, int i_438_, final int i_439_, final int i_440_)
	{
		try
		{
			final int i_441_ = this.anIntArray118[i_439_];
			final int i_442_ = this.anIntArray123[i_439_];
			int i_443_ = 0;
			int i_444_ = 0;
			int i_445_ = (i_441_ << 16) / i_438_;
			int i_446_ = (i_442_ << 16) / i_437_;
			if (aBoolArray9[i_439_])
			{
				final int i_447_ = this.anIntArray125[i_439_];
				final int i_448_ = this.anIntArray122[i_439_];
				if ((i_447_ == 0) || (i_448_ == 0))
				{
					return;
				}
				i_436_ += (i_447_ + (i_438_ * anIntArray128[i_439_]) + -1) / i_447_;
				i_445_ = (i_447_ << 16) / i_438_;
				i_435_ += (i_448_ + (anIntArray120[i_439_] * i_437_) + -1) / i_448_;
				if (((i_438_ * anIntArray128[i_439_]) % i_447_) != 0)
				{
					i_443_ = ((-((i_438_ * anIntArray128[i_439_]) % i_447_) + i_447_) << 16) / i_438_;
				}
				if (((anIntArray120[i_439_] * i_437_) % i_448_) != 0)
				{
					i_444_ = ((i_448_ + -((anIntArray120[i_439_] * i_437_) % i_448_)) << 16) / i_437_;
				}
				i_446_ = (i_448_ << 16) / i_437_;
				i_437_ = (i_437_ * (this.anIntArray123[i_439_] + -(i_444_ >> 16))) / i_448_;
				i_438_ = (i_438_ * (this.anIntArray118[i_439_] + -(i_443_ >> 16))) / i_447_;
			}
			int i_449_ = i_436_ + (i_435_ * this.menuDefaultHeight);
			int i_450_ = -i_438_ + this.menuDefaultHeight;
			if (anInt537 > i_435_)
			{
				final int i_451_ = -i_435_ + anInt537;
				i_437_ -= i_451_;
				i_444_ += i_451_ * i_446_;
				i_449_ += i_451_ * this.menuDefaultHeight;
				i_435_ = 0;
			}
			if ((i_435_ + i_437_) >= anInt536)
			{
				i_437_ -= i_435_ + i_437_ + -anInt536 + 1;
			}
			if (i_436_ < anInt517)
			{
				final int i_452_ = anInt517 - i_436_;
				i_436_ = 0;
				i_449_ += i_452_;
				i_438_ -= i_452_;
				i_450_ += i_452_;
				i_443_ += i_452_ * i_445_;
			}
			if ((i_436_ + i_438_) >= anInt567)
			{
				final int i_453_ = i_436_ + i_438_ + -anInt567 + 1;
				i_450_ += i_453_;
				i_438_ -= i_453_;
			}
			int i_454_ = 1;
			if (true != !this.aBool28)
			{
				i_446_ += i_446_;
				if ((i_435_ & 0x1) != 0)
				{
					i_449_ += this.menuDefaultHeight;
					i_437_--;
				}
				i_454_ = 2;
				i_450_ += this.menuDefaultHeight;
			}
			method346(i_441_, i_440_, i_449_, i_450_, i_443_, this.imagePixelArray, i_446_, i_445_, i_444_, this.anIntArrayArray20[i_439_],
			        i_438_, i_437_, i_454_, 0);
		}
		catch (final Exception exception)
		{
			System.out.println("error in sprite clipping routine");
		}
	}

	void method348(final boolean bool, int i, final int i_455_, int i_456_, int i_457_, int i_458_, final int i_459_,
	        final int i_460_, int i_461_, int i_462_)
	{
		try
		{
			if (i_461_ == 0)
			{
				i_461_ = 16777215;
			}
			if (i == 0)
			{
				i = 16777215;
			}
			final int i_463_ = this.anIntArray118[i_460_];
			final int i_464_ = this.anIntArray123[i_460_];
			int i_465_ = 0;
			int i_466_ = 0;
			int i_467_ = i_459_ << 16;
			int i_468_ = (i_463_ << 16) / i_458_;
			if (i_455_ > -63)
			{
				method312(62, 9, 19, -127, -25, -117);
			}
			int i_469_ = (i_464_ << 16) / i_456_;
			final int i_470_ = -(i_459_ << 16) / i_456_;
			if (aBoolArray9[i_460_])
			{
				final int i_471_ = this.anIntArray125[i_460_];
				final int i_472_ = this.anIntArray122[i_460_];
				if ((i_471_ == 0) || (i_472_ == 0))
				{
					return;
				}
				i_469_ = (i_472_ << 16) / i_456_;
				i_468_ = (i_471_ << 16) / i_458_;
				int i_473_ = anIntArray128[i_460_];
				if (bool)
				{
					i_473_ = (-i_473_ + i_471_ + -this.anIntArray118[i_460_]);
				}
				final int i_474_ = anIntArray120[i_460_];
				i_462_ = (((i_473_ * i_458_) + i_471_ + -1) / i_471_) + i_462_;
				final int i_475_ = (i_472_ + (i_474_ * i_456_) + -1) / i_472_;
				i_467_ += i_470_ * i_475_;
				i_457_ += i_475_;
				if (((i_474_ * i_456_) % i_472_) != 0)
				{
					i_466_ = (((i_472_ + -((i_474_ * i_456_) % i_472_)) << 16) / i_456_);
				}
				if (((i_473_ * i_458_) % i_471_) != 0)
				{
					i_465_ = (((i_471_ + -((i_473_ * i_458_) % i_471_)) << 16) / i_458_);
				}
				i_456_ = (((this.anIntArray123[i_460_] << 16) + -i_466_ + i_469_) - 1) / i_469_;
				i_458_ = ((this.anIntArray118[i_460_] << 16) + -i_465_ + i_468_ + -1) / i_468_;
			}
			i_467_ = (i_462_ << 16) + i_467_;
			int i_476_ = i_457_ * this.menuDefaultHeight;
			if (anInt537 > i_457_)
			{
				final int i_477_ = anInt537 - i_457_;
				i_476_ += i_477_ * this.menuDefaultHeight;
				i_457_ = anInt537;
				i_466_ += i_469_ * i_477_;
				i_467_ += i_477_ * i_470_;
				i_456_ -= i_477_;
			}
			if (anInt536 <= (i_457_ + i_456_))
			{
				i_456_ -= i_457_ - (-i_456_ + anInt536 + -1);
			}
			int i_478_ = (i_476_ / this.menuDefaultHeight) & 0x1;
			if (!this.aBool28)
			{
				i_478_ = 2;
			}
			if (i == 16777215)
			{
				if (this.anIntArrayArray20[i_460_] != null)
				{
					if (!bool)
					{
						spritePlotTransparent(i_458_, i_470_, i_476_, i_463_, i_468_, this.anIntArrayArray20[i_460_], i_465_,
						        (byte) 84, i_469_, 0, this.imagePixelArray, i_466_, i_467_, i_456_, i_478_, i_461_);
					}
					else
					{
						spritePlotTransparent(i_458_, i_470_, i_476_, i_463_, -i_468_, this.anIntArrayArray20[i_460_],
						        ((this.anIntArray118[i_460_] << 16) + -i_465_) - 1, (byte) 84, i_469_, 0,
						        this.imagePixelArray, i_466_, i_467_, i_456_, i_478_, i_461_);
					}
				}
				else if (!bool)
				{
					method314(i_461_, i_458_, i_467_, i_469_, i_468_, i_456_, i_465_, 0, i_463_, i_466_, i_470_,
					        this.anIntArrayArray19[i_460_], this.imagePixelArray, i_476_, i_478_, this.aByteArrayArray13[i_460_]);
				}
				else
				{
					method314(i_461_, i_458_, i_467_, i_469_, -i_468_, i_456_,
					        (((this.anIntArray118[i_460_] << 16) + -i_465_) - 1), 0, i_463_, i_466_, i_470_,
					        this.anIntArrayArray19[i_460_], this.imagePixelArray, i_476_, i_478_, this.aByteArrayArray13[i_460_]);
				}
			}
			else if (this.anIntArrayArray20[i_460_] == null)
			{
				if (bool)
				{
					method352(i_458_, 0, i_466_, this.anIntArrayArray19[i_460_], i_476_, this.aByteArrayArray13[i_460_],
					        -i_468_, i, i_470_, i_463_, i_461_, i_478_, this.imagePixelArray, i_456_, i_467_, i_469_,
					        (((this.anIntArray118[i_460_] << 16) + -i_465_) - 1));
				}
				else
				{
					method352(i_458_, 0, i_466_, this.anIntArrayArray19[i_460_], i_476_, this.aByteArrayArray13[i_460_],
					        i_468_, i, i_470_, i_463_, i_461_, i_478_, this.imagePixelArray, i_456_, i_467_, i_469_,
					        i_465_);
				}
			}
			else if (bool)
			{
				spritePlotTransparent(-122, i_470_, i_466_, i_456_, i_461_, i_458_, i_478_, -i_468_, i_467_, this.imagePixelArray, i,
				        i_469_, i_476_, i_463_, 0, (((this.anIntArray118[i_460_] << 16) + -i_465_) - 1),
				        this.anIntArrayArray20[i_460_]);
			}
			else
			{
				spritePlotTransparent(-44, i_470_, i_466_, i_456_, i_461_, i_458_, i_478_, i_468_, i_467_, this.imagePixelArray, i,
				        i_469_, i_476_, i_463_, 0, i_465_, this.anIntArrayArray20[i_460_]);
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in sprite clipping routine");
		}
	}

	@SuppressWarnings("unused") // NOTE: Overridden by GameImageMiddleMan.
	void drawEntity(final int i, final int i_479_, final int i_480_, final int i_481_, final int i_482_,
	        final int i_483_, final int i_484_, final int i_485_)
	{
		if (i_485_ == -1)
		{
			spriteClip1(i, i_484_, i_482_, i_481_, i_479_);
		}
	}

	void method350(final int i, final byte[] is, final byte[] is_487_, final int i_488_)
	{
		int i_489_ = Class10.method84(is_487_, 0);
		final int i_490_ = Class10.method84(is, i_489_);
		i_489_ += 2;
		final int i_491_ = Class10.method84(is, i_489_);
		i_489_ += 2;
		final int i_492_ = is[i_489_++] & 0xff;
		final int[] is_493_ = new int[i_492_];
		is_493_[0] = 16711935;
		for (int i_494_ = 0; i_494_ < (i_492_ + -1); i_494_++)
		{
			is_493_[i_494_ - -1] = (Class52.method378(255, is[2 + i_489_])
			        + Class52.method378(65280, is[1 + i_489_] << 8) + (Class52.method378(255, is[i_489_]) << 16));
			i_489_ += 3;
		}
		int i_496_ = 2;
		for (int i_497_ = i; (i - -i_488_) > i_497_; i_497_++)
		{
			anIntArray128[i_497_] = Class52.method378(255, is[i_489_++]);
			anIntArray120[i_497_] = Class52.method378(is[i_489_++], 255);
			this.anIntArray118[i_497_] = Class10.method84(is, i_489_);
			i_489_ += 2;
			this.anIntArray123[i_497_] = Class10.method84(is, i_489_);
			i_489_ += 2;
			final int i_498_ = is[i_489_++] & 0xff;
			final int i_499_ = (this.anIntArray118[i_497_] * this.anIntArray123[i_497_]);
			this.aByteArrayArray13[i_497_] = new byte[i_499_];
			this.anIntArrayArray19[i_497_] = is_493_;
			this.anIntArray125[i_497_] = i_490_;
			this.anIntArray122[i_497_] = i_491_;
			this.anIntArrayArray20[i_497_] = null;
			aBoolArray9[i_497_] = false;
			if ((anIntArray128[i_497_] != 0) || (anIntArray120[i_497_] != 0))
			{
				aBoolArray9[i_497_] = true;
			}
			if (i_498_ == 0)
			{
				for (int i_500_ = 0; i_500_ < i_499_; i_500_++)
				{
					this.aByteArrayArray13[i_497_][i_500_] = is_487_[i_496_++];
					if (this.aByteArrayArray13[i_497_][i_500_] == 0)
					{
						aBoolArray9[i_497_] = true;
					}
				}
			}
			else if (i_498_ == 1)
			{
				for (int i_501_ = 0; this.anIntArray118[i_497_] > i_501_; i_501_++)
				{
					for (int i_502_ = 0; this.anIntArray123[i_497_] > i_502_; i_502_++)
					{
						this.aByteArrayArray13[i_497_][((i_502_ * this.anIntArray118[i_497_])
						        + i_501_)] = is_487_[i_496_++];
						if ((this.aByteArrayArray13[i_497_][i_501_ + (i_502_ * (this.anIntArray118[i_497_]))]) == 0)
						{
							aBoolArray9[i_497_] = true;
						}
					}
				}
			}
		}
	}

	void method351(final int i, final int i_503_, final int i_504_, final int i_505_, int i_506_)
	{
		final int i_508_ = this.menuDefaultHeight;
		final int i_509_ = this.menuDefaultWidth;
		if (anIntArray117 == null)
		{
			anIntArray117 = new int[512];
			for (int i_510_ = 0; i_510_ < 256; i_510_++)
			{
				anIntArray117[i_510_] = (int) (Math.sin(i_510_ * 0.02454369) * 32768.0);
				anIntArray117[i_510_ + 256] = (int) (Math.cos(i_510_ * 0.02454369) * 32768.0);
			}
		}
		int i_511_ = -this.anIntArray125[i_504_] / 2;
		int i_512_ = -this.anIntArray122[i_504_] / 2;
		if (aBoolArray9[i_504_])
		{
			i_511_ = anIntArray128[i_504_] + i_511_;
			i_512_ = anIntArray120[i_504_] + i_512_;
		}
		int i_513_ = this.anIntArray118[i_504_] + i_511_;
		int i_514_ = this.anIntArray123[i_504_] + i_512_;
		int i_515_ = i_513_;
		int i_516_ = i_512_;
		int i_517_ = i_511_;
		i_506_ &= 0xff;
		int i_518_ = i_514_;
		final int i_519_ = anIntArray117[i_506_] * i_503_;
		final int i_520_ = i_503_ * anIntArray117[i_506_ + 256];
		final int i_521_ = (((i_519_ * i_512_) + (i_520_ * i_511_)) >> 22) + i;
		final int i_522_ = (((i_520_ * i_512_) - (i_511_ * i_519_)) >> 22) + i_505_;
		final int i_523_ = (((i_516_ * i_519_) - -(i_515_ * i_520_)) >> 22) + i;
		final int i_524_ = i_505_ - -(((i_516_ * i_520_) - (i_519_ * i_515_)) >> 22);
		final int i_525_ = (((i_520_ * i_513_) + (i_519_ * i_514_)) >> 22) + i;
		final int i_526_ = (((i_520_ * i_514_) + -(i_513_ * i_519_)) >> 22) + i_505_;
		final int i_527_ = i - -(((i_517_ * i_520_) + (i_518_ * i_519_)) >> 22);
		if ((i_503_ != 192) || ((0x3f & Class52.anInt590) != (i_506_ & 0x3f)))
		{
			if (i_503_ != 128)
			{
				Class3.anInt7++;
			}
			else
			{
				Class52.anInt590 = i_506_;
			}
		}
		else
		{
			anInt569++;
		}
		final int i_528_ = (((i_520_ * i_518_) + -(i_517_ * i_519_)) >> 22) + i_505_;
		int i_529_ = i_522_;
		int i_530_ = i_522_;
		if (i_524_ < i_529_)
		{
			i_529_ = i_524_;
		}
		else if (i_530_ < i_524_)
		{
			i_530_ = i_524_;
		}
		if (i_529_ <= i_526_)
		{
			if (i_530_ < i_526_)
			{
				i_530_ = i_526_;
			}
		}
		else
		{
			i_529_ = i_526_;
		}
		if (i_528_ >= i_529_)
		{
			if (i_530_ < i_528_)
			{
				i_530_ = i_528_;
			}
		}
		else
		{
			i_529_ = i_528_;
		}
		if (i_530_ > anInt536)
		{
			i_530_ = anInt536;
		}
		if (anInt537 > i_529_)
		{
			i_529_ = anInt537;
		}
		if ((anIntArray116 == null) || (anIntArray116.length != (i_509_ + 1)))
		{
			anIntArray124 = new int[i_509_ + 1];
			anIntArray121 = new int[i_509_ + 1];
			anIntArray131 = new int[i_509_ + 1];
			anIntArray116 = new int[i_509_ - -1];
			anIntArray130 = new int[i_509_ + 1];
			anIntArray129 = new int[i_509_ - -1];
		}
		for (int i_531_ = i_529_; i_530_ >= i_531_; i_531_++)
		{
			anIntArray116[i_531_] = 99999999;
			anIntArray121[i_531_] = -99999999;
		}
		int i_532_ = 0;
		int i_533_ = 0;
		int i_534_ = 0;
		final int i_535_ = this.anIntArray118[i_504_];
		i_513_ = i_535_ - 1;
		i_516_ = 0;
		final int i_536_ = this.anIntArray123[i_504_];
		i_511_ = 0;
		i_515_ = i_535_ + -1;
		i_512_ = 0;
		i_514_ = i_536_ - 1;
		i_518_ = i_536_ + -1;
		i_517_ = 0;
		if (i_528_ != i_522_)
		{
			i_532_ = ((-i_521_ + i_527_) << 8) / (-i_522_ + i_528_);
			i_534_ = ((-i_512_ + i_518_) << 8) / (-i_522_ + i_528_);
		}
		int i_537_;
		int i_538_;
		int i_539_;
		int i_540_;
		if (i_528_ >= i_522_)
		{
			i_539_ = i_522_;
			i_537_ = i_528_;
			i_538_ = i_521_ << 8;
			i_540_ = i_512_ << 8;
		}
		else
		{
			i_537_ = i_522_;
			i_538_ = i_527_ << 8;
			i_539_ = i_528_;
			i_540_ = i_518_ << 8;
		}
		if (0 > i_539_)
		{
			i_540_ -= i_539_ * i_534_;
			i_538_ -= i_539_ * i_532_;
			i_539_ = 0;
		}
		if ((i_509_ + -1) < i_537_)
		{
			i_537_ = i_509_ - 1;
		}
		for (int i_541_ = i_539_; i_541_ <= i_537_; i_541_++)
		{
			anIntArray116[i_541_] = anIntArray121[i_541_] = i_538_;
			i_538_ += i_532_;
			final int[] is = anIntArray129;
			final int i_542_ = i_541_;
			anIntArray131[i_541_] = 0;
			is[i_542_] = 0;
			anIntArray124[i_541_] = anIntArray130[i_541_] = i_540_;
			i_540_ += i_534_;
		}
		if (i_524_ != i_522_)
		{
			i_532_ = ((i_523_ - i_521_) << 8) / (i_524_ - i_522_);
			i_533_ = ((i_515_ - i_511_) << 8) / (-i_522_ + i_524_);
		}
		int i_543_;
		if (i_524_ >= i_522_)
		{
			i_538_ = i_521_ << 8;
			i_537_ = i_524_;
			i_543_ = i_511_ << 8;
			i_539_ = i_522_;
		}
		else
		{
			i_543_ = i_515_ << 8;
			i_539_ = i_524_;
			i_538_ = i_523_ << 8;
			i_537_ = i_522_;
		}
		if (0 > i_539_)
		{
			i_538_ -= i_539_ * i_532_;
			i_543_ -= i_533_ * i_539_;
			i_539_ = 0;
		}
		if (i_537_ > (i_509_ - 1))
		{
			i_537_ = i_509_ + -1;
		}
		for (int i_544_ = i_539_; i_544_ <= i_537_; i_544_++)
		{
			if (anIntArray116[i_544_] > i_538_)
			{
				anIntArray116[i_544_] = i_538_;
				anIntArray129[i_544_] = i_543_;
				anIntArray124[i_544_] = 0;
			}
			if (i_538_ > anIntArray121[i_544_])
			{
				anIntArray121[i_544_] = i_538_;
				anIntArray131[i_544_] = i_543_;
				anIntArray130[i_544_] = 0;
			}
			i_543_ += i_533_;
			i_538_ += i_532_;
		}
		if (i_526_ != i_524_)
		{
			i_534_ = ((-i_516_ + i_514_) << 8) / (-i_524_ + i_526_);
			i_532_ = ((-i_523_ + i_525_) << 8) / (-i_524_ + i_526_);
		}
		if (i_524_ <= i_526_)
		{
			i_537_ = i_526_;
			i_539_ = i_524_;
			i_538_ = i_523_ << 8;
			i_540_ = i_516_ << 8;
			i_543_ = i_515_ << 8;
		}
		else
		{
			i_539_ = i_526_;
			i_540_ = i_514_ << 8;
			i_537_ = i_524_;
			i_543_ = i_513_ << 8;
			i_538_ = i_525_ << 8;
		}
		if (i_539_ < 0)
		{
			i_538_ -= i_539_ * i_532_;
			i_540_ -= i_539_ * i_534_;
			i_539_ = 0;
		}
		if (i_537_ > (i_509_ + -1))
		{
			i_537_ = i_509_ + -1;
		}
		for (int i_545_ = i_539_; i_545_ <= i_537_; i_545_++)
		{
			if (i_538_ < anIntArray116[i_545_])
			{
				anIntArray116[i_545_] = i_538_;
				anIntArray129[i_545_] = i_543_;
				anIntArray124[i_545_] = i_540_;
			}
			if (anIntArray121[i_545_] < i_538_)
			{
				anIntArray121[i_545_] = i_538_;
				anIntArray131[i_545_] = i_543_;
				anIntArray130[i_545_] = i_540_;
			}
			i_540_ += i_534_;
			i_538_ += i_532_;
		}
		if (i_526_ != i_528_)
		{
			i_533_ = ((-i_513_ + i_517_) << 8) / (i_528_ - i_526_);
			i_532_ = ((-i_525_ + i_527_) << 8) / (i_528_ - i_526_);
		}
		if (i_528_ >= i_526_)
		{
			i_537_ = i_528_;
			i_538_ = i_525_ << 8;
			i_540_ = i_514_ << 8;
			i_539_ = i_526_;
			i_543_ = i_513_ << 8;
		}
		else
		{
			i_537_ = i_526_;
			i_538_ = i_527_ << 8;
			i_540_ = i_518_ << 8;
			i_543_ = i_517_ << 8;
			i_539_ = i_528_;
		}
		if (i_537_ > (i_509_ - 1))
		{
			i_537_ = i_509_ + -1;
		}
		if (0 > i_539_)
		{
			i_538_ -= i_532_ * i_539_;
			i_543_ -= i_539_ * i_533_;
			i_539_ = 0;
		}
		for (int i_546_ = i_539_; i_546_ <= i_537_; i_546_++)
		{
			if (i_538_ < anIntArray116[i_546_])
			{
				anIntArray116[i_546_] = i_538_;
				anIntArray129[i_546_] = i_543_;
				anIntArray124[i_546_] = i_540_;
			}
			if (anIntArray121[i_546_] < i_538_)
			{
				anIntArray121[i_546_] = i_538_;
				anIntArray131[i_546_] = i_543_;
				anIntArray130[i_546_] = i_540_;
			}
			i_538_ += i_532_;
			i_543_ += i_533_;
		}
		int i_547_ = i_508_ * i_529_;
		final int[] is = this.anIntArrayArray20[i_504_];
		for (int i_548_ = i_529_; i_530_ > i_548_; i_548_++)
		{
			int i_549_ = anIntArray116[i_548_] >> 8;
			int i_550_ = anIntArray121[i_548_] >> 8;
			if ((i_550_ - i_549_) <= 0)
			{
				i_547_ += i_508_;
			}
			else
			{
				int i_551_ = anIntArray129[i_548_] << 9;
				final int i_552_ = (((anIntArray131[i_548_] << 9) + -i_551_) / (-i_549_ + i_550_));
				int i_553_ = anIntArray124[i_548_] << 9;
				final int i_554_ = (((anIntArray130[i_548_] << 9) + -i_553_) / (i_550_ - i_549_));
				if (anInt517 > i_549_)
				{
					i_551_ = (i_552_ * (anInt517 - i_549_)) + i_551_;
					i_553_ = ((-i_549_ + anInt517) * i_554_) + i_553_;
					i_549_ = anInt517;
				}
				if (anInt567 < i_550_)
				{
					i_550_ = anInt567;
				}
				if ((this.aBool28 != true) || ((0x1 & i_548_) == 0))
				{
					if (!aBoolArray9[i_504_] != true)
					{
						method334(i_547_ + i_549_, is, i_553_, i_535_, 0, -i_550_ + i_549_, i_552_,
						        i_554_, i_551_);
					}
					else
					{
						method308(0, i_551_, i_552_, i_535_, i_553_, -i_550_ + i_549_, (byte) -102, i_549_ + i_547_,
						        is, i_554_);
					}
				}
				i_547_ += i_508_;
			}
		}
	}

	private void method352(final int i, int i_555_, int i_556_, final int[] is, int i_557_, final byte[] is_558_,
	        final int i_559_, final int i_560_, final int i_561_, final int i_562_, final int i_563_, int i_564_,
	        final int[] is_565_, final int i_566_, int i_568_, final int i_569_, int i_570_)
	{
		final int i_571_ = (0xff3ece & i_563_) >> 16;
		final int i_572_ = 0xff & (i_563_ >> 8);
		final int i_573_ = i_563_ & 0xff;
		final int i_574_ = (0xff2848 & i_560_) >> 16;
		final int i_575_ = 0xff & (i_560_ >> 8);
		final int i_576_ = i_560_ & 0xff;
		try
		{
			final int i_577_ = i_570_;
			for (int i_578_ = -i_566_; i_578_ < 0; i_578_++)
			{
				final int i_579_ = (i_556_ >> 16) * i_562_;
				int i_580_ = i_568_ >> 16;
				int i_581_ = i;
				if (i_580_ < anInt517)
				{
					final int i_582_ = -i_580_ + anInt517;
					i_570_ += i_582_ * i_559_;
					i_580_ = anInt517;
					i_581_ -= i_582_;
				}
				if (anInt567 <= (i_580_ - -i_581_))
				{
					final int i_583_ = (i_580_ - -i_581_) + -anInt567;
					i_581_ -= i_583_;
				}
				i_564_ = -i_564_ + 1;
				if (i_564_ != 0)
				{
					for (int i_584_ = i_580_; (i_581_ + i_580_) > i_584_; i_584_++)
					{
						i_555_ = is_558_[i_579_ + (i_570_ >> 16)] & 0xff;
						i_570_ += i_559_;
						if (i_555_ != 0)
						{
							i_555_ = is[i_555_];
							final int i_585_ = (i_555_ >> 8) & 0xff;
							final int i_586_ = (0xff8fbf & i_555_) >> 16;
							final int i_587_ = 0xff & i_555_;
							if ((i_586_ == i_585_) && (i_587_ == i_585_))
							{
								is_565_[i_584_
								        - -i_557_] = (((((i_586_ * i_571_) >> 8) << 16) - -((i_573_ * i_587_) >> 8))
								                + (((i_585_ * i_572_) >> 8) << 8));
							}
							else if ((i_586_ == 255) && (i_587_ == i_585_))
							{
								is_565_[i_584_ - -i_557_] = ((((i_574_ * i_586_) >> 8) << 16) + ((i_587_ * i_576_) >> 8)
								        + (((i_575_ * i_585_) >> 8) << 8));
							}
							else
							{
								is_565_[i_557_ + i_584_] = i_555_;
							}
						}
					}
				}
				i_556_ += i_569_;
				i_568_ += i_561_;
				i_557_ += this.menuDefaultHeight;
				i_570_ = i_577_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in transparent sprite plot routine");
		}
	}

	void method353(final int i, final int i_588_, final int i_589_, final int i_590_, final int i_591_)
	{
		this.anIntArray118[i_591_] = i_590_;
		this.anIntArray123[i_591_] = i_588_;
		aBoolArray9[i_591_] = false;
		anIntArray128[i_591_] = 0;
		anIntArray120[i_591_] = 0;
		this.anIntArray125[i_591_] = i_590_;
		this.anIntArray122[i_591_] = i_588_;
		final int i_593_ = i_588_ * i_590_;
		int i_594_ = 0;
		this.anIntArrayArray20[i_591_] = new int[i_593_];
		for (int i_595_ = i_589_; (i_589_ - -i_588_) > i_595_; i_595_++)
		{
			for (int i_596_ = i; (i_590_ + i) > i_596_; i_596_++)
			{
				this.anIntArrayArray20[i_591_][i_594_++] = (this.imagePixelArray[i_596_ - -(i_595_ * this.menuDefaultHeight)]);
			}
		}
	}

	private void spritePlotTransparent(final int i, final int i_597_, int i_598_, final int i_599_, final int i_600_,
	        final int[] is, int i_601_, final byte i_602_, final int i_603_, int i_604_, final int[] is_605_,
	        int i_606_, int i_607_, final int i_608_, int i_609_, final int i_610_)
	{
		final int i_611_ = 0xff & (i_610_ >> 16);
		final int i_612_ = 0xff & (i_610_ >> 8);
		final int i_613_ = 0xff & i_610_;
		try
		{
			final int i_614_ = i_601_;
			if (i_602_ == 84)
			{
				for (int i_615_ = -i_608_; i_615_ < 0; i_615_++)
				{
					final int i_616_ = (i_606_ >> 16) * i_599_;
					int i_617_ = i_607_ >> 16;
					int i_618_ = i;
					if (anInt517 > i_617_)
					{
						final int i_619_ = -i_617_ + anInt517;
						i_601_ = (i_600_ * i_619_) + i_601_;
						i_618_ -= i_619_;
						i_617_ = anInt517;
					}
					i_609_ = -i_609_ + 1;
					if ((i_617_ - -i_618_) >= anInt567)
					{
						final int i_620_ = i_617_ - -i_618_ - anInt567;
						i_618_ -= i_620_;
					}
					i_606_ = i_603_ + i_606_;
					if (i_609_ != 0)
					{
						for (int i_621_ = i_617_; i_621_ < (i_618_ + i_617_); i_621_++)
						{
							i_604_ = is[(i_601_ >> 16) - -i_616_];
							i_601_ = i_600_ + i_601_;
							if (i_604_ != 0)
							{
								final int i_622_ = (i_604_ & 0xffb9) >> 8;
								final int i_623_ = 0xff & i_604_;
								final int i_624_ = 0xff & (i_604_ >> 16);
								if ((i_622_ == i_624_) && (i_622_ == i_623_))
								{
									is_605_[i_598_ + i_621_] = ((((i_624_ * i_611_) >> 8) << 16)
									        + ((i_613_ * i_623_) >> 8) + (((i_622_ * i_612_) >> 8) << 8));
								}
								else
								{
									is_605_[i_598_ + i_621_] = i_604_;
								}
							}
						}
					}
					i_601_ = i_614_;
					i_598_ += this.menuDefaultHeight;
					i_607_ += i_597_;
				}
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in transparent sprite plot routine");
		}
	}

	private void method355(int i, final int i_625_, final int i_626_, final int i_627_, final int i_628_,
	        final int i_629_, int i_630_, final int[] is, int i_631_, final int i_632_, final int i_633_,
	        final int[] is_634_, int i_635_, final int i_636_)
	{
		final int i_637_ = -i_626_ + 256;
		try
		{
			final int i_638_ = i_631_;
			for (int i_639_ = -i_628_; 0 > i_639_; i_639_ += i_627_)
			{
				final int i_640_ = i_629_ * (i >> 16);
				i = i_625_ + i;
				for (int i_641_ = -i_636_; 0 > i_641_; i_641_++)
				{
					i_630_ = is[i_640_ + (i_631_ >> 16)];
					if (i_630_ == 0)
					{
						i_635_++;
					}
					else
					{
						final int i_642_ = is_634_[i_635_];
						is_634_[i_635_++] = ((Class52.method378(((i_626_ * Class52.method378(i_630_, 16711935))
						        - -(Class52.method378(16711935, i_642_) * i_637_)), -16711936))
						        + (Class52
						                .method378(
						                        ((i_637_ * Class52.method378(65280, i_642_))
						                                + (Class52.method378(i_630_, 65280) * i_626_)),
						                        16711680))) >> 8;
					}
					i_631_ += i_633_;
				}
				i_635_ = i_632_ + i_635_;
				i_631_ = i_638_;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in tran_scale");
		}
	}

	void method356(int i, int i_643_, final int i_644_, int i_645_, final int i_647_, int i_648_)
	{
		if (anInt517 > i_643_)
		{
			i -= -i_643_ + anInt517;
			i_643_ = anInt517;
		}
		if (anInt567 < (i_643_ + i))
		{
			i = anInt567 - i_643_;
		}
		final int i_649_ = (i_644_ >> 16) & 0xff;
		final int i_650_ = (i_644_ & 0xff76) >> 8;
		final int i_651_ = 0xff & i_644_;
		final int i_652_ = (i_647_ >> 16) & 0xff;
		final int i_653_ = (i_647_ >> 8) & 0xff;
		final int i_654_ = 0xff & i_647_;
		int i_655_ = -i + this.menuDefaultHeight;
		int i_656_ = 1;
		if (this.aBool28 == true)
		{
			if ((i_645_ & 0x1) != 0)
			{
				i_645_++;
				i_648_--;
			}
			i_655_ += this.menuDefaultHeight;
			i_656_ = 2;
		}
		int i_657_ = (i_645_ * this.menuDefaultHeight) + i_643_;
		for (int i_658_ = 0; i_658_ < i_648_; i_658_ += i_656_)
		{
			if (((i_658_ + i_645_) < anInt537) || (anInt536 <= (i_658_ + i_645_)))
			{
				i_657_ += this.menuDefaultHeight;
			}
			else
			{
				final int i_659_ = (((((i_658_ * i_650_) - -(i_653_ * (i_648_ - i_658_))) / i_648_) << 8)
				        + (((i_651_ * i_658_) - -((-i_658_ + i_648_) * i_654_)) / i_648_)
				        + ((((i_649_ * i_658_) + (i_652_ * (i_648_ - i_658_))) / i_648_) << 16));
				for (int i_660_ = -i; i_660_ < 0; i_660_++)
				{
					this.imagePixelArray[i_657_++] = i_659_;
				}
				i_657_ += i_655_;
			}
		}
	}

	void method357(int i, int i_661_, int i_662_, int i_663_)
	{
		if (0 > i_662_)
		{
			i_662_ = 0;
		}
		if (this.menuDefaultWidth < i_661_)
		{
			i_661_ = this.menuDefaultWidth;
		}
		if (this.menuDefaultHeight < i_663_)
		{
			i_663_ = this.menuDefaultHeight;
		}
		if (0 > i)
		{
			i = 0;
		}
		anInt517 = i_662_;
		anInt536 = i_661_;
		anInt567 = i_663_;
		anInt537 = i;
	}

	private void spritePlotTransparent(final int i, final int i_665_, int i_666_, final int i_667_, final int i_668_,
	        final int i_669_, int i_670_, final int i_671_, int i_672_, final int[] is, final int i_673_,
	        final int i_674_, int i_675_, final int i_676_, int i_677_, int i_678_, final int[] is_679_)
	{
		if (i >= -43)
		{
			this.anIntArrayArray20 = null;
		}
		final int i_680_ = (i_668_ >> 16) & 0xff;
		final int i_681_ = (i_668_ & 0xfff3) >> 8;
		final int i_682_ = 0xff & i_668_;
		final int i_683_ = (0xffb71b & i_673_) >> 16;
		final int i_684_ = (i_673_ & 0xff18) >> 8;
		final int i_685_ = 0xff & i_673_;
		try
		{
			final int i_686_ = i_678_;
			for (int i_687_ = -i_667_; 0 > i_687_; i_687_++)
			{
				final int i_688_ = (i_666_ >> 16) * i_676_;
				int i_689_ = i_672_ >> 16;
				int i_690_ = i_669_;
				if (i_689_ < anInt517)
				{
					final int i_691_ = anInt517 - i_689_;
					i_690_ -= i_691_;
					i_689_ = anInt517;
					i_678_ = (i_691_ * i_671_) + i_678_;
				}
				if ((i_689_ - -i_690_) >= anInt567)
				{
					final int i_692_ = i_689_ + i_690_ + -anInt567;
					i_690_ -= i_692_;
				}
				i_670_ = -i_670_ + 1;
				if (i_670_ != 0)
				{
					for (int i_693_ = i_689_; (i_689_ + i_690_) > i_693_; i_693_++)
					{
						i_677_ = is_679_[i_688_ + (i_678_ >> 16)];
						i_678_ = i_671_ + i_678_;
						if (i_677_ != 0)
						{
							final int i_694_ = (i_677_ >> 16) & 0xff;
							final int i_695_ = (0xffc1 & i_677_) >> 8;
							final int i_696_ = 0xff & i_677_;
							if ((i_695_ == i_694_) && (i_695_ == i_696_))
							{
								is[i_693_ - -i_675_] = ((((i_680_ * i_694_) >> 8) << 16) + ((i_682_ * i_696_) >> 8)
								        + (((i_695_ * i_681_) >> 8) << 8));
							}
							else if ((i_694_ != 255) || (i_695_ != i_696_))
							{
								is[i_675_ + i_693_] = i_677_;
							}
							else
							{
								is[i_693_ - -i_675_] = ((((i_683_ * i_694_) >> 8) << 16) + ((i_685_ * i_696_) >> 8)
								        + (((i_695_ * i_684_) >> 8) << 8));
							}
						}
					}
				}
				i_666_ += i_674_;
				i_678_ = i_686_;
				i_672_ = i_665_ + i_672_;
				i_675_ += this.menuDefaultHeight;
			}
		}
		catch (final Exception exception)
		{
			System.out.println("error in transparent sprite plot routine");
		}
	}

	private void method359(int i, final int[] is, int i_697_, final int i_698_, final int i_699_, final int i_700_,
	        final int i_701_, final int i_702_, final byte[] is_704_)
	{
		for (int i_705_ = -i_699_; 0 > i_705_; i_705_++)
		{
			for (int i_706_ = -i_698_; 0 > i_706_; i_706_++)
			{
				final int i_707_ = is_704_[i_697_++] & 0xff;
				if (30 < i_707_)
				{
					if (i_707_ >= 230)
					{
						is[i++] = i_702_;
					}
					else
					{
						final int i_708_ = is[i];
						is[i++] = (((Class52.method378(-16711936,
						        ((Class52.method378(i_708_, 16711935) * (256 - i_707_))
						                + (Class52.method378(16711935, i_702_) * i_707_))))
						        + (Class52.method378(16711680, (((-i_707_ + 256) * Class52.method378(65280, i_708_))
						                + (i_707_ * Class52.method378(i_702_, 65280)))))) >> 8);
					}
				}
				else
				{
					i++;
				}
			}
			i = i_701_ + i;
			i_697_ += i_700_;
		}
	}

	void method360(final byte[] is, final int i_709_)
	{
		final int[] is_710_ = this.anIntArrayArray20[i_709_] = new int[10200];
		this.anIntArray118[i_709_] = 255;
		this.anIntArray123[i_709_] = 40;
		anIntArray128[i_709_] = 0;
		anIntArray120[i_709_] = 0;
		this.anIntArray125[i_709_] = 255;
		this.anIntArray122[i_709_] = 40;
		aBoolArray9[i_709_] = false;
		int i_711_ = 0;
		int i_712_ = 1;
		int i_713_ = 0;
		while (255 > i_713_)
		{
			final int i_714_ = 0xff & is[i_712_++];
			for (int i_715_ = 0; i_714_ > i_715_; i_715_++)
			{
				is_710_[i_713_++] = i_711_;
			}
			i_711_ = -i_711_ + 16777215;
		}
		for (int i_717_ = 1; i_717_ < 40; i_717_++)
		{
			int i_718_ = 0;
			while (255 > i_718_)
			{
				final int i_719_ = is[i_712_++] & 0xff;
				for (int i_720_ = 0; i_719_ > i_720_; i_720_++)
				{
					is_710_[i_713_] = is_710_[i_713_ + -255];
					i_718_++;
					i_713_++;
				}
				if (i_718_ < 255)
				{
					is_710_[i_713_] = -is_710_[i_713_ - 255] + 16777215;
					i_713_++;
					i_718_++;
				}
			}
		}
	}

	void method361(final String string, final int i_721_, final int i_722_, final int i_723_, int i_724_, int i_725_)
	{
		try
		{
			if (0 < i_721_)
			{
				final int i_726_ = i_721_ + anInt522 + -1;
				if (this.aByteArrayArray13[i_726_] != null)
				{
					method338(i_726_, i_723_ + -this.anIntArray123[i_726_], i_724_);
					i_724_ = (this.anIntArray118[i_726_] - -5) + i_724_;
				}
			}
			final byte[] is = PacketConstruction.aByteArrayArray8[i_722_];
			for (int i_727_ = 0; string.length() > i_727_; i_727_++)
			{
				if ((string.charAt(i_727_) != '@') || (string.length() <= (i_727_ + 4))
				        || ('@' != string.charAt(i_727_ + 4)))
				{
					if ((string.charAt(i_727_) != '~') || ((i_727_ + 4) >= string.length())
					        || (string.charAt(i_727_ - -4) != '~'))
					{
						int i_728_ = string.charAt(i_727_);
						if (i_728_ == 160)
						{
							i_728_ = 32;
						}
						if ((i_728_ < 0) || (charIndexes.length <= i_728_))
						{
							i_728_ = 32;
						}
						final int i_729_ = charIndexes[i_728_];
						if (this.aBool27 && !ByteBuffer.aBoolArray10[i_722_] && (i_725_ != 0))
						{
							method326(i_729_, 0, ByteBuffer.aBoolArray10[i_722_], i_724_ - -1, is, i_723_);
						}
						if (this.aBool27 && !ByteBuffer.aBoolArray10[i_722_] && (i_725_ != 0))
						{
							method326(i_729_, 0, ByteBuffer.aBoolArray10[i_722_], i_724_, is, i_723_ + 1);
						}
						method326(i_729_, i_725_, ByteBuffer.aBoolArray10[i_722_], i_724_, is, i_723_);
						i_724_ = is[i_729_ + 7] + i_724_;
					}
					else
					{
						final char c = string.charAt(i_727_ - -1);
						final char c_730_ = string.charAt(i_727_ + 2);
						final char c_731_ = string.charAt(i_727_ - -3);
						if (('0' <= c) && (c <= '9') && (c_730_ >= '0') && (c_730_ <= '9') && (c_731_ >= '0')
						        && ('9' >= c_731_))
						{
							i_724_ = Integer.parseInt(string.substring(i_727_ + 1, (i_727_ + 4)));
						}
						i_727_ += 4;
					}
				}
				else
				{
					if (!string.substring(i_727_ + 1, i_727_ - -4).equalsIgnoreCase("red"))
					{
						if (!string.substring(i_727_ - -1, i_727_ + 4).equalsIgnoreCase("lre"))
						{
							if (!string.substring(i_727_ + 1, i_727_ + 4).equalsIgnoreCase("yel"))
							{
								if (!string.substring(i_727_ + 1, i_727_ + 4).equalsIgnoreCase("gre"))
								{
									if (!string.substring(i_727_ - -1, i_727_ - -4).equalsIgnoreCase("blu"))
									{
										if (!string.substring(i_727_ - -1, i_727_ - -4).equalsIgnoreCase("cya"))
										{
											if (string.substring(i_727_ - -1, i_727_ + 4).equalsIgnoreCase("mag"))
											{
												i_725_ = 16711935;
											}
											else if (!string.substring(i_727_ + 1, i_727_ + 4).equalsIgnoreCase("whi"))
											{
												if (string.substring(i_727_ + 1, i_727_ - -4).equalsIgnoreCase("bla"))
												{
													i_725_ = 0;
												}
												else if (!string.substring(i_727_ - -1, i_727_ - -4)
												        .equalsIgnoreCase("dre"))
												{
													if (!string.substring(i_727_ - -1, i_727_ + 4)
													        .equalsIgnoreCase("ora"))
													{
														if (string.substring(i_727_ + 1, i_727_ + 4)
														        .equalsIgnoreCase("ran"))
														{
															i_725_ = (int) (1.6777215E7 * (Math.random()));
														}
														else if (!string.substring((i_727_ - -1), (i_727_ + 4))
														        .equalsIgnoreCase("or1"))
														{
															if (string.substring((i_727_ + 1), (i_727_ + 4))
															        .equalsIgnoreCase("or2"))
															{
																i_725_ = 16740352;
															}
															else if (!string.substring((i_727_ - -1), (i_727_ + 4))
															        .equalsIgnoreCase("or3"))
															{
																if (string.substring((i_727_ + 1), (i_727_ + 4))
																        .equalsIgnoreCase("gr1"))
																{
																	i_725_ = 12648192;
																}
																else if (!string.substring(i_727_ + 1, i_727_ + 4)
																        .equalsIgnoreCase("gr2"))
																{
																	if (string.substring(i_727_ - -1, i_727_ + 4)
																	        .equalsIgnoreCase("gr3"))
																	{
																		i_725_ = 4259584;
																	}
																}
																else
																{
																	i_725_ = 8453888;
																}
															}
															else
															{
																i_725_ = 16723968;
															}
														}
														else
														{
															i_725_ = 16756736;
														}
													}
													else
													{
														i_725_ = 16748608;
													}
												}
												else
												{
													i_725_ = 12582912;
												}
											}
											else
											{
												i_725_ = 16777215;
											}
										}
										else
										{
											i_725_ = 65535;
										}
									}
									else
									{
										i_725_ = 255;
									}
								}
								else
								{
									i_725_ = 65280;
								}
							}
							else
							{
								i_725_ = 16776960;
							}
						}
						else
						{
							i_725_ = 16748608;
						}
					}
					else
					{
						i_725_ = 16711680;
					}
					i_727_ += 4;
				}
			}
		}
		catch (final Exception exception)
		{
			System.out.println(new StringBuilder().append("drawstring: ").append(exception).toString());
			exception.printStackTrace();
		}
	}

	void method362(final int i, final int i_733_, final int i_735_, final int i_736_, final int i_737_)
	{
		method341(i_735_, (byte) -46, i_737_, i_733_, i_736_);
		method341(i_735_, (byte) -72, i_737_ + i + -1, i_733_, i_736_);
		method319(i_736_, i, i_737_, i_733_);
		method319(i_736_, i, i_737_, i_733_ + i_735_ + -1);
	}

	void method363(final Graphics graphics, final int i, final int i_739_)
	{
		completePixels();
		graphics.drawImage(image, i, i_739_, this);
	}

	GameImage(final int maybe_width, final int maybe_height, final int i_742_, final Component component)
	{
		anInt536 = 0;
		this.aBool28 = false;
		anInt567 = 0;
		anIntArray128 = new int[i_742_];
		this.anIntArrayArray20 = new int[i_742_][];
		this.menuDefaultWidth = maybe_height;
		this.menuDefaultHeight = maybe_width;
		this.anIntArray125 = new int[i_742_];
		aBoolArray9 = new boolean[i_742_];
		this.anIntArray118 = new int[i_742_];
		this.anIntArray122 = new int[i_742_];
		this.aByteArrayArray13 = new byte[i_742_][];
		this.imagePixelArray = new int[maybe_height * maybe_width];
		this.anIntArrayArray19 = new int[i_742_][];
		anInt567 = maybe_width;
		this.anIntArray123 = new int[i_742_];
		anInt536 = maybe_height;
		anIntArray120 = new int[i_742_];
		if ((maybe_width > 1) && (maybe_height > 1) && (component != null))
		{
			aColorModel2 = new DirectColorModel(32, 16711680, 65280, 255);
			for (int index = 0; index < (this.menuDefaultHeight * this.menuDefaultWidth); index++)
			{
				this.imagePixelArray[index] = 0;
			}
			image = component.createImage(this);
			completePixels();
			component.prepareImage(image, component);
			completePixels();
			component.prepareImage(image, component);
			completePixels();
			component.prepareImage(image, component);
		}
	}

	void method364(final int i_745_)
	{
		if (this.aByteArrayArray13[i_745_] != null)
		{
			final int i_746_ = (this.anIntArray123[i_745_] * this.anIntArray118[i_745_]);
			final byte[] is = this.aByteArrayArray13[i_745_];
			final int[] is_747_ = this.anIntArrayArray19[i_745_];
			final int[] is_748_ = new int[i_746_];
			for (int i_749_ = 0; i_749_ < i_746_; i_749_++)
			{
				int i_750_ = is_747_[is[i_749_] & 0xff];
				if (i_750_ == 0)
				{
					i_750_ = 1;
				}
				else if (i_750_ == 16711935)
				{
					i_750_ = 0;
				}
				is_748_[i_749_] = i_750_;
			}
			this.anIntArrayArray20[i_745_] = is_748_;
			this.aByteArrayArray13[i_745_] = null;
			this.anIntArrayArray19[i_745_] = null;
		}
	}

	static
	{
		final String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		charIndexes = new int[256];
		for (int i = 0; i < charIndexes.length; i++)
		{
			int i_751_ = string.indexOf(i);
			if (i_751_ == -1)
			{
				i_751_ = 74;
			}
			charIndexes[i] = i_751_ * 9;
		}
		aStringArray33 = new String[100];
		anInt569 = 0;
		anInt568 = 0;
	}
}
