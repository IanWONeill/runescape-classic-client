package com.classic;

import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.WaveFormatEx;

final class Class50 implements Interface1
{
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	public Class50() throws Exception
	{
		new DirectSound();
		new WaveFormatEx();
		for (int i = 0; 2 > i; i++)
		{
			aDSBufferDescArray1[i] = new DSBufferDesc();
		}
		for (int i = 0; 2 > i; i++)
		{
			aDSCursorsArray1[i] = new DSCursors();
		}
	}
}
