package com.classic;

final class Mob
{
	int[] animationCount;
	int anInt143 = 0;
	int anInt144;
	int anInt145;
	int anInt146;
	int waypointEndSprite;
	int anInt148;
	static int[] anIntArray37;
	int[] maybe_waypointsX;
	int waypointCurrent;
	int anInt150;
	int maybe_level;
	int anInt152;
	int anInt153;
	int anInt154;
	int anInt155;
	String aString6;
	int anInt157;
	int anInt158;
	int maybe_currentY;
	int anInt160;
	int anInt161;
	int[] maybe_waypointsY;
	int anInt162;
	int anInt163;
	int anInt164;
	int anInt165;
	int maybe_currentX;
	int anInt167;
	String aString7;
	static int[] anIntArray40;
	int anInt168;
	String aString8;
	int anInt169;

	static Class38 method113(final int i, final int i_0_)
	{
		final Class38[] class38s = Class29.method194((byte) -116);
		for (int i_1_ = 0; class38s.length > i_1_; i_1_++)
		{
			final Class38 class38 = class38s[i_1_];
			if (class38.anInt399 == i_0_)
			{
				return class38;
			}
		}
		return null;
	}

	Mob()
	{
		this.animationCount = new int[12];
		this.anInt144 = 0;
		this.maybe_waypointsX = new int[10];
		this.anInt145 = 0;
		this.anInt148 = 0;
		this.anInt157 = 0;
		this.anInt158 = 0;
		this.anInt154 = 0;
		this.maybe_waypointsY = new int[10];
		this.maybe_level = -1;
		this.anInt165 = 0;
		this.anInt164 = 0;
		this.anInt169 = 0;
		this.anInt168 = 0;
	}
}
