package com.classic;

public final class EntityHandler
{
	static int anInt193;
	public static int itemdef_count;
	public static String[] itemdef_name;
	public static String[] itemdef_description;
	public static int[] itemdef_isMembers;
	public static int[] itemdef_basePrice;
	public static int[] itemdef_color;
	public static int[] itemdef_isUnstackable;
	public static int[] itemdef_unknown;
	public static String[] itemdef_command;
	public static int[] itemdef_isQuest;
	public static int[] itemdef_sprite;
	public static int[] itemdef_wearableId;
	
	public static int npcdef_count;
	public static String[] npcdef_name;
	public static String[] npcdef_description;
	public static String[] npcdef_command;
	public static int[] npcdef_hairColor;
	public static int[] npcdef_hits;
	public static int[] npcdef_walkModel;
	public static int[] npcdef_attack;
	public static int[] npcdef_strength;
	public static int[] npcdef_bottomColor;
	public static int[] npcdef_attackable;
	public static int[] npcdef_camera1;
	public static int[] npcdef_topColor;
	public static int[][] npcdef_sprites;
	public static int[] npcdef_defense;
	public static int[] npcdef_combatModel;
	public static int[] npcdef_combatSprite;
	public static int[] npcdef_skinColor;
	public static int[] npcdef_camera2;
	
	public static int objectdef_count;
	public static String[] objectdef_command1;
	public static int[] objectdef_width;
	public static String[] objectdef_description;
	public static int[] objectdef_modelIndex;
	public static int[] objectdef_type;
	public static int[] objectdef_height;
	public static String[] objectdef_command2;
	public static int[] objectdef_groundItemVar;
	public static String[] objectdef_name;
	
	public static int animationdef_count;
	public static int[] animationdef_hasA;
	public static int[] animationdef_hasF;
	public static int[] animationdef_number;
	public static int[] animationdef_color;
	public static int[] animationdef_genderModel;
	public static String[] animationdef_name;

	public static int prayerdef_count;
	public static String[] prayerdef_description;
	public static int[] prayerdef_level;
	public static String[] prayerdef_name;
	public static int[] prayerdef_drainRate;

	public static int wallobjectdef_count;
	public static int[] wallobjectdef_modelVar2;
	public static int[] wallobjectdef_height;
	public static String[] wallobjectdef_command2;
	public static int[] wallobjectdef_unknown;
	public static String[] wallobjectdef_description;
	public static String[] wallobjectdef_name;
	public static int[] wallobjectdef_modelVar3;
	public static String[] wallobjectdef_command1;
	public static int[] wallobjectdef_type;
	
	public static String[] texturedef_name;
	public static String[] texturedef_animationName;
	public static int texturedef_count;

	public static int tiledef_count;
	public static int[] tiledef_color;
	public static int[] tiledef_objectType;
	public static int[] tiledef_tileValue;
	
	public static int elevationdef_count;
	public static int[] elevationdef_unknown1;
	public static int[] elevationdef_unknown2;
	
	public static int spelldef_count;
	public static int[][] spelldef_runesRequiredAmounts;
	public static String[] spelldef_description;
	public static int[] spelldef_runeCount;
	public static int[][] spelldef_runesRequiredIds;
	public static String[] spelldef_name;
	public static int[] spelldef_level;
	public static int[] spelldef_type;

	static int anInt494;
	
	static void load(final byte[] data, final boolean isMembers)
	{
		StreamClass.stringData = Camera.loadData(data, 0, "string.dat");
		DataFileVariables.anInt208 = 0;
		Class52.integerData = Camera.loadData(data, 0, "integer.dat");
		Class25.maybe_offset = 0;
		itemdef_count = Class12.method108();
		itemdef_basePrice = new int[itemdef_count];
		itemdef_color = new int[itemdef_count];
		itemdef_description = new String[itemdef_count];
		itemdef_isUnstackable = new int[itemdef_count];
		itemdef_name = new String[itemdef_count];
		itemdef_unknown = new int[itemdef_count];
		itemdef_command = new String[itemdef_count];
		itemdef_isMembers = new int[itemdef_count];
		itemdef_isQuest = new int[itemdef_count];
		itemdef_sprite = new int[itemdef_count];
		itemdef_wearableId = new int[itemdef_count];
		for (int i_0_ = 0; itemdef_count > i_0_; i_0_++)
		{
			itemdef_name[i_0_] = Class29.readString();
		}
		for (int i_1_ = 0; i_1_ < itemdef_count; i_1_++)
		{
			itemdef_description[i_1_] = Class29.readString();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			itemdef_command[index] = Class29.readString();
		}
		for (int index = 0; index < itemdef_count; index++)
		{
			itemdef_sprite[index] = Class12.method108();
			if ((itemdef_sprite[index] + 1) > Class1.anInt1)
			{
				Class1.anInt1 = itemdef_sprite[index] + 1;
			}
		}
		for (int index = 0; index < itemdef_count; index++)
		{
			itemdef_basePrice[index] = AClass1.method176();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			itemdef_isUnstackable[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			itemdef_unknown[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < itemdef_count; index++)
		{
			itemdef_wearableId[index] = Class12.method108();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			itemdef_color[index] = AClass1.method176();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			itemdef_isQuest[index] = Class4.readUnsignedByte();
		}
		for (int i_10_ = 0; itemdef_count > i_10_; i_10_++)
		{
			itemdef_isMembers[i_10_] = Class4.readUnsignedByte();
		}
		for (int index = 0; itemdef_count > index; index++)
		{
			if (!isMembers && itemdef_isMembers[index] == 1)
			{
				itemdef_name[index] = "Members object";
				itemdef_description[index] = "You need to be a member to use this object";
				itemdef_basePrice[index] = 0;
				itemdef_command[index] = "";
				itemdef_unknown[0] = 0;
				itemdef_wearableId[index] = 0;
				itemdef_isQuest[index] = 1;
			}
		}
		npcdef_count = Class12.method108();
		npcdef_hairColor = new int[npcdef_count];
		npcdef_name = new String[npcdef_count];
		npcdef_hits = new int[npcdef_count];
		npcdef_walkModel = new int[npcdef_count];
		npcdef_attack = new int[npcdef_count];
		npcdef_description = new String[npcdef_count];
		npcdef_strength = new int[npcdef_count];
		npcdef_bottomColor = new int[npcdef_count];
		npcdef_attackable = new int[npcdef_count];
		npcdef_camera1 = new int[npcdef_count];
		npcdef_topColor = new int[npcdef_count];
		npcdef_sprites = new int[npcdef_count][12];
		npcdef_command = new String[npcdef_count];
		npcdef_defense = new int[npcdef_count];
		npcdef_combatModel = new int[npcdef_count];
		npcdef_combatSprite = new int[npcdef_count];
		npcdef_skinColor = new int[npcdef_count];
		npcdef_camera2 = new int[npcdef_count];
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_name[index] = Class29.readString();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_description[index] = Class29.readString();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_attack[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_strength[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_defense[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_hits[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_attackable[index] = Class4.readUnsignedByte();
		}
		for (int npcIndex = 0; npcdef_count > npcIndex; npcIndex++)
		{
			for (int spriteIndex = 0; spriteIndex < 12; spriteIndex++)
			{
				npcdef_sprites[npcIndex][spriteIndex] = Class4.readUnsignedByte();
				if (npcdef_sprites[npcIndex][spriteIndex] == 255)
				{
					npcdef_sprites[npcIndex][spriteIndex] = -1;
				}
			}
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_hairColor[index] = AClass1.method176();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_topColor[index] = AClass1.method176();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_bottomColor[index] = AClass1.method176();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_skinColor[index] = AClass1.method176();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_camera1[index] = Class12.method108();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_camera2[index] = Class12.method108();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_walkModel[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_combatModel[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_combatSprite[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; npcdef_count > index; index++)
		{
			npcdef_command[index] = Class29.readString();
		}
		texturedef_count = Class12.method108();
		texturedef_name = new String[texturedef_count];
		texturedef_animationName = new String[texturedef_count];
		for (int index = 0; index < texturedef_count; index++)
		{
			texturedef_name[index] = Class29.readString();
		}
		for (int index = 0; texturedef_count > index; index++)
		{
			texturedef_animationName[index] = Class29.readString();
		}
		animationdef_count = Class12.method108();
		animationdef_hasA = new int[animationdef_count];
		animationdef_hasF = new int[animationdef_count];
		animationdef_number = new int[animationdef_count];
		animationdef_color = new int[animationdef_count];
		animationdef_genderModel = new int[animationdef_count];
		animationdef_name = new String[animationdef_count];
		for (int index = 0; animationdef_count > index; index++)
		{
			animationdef_name[index] = Class29.readString();
		}
		for (int i_34_ = 0; i_34_ < animationdef_count; i_34_++)
		{
			animationdef_color[i_34_] = AClass1.method176();
		}
		for (int i_35_ = 0; animationdef_count > i_35_; i_35_++)
		{
			animationdef_genderModel[i_35_] = Class4.readUnsignedByte();
		}
		for (int i_36_ = 0; i_36_ < animationdef_count; i_36_++)
		{
			animationdef_hasA[i_36_] = Class4.readUnsignedByte();
		}
		for (int i_37_ = 0; animationdef_count > i_37_; i_37_++)
		{
			animationdef_hasF[i_37_] = Class4.readUnsignedByte();
		}
		for (int i_38_ = 0; i_38_ < animationdef_count; i_38_++)
		{
			animationdef_number[i_38_] = Class4.readUnsignedByte();
		}
		
		objectdef_count = Class12.method108();
		objectdef_command1 = new String[objectdef_count];
		objectdef_width = new int[objectdef_count];
		objectdef_description = new String[objectdef_count];
		objectdef_modelIndex = new int[objectdef_count];
		objectdef_type = new int[objectdef_count];
		objectdef_height = new int[objectdef_count];
		objectdef_command2 = new String[objectdef_count];
		objectdef_groundItemVar = new int[objectdef_count];
		objectdef_name = new String[objectdef_count];
		for (int i_39_ = 0; objectdef_count > i_39_; i_39_++)
		{
			objectdef_name[i_39_] = Class29.readString();
		}
		for (int i_40_ = 0; i_40_ < objectdef_count; i_40_++)
		{
			objectdef_description[i_40_] = Class29.readString();
		}
		for (int index = 0; index < objectdef_count; index++)
		{
			objectdef_command1[index] = Class29.readString();
		}
		for (int index = 0; index < objectdef_count; index++)
		{
			objectdef_command2[index] = Class29.readString();
		}
		for (int index = 0; index < objectdef_count; index++)
		{
			objectdef_modelIndex[index] = AClass1_Sub1.storeModel(Class29.readString());
		}
		for (int index = 0; objectdef_count > index; index++)
		{
			objectdef_width[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; objectdef_count > index; index++)
		{
			objectdef_height[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < objectdef_count; index++)
		{
			objectdef_type[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < objectdef_count; index++)
		{
			objectdef_groundItemVar[index] = Class4.readUnsignedByte();
		}
		wallobjectdef_count = Class12.method108();
		wallobjectdef_modelVar2 = new int[wallobjectdef_count];
		wallobjectdef_height = new int[wallobjectdef_count];
		wallobjectdef_command2 = new String[wallobjectdef_count];
		wallobjectdef_unknown = new int[wallobjectdef_count];
		wallobjectdef_description = new String[wallobjectdef_count];
		wallobjectdef_name = new String[wallobjectdef_count];
		wallobjectdef_modelVar3 = new int[wallobjectdef_count];
		wallobjectdef_command1 = new String[wallobjectdef_count];
		wallobjectdef_type = new int[wallobjectdef_count];
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_name[index] = Class29.readString();
		}
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_description[index] = Class29.readString();
		}
		for (int index = 0; wallobjectdef_count > index; index++)
		{
			wallobjectdef_command1[index] = Class29.readString();
		}
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_command2[index] = Class29.readString();
		}
		for (int index = 0; wallobjectdef_count > index; index++)
		{
			wallobjectdef_height[index] = Class12.method108();
		}
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_modelVar2[index] = AClass1.method176();
		}
		for (int index = 0; wallobjectdef_count > index; index++)
		{
			wallobjectdef_modelVar3[index] = AClass1.method176();
		}
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_type[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < wallobjectdef_count; index++)
		{
			wallobjectdef_unknown[index] = Class4.readUnsignedByte();
		}
		elevationdef_count = Class12.method108();
		elevationdef_unknown1 = new int[elevationdef_count];
		elevationdef_unknown2 = new int[elevationdef_count];
		for (int index = 0; index < elevationdef_count; index++)
		{
			elevationdef_unknown1[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; elevationdef_count > index; index++)
		{
			elevationdef_unknown2[index] = Class4.readUnsignedByte();
		}
		tiledef_count = Class12.method108();
		tiledef_color = new int[tiledef_count];
		tiledef_objectType = new int[tiledef_count];
		tiledef_tileValue = new int[tiledef_count];
		for (int index = 0; tiledef_count > index; index++)
		{
			tiledef_color[index] = AClass1.method176();
		}
		for (int index = 0; tiledef_count > index; index++)
		{
			tiledef_tileValue[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; tiledef_count > index; index++)
		{
			tiledef_objectType[index] = Class4.readUnsignedByte();
		}
		anInt494 = Class12.method108();
		spelldef_count = Class12.method108();
		spelldef_runesRequiredAmounts = new int[spelldef_count][];
		spelldef_description = new String[spelldef_count];
		spelldef_runeCount = new int[spelldef_count];
		spelldef_runesRequiredIds = new int[spelldef_count][];
		spelldef_name = new String[spelldef_count];
		spelldef_level = new int[spelldef_count];
		spelldef_type = new int[spelldef_count];
		for (int index = 0; spelldef_count > index; index++)
		{
			spelldef_name[index] = Class29.readString();
		}
		for (int index = 0; spelldef_count > index; index++)
		{
			spelldef_description[index] = Class29.readString();
		}
		for (int index = 0; index < spelldef_count; index++)
		{
			spelldef_level[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < spelldef_count; index++)
		{
			spelldef_runeCount[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < spelldef_count; index++)
		{
			spelldef_type[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; spelldef_count > index; index++)
		{
			final int count = Class4.readUnsignedByte();
			spelldef_runesRequiredIds[index] = new int[count];
			for (int index2 = 0; count > index2; index2++)
			{
				spelldef_runesRequiredIds[index][index2] = Class12.method108();
			}
		}
		for (int index = 0; spelldef_count > index; index++)
		{
			final int count = Class4.readUnsignedByte();
			spelldef_runesRequiredAmounts[index] = new int[count];
			for (int index2 = 0; index2 < count; index2++)
			{
				spelldef_runesRequiredAmounts[index][index2] = Class4.readUnsignedByte();
			}
		}
		prayerdef_count = Class12.method108();
		prayerdef_description = new String[prayerdef_count];
		prayerdef_level = new int[prayerdef_count];
		prayerdef_name = new String[prayerdef_count];
		prayerdef_drainRate = new int[prayerdef_count];
		for (int index = 0; index < prayerdef_count; index++)
		{
			prayerdef_name[index] = Class29.readString();
		}
		for (int index = 0; prayerdef_count > index; index++)
		{
			prayerdef_description[index] = Class29.readString();
		}
		for (int index = 0; index < prayerdef_count; index++)
		{
			prayerdef_level[index] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < prayerdef_count; index++)
		{
			prayerdef_drainRate[index] = Class4.readUnsignedByte();
		}
		StreamClass.stringData = null;
		Class52.integerData = null;
	}
}
