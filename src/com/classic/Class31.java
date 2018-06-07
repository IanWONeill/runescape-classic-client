package com.classic;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

final class Class31
{
	private GraphicsDevice aGraphicsDevice1;
	private DisplayMode aDisplayMode1;

	public int[] listmodes()
	{
		final DisplayMode[] displaymodes = aGraphicsDevice1.getDisplayModes();
		final int[] is = new int[displaymodes.length << 2];
		for (int i = 0; displaymodes.length > i; i++)
		{
			is[i << 2] = displaymodes[i].getWidth();
			is[(i << 2) + 1] = displaymodes[i].getHeight();
			is[(i << 2) + 2] = displaymodes[i].getBitDepth();
			is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	public void exit()
	{
		if (aDisplayMode1 != null)
		{
			aGraphicsDevice1.setDisplayMode(aDisplayMode1);
			if (!aGraphicsDevice1.getDisplayMode().equals(aDisplayMode1))
			{
				throw new RuntimeException("");
			}
			aDisplayMode1 = null;
		}
		method215(null);
	}

	private void method215(final Frame frame)
	{
		try
		{
			aGraphicsDevice1.setFullScreenWindow(frame);
		}
		catch (final Exception object)
		{
			throw object;
		}
	}

	public Class31() throws Exception
	{
		final GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice1 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice1.isFullScreenSupported())
		{
			final GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			final GraphicsDevice[] graphicsdevices_0_ = graphicsdevices;
			for (int i = 0; graphicsdevices_0_.length > i; i++)
			{
				final GraphicsDevice graphicsdevice = graphicsdevices_0_[i];
				if ((null != graphicsdevice) && graphicsdevice.isFullScreenSupported())
				{
					aGraphicsDevice1 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	public void enter(final Frame frame, final int i, final int i_1_, final int i_2_, int i_3_)
	{
		aDisplayMode1 = aGraphicsDevice1.getDisplayMode();
		if (aDisplayMode1 == null)
		{
			throw new NullPointerException();
		}
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method215(frame);
		if (i_3_ == 0)
		{
			final int i_4_ = aDisplayMode1.getRefreshRate();
			final DisplayMode[] displaymodes = aGraphicsDevice1.getDisplayModes();
			boolean bool = false;
			for (int i_5_ = 0; displaymodes.length > i_5_; i_5_++)
			{
				if ((i == displaymodes[i_5_].getWidth()) && (displaymodes[i_5_].getHeight() == i_1_)
				        && (i_2_ == displaymodes[i_5_].getBitDepth()))
				{
					final int i_6_ = displaymodes[i_5_].getRefreshRate();
					if (!bool || (Math.abs(i_6_ - i_4_) < Math.abs(i_3_ + -i_4_)))
					{
						bool = true;
						i_3_ = i_6_;
					}
				}
			}
			if (!bool)
			{
				i_3_ = i_4_;
			}
		}
		aGraphicsDevice1.setDisplayMode(new DisplayMode(i, i_1_, i_2_, i_3_));
	}
}
