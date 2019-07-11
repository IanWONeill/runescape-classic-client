package com.classic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class Class21
{
	static int[] anIntArray46;
	static int[] anIntArray47 = new int[12];

	static void method132(int i, int i_0_, final int i_1_, final int i_2_, final int[] is, int i_3_, final int[] is_4_,
	        int i_5_, final int i_6_, final int i_7_, final int i_8_, int i_9_, int i_10_, final int i_11_, int i_12_)
	{
		if (0 < i_11_)
		{
			int i_13_ = 0;
			int i_14_ = 0;
			int i_15_ = 0;
			if (i_0_ != 0)
			{
				i = (i_5_ / i_0_) << 7;
				i_12_ = (i_9_ / i_0_) << 7;
			}
			i_5_ = i_6_ + i_5_;
			i_0_ = i_2_ + i_0_;
			if (i_8_ != 16256)
			{
				method133(null, null);
			}
			i_9_ += i_7_;
			if (0 <= i_12_)
			{
				if (i_12_ > 16256)
				{
					i_12_ = 16256;
				}
			}
			else
			{
				i_12_ = 0;
			}
			if (i_0_ != 0)
			{
				i_14_ = (i_5_ / i_0_) << 7;
				i_13_ = (i_9_ / i_0_) << 7;
			}
			if (i_13_ >= 0)
			{
				if (i_13_ > 16256)
				{
					i_13_ = 16256;
				}
			}
			else
			{
				i_13_ = 0;
			}
			int i_16_ = (i_14_ + -i) >> 4;
			int i_17_ = (-i_12_ + i_13_) >> 4;
			for (int i_18_ = i_11_ >> 4; i_18_ > 0; i_18_--)
			{
				i_15_ = i_3_ >> 23;
				i_12_ += i_3_ & 0x600000;
				i_3_ += i_1_;
				is_4_[i_10_++] = ((is[Class52.bitwiseAnd(16256, i) - -(i_12_ >> 7)] >>> i_15_)
				        + (Class52.bitwiseAnd(is_4_[i_10_], 16711422) >> 1));
				i_12_ = i_17_ + i_12_;
				i += i_16_;
				is_4_[i_10_++] = (Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1)
				        + (is[Class52.bitwiseAnd(16256, i) + (i_12_ >> 7)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = (Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1)
				        + (is[(i_12_ >> 7) + Class52.bitwiseAnd(i, 16256)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = ((is[(i_12_ >> 7) + Class52.bitwiseAnd(i, 16256)] >>> i_15_)
				        + (Class52.bitwiseAnd(16711423, is_4_[i_10_]) >> 1));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				i_15_ = i_3_ >> 23;
				i_12_ = (0x3fff & i_12_) - -(0x600000 & i_3_);
				is_4_[i_10_++] = ((Class52.bitwiseAnd(is_4_[i_10_], 16711422) >> 1)
				        + (is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_));
				i_3_ += i_1_;
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = ((is[Class52.bitwiseAnd(i, 16256) - -(i_12_ >> 7)] >>> i_15_)
				        - -Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = (Class52.bitwiseAnd(is_4_[i_10_] >> 1, 8355711)
				        + (is[(i_12_ >> 7) + Class52.bitwiseAnd(16256, i)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = (Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1)
				        + (is[Class52.bitwiseAnd(16256, i) + (i_12_ >> 7)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				i_12_ = (0x3fff & i_12_) + (i_3_ & 0x600000);
				i_15_ = i_3_ >> 23;
				i_3_ += i_1_;
				is_4_[i_10_++] = ((is[(i_12_ >> 7) + Class52.bitwiseAnd(16256, i)] >>> i_15_)
				        - -Class52.bitwiseAnd(is_4_[i_10_] >> 1, 8355711));
				i_12_ = i_17_ + i_12_;
				i += i_16_;
				is_4_[i_10_++] = ((Class52.bitwiseAnd(16711423, is_4_[i_10_]) >> 1)
				        + (is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = ((is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_)
				        - -Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = (Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1)
				        + (is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				i_12_ = (i_12_ & 0x3fff) + (i_3_ & 0x600000);
				i_15_ = i_3_ >> 23;
				is_4_[i_10_++] = (Class52.bitwiseAnd(8355711, is_4_[i_10_] >> 1)
				        + (is[Class52.bitwiseAnd(16256, i) - -(i_12_ >> 7)] >>> i_15_));
				i_3_ += i_1_;
				i_12_ = i_17_ + i_12_;
				i += i_16_;
				is_4_[i_10_++] = ((Class52.bitwiseAnd(is_4_[i_10_], 16711423) >> 1)
				        + (is[(i_12_ >> 7) + Class52.bitwiseAnd(i, 16256)] >>> i_15_));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
				is_4_[i_10_++] = ((Class52.bitwiseAnd(is_4_[i_10_], 16711423) >> 1)
				        + (is[(i_12_ >> 7) + Class52.bitwiseAnd(i, 16256)] >>> i_15_));
				i_12_ = i_17_ + i_12_;
				i += i_16_;
				is_4_[i_10_++] = ((Class52.bitwiseAnd(16711422, is_4_[i_10_]) >> 1)
				        + (is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_));
				i = i_14_;
				i_12_ = i_13_;
				i_0_ = i_2_ + i_0_;
				i_9_ += i_7_;
				i_5_ = i_6_ + i_5_;
				if (i_0_ != 0)
				{
					i_13_ = (i_9_ / i_0_) << 7;
					i_14_ = (i_5_ / i_0_) << 7;
				}
				if (i_13_ < 0)
				{
					i_13_ = 0;
				}
				else if (i_13_ > 16256)
				{
					i_13_ = 16256;
				}
				i_16_ = (i_14_ + -i) >> 4;
				i_17_ = (-i_12_ + i_13_) >> 4;
			}
			for (int i_19_ = 0; (i_11_ & 0xf) > i_19_; i_19_++)
			{
				if ((i_19_ & 0x3) == 0)
				{
					i_12_ = (i_12_ & 0x3fff) + (0x600000 & i_3_);
					i_15_ = i_3_ >> 23;
					i_3_ += i_1_;
				}
				is_4_[i_10_++] = ((is[Class52.bitwiseAnd(i, 16256) + (i_12_ >> 7)] >>> i_15_)
				        + (Class52.bitwiseAnd(is_4_[i_10_], 16711423) >> 1));
				i += i_16_;
				i_12_ = i_17_ + i_12_;
			}
		}
	}

	static RuntimeException_Sub1 method133(final Throwable throwable, final String string)
	{
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1)
		{
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			final StringBuilder stringbuilder = new StringBuilder();
			final RuntimeException_Sub1 runtimeexception_sub1_20_ = runtimeexception_sub1;
			runtimeexception_sub1_20_.aString21 = stringbuilder.append(runtimeexception_sub1_20_.aString21).append(' ')
			        .append(string).toString();
		}
		else
		{
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		}
		return runtimeexception_sub1;
	}

	static String method134(Throwable throwable) throws IOException
	{
		String string;
		if (throwable instanceof RuntimeException_Sub1)
		{
			final RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder().append(runtimeexception_sub1.aString21).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable1;
		}
		else
		{
			string = "";
		}
		final StringWriter stringwriter = new StringWriter();
		final PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		final String string_21_ = stringwriter.toString();
		final BufferedReader bufferedreader = new BufferedReader(new StringReader(string_21_));
		final String string_22_ = bufferedreader.readLine();
		for (;;)
		{
			final String string_23_ = bufferedreader.readLine();
			if (string_23_ == null)
			{
				break;
			}
			final int i_24_ = string_23_.indexOf('(');
			final int i_25_ = string_23_.indexOf(')', i_24_ - -1);
			String string_26_;
			if (i_24_ != -1)
			{
				string_26_ = string_23_.substring(0, i_24_);
			}
			else
			{
				string_26_ = string_23_;
			}
			string_26_ = string_26_.trim();
			string_26_ = string_26_.substring(string_26_.lastIndexOf(' ') - -1);
			string_26_ = string_26_.substring(1 + string_26_.lastIndexOf('\t'));
			string = new StringBuilder().append(string).append(string_26_).toString();
			if ((i_24_ != -1) && (i_25_ != -1))
			{
				final int i_27_ = string_23_.indexOf(".java:", i_24_);
				if (0 <= i_27_)
				{
					string = new StringBuilder().append(string).append(string_23_.substring(i_27_ + 5, i_25_))
					        .toString();
				}
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_22_).toString();
		return string;
	}
}
