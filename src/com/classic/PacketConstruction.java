package com.classic;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

class PacketConstruction
{
	static int anInt170;
	String errorText;
	static int anInt171;
	static int anInt172;
	static int anInt173;
	static String[] aStringArray14 = { "Enter number of items to remove and press enter" };
	static int anInt174;
	static Calendar aCalendar1;
	static int anInt175;
	private int anInt176 = 0;
	private final int maxPacketLength;
	private int anInt178;
	boolean error;
	static byte[][] aByteArrayArray8;
	static int anInt179;
	static int anInt180;
	private int anInt181;
	private int packetStart;
	private Class7 aClass7_1;
	static int anInt183;
	static int anInt184;
	static int anInt185 = 0;
	static int anInt186;
	private Class7 aClass7_2;
	static int anInt187;
	static int anInt188;
	static int anInt189;
	Class27_Sub1_Sub1 aClass27_Sub1_Sub1_1;
	static int anInt190;
	static int anInt191;
	int anInt192;

	private int method114(final byte[] is, final int i)
	{
		anInt174++;
		do
		{
			int i_0_;
			try
			{
				anInt176++;
				if ((0 < this.anInt192) && (this.anInt192 < anInt176))
				{
					this.error = true;
					this.anInt192 += this.anInt192;
					this.errorText = "time-out";
					return 0;
				}
				if ((anInt178 == 0) && (2 <= method123((byte) -65)))
				{
					anInt178 = method129();
					if (160 <= anInt178)
					{
						anInt178 = ((anInt178 * 256) + -40960) - -method129();
					}
				}
				if ((0 >= anInt178) || (method123((byte) -65) < anInt178))
				{
					break;
				}
				if (160 > anInt178)
				{
					is[anInt178 + -1] = (byte) method129();
					if (anInt178 > 1)
					{
						method121(anInt178 + -1, is, -2986);
					}
				}
				else
				{
					method121(anInt178, is, -2986);
				}
				final int i_1_ = anInt178;
				anInt176 = 0;
				anInt178 = 0;
				i_0_ = i_1_;
			}
			catch (final IOException ioexception)
			{
				this.error = true;
				this.errorText = ioexception.getMessage();
				break;
			}
			return i_0_;
		}
		while (false);
		return 0;
	}

	static String method115(final int i, final int i_2_)
	{
		anInt191++;
		if (i_2_ < 79)
		{
			method115(-56, 3);
		}
		return new StringBuilder().append(0xff & (i >> 24)).append(".").append((0xffc5f7 & i) >> 16).append(".")
		        .append((i >> 8) & 0xff).append(".").append(0xff & i).toString();
	}

	void method116(final int[] is)
	{
		aClass7_1 = new Class7(is);
		anInt179++;
		aClass7_2 = new Class7(is);
	}

	void method117(final int i, final int i_3_, final byte[] is, final int i_4_) throws IOException
	{
		anInt184++;
	}

	void createPacket(final int i, final int i_6_)
	{
		if (packetStart > ((maxPacketLength * 4) / 5))
		{
			try
			{
				writePacket(0);
			}
			catch (final IOException ioexception)
			{
				this.error = true;
				this.errorText = ioexception.getMessage();
			}
		}
		anInt171++;
		this.aClass27_Sub1_Sub1_1.position = packetStart + 2;
		this.aClass27_Sub1_Sub1_1.put(i);
		if (i_6_ < 54)
		{
			createPacket(91, 92);
		}
	}

	void method119(final byte i)
	{
		if (i != -122)
		{
			method122(65, false);
		}
		anInt170++;
	}

	void method120() throws IOException
	{
		finishPacket(2);
		anInt188++;
		writePacket(0);
	}

	private void method121(final int i, final byte[] is, final int i_7_) throws IOException
	{
		anInt187++;
		method127(i, 0, is, 1230517990);
	}

	int method122(final int i, final boolean bool)
	{
		anInt173++;
		if (bool)
		{
			method122(64, false);
		}
		return 0xff & (i - aClass7_1.method47((byte) -106));
	}

	int method123(final byte i) throws IOException
	{
		anInt172++;
		return 0;
	}

	void writePacket(final int i_8_) throws IOException
	{
		anInt183++;
		if (this.error)
		{
			this.error = false;
			this.aClass27_Sub1_Sub1_1.position = 3;
			packetStart = 0;
			throw new IOException(this.errorText);
		}
		anInt181++;
		if (i_8_ <= anInt181)
		{
			if (packetStart > 0)
			{
				anInt181 = 0;
				method117(-121, 0, this.aClass27_Sub1_Sub1_1.buffer, packetStart);
			}
			packetStart = 0;
			this.aClass27_Sub1_Sub1_1.position = 3;
		}
	}

	int method125(final int i, final Class27_Sub1_Sub1 class27_sub1_sub1)
	{
		anInt189++;
		class27_sub1_sub1.position = i;
		return method114(class27_sub1_sub1.buffer, 124);
	}

	void finishPacket(final int i)
	{
		anInt180++;
		if (aClass7_2 != null)
		{
			final int i_9_ = ((this.aClass27_Sub1_Sub1_1.buffer[packetStart - -2]) & 0xff);
			this.aClass27_Sub1_Sub1_1.buffer[packetStart + 2] = (byte) (aClass7_2.method47((byte) -106) + i_9_);
		}
		final int i_10_ = ((this.aClass27_Sub1_Sub1_1.position) - packetStart - i);
		if (160 > i_10_)
		{
			this.aClass27_Sub1_Sub1_1.buffer[packetStart] = (byte) i_10_;
			this.aClass27_Sub1_Sub1_1.position--;
			this.aClass27_Sub1_Sub1_1.buffer[packetStart
			        + 1] = (this.aClass27_Sub1_Sub1_1.buffer[this.aClass27_Sub1_Sub1_1.position]);
		}
		else
		{
			this.aClass27_Sub1_Sub1_1.buffer[packetStart] = (byte) ((i_10_ / 256) + 160);
			this.aClass27_Sub1_Sub1_1.buffer[packetStart - -1] = (byte) Class52.method378(i_10_, 255);
		}
		if (maxPacketLength <= 10000)
		{
			final int i_11_ = ((this.aClass27_Sub1_Sub1_1.buffer[packetStart - -2]) & 0xff);
			Class22.anIntArray48[i_11_]++;
			Class10.anIntArray25[i_11_] += (this.aClass27_Sub1_Sub1_1.position) - packetStart;
		}
		packetStart = (this.aClass27_Sub1_Sub1_1.position);
	}

	void method127(final int i, final int i_12_, final byte[] is, final int i_13_) throws IOException
	{
		anInt175++;
	}

	boolean method128(final int i)
	{
		if (i < 17)
		{
			method122(93, false);
		}
		anInt186++;
		if (0 < packetStart)
		{
			return true;
		}
		return false;
	}

	int method129() throws IOException
	{
		anInt190++;
		return 0;
	}

	protected PacketConstruction()
	{
		this.errorText = "";
		anInt178 = 0;
		this.error = false;
		anInt181 = 0;
		maxPacketLength = 5000;
		packetStart = 0;
		this.anInt192 = 0;
		this.aClass27_Sub1_Sub1_1 = new Class27_Sub1_Sub1(maxPacketLength);
		this.aClass27_Sub1_Sub1_1.position = 3;
	}

	static
	{
		aByteArrayArray8 = new byte[50][];
		aCalendar1 = Calendar.getInstance();
		Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}
}