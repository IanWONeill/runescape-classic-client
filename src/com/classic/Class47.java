package com.classic;

import java.io.EOFException;
import java.io.IOException;
import java.net.URL;

final class Class47
{
	private Class39 aClass39_3;
	private Class39 aClass39_4 = null;
	static int anInt570;
	static int anInt571;
	static int anInt572;
	static String[] aStringArray34;
	static byte[] aByteArray18;
	static int anInt573;
	private int anInt574 = 65000;
	static int anInt575;
	static Class38 aClass38_6 = new Class38("WTRC", "office", "_rc", 1);
	private final int anInt576;
	static URL anURL3 = null;
	static int anInt577;
	static int[] anIntArray135;
	static int[] anIntArray136;

	private boolean method365(final byte[] is, boolean bool, final int i, final byte i_0_, final int i_1_)
	{
		anInt570++;
		synchronized (aClass39_3)
		{
			boolean bool_3_;
			try
			{
				int i_4_;
				if (!bool)
				{
					i_4_ = (int) ((519L + aClass39_3.method249(false)) / 520L);
					if (i_4_ == 0)
					{
						i_4_ = 1;
					}
				}
				else
				{
					if ((i * 6) + 6 > aClass39_4.method249(false))
					{
						final boolean bool_5_ = false;
						return bool_5_;
					}
					aClass39_4.method247(i * 6, -112);
					aClass39_4.method253((byte) 99, 0, 6, Class24.aByteArray14);
					i_4_ = ((0xff0000 & (Class24.aByteArray14[3] << 16))
					        - (-(0xff & Class24.aByteArray14[5]) + -((Class24.aByteArray14[4] & 0xff) << 8)));
					if ((i_4_ <= 0) || (i_4_ > (aClass39_3.method249(false) / 520L)))
					{
						final boolean bool_6_ = false;
						return bool_6_;
					}
				}
				Class24.aByteArray14[0] = (byte) (i_1_ >> 16);
				Class24.aByteArray14[3] = (byte) (i_4_ >> 16);
				Class24.aByteArray14[5] = (byte) i_4_;
				Class24.aByteArray14[4] = (byte) (i_4_ >> 8);
				Class24.aByteArray14[2] = (byte) i_1_;
				Class24.aByteArray14[1] = (byte) (i_1_ >> 8);
				aClass39_4.method247(i * 6, -121);
				aClass39_4.method248(Class24.aByteArray14, 6, -84, 0);
				int i_7_ = 0;
				int i_8_ = 0;
				while (i_1_ > i_7_)
				{
					int i_9_ = 0;
					if (bool)
					{
						aClass39_3.method247(i_4_ * 520, -101);
						int i_10_;
						int i_11_;
						int i_12_;
						if (i <= 65535)
						{
							try
							{
								aClass39_3.method253((byte) 115, 0, 8, Class24.aByteArray14);
							}
							catch (final EOFException eofexception)
							{
								break;
							}
							i_12_ = ((0xff & Class24.aByteArray14[3]) + ((0xff & Class24.aByteArray14[2]) << 8));
							i_11_ = (((0xff & Class24.aByteArray14[0]) << 8) + (Class24.aByteArray14[1] & 0xff));
							i_10_ = 0xff & Class24.aByteArray14[7];
							i_9_ = ((((0xff & Class24.aByteArray14[5]) << 8) - -(Class24.aByteArray14[6] & 0xff))
							        + (0xff0000 & (Class24.aByteArray14[4] << 16)));
						}
						else
						{
							try
							{
								aClass39_3.method253((byte) 102, 0, 10, Class24.aByteArray14);
							}
							catch (final EOFException eofexception)
							{
								break;
							}
							i_10_ = 0xff & Class24.aByteArray14[9];
							i_11_ = (((0xff & Class24.aByteArray14[3]) + ((0xff & Class24.aByteArray14[0]) << 24)
							        + ((Class24.aByteArray14[2] & 0xff) << 8))
							        - -((Class24.aByteArray14[1] << 16) & 0xff0000));
							i_12_ = ((Class24.aByteArray14[5] & 0xff) + ((Class24.aByteArray14[4] << 8) & 0xff00));
							i_9_ = ((Class24.aByteArray14[8] & 0xff) + ((Class24.aByteArray14[7] << 8) & 0xff00)
							        + ((Class24.aByteArray14[6] << 16) & 0xff0000));
						}
						if ((i != i_11_) || (i_12_ != i_8_) || (i_10_ != anInt576))
						{
							final boolean bool_13_ = false;
							return bool_13_;
						}
						if ((0 > i_9_) || (i_9_ > (aClass39_3.method249(false) / 520L)))
						{
							final boolean bool_14_ = false;
							return bool_14_;
						}
					}
					if (i_9_ == 0)
					{
						i_9_ = (int) ((aClass39_3.method249(false) + 519L) / 520L);
						bool = false;
						if (i_9_ == 0)
						{
							i_9_++;
						}
						if (i_9_ == i_4_)
						{
							i_9_++;
						}
					}
					if ((i_1_ + -i_7_) <= 512)
					{
						i_9_ = 0;
					}
					if (65535 < i)
					{
						Class24.aByteArray14[9] = (byte) anInt576;
						Class24.aByteArray14[5] = (byte) i_8_;
						Class24.aByteArray14[1] = (byte) (i >> 16);
						Class24.aByteArray14[7] = (byte) (i_9_ >> 8);
						Class24.aByteArray14[0] = (byte) (i >> 24);
						Class24.aByteArray14[6] = (byte) (i_9_ >> 16);
						Class24.aByteArray14[8] = (byte) i_9_;
						Class24.aByteArray14[3] = (byte) i;
						Class24.aByteArray14[2] = (byte) (i >> 8);
						Class24.aByteArray14[4] = (byte) (i_8_ >> 8);
						aClass39_3.method247(i_4_ * 520, -124);
						aClass39_3.method248(Class24.aByteArray14, 10, 104, 0);
						int i_15_ = i_1_ + -i_7_;
						if (510 < i_15_)
						{
							i_15_ = 510;
						}
						aClass39_3.method248(is, i_15_, -112, i_7_);
						i_7_ += i_15_;
					}
					else
					{
						Class24.aByteArray14[7] = (byte) anInt576;
						Class24.aByteArray14[6] = (byte) i_9_;
						Class24.aByteArray14[4] = (byte) (i_9_ >> 16);
						Class24.aByteArray14[5] = (byte) (i_9_ >> 8);
						Class24.aByteArray14[0] = (byte) (i >> 8);
						Class24.aByteArray14[3] = (byte) i_8_;
						Class24.aByteArray14[2] = (byte) (i_8_ >> 8);
						Class24.aByteArray14[1] = (byte) i;
						aClass39_3.method247(i_4_ * 520, -112);
						aClass39_3.method248(Class24.aByteArray14, 8, 113, 0);
						int i_16_ = i_1_ + -i_7_;
						if (512 < i_16_)
						{
							i_16_ = 512;
						}
						aClass39_3.method248(is, i_16_, 49, i_7_);
						i_7_ += i_16_;
					}
					i_4_ = i_9_;
					i_8_++;
				}
				bool_3_ = true;
			}
			catch (final IOException ioexception)
			{
				final boolean bool_17_ = false;
				return bool_17_;
			}
			return bool_3_;
		}
	}

	boolean method366(final byte[] is, final int i, final int i_19_)
	{
		anInt571++;
		synchronized (aClass39_3)
		{
			if ((0 > i) || (i > anInt574))
			{
				throw new IllegalArgumentException();
			}
			boolean bool = method365(is, true, i_19_, (byte) -19, i);
			if (!bool)
			{
				bool = method365(is, false, i_19_, (byte) -112, i);
			}
			final boolean bool_20_ = bool;
			return bool_20_;
		}
	}

	static void method367(final int[] is, int i, int i_21_, final int i_22_, int i_23_, final int[] is_24_, int i_25_,
	        int i_26_, final int i_27_, final int i_28_, final int i_29_, final int i_30_, int i_31_, int i_32_,
	        int i_33_, int i_34_)
	{
		anInt575++;
		if (i_28_ > 0)
		{
			int i_35_ = 0;
			int i_36_ = 0;
			i_21_ <<= 2;
			if (i != 0)
			{
				i_35_ = (i_26_ / i) << 7;
				i_36_ = (i_32_ / i) << 7;
			}
			if (0 <= i_35_)
			{
				if (i_35_ > 16256)
				{
					i_35_ = 16256;
				}
			}
			else
			{
				i_35_ = 0;
			}
			for (int i_37_ = i_28_; i_37_ > 0; i_37_ -= 16)
			{
				i_34_ = i_36_;
				i = i_22_ + i;
				i_32_ += i_30_;
				i_33_ = i_35_;
				i_26_ = i_29_ + i_26_;
				if (i != 0)
				{
					i_35_ = (i_26_ / i) << 7;
					i_36_ = (i_32_ / i) << 7;
				}
				if (i_35_ >= 0)
				{
					if (i_35_ > 16256)
					{
						i_35_ = 16256;
					}
				}
				else
				{
					i_35_ = 0;
				}
				final int i_38_ = (i_36_ - i_34_) >> 4;
				final int i_39_ = (-i_33_ + i_35_) >> 4;
				i_33_ = (i_31_ & 0x600000) + i_33_;
				int i_40_ = i_31_ >> 23;
				i_31_ = i_21_ + i_31_;
				if (16 <= i_37_)
				{
					if ((i_23_ = is_24_[(i_33_ >> 7) + (i_34_ & 0x3f80)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) - -(i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_33_ = i_39_ + i_33_;
					i_34_ = i_38_ + i_34_;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_33_ = i_39_ + i_33_;
					i_34_ = i_38_ + i_34_;
					i_25_++;
					i_33_ = (i_31_ & 0x600000) + (0x3fff & i_33_);
					i_40_ = i_31_ >> 23;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_31_ = i_21_ + i_31_;
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if ((i_23_ = is_24_[(i_33_ >> 7) + (i_34_ & 0x3f80)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if (0 != (i_23_ = (is_24_[(0x3f80 & i_34_) - -(i_33_ >> 7)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if (0 != (i_23_ = (is_24_[(i_34_ & 0x3f80) + (i_33_ >> 7)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_33_ = i_39_ + i_33_;
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = (i_31_ & 0x600000) + (i_33_ & 0x3fff);
					i_40_ = i_31_ >> 23;
					if (0 != (i_23_ = (is_24_[(i_33_ >> 7) + (0x3f80 & i_34_)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_31_ = i_21_ + i_31_;
					i_33_ = i_39_ + i_33_;
					i_34_ = i_38_ + i_34_;
					i_25_++;
					if ((i_23_ = is_24_[(i_33_ >> 7) + (i_34_ & 0x3f80)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
					i_33_ = i_39_ + i_33_;
					i_34_ = i_38_ + i_34_;
					if (0 != (i_23_ = (is_24_[(i_34_ & 0x3f80) - -(i_33_ >> 7)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					i_25_++;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					i_25_++;
					i_33_ = (0x600000 & i_31_) + (0x3fff & i_33_);
					i_40_ = i_31_ >> 23;
					if (0 != (i_23_ = (is_24_[(0x3f80 & i_34_) - -(i_33_ >> 7)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_31_ = i_21_ + i_31_;
					i_25_++;
					i_34_ = i_38_ + i_34_;
					i_33_ = i_39_ + i_33_;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_33_ = i_39_ + i_33_;
					i_25_++;
					i_34_ = i_38_ + i_34_;
					if ((i_23_ = is_24_[(0x3f80 & i_34_) + (i_33_ >> 7)] >>> i_40_) != 0)
					{
						is[i_25_] = i_23_;
					}
					i_33_ = i_39_ + i_33_;
					i_34_ = i_38_ + i_34_;
					i_25_++;
					if (0 != (i_23_ = (is_24_[(i_33_ >> 7) + (0x3f80 & i_34_)] >>> i_40_)))
					{
						is[i_25_] = i_23_;
					}
					i_25_++;
				}
				else
				{
					for (int i_41_ = 0; i_37_ > i_41_; i_41_++)
					{
						if (0 != (i_23_ = (is_24_[(0x3f80 & i_34_) - -(i_33_ >> 7)] >>> i_40_)))
						{
							is[i_25_] = i_23_;
						}
						i_25_++;
						i_34_ = i_38_ + i_34_;
						i_33_ = i_39_ + i_33_;
						if ((0x3 & i_41_) == 3)
						{
							i_33_ = (i_31_ & 0x600000) + (i_33_ & 0x3fff);
							i_40_ = i_31_ >> 23;
							i_31_ = i_21_ + i_31_;
						}
					}
				}
			}
			if (i_27_ != -1504)
			{
				method367(null, -99, 62, -71, 118, null, 9, 72, 103, -20, 12, 125, -91, 63, -80, -101);
			}
		}
	}

	byte[] method368(final int i_42_)
	{
		anInt573++;
		synchronized (aClass39_3)
		{
			byte[] is;
			try
			{
				if (aClass39_4.method249(false) < (i_42_ * 6) - -6)
				{
					final byte[] is_43_ = null;
					return is_43_;
				}
				aClass39_4.method247(i_42_ * 6, -90);
				aClass39_4.method253((byte) 109, 0, 6, Class24.aByteArray14);
				final int i_44_ = ((Class24.aByteArray14[2] & 0xff) + (0xff0000 & (Class24.aByteArray14[0] << 16))
				        + ((Class24.aByteArray14[1] & 0xff) << 8));
				int i_45_ = ((((Class24.aByteArray14[3] << 16) & 0xff0000) - -((Class24.aByteArray14[4] & 0xff) << 8))
				        + (0xff & Class24.aByteArray14[5]));
				if ((0 > i_44_) || (i_44_ > anInt574))
				{
					final byte[] is_46_ = null;
					return is_46_;
				}
				if ((0 >= i_45_) || ((aClass39_3.method249(false) / 520L) < i_45_))
				{
					final byte[] is_47_ = null;
					return is_47_;
				}
				final byte[] is_48_ = new byte[i_44_];
				int i_49_ = 0;
				int i_50_ = 0;
				while (i_44_ > i_49_)
				{
					if (i_45_ == 0)
					{
						final byte[] is_51_ = null;
						return is_51_;
					}
					aClass39_3.method247(i_45_ * 520, -115);
					int i_52_ = -i_49_ + i_44_;
					int i_53_;
					int i_54_;
					int i_55_;
					int i_56_;
					int i_57_;
					if (65535 < i_42_)
					{
						i_53_ = 10;
						if (510 < i_52_)
						{
							i_52_ = 510;
						}
						aClass39_3.method253((byte) 108, 0, i_53_ + i_52_, Class24.aByteArray14);
						i_54_ = (((0xff & Class24.aByteArray14[7]) << 8)
						        + (((0xff & Class24.aByteArray14[6]) << 16) - -(0xff & Class24.aByteArray14[8])));
						i_57_ = 0xff & Class24.aByteArray14[9];
						i_55_ = ((0xff & Class24.aByteArray14[5]) + ((Class24.aByteArray14[4] << 8) & 0xff00));
						i_56_ = (((Class24.aByteArray14[0] << 24) & ~0xffffff)
						        + (((Class24.aByteArray14[2] & 0xff) << 8) - -(Class24.aByteArray14[3] & 0xff))
						        + ((Class24.aByteArray14[1] << 16) & 0xff0000));
					}
					else
					{
						i_53_ = 8;
						if (i_52_ > 512)
						{
							i_52_ = 512;
						}
						aClass39_3.method253((byte) -41, 0, i_52_ + i_53_, Class24.aByteArray14);
						i_54_ = (((Class24.aByteArray14[5] & 0xff) << 8) + (Class24.aByteArray14[6] & 0xff)
						        + (0xff0000 & (Class24.aByteArray14[4] << 16)));
						i_55_ = (((Class24.aByteArray14[2] << 8) & 0xff00) - -(0xff & Class24.aByteArray14[3]));
						i_56_ = ((Class24.aByteArray14[1] & 0xff) + (0xff00 & (Class24.aByteArray14[0] << 8)));
						i_57_ = Class24.aByteArray14[7] & 0xff;
					}
					if ((i_56_ != i_42_) || (i_55_ != i_50_) || (i_57_ != anInt576))
					{
						final byte[] is_58_ = null;
						return is_58_;
					}
					if ((0 > i_54_) || ((aClass39_3.method249(false) / 520L) < i_54_))
					{
						final byte[] is_59_ = null;
						return is_59_;
					}
					final int i_60_ = i_52_ + i_53_;
					i_50_++;
					for (int i_61_ = i_53_; i_61_ < i_60_; i_61_++)
					{
						is_48_[i_49_++] = Class24.aByteArray14[i_61_];
					}
					i_45_ = i_54_;
				}
				is = is_48_;
			}
			catch (final IOException ioexception)
			{
				final byte[] is_62_ = null;
				return is_62_;
			}
			return is;
		}
	}

	static int method369(final int i, final int i_63_)
	{
		return i ^ i_63_;
	}

	@Override
	public String toString()
	{
		anInt572++;
		return new StringBuilder().append("").append(anInt576).toString();
	}

	Class47(final int i, final Class39 class39, final Class39 class39_64_, final int i_65_)
	{
		aClass39_3 = null;
		anInt576 = i;
		anInt574 = i_65_;
		aClass39_3 = class39;
		aClass39_4 = class39_64_;
	}
}
