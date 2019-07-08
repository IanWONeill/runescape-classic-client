package com.classic;

import java.io.DataInputStream;
import java.net.URL;

final class Class9
{
	int anInt64;
	int anInt65;
	String aString3 = null;
	int anInt66;
	int anInt67;
	int anInt68;
	static int anInt69;
	String aString4 = null;
	String aString5;
	static int anInt71;
	int anInt72;
	static int[] anIntArray20;
	static int[] anIntArray21;
	static int anInt73;
	static int[] anIntArray22;

	void method60(final int i, final String string, final String string_0_, final int i_1_, final String string_2_,
	        final int i_3_, final int i_4_, final int i_5_, final String string_6_, final int i_7_, final int i_8_,
	        final String string_9_)
	{
		this.aString3 = string_9_;
		this.anInt68 = i;
		this.anInt72 = i_8_;
		this.anInt65 = i_7_;
		anInt71++;
		this.aString4 = string;
		if (i_5_ != -30365)
		{
			method60(81, null, null, 84, null, -24, 55, -90, null, 88, 74, null);
		}
		this.aString5 = string_6_;
		this.anInt66 = i_1_;
		this.anInt67 = i_4_;
		this.anInt64 = i_3_;
	}

	static void method61(final Throwable throwable, final int i, final String string)
	{
		anInt73++;
		try
		{
			if (i < 80)
			{
				method61(null, 100, null);
			}
			String string_10_ = "";
			if (throwable != null)
			{
				string_10_ = Class21.method134(26347, throwable);
			}
			if (string != null)
			{
				if (throwable != null)
				{
					string_10_ = new StringBuilder().append(string_10_).append(" | ").toString();
				}
				string_10_ = new StringBuilder().append(string_10_).append(string).toString();
			}
			GameImage.method310(3, string_10_);
			string_10_ = Class6.method22(string_10_, ":", "%3a", -69);
			string_10_ = Class6.method22(string_10_, "@", "%40", -69);
			string_10_ = Class6.method22(string_10_, "&", "%26", -118);
			string_10_ = Class6.method22(string_10_, "#", "%23", -110);
			if (GameImageMiddleMan.anApplet2 != null)
			{
				final Class20 class20 = (Class48.aClass32_3
				        .method216(
				                new URL(GameImageMiddleMan.anApplet2.getCodeBase(),
				                        new StringBuilder().append("clienterror.ws?c=").append(Class48.anInt579)
				                                .append("&u=")
				                                .append(Class2.aString1 == null ? new StringBuilder().append("")
				                                        .append(GameWindow.aLong16).toString() : Class2.aString1)
				                                .append("&v1=").append(Class32.aString13).append("&v2=")
				                                .append(Class32.aString16).append("&e=").append(string_10_).toString()),
				                false));
				while (class20.anInt216 == 0)
				{
					Class7.unknownSleep(117, 1L);
				}
				if (class20.anInt216 == 1)
				{
					final DataInputStream datainputstream = (DataInputStream) class20.socket;
					datainputstream.read();
					datainputstream.close();
				}
			}
		}
		catch (final Exception exception)
		{
			/* empty */
		}
	}

	static String method62(final int i, final byte i_11_, final int i_12_, final byte[] is)
	{
		anInt69++;
		final char[] cs = new char[i];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i; i_14_++)
		{
			int i_15_ = 0xff & is[i_14_ + i_12_];
			if (i_15_ != 0)
			{
				if ((i_15_ >= 128) && (i_15_ < 160))
				{
					int i_16_ = GameWindow.aCharArray3[i_15_ - 128];
					if (i_16_ == 0)
					{
						i_16_ = 63;
					}
					i_15_ = i_16_;
				}
				cs[i_13_++] = (char) i_15_;
			}
		}
		return new String(cs, 0, i_13_);
	}

	static void sleep(final long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException e) {}
	}
}
