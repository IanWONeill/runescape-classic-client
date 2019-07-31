package com.classic;

import java.awt.AWTEvent;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

final class GameFrame extends Frame
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final int graphicsTranslate = 0;
	private int frameOffset = 28;
	private final int frameWidth;
	static Class32 aClass32_4;
	private final GameWindow gameWindow;
	private final int frameHeight;

	static int method486(final int i, final int i_0_, final int i_1_)
	{
		return -((i_1_ / 8) * 1024) + -((i / 8) * 32) + -(i_0_ / 8) + -1;
	}

	static int method487(String file, final byte[] soundData)
	{
		final int i_3_ = Menu.method84(soundData, 0);
		int searchHash = 0;
		file = file.toUpperCase();
		for (int index = 0; index < file.length(); index++)
		{
			searchHash = file.charAt(index) + (61 * searchHash - 32);
		}
		for (int index = 0; i_3_ > index; index++)
		{
			final int hash = (((0xff & soundData[(index * 10) + 2]) * 16777216) + ((soundData[(index * 10) + 4] & 0xff) * 256)
			        + ((soundData[(index * 10) + 3] & 0xff) * 65536) + (soundData[(index * 10) - -5] & 0xff));
			final int i_8_ = (((0xff & soundData[(index * 10) + 7]) * 256) + ((0xff & soundData[(index * 10) - -6]) * 65536)
			        + (0xff & soundData[(index * 10) + 8]));
			if (hash == searchHash)
			{
				return i_8_;
			}
		}
		return 0;
	}

	@Override
	public Graphics getGraphics()
	{
		final Graphics graphics = super.getGraphics();
		
		if (graphicsTranslate == 0)
			graphics.translate(0, 24);
		else
			graphics.translate(-5, 0);
		
		return graphics;
	}

	static Class24[] method488()
	{
		return (new Class24[] { Class42.aClass24_1, RuntimeException_Sub1.aClass24_3, Class45.aClass24_2 });
	}

	@Override
	public void paint(final Graphics graphics)
	{
		gameWindow.paint(graphics);
	}

	@Override
	public void resize(final int i, final int i_9_)
	{
		super.resize(i, i_9_ + frameOffset);
	}

	static void method489(int i, final int i_10_, int i_11_, final int[] is, final int[] is_13_, int i_14_,
	        int i_15_)
	{
		if (i_10_ < 0)
		{
			i_15_ = is[(i_11_ & 0xffa8) >> 8];
			i_14_ <<= 2;
			i_11_ += i_14_;
			int i_16_ = i_10_ / 16;
			for (int i_17_ = i_16_; 0 > i_17_; i_17_++)
			{
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				i_15_ = is[(i_11_ >> 8) & 0xff];
				is_13_[i++] = i_15_;
				i_11_ += i_14_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				i_15_ = is[(0xffd5 & i_11_) >> 8];
				i_11_ += i_14_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				i_15_ = is[(i_11_ >> 8) & 0xff];
				i_11_ += i_14_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				is_13_[i++] = i_15_;
				i_15_ = is[(i_11_ >> 8) & 0xff];
				i_11_ += i_14_;
			}
			i_16_ = -(i_10_ % 16);
			for (int i_18_ = 0; i_16_ > i_18_; i_18_++)
			{
				is_13_[i++] = i_15_;
				if ((i_18_ & 0x3) == 3)
				{
					i_15_ = is[(i_11_ & 0xff19) >> 8];
					i_11_ += i_14_;
				}
			}
		}
	}

	@Override
	protected void processEvent(AWTEvent awtevent)
	{
		if (awtevent instanceof MouseEvent)
		{
			final MouseEvent mouseevent = (MouseEvent) awtevent;
			awtevent = new MouseEvent(mouseevent.getComponent(), mouseevent.getID(), mouseevent.getWhen(),
			        mouseevent.getModifiers(), mouseevent.getX(), -24 + mouseevent.getY(), mouseevent.getClickCount(),
			        mouseevent.isPopupTrigger());
		}
		super.processEvent(awtevent);
	}

	GameFrame(final GameWindow gameWindow, final int width, final int height, final String title, final boolean resizable)
	{
		frameWidth = width;
		frameHeight = height;
		frameOffset = 28;
		this.gameWindow = gameWindow;
		setTitle(title);
		setResizable(resizable);
		show();
		toFront();
		resize(frameWidth, frameHeight);
		getGraphics();
	}
}
