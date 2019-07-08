package com.classic;

import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class37_Sub1 extends AudioUnknown
{
	private SourceDataLine aSourceDataLine1;
	private byte[] aByteArray25;
	private AudioFormat anAudioFormat1;
	private int anInt630;

	@Override
	int method233()
	{
		return anInt630 - (aSourceDataLine1.available() >> (maybe_isMono ? 2 : 1));
	}

	@Override
	void method240()
	{
		int i = 256;
		if (maybe_isMono)
		{
			i <<= 1;
		}
		for (int i_0_ = 0; i_0_ < i; i_0_++)
		{
			int i_1_ = this.anIntArray87[i_0_];
			if (((i_1_ + 8388608) & ~0xffffff) != 0)
			{
				i_1_ = 0x7fffff ^ (i_1_ >> 31);
			}
			aByteArray25[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray25[(i_0_ * 2) + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine1.write(aByteArray25, 0, i << 1);
	}

	@Override
	void method241()
	{
		if (aSourceDataLine1 != null)
		{
			aSourceDataLine1.close();
			aSourceDataLine1 = null;
		}
	}

	@Override
	void method244(final int i) throws LineUnavailableException
	{
		try
		{
			final DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, anAudioFormat1,
			        i << (maybe_isMono ? 2 : 1));
			aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine1.open();
			aSourceDataLine1.start();
			anInt630 = i;
		}
		catch (final LineUnavailableException lineunavailableexception)
		{
			if (Class38.nearestPowerOfTwo(i) != 1)
			{
				method244(Class27.method177(i));
			}
			else
			{
				aSourceDataLine1 = null;
				throw lineunavailableexception;
			}
		}
	}

	@Override
	void method236(final Component component)
	{
		final Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null)
		{
			final Mixer.Info[] infos_2_ = infos;
			int i = 0;
			for (/**/; i < infos_2_.length; i++)
			{
				final Mixer.Info info = infos_2_[i];
				if (info != null)
				{
					final String string = info.getName();
					if ((string == null) || (string.toLowerCase().indexOf("soundmax") >= 0))
					{
						continue;
					}
				}
			}
		}
		anAudioFormat1 = new AudioFormat(sampleRate, 16, maybe_isMono ? 2 : 1, true, false);
		aByteArray25 = new byte[256 << (maybe_isMono ? 2 : 1)];
	}
}
