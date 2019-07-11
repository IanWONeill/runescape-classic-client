package com.classic;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

class PacketConstruction
{
	String errorText;
	static String[] aStringArray14 = { "Enter number of items to remove and press enter" };
	static Calendar aCalendar1;
	private int packetReadCount = 0;
	private final int maxPacketLength;
	private int length;
	boolean error;
	static byte[][] aByteArrayArray8;
	private int anInt181;
	private int packetStart;
	private Isaac serverRandom;
	static int anInt185 = 0;
	private Isaac clientRandom;
	Class27_Sub1_Sub1 aClass27_Sub1_Sub1_1;
	int maxPacketReadCount;

	private int readPacket(final byte[] data)
	{
		do
		{
			int i_0_;
			try
			{
				packetReadCount++;
				if ((maxPacketReadCount > 0) && (packetReadCount > maxPacketReadCount))
				{
					error = true;
					maxPacketReadCount += maxPacketReadCount;
					errorText = "time-out";
					return 0;
				}
				
				if ((length == 0) && inputStreamAvailable() >= 2)
				{
					length = readInputStream();
					if (length >= 160)
					{
						length = ((length - 160) * 256) + readInputStream();
					}
				}
				if ((0 >= length) || (inputStreamAvailable() < length))
				{
					break;
				}
				if (160 > length)
				{
					data[length - 1] = (byte) readInputStream();
					if (length > 1)
						readInputStream(length - 1, data);
				}
				else
				{
					readInputStream(length, data);
				}
				final int i_1_ = length;
				packetReadCount = 0;
				length = 0;
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
		if (i_2_ < 79)
		{
			method115(-56, 3);
		}
		return new StringBuilder().append(0xff & (i >> 24)).append(".").append((0xffc5f7 & i) >> 16).append(".")
		        .append((i >> 8) & 0xff).append(".").append(0xff & i).toString();
	}

	void method116(final int[] is)
	{
		serverRandom = new Isaac(is);
		clientRandom = new Isaac(is);
	}

	void method117(final int i, final int i_3_, final byte[] is, final int i_4_) throws IOException {}

	void createPacket(final int id)
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
		this.aClass27_Sub1_Sub1_1.position = packetStart + 2;
		this.aClass27_Sub1_Sub1_1.put(id);
	}

	void method119(final byte i)
	{
		if (i != -122)
		{
			decodePacketCommand(65);
		}
	}

	void method120() throws IOException
	{
		finishPacket(2);
		writePacket(0);
	}

	private void readInputStream(final int length, final byte[] data) throws IOException
	{
		readInputStream(length, 0, data);
	}

	int decodePacketCommand(final int command)
	{
		return (command - serverRandom.random()) & 0xff;
	}

	int inputStreamAvailable() throws IOException { return 0; }

	void writePacket(final int i_8_) throws IOException
	{
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
		class27_sub1_sub1.position = i;
		return readPacket(class27_sub1_sub1.buffer);
	}

	void finishPacket(final int i)
	{
		if (clientRandom != null)
		{
			final int packetId = this.aClass27_Sub1_Sub1_1.buffer[packetStart + 2] & 0xff;
			this.aClass27_Sub1_Sub1_1.buffer[packetStart + 2] = (byte) (clientRandom.random() + packetId);
		}
		final int Length = ((this.aClass27_Sub1_Sub1_1.position) - packetStart - i);
		if (160 > Length)
		{
			this.aClass27_Sub1_Sub1_1.buffer[packetStart] = (byte) Length;
			this.aClass27_Sub1_Sub1_1.position--;
			this.aClass27_Sub1_Sub1_1.buffer[packetStart + 1] = (this.aClass27_Sub1_Sub1_1.buffer[this.aClass27_Sub1_Sub1_1.position]);
		}
		else
		{
			this.aClass27_Sub1_Sub1_1.buffer[packetStart] = (byte) ((Length / 256) + 160);
			this.aClass27_Sub1_Sub1_1.buffer[packetStart + 1] = (byte) Class52.bitwiseAnd(Length, 255);
		}
		if (maxPacketLength <= 10000)
		{
			final int i_11_ = this.aClass27_Sub1_Sub1_1.buffer[packetStart + 2] & 0xff;
			Class22.packetCommandCount[i_11_]++;
			Class10.packetCommandLength[i_11_] += this.aClass27_Sub1_Sub1_1.position - packetStart;
		}
		packetStart = (this.aClass27_Sub1_Sub1_1.position);
	}

	void readInputStream(final int length, final int offset, final byte[] data) throws IOException {}

	boolean containsData(final int i)
	{
		if (i < 17)
		{
			decodePacketCommand(93);
		}
		if (0 < packetStart)
		{
			return true;
		}
		return false;
	}

	int readInputStream() throws IOException { return 0; }

	protected PacketConstruction()
	{
		this.errorText = "";
		length = 0;
		this.error = false;
		anInt181 = 0;
		maxPacketLength = 5000;
		packetStart = 0;
		this.maxPacketReadCount = 0;
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
