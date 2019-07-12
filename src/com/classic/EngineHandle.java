package com.classic;

import java.io.IOException;

final class EngineHandle
{
	int anInt16;
	byte[] aByteArray1;
	static int[] anIntArray8;
	byte[] aByteArray2;
	private int[] anIntArray9 = new int[256];
	private final byte[][] aByteArrayArray1;
	static String[] aStringArray7 = new String[100];
	private final GameImage aClass46_1;
	private int[][] anIntArrayArray2;
	private final int[][] anIntArrayArray3;
	int[][] anIntArrayArray4;
	private final Camera aClass41_1;
	private Model[] aClass23Array1 = new Model[64];
	static int[] anIntArray10;
	private final boolean aBool1 = false;
	private final int[][] anIntArrayArray5;
	byte[] aByteArray3;
	private final byte[][] aByteArrayArray2;
	int[] anIntArray11;
	private final byte[][] aByteArrayArray3;
	Model[][] aClass23ArrayArray1;
	static int[] anIntArray12;
	private byte[][] aByteArrayArray4;
	static int[] anIntArray13;
	private Model aClass23_1;
	private final byte[][] aByteArrayArray5;
	byte[] aByteArray4;
	int[] anIntArray14;
	boolean playerIsAlive;
	private final byte[][] aByteArrayArray6;
	static int anInt47 = 0;
	Model[][] aClass23ArrayArray2;
	private final boolean aBool3;
	private final byte[][] aByteArrayArray7;

	void method11(final int i_0_, final int i_1_, final int i_2_)
	{
		method24();
		final int i_3_ = (i_0_ + 24) / 48;
		method28(true, i_1_, i_0_, i_2_, -17614);
		final int i_4_ = (i_2_ + 24) / 48;
		if (i_1_ == 0)
		{
			method28(false, 1, i_0_, i_2_, -17614);
			method28(false, 2, i_0_, i_2_, -17614);
			method27(i_1_, 0, 83, i_4_ + -1, i_3_ - 1);
			method27(i_1_, 1, 44, i_4_ + -1, i_3_);
			method27(i_1_, 2, 72, i_4_, i_3_ + -1);
			method27(i_1_, 3, 72, i_4_, i_3_);
			method32(5136);
		}
	}

	private void method12(final int i, final int i_5_, final int i_6_, final int i_7_)
	{
		if (i != 1)
		{
			method19(-62, 105, -1, 102, -88);
		}
		this.anIntArrayArray4[i_7_][i_6_] = Class52.bitwiseAnd(this.anIntArrayArray4[i_7_][i_6_], -i_5_ + 65535);
	}

	int method13(int i, int i_8_)
	{
		if ((0 > i_8_) || (96 <= i_8_) || (i < 0) || (i >= 96))
		{
			return 0;
		}
		int i_11_ = 0;
		if ((i_8_ >= 48) && (48 > i))
		{
			i_11_ = 1;
			i_8_ -= 48;
		}
		else if ((48 <= i_8_) || (i < 48))
		{
			if ((i_8_ >= 48) && (i >= 48))
			{
				i -= 48;
				i_11_ = 3;
				i_8_ -= 48;
			}
		}
		else
		{
			i -= 48;
			i_11_ = 2;
		}
		return aByteArrayArray3[i_11_][(i_8_ * 48) + i];
	}

	private int method14(final int i, final int i_12_, final int i_13_, final byte i_14_)
	{
		final int i_16_ = method44(i_14_ + 83, i_13_, i_12_);
		if (i_16_ == 0)
		{
			return i;
		}
		if (i_14_ != -5)
		{
			return -28;
		}
		return Model.anIntArray54[i_16_ - 1];
	}

	void method15(final int i_17_, final int i_18_, final int i_19_, final int i_20_)
	{
		if ((i_18_ >= 0) && (i_20_ >= 0) && (95 > i_18_) && (95 > i_20_))
		{
			if (Class9.anIntArray21[i_19_] == 1)
			{
				if (i_17_ == 0)
				{
					this.anIntArrayArray4[i_18_][i_20_] = GameWindow.bitwiseOr((this.anIntArrayArray4[i_18_][i_20_]),
					        1);
					if (i_20_ > 0)
					{
						method43(i_20_ + -1, i_18_, 4);
					}
				}
				else if (i_17_ == 1)
				{
					this.anIntArrayArray4[i_18_][i_20_] = GameWindow.bitwiseOr((this.anIntArrayArray4[i_18_][i_20_]),
					        2);
					if (i_18_ > 0)
					{
						method43(i_20_, i_18_ + -1, 8);
					}
				}
				else if (i_17_ != 2)
				{
					if (i_17_ == 3)
					{
						this.anIntArrayArray4[i_18_][i_20_] = GameWindow
						        .bitwiseOr((this.anIntArrayArray4[i_18_][i_20_]), 32);
					}
				}
				else
				{
					this.anIntArrayArray4[i_18_][i_20_] = GameWindow.bitwiseOr((this.anIntArrayArray4[i_18_][i_20_]),
					        16);
				}
				method19(i_20_, 127, 1, i_18_, 1);
			}
		}
	}

	private void method16(final int i, final int i_21_, final int i_23_, final int i_24_, final int i_25_)
	{
		final Model class23 = aClass23Array1[(i_25_ * 8) + i_23_];
		for (int i_26_ = 0; class23.anInt221 > i_26_; i_26_++)
		{
			if (((i_21_ * 128) == class23.anIntArray53[i_26_]) && ((i_24_ * 128) == class23.anIntArray77[i_26_]))
			{
				class23.method152(i, i_26_);
				break;
			}
		}
	}

	static boolean method17(final char c)
	{
		return (c == '\u00a0') || (c == ' ') || (c == '_') || (c == '-');
	}

	private int method18(final int i, int i_27_, int i_28_)
	{
		if ((i_27_ < 0) || (96 <= i_27_) || (i_28_ < 0) || (96 <= i_28_))
		{
			return 0;
		}
		int i_29_ = 0;
		if ((i_27_ < 48) || (48 <= i_28_))
		{
			if ((i_27_ >= 48) || (i_28_ < 48))
			{
				if ((48 <= i_27_) && (i_28_ >= 48))
				{
					i_29_ = 3;
					i_27_ -= 48;
					i_28_ -= 48;
				}
			}
			else
			{
				i_28_ -= 48;
				i_29_ = 2;
			}
		}
		else
		{
			i_27_ -= 48;
			i_29_ = 1;
		}
		if (i != -49)
		{
			method12(100, -74, 40, 30);
		}
		return 0xff & aByteArrayArray2[i_29_][i_28_ + (i_27_ * 48)];
	}

	private void method19(final int i, final int i_30_, final int i_31_, final int i_32_, final int i_33_)
	{
		if ((i_32_ >= 1) && (i >= 1) && ((i_33_ + i_32_) < 96) && ((i - -i_31_) < 96))
		{
			int i_34_ = i_32_;
			if (i_30_ != 127)
			{
				aByteArrayArray4 = null;
			}
			for (/**/; i_34_ <= (i_32_ - -i_33_); i_34_++)
			{
				for (int i_35_ = i; i_35_ <= (i_31_ + i); i_35_++)
				{
					if (((method20(i_30_ + -27417, i_34_, i_35_) & 0x63) == 0)
					        && ((0x59 & method20(i_30_ ^ ~0x6ae6, i_34_ - 1, i_35_)) == 0)
					        && ((method20(-27290, i_34_, i_35_ + -1) & 0x56) == 0)
					        && ((0x6c & method20(-27290, i_34_ + -1, i_35_ + -1)) == 0))
					{
						method23(i_35_, i_34_, 0);
					}
					else
					{
						method23(i_35_, i_34_, 35);
					}
				}
			}
		}
	}

	private int method20(final int i, final int i_36_, final int i_37_)
	{
		if (i != -27290)
		{
			method21(-56, 81, -18, 34, 91);
		}
		if ((0 > i_36_) || (0 > i_37_) || (i_36_ >= 96) || (i_37_ >= 96))
		{
			return 0;
		}
		return this.anIntArrayArray4[i_36_][i_37_];
	}

	private void method21(final int i, final int i_38_, final int i_39_, final int i_40_, final int i_41_)
	{
		final int i_42_ = StreamClass.anIntArray140[i_38_];
		if (80000 > anIntArrayArray5[i][i_40_])
		{
			anIntArrayArray5[i][i_40_] += 80000 - -i_42_;
		}
		if (80000 > anIntArrayArray5[i_41_][i_39_])
		{
			anIntArrayArray5[i_41_][i_39_] += i_42_ + 80000;
		}
	}

	static String method22(String string, final String string_43_, final String string_44_, final int i)
	{
		if (i > -46)
		{
			aStringArray7 = null;
		}
		for (int i_45_ = string.indexOf(string_43_); i_45_ != -1; i_45_ = string.indexOf(string_43_,
		        i_45_ - -string_44_.length()))
		{
			string = new StringBuilder().append(string.substring(0, i_45_)).append(string_44_)
			        .append(string.substring(i_45_ + string_43_.length())).toString();
		}
		return string;
	}

	private void method23(final int i, final int i_46_, final int i_48_)
	{
		final int i_49_ = i_46_ / 12;
		final int i_50_ = i / 12;
		final int i_51_ = (i_46_ - 1) / 12;
		final int i_52_ = (i - 1) / 12;
		method16(i_48_, i_46_, i_49_, i, i_50_);
		if (i_49_ != i_51_)
		{
			method16(i_48_, i_46_, i_51_, i, i_50_);
		}
		if (i_50_ != i_52_)
		{
			method16(i_48_, i_46_, i_49_, i, i_52_);
		}
		if ((i_51_ != i_49_) && (i_52_ != i_50_))
		{
			method16(i_48_, i_46_, i_51_, i, i_52_);
		}
	}

	private void method24()
	{
		if (aBool3)
		{
			aClass41_1.cleanupModels();
		}
		for (int i_54_ = 0; 64 > i_54_; i_54_++)
		{
			aClass23Array1[i_54_] = null;
			for (int i_55_ = 0; i_55_ < 4; i_55_++)
			{
				this.aClass23ArrayArray1[i_55_][i_54_] = null;
			}
			for (int i_56_ = 0; i_56_ < 4; i_56_++)
			{
				this.aClass23ArrayArray2[i_56_][i_54_] = null;
			}
		}
		System.gc();
	}

	private int method25(int i, int i_57_, final int i_58_)
	{
		if ((0 > i_57_) || (i_57_ >= 96) || (i < 0) || (i >= 96))
		{
			return 0;
		}
		int i_59_ = 0;
		if ((48 > i_57_) || (48 <= i))
		{
			if ((i_57_ < 48) && (48 <= i))
			{
				i_59_ = 2;
				i -= 48;
			}
			else if ((i_57_ >= 48) && (48 <= i))
			{
				i_59_ = 3;
				i -= 48;
				i_57_ -= 48;
			}
		}
		else
		{
			i_57_ -= 48;
			i_59_ = 1;
		}
		if (i_58_ <= 18)
		{
			return -81;
		}
		return (0xff & aByteArrayArray5[i_59_][(i_57_ * 48) - -i]) * 3;
	}

	void updateObjectAnd(final int i, final int i_60_, final int i_61_, final int i_62_)
	{
		if ((i_62_ == -30895) && ((0 <= i_61_) && (0 <= i_60_) && (95 > i_61_) && (i_60_ < 95)))
		{
			if ((GameImage.anIntArray134[i] == 1) || (GameImage.anIntArray134[i] == 2))
			{
				final int i_63_ = method13(i_60_, i_61_);
				int i_64_;
				int i_65_;
				if ((i_63_ == 0) || (i_63_ == 4))
				{
					i_64_ = Isaac.anIntArray17[i];
					i_65_ = Class45.anIntArray115[i];
				}
				else
				{
					i_64_ = Class45.anIntArray115[i];
					i_65_ = Isaac.anIntArray17[i];
				}
				for (int i_66_ = i_61_; i_66_ < (i_61_ + i_65_); i_66_++)
				{
					for (int i_67_ = i_60_; i_67_ < (i_64_ + i_60_); i_67_++)
					{
						if (GameImage.anIntArray134[i] != 1)
						{
							if (i_63_ == 0)
							{
								this.anIntArrayArray4[i_66_][i_67_] = Class52
								        .bitwiseAnd((this.anIntArrayArray4[i_66_][i_67_]), 65533);
								if (i_66_ > 0)
								{
									method12(1, 8, i_67_, i_66_ + -1);
								}
							}
							else if (i_63_ != 2)
							{
								if (i_63_ == 4)
								{
									this.anIntArrayArray4[i_66_][i_67_] = Class52
									        .bitwiseAnd((this.anIntArrayArray4[i_66_][i_67_]), 65527);
									if (i_66_ < 95)
									{
										method12(1, 2, i_67_, i_66_ + 1);
									}
								}
								else if (i_63_ == 6)
								{
									this.anIntArrayArray4[i_66_][i_67_] = Class52
									        .bitwiseAnd((this.anIntArrayArray4[i_66_][i_67_]), 65534);
									if (0 < i_67_)
									{
										method12(i_62_ + 30896, 4, i_67_ + -1, i_66_);
									}
								}
							}
							else
							{
								this.anIntArrayArray4[i_66_][i_67_] = Class52
								        .bitwiseAnd((this.anIntArrayArray4[i_66_][i_67_]), 65531);
								if (95 > i_67_)
								{
									method12(i_62_ ^ ~0x78af, 1, i_67_ + 1, i_66_);
								}
							}
						}
						else
						{
							this.anIntArrayArray4[i_66_][i_67_] = Class52
							        .bitwiseAnd((this.anIntArrayArray4[i_66_][i_67_]), 65471);
						}
					}
				}
				method19(i_60_, 127, i_64_, i_61_, i_65_);
			}
		}
	}

	private void method27(final int i, final int i_68_, final int i_69_, final int i_70_, final int i_71_)
	{
		if (i_69_ >= 6)
		{
			final String string = new StringBuilder().append("m").append(i).append(i_71_ / 10).append(i_71_ % 10)
			        .append(i_70_ / 10).append(i_70_ % 10).toString();
			try
			{
				if (this.aByteArray3 != null)
				{
					byte[] is = Camera.method292(this.aByteArray3, 0,
					        new StringBuilder().append(string).append(".hei").toString(), 293484812);
					if ((is == null) && (this.aByteArray2 != null))
					{
						is = Camera.method292(this.aByteArray2, 0,
						        new StringBuilder().append(string).append(".hei").toString(), 293484812);
					}
					if ((is == null) || (is.length <= 0))
					{
						for (int i_72_ = 0; i_72_ < 2304; i_72_++)
						{
							aByteArrayArray5[i_68_][i_72_] = (byte) 0;
							aByteArrayArray4[i_68_][i_72_] = (byte) 0;
						}
					}
					else
					{
						int i_73_ = 0;
						int i_74_ = 0;
						int i_75_ = 0;
						while (2304 > i_75_)
						{
							final int i_76_ = 0xff & is[i_73_++];
							if (i_76_ < 128)
							{
								aByteArrayArray5[i_68_][i_75_++] = (byte) i_76_;
								i_74_ = i_76_;
							}
							if (128 <= i_76_)
							{
								for (int i_77_ = 0; i_77_ < (i_76_ - 128); i_77_++)
								{
									aByteArrayArray5[i_68_][i_75_++] = (byte) i_74_;
								}
							}
						}
						i_74_ = 64;
						for (i_75_ = 0; 48 > i_75_; i_75_++)
						{
							for (int i_78_ = 0; i_78_ < 48; i_78_++)
							{
								i_74_ = 0x7f & ((aByteArrayArray5[i_68_][i_75_ + (i_78_ * 48)]) + i_74_);
								aByteArrayArray5[i_68_][(i_78_ * 48) - -i_75_] = (byte) (i_74_ * 2);
							}
						}
						i_74_ = 0;
						i_75_ = 0;
						while (2304 > i_75_)
						{
							final int i_79_ = is[i_73_++] & 0xff;
							if (i_79_ < 128)
							{
								aByteArrayArray4[i_68_][i_75_++] = (byte) i_79_;
								i_74_ = i_79_;
							}
							if (128 <= i_79_)
							{
								for (int i_80_ = 0; i_80_ < (i_79_ - 128); i_80_++)
								{
									aByteArrayArray4[i_68_][i_75_++] = (byte) i_74_;
								}
							}
						}
						i_74_ = 35;
						for (i_75_ = 0; i_75_ < 48; i_75_++)
						{
							for (int i_81_ = 0; 48 > i_81_; i_81_++)
							{
								i_74_ = 0x7f & ((aByteArrayArray4[i_68_][i_75_ + (i_81_ * 48)]) - -i_74_);
								aByteArrayArray4[i_68_][i_75_ + (i_81_ * 48)] = (byte) (i_74_ * 2);
							}
						}
					}
					is = Camera.method292(this.aByteArray4, 0,
					        new StringBuilder().append(string).append(".dat").toString(), 293484812);
					if ((is == null) && (this.aByteArray1 != null))
					{
						is = Camera.method292(this.aByteArray1, 0,
						        new StringBuilder().append(string).append(".dat").toString(), 293484812);
					}
					if ((is == null) || (is.length == 0))
					{
						throw new IOException();
					}
					int i_82_ = 0;
					for (int i_83_ = 0; 2304 > i_83_; i_83_++)
					{
						aByteArrayArray2[i_68_][i_83_] = is[i_82_++];
					}
					for (int i_84_ = 0; i_84_ < 2304; i_84_++)
					{
						aByteArrayArray6[i_68_][i_84_] = is[i_82_++];
					}
					for (int i_85_ = 0; 2304 > i_85_; i_85_++)
					{
						anIntArrayArray3[i_68_][i_85_] = Class52.bitwiseAnd(is[i_82_++], 255);
					}
					for (int i_86_ = 0; i_86_ < 2304; i_86_++)
					{
						final int i_87_ = 0xff & is[i_82_++];
						if (i_87_ > 0)
						{
							anIntArrayArray3[i_68_][i_86_] = i_87_ + 12000;
						}
					}
					int i_88_ = 0;
					while (2304 > i_88_)
					{
						final int i_89_ = is[i_82_++] & 0xff;
						if (128 <= i_89_)
						{
							for (int i_90_ = 0; i_90_ < (i_89_ + -128); i_90_++)
							{
								aByteArrayArray7[i_68_][i_88_++] = (byte) 0;
							}
						}
						else
						{
							aByteArrayArray7[i_68_][i_88_++] = (byte) i_89_;
						}
					}
					i_88_ = 0;
					int i_91_ = 0;
					while (i_91_ < 2304)
					{
						final int i_92_ = is[i_82_++] & 0xff;
						if (128 <= i_92_)
						{
							for (int i_93_ = 0; (i_92_ + -128) > i_93_; i_93_++)
							{
								aByteArrayArray1[i_68_][i_91_++] = (byte) i_88_;
							}
						}
						else
						{
							i_88_ = i_92_;
							aByteArrayArray1[i_68_][i_91_++] = (byte) i_92_;
						}
					}
					i_91_ = 0;
					while (i_91_ < 2304)
					{
						final int i_94_ = is[i_82_++] & 0xff;
						if (i_94_ < 128)
						{
							aByteArrayArray3[i_68_][i_91_++] = (byte) i_94_;
						}
						else
						{
							for (int i_95_ = 0; (i_94_ + -128) > i_95_; i_95_++)
							{
								aByteArrayArray3[i_68_][i_91_++] = (byte) 0;
							}
						}
					}
					is = Camera.method292(this.aByteArray4, 0,
					        new StringBuilder().append(string).append(".loc").toString(), 293484812);
					if ((is != null) && (is.length > 0))
					{
						i_82_ = 0;
						i_91_ = 0;
						while (i_91_ < 2304)
						{
							final int i_96_ = 0xff & is[i_82_++];
							if (i_96_ < 128)
							{
								anIntArrayArray3[i_68_][i_91_++] = i_96_ + 48000;
							}
							else
							{
								i_91_ = i_91_ + i_96_ + -128;
							}
						}
					}
				}
				else
				{
					final byte[] is = new byte[20736];
					Class27_Sub1_Sub1.readFromPath(
					        new StringBuilder().append("../gamedata/maps/").append(string).append(".jm").toString(), is,
					        20736);
					int i_97_ = 0;
					int i_98_ = 0;
					for (int i_99_ = 0; 2304 > i_99_; i_99_++)
					{
						i_97_ = (is[i_98_++] + i_97_) & 0xff;
						aByteArrayArray5[i_68_][i_99_] = (byte) i_97_;
					}
					i_97_ = 0;
					for (int i_100_ = 0; 2304 > i_100_; i_100_++)
					{
						i_97_ = (i_97_ - -is[i_98_++]) & 0xff;
						aByteArrayArray4[i_68_][i_100_] = (byte) i_97_;
					}
					for (int i_101_ = 0; 2304 > i_101_; i_101_++)
					{
						aByteArrayArray2[i_68_][i_101_] = is[i_98_++];
					}
					for (int i_102_ = 0; 2304 > i_102_; i_102_++)
					{
						aByteArrayArray6[i_68_][i_102_] = is[i_98_++];
					}
					for (int i_103_ = 0; 2304 > i_103_; i_103_++)
					{
						anIntArrayArray3[i_68_][i_103_] = ((256 * Class52.bitwiseAnd(is[i_98_], 255))
						        - -Class52.bitwiseAnd(255, is[i_98_ + 1]));
						i_98_ += 2;
					}
					for (int i_104_ = 0; 2304 > i_104_; i_104_++)
					{
						aByteArrayArray7[i_68_][i_104_] = is[i_98_++];
					}
					for (int i_105_ = 0; 2304 > i_105_; i_105_++)
					{
						aByteArrayArray1[i_68_][i_105_] = is[i_98_++];
					}
					for (int i_106_ = 0; 2304 > i_106_; i_106_++)
					{
						aByteArrayArray3[i_68_][i_106_] = is[i_98_++];
					}
				}
			}
			catch (final IOException ioexception)
			{
				for (int i_107_ = 0; i_107_ < 2304; i_107_++)
				{
					aByteArrayArray5[i_68_][i_107_] = (byte) 0;
					aByteArrayArray4[i_68_][i_107_] = (byte) 0;
					aByteArrayArray2[i_68_][i_107_] = (byte) 0;
					aByteArrayArray6[i_68_][i_107_] = (byte) 0;
					anIntArrayArray3[i_68_][i_107_] = 0;
					aByteArrayArray7[i_68_][i_107_] = (byte) 0;
					aByteArrayArray1[i_68_][i_107_] = (byte) 0;
					if (i == 0)
					{
						aByteArrayArray1[i_68_][i_107_] = (byte) -6;
					}
					if (i == 3)
					{
						aByteArrayArray1[i_68_][i_107_] = (byte) 8;
					}
					aByteArrayArray3[i_68_][i_107_] = (byte) 0;
				}
			}
		}
	}

	private void method28(final boolean bool, final int i, final int i_108_, final int i_109_, final int i_110_)
	{
		final int i_111_ = (i_108_ - -24) / 48;
		final int i_112_ = (i_109_ - -24) / 48;
		method27(i, 0, i_110_ + 17679, i_112_ - 1, i_111_ + -1);
		method27(i, 1, 45, i_112_ + -1, i_111_);
		method27(i, 2, 121, i_112_, i_111_ + -1);
		method27(i, 3, 60, i_112_, i_111_);
		method32(5136);
		if (aClass23_1 == null)
		{
			aClass23_1 = new Model(18688, 18688, true, true, false, false, true);
		}
		if (bool)
		{
			aClass46_1.method331();
			for (int i_113_ = 0; 96 > i_113_; i_113_++)
			{
				for (int i_114_ = 0; 96 > i_114_; i_114_++)
				{
					this.anIntArrayArray4[i_113_][i_114_] = 0;
				}
			}
			final Model class23 = aClass23_1;
			class23.method150(i_110_ ^ ~0x44cc);
			for (int i_115_ = 0; 96 > i_115_; i_115_++)
			{
				for (int i_116_ = 0; 96 > i_116_; i_116_++)
				{
					int i_117_ = -method25(i_116_, i_115_, 66);
					if ((0 < method44(127, i_116_, i_115_))
					        && (4 == (Class9.anIntArray22[-1 + method44(67, i_116_, i_115_)])))
					{
						i_117_ = 0;
					}
					if ((0 < method44(i_110_ + 17691, i_116_, i_115_ - 1))
					        && (4 == (Class9.anIntArray22[-1 + method44(48, i_116_, i_115_ - 1)])))
					{
						i_117_ = 0;
					}
					if ((method44(102, i_116_ + -1, i_115_) > 0)
					        && ((Class9.anIntArray22[-1 + method44(119, i_116_ - 1, i_115_)]) == 4))
					{
						i_117_ = 0;
					}
					if ((0 < method44(55, i_116_ + -1, i_115_ - 1))
					        && (4 == (Class9.anIntArray22[(method44(111, -1 + i_116_, -1 + i_115_) + -1)])))
					{
						i_117_ = 0;
					}
					final int i_118_ = class23.method161(i_117_, i_115_ * 128, i_116_ * 128);
					final int i_119_ = -5 + (int) (10.0 * Math.random());
					class23.method152(i_119_, i_118_);
				}
			}
			for (int i_120_ = 0; i_120_ < 95; i_120_++)
			{
				for (int i_121_ = 0; i_121_ < 95; i_121_++)
				{
					int i_122_ = method38(i_121_, i_120_, true);
					int i_123_ = anIntArray9[i_122_];
					int i_124_ = i_123_;
					int i_125_ = i_123_;
					int i_126_ = 0;
					if ((i == 1) || (i == 2))
					{
						i_123_ = 12345678;
						i_125_ = 12345678;
						i_124_ = 12345678;
					}
					if (0 < method44(123, i_121_, i_120_))
					{
						final int i_127_ = method44(i_110_ + 17739, i_121_, i_120_);
						i_122_ = Class9.anIntArray22[i_127_ + -1];
						final int i_128_ = method41(i_121_, i_120_);
						i_123_ = i_124_ = Model.anIntArray54[i_127_ + -1];
						if (i_122_ == 4)
						{
							i_124_ = 1;
							i_123_ = 1;
							if (i_127_ == 12)
							{
								i_124_ = 31;
								i_123_ = 31;
							}
						}
						if (i_122_ != 5)
						{
							if ((i_122_ != 2) || ((method40(i_120_, i_121_) > 0)
							        && (method40(i_120_, i_121_) < 24000)))
							{
								if ((i_128_ == method41(i_121_, -1 + i_120_))
								        || (method41(-1 + i_121_, i_120_) == i_128_))
								{
									if ((method41(i_121_, 1 + i_120_) == i_128_)
									        || (method41(1 + i_121_, i_120_) == i_128_))
									{
										if ((method41(i_121_, 1 + i_120_) == i_128_)
										        || (i_128_ == method41(i_121_ + -1, i_120_)))
										{
											if ((method41(i_121_, i_120_ - 1) != i_128_)
											        && (i_128_ != method41(i_121_ + 1, i_120_)))
											{
												i_123_ = i_125_;
												i_126_ = 1;
											}
										}
										else
										{
											i_124_ = i_125_;
											i_126_ = 1;
										}
									}
									else
									{
										i_124_ = i_125_;
										i_126_ = 0;
									}
								}
								else
								{
									i_126_ = 0;
									i_123_ = i_125_;
								}
							}
						}
						else if ((0 < method40(i_120_, i_121_)) && (24000 > method40(i_120_, i_121_)))
						{
							if ((method14(i_125_, i_120_ - 1, i_121_, (byte) -5) != 12345678)
							        && (12345678 != method14(i_125_, i_120_, i_121_ - 1, (byte) -5)))
							{
								i_126_ = 0;
								i_123_ = method14(i_125_, i_120_ + -1, i_121_, (byte) -5);
							}
							else if ((method14(i_125_, 1 + i_120_, i_121_, (byte) -5) == 12345678)
							        || (12345678 == method14(i_125_, i_120_, i_121_ - -1, (byte) -5)))
							{
								if ((12345678 != method14(i_125_, i_120_ + 1, i_121_, (byte) -5))
								        && (12345678 != method14(i_125_, i_120_, i_121_ - 1, (byte) -5)))
								{
									i_124_ = method14(i_125_, i_120_ + 1, i_121_, (byte) -5);
									i_126_ = 1;
								}
								else if ((12345678 != method14(i_125_, i_120_ - 1, i_121_, (byte) -5))
								        && (method14(i_125_, i_120_, i_121_ + 1, (byte) -5) != 12345678))
								{
									i_123_ = method14(i_125_, i_120_ + -1, i_121_, (byte) -5);
									i_126_ = 1;
								}
							}
							else
							{
								i_124_ = method14(i_125_, i_120_ - -1, i_121_, (byte) -5);
								i_126_ = 0;
							}
						}
						if (Mob.anIntArray37[i_127_ + -1] != 0)
						{
							this.anIntArrayArray4[i_120_][i_121_] = GameWindow
							        .bitwiseOr((this.anIntArrayArray4[i_120_][i_121_]), 64);
						}
						if (Class9.anIntArray22[i_127_ + -1] == 2)
						{
							this.anIntArrayArray4[i_120_][i_121_] = GameWindow
							        .bitwiseOr((this.anIntArrayArray4[i_120_][i_121_]), 128);
						}
					}
					method45(i_124_, i_126_, 0, i_121_, i_120_, i_123_);
					final int i_129_ = (method25(i_121_ + 1, i_120_ + 1, 89) - (method25(i_121_, i_120_ - -1, 84)
					        - (method25(i_121_ + 1, i_120_, 39) - method25(i_121_, i_120_, 56))));
					if ((i_124_ == i_123_) && (i_129_ == 0))
					{
						if (i_123_ != 12345678)
						{
							final int[] is = new int[4];
							is[0] = i_121_ - (-(i_120_ * 96) - 96);
							is[1] = i_121_ + (i_120_ * 96);
							is[3] = (i_120_ * 96) + i_121_ + 1 + 96;
							is[2] = (i_121_ + (i_120_ * 96)) - -1;
							final int i_130_ = class23.method144(is, i_123_, 12345678, -1062, 4);
							this.anIntArray14[i_130_] = i_120_;
							this.anIntArray11[i_130_] = i_121_;
							class23.anIntArray60[i_130_] = 200000 - -i_130_;
						}
					}
					else
					{
						final int[] is = new int[3];
						final int[] is_131_ = new int[3];
						if (i_126_ != 0)
						{
							if (i_123_ != 12345678)
							{
								is[1] = (i_121_ + 97) - -(i_120_ * 96);
								is[2] = i_121_ + (i_120_ * 96);
								is[0] = i_121_ + (i_120_ * 96) + 1;
								final int i_132_ = class23.method144(is, i_123_, 12345678, i_110_ ^ 0x40e8, 3);
								this.anIntArray14[i_132_] = i_120_;
								this.anIntArray11[i_132_] = i_121_;
								class23.anIntArray60[i_132_] = 200000 - -i_132_;
							}
							if (i_124_ != 12345678)
							{
								is_131_[2] = (i_121_ + (i_120_ * 96) + 96) - -1;
								is_131_[0] = i_121_ - (-(i_120_ * 96) - 96);
								is_131_[1] = i_121_ + (i_120_ * 96);
								final int i_133_ = class23.method144(is_131_, i_124_, 12345678, -1062, 3);
								this.anIntArray14[i_133_] = i_120_;
								this.anIntArray11[i_133_] = i_121_;
								class23.anIntArray60[i_133_] = i_133_ + 200000;
							}
						}
						else
						{
							if (i_123_ != 12345678)
							{
								is[0] = (i_120_ * 96) + i_121_ + 96;
								is[2] = (i_120_ * 96) + i_121_ + 1;
								is[1] = i_121_ + (i_120_ * 96);
								final int i_134_ = class23.method144(is, i_123_, 12345678, -1062, 3);
								this.anIntArray14[i_134_] = i_120_;
								this.anIntArray11[i_134_] = i_121_;
								class23.anIntArray60[i_134_] = i_134_ + 200000;
							}
							if (i_124_ != 12345678)
							{
								is_131_[2] = (i_120_ * 96) + i_121_ + 96;
								is_131_[1] = i_121_ + (i_120_ * 96) + 1 + 96;
								is_131_[0] = i_121_ + (i_120_ * 96) + 1;
								final int i_135_ = class23.method144(is_131_, i_124_, 12345678, i_110_ + 16552, 3);
								this.anIntArray14[i_135_] = i_120_;
								this.anIntArray11[i_135_] = i_121_;
								class23.anIntArray60[i_135_] = i_135_ + 200000;
							}
						}
					}
				}
			}
			for (int i_136_ = 1; 95 > i_136_; i_136_++)
			{
				for (int i_137_ = 1; i_137_ < 95; i_137_++)
				{
					if ((method44(90, i_137_, i_136_) <= 0)
					        || (Class9.anIntArray22[-1 + method44(101, i_137_, i_136_)] != 4))
					{
						if ((0 == method44(72, i_137_, i_136_))
						        || (3 != (Class9.anIntArray22[method44(69, i_137_, i_136_) + -1])))
						{
							if ((method44(79, i_137_ + 1, i_136_) > 0)
							        && (Class9.anIntArray22[method44(94, 1 + i_137_, i_136_) + -1] == 4))
							{
								final int i_138_ = (Model.anIntArray54[-1
								        + method44(i_110_ ^ ~0x44e3, i_137_ - -1, i_136_)]);
								final int i_139_ = class23.method161( -method25(i_137_, i_136_, 76),
								        i_136_ * 128, i_137_ * 128);
								final int i_140_ = class23.method161(
								        -method25(i_137_, i_136_ - -1, (i_110_ ^ ~0x44b7)), (i_136_ * 128) + 128,
								        i_137_ * 128);
								final int i_141_ = class23.method161(-method25(i_137_ - -1, i_136_ + 1, 89),
								        (i_136_ + 1) * 128, (i_137_ + 1) * 128);
								final int i_142_ = class23.method161(-method25(i_137_ - -1, i_136_, 91),
								        i_136_ * 128, (i_137_ * 128) + 128);
								final int[] is = { i_139_, i_140_, i_141_, i_142_ };
								final int i_143_ = class23.method144(is, 12345678, i_138_, -1062, 4);
								this.anIntArray14[i_143_] = i_136_;
								this.anIntArray11[i_143_] = i_137_;
								class23.anIntArray60[i_143_] = i_143_ + 200000;
								method45(i_138_, 0, 0, i_137_, i_136_, i_138_);
							}
							if ((0 < method44(i_110_ ^ ~0x44bd, i_137_ - 1, i_136_))
							        && (4 == (Class9.anIntArray22[-1 + method44(105, -1 + i_137_, i_136_)])))
							{
								final int i_144_ = (Model.anIntArray54[-1
								        + method44(i_110_ + 17721, i_137_ - 1, i_136_)]);
								final int i_145_ = class23.method161(-method25(i_137_, i_136_, 48),
								        i_136_ * 128, i_137_ * 128);
								final int i_146_ = class23.method161(-method25(i_137_, i_136_ + 1, 31),
								        (i_136_ * 128) + 128, i_137_ * 128);
								final int i_147_ = class23.method161(-method25(i_137_ + 1, i_136_ + 1, 32),
								        (i_136_ + 1) * 128, (i_137_ * 128) + 128);
								final int i_148_ = class23.method161(-method25(i_137_ - -1, i_136_, 62),
								        i_136_ * 128, (i_137_ * 128) - -128);
								final int[] is = { i_145_, i_146_, i_147_, i_148_ };
								final int i_149_ = class23.method144(is, 12345678, i_144_, i_110_ + 16552, 4);
								this.anIntArray14[i_149_] = i_136_;
								this.anIntArray11[i_149_] = i_137_;
								class23.anIntArray60[i_149_] = i_149_ + 200000;
								method45(i_144_, 0, 0, i_137_, i_136_, i_144_);
							}
							if ((0 < method44(97, i_137_, i_136_ + 1)) && (4 == (Class9.anIntArray22[-1
							        + method44(i_110_ ^ ~0x44a7, i_137_, i_136_ - -1)])))
							{
								final int i_150_ = (Model.anIntArray54[method44(65, i_137_, i_136_ - -1) - 1]);
								final int i_151_ = class23.method161(-method25(i_137_, i_136_, 39),
								        i_136_ * 128, i_137_ * 128);
								final int i_152_ = class23.method161(-method25(i_137_, i_136_ + 1, 76),
								        (i_136_ * 128) + 128, i_137_ * 128);
								final int i_153_ = class23.method161(
								        -method25(i_137_ - -1, i_136_ + 1, (i_110_ ^ ~0x44ef)), (i_136_ + 1) * 128,
								        (i_137_ * 128) - -128);
								final int i_154_ = class23.method161(-method25(i_137_ + 1, i_136_, 63),
								        i_136_ * 128, (i_137_ * 128) - -128);
								final int[] is = { i_151_, i_152_, i_153_, i_154_ };
								final int i_155_ = class23.method144(is, 12345678, i_150_, -1062, 4);
								this.anIntArray14[i_155_] = i_136_;
								this.anIntArray11[i_155_] = i_137_;
								class23.anIntArray60[i_155_] = i_155_ + 200000;
								method45(i_150_, 0, 0, i_137_, i_136_, i_150_);
							}
							if ((method44(81, i_137_, i_136_ + -1) > 0)
							        && (4 == (Class9.anIntArray22[(method44(78, i_137_, -1 + i_136_) - 1)])))
							{
								final int i_156_ = (Model.anIntArray54[-1 + method44(78, i_137_, i_136_ + -1)]);
								final int i_157_ = class23.method161(
								        -method25(i_137_, i_136_, (i_110_ + 17682)), i_136_ * 128, i_137_ * 128);
								final int i_158_ = class23.method161(-method25(i_137_, i_136_ + 1, 69),
								        (i_136_ * 128) + 128, i_137_ * 128);
								final int i_159_ = class23.method161(-method25(i_137_ - -1, i_136_ + 1, 35),
								        (i_136_ + 1) * 128, (i_137_ + 1) * 128);
								final int i_160_ = class23.method161(-method25(i_137_ + 1, i_136_, 90),
								        i_136_ * 128, (i_137_ + 1) * 128);
								final int[] is = { i_157_, i_158_, i_159_, i_160_ };
								final int i_161_ = class23.method144(is, 12345678, i_156_, i_110_ ^ 0x40e8, 4);
								this.anIntArray14[i_161_] = i_136_;
								this.anIntArray11[i_161_] = i_137_;
								class23.anIntArray60[i_161_] = i_161_ + 200000;
								method45(i_156_, 0, i_110_ + 17614, i_137_, i_136_, i_156_);
							}
						}
					}
					else
					{
						final int i_162_ = (Model.anIntArray54[method44(113, i_137_, i_136_) + -1]);
						final int i_163_ = class23.method161(-method25(i_137_, i_136_, i_110_ ^ ~0x44fb),
						        i_136_ * 128, i_137_ * 128);
						final int i_164_ = class23.method161(-method25(i_137_, i_136_ + 1, 69),
						        (i_136_ * 128) + 128, i_137_ * 128);
						final int i_165_ = class23.method161(-method25(i_137_ + 1, i_136_ + 1, 123),
						        (i_136_ + 1) * 128, (i_137_ * 128) + 128);
						final int i_166_ = class23.method161(-method25(i_137_ + 1, i_136_, 60),
						        i_136_ * 128, (i_137_ + 1) * 128);
						final int[] is = { i_163_, i_164_, i_165_, i_166_ };
						final int i_167_ = class23.method144(is, 12345678, i_162_, -1062, 4);
						this.anIntArray14[i_167_] = i_136_;
						this.anIntArray11[i_167_] = i_137_;
						class23.anIntArray60[i_167_] = i_167_ + 200000;
						method45(i_162_, 0, 0, i_137_, i_136_, i_162_);
					}
				}
			}
			class23.method151(-50, 40, i_110_ ^ ~0x45cd, 48, true, -10, -50);
			aClass23Array1 = aClass23_1.method136(1536, false, 64, 8, 233, 1536);
			for (int i_168_ = 0; i_168_ < 64; i_168_++)
			{
				aClass41_1.addModel(aClass23Array1[i_168_]);
			}
			for (int i_169_ = 0; i_169_ < 96; i_169_++)
			{
				for (int i_170_ = 0; 96 > i_170_; i_170_++)
				{
					anIntArrayArray5[i_169_][i_170_] = method25(i_170_, i_169_, 90);
				}
			}
		}
		aClass23_1.method150(i_110_ ^ ~0x44cc);
		final int i_171_ = 6316128;
		for (int i_172_ = 0; 95 > i_172_; i_172_++)
		{
			for (int i_173_ = 0; 95 > i_173_; i_173_++)
			{
				int i_174_ = method33(i_172_, i_173_);
				if ((0 < i_174_) && ((Class18.anIntArray41[i_174_ + -1] == 0) || aBool1))
				{
					method37(i_110_ ^ ~0x444d, i_173_, i_174_ + -1, aClass23_1, i_172_ + 1, i_172_, i_173_);
					if (bool && (Class9.anIntArray21[i_174_ - 1] != 0))
					{
						this.anIntArrayArray4[i_172_][i_173_] = GameWindow
						        .bitwiseOr((this.anIntArrayArray4[i_172_][i_173_]), 1);
						if (0 < i_173_)
						{
							method43(i_173_ + -1, i_172_, 4);
						}
					}
					if (bool)
					{
						aClass46_1.method341(3, i_173_ * 3, i_172_ * 3, i_171_);
					}
				}
				i_174_ = method18(i_110_ ^ 0x44fd, i_172_, i_173_);
				if ((i_174_ > 0) && ((Class18.anIntArray41[i_174_ + -1] == 0) || aBool1))
				{
					method37(i_110_ + 17742, i_173_ + 1, i_174_ + -1, aClass23_1, i_172_, i_172_, i_173_);
					if (bool && (Class9.anIntArray21[i_174_ + -1] != 0))
					{
						this.anIntArrayArray4[i_172_][i_173_] = GameWindow
						        .bitwiseOr((this.anIntArrayArray4[i_172_][i_173_]), 2);
						if (i_172_ > 0)
						{
							method43(i_173_, i_172_ + -1, 8);
						}
					}
					if (bool)
					{
						aClass46_1.method319(i_171_, 3, i_173_ * 3, i_172_ * 3);
					}
				}
				i_174_ = method40(i_172_, i_173_);
				if ((i_174_ > 0) && (i_174_ < 12000) && ((Class18.anIntArray41[i_174_ + -1] == 0) || aBool1))
				{
					method37(128, i_173_ + 1, i_174_ + -1, aClass23_1, i_172_ - -1, i_172_, i_173_);
					if (bool && (Class9.anIntArray21[i_174_ + -1] != 0))
					{
						this.anIntArrayArray4[i_172_][i_173_] = GameWindow
						        .bitwiseOr((this.anIntArrayArray4[i_172_][i_173_]), 32);
					}
					if (bool)
					{
						aClass46_1.method318(i_172_ * 3, -13292, i_173_ * 3, i_171_);
						aClass46_1.method318((i_172_ * 3) + 1, i_110_ + 4322, (i_173_ * 3) + 1, i_171_);
						aClass46_1.method318((i_172_ * 3) + 2, i_110_ ^ 0x7726, (i_173_ * 3) - -2, i_171_);
					}
				}
				if ((i_174_ > 12000) && (i_174_ < 24000) && ((Class18.anIntArray41[i_174_ + -12001] == 0) || aBool1))
				{
					method37(128, i_173_ + 1, i_174_ + -12001, aClass23_1, i_172_, i_172_ + 1, i_173_);
					if (bool && (Class9.anIntArray21[i_174_ + -12001] != 0))
					{
						this.anIntArrayArray4[i_172_][i_173_] = GameWindow
						        .bitwiseOr((this.anIntArrayArray4[i_172_][i_173_]), 16);
					}
					if (bool)
					{
						aClass46_1.method318((i_172_ * 3) + 2, -13292, i_173_ * 3, i_171_);
						aClass46_1.method318((i_172_ * 3) + 1, -13292, (i_173_ * 3) + 1, i_171_);
						aClass46_1.method318(i_172_ * 3, i_110_ + 4322, (i_173_ * 3) - -2, i_171_);
					}
				}
			}
		}
		if (bool)
		{
			aClass46_1.method312(103, 0, 285, this.anInt16 - 1, 0, 285);
		}
		aClass23_1.method151(-50, 60, 256, 24, false, -10, -50);
		this.aClass23ArrayArray1[i] = aClass23_1.method136(1536, true, 64, 8, 338, 1536);
		for (int i_175_ = 0; i_175_ < 64; i_175_++)
		{
			aClass41_1.addModel((this.aClass23ArrayArray1[i][i_175_]));
		}
		if (i_110_ == -17614)
		{
			for (int i_176_ = 0; i_176_ < 95; i_176_++)
			{
				for (int i_177_ = 0; i_177_ < 95; i_177_++)
				{
					int i_178_ = method33(i_176_, i_177_);
					if (0 < i_178_)
					{
						method21(i_176_, i_178_ + -1, i_177_, i_177_, i_176_ + 1);
					}
					i_178_ = method18(-49, i_176_, i_177_);
					if (0 < i_178_)
					{
						method21(i_176_, i_178_ + -1, i_177_ + 1, i_177_, i_176_);
					}
					i_178_ = method40(i_176_, i_177_);
					if ((i_178_ > 0) && (12000 > i_178_))
					{
						method21(i_176_, i_178_ + -1, i_177_ + 1, i_177_, i_176_ + 1);
					}
					if ((i_178_ > 12000) && (24000 > i_178_))
					{
						method21(i_176_ + 1, i_178_ - 12001, i_177_ + 1, i_177_, i_176_);
					}
				}
			}
			for (int i_179_ = 1; 95 > i_179_; i_179_++)
			{
				for (int i_180_ = 1; 95 > i_180_; i_180_++)
				{
					final int i_181_ = method30(i_180_, -126, i_179_);
					if (0 < i_181_)
					{
						final int i_182_ = i_179_;
						final int i_183_ = i_180_;
						final int i_184_ = i_179_ + 1;
						final int i_185_ = i_180_;
						final int i_186_ = i_179_ - -1;
						final int i_187_ = i_180_ + 1;
						final int i_188_ = i_179_;
						final int i_189_ = i_180_ - -1;
						int i_190_ = 0;
						int i_191_ = anIntArrayArray5[i_182_][i_183_];
						int i_192_ = anIntArrayArray5[i_184_][i_185_];
						int i_193_ = anIntArrayArray5[i_186_][i_187_];
						int i_194_ = anIntArrayArray5[i_188_][i_189_];
						if (i_193_ > 80000)
						{
							i_193_ -= 80000;
						}
						if (80000 < i_191_)
						{
							i_191_ -= 80000;
						}
						if (80000 < i_192_)
						{
							i_192_ -= 80000;
						}
						if (i_191_ > i_190_)
						{
							i_190_ = i_191_;
						}
						if (i_194_ > 80000)
						{
							i_194_ -= 80000;
						}
						if (i_190_ < i_192_)
						{
							i_190_ = i_192_;
						}
						if (i_193_ > i_190_)
						{
							i_190_ = i_193_;
						}
						if (i_190_ < i_194_)
						{
							i_190_ = i_194_;
						}
						if (i_190_ >= 80000)
						{
							i_190_ -= 80000;
						}
						if (i_191_ < 80000)
						{
							anIntArrayArray5[i_182_][i_183_] = i_190_;
						}
						else
						{
							anIntArrayArray5[i_182_][i_183_] -= 80000;
						}
						if (i_192_ >= 80000)
						{
							anIntArrayArray5[i_184_][i_185_] -= 80000;
						}
						else
						{
							anIntArrayArray5[i_184_][i_185_] = i_190_;
						}
						if (80000 > i_193_)
						{
							anIntArrayArray5[i_186_][i_187_] = i_190_;
						}
						else
						{
							anIntArrayArray5[i_186_][i_187_] -= 80000;
						}
						if (80000 <= i_194_)
						{
							anIntArrayArray5[i_188_][i_189_] -= 80000;
						}
						else
						{
							anIntArrayArray5[i_188_][i_189_] = i_190_;
						}
					}
				}
			}
			aClass23_1.method150(1);
			for (int i_195_ = 1; 95 > i_195_; i_195_++)
			{
				for (int i_196_ = 1; i_196_ < 95; i_196_++)
				{
					int i_197_ = method30(i_196_, -102, i_195_);
					if (i_197_ > 0)
					{
						final int i_198_ = i_195_;
						final int i_199_ = i_196_;
						final int i_200_ = i_195_ + 1;
						final int i_201_ = i_196_;
						final int i_202_ = i_195_ + 1;
						final int i_203_ = i_196_ + 1;
						final int i_204_ = i_195_;
						final int i_205_ = i_196_ + 1;
						int i_206_ = i_195_ * 128;
						int i_207_ = i_196_ * 128;
						int i_208_ = i_206_ + 128;
						int i_209_ = i_207_ + 128;
						int i_210_ = i_206_;
						int i_211_ = i_207_;
						int i_212_ = i_208_;
						int i_213_ = i_209_;
						int i_214_ = anIntArrayArray5[i_198_][i_199_];
						int i_215_ = anIntArrayArray5[i_200_][i_201_];
						int i_216_ = anIntArrayArray5[i_202_][i_203_];
						int i_217_ = anIntArrayArray5[i_204_][i_205_];
						final int i_218_ = Class38.anIntArray88[i_197_ + -1];
						if (method39(i_199_, -3, i_198_) && (i_214_ < 80000))
						{
							i_214_ += i_218_ - -80000;
							anIntArrayArray5[i_198_][i_199_] = i_214_;
						}
						if (method39(i_201_, -3, i_200_) && (80000 > i_215_))
						{
							i_215_ = i_215_ + i_218_ + 80000;
							anIntArrayArray5[i_200_][i_201_] = i_215_;
						}
						if (method39(i_203_, -3, i_202_) && (i_216_ < 80000))
						{
							i_216_ = i_216_ + i_218_ + 80000;
							anIntArrayArray5[i_202_][i_203_] = i_216_;
						}
						if (80000 <= i_216_)
						{
							i_216_ -= 80000;
						}
						if (method39(i_205_, -3, i_204_) && (80000 > i_217_))
						{
							i_217_ = i_217_ + i_218_ + 80000;
							anIntArrayArray5[i_204_][i_205_] = i_217_;
						}
						if (80000 <= i_215_)
						{
							i_215_ -= 80000;
						}
						if (80000 <= i_214_)
						{
							i_214_ -= 80000;
						}
						if (i_217_ >= 80000)
						{
							i_217_ -= 80000;
						}
						final int i_219_ = 16;
						if (!method34(i_199_, i_198_ + -1))
						{
							i_206_ -= i_219_;
						}
						if (!method34(i_199_, i_198_ - -1))
						{
							i_206_ += i_219_;
						}
						if (!method34(i_199_ + -1, i_198_))
						{
							i_207_ -= i_219_;
						}
						if (!method34(i_199_ - -1, i_198_))
						{
							i_207_ += i_219_;
						}
						if (!method34(i_201_, i_200_ + -1))
						{
							i_208_ -= i_219_;
						}
						if (!method34(i_201_, i_200_ + 1))
						{
							i_208_ += i_219_;
						}
						if (!method34(i_201_ + -1, i_200_))
						{
							i_211_ -= i_219_;
						}
						if (!method34(i_201_ + 1, i_200_))
						{
							i_211_ += i_219_;
						}
						if (!method34(i_203_, i_202_ + -1))
						{
							i_212_ -= i_219_;
						}
						if (!method34(i_203_, i_202_ + 1))
						{
							i_212_ += i_219_;
						}
						if (!method34(i_203_ + -1, i_202_))
						{
							i_209_ -= i_219_;
						}
						if (!method34(i_203_ + 1, i_202_))
						{
							i_209_ += i_219_;
						}
						if (!method34(i_205_, i_204_ - 1))
						{
							i_210_ -= i_219_;
						}
						if (!method34(i_205_, i_204_ + 1))
						{
							i_210_ += i_219_;
						}
						if (!method34(i_205_ + -1, i_204_))
						{
							i_213_ -= i_219_;
						}
						if (!method34(i_205_ + 1, i_204_))
						{
							i_213_ += i_219_;
						}
						i_217_ = -i_217_;
						i_214_ = -i_214_;
						i_197_ = anIntArray12[i_197_ + -1];
						i_215_ = -i_215_;
						i_216_ = -i_216_;
						if ((method40(i_195_, i_196_) > 12000) && (method40(i_195_, i_196_) < 24000)
						        && (method30(i_196_ - 1, -102, i_195_ + -1) == 0))
						{
							final int[] is = new int[3];
							is[0] = aClass23_1.method161(i_216_, i_212_, i_209_);
							is[1] = aClass23_1.method161(i_217_, i_210_, i_213_);
							is[2] = aClass23_1.method161(i_215_, i_208_, i_211_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
						}
						else if ((12000 < method40(i_195_, i_196_)) && (method40(i_195_, i_196_) < 24000)
						        && (method30(i_196_ + 1, i_110_ + 17510, i_195_ - -1) == 0))
						{
							final int[] is = new int[3];
							is[0] = aClass23_1.method161(i_214_, i_206_, i_207_);
							is[1] = aClass23_1.method161(i_215_, i_208_, i_211_);
							is[2] = aClass23_1.method161(i_217_, i_210_, i_213_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
						}
						else if ((0 < method40(i_195_, i_196_)) && (12000 > method40(i_195_, i_196_))
						        && (method30(i_196_ + -1, -125, i_195_ - -1) == 0))
						{
							final int[] is = new int[3];
							is[0] = aClass23_1.method161(i_217_, i_210_, i_213_);
							is[1] = aClass23_1.method161(i_214_, i_206_, i_207_);
							is[2] = aClass23_1.method161(i_216_, i_212_, i_209_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
						}
						else if ((method40(i_195_, i_196_) > 0) && (method40(i_195_, i_196_) < 12000)
						        && (0 == method30(1 + i_196_, i_110_ ^ 0x44b0, -1 + i_195_)))
						{
							final int[] is = new int[3];
							is[0] = aClass23_1.method161(i_215_, i_208_, i_211_);
							is[1] = aClass23_1.method161(i_216_, i_212_, i_209_);
							is[2] = aClass23_1.method161(i_214_, i_206_, i_207_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
						}
						else if ((i_215_ == i_214_) && (i_217_ == i_216_))
						{
							final int[] is = new int[4];
							is[0] = aClass23_1.method161(i_214_, i_206_, i_207_);
							is[1] = aClass23_1.method161(i_215_, i_208_, i_211_);
							is[2] = aClass23_1.method161(i_216_, i_212_, i_209_);
							is[3] = aClass23_1.method161(i_217_, i_210_, i_213_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 4);
						}
						else if ((i_217_ != i_214_) || (i_216_ != i_215_))
						{
							boolean bool_220_ = true;
							if (0 < method30(i_196_ + -1, -128, i_195_ + -1))
							{
								bool_220_ = false;
							}
							if (0 < method30(i_196_ + 1, -100, i_195_ - -1))
							{
								bool_220_ = false;
							}
							if (bool_220_ != false)
							{
								final int[] is = new int[3];
								is[0] = aClass23_1.method161(i_214_, i_206_, i_207_);
								is[1] = aClass23_1.method161(i_215_, i_208_, i_211_);
								is[2] = aClass23_1.method161(i_217_, i_210_, i_213_);
								aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
								final int[] is_221_ = new int[3];
								is_221_[0] = aClass23_1.method161(i_216_, i_212_, i_209_);
								is_221_[1] = aClass23_1.method161(i_217_, i_210_, i_213_);
								is_221_[2] = aClass23_1.method161(i_215_, i_208_, i_211_);
								aClass23_1.method144(is_221_, 12345678, i_197_, i_110_ + 16552, 3);
							}
							else
							{
								final int[] is = new int[3];
								is[0] = aClass23_1.method161(i_215_, i_208_, i_211_);
								is[1] = aClass23_1.method161(i_216_, i_212_, i_209_);
								is[2] = aClass23_1.method161(i_214_, i_206_, i_207_);
								aClass23_1.method144(is, 12345678, i_197_, -1062, 3);
								final int[] is_222_ = new int[3];
								is_222_[0] = aClass23_1.method161(i_217_, i_210_, i_213_);
								is_222_[1] = aClass23_1.method161(i_214_, i_206_, i_207_);
								is_222_[2] = aClass23_1.method161(i_216_, i_212_, i_209_);
								aClass23_1.method144(is_222_, 12345678, i_197_, -1062, 3);
							}
						}
						else
						{
							final int[] is = new int[4];
							is[0] = aClass23_1.method161(i_217_, i_210_, i_213_);
							is[1] = aClass23_1.method161(i_214_, i_206_, i_207_);
							is[2] = aClass23_1.method161(i_215_, i_208_, i_211_);
							is[3] = aClass23_1.method161(i_216_, i_212_, i_209_);
							aClass23_1.method144(is, 12345678, i_197_, -1062, 4);
						}
					}
				}
			}
			aClass23_1.method151(-50, 50, 256, 50, true, -10, -50);
			this.aClass23ArrayArray2[i] = aClass23_1.method136(1536, true, 64, 8, 169, 1536);
			for (int i_223_ = 0; 64 > i_223_; i_223_++)
			{
				aClass41_1.addModel((this.aClass23ArrayArray2[i][i_223_]));
			}
			if (this.aClass23ArrayArray2[i][0] == null)
			{
				throw new RuntimeException("null roof!");
			}
			for (int i_224_ = 0; i_224_ < 96; i_224_++)
			{
				for (int i_225_ = 0; 96 > i_225_; i_225_++)
				{
					if (anIntArrayArray5[i_224_][i_225_] >= 80000)
					{
						anIntArrayArray5[i_224_][i_225_] -= 80000;
					}
				}
			}
		}
	}

	void method29(final Model[] class23s)
	{
		for (int i_226_ = 0; 94 > i_226_; i_226_++)
		{
			for (int i_227_ = 0; 94 > i_227_; i_227_++)
			{
				if ((48000 < method40(i_226_, i_227_)) && (method40(i_226_, i_227_) < 60000))
				{
					final int i_228_ = -48001 + method40(i_226_, i_227_);
					final int i_229_ = method13(i_227_, i_226_);
					int i_230_;
					int i_231_;
					if ((i_229_ != 0) && (i_229_ != 4))
					{
						i_231_ = Isaac.anIntArray17[i_228_];
						i_230_ = Class45.anIntArray115[i_228_];
					}
					else
					{
						i_230_ = Isaac.anIntArray17[i_228_];
						i_231_ = Class45.anIntArray115[i_228_];
					}
					updateObjectAnd(i_228_, i_226_, i_227_);
					final Model class23 = class23s[IOException_Sub1.anIntArray149[i_228_]].method167(false, false,
					        false, true);
					int i_232_ = ((i_231_ + i_226_ + i_226_) * 128) / 2;
					int i_233_ = ((i_227_ + (i_227_ - -i_230_)) * 128) / 2;
					class23.translate(1, i_233_, -getAveragedElevation(i_233_, i_232_), i_232_);
					class23.method153((method13(i_227_, i_226_) * 32), 0, 0);
					aClass41_1.addModel(class23);
					class23.method138(-50, -10, 48, -50, 12345678, 48);
					if ((1 < i_231_) || (i_230_ > 1))
					{
						for (int i_234_ = i_226_; i_234_ < (i_231_ + i_226_); i_234_++)
						{
							for (int i_235_ = i_227_; i_235_ < (i_227_ + i_230_); i_235_++)
							{
								if (((i_226_ < i_234_) || (i_227_ < i_235_))
								        && ((-48001 + method40(i_234_, i_235_)) == i_228_))
								{
									i_233_ = i_235_;
									i_232_ = i_234_;
									int i_236_ = 0;
									if ((i_232_ < 48) || (48 <= i_233_))
									{
										if ((i_232_ >= 48) || (48 > i_233_))
										{
											if ((i_232_ >= 48) && (i_233_ >= 48))
											{
												i_233_ -= 48;
												i_236_ = 3;
												i_232_ -= 48;
											}
										}
										else
										{
											i_236_ = 2;
											i_233_ -= 48;
										}
									}
									else
									{
										i_236_ = 1;
										i_232_ -= 48;
									}
									anIntArrayArray3[i_236_][(i_233_ + (i_232_ * 48))] = 0;
								}
							}
						}
					}
				}
			}
		}
	}

	private int method30(int i, final int i_237_, int i_238_)
	{
		if (i_237_ >= -98)
		{
			anInt47 = -7;
		}
		if ((i_238_ < 0) || (96 <= i_238_) || (0 > i) || (96 <= i))
		{
			return 0;
		}
		int i_239_ = 0;
		if ((i_238_ < 48) || (i >= 48))
		{
			if ((48 > i_238_) && (i >= 48))
			{
				i_239_ = 2;
				i -= 48;
			}
			else if ((i_238_ >= 48) && (i >= 48))
			{
				i -= 48;
				i_238_ -= 48;
				i_239_ = 3;
			}
		}
		else
		{
			i_238_ -= 48;
			i_239_ = 1;
		}
		return aByteArrayArray7[i_239_][(i_238_ * 48) + i];
	}

	void updateObjectAnd(final int i, final int i_241_, final int i_242_)
	{
		if ((i_241_ >= 0) && (0 <= i_242_) && (95 > i_241_) && (i_242_ < 95))
		{
			if ((GameImage.anIntArray134[i] == 1) || (GameImage.anIntArray134[i] == 2))
			{
				final int i_243_ = method13(i_242_, i_241_);
				int i_244_;
				int i_245_;
				if ((i_243_ == 0) || (i_243_ == 4))
				{
					i_244_ = Class45.anIntArray115[i];
					i_245_ = Isaac.anIntArray17[i];
				}
				else
				{
					i_244_ = Isaac.anIntArray17[i];
					i_245_ = Class45.anIntArray115[i];
				}
				for (int i_246_ = i_241_; (i_241_ + i_244_) > i_246_; i_246_++)
				{
					for (int i_247_ = i_242_; (i_245_ + i_242_) > i_247_; i_247_++)
					{
						if (GameImage.anIntArray134[i] != 1)
						{
							if (i_243_ == 0)
							{
								this.anIntArrayArray4[i_246_][i_247_] = GameWindow
								        .bitwiseOr((this.anIntArrayArray4[i_246_][i_247_]), 2);
								if (0 < i_246_)
								{
									method43(i_247_, i_246_ + -1, 8);
								}
							}
							else if (i_243_ != 2)
							{
								if (i_243_ != 4)
								{
									if (i_243_ == 6)
									{
										this.anIntArrayArray4[i_246_][i_247_] = (GameWindow
										        .bitwiseOr((this.anIntArrayArray4[i_246_][i_247_]), 1));
										if (i_247_ > 0)
										{
											method43(i_247_ + -1, i_246_, 4);
										}
									}
								}
								else
								{
									this.anIntArrayArray4[i_246_][i_247_] = (GameWindow
									        .bitwiseOr((this.anIntArrayArray4[i_246_][i_247_]), 8));
									if (i_246_ < 95)
									{
										method43(i_247_, i_246_ + 1, 2);
									}
								}
							}
							else
							{
								this.anIntArrayArray4[i_246_][i_247_] = GameWindow
								        .bitwiseOr((this.anIntArrayArray4[i_246_][i_247_]), 4);
								if (i_247_ < 95)
								{
									method43(i_247_ + 1, i_246_, 1);
								}
							}
						}
						else
						{
							this.anIntArrayArray4[i_246_][i_247_] = GameWindow
							        .bitwiseOr((this.anIntArrayArray4[i_246_][i_247_]), 64);
						}
					}
				}
				method19(i_242_, 127, i_245_, i_241_, i_244_);
			}
		}
	}

	private void method32(final int i)
	{
		if (i != 5136)
		{
			anIntArrayArray2 = null;
		}
		for (int i_248_ = 0; i_248_ < 96; i_248_++)
		{
			for (int i_249_ = 0; 96 > i_249_; i_249_++)
			{
				if (250 == method44(97, i_249_, i_248_))
				{
					if ((i_248_ == 47) && (method44(113, i_249_, i_248_ + 1) != 250)
					        && (method44(i + -5032, i_249_, i_248_ + 1) != 2))
					{
						method36(i_249_, i_248_, 9);
					}
					else if ((i_249_ != 47) || (250 == method44(i ^ 0x142a, 1 + i_249_, i_248_))
					        || (2 == method44(67, 1 + i_249_, i_248_)))
					{
						method36(i_249_, i_248_, 2);
					}
					else
					{
						method36(i_249_, i_248_, 9);
					}
				}
			}
		}
	}

	private int method33(int i, int i_250_)
	{
		if ((0 > i) || (96 <= i) || (0 > i_250_) || (96 <= i_250_))
		{
			return 0;
		}
		int i_252_ = 0;
		if ((48 > i) || (48 <= i_250_))
		{
			if ((i >= 48) || (i_250_ < 48))
			{
				if ((48 <= i) && (48 <= i_250_))
				{
					i_252_ = 3;
					i_250_ -= 48;
					i -= 48;
				}
			}
			else
			{
				i_250_ -= 48;
				i_252_ = 2;
			}
		}
		else
		{
			i -= 48;
			i_252_ = 1;
		}
		return aByteArrayArray6[i_252_][i_250_ + (i * 48)] & 0xff;
	}

	private boolean method34(final int i, final int i_254_)
	{
		if ((method30(i, -120, i_254_) > 0) || (method30(i, -105, i_254_ + -1) > 0)
		        || (method30(i + -1, -105, i_254_ - 1) > 0) || (0 < method30(i - 1, -112, i_254_)))
		{
			return true;
		}
		return false;
	}

	int getAveragedElevation(final int i, final int i_255_)
	{
		final int i_256_ = i_255_ >> 7;
		final int i_257_ = i >> 7;
		int i_258_ = 0x7f & i_255_;
		int i_259_ = 0x7f & i;
		if ((0 > i_256_) || (i_257_ < 0) || (i_256_ >= 95) || (i_257_ >= 95))
		{
			return 0;
		}
		int i_260_;
		int i_261_;
		int i_262_;
		if (i_258_ <= (-i_259_ + 128))
		{
			i_260_ = method25(i_257_, i_256_, 27);
			i_261_ = method25(i_257_, 1 + i_256_, 50) + -i_260_;
			i_262_ = method25(i_257_ + 1, i_256_, 60) - i_260_;
		}
		else
		{
			i_260_ = method25(i_257_ + 1, i_256_ - -1, 110);
			i_261_ = method25(i_257_ + 1, i_256_, 48) - i_260_;
			i_259_ = -i_259_ + 128;
			i_258_ = 128 - i_258_;
			i_262_ = method25(i_257_, i_256_ - -1, 114) - i_260_;
		}
		final int i_263_ = ((i_259_ * i_262_) / 128) + (i_260_ - -((i_258_ * i_261_) / 128));
		return i_263_;
	}

	private void method36(int i, int i_264_, final int i_265_)
	{
		if ((i_264_ >= 0) && (i_264_ < 96) && (i >= 0) && (i < 96))
		{
			int i_267_ = 0;
			if ((48 > i_264_) || (i >= 48))
			{
				if ((48 <= i_264_) || (48 > i))
				{
					if ((48 <= i_264_) && (i >= 48))
					{
						i_267_ = 3;
						i_264_ -= 48;
						i -= 48;
					}
				}
				else
				{
					i_267_ = 2;
					i -= 48;
				}
			}
			else
			{
				i_264_ -= 48;
				i_267_ = 1;
			}
			aByteArrayArray1[i_267_][(i_264_ * 48) - -i] = (byte) i_265_;
		}
	}

	private void method37(final int i, final int i_269_, final int i_270_, final Model class23, final int i_271_,
	        final int i_272_, final int i_273_)
	{
		method23(i_273_, i_272_, 40);
		method23(i_269_, i_271_, 40);
		final int i_274_ = StreamClass.anIntArray140[i_270_];
		final int i_275_ = Class25.anIntArray79[i_270_];
		final int i_276_ = Class3.anIntArray2[i_270_];
		final int i_277_ = i_272_ * 128;
		final int i_278_ = i_273_ * 128;
		final int i_279_ = i_271_ * i;
		final int i_280_ = i_269_ * 128;
		final int i_281_ = class23.method161(-anIntArrayArray5[i_272_][i_273_], i_277_, i_278_);
		final int i_282_ = class23.method161(-anIntArrayArray5[i_272_][i_273_] - i_274_, i_277_, i_278_);
		final int i_283_ = class23.method161(-anIntArrayArray5[i_271_][i_269_] - i_274_, i_279_, i_280_);
		final int i_284_ = class23.method161(-anIntArrayArray5[i_271_][i_269_], i_279_, i_280_);
		final int[] is = { i_281_, i_282_, i_283_, i_284_ };
		final int i_285_ = class23.method144(is, i_276_, i_275_, -1062, 4);
		if (Class18.anIntArray41[i_270_] != 5)
		{
			class23.anIntArray60[i_285_] = 0;
		}
		else
		{
			class23.anIntArray60[i_285_] = i_270_ + 30000;
		}
	}

	private int method38(int i, int i_286_, final boolean bool)
	{
		if (bool != true)
		{
			return -27;
		}
		if ((i_286_ < 0) || (96 <= i_286_) || (i < 0) || (i >= 96))
		{
			return 0;
		}
		int i_287_ = 0;
		if ((i_286_ >= 48) && (i < 48))
		{
			i_287_ = 1;
			i_286_ -= 48;
		}
		else if ((48 > i_286_) && (i >= 48))
		{
			i -= 48;
			i_287_ = 2;
		}
		else if ((48 <= i_286_) && (48 <= i))
		{
			i_286_ -= 48;
			i -= 48;
			i_287_ = 3;
		}
		return 0xff & aByteArrayArray4[i_287_][(i_286_ * 48) + i];
	}

	private boolean method39(final int i, final int i_288_, final int i_289_)
	{
		if (i_288_ != -3)
		{
			return false;
		}
		if ((method30(i, -110, i_289_) > 0) && (0 < method30(i, -110, i_289_ + -1))
		        && (0 < method30(i + -1, i_288_ ^ 0x77, i_289_ + -1)) && (0 < method30(i - 1, -121, i_289_)))
		{
			return true;
		}
		return false;
	}

	private int method40(int i, int i_290_)
	{
		if ((0 > i) || (i >= 96) || (0 > i_290_) || (96 <= i_290_))
		{
			return 0;
		}
		int i_291_ = 0;
		if ((48 > i) || (i_290_ >= 48))
		{
			if ((48 > i) && (i_290_ >= 48))
			{
				i_291_ = 2;
				i_290_ -= 48;
			}
			else if ((i >= 48) && (i_290_ >= 48))
			{
				i -= 48;
				i_291_ = 3;
				i_290_ -= 48;
			}
		}
		else
		{
			i_291_ = 1;
			i -= 48;
		}
		return anIntArrayArray3[i_291_][(i * 48) - -i_290_];
	}

	private int method41(final int i, final int i_292_)
	{
		final int i_295_ = method44(52, i, i_292_);
		if (i_295_ == 0)
		{
			return -1;
		}
		final int i_296_ = Class9.anIntArray22[i_295_ + -1];
		if (i_296_ == 2)
		{
			return 1;
		}
		return 0;
	}

	void method42(final int i, final int i_297_, final int i_298_, final int i_299_)
	{
		if ((i_297_ >= 0) && (i_299_ >= 0) && (i_297_ < 95) && (95 > i_299_))
		{
			if (Class9.anIntArray21[i_298_] == 1)
			{
				if (i != 0)
				{
					if (i != 1)
					{
						if (i == 2)
						{
							this.anIntArrayArray4[i_297_][i_299_] = Class52
							        .bitwiseAnd((this.anIntArrayArray4[i_297_][i_299_]), 65519);
						}
						else if (i == 3)
						{
							this.anIntArrayArray4[i_297_][i_299_] = Class52
							        .bitwiseAnd((this.anIntArrayArray4[i_297_][i_299_]), 65503);
						}
					}
					else
					{
						this.anIntArrayArray4[i_297_][i_299_] = Class52
						        .bitwiseAnd((this.anIntArrayArray4[i_297_][i_299_]), 65533);
						if (0 < i_297_)
						{
							method12(1, 8, i_299_, i_297_ + -1);
						}
					}
				}
				else
				{
					this.anIntArrayArray4[i_297_][i_299_] = Class52.bitwiseAnd((this.anIntArrayArray4[i_297_][i_299_]),
					        65534);
					if (0 < i_299_)
					{
						method12(1, 4, i_299_ + -1, i_297_);
					}
				}
				method19(i_299_, 127, 1, i_297_, 1);
			}
		}
	}

	private void method43(final int i, final int i_301_, final int i_302_)
	{
		this.anIntArrayArray4[i_301_][i] = GameWindow.bitwiseOr((this.anIntArrayArray4[i_301_][i]), i_302_);
	}

	private int method44(final int i, int i_304_, int i_305_)
	{
		if ((0 > i_305_) || (i_305_ >= 96) || (i_304_ < 0) || (96 <= i_304_))
		{
			return 0;
		}
		int i_306_ = 0;
		if (i < 40)
		{
			anIntArray9 = null;
		}
		if ((48 > i_305_) || (48 <= i_304_))
		{
			if ((i_305_ >= 48) || (i_304_ < 48))
			{
				if ((48 <= i_305_) && (i_304_ >= 48))
				{
					i_306_ = 3;
					i_304_ -= 48;
					i_305_ -= 48;
				}
			}
			else
			{
				i_306_ = 2;
				i_304_ -= 48;
			}
		}
		else
		{
			i_306_ = 1;
			i_305_ -= 48;
		}
		return 0xff & aByteArrayArray1[i_306_][(i_305_ * 48) - -i_304_];
	}

	private void method45(final int i, final int i_307_, final int i_308_, final int i_309_, final int i_310_,
	        final int i_311_)
	{
		final int i_312_ = i_310_ * 3;
		final int i_313_ = i_309_ * 3;
		int i_314_ = aClass41_1.method263(0, i_311_);
		int i_315_ = aClass41_1.method263(0, i);
		i_314_ = (i_314_ >> 1) & 0x7f7f7f;
		i_315_ = (0xfefefe & i_315_) >> 1;
		if (i_308_ == i_307_)
		{
			aClass46_1.method341(3, i_313_, i_312_, i_314_);
			aClass46_1.method341(2, i_313_ + 1, i_312_, i_314_);
			aClass46_1.method341(1, i_313_ + 2, i_312_, i_314_);
			aClass46_1.method341(1, i_313_ + 1, i_312_ + 2, i_315_);
			aClass46_1.method341(2, i_313_ + 2, i_312_ + 1, i_315_);
		}
		else if (i_307_ == 1)
		{
			aClass46_1.method341(3, i_313_, i_312_, i_315_);
			aClass46_1.method341(2, i_313_ + 1, i_312_ - -1, i_315_);
			aClass46_1.method341(1, i_313_ + 2, i_312_ + 2, i_315_);
			aClass46_1.method341(1, i_313_ + 1, i_312_, i_314_);
			aClass46_1.method341(2, i_313_ - -2, i_312_, i_314_);
		}
	}

	int method46(final int i, final int i_316_, final boolean bool, final int i_317_, final int i_318_, final int[] is,
	        final int i_319_, final int i_320_, final int[] is_321_, final byte i_322_)
	{
		for (int i_323_ = 0; i_323_ < 96; i_323_++)
		{
			for (int i_324_ = 0; i_324_ < 96; i_324_++)
			{
				anIntArrayArray2[i_323_][i_324_] = 0;
			}
		}
		int i_325_ = 0;
		int i_326_ = 0;
		if (i_322_ > -15)
		{
			method46(19, -42, false, 54, 120, null, -24, 58, null, (byte) 122);
		}
		int i_327_ = i_317_;
		int i_328_ = i_318_;
		anIntArrayArray2[i_317_][i_318_] = 99;
		is_321_[i_325_] = i_317_;
		is[i_325_++] = i_318_;
		final int i_329_ = is_321_.length;
		boolean bool_330_ = false;
		while (i_325_ != i_326_)
		{
			i_327_ = is_321_[i_326_];
			i_328_ = is[i_326_];
			i_326_ = (i_326_ + 1) % i_329_;
			if ((i_319_ <= i_327_) && (i_316_ >= i_327_) && (i_328_ >= i_320_) && (i >= i_328_))
			{
				bool_330_ = true;
				break;
			}
			if (bool)
			{
				if ((i_327_ > 0) && ((i_327_ - 1) >= i_319_) && ((i_327_ + -1) <= i_316_) && (i_320_ <= i_328_)
				        && (i >= i_328_) && ((0x8 & (this.anIntArrayArray4[i_327_ - 1][i_328_])) == 0))
				{
					bool_330_ = true;
					break;
				}
				if ((95 > i_327_) && ((i_327_ + 1) >= i_319_) && ((i_327_ - -1) <= i_316_) && (i_328_ >= i_320_)
				        && (i_328_ <= i) && ((this.anIntArrayArray4[i_327_ + 1][i_328_] & 0x2) == 0))
				{
					bool_330_ = true;
					break;
				}
				if ((0 < i_328_) && (i_327_ >= i_319_) && (i_316_ >= i_327_) && ((i_328_ + -1) >= i_320_)
				        && ((i_328_ + -1) <= i) && ((this.anIntArrayArray4[i_327_][i_328_ + -1] & 0x4) == 0))
				{
					bool_330_ = true;
					break;
				}
				if ((i_328_ < 95) && (i_319_ <= i_327_) && (i_316_ >= i_327_) && (i_320_ <= (i_328_ + 1))
				        && ((i_328_ + 1) <= i) && ((this.anIntArrayArray4[i_327_][i_328_ + 1] & 0x1) == 0))
				{
					bool_330_ = true;
					break;
				}
			}
			if ((i_327_ > 0) && (anIntArrayArray2[i_327_ + -1][i_328_] == 0)
			        && ((0x78 & this.anIntArrayArray4[i_327_ + -1][i_328_]) == 0))
			{
				is_321_[i_325_] = i_327_ + -1;
				is[i_325_] = i_328_;
				anIntArrayArray2[i_327_ - 1][i_328_] = 2;
				i_325_ = (i_325_ - -1) % i_329_;
			}
			if ((95 > i_327_) && (anIntArrayArray2[i_327_ - -1][i_328_] == 0)
			        && ((0x72 & this.anIntArrayArray4[i_327_ + 1][i_328_]) == 0))
			{
				is_321_[i_325_] = i_327_ + 1;
				is[i_325_] = i_328_;
				i_325_ = (i_325_ + 1) % i_329_;
				anIntArrayArray2[i_327_ + 1][i_328_] = 8;
			}
			if ((i_328_ > 0) && (anIntArrayArray2[i_327_][i_328_ + -1] == 0)
			        && ((0x74 & this.anIntArrayArray4[i_327_][i_328_ - 1]) == 0))
			{
				is_321_[i_325_] = i_327_;
				is[i_325_] = i_328_ + -1;
				anIntArrayArray2[i_327_][i_328_ + -1] = 1;
				i_325_ = (i_325_ + 1) % i_329_;
			}
			if ((95 > i_328_) && (anIntArrayArray2[i_327_][i_328_ + 1] == 0)
			        && ((this.anIntArrayArray4[i_327_][i_328_ + 1] & 0x71) == 0))
			{
				is_321_[i_325_] = i_327_;
				is[i_325_] = i_328_ - -1;
				i_325_ = (i_325_ - -1) % i_329_;
				anIntArrayArray2[i_327_][i_328_ - -1] = 4;
			}
			if ((0 < i_327_) && (i_328_ > 0) && ((this.anIntArrayArray4[i_327_][i_328_ + -1] & 0x74) == 0)
			        && ((0x78 & this.anIntArrayArray4[i_327_ + -1][i_328_]) == 0)
			        && ((0x7c & (this.anIntArrayArray4[i_327_ - 1][i_328_ + -1])) == 0)
			        && (anIntArrayArray2[i_327_ + -1][i_328_ - 1] == 0))
			{
				is_321_[i_325_] = i_327_ + -1;
				is[i_325_] = i_328_ + -1;
				i_325_ = (i_325_ + 1) % i_329_;
				anIntArrayArray2[i_327_ + -1][i_328_ - 1] = 3;
			}
			if ((i_327_ < 95) && (i_328_ > 0) && ((0x74 & this.anIntArrayArray4[i_327_][i_328_ + -1]) == 0)
			        && ((this.anIntArrayArray4[i_327_ + 1][i_328_] & 0x72) == 0)
			        && ((this.anIntArrayArray4[i_327_ + 1][i_328_ + -1] & 0x76) == 0)
			        && (anIntArrayArray2[i_327_ + 1][i_328_ + -1] == 0))
			{
				is_321_[i_325_] = i_327_ + 1;
				is[i_325_] = i_328_ - 1;
				anIntArrayArray2[i_327_ + 1][i_328_ + -1] = 9;
				i_325_ = (i_325_ - -1) % i_329_;
			}
			if ((0 < i_327_) && (i_328_ < 95) && ((this.anIntArrayArray4[i_327_][i_328_ + 1] & 0x71) == 0)
			        && ((0x78 & this.anIntArrayArray4[i_327_ + -1][i_328_]) == 0)
			        && ((this.anIntArrayArray4[i_327_ - 1][i_328_ - -1] & 0x79) == 0)
			        && (anIntArrayArray2[i_327_ + -1][i_328_ + 1] == 0))
			{
				is_321_[i_325_] = i_327_ - 1;
				is[i_325_] = i_328_ + 1;
				anIntArrayArray2[i_327_ + -1][i_328_ + 1] = 6;
				i_325_ = (i_325_ + 1) % i_329_;
			}
			if ((95 > i_327_) && (i_328_ < 95) && ((0x71 & this.anIntArrayArray4[i_327_][i_328_ - -1]) == 0)
			        && ((this.anIntArrayArray4[i_327_ + 1][i_328_] & 0x72) == 0)
			        && ((0x73 & (this.anIntArrayArray4[i_327_ + 1][i_328_ + 1])) == 0)
			        && (anIntArrayArray2[i_327_ + 1][i_328_ + 1] == 0))
			{
				is_321_[i_325_] = i_327_ - -1;
				is[i_325_] = i_328_ + 1;
				anIntArrayArray2[i_327_ + 1][i_328_ - -1] = 12;
				i_325_ = (i_325_ + 1) % i_329_;
			}
		}
		if (!bool_330_)
		{
			return -1;
		}
		i_326_ = 0;
		is_321_[i_326_] = i_327_;
		is[i_326_++] = i_328_;
		int i_332_;
		int i_331_ = i_332_ = anIntArrayArray2[i_327_][i_328_];
		while ((i_327_ != i_317_) || (i_318_ != i_328_))
		{
			if (i_331_ != i_332_)
			{
				i_332_ = i_331_;
				is_321_[i_326_] = i_327_;
				is[i_326_++] = i_328_;
			}
			if ((i_331_ & 0x1) == 0)
			{
				if ((i_331_ & 0x4) != 0)
				{
					i_328_--;
				}
			}
			else
			{
				i_328_++;
			}
			if ((i_331_ & 0x2) == 0)
			{
				if ((0x8 & i_331_) != 0)
				{
					i_327_--;
				}
			}
			else
			{
				i_327_++;
			}
			i_331_ = anIntArrayArray2[i_327_][i_328_];
		}
		return i_326_;
	}

	EngineHandle(final Camera class41, final GameImage class46)
	{
		this.anIntArrayArray4 = new int[96][96];
		this.anIntArray11 = new int[18432];
		aByteArrayArray3 = new byte[4][2304];
		aByteArrayArray2 = new byte[4][2304];
		aByteArrayArray4 = new byte[4][2304];
		this.anInt16 = 750;
		this.anIntArray14 = new int[18432];
		anIntArrayArray2 = new int[96][96];
		this.aClass23ArrayArray1 = new Model[4][64];
		anIntArrayArray3 = new int[4][2304];
		aByteArrayArray1 = new byte[4][2304];
		this.playerIsAlive = false;
		aByteArrayArray6 = new byte[4][2304];
		anIntArrayArray5 = new int[96][96];
		this.aClass23ArrayArray2 = new Model[4][64];
		aByteArrayArray5 = new byte[4][2304];
		aBool3 = true;
		aByteArrayArray7 = new byte[4][2304];
		aClass46_1 = class46;
		aClass41_1 = class41;
		for (int i = 0; i < 64; i++)
		{
			anIntArray9[i] = GameFrame.method486(-(int) (i * 1.75) + 255, -(i * 4) + 255, -(i * 4) + 255);
		}
		for (int i = 0; i < 64; i++)
		{
			anIntArray9[i + 64] = GameFrame.method486(144, 0, i * 3);
		}
		for (int i = 0; i < 64; i++)
		{
			anIntArray9[i + 128] = GameFrame.method486(144 - (int) (i * 1.5), 0, -(int) (i * 1.5) + 192);
		}
		for (int i = 0; i < 64; i++)
		{
			anIntArray9[i + 192] = GameFrame.method486(48 - -(int) (1.5 * i), 0, -(int) (i * 1.5) + 96);
		}
	}
}
