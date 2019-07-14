package com.classic;

final class Mob
{
	int[] animationCount;
	int anInt143 = 0;
	int skull;
	int anInt145;
	int stepFrame;
	int waypointEndSprite;
	int anInt148;
	int[] waypointsX;
	int waypointCurrentIndex;
	int serverIndex;
	int level;
	int colorSkinType;
	int colorHairType;
	int anInt154;
	int colorBottomType;
	String maybe_displayName;
	int anInt157;
	int anInt158;
	int currentY;
	int currentSprite;
	int type;
	int[] waypointsY;
	int anInt162;
	int colorTopType;
	int anInt164;
	int anInt165;
	int currentX;
	int nextSprite;
	String maybe_accountName;
	int anInt168;
	String aString8;
	int anInt169;

	static Class38 method113(final int input)
	{
		final Class38[] class38s = Class29.method194();
		for (int index = 0; index < class38s.length; index++)
		{
			final Class38 class38 = class38s[index];
			if (class38.anInt399 == input)
			{
				return class38;
			}
		}
		return null;
	}

	Mob()
	{
		this.animationCount = new int[12];
		this.skull = 0;
		this.waypointsX = new int[10];
		this.anInt145 = 0;
		this.anInt148 = 0;
		this.anInt157 = 0;
		this.anInt158 = 0;
		this.anInt154 = 0;
		this.waypointsY = new int[10];
		this.level = -1;
		this.anInt165 = 0;
		this.anInt164 = 0;
		this.anInt169 = 0;
		this.anInt168 = 0;
	}
}
