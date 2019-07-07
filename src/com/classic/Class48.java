package com.classic;

final class Class48
{
	static int anInt578;
	static byte[] aByteArray19 = Class38.method246(-71);
	static int[] anIntArray137;
	static Class32 aClass32_3;
	static int anInt579;
	static int[] anIntArray138;

	static void drawLoadingBar(final int percentage, final String string)
	{
		Class10.gameWindow.drawLoadingBarText(Class3.anInt8, 120, new StringBuilder().append(string).append(Class3.aString2)
		        .append(" - ").append(percentage).append("%").toString());
		anInt578++;
	}
}
