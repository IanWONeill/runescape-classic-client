package com.classic;

import java.awt.Image;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import org.custom.Custom;

final class Class36 implements ImageProducer, ImageObserver
{
	static int[] anIntArray86;

	@Override
	public boolean imageUpdate(final Image image, final int i, final int i_0_, final int i_1_, final int i_2_,
	        final int i_3_)
	{
		return true;
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer imageconsumer)
	{
		return imageconsumer == Class45.anImageConsumer1;
	}

	static void method229(final long l, final int i)
	{
		if (i != 12)
		{
			method229(29L, 88);
		}
		PacketConstruction.aCalendar1.setTime(new Date(l));
	}

	static void method230(final URL url, final GameWindow gameWindow) throws IOException
	{
		Class5.baseUrl = url;
		Menu.gameWindow = gameWindow;
		
		final URL url_contentcrcs;
		if(Custom.LOAD_FROM_DISK)
		{
			url_contentcrcs = new URL(Class5.baseUrl, "contentcrcs");
		}
		else
		{
			url_contentcrcs = new URL(Class5.baseUrl, "contentcrcs" + Long.toHexString(Class52.method377()));
		}

		Class3.aString2 = "Checking for new content";
		final byte[] data = Class3.method7(url_contentcrcs, true);
		final ByteBuffer class27_sub1 = new ByteBuffer(data);
		for (int index = 0; index < Class21.anIntArray47.length; index++)
		{
			Class21.anIntArray47[index] = class27_sub1.readInt();
		}
		class27_sub1.readInt();
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
		imageconsumer.setDimensions(IOException_Sub1.anInt672, Isaac.anInt60);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(Camera.aColorModel1);
		imageconsumer.setHints(14);
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer imageconsumer)
	{
	}

	@Override
	public void startProduction(final ImageConsumer imageconsumer)
	{
		addConsumer(imageconsumer);
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer imageconsumer)
	{
		if (imageconsumer == Class45.anImageConsumer1)
		{
			Class45.anImageConsumer1 = null;
		}
	}
}
