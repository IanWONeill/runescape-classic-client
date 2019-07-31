package com.classic;

import java.applet.Applet;

class Class27
{
	static Class38 aClass38_4;
	static Applet anApplet1;
	static String[] aStringArray22 = { "Enter number of items to remove and press enter" };
	Class27 aClass27_1;
	static String[] aStringArray23;
	Class27 aClass27_2;

	static int method177(int i)
	{
		i = --i | (i >>> 1);
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	void method178()
	{
		if (this.aClass27_1 != null)
		{
			this.aClass27_1.aClass27_2 = this.aClass27_2;
			this.aClass27_2.aClass27_1 = this.aClass27_1;
			this.aClass27_2 = null;
			this.aClass27_1 = null;
		}
	}

	protected Class27() {}

	static
	{
		aClass38_4 = new Class38("WTQA", "office", "_qa", 2);
		aStringArray23 = new String[100];
	}
}
