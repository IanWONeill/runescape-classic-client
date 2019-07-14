package com.classic;

final class EntityHandler
{
	static int anInt193;
	static byte[][] aByteArrayArray9 = new byte[250][];
	
	static int itemdef_count;
	static String[] itemdef_name;
	static String[] itemdef_description;
	static int[] itemdef_isMembers;
	
	static int npcdef_count;
	static String[] npcdef_name;
	static String[] npcdef_description;
	static int[] maybe_itemdef_basePrice;
	static int[] anIntArray133;
	static int[] anIntArray1;
	static int[] anIntArray112;
	static String[] aStringArray27;
	static int[] anIntArray10;
	static int[] anIntArray144;
	static int[] anIntArray8;
	static int[] anIntArray132;
	static int[] anIntArray143;
	static int[] anIntArray32;
	static int[] anIntArray135;
	static int[] anIntArray19;
	static int[] anIntArray150;
	static int[] anIntArray141;
	static int[] anIntArray89;
	static int[] anIntArray3;
	static int[][] anIntArrayArray12;
	static String[] npcdef_command;
	static int[] anIntArray136;
	static int[] anIntArray86;
	static int[] anIntArray80;
	static int[] anIntArray85;
	static int[] anIntArray81;
	
	static int objectdef_count;
	static String[] maybe_objectdef_command1s;
	static int[] maybe_objectdef_widths_or_heights;
	static String[] objectdef_descriptions;
	static int[] objectdef_itemIds;
	static int[] objectdef_types;
	static int[] maybe_objectdef_heights_or_widths;
	static String[] maybe_objectdef_command2s;
	static int[] maybe_objectdef_grounditemvars;
	static String[] objectdef_names;
	static int anInt396;
	static int[] anIntArray7;
	static int[] anIntArray20;
	static int[] anIntArray78;
	static int[] anIntArray137;
	static int[] anIntArray13;
	static String[] aStringArray11;
	static String[] aStringArray37;
	static String[] aStringArray6;
	static int anInt140;
	static int anInt675;
	static int[] anIntArray79;
	static int[] anIntArray140;
	static String[] aStringArray15;
	static int[] anIntArray41;
	static String[] aStringArray44;
	static String[] aStringArray17;
	static int[] anIntArray2;
	static String[] aStringArray40;
	static int[] anIntArray21;
	static int anInt743;
	static int[] anIntArray88;
	static int[] anIntArray12;
	static int anInt745;
	static int[] anIntArray54;
	static int[] anIntArray37;
	static int[] anIntArray22;
	static int anInt494;
	static int anInt486;
	static int[][] anIntArrayArray1;
	static String[] aStringArray12;
	static int[] anIntArray138;
	static int[][] anIntArrayArray18;
	static String[] aStringArray36;
	static int[] anIntArray139;
	static int[] anIntArray153;
	static int anInt639;
	static String[] aStringArray42;
	static int[] anIntArray145;
	static String[] aStringArray35;
	static int[] anIntArray82;
	
	static void load(final byte[] data, final boolean isMembers)
	{
		StreamClass.stringData = Camera.loadData(data, 0, "string.dat");
		DataFileVariables.anInt208 = 0;
		Class52.integerData = Camera.loadData(data, 0, "integer.dat");
		Class25.maybe_offset = 0;
		itemdef_count = Class12.method108();
		maybe_itemdef_basePrice = new int[itemdef_count];
		anIntArray133 = new int[itemdef_count];
		itemdef_description = new String[itemdef_count];
		anIntArray1 = new int[itemdef_count];
		itemdef_name = new String[itemdef_count];
		anIntArray112 = new int[itemdef_count];
		aStringArray27 = new String[itemdef_count];
		itemdef_isMembers = new int[itemdef_count];
		anIntArray10 = new int[itemdef_count];
		anIntArray144 = new int[itemdef_count];
		anIntArray8 = new int[itemdef_count];
		for (int i_0_ = 0; itemdef_count > i_0_; i_0_++)
		{
			itemdef_name[i_0_] = Class29.readString();
		}
		for (int i_1_ = 0; i_1_ < itemdef_count; i_1_++)
		{
			itemdef_description[i_1_] = Class29.readString();
		}
		for (int i_2_ = 0; itemdef_count > i_2_; i_2_++)
		{
			aStringArray27[i_2_] = Class29.readString();
		}
		for (int i_3_ = 0; i_3_ < itemdef_count; i_3_++)
		{
			anIntArray144[i_3_] = Class12.method108();
			if ((anIntArray144[i_3_] + 1) > Class1.anInt1)
			{
				Class1.anInt1 = anIntArray144[i_3_] + 1;
			}
		}
		for (int i_4_ = 0; i_4_ < itemdef_count; i_4_++)
		{
			maybe_itemdef_basePrice[i_4_] = AClass1.method176();
		}
		for (int i_5_ = 0; itemdef_count > i_5_; i_5_++)
		{
			anIntArray1[i_5_] = Class4.readUnsignedByte();
		}
		for (int i_6_ = 0; itemdef_count > i_6_; i_6_++)
		{
			anIntArray112[i_6_] = Class4.readUnsignedByte();
		}
		for (int i_7_ = 0; i_7_ < itemdef_count; i_7_++)
		{
			anIntArray8[i_7_] = Class12.method108();
		}
		for (int i_8_ = 0; itemdef_count > i_8_; i_8_++)
		{
			anIntArray133[i_8_] = AClass1.method176();
		}
		for (int i_9_ = 0; itemdef_count > i_9_; i_9_++)
		{
			anIntArray10[i_9_] = Class4.readUnsignedByte();
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
				maybe_itemdef_basePrice[index] = 0;
				aStringArray27[index] = "";
				anIntArray112[0] = 0;
				anIntArray8[index] = 0;
				anIntArray10[index] = 1;
			}
		}
		npcdef_count = Class12.method108();
		anIntArray132 = new int[npcdef_count];
		npcdef_name = new String[npcdef_count];
		anIntArray143 = new int[npcdef_count];
		anIntArray32 = new int[npcdef_count];
		anIntArray135 = new int[npcdef_count];
		npcdef_description = new String[npcdef_count];
		anIntArray19 = new int[npcdef_count];
		anIntArray150 = new int[npcdef_count];
		anIntArray141 = new int[npcdef_count];
		anIntArray89 = new int[npcdef_count];
		anIntArray3 = new int[npcdef_count];
		anIntArrayArray12 = new int[npcdef_count][12];
		npcdef_command = new String[npcdef_count];
		anIntArray136 = new int[npcdef_count];
		anIntArray86 = new int[npcdef_count];
		anIntArray80 = new int[npcdef_count];
		anIntArray85 = new int[npcdef_count];
		anIntArray81 = new int[npcdef_count];
		for (int index = 0; index < npcdef_count; index++)
		{
			npcdef_name[index] = Class29.readString();
		}
		for (int i_13_ = 0; npcdef_count > i_13_; i_13_++)
		{
			npcdef_description[i_13_] = Class29.readString();
		}
		for (int i_14_ = 0; i_14_ < npcdef_count; i_14_++)
		{
			anIntArray135[i_14_] = Class4.readUnsignedByte();
		}
		for (int i_15_ = 0; npcdef_count > i_15_; i_15_++)
		{
			anIntArray19[i_15_] = Class4.readUnsignedByte();
		}
		for (int i_16_ = 0; npcdef_count > i_16_; i_16_++)
		{
			anIntArray136[i_16_] = Class4.readUnsignedByte();
		}
		for (int i_17_ = 0; npcdef_count > i_17_; i_17_++)
		{
			anIntArray143[i_17_] = Class4.readUnsignedByte();
		}
		for (int i_18_ = 0; i_18_ < npcdef_count; i_18_++)
		{
			anIntArray141[i_18_] = Class4.readUnsignedByte();
		}
		for (int i_19_ = 0; npcdef_count > i_19_; i_19_++)
		{
			for (int i_20_ = 0; i_20_ < 12; i_20_++)
			{
				anIntArrayArray12[i_19_][i_20_] = Class4.readUnsignedByte();
				if (anIntArrayArray12[i_19_][i_20_] == 255)
				{
					anIntArrayArray12[i_19_][i_20_] = -1;
				}
			}
		}
		for (int i_21_ = 0; i_21_ < npcdef_count; i_21_++)
		{
			anIntArray132[i_21_] = AClass1.method176();
		}
		for (int i_22_ = 0; i_22_ < npcdef_count; i_22_++)
		{
			anIntArray3[i_22_] = AClass1.method176();
		}
		for (int i_23_ = 0; npcdef_count > i_23_; i_23_++)
		{
			anIntArray150[i_23_] = AClass1.method176();
		}
		for (int i_24_ = 0; i_24_ < npcdef_count; i_24_++)
		{
			anIntArray85[i_24_] = AClass1.method176();
		}
		for (int i_25_ = 0; i_25_ < npcdef_count; i_25_++)
		{
			anIntArray89[i_25_] = Class12.method108();
		}
		for (int i_26_ = 0; npcdef_count > i_26_; i_26_++)
		{
			anIntArray81[i_26_] = Class12.method108();
		}
		for (int i_27_ = 0; npcdef_count > i_27_; i_27_++)
		{
			anIntArray32[i_27_] = Class4.readUnsignedByte();
		}
		for (int i_28_ = 0; i_28_ < npcdef_count; i_28_++)
		{
			anIntArray86[i_28_] = Class4.readUnsignedByte();
		}
		for (int i_29_ = 0; i_29_ < npcdef_count; i_29_++)
		{
			anIntArray80[i_29_] = Class4.readUnsignedByte();
		}
		for (int i_30_ = 0; npcdef_count > i_30_; i_30_++)
		{
			npcdef_command[i_30_] = Class29.readString();
		}
		anInt140 = Class12.method108();
		aStringArray37 = new String[anInt140];
		aStringArray6 = new String[anInt140];
		for (int i_31_ = 0; i_31_ < anInt140; i_31_++)
		{
			aStringArray37[i_31_] = Class29.readString();
		}
		for (int i_32_ = 0; anInt140 > i_32_; i_32_++)
		{
			aStringArray6[i_32_] = Class29.readString();
		}
		anInt396 = Class12.method108();
		anIntArray7 = new int[anInt396];
		anIntArray20 = new int[anInt396];
		anIntArray78 = new int[anInt396];
		anIntArray137 = new int[anInt396];
		anIntArray13 = new int[anInt396];
		aStringArray11 = new String[anInt396];
		for (int i_33_ = 0; anInt396 > i_33_; i_33_++)
		{
			aStringArray11[i_33_] = Class29.readString();
		}
		for (int i_34_ = 0; i_34_ < anInt396; i_34_++)
		{
			anIntArray137[i_34_] = AClass1.method176();
		}
		for (int i_35_ = 0; anInt396 > i_35_; i_35_++)
		{
			anIntArray13[i_35_] = Class4.readUnsignedByte();
		}
		for (int i_36_ = 0; i_36_ < anInt396; i_36_++)
		{
			anIntArray7[i_36_] = Class4.readUnsignedByte();
		}
		for (int i_37_ = 0; anInt396 > i_37_; i_37_++)
		{
			anIntArray20[i_37_] = Class4.readUnsignedByte();
		}
		for (int i_38_ = 0; i_38_ < anInt396; i_38_++)
		{
			anIntArray78[i_38_] = Class4.readUnsignedByte();
		}
		objectdef_count = Class12.method108();
		maybe_objectdef_command1s = new String[objectdef_count];
		maybe_objectdef_widths_or_heights = new int[objectdef_count];
		objectdef_descriptions = new String[objectdef_count];
		objectdef_itemIds = new int[objectdef_count];
		objectdef_types = new int[objectdef_count];
		maybe_objectdef_heights_or_widths = new int[objectdef_count];
		maybe_objectdef_command2s = new String[objectdef_count];
		maybe_objectdef_grounditemvars = new int[objectdef_count];
		objectdef_names = new String[objectdef_count];
		for (int i_39_ = 0; objectdef_count > i_39_; i_39_++)
		{
			objectdef_names[i_39_] = Class29.readString();
		}
		for (int i_40_ = 0; i_40_ < objectdef_count; i_40_++)
		{
			objectdef_descriptions[i_40_] = Class29.readString();
		}
		for (int i_41_ = 0; i_41_ < objectdef_count; i_41_++)
		{
			maybe_objectdef_command1s[i_41_] = Class29.readString();
		}
		for (int i_42_ = 0; i_42_ < objectdef_count; i_42_++)
		{
			maybe_objectdef_command2s[i_42_] = Class29.readString();
		}
		for (int i_43_ = 0; i_43_ < objectdef_count; i_43_++)
		{
			objectdef_itemIds[i_43_] = AClass1_Sub1.storeModel(Class29.readString());
		}
		for (int i_44_ = 0; objectdef_count > i_44_; i_44_++)
		{
			maybe_objectdef_widths_or_heights[i_44_] = Class4.readUnsignedByte();
		}
		for (int i_45_ = 0; objectdef_count > i_45_; i_45_++)
		{
			maybe_objectdef_heights_or_widths[i_45_] = Class4.readUnsignedByte();
		}
		for (int i_46_ = 0; i_46_ < objectdef_count; i_46_++)
		{
			objectdef_types[i_46_] = Class4.readUnsignedByte();
		}
		for (int i_47_ = 0; i_47_ < objectdef_count; i_47_++)
		{
			maybe_objectdef_grounditemvars[i_47_] = Class4.readUnsignedByte();
		}
		anInt675 = Class12.method108();
		anIntArray79 = new int[anInt675];
		anIntArray140 = new int[anInt675];
		aStringArray15 = new String[anInt675];
		anIntArray41 = new int[anInt675];
		aStringArray44 = new String[anInt675];
		aStringArray17 = new String[anInt675];
		anIntArray2 = new int[anInt675];
		aStringArray40 = new String[anInt675];
		anIntArray21 = new int[anInt675];
		for (int i_48_ = 0; i_48_ < anInt675; i_48_++)
		{
			aStringArray17[i_48_] = Class29.readString();
		}
		for (int i_49_ = 0; i_49_ < anInt675; i_49_++)
		{
			aStringArray44[i_49_] = Class29.readString();
		}
		for (int i_50_ = 0; anInt675 > i_50_; i_50_++)
		{
			aStringArray40[i_50_] = Class29.readString();
		}
		for (int i_51_ = 0; i_51_ < anInt675; i_51_++)
		{
			aStringArray15[i_51_] = Class29.readString();
		}
		for (int i_52_ = 0; anInt675 > i_52_; i_52_++)
		{
			anIntArray140[i_52_] = Class12.method108();
		}
		for (int i_53_ = 0; i_53_ < anInt675; i_53_++)
		{
			anIntArray79[i_53_] = AClass1.method176();
		}
		for (int i_54_ = 0; anInt675 > i_54_; i_54_++)
		{
			anIntArray2[i_54_] = AClass1.method176();
		}
		for (int i_55_ = 0; i_55_ < anInt675; i_55_++)
		{
			anIntArray21[i_55_] = Class4.readUnsignedByte();
		}
		for (int i_56_ = 0; i_56_ < anInt675; i_56_++)
		{
			anIntArray41[i_56_] = Class4.readUnsignedByte();
		}
		anInt743 = Class12.method108();
		anIntArray88 = new int[anInt743];
		anIntArray12 = new int[anInt743];
		for (int i_57_ = 0; i_57_ < anInt743; i_57_++)
		{
			anIntArray88[i_57_] = Class4.readUnsignedByte();
		}
		for (int i_58_ = 0; anInt743 > i_58_; i_58_++)
		{
			anIntArray12[i_58_] = Class4.readUnsignedByte();
		}
		anInt745 = Class12.method108();
		anIntArray54 = new int[anInt745];
		anIntArray37 = new int[anInt745];
		anIntArray22 = new int[anInt745];
		for (int i_59_ = 0; anInt745 > i_59_; i_59_++)
		{
			anIntArray54[i_59_] = AClass1.method176();
		}
		for (int i_60_ = 0; anInt745 > i_60_; i_60_++)
		{
			anIntArray22[i_60_] = Class4.readUnsignedByte();
		}
		for (int i_61_ = 0; anInt745 > i_61_; i_61_++)
		{
			anIntArray37[i_61_] = Class4.readUnsignedByte();
		}
		anInt494 = Class12.method108();
		anInt486 = Class12.method108();
		anIntArrayArray1 = new int[anInt486][];
		aStringArray12 = new String[anInt486];
		anIntArray138 = new int[anInt486];
		anIntArrayArray18 = new int[anInt486][];
		aStringArray36 = new String[anInt486];
		anIntArray139 = new int[anInt486];
		anIntArray153 = new int[anInt486];
		for (int i_62_ = 0; anInt486 > i_62_; i_62_++)
		{
			aStringArray36[i_62_] = Class29.readString();
		}
		for (int i_63_ = 0; anInt486 > i_63_; i_63_++)
		{
			aStringArray12[i_63_] = Class29.readString();
		}
		for (int i_64_ = 0; i_64_ < anInt486; i_64_++)
		{
			anIntArray139[i_64_] = Class4.readUnsignedByte();
		}
		for (int i_65_ = 0; i_65_ < anInt486; i_65_++)
		{
			anIntArray138[i_65_] = Class4.readUnsignedByte();
		}
		for (int i_66_ = 0; i_66_ < anInt486; i_66_++)
		{
			anIntArray153[i_66_] = Class4.readUnsignedByte();
		}
		for (int i_67_ = 0; anInt486 > i_67_; i_67_++)
		{
			final int i_68_ = Class4.readUnsignedByte();
			anIntArrayArray18[i_67_] = new int[i_68_];
			for (int i_69_ = 0; i_68_ > i_69_; i_69_++)
			{
				anIntArrayArray18[i_67_][i_69_] = Class12.method108();
			}
		}
		for (int i_70_ = 0; anInt486 > i_70_; i_70_++)
		{
			final int i_71_ = Class4.readUnsignedByte();
			anIntArrayArray1[i_70_] = new int[i_71_];
			for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
			{
				anIntArrayArray1[i_70_][i_72_] = Class4.readUnsignedByte();
			}
		}
		anInt639 = Class12.method108();
		aStringArray42 = new String[anInt639];
		anIntArray145 = new int[anInt639];
		aStringArray35 = new String[anInt639];
		anIntArray82 = new int[anInt639];
		for (int i_73_ = 0; i_73_ < anInt639; i_73_++)
		{
			aStringArray35[i_73_] = Class29.readString();
		}
		for (int i_74_ = 0; anInt639 > i_74_; i_74_++)
		{
			aStringArray42[i_74_] = Class29.readString();
		}
		for (int i_75_ = 0; i_75_ < anInt639; i_75_++)
		{
			anIntArray145[i_75_] = Class4.readUnsignedByte();
		}
		for (int index = 0; index < anInt639; index++)
		{
			anIntArray82[index] = Class4.readUnsignedByte();
		}
		StreamClass.stringData = null;
		Class52.integerData = null;
	}
}
