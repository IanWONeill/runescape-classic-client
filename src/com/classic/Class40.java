package com.classic;

import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

public final class Class40 implements IEnumModesCallback
{
	private static int anInt413;
	private static int[] anIntArray90;
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	void method256(final int i, final Frame frame)
	{
		aDirectDraw1.restoreDisplayMode();
		aDirectDraw1.setCooperativeLevel((java.awt.Component) frame, 8);
	}

	void method257(final int i, final int i_0_, final Frame frame, final byte i_1_, final int i_2_, final int i_3_)
	{
		frame.setVisible(true);
		final WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
		final int i_4_ = wcomponentpeer.getHwnd();
		User32.SetWindowLong(i_4_, -16, -2147483648);
		User32.SetWindowLong(i_4_, -20, 8);
		aDirectDraw1.setCooperativeLevel((java.awt.Component) frame, 17);
		aDirectDraw1.setDisplayMode(i_3_, i_2_, i_0_, i, 0);
		frame.setBounds(0, 0, i_3_, i_2_);
		frame.toFront();
		frame.requestFocus();
	}

	public Class40()
	{
		aDirectDraw1.initialize(null);
	}

	int[] method258(final int i)
	{
		if (i != -2147483648)
		{
			anIntArray90 = null;
		}
		aDirectDraw1.enumDisplayModes(0, null, null, this);
		anIntArray90 = new int[anInt413];
		anInt413 = 0;
		aDirectDraw1.enumDisplayModes(0, null, null, this);
		final int[] is = anIntArray90;
		anIntArray90 = null;
		anInt413 = 0;
		return is;
	}

	public void callbackEnumModes(final DDSurfaceDesc ddsurfacedesc, final IUnknown iunknown)
	{
		if (anIntArray90 == null)
		{
			anInt413 += 4;
		}
		else
		{
			anIntArray90[anInt413++] = ddsurfacedesc.width;
			anIntArray90[anInt413++] = ddsurfacedesc.height;
			anIntArray90[anInt413++] = ddsurfacedesc.rgbBitCount;
			anIntArray90[anInt413++] = ddsurfacedesc.refreshRate;
		}
	}
}
