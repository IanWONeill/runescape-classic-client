package com.classic;

import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class11
{
	static Object method107(final String string, final Applet applet) throws Throwable
	{
		return JSObject.getWindow(applet).call(string, null);
	}
}
