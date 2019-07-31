package com.classic;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class52
{
	static int anInt590 = 0;
	static byte[][] aByteArrayArray14 = new byte[50][];
	static byte[] integerData;
	static long aLong4;
	static long aLong14;
	
	static synchronized long method377()
	{
		final long now = System.currentTimeMillis();
		if (Class52.aLong14 > now)
		{
			Class52.aLong4 += Class52.aLong14 - now;
		}
		Class52.aLong14 = now;
		return Class52.aLong4 + now;
	}

	static int bitwiseAnd(final int a, final int b)
	{
		return a & b;
	}

	static boolean method379(final int i, boolean bool, final int i_1_, final Font font, final char c, final GameWindow applet_sub1,
	        final FontMetrics fontmetrics)
	{
		int i_3_ = fontmetrics.charWidth(c);
		final int i_4_ = i_3_;
		if (bool)
		{
			try
			{
				if (c == '/')
				{
					bool = false;
				}
				if ((c == 'f') || (c == 't') || (c == 'w') || (c == 'v') || (c == 'k') || (c == 'x') || (c == 'y')
				        || (c == 'A') || (c == 'V') || (c == 'W'))
				{
					i_3_++;
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
		final int i_5_ = fontmetrics.getMaxAscent();
		final int i_6_ = fontmetrics.getMaxAscent() - -fontmetrics.getMaxDescent();
		final int i_7_ = fontmetrics.getHeight();
		final Image image = applet_sub1.createImage(i_3_, i_6_);
		if (image == null)
		{
			return false;
		}
		final Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_3_, i_6_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_5_);
		if (bool)
		{
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_5_);
		}
		final int[] is = new int[i_3_ * i_6_];
		final PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_3_, i_6_, is, 0, i_3_);
		try
		{
			pixelgrabber.grabPixels();
		}
		catch (final InterruptedException interruptedexception)
		{
			return false;
		}
		image.flush();
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = i_3_;
		while_21_: for (int i_11_ = 0; i_6_ > i_11_; i_11_++)
		{
			for (int i_12_ = 0; i_12_ < i_3_; i_12_++)
			{
				final int i_13_ = is[i_12_ - -(i_11_ * i_3_)];
				if ((0xffffff & i_13_) != 0)
				{
					i_9_ = i_11_;
					break while_21_;
				}
			}
		}
		int i_14_ = i_6_;
		while_22_: for (int i_15_ = 0; i_3_ > i_15_; i_15_++)
		{
			for (int i_16_ = 0; i_16_ < i_6_; i_16_++)
			{
				final int i_17_ = is[i_15_ - -(i_16_ * i_3_)];
				if ((i_17_ & 0xffffff) != 0)
				{
					i_8_ = i_15_;
					break while_22_;
				}
			}
		}
		while_23_: for (int i_18_ = i_6_ + -1; 0 <= i_18_; i_18_--)
		{
			for (int i_19_ = 0; i_3_ > i_19_; i_19_++)
			{
				final int i_20_ = is[i_19_ + (i_3_ * i_18_)];
				if ((0xffffff & i_20_) != 0)
				{
					i_14_ = i_18_ + 1;
					break while_23_;
				}
			}
		}
		while_24_: for (int i_21_ = i_3_ - 1; 0 <= i_21_; i_21_--)
		{
			for (int i_22_ = 0; i_22_ < i_6_; i_22_++)
			{
				final int i_23_ = is[i_21_ - -(i_22_ * i_3_)];
				if ((0xffffff & i_23_) != 0)
				{
					i_10_ = i_21_ + 1;
					break while_24_;
				}
			}
		}
		Class22.aByteArray11[(i * 9) + 0] = (byte) (Menu.anInt90 / 16384);
		Class22.aByteArray11[(i * 9) + 1] = (byte) bitwiseAnd(Menu.anInt90 / 128, 127);
		Class22.aByteArray11[(i * 9) + 2] = (byte) bitwiseAnd(Menu.anInt90, 127);
		Class22.aByteArray11[(i * 9) - -3] = (byte) (-i_8_ + i_10_);
		Class22.aByteArray11[(i * 9) + 4] = (byte) (-i_9_ + i_14_);
		Class22.aByteArray11[(i * 9) - -5] = (byte) i_8_;
		Class22.aByteArray11[(i * 9) + 6] = (byte) (-i_9_ + i_5_);
		Class22.aByteArray11[(i * 9) - -7] = (byte) i_4_;
		Class22.aByteArray11[(i * 9) + 8] = (byte) i_7_;
		for (int i_24_ = i_9_; i_24_ < i_14_; i_24_++)
		{
			for (int i_25_ = i_8_; i_25_ < i_10_; i_25_++)
			{
				final int i_26_ = is[i_25_ + (i_24_ * i_3_)] & 0xff;
				if ((i_26_ > 30) && (230 > i_26_))
				{
					ByteBuffer.aBoolArray10[i_1_] = true;
				}
				Class22.aByteArray11[Menu.anInt90++] = (byte) i_26_;
			}
		}
		return true;
	}

	static void method380(final int[] is, int i_27_, final int i_28_, final int i_29_, final int i_30_, int i_31_,
	        final int i_32_, int i_33_, final int i_34_, int i_35_, final int[] is_36_, int i_37_, int i_38_, int i_39_)
	{
		if (i_28_ > 0)
		{
			int i_40_ = 0;
			int i_41_ = 0;
			int i_42_ = 0;
			if (i_33_ != 0)
			{
				i_37_ = (i_27_ / i_33_) << 7;
				i_35_ = (i_38_ / i_33_) << 7;
			}
			if (0 <= i_37_)
			{
				if (16256 < i_37_)
				{
					i_37_ = 16256;
				}
			}
			else
			{
				i_37_ = 0;
			}
			i_33_ += i_34_;
			i_38_ += i_30_;
			i_27_ += i_29_;
			if (i_33_ != 0)
			{
				i_40_ = (i_27_ / i_33_) << 7;
				i_41_ = (i_38_ / i_33_) << 7;
			}
			if (0 > i_40_)
			{
				i_40_ = 0;
			}
			else if (16256 < i_40_)
			{
				i_40_ = 16256;
			}
			int i_43_ = (i_41_ + -i_35_) >> 4;
			int i_44_ = (-i_37_ + i_40_) >> 4;
			for (int i_45_ = i_28_ >> 4; i_45_ > 0; i_45_--)
			{
				i_42_ = i_39_ >> 23;
				i_37_ = (0x600000 & i_39_) + i_37_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(i_35_, 16256)] >>> i_42_;
				i_39_ = i_32_ + i_39_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = is_36_[bitwiseAnd(i_35_, 16256) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = is_36_[bitwiseAnd(16256, i_35_) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = is_36_[bitwiseAnd(i_35_, 16256) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				i_42_ = i_39_ >> 23;
				i_37_ = (i_39_ & 0x600000) + (i_37_ & 0x3fff);
				i_39_ = i_32_ + i_39_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(i_35_, 16256)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[bitwiseAnd(16256, i_35_) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = (is_36_[bitwiseAnd(i_35_, 16256) - -(i_37_ >> 7)] >>> i_42_);
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(16256, i_35_)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				i_37_ = (0x3fff & i_37_) - -(i_39_ & 0x600000);
				i_42_ = i_39_ >> 23;
				i_39_ = i_32_ + i_39_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(16256, i_35_)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[bitwiseAnd(i_35_, 16256) + (i_37_ >> 7)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(i_35_, 16256)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(i_35_, 16256)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				i_42_ = i_39_ >> 23;
				i_37_ = (i_37_ & 0x3fff) - -(i_39_ & 0x600000);
				i_39_ = i_32_ + i_39_;
				is[i_31_++] = is_36_[bitwiseAnd(i_35_, 16256) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
				is[i_31_++] = is_36_[(i_37_ >> 7) + bitwiseAnd(16256, i_35_)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[bitwiseAnd(16256, i_35_) + (i_37_ >> 7)] >>> i_42_;
				i_35_ += i_43_;
				i_37_ = i_44_ + i_37_;
				is[i_31_++] = is_36_[bitwiseAnd(16256, i_35_) + (i_37_ >> 7)] >>> i_42_;
				i_38_ += i_30_;
				i_27_ += i_29_;
				i_37_ = i_40_;
				i_33_ += i_34_;
				i_35_ = i_41_;
				if (i_33_ != 0)
				{
					i_41_ = (i_38_ / i_33_) << 7;
					i_40_ = (i_27_ / i_33_) << 7;
				}
				if (0 > i_40_)
				{
					i_40_ = 0;
				}
				else if (16256 < i_40_)
				{
					i_40_ = 16256;
				}
				i_43_ = (i_41_ + -i_35_) >> 4;
				i_44_ = (-i_37_ + i_40_) >> 4;
			}
			for (int i_46_ = 0; (i_28_ & 0xf) > i_46_; i_46_++)
			{
				if ((i_46_ & 0x3) == 0)
				{
					i_42_ = i_39_ >> 23;
					i_37_ = (0x3fff & i_37_) + (0x600000 & i_39_);
					i_39_ = i_32_ + i_39_;
				}
				is[i_31_++] = is_36_[bitwiseAnd(16256, i_35_) + (i_37_ >> 7)] >>> i_42_;
				i_37_ = i_44_ + i_37_;
				i_35_ += i_43_;
			}
		}
	}
}
