package com.classic;

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class Class30
{
	private Component aComponent1;
	private final Robot aRobot1;

	public void showcursor(Component component, final boolean bool)
	{
		if (!bool)
		{
			if (component == null)
			{
				throw new NullPointerException();
			}
		}
		else
		{
			component = null;
		}
		if (component != aComponent1)
		{
			if (aComponent1 != null)
			{
				aComponent1.setCursor(null);
				aComponent1 = null;
			}
			if (component != null)
			{
				component.setCursor(
				        component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
				aComponent1 = component;
			}
		}
	}

	public void setcustomcursor(final Component component, final int[] is, final int i, final int i_0_,
	        final Point point)
	{
		if (is != null)
		{
			final BufferedImage bufferedimage = new BufferedImage(i, i_0_, 2);
			bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		}
		else
		{
			component.setCursor(null);
		}
	}

	public Class30() throws Exception
	{
		aRobot1 = new Robot();
	}

	public void movemouse(final int i, final int i_1_)
	{
		aRobot1.mouseMove(i, i_1_);
	}
}
