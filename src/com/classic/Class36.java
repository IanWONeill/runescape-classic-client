package com.classic;

import java.awt.Image;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

final class Class36 implements ImageProducer, ImageObserver
{
	static int anInt378;
	static int[] anIntArray86;
	static int anInt379;
	static int anInt380;
	static int anInt381;
	static int anInt382;
	static int anInt383;
	static int anInt384;
	static int anInt385;

	@Override
	public boolean imageUpdate(final Image image, final int i, final int i_0_, final int i_1_, final int i_2_,
	        final int i_3_)
	{
		anInt380++;
		return true;
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer imageconsumer)
	{
		anInt384++;
		return imageconsumer == Class45.anImageConsumer1;
	}

	static void method229(final long l, final int i)
	{
		if (i != 12)
		{
			method229(29L, 88);
		}
		PacketConstruction.aCalendar1.setTime(new Date(l));
		anInt378++;
	}

	static void method230(final URL url, final GameWindow applet_sub1, final byte unused) throws IOException
	{
		anInt385++;
		Class5.anURL1 = url;
		Class10.anApplet_Sub1_1 = applet_sub1;
		final URL url_4_ = new URL(Class5.anURL1,
		        new StringBuilder().append("contentcrcs").append(Long.toHexString(Class52.method377(0))).toString());
		Class3.aString2 = "Checking for new content";
		final byte[] is = Class3.method7(url_4_, true, (byte) 48);
		final ByteBuffer class27_sub1 = new ByteBuffer(is);
		for (int i_5_ = 0; 12 > i_5_; i_5_++)
		{
			Class21.anIntArray47[i_5_] = class27_sub1.method404((byte) -104);
		}
		class27_sub1.method404((byte) -47);
		if (!class27_sub1.method393(0))
		{
			throw new IOException("Invalid CRC in CRC check file");
		}
		try
		{
			if (GameFrame.aClass32_4.aClass28_2 != null)
			{
				Class24.aClass39_2 = new Class39(GameFrame.aClass32_4.aClass28_2, 5200, 0);
				Class1.aClass39_1 = new Class39(GameFrame.aClass32_4.aClass28_3, 6000, 0);
				AClass1_Sub1.aClass47_1 = new Class47(0, Class24.aClass39_2, Class1.aClass39_1, 1000000);
				GameFrame.aClass32_4.aClass28_3 = null;
				GameFrame.aClass32_4.aClass28_2 = null;
			}
		}
		catch (final IOException ioexception)
		{
			Class1.aClass39_1 = null;
			Class24.aClass39_2 = null;
		}
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer imageconsumer)
	{
		Class45.anImageConsumer1 = imageconsumer;
		anInt379++;
		imageconsumer.setDimensions(IOException_Sub1.anInt672, Class7.anInt60);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(Class41.aColorModel1);
		imageconsumer.setHints(14);
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer imageconsumer)
	{
		anInt382++;
	}

	@Override
	public void startProduction(final ImageConsumer imageconsumer)
	{
		addConsumer(imageconsumer);
		anInt383++;
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer imageconsumer)
	{
		anInt381++;
		if (imageconsumer == Class45.anImageConsumer1)
		{
			Class45.anImageConsumer1 = null;
		}
	}
}
