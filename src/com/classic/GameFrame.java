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
	static int anInt743;
	static int[] anIntArray153;
	static int anInt745;
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

	static int method487(final byte i, String string, final byte[] is)
	{
		final int i_3_ = Class10.method84(is, 0);
		int i_4_ = 0;
		string = string.toUpperCase();
		if (i < 96)
		{
			anIntArray153 = null;
		}
		for (int i_5_ = 0; i_5_ < string.length(); i_5_++)
		{
			i_4_ = string.charAt(i_5_) + ((61 * i_4_) + -32);
		}
		for (int i_6_ = 0; i_3_ > i_6_; i_6_++)
		{
			final int i_7_ = (((0xff & is[(i_6_ * 10) + 2]) * 16777216) + ((is[(i_6_ * 10) + 4] & 0xff) * 256)
			        + ((is[(i_6_ * 10) + 3] & 0xff) * 65536) + (is[(i_6_ * 10) - -5] & 0xff));
			final int i_8_ = (((0xff & is[(i_6_ * 10) + 7]) * 256) + ((0xff & is[(i_6_ * 10) - -6]) * 65536)
			        + (0xff & is[(i_6_ * 10) + 8]));
			if (i_7_ == i_4_)
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
