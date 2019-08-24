package org.custom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.classic.Class2;
import com.classic.EntityHandler;

public class Dumper {
	public static void Dump()
	{
		new File("dump\\defs\\mud235\\").mkdirs();
		System.out.println("Dumping item definitions..");
		DumpItemDef();
		System.out.println("Dumping animation definitions..");
		DumpAnimationDef();
		System.out.println("Dumping npc definitions..");
		DumpNpcDef();
		System.out.println("Dumping prayer definitions..");
		DumpPrayerDef();
		System.out.println("Dumping wallobject definitions..");
		DumpWallObjectDef();
		System.out.println("Dumping texture definitions..");
		DumpTextureDef();
		System.out.println("Dumping tile definitions..");
		DumpTileDef();
		System.out.println("Dumping tile definitions..");
		DumpElevationDef();
		System.out.println("Dumping spell definitions..");
		DumpSpellDef();
		System.out.println("Dumping object definitions..");
		DumpObjectDef();
		System.out.println("Done.");
		System.exit(0);
	}
	
	public static void DumpObjectDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Object.csv"));
			
			Out.print("name,description,command1,command2,modelName,type,width,height,groundItemVar");
			
			for(int Index = 0; Index < EntityHandler.objectdef_count; ++Index)
			{
				String Name = EntityHandler.objectdef_name[Index].replace("'", "''");
				String Description = EntityHandler.objectdef_description[Index].replace("'", "''");
				String Cmd1 = EntityHandler.objectdef_command1[Index].replace("'", "''");
				String Cmd2 = EntityHandler.objectdef_command2[Index].replace("'", "''");
				String ModelName = Class2.modelNames[EntityHandler.objectdef_modelIndex[Index]].replace("'", "''");
				
				Out.format("\r\n'%s','%s','%s','%s','%s',%d,%d,%d,%d",
						Name, Description, Cmd1, Cmd2, ModelName,
						EntityHandler.objectdef_type[Index], EntityHandler.objectdef_width[Index], EntityHandler.objectdef_height[Index], EntityHandler.objectdef_groundItemVar[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpSpellDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Spell.csv"));
			
			Out.print("name,description,level,type,runeCount,requiredIds,requiredAmounts");
			
			for(int Index = 0; Index < EntityHandler.spelldef_count; ++Index)
			{
				String Name = EntityHandler.spelldef_name[Index].replace("'", "''");
				String Description = EntityHandler.spelldef_description[Index].replace("'", "''");
				
				String RequiredIds = "";
				
				for(int RuneIndex = 0; 
						RuneIndex < EntityHandler.spelldef_runesRequiredIds[Index].length; 
						++RuneIndex)
				{
					if(RuneIndex != 0)
					{
						RequiredIds += ",";
					}
					RequiredIds += EntityHandler.spelldef_runesRequiredIds[Index][RuneIndex];
				}
				
				String RequiredAmounts = "";
				
				for(int RuneIndex = 0; 
						RuneIndex < EntityHandler.spelldef_runesRequiredAmounts[Index].length; 
						++RuneIndex)
				{
					if(RuneIndex != 0)
					{
						RequiredAmounts += ",";
					}
					RequiredAmounts += EntityHandler.spelldef_runesRequiredAmounts[Index][RuneIndex];
				}
				
				Out.format("\r\n'%s','%s',%d,%d,%d,'%s','%s'",
						Name, Description,
						EntityHandler.spelldef_level[Index], EntityHandler.spelldef_type[Index],
						EntityHandler.spelldef_runeCount[Index],
						RequiredIds, RequiredAmounts);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpElevationDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Elevation.csv"));
			
			Out.print("unknown1,unknown2");
			
			for(int Index = 0; Index < EntityHandler.elevationdef_count; ++Index)
			{
				Out.format("%d,%d\n", EntityHandler.elevationdef_unknown1[Index], EntityHandler.elevationdef_unknown2[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpTileDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Tile.csv"));
			
			Out.print("color,tileValue,objectType");
			
			for(int Index = 0; Index < EntityHandler.tiledef_count; ++Index)
			{
				Out.format("\r\n%d,%d,%d", EntityHandler.tiledef_color[Index] & 0xFFFFFFFFL, EntityHandler.tiledef_tileValue[Index], EntityHandler.tiledef_objectType[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpTextureDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Texture.csv"));
			
			Out.print("name,animationName");
			
			for(int Index = 0; Index < EntityHandler.texturedef_count; ++Index)
			{
				String Name = EntityHandler.texturedef_name[Index].replace("'", "''");
				String AnimationName = EntityHandler.texturedef_animationName[Index].replace("'", "''");
				Out.format("\r\n'%s','%s'", Name, AnimationName);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpWallObjectDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Wallobject.csv"));
			
			Out.print("name,description,command1,command2,type,height,modelVar2,modelVar3,unknown");
			
			for(int Index = 0; Index < EntityHandler.wallobjectdef_count; ++Index)
			{
				String Name = EntityHandler.wallobjectdef_name[Index].replace("'", "''");
				String Desc = EntityHandler.wallobjectdef_description[Index].replace("'", "''");
				String Cmd1 = EntityHandler.wallobjectdef_command1[Index].replace("'", "''");
				String Cmd2 = EntityHandler.wallobjectdef_command2[Index].replace("'", "''");
				
				Out.format("\r\n'%s','%s','%s','%s',%d,%d,%d,%d,%d", 
						   Name, Desc, Cmd1, Cmd2,
						   EntityHandler.wallobjectdef_type[Index],
						   EntityHandler.wallobjectdef_height[Index],
						   EntityHandler.wallobjectdef_modelVar2[Index],
						   EntityHandler.wallobjectdef_modelVar3[Index],
						   EntityHandler.wallobjectdef_unknown[Index]);
						   
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpPrayerDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Prayer.csv"));
			
			Out.print("name,description,level,drainRate");
			
			for(int Index = 0; Index < EntityHandler.prayerdef_count; ++Index)
			{
				String Name = EntityHandler.prayerdef_name[Index].replace("'", "''");
				String Desc = EntityHandler.prayerdef_description[Index].replace("'", "''");
				
				Out.format("\r\n'%s','%s',%d,%d", 
						   Name, Desc,
						   EntityHandler.prayerdef_level[Index], EntityHandler.prayerdef_drainRate[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	static int convertSprite(int In)
	{
		int Result = In;
		
		if(Result == -1)
			Result = 255;
		return Result;
	}
	
	public static void DumpNpcDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Npc.csv"));
			
			Out.print("name,description,command,attack,strength,defense,hits,attackable,sprites,hairColor,topColor,bottomColor,skinColor,camera1,camera2,walkModel,combatModel,combatSprite");
			
			for(int Index = 0; Index < EntityHandler.npcdef_count; ++Index)
			{
				String Name = EntityHandler.npcdef_name[Index].replace("'", "''");
				String Desc = EntityHandler.npcdef_description[Index].replace("'", "''");
				String Cmd = EntityHandler.npcdef_command[Index].replace("'", "''");
				
				Out.format("\r\n'%s','%s','%s',%d,%d,%d,%d,%d,'%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d',%d,%d,%d,%d,%d,%d,%d,%d,%d", 
						   Name, Desc, Cmd,
						   EntityHandler.npcdef_attack[Index], EntityHandler.npcdef_strength[Index], EntityHandler.npcdef_defense[Index],
						   EntityHandler.npcdef_hits[Index], EntityHandler.npcdef_attackable[Index],
						   convertSprite(EntityHandler.npcdef_sprites[Index][0]), convertSprite(EntityHandler.npcdef_sprites[Index][1]),
						   convertSprite(EntityHandler.npcdef_sprites[Index][2]), convertSprite(EntityHandler.npcdef_sprites[Index][3]),
						   convertSprite(EntityHandler.npcdef_sprites[Index][4]), convertSprite(EntityHandler.npcdef_sprites[Index][5]),
						   convertSprite(EntityHandler.npcdef_sprites[Index][6]), convertSprite(EntityHandler.npcdef_sprites[Index][7]),
						   convertSprite(EntityHandler.npcdef_sprites[Index][8]), convertSprite(EntityHandler.npcdef_sprites[Index][9]),
						   convertSprite(EntityHandler.npcdef_sprites[Index][10]), convertSprite(EntityHandler.npcdef_sprites[Index][11]),
						   EntityHandler.npcdef_hairColor[Index], EntityHandler.npcdef_topColor[Index],
						   EntityHandler.npcdef_bottomColor[Index], EntityHandler.npcdef_skinColor[Index],
						   EntityHandler.npcdef_camera1[Index], EntityHandler.npcdef_camera2[Index],
						   EntityHandler.npcdef_walkModel[Index], EntityHandler.npcdef_combatModel[Index],
						   EntityHandler.npcdef_combatSprite[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpAnimationDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Animation.csv"));
			
			Out.print("name,genderModel,number,color,hasA,hasF");
			
			for(int Index = 0; Index < EntityHandler.animationdef_count; ++Index)
			{
				String Name = EntityHandler.animationdef_name[Index].replace("'", "''");
				
				Out.format("\r\n'%s',%d,%d,%d,%d,%d", 
						   Name, 
						   EntityHandler.animationdef_genderModel[Index], EntityHandler.animationdef_number[Index],
						   EntityHandler.animationdef_color[Index] & 0xFFFFFFFFL, 
						   EntityHandler.animationdef_hasA[Index], EntityHandler.animationdef_hasF[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public static void DumpItemDef()
	{
		try
		{
			PrintStream Out = new PrintStream(new FileOutputStream("dump\\defs\\mud235\\Item.csv"));
			
			Out.print("name,description,command,basePrice,isMembers,isQuest,isUnstackable,wearableId,sprite,color,unknown");
			
			for(int Index = 0; Index < EntityHandler.itemdef_count; ++Index)
			{
				String Name = EntityHandler.itemdef_name[Index].replace("'", "''");
				String Desc = EntityHandler.itemdef_description[Index].replace("'", "''");
				String Cmd = EntityHandler.itemdef_command[Index].replace("'", "''");
				
				Out.format("\r\n'%s','%s','%s',%d,%d,%d,%d,%d,%d,%d,%d", 
						   Name, Desc, Cmd, 
						   EntityHandler.itemdef_basePrice[Index], EntityHandler.itemdef_isMembers[Index],
						   EntityHandler.itemdef_isQuest[Index], EntityHandler.itemdef_isUnstackable[Index],
						   EntityHandler.itemdef_wearableId[Index], EntityHandler.itemdef_sprite[Index],
						   EntityHandler.itemdef_color[Index] & 0xFFFFFFFFL, EntityHandler.itemdef_unknown[Index]);
			}
			
			Out.close();
		}
		catch (Exception e) {e.printStackTrace();}
	}
}
