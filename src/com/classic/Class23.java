package com.classic;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

final class Class23
{
	private int[] anIntArray49;
	private int[] anIntArray50;
	private boolean aBool8 = false;
	int[] anIntArray51;
	int anInt221;
	private int anInt222;
	private int anInt223;
	private int anInt225;
	private int anInt226;
	private int[] anIntArray52;
	private int anInt227;
	private int anInt228;
	private int anInt230;
	int[] anIntArray53;
	private int anInt234;
	private int anInt236 = 95;
	int anInt239;
	static int[] anIntArray54;
	private int anInt241;
	private int anInt243;
	private int[] anIntArray55;
	private boolean aBool9;
	private int anInt245;
	int[] anIntArray56;
	private int[] anIntArray57;
	byte[] aByteArray12;
	private int anInt246;
	private int anInt247;
	private int[] anIntArray58;
	int anInt248;
	private int anInt249;
	private int anInt251;
	int[] anIntArray59;
	private int anInt253;
	int[] anIntArray60;
	private int anInt254;
	int[][] anIntArrayArray10;
	private int anInt255;
	private int anInt256;
	private int[] anIntArray61;
	int[] anIntArray62;
	boolean aBool10;
	int[] anIntArray63;
	private int anInt264;
	int anInt266;
	private int anInt267;
	private int anInt269;
	int[] anIntArray64;
	private int anInt270;
	private int anInt271;
	private int anInt272;
	int[] anIntArray65;
	int anInt274;
	boolean aBool11;
	private int anInt275;
	int[] anIntArray66;
	private int[] anIntArray67;
	private int[] anIntArray68;
	private boolean aBool12;
	private int anInt276;
	static String[] aStringArray17;
	int[] anIntArray69;
	boolean aBool13;
	private int anInt281;
	private int[] anIntArray70;
	int[] anIntArray71;
	int[] anIntArray72;
	private int[] anIntArray73;
	private int anInt284;
	private int anInt285;
	boolean aBool14;
	private int[][] anIntArrayArray11;
	int[] anIntArray74;
	private int anInt287;
	private int[] anIntArray75;
	int anInt288;
	private int[] anIntArray76;
	byte[] aByteArray13;
	private boolean aBool15;
	int[] anIntArray77;

	Class23[] method136(final int i, final int i_0_, final boolean bool, final int i_1_, final boolean bool_2_,
	        final int i_3_, final int i_4_, final int i_5_, final int i_6_)
	{
		method155();
		final int[] is = new int[i_3_];
		final int[] is_7_ = new int[i_3_];
		for (int i_8_ = 0; i_3_ > i_8_; i_8_++)
		{
			is[i_8_] = 0;
			is_7_[i_8_] = 0;
		}
		for (int i_9_ = 0; this.anInt248 > i_9_; i_9_++)
		{
			int i_10_ = 0;
			int i_11_ = 0;
			final int i_12_ = this.anIntArray64[i_9_];
			final int[] is_13_ = this.anIntArrayArray10[i_9_];
			for (int i_14_ = 0; i_14_ < i_12_; i_14_++)
			{
				i_10_ += this.anIntArray53[is_13_[i_14_]];
				i_11_ += this.anIntArray77[is_13_[i_14_]];
			}
			final int i_15_ = (i_10_ / (i_12_ * i)) - -((i_11_ / (i_12_ * i_6_)) * i_4_);
			is[i_15_] += i_12_;
			is_7_[i_15_]++;
		}
		final Class23[] class23s = new Class23[i_3_];
		for (int i_16_ = 0; i_3_ > i_16_; i_16_++)
		{
			if (is[i_16_] > i_5_)
			{
				is[i_16_] = i_5_;
			}
			class23s[i_16_] = new Class23(is[i_16_], is_7_[i_16_], true, true, true, bool_2_, true);
			class23s[i_16_].anInt255 = anInt255;
			class23s[i_16_].anInt266 = this.anInt266;
		}
		for (int i_17_ = 0; this.anInt248 > i_17_; i_17_++)
		{
			int i_18_ = 0;
			int i_19_ = 0;
			final int i_20_ = this.anIntArray64[i_17_];
			final int[] is_21_ = this.anIntArrayArray10[i_17_];
			for (int i_22_ = 0; i_20_ > i_22_; i_22_++)
			{
				i_18_ += this.anIntArray53[is_21_[i_22_]];
				i_19_ += this.anIntArray77[is_21_[i_22_]];
			}
			final int i_23_ = ((i_19_ / (i_20_ * i_6_)) * i_4_) + (i_18_ / (i_20_ * i));
			method162(is_21_, i_20_, i_17_, class23s[i_23_], 256);
		}
		for (int i_24_ = 0; i_24_ < i_3_; i_24_++)
		{
			class23s[i_24_].method160(0);
		}
		return class23s;
	}

	void method137(final int i, final int i_25_, final int i_26_, final int i_27_)
	{
		anInt253 += i_25_;
		anInt222 += i_26_;
		anInt247 += i_27_;
		method154(0);
		this.anInt274 = i;
	}

	void method138(final int i, final int i_28_, final int i_29_, final int i_30_, final int i_31_, final int i_32_)
	{
		this.anInt266 = -(i_32_ * 4) + 256;
		anInt255 = ((-i_29_ + 64) * 16) - -128;
		if (!aBool15)
		{
			anInt285 = i_30_;
			anInt228 = i_28_;
			anInt236 = i;
			anInt243 = (int) Math.sqrt(((i_30_ * i_30_) - -(i_28_ * i_28_)) + (i * i));
			method168();
			if (i_31_ != 12345678)
			{
				method168();
			}
		}
	}

	void method139(final int i, final int i_33_, final int i_34_, final int i_35_)
	{
		if (!aBool15)
		{
			anInt236 = i;
			anInt228 = i_33_;
			anInt285 = i_34_;
			anInt243 = (int) Math.sqrt(((i_34_ * i_34_) - -(i * i)) + (i_33_ * i_33_));
			method168();
		}
	}

	private void method140(final int i, final int i_36_, final int i_37_, final int i_38_)
	{
		for (int i_39_ = 0; i_39_ < this.anInt221; i_39_++)
		{
			if (i_38_ != 0)
			{
				final int i_40_ = Class27_Sub1_Sub1.anIntArray148[i_38_ + 256];
				final int i_41_ = Class27_Sub1_Sub1.anIntArray148[i_38_];
				final int i_42_ = (((i_41_ * anIntArray67[i_39_]) + (i_40_ * anIntArray55[i_39_])) >> 15);
				anIntArray67[i_39_] = (-(i_41_ * anIntArray55[i_39_]) + (i_40_ * anIntArray67[i_39_])) >> 15;
				anIntArray55[i_39_] = i_42_;
			}
			if (i_36_ != 0)
			{
				final int i_43_ = Class27_Sub1_Sub1.anIntArray148[i_36_ + 256];
				final int i_44_ = Class27_Sub1_Sub1.anIntArray148[i_36_];
				final int i_45_ = (((i_43_ * anIntArray67[i_39_]) - (i_44_ * anIntArray61[i_39_])) >> 15);
				anIntArray61[i_39_] = ((i_43_ * anIntArray61[i_39_]) + (i_44_ * anIntArray67[i_39_])) >> 15;
				anIntArray67[i_39_] = i_45_;
			}
			if (i_37_ != 0)
			{
				final int i_46_ = Class27_Sub1_Sub1.anIntArray148[i_37_ + 256];
				final int i_47_ = Class27_Sub1_Sub1.anIntArray148[i_37_];
				final int i_48_ = (((i_46_ * anIntArray55[i_39_]) + (i_47_ * anIntArray61[i_39_])) >> 15);
				anIntArray61[i_39_] = ((i_46_ * anIntArray61[i_39_]) + -(i_47_ * anIntArray55[i_39_])) >> 15;
				anIntArray55[i_39_] = i_48_;
			}
		}
	}

	void method141(final int i, final int i_49_, final int i_50_, final int i_51_)
	{
		anInt272 = 0xff & (i_50_ + anInt272);
		anInt281 = (i_51_ + anInt281) & 0xff;
		anInt267 = 0xff & (i_49_ + anInt267);
		method154(0);
		this.anInt274 = 1;
	}

	private void method142(final Class23[] class23s, final int i, final boolean bool, final int i_52_)
	{
		int i_53_ = 0;
		int i_54_ = 0;
		for (int i_55_ = i; i_52_ > i_55_; i_55_++)
		{
			i_54_ = class23s[i_55_].anInt221 + i_54_;
			i_53_ = class23s[i_55_].anInt248 + i_53_;
		}
		method147(i_53_, i_54_);
		if (bool)
		{
			anIntArrayArray11 = new int[i_53_][];
		}
		for (int i_56_ = 0; i_52_ > i_56_; i_56_++)
		{
			final Class23 class23_57_ = class23s[i_56_];
			class23_57_.method155();
			anInt255 = class23_57_.anInt255;
			anInt228 = class23_57_.anInt228;
			anInt236 = class23_57_.anInt236;
			this.anInt266 = class23_57_.anInt266;
			anInt285 = class23_57_.anInt285;
			anInt243 = class23_57_.anInt243;
			for (int i_58_ = 0; class23_57_.anInt248 > i_58_; i_58_++)
			{
				final int[] is = new int[class23_57_.anIntArray64[i_58_]];
				final int[] is_59_ = class23_57_.anIntArrayArray10[i_58_];
				for (int i_60_ = 0; i_60_ < class23_57_.anIntArray64[i_58_]; i_60_++)
				{
					is[i_60_] = method161(class23_57_.anIntArray58[is_59_[i_60_]],
					        (class23_57_.anIntArray53[is_59_[i_60_]]), (class23_57_.anIntArray77[is_59_[i_60_]]));
				}
				final int i_61_ = method144(is, class23_57_.anIntArray59[i_58_], class23_57_.anIntArray62[i_58_], -1062,
				        class23_57_.anIntArray64[i_58_]);
				this.anIntArray72[i_61_] = class23_57_.anIntArray72[i_58_];
				this.anIntArray71[i_61_] = class23_57_.anIntArray71[i_58_];
				this.anIntArray69[i_61_] = class23_57_.anIntArray69[i_58_];
				if (bool)
				{
					if (1 >= i_52_)
					{
						anIntArrayArray11[i_61_] = (new int[class23_57_.anIntArrayArray11[i_58_].length]);
						for (int i_62_ = 0; (i_62_ < class23_57_.anIntArrayArray11[i_58_].length); i_62_++)
						{
							anIntArrayArray11[i_61_][i_62_] = class23_57_.anIntArrayArray11[i_58_][i_62_];
						}
					}
					else
					{
						anIntArrayArray11[i_61_] = new int[(class23_57_.anIntArrayArray11[i_58_]).length - -1];
						anIntArrayArray11[i_61_][0] = i_56_;
						for (int i_63_ = 0; (i_63_ < class23_57_.anIntArrayArray11[i_58_].length); i_63_++)
						{
							anIntArrayArray11[i_61_][i_63_ + 1] = class23_57_.anIntArrayArray11[i_58_][i_63_];
						}
					}
				}
			}
		}
		this.anInt274 = 1;
	}

	private void method143()
	{
		if (this.anInt274 == 2)
		{
			this.anInt274 = 0;
			for (int i_64_ = 0; this.anInt221 > i_64_; i_64_++)
			{
				anIntArray55[i_64_] = this.anIntArray53[i_64_];
				anIntArray67[i_64_] = anIntArray58[i_64_];
				anIntArray61[i_64_] = this.anIntArray77[i_64_];
			}
			anInt284 = -9999999;
			anInt226 = 9999999;
			anInt227 = -9999999;
			anInt241 = -9999999;
			anInt287 = 9999999;
			anInt271 = 9999999;
			anInt230 = 9999999;
		}
		else if (this.anInt274 == 1)
		{
			this.anInt274 = 0;
			for (int i_65_ = 0; this.anInt221 > i_65_; i_65_++)
			{
				anIntArray55[i_65_] = this.anIntArray53[i_65_];
				anIntArray67[i_65_] = anIntArray58[i_65_];
				anIntArray61[i_65_] = this.anIntArray77[i_65_];
			}
			if (anInt270 >= 2)
			{
				method140(-72, anInt281, anInt272, anInt267);
			}
			if (anInt270 >= 3)
			{
				method165((byte) 122, anInt254, anInt276, anInt223);
			}
			if (anInt270 >= 4)
			{
				method163(anInt264, anInt275, anInt245, 32047, anInt225, anInt256, anInt269);
			}
			if (1 <= anInt270)
			{
				method146(anInt253, anInt247, 388199944, anInt222);
			}
			method157(78);
			method148(-60);
		}
	}

	int method144(final int[] is, final int i, final int i_66_, final int i_67_, final int i_68_)
	{
		if (i_67_ != -1062)
		{
			anInt222 = -98;
		}
		if (this.anInt248 >= anInt249)
		{
			return -1;
		}
		this.anIntArray64[this.anInt248] = i_68_;
		this.anIntArrayArray10[this.anInt248] = is;
		this.anIntArray62[this.anInt248] = i_66_;
		this.anIntArray59[this.anInt248] = i;
		this.anInt274 = 1;
		return this.anInt248++;
	}

	void method145(final int i, final int i_69_, final int i_70_, final int i_71_, final int i_72_, final int i_73_,
	        final int i_74_, final int i_75_, final int i_76_)
	{
		method143();
		if ((AClass1.anInt320 < anInt284) || (AClass1_Sub1.anInt642 > anInt271) || (anInt241 > Class19.anInt207)
		        || (anInt226 < Class17.anInt193) || (anInt227 > Class34.anInt371) || (anInt287 < Class26.anInt312))
		{
			this.aBool14 = false;
		}
		else
		{
			this.aBool14 = true;
			int i_77_ = 0;
			int i_78_ = 0;
			int i_79_ = 0;
			int i_80_ = i_76_;
			int i_81_ = 0;
			int i_82_ = 0;
			if (i_72_ != 0)
			{
				i_77_ = Class27_Sub1_Sub1.anIntArray147[i_72_];
				i_78_ = Class27_Sub1_Sub1.anIntArray147[i_72_ + 1024];
			}
			if (i_69_ != 0)
			{
				i_82_ = Class27_Sub1_Sub1.anIntArray147[i_69_ - -1024];
				i_81_ = Class27_Sub1_Sub1.anIntArray147[i_69_];
			}
			if (i != 0)
			{
				i_80_ = Class27_Sub1_Sub1.anIntArray147[i + 1024];
				i_79_ = Class27_Sub1_Sub1.anIntArray147[i];
			}
			for (int i_83_ = 0; i_83_ < this.anInt221; i_83_++)
			{
				int i_84_ = -i_70_ + anIntArray55[i_83_];
				int i_85_ = -i_75_ + anIntArray67[i_83_];
				if (i_72_ != 0)
				{
					final int i_86_ = ((i_78_ * i_84_) + (i_85_ * i_77_)) >> 15;
					i_85_ = ((i_85_ * i_78_) + -(i_77_ * i_84_)) >> 15;
					i_84_ = i_86_;
				}
				int i_87_ = anIntArray61[i_83_] - i_73_;
				if (i_69_ != 0)
				{
					final int i_88_ = ((i_82_ * i_84_) + (i_87_ * i_81_)) >> 15;
					i_87_ = ((i_82_ * i_87_) + -(i_81_ * i_84_)) >> 15;
					i_84_ = i_88_;
				}
				if (i != 0)
				{
					final int i_89_ = ((i_85_ * i_80_) + -(i_87_ * i_79_)) >> 15;
					i_87_ = ((i_87_ * i_80_) + (i_79_ * i_85_)) >> 15;
					i_85_ = i_89_;
				}
				if (i_71_ > i_87_)
				{
					this.anIntArray65[i_83_] = i_84_ << i_74_;
				}
				else
				{
					this.anIntArray65[i_83_] = (i_84_ << i_74_) / i_87_;
				}
				if (i_87_ >= i_71_)
				{
					this.anIntArray63[i_83_] = (i_85_ << i_74_) / i_87_;
				}
				else
				{
					this.anIntArray63[i_83_] = i_85_ << i_74_;
				}
				this.anIntArray51[i_83_] = i_84_;
				this.anIntArray66[i_83_] = i_85_;
				this.anIntArray74[i_83_] = i_87_;
			}
		}
	}

	private void method146(final int i, final int i_90_, final int i_91_, final int i_92_)
	{
		for (int i_93_ = 0; i_93_ < this.anInt221; i_93_++)
		{
			anIntArray55[i_93_] += i_90_;
			anIntArray67[i_93_] += i_92_;
			anIntArray61[i_93_] += i;
		}
	}

	private void method147(final int i_94_, final int i_95_)
	{
		this.anIntArray64 = new int[i_94_];
		this.anIntArray59 = new int[i_94_];
		this.anIntArray62 = new int[i_94_];
		this.anIntArrayArray10 = new int[i_94_][];
		this.anIntArray53 = new int[i_95_];
		this.anIntArray69 = new int[i_94_];
		this.anIntArray77 = new int[i_95_];
		this.anIntArray71 = new int[i_94_];
		this.anIntArray72 = new int[i_94_];
		this.anIntArray56 = new int[i_95_];
		if (true == !aBool12)
		{
			this.anIntArray74 = new int[i_95_];
			this.anIntArray66 = new int[i_95_];
			this.anIntArray63 = new int[i_95_];
			this.anIntArray51 = new int[i_95_];
			this.anIntArray65 = new int[i_95_];
		}
		this.aByteArray13 = new byte[i_95_];
		anIntArray58 = new int[i_95_];
		if (!this.aBool13 == true)
		{
			this.anIntArray60 = new int[i_94_];
			this.aByteArray12 = new byte[i_94_];
		}
		anInt272 = 0;
		anInt267 = 0;
		anInt253 = 0;
		anInt225 = 256;
		if (aBool9 != true)
		{
			anIntArray55 = new int[i_95_];
			anIntArray61 = new int[i_95_];
			anIntArray67 = new int[i_95_];
		}
		else
		{
			anIntArray61 = this.anIntArray77;
			anIntArray67 = anIntArray58;
			anIntArray55 = this.anIntArray53;
		}
		anInt256 = 256;
		anInt249 = i_94_;
		anInt264 = 256;
		if ((aBool15 != true) || (aBool8 != true))
		{
			anIntArray75 = new int[i_94_];
			anIntArray52 = new int[i_94_];
			anIntArray76 = new int[i_94_];
		}
		anInt270 = 0;
		if (aBool8 != true)
		{
			anIntArray70 = new int[i_94_];
			anIntArray50 = new int[i_94_];
			anIntArray73 = new int[i_94_];
			anIntArray57 = new int[i_94_];
			anIntArray49 = new int[i_94_];
			anIntArray68 = new int[i_94_];
		}
		anInt281 = 0;
		anInt234 = i_95_;
		anInt276 = 256;
		anInt254 = 256;
		anInt223 = 256;
		anInt222 = 0;
		this.anInt248 = 0;
		this.anInt221 = 0;
		anInt245 = 256;
		anInt269 = 256;
		anInt275 = 256;
		anInt247 = 0;
	}

	private void method148(final int i)
	{
		if (!aBool15 || !aBool8)
		{
			for (int i_97_ = 0; i_97_ < this.anInt248; i_97_++)
			{
				final int[] is = this.anIntArrayArray10[i_97_];
				final int i_98_ = anIntArray55[is[0]];
				final int i_99_ = anIntArray67[is[0]];
				final int i_100_ = anIntArray61[is[0]];
				final int i_101_ = -i_98_ + anIntArray55[is[1]];
				final int i_102_ = -i_99_ + anIntArray67[is[1]];
				final int i_103_ = -i_100_ + anIntArray61[is[1]];
				final int i_104_ = anIntArray55[is[2]] + -i_98_;
				final int i_105_ = anIntArray67[is[2]] + -i_99_;
				final int i_106_ = anIntArray61[is[2]] - i_100_;
				int i_107_ = (i_106_ * i_102_) + -(i_103_ * i_105_);
				int i_108_ = (i_103_ * i_104_) + -(i_106_ * i_101_);
				int i_109_;
				for (i_109_ = (i_105_ * i_101_) + -(i_102_ * i_104_); ((i_107_ > 8192) || (8192 < i_108_)
				        || (i_109_ > 8192) || (-8192 > i_107_) || (i_108_ < -8192) || (-8192 > i_109_)); i_108_ >>= 1)
				{
					i_107_ >>= 1;
					i_109_ >>= 1;
				}
				int i_110_ = (int) (256.0 * Math.sqrt((i_108_ * i_108_) + (i_107_ * i_107_) + (i_109_ * i_109_)));
				if (0 >= i_110_)
				{
					i_110_ = 1;
				}
				anIntArray75[i_97_] = (i_107_ * 65536) / i_110_;
				anIntArray76[i_97_] = (i_108_ * 65536) / i_110_;
				anIntArray52[i_97_] = (i_109_ * 65535) / i_110_;
				this.anIntArray71[i_97_] = -1;
			}
			method168();
		}
	}

	void method149(final byte i, final int i_111_, final int i_112_)
	{
		this.anInt248 -= i_112_;
		this.anInt221 -= i_111_;
		if (this.anInt248 < 0)
		{
			this.anInt248 = 0;
		}
		if (0 > this.anInt221)
		{
			this.anInt221 = 0;
		}
	}

	void method150(final int i)
	{
		this.anInt248 = 0;
		this.anInt221 = 0;
		if (i != 1)
		{
			method148(-3);
		}
	}

	void method151(final int i, final int i_114_, final int i_115_, final int i_116_, final boolean bool,
	        final int i_117_, final int i_118_)
	{
		this.anInt266 = i_115_ + -(i_114_ * 4);
		anInt255 = -(i_116_ * 16) + 1024 + 128;
		if (!aBool15)
		{
			for (int i_119_ = 0; this.anInt248 > i_119_; i_119_++)
			{
				if (bool)
				{
					this.anIntArray72[i_119_] = anInt251;
				}
				else
				{
					this.anIntArray72[i_119_] = 0;
				}
			}
			anInt285 = i_118_;
			anInt236 = i;
			anInt228 = i_117_;
			anInt243 = (int) Math.sqrt(((i * i) + (i_118_ * i_118_)) - -(i_117_ * i_117_));
			method168();
		}
	}

	void method152(final int i, final int i_120_, final int i_121_)
	{
		this.aByteArray13[i_121_] = (byte) i_120_;
	}

	void method153(final int i, final int i_122_, final int i_123_, final byte i_124_)
	{
		anInt267 = 0xff & i_123_;
		anInt272 = 0xff & i;
		anInt281 = 0xff & i_122_;
		method154(0);
		this.anInt274 = 1;
	}

	private void method154(final int i)
	{
		if ((anInt264 != 256) || (anInt275 != 256) || (anInt256 != 256) || (anInt245 != 256) || (anInt269 != 256)
		        || (anInt225 != 256))
		{
			anInt270 = 4;
		}
		else if ((anInt276 != 256) || (anInt223 != 256) || (anInt254 != 256))
		{
			anInt270 = 3;
		}
		else if ((anInt281 != 0) || (anInt272 != 0) || (anInt267 != 0))
		{
			anInt270 = 2;
		}
		else if ((anInt247 != 0) || (anInt222 != 0) || (anInt253 != 0))
		{
			anInt270 = 1;
		}
		else
		{
			anInt270 = i;
		}
	}

	private void method155()
	{
		method143();
		for (int i_126_ = 0; i_126_ < this.anInt221; i_126_++)
		{
			this.anIntArray53[i_126_] = anIntArray55[i_126_];
			anIntArray58[i_126_] = anIntArray67[i_126_];
			this.anIntArray77[i_126_] = anIntArray61[i_126_];
		}
		anInt245 = 256;
		anInt253 = 0;
		anInt256 = 256;
		anInt281 = 0;
		anInt254 = 256;
		anInt270 = 0;
		anInt225 = 256;
		anInt269 = 256;
		anInt223 = 256;
		anInt272 = 0;
		anInt222 = 0;
		anInt275 = 256;
		anInt247 = 0;
		anInt276 = 256;
		anInt264 = 256;
		anInt267 = 0;
	}

	private int method156(final int i, final byte[] is)
	{
		for (/**/; (is[anInt246] == 10) || (is[anInt246] == 13); anInt246++)
		{
			/* empty */
		}
		final int i_127_ = Class27_Sub1_Sub1.anIntArray146[is[anInt246++] & 0xff];
		final int i_128_ = Class27_Sub1_Sub1.anIntArray146[is[anInt246++] & 0xff];
		final int i_129_ = Class27_Sub1_Sub1.anIntArray146[is[anInt246++] & i];
		int i_130_ = (i_127_ * 4096) - (-(i_128_ * 64) + -i_129_ + 131072);
		if (i_130_ == 123456)
		{
			i_130_ = anInt251;
		}
		return i_130_;
	}

	private void method157(final int i)
	{
		anInt241 = 999999;
		anInt287 = -999999;
		anInt226 = -999999;
		anInt230 = -999999;
		anInt271 = -999999;
		anInt284 = 999999;
		anInt227 = 999999;
		for (int i_131_ = 0; i_131_ < this.anInt248; i_131_++)
		{
			final int[] is = this.anIntArrayArray10[i_131_];
			final int i_132_ = this.anIntArray64[i_131_];
			int i_133_ = is[0];
			int i_135_;
			int i_134_ = i_135_ = anIntArray67[i_133_];
			int i_137_;
			int i_136_ = i_137_ = anIntArray55[i_133_];
			int i_139_;
			int i_138_ = i_139_ = anIntArray61[i_133_];
			for (int i_140_ = 0; i_132_ > i_140_; i_140_++)
			{
				i_133_ = is[i_140_];
				if (anIntArray55[i_133_] >= i_137_)
				{
					if (anIntArray55[i_133_] > i_136_)
					{
						i_136_ = anIntArray55[i_133_];
					}
				}
				else
				{
					i_137_ = anIntArray55[i_133_];
				}
				if (anIntArray61[i_133_] >= i_139_)
				{
					if (i_138_ < anIntArray61[i_133_])
					{
						i_138_ = anIntArray61[i_133_];
					}
				}
				else
				{
					i_139_ = anIntArray61[i_133_];
				}
				if (anIntArray67[i_133_] >= i_135_)
				{
					if (anIntArray67[i_133_] > i_134_)
					{
						i_134_ = anIntArray67[i_133_];
					}
				}
				else
				{
					i_135_ = anIntArray67[i_133_];
				}
			}
			if (!aBool8)
			{
				anIntArray50[i_131_] = i_137_;
				anIntArray68[i_131_] = i_136_;
				anIntArray73[i_131_] = i_135_;
				anIntArray57[i_131_] = i_134_;
				anIntArray49[i_131_] = i_139_;
				anIntArray70[i_131_] = i_138_;
			}
			if (anInt230 < (-i_137_ + i_136_))
			{
				anInt230 = -i_137_ + i_136_;
			}
			if ((-i_135_ + i_134_) > anInt230)
			{
				anInt230 = -i_135_ + i_134_;
			}
			if ((-i_139_ + i_138_) > anInt230)
			{
				anInt230 = -i_139_ + i_138_;
			}
			if (i_138_ > anInt271)
			{
				anInt271 = i_138_;
			}
			if (anInt241 > i_137_)
			{
				anInt241 = i_137_;
			}
			if (i_136_ > anInt226)
			{
				anInt226 = i_136_;
			}
			if (i_134_ > anInt287)
			{
				anInt287 = i_134_;
			}
			if (i_139_ < anInt284)
			{
				anInt284 = i_139_;
			}
			if (i_135_ < anInt227)
			{
				anInt227 = i_135_;
			}
		}
	}

	int method158(final int i, final int i_141_, final int i_142_, final int i_143_)
	{
		if (this.anInt221 >= anInt234)
		{
			return -1;
		}
		this.anIntArray53[this.anInt221] = i;
		anIntArray58[this.anInt221] = i_141_;
		this.anIntArray77[this.anInt221] = i_143_;
		return this.anInt221++;
	}

	void method159(final int i, final Class23 class23_144_)
	{
		anInt253 = class23_144_.anInt253;
		anInt267 = class23_144_.anInt267;
		anInt247 = class23_144_.anInt247;
		anInt222 = class23_144_.anInt222;
		anInt281 = class23_144_.anInt281;
		anInt272 = class23_144_.anInt272;
		method154(0);
		this.anInt274 = 1;
	}

	private void method160(final int i)
	{
		this.anIntArray63 = new int[this.anInt221];
		this.anIntArray66 = new int[this.anInt221];
		this.anIntArray74 = new int[this.anInt221];
		this.anIntArray65 = new int[this.anInt221];
		this.anIntArray51 = new int[this.anInt221];
	}

	int method161(final int i_145_, final int i_146_, final int i_147_)
	{
		for (int i_148_ = 0; i_148_ < this.anInt221; i_148_++)
		{
			if ((i_146_ == this.anIntArray53[i_148_]) && (i_145_ == anIntArray58[i_148_])
			        && (i_147_ == this.anIntArray77[i_148_]))
			{
				return i_148_;
			}
		}
		if (anInt234 <= this.anInt221)
		{
			return -1;
		}
		this.anIntArray53[this.anInt221] = i_146_;
		anIntArray58[this.anInt221] = i_145_;
		this.anIntArray77[this.anInt221] = i_147_;
		return this.anInt221++;
	}

	private void method162(final int[] is, final int i, final int i_149_, final Class23 class23_150_, final int i_151_)
	{
		final int[] is_152_ = new int[i];
		for (int i_153_ = 0; i_153_ < i; i_153_++)
		{
			final int i_154_ = (is_152_[i_153_] = class23_150_.method161(anIntArray58[is[i_153_]],
			        (this.anIntArray53[is[i_153_]]), (this.anIntArray77[is[i_153_]])));
			class23_150_.anIntArray56[i_154_] = this.anIntArray56[is[i_153_]];
			class23_150_.aByteArray13[i_154_] = this.aByteArray13[is[i_153_]];
		}
		if (i_151_ == 256)
		{
			final int i_155_ = class23_150_.method144(is_152_, this.anIntArray59[i_149_], this.anIntArray62[i_149_],
			        i_151_ ^ ~0x525, i);
			if (!class23_150_.aBool13 && !this.aBool13)
			{
				class23_150_.anIntArray60[i_155_] = this.anIntArray60[i_149_];
			}
			class23_150_.anIntArray72[i_155_] = this.anIntArray72[i_149_];
			class23_150_.anIntArray71[i_155_] = this.anIntArray71[i_149_];
			class23_150_.anIntArray69[i_155_] = this.anIntArray69[i_149_];
		}
	}

	private void method163(final int i, final int i_156_, final int i_157_, final int i_158_, final int i_159_,
	        final int i_160_, final int i_161_)
	{
		for (int i_162_ = 0; i_162_ < this.anInt221; i_162_++)
		{
			if (i != 0)
			{
				anIntArray55[i_162_] += (anIntArray67[i_162_] * i) >> 8;
			}
			if (i_156_ != 0)
			{
				anIntArray61[i_162_] += (anIntArray67[i_162_] * i_156_) >> 8;
			}
			if (i_160_ != 0)
			{
				anIntArray55[i_162_] += (anIntArray61[i_162_] * i_160_) >> 8;
			}
			if (i_157_ != 0)
			{
				anIntArray67[i_162_] += (anIntArray61[i_162_] * i_157_) >> 8;
			}
			if (i_161_ != 0)
			{
				anIntArray61[i_162_] += (i_161_ * anIntArray55[i_162_]) >> 8;
			}
			if (i_159_ != 0)
			{
				anIntArray67[i_162_] += (i_159_ * anIntArray55[i_162_]) >> 8;
			}
		}
	}

	void method164(final int i, final int i_163_, final int i_164_, final int i_165_)
	{
		anInt253 = i;
		anInt222 = i_163_;
		anInt247 = i_165_;
		method154(0);
		this.anInt274 = 1;
	}

	private void method165(final byte i, final int i_166_, final int i_167_, final int i_168_)
	{
		for (int i_169_ = 0; this.anInt221 > i_169_; i_169_++)
		{
			anIntArray55[i_169_] = (i_167_ * anIntArray55[i_169_]) >> 8;
			anIntArray67[i_169_] = (i_168_ * anIntArray67[i_169_]) >> 8;
			anIntArray61[i_169_] = (i_166_ * anIntArray61[i_169_]) >> 8;
		}
	}

	Class23 method166(final int i)
	{
		final Class23[] class23s = new Class23[1];
		class23s[0] = this;
		final Class23 class23_170_ = new Class23(class23s, 1);
		class23_170_.aBool10 = this.aBool10;
		class23_170_.anInt239 = this.anInt239;
		return class23_170_;
	}

	Class23 method167(final boolean bool, final boolean bool_171_, final byte i, final boolean bool_172_,
	        final boolean bool_173_)
	{
		final Class23[] class23s = new Class23[1];
		class23s[0] = this;
		final Class23 class23_174_ = new Class23(class23s, 1, bool_172_, bool_173_, bool_171_, bool);
		class23_174_.anInt239 = this.anInt239;
		return class23_174_;
	}

	private void method168()
	{
		if (!aBool15)
		{
			final int i_175_ = (anInt255 * anInt243) >> 8;
			for (int i_176_ = 0; this.anInt248 > i_176_; i_176_++)
			{
				if (anInt251 != this.anIntArray72[i_176_])
				{
					this.anIntArray72[i_176_] = ((anInt285 * anIntArray75[i_176_]) + (anInt236 * anIntArray52[i_176_])
					        + (anInt228 * anIntArray76[i_176_])) / i_175_;
				}
			}
			final int[] is = new int[this.anInt221];
			final int[] is_178_ = new int[this.anInt221];
			final int[] is_179_ = new int[this.anInt221];
			final int[] is_180_ = new int[this.anInt221];
			for (int i_181_ = 0; i_181_ < this.anInt221; i_181_++)
			{
				is[i_181_] = 0;
				is_178_[i_181_] = 0;
				is_179_[i_181_] = 0;
				is_180_[i_181_] = 0;
			}
			for (int i_182_ = 0; i_182_ < this.anInt248; i_182_++)
			{
				if (anInt251 == this.anIntArray72[i_182_])
				{
					for (int i_183_ = 0; this.anIntArray64[i_182_] > i_183_; i_183_++)
					{
						final int i_184_ = (this.anIntArrayArray10[i_182_][i_183_]);
						is[i_184_] += anIntArray75[i_182_];
						is_178_[i_184_] += anIntArray76[i_182_];
						is_179_[i_184_] += anIntArray52[i_182_];
						is_180_[i_184_]++;
					}
				}
			}
			for (int i_185_ = 0; this.anInt221 > i_185_; i_185_++)
			{
				if (is_180_[i_185_] > 0)
				{
					this.anIntArray56[i_185_] = (((anInt228 * is_178_[i_185_]) + (anInt285 * is[i_185_])
					        + (anInt236 * is_179_[i_185_])) / (i_175_ * is_180_[i_185_]));
				}
			}
		}
	}

	Class23(final int i, final int i_186_)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		method147(i_186_, i);
		anIntArrayArray11 = new int[i_186_][1];
		for (int i_187_ = 0; i_186_ > i_187_; i_187_++)
		{
			anIntArrayArray11[i_187_][0] = i_187_;
		}
	}

	Class23(final int i, final int i_188_, final boolean bool, final boolean bool_189_, final boolean bool_190_,
	        final boolean bool_191_, final boolean bool_192_)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		aBool12 = bool_192_;
		this.aBool13 = bool_191_;
		aBool9 = bool;
		aBool15 = bool_190_;
		aBool8 = bool_189_;
		method147(i_188_, i);
	}

	Class23(final byte[] is, int i, final boolean bool)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		final int i_193_ = Class10.method84(-121, is, i);
		i += 2;
		final int i_194_ = Class10.method84(-74, is, i);
		method147(i_194_, i_193_);
		i += 2;
		anIntArrayArray11 = new int[i_194_][1];
		for (int i_195_ = 0; i_195_ < i_193_; i_195_++)
		{
			this.anIntArray53[i_195_] = Class34.method225(is, i, (byte) 34);
			i += 2;
		}
		for (int i_196_ = 0; i_193_ > i_196_; i_196_++)
		{
			anIntArray58[i_196_] = Class34.method225(is, i, (byte) 34);
			i += 2;
		}
		for (int i_197_ = 0; i_197_ < i_193_; i_197_++)
		{
			this.anIntArray77[i_197_] = Class34.method225(is, i, (byte) 34);
			i += 2;
		}
		this.anInt221 = i_193_;
		for (int i_198_ = 0; i_198_ < i_194_; i_198_++)
		{
			this.anIntArray64[i_198_] = Class52.method378(is[i++], 255);
		}
		for (int i_199_ = 0; i_194_ > i_199_; i_199_++)
		{
			this.anIntArray62[i_199_] = Class34.method225(is, i, (byte) 34);
			i += 2;
			if (this.anIntArray62[i_199_] == 32767)
			{
				this.anIntArray62[i_199_] = anInt251;
			}
		}
		for (int i_200_ = 0; i_200_ < i_194_; i_200_++)
		{
			this.anIntArray59[i_200_] = Class34.method225(is, i, (byte) 34);
			if (this.anIntArray59[i_200_] == 32767)
			{
				this.anIntArray59[i_200_] = anInt251;
			}
			i += 2;
		}
		for (int i_201_ = 0; i_201_ < i_194_; i_201_++)
		{
			final int i_202_ = is[i++] & 0xff;
			if (i_202_ == 0)
			{
				this.anIntArray72[i_201_] = 0;
			}
			else
			{
				this.anIntArray72[i_201_] = anInt251;
			}
		}
		for (int i_203_ = 0; i_203_ < i_194_; i_203_++)
		{
			this.anIntArrayArray10[i_203_] = new int[this.anIntArray64[i_203_]];
			for (int i_204_ = 0; this.anIntArray64[i_203_] > i_204_; i_204_++)
			{
				if (i_193_ >= 256)
				{
					this.anIntArrayArray10[i_203_][i_204_] = Class10.method84(-123, is, i);
					i += 2;
				}
				else
				{
					this.anIntArrayArray10[i_203_][i_204_] = Class52.method378(is[i++], 255);
				}
			}
		}
		this.anInt274 = 1;
		this.anInt248 = i_194_;
	}

	Class23(final String string)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		byte[] is;
		try
		{
			final InputStream inputstream = Class51.method376(string, (byte) 93);
			final DataInputStream datainputstream = new DataInputStream(inputstream);
			is = new byte[3];
			anInt246 = 0;
			for (int i = 0; 3 > i; i += datainputstream.read(is, i, -i + 3))
			{
				/* empty */
			}
			final int i = method156(255, is);
			anInt246 = 0;
			int i_206_ = 0;
			is = new byte[i];
			for (/**/; i > i_206_; i_206_ += datainputstream.read(is, i_206_, -i_206_ + i))
			{
				/* empty */
			}
			datainputstream.close();
		}
		catch (final IOException ioexception)
		{
			this.anInt221 = 0;
			this.anInt248 = 0;
			return;
		}
		final int i = method156(255, is);
		final int i_207_ = method156(255, is);
		method147(i_207_, i);
		anIntArrayArray11 = new int[i_207_][];
		for (int i_209_ = 0; i_209_ < i; i_209_++)
		{
			final int i_210_ = method156(255, is);
			final int i_211_ = method156(255, is);
			final int i_212_ = method156(255, is);
			method161(i_211_, i_210_, i_212_);
		}
		for (int i_213_ = 0; i_207_ > i_213_; i_213_++)
		{
			final int i_214_ = method156(255, is);
			final int i_215_ = method156(255, is);
			final int i_216_ = method156(255, is);
			final int i_217_ = method156(255, is);
			anInt255 = method156(255, is);
			this.anInt266 = method156(255, is);
			final int i_218_ = method156(255, is);
			final int[] is_219_ = new int[i_214_];
			for (int i_220_ = 0; i_214_ > i_220_; i_220_++)
			{
				is_219_[i_220_] = method156(255, is);
			}
			final int[] is_221_ = new int[i_217_];
			for (int i_222_ = 0; i_217_ > i_222_; i_222_++)
			{
				is_221_[i_222_] = method156(255, is);
			}
			final int i_223_ = method144(is_219_, i_216_, i_215_, -1062, i_214_);
			anIntArrayArray11[i_213_] = is_221_;
			if (i_218_ == 0)
			{
				this.anIntArray72[i_223_] = 0;
			}
			else
			{
				this.anIntArray72[i_223_] = anInt251;
			}
		}
		this.anInt274 = 1;
	}

	private Class23(final Class23[] class23s, final int i, final boolean bool, final boolean bool_224_,
	        final boolean bool_225_, final boolean bool_226_)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		aBool15 = bool_225_;
		aBool8 = bool_224_;
		this.aBool13 = bool_226_;
		aBool9 = bool;
		method142(class23s, 0, false, i);
	}

	private Class23(final Class23[] class23s, final int i)
	{
		anInt230 = 12345678;
		anInt243 = 256;
		anInt228 = 155;
		this.aBool10 = false;
		this.anInt239 = 0;
		this.anInt274 = 1;
		aBool9 = false;
		this.aBool11 = false;
		aBool12 = false;
		anInt251 = 12345678;
		anInt255 = 512;
		this.aBool13 = false;
		anInt285 = 180;
		this.anInt266 = 32;
		this.anInt288 = -1;
		aBool15 = false;
		this.aBool14 = true;
		method142(class23s, 0, true, i);
	}
}
