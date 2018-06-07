package com.classic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class16_Sub1 extends Class16 implements Runnable
{
	static int anInt594;
	private final Socket aSocket1;
	private int anInt595;
	static int anInt596;
	private byte[] aByteArray21;
	private boolean aBool30;
	static int[] anIntArray139;
	static String[] aStringArray35;
	private boolean aBool31 = true;
	private final OutputStream anOutputStream1;
	static int[] anIntArray140;
	private int anInt597 = 0;
	static int anInt598;
	private final byte[] aByteArray22;
	static byte[][] aByteArrayArray15 = new byte[1000][];
	private final InputStream anInputStream1;
	static int[] anIntArray141;
	static int anInt599;
	static int anInt600;
	static byte[] aByteArray23;
	static Class38 aClass38_7 = new Class38("LOCAL", "", "local", 4);
	static int anInt601;
	static int anInt602;
	static int anInt603;

	@Override
	void method119(final byte i)
	{
		super.method119(i);
		anInt603++;
		aBool30 = true;
		try
		{
			if (anInputStream1 != null)
			{
				anInputStream1.close();
			}
			if (anOutputStream1 != null)
			{
				anOutputStream1.close();
			}
			if (aSocket1 != null)
			{
				aSocket1.close();
			}
		}
		catch (final IOException ioexception)
		{
			System.out.println("Error closing stream");
		}
		aBool31 = true;
		synchronized (this)
		{
			notify();
		}
		aByteArray21 = null;
	}

	@Override
	public void run()
	{
		anInt596++;
		while (!aBool31)
		{
			int i;
			int i_0_;
			synchronized (this)
			{
				if (anInt597 == anInt595)
				{
					try
					{
						this.wait();
					}
					catch (final InterruptedException interruptedexception)
					{
						/* empty */
					}
				}
				if (aBool31)
				{
					break;
				}
				if (anInt597 >= anInt595)
				{
					i = anInt597 + -anInt595;
				}
				else
				{
					i = 5000 - anInt595;
				}
				i_0_ = anInt595;
			}
			if (0 < i)
			{
				try
				{
					anOutputStream1.write(aByteArray21, i_0_, i);
				}
				catch (final IOException ioexception)
				{
					this.aBool7 = true;
					this.aString9 = new StringBuilder().append("Twriter:").append(ioexception).toString();
				}
				anInt595 = (i + anInt595) % 5000;
				try
				{
					if (anInt595 == anInt597)
					{
						anOutputStream1.flush();
					}
				}
				catch (final IOException ioexception)
				{
					this.aBool7 = true;
					this.aString9 = new StringBuilder().append("Twriter:").append(ioexception).toString();
				}
			}
		}
	}

	static int method381(final int i, final byte[] is, final byte i_1_)
	{
		if (i_1_ <= 108)
		{
			method381(109, null, (byte) 99);
		}
		anInt602++;
		return ((0xff & is[i - -3]) + ((is[i + 2] << 8) & 0xff00) + ((is[i + 1] & 0xff) << 16)
		        + (~0xffffff & (is[i] << 24)));
	}

	@Override
	int method123(final byte i) throws IOException
	{
		anInt598++;
		if (!aBool30 != true)
		{
			return 0;
		}
		return anInputStream1.available();
	}

	@Override
	void method127(final int i, final int i_2_, final byte[] is, final int i_3_) throws IOException
	{
		anInt601++;
		if (aBool30 == false)
		{
			int i_4_ = 0;
			int i_5_;
			for (/**/; i_4_ < i; i_4_ += i_5_)
			{
				if ((i_5_ = anInputStream1.read(is, i_4_ + i_2_, -i_4_ + i)) <= 0)
				{
					throw new IOException("EOF");
				}
			}
		}
	}

	@Override
	int method129(final int i) throws IOException
	{
		anInt600++;
		if (aBool30 != false)
		{
			return 0;
		}
		method127(1, 0, aByteArray22, 1230517990);
		return 0xff & aByteArray22[0];
	}

	@Override
	void method117(final int i, final int i_7_, final byte[] is, final int i_8_) throws IOException
	{
		anInt594++;
		if (aBool30 != true)
		{
			if (aByteArray21 == null)
			{
				aByteArray21 = new byte[5000];
			}
			synchronized (this)
			{
				for (int i_9_ = 0; i_8_ > i_9_; i_9_++)
				{
					aByteArray21[anInt597] = is[i_9_ + i_7_];
					anInt597 = (anInt597 + 1) % 5000;
					if (anInt597 == ((anInt595 + 4900) % 5000))
					{
						throw new IOException("buffer overflow");
					}
				}
				notify();
			}
		}
	}

	static void method382(int i, final int[] is, int i_11_, final int[] is_12_, final int i_13_, int i_14_, int i_15_,
	        final int i_16_, int i_17_, int i_18_, final int i_19_, int i_20_, final int i_21_, int i_22_,
	        final int i_23_)
	{
		anInt599++;
		if (i_19_ > 0)
		{
			int i_24_ = 0;
			int i_25_ = 0;
			i_22_ <<= 2;
			if (i_14_ != 0)
			{
				i_25_ = (i_11_ / i_14_) << 6;
				i_24_ = (i_18_ / i_14_) << 6;
			}
			if (0 > i_24_)
			{
				i_24_ = 0;
			}
			else if (i_24_ > 4032)
			{
				i_24_ = 4032;
			}
			for (int i_26_ = i_19_; i_26_ > 0; i_26_ -= 16)
			{
				i_15_ = i_24_;
				i_18_ = i_13_ + i_18_;
				i_11_ += i_16_;
				i_14_ += i_21_;
				i_17_ = i_25_;
				if (i_14_ != 0)
				{
					i_25_ = (i_11_ / i_14_) << 6;
					i_24_ = (i_18_ / i_14_) << 6;
				}
				if (i_24_ < 0)
				{
					i_24_ = 0;
				}
				else if (i_24_ > 4032)
				{
					i_24_ = 4032;
				}
				final int i_27_ = (i_25_ + -i_17_) >> 4;
				final int i_28_ = (-i_15_ + i_24_) >> 4;
				int i_29_ = i >> 20;
				i_15_ = (0xc0000 & i) + i_15_;
				i = i_22_ + i;
				if (16 <= i_26_)
				{
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(i_17_, 4032)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) + (i_15_ >> 6))] >>> i_29_;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) + (i_15_ >> 6))] >>> i_29_;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = is_12_[(Class52.method378(i_17_, 4032) - -(i_15_ >> 6))] >>> i_29_;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					i_15_ = (i_15_ & 0xfff) + (i & 0xc0000);
					i_29_ = i >> 20;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(i_17_, 4032)] >>> i_29_);
					i = i_22_ + i;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					i_29_ = i >> 20;
					i_15_ = (i_15_ & 0xfff) + (i & 0xc0000);
					i = i_22_ + i;
					is[i_20_++] = is_12_[(Class52.method378(i_17_, 4032) - -(i_15_ >> 6))] >>> i_29_;
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) - -(i_15_ >> 6))] >>> i_29_;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(i_17_, 4032)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					i_15_ = (0xc0000 & i) + (i_15_ & 0xfff);
					i_29_ = i >> 20;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) + (i_15_ >> 6))] >>> i_29_;
					i = i_22_ + i;
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) + (i_15_ >> 6))] >>> i_29_;
					i_15_ = i_28_ + i_15_;
					i_17_ = i_27_ + i_17_;
					is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
					i_17_ = i_27_ + i_17_;
					i_15_ = i_28_ + i_15_;
					is[i_20_++] = is_12_[(Class52.method378(4032, i_17_) - -(i_15_ >> 6))] >>> i_29_;
				}
				else
				{
					for (int i_30_ = 0; i_30_ < i_26_; i_30_++)
					{
						is[i_20_++] = (is_12_[(i_15_ >> 6) + Class52.method378(4032, i_17_)] >>> i_29_);
						i_17_ = i_27_ + i_17_;
						i_15_ = i_28_ + i_15_;
						if ((i_30_ & 0x3) == 3)
						{
							i_15_ = (0xfff & i_15_) + (i & 0xc0000);
							i_29_ = i >> 20;
							i = i_22_ + i;
						}
					}
				}
			}
		}
	}

	Class16_Sub1(final Socket socket, final Applet_Sub1 applet_sub1) throws IOException
	{
		aBool30 = false;
		aByteArray22 = new byte[1];
		anInt595 = 0;
		aSocket1 = socket;
		anInputStream1 = socket.getInputStream();
		anOutputStream1 = socket.getOutputStream();
		aBool31 = false;
		applet_sub1.method477((byte) -62, this);
	}
}
