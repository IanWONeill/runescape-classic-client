package com.classic;

import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

final class Callback_Sub1 extends Callback
{
	private boolean aBool33 = true;
	private int anInt636;
	private boolean aBool34;
	private int anInt637;
	private int anInt638;

	void method418(final boolean bool, final Component component, final int i)
	{
		final WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
		final int i_0_ = wcomponentpeer.getTopHwnd();
		if ((i_0_ != anInt637) || (!bool != !aBool33))
		{
			if (!aBool34)
			{
				anInt638 = User32.LoadCursor(0, 32512);
				Root.alloc(this);
				aBool34 = true;
			}
			if (i_0_ != anInt637)
			{
				if (anInt637 != 0)
				{
					aBool33 = true;
					User32.SendMessage(i_0_, 101024, 0, 0);
					synchronized (this)
					{
						User32.SetWindowLong(anInt637, -4, anInt636);
					}
				}
				synchronized (this)
				{
					anInt637 = i_0_;
					anInt636 = User32.SetWindowLong(anInt637, -4, (Object) this);
				}
			}
			aBool33 = bool;
			User32.SendMessage(i_0_, 101024, i, 0);
		}
	}

	void method419(final int i, final int i_2_)
	{
		User32.SetCursorPos(i, i_2_);
	}

	synchronized int callback(final int i, final int i_3_, final int i_4_, final int i_5_)
	{
		if (anInt637 != i)
		{
			final int i_6_ = User32.GetWindowLong(i, -4);
			return User32.CallWindowProc(i_6_, i, i_3_, i_4_, i_5_);
		}
		if (i_3_ == 32)
		{
			final int i_7_ = i_5_ & 0xffff;
			if (i_7_ == 1)
			{
				User32.SetCursor(!aBool33 ? 0 : anInt638);
				return 0;
			}
		}
		if (i_3_ == 101024)
		{
			User32.SetCursor(!aBool33 ? 0 : anInt638);
			return 0;
		}
		if (i_3_ == 1)
		{
			anInt637 = 0;
			aBool33 = true;
		}
		return User32.CallWindowProc(anInt636, i, i_3_, i_4_, i_5_);
	}
}
