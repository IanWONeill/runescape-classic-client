package com.classic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public final class Client extends Applet_Sub1
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static int anInt757;
	static int anInt758;
	static int anInt759;
	static int anInt760;
	static int anInt761;
	static int anInt762;
	static int anInt763;
	static int anInt764;
	static int anInt765;
	private String aString28;
	static int anInt766;
	static int anInt767;
	static int anInt768;
	static int anInt769;
	static int anInt770;
	static int anInt771;
	static int anInt772;
	private final Class27_Sub1_Sub1 aClass27_Sub1_Sub1_2 = new Class27_Sub1_Sub1(5000);
	private Class16_Sub1 aClass16_Sub1_1;
	static int anInt773;
	static int anInt774;
	static int anInt775;
	static int anInt776;
	static int anInt777;
	static int anInt778;
	static int anInt779;
	static int anInt780;
	static int anInt781;
	static int anInt782;
	static int anInt783;
	static int anInt784;
	static int anInt785;
	private int anInt786;
	static int anInt787;
	static int anInt788;
	static int anInt789;
	static int anInt790;
	static int anInt791;
	static int anInt792;
	static int anInt793;
	static int anInt794;
	static char[] aCharArray4 = { '[', ']', '#' };
	static int anInt795;
	static int anInt796;
	static int anInt797;
	static int anInt798;
	private int anInt799;
	static int anInt800;
	static int anInt801;
	static int anInt802;
	static int anInt803;
	static int anInt804;
	static int anInt805;
	static int anInt806;
	static int anInt807;
	static int anInt808;
	static int anInt809;
	static int anInt810;
	static int anInt811;
	static int anInt812;
	static int anInt813;
	static int anInt814;
	static int anInt815;
	static int anInt816;
	static int anInt817;
	static int anInt818;
	static int anInt819;
	static int anInt820;
	static int anInt821;
	static int anInt822;
	static int anInt823;
	static int anInt824;
	static int anInt825;
	static int anInt826;
	static int anInt827;
	static int anInt828;
	static int anInt829;
	static int anInt830;
	static int anInt831;
	static int anInt832;
	static int anInt833;
	static int anInt834;
	static int anInt835;
	static int anInt836;
	static int anInt837;
	static int anInt838;
	static int anInt839;
	static int anInt840;
	static int anInt841;
	static int anInt842;
	private int anInt843;
	static int anInt844;
	private int anInt845;
	private long aLong17;
	static int anInt846;
	static int anInt847;
	private boolean aBool50;
	static int anInt848;
	private int anInt849;
	private boolean aBool51;
	private int anInt850;
	static int anInt851;
	private int anInt852;
	private final int anInt853 = 512;
	private int anInt854;
	private final int anInt855;
	private final int anInt856;
	static int anInt857;
	private int anInt858;
	private int anInt859;
	private final int anInt860;
	static int anInt861;
	static int anInt862;
	private int anInt863;
	private int anInt864;
	static int anInt865;
	private int anInt866;
	private int anInt867;
	private int anInt868;
	static int anInt869;
	static int anInt870;
	static int anInt871;
	static int anInt872;
	private int anInt873;
	static int anInt874;
	private final Class15[] aClass15Array1;
	private boolean aBool52;
	static int anInt875;
	private int anInt876;
	private final int[] anIntArray154;
	private boolean aBool53 = false;
	static int anInt877;
	static int anInt878;
	private final int anInt879;
	private int anInt880;
	static int anInt881;
	private int anInt882;
	private final Class15[] aClass15Array2;
	static int anInt883;
	static int anInt884;
	private int anInt885;
	private int anInt886;
	private int anInt887;
	private int anInt888;
	private Class41 aClass41_2;
	static int anInt889;
	private final int[] anIntArray155;
	private int anInt890;
	static int anInt891;
	static int anInt892;
	private Class46_Sub1 aClass46_Sub1_2;
	private int anInt893;
	private int anInt894;
	private final long[] aLongArray4;
	static int anInt895;
	private boolean aBool54;
	private int anInt896;
	static int anInt897;
	static int anInt898;
	private int anInt899;
	static int anInt900;
	private int anInt901;
	private int anInt902;
	private int anInt903;
	private final Class15[] aClass15Array3;
	private int anInt904;
	private final int[] anIntArray156;
	private Graphics aGraphics2;
	private int anInt905;
	private int anInt906;
	private int anInt907;
	private int anInt908;
	static int anInt909;
	private boolean aBool55;
	private int anInt910;
	private int anInt911;
	private int anInt912;
	static int anInt913;
	private int anInt914;
	private int anInt915;
	private int anInt916;
	private Class6 aClass6_1;
	static int anInt917;
	private int anInt918;
	static int anInt919;
	private Class15 aClass15_1;
	static int anInt920;
	private int anInt921;
	private int anInt922;
	private int anInt923;
	static int anInt924;
	private int anInt925;
	private int anInt926;
	private int anInt927;
	private int anInt928;
	private boolean aBool56;
	static int anInt929;
	private int anInt930;
	private int anInt931;
	private int anInt932;
	private int anInt933;
	private final int[] anIntArray157;
	private int anInt934;
	private int anInt935;
	private int anInt936;
	private int anInt937;
	private int anInt938;
	private final String[] aStringArray45;
	private final int[] anIntArray158;
	private int anInt939;
	private final Class15[] aClass15Array4;
	private int anInt940;
	private String aString29;
	private boolean aBool57;
	private int anInt941;
	private int anInt942;
	private final int[] anIntArray159;
	private int anInt943;
	private Class10 aClass10_1;
	private final int[] anIntArray160;
	private int anInt944;
	private final boolean[] aBoolArray11;
	private int anInt945;
	private final boolean[] aBoolArray12;
	private int anInt946;
	private final int[] anIntArray161;
	private int anInt947;
	private final boolean[] aBoolArray13;
	private final int anInt948;
	private Class29 aClass29_1;
	private final int[] anIntArray162;
	private final int[] anIntArray163;
	private boolean aBool58;
	private final int[] anIntArray164;
	private int anInt949;
	private final int[] anIntArray165;
	private Class10 aClass10_2;
	private final String[] aStringArray46;
	private final int[] anIntArray166;
	private int anInt950;
	private int anInt951;
	private int anInt952;
	private boolean aBool59;
	private int anInt953;
	private int anInt954;
	private boolean aBool60;
	private boolean aBool61;
	private boolean aBool62;
	private final int[] anIntArray167;
	private int anInt955;
	private int anInt956;
	private int anInt957;
	private int anInt958;
	private boolean aBool63;
	private boolean aBool64;
	private String aString30;
	private boolean aBool65;
	private final int[] anIntArray168;
	private final int[] anIntArray169;
	private int anInt959;
	private boolean aBool66;
	private boolean aBool67;
	private final int[] anIntArray170;
	private boolean aBool68;
	private int anInt960;
	private int anInt961;
	private final String[] aStringArray47;
	private boolean aBool69;
	private int anInt962;
	private final int[] anIntArray171;
	private int[] anIntArray172;
	private int anInt963;
	private int anInt964;
	private int anInt965;
	private Class10 aClass10_3;
	private final boolean[] aBoolArray14;
	private int anInt966;
	private int anInt967;
	private int anInt968;
	private int anInt969;
	private final int[] anIntArray173;
	private final int[] anIntArray174;
	private String aString31;
	private int anInt970;
	private int anInt971;
	private final Class23[] aClass23Array4;
	private int anInt972;
	private final String[] aStringArray48;
	private String[] aStringArray49;
	private final int anInt973;
	private final int[] anIntArray175;
	private int[] anIntArray176;
	private int[] anIntArray177;
	private int anInt974;
	private int anInt975;
	private int anInt976;
	private final int[] anIntArray178;
	private int anInt977;
	private int anInt978;
	private boolean aBool70;
	private AClass4_Sub2 anAClass4_Sub2_1;
	private Class15[] aClass15Array5;
	private final int[] anIntArray179;
	private int anInt979;
	private final int[] anIntArray180;
	private final int[] anIntArray181;
	private int anInt980;
	private int anInt981;
	private int anInt982;
	private int anInt983;
	private int anInt984;
	private int anInt985;
	private boolean aBool71;
	private int anInt986;
	private final int[] anIntArray182;
	private int anInt987;
	private int anInt988;
	private int anInt989;
	private final int[] anIntArray183;
	private final int[] anIntArray184;
	private int anInt990;
	private boolean aBool72;
	private int anInt991;
	private int anInt992;
	private boolean aBool73;
	private boolean aBool74;
	private int anInt993;
	private int anInt994;
	private final int[] anIntArray185;
	private int anInt995;
	private Class10 aClass10_4;
	private int anInt996;
	private boolean aBool75;
	private int anInt997;
	private int anInt998;
	private int anInt999;
	private final int[] anIntArray186;
	private final int[] anIntArray187;
	private int anInt1000;
	private boolean aBool76;
	private final Class15[] aClass15Array6;
	private int anInt1001;
	private String aString32;
	private final int[] anIntArray188;
	private int anInt1002;
	private int anInt1003;
	private String aString33;
	private int[] anIntArray189;
	private final int[] anIntArray190;
	private int anInt1004;
	private int anInt1005;
	private boolean aBool77;
	private final int[] anIntArray191;
	private int anInt1006;
	private final int[] anIntArray192;
	private int anInt1007;
	private Class10 aClass10_5;
	private String aString34;
	private int anInt1008;
	private final int[] anIntArray193;
	private boolean aBool78;
	private Class29 aClass29_2;
	private boolean aBool79;
	private String aString35;
	private String aString36;
	private final int[] anIntArray194;
	private final boolean aBool80;
	private final int[] anIntArray195;
	private String aString37;
	private final int[] anIntArray196;
	private int anInt1009;
	private int anInt1010;
	private boolean aBool81;
	private int anInt1011;
	private int anInt1012;
	private final int[][] anIntArrayArray21;
	private int anInt1013;
	private final int[] anIntArray197;
	private final int[] anIntArray198;
	private final Class23[] aClass23Array5;
	private boolean aBool82;
	private int anInt1014;
	private final String[] aStringArray50;
	private final Class23[] aClass23Array6;
	private int anInt1015;
	private final int[] anIntArray199;
	private int anInt1016;
	private int anInt1017;
	private int anInt1018;
	private int anInt1019;
	private Class10 aClass10_6;
	private final int[] anIntArray200;
	private int anInt1020;
	private int anInt1021;
	private final int[] anIntArray201;
	private byte[] aByteArray28;
	private final int[] anIntArray202;
	private int anInt1022;
	private final int[] anIntArray203;
	private int anInt1023;
	private int anInt1024;
	private Class29 aClass29_3;
	private final int[] anIntArray204;
	private boolean aBool83;
	private int anInt1025;
	private int anInt1026;
	private final int[] anIntArray205;
	private int anInt1027;
	private int anInt1028;
	private boolean aBool84;
	private final int[] anIntArray206;
	private int anInt1029;
	private int anInt1030;
	private int anInt1031;
	private int anInt1032;
	private boolean aBool85;
	private String aString38;
	private int anInt1033;
	private int anInt1034;
	private boolean aBool86;
	private final int[] anIntArray207;
	private int anInt1035;
	private int anInt1036;
	private final int[] anIntArray208;
	private int anInt1037;
	private int anInt1038;
	private int anInt1039;
	private final int[] anIntArray209;
	private int anInt1040;
	private int anInt1041;
	private final int[] anIntArray210;
	private int anInt1042;
	private boolean aBool87;
	private int anInt1043;
	private int anInt1044;
	private final int[] anIntArray211;
	private int anInt1045;
	static int anInt1046;
	private String aString39;
	private final int[] anIntArray212;
	private final int[] anIntArray213;
	private boolean aBool88;
	private int anInt1047;
	private final int[] anIntArray214;
	private final int[] anIntArray215;
	private int anInt1048;
	private int anInt1049;
	private final int[] anIntArray216;
	private int anInt1050;
	private int anInt1051;
	private String aString40;
	private Class10 aClass10_7;
	private boolean aBool89;
	private int anInt1052;
	private int anInt1053;
	private int anInt1054;
	private final int[] anIntArray217;
	private int anInt1055;
	private int anInt1056;
	private int anInt1057;
	private boolean aBool90;
	private boolean aBool91;
	private int anInt1058;
	private final int[] anIntArray218;
	private final String[] aStringArray51;
	private final int[] anIntArray219;
	private final int[] anIntArray220;
	private int anInt1059;
	private int anInt1060;
	private int anInt1061;
	private int anInt1062;
	private boolean aBool92;
	private int anInt1063;
	private boolean aBool93;
	private Class37 aClass37_1;
	private int anInt1064;
	private final int[] anIntArray221;

	private void method490(final boolean bool)
	{
		anInt787++;
		final int i = this.anInt720;
		final int i_0_ = this.anInt694;
		final int i_1_ = (anInt941 - i) + -anInt853;
		final int i_2_ = ((-anInt879 - 12) + anInt1023) - i_0_;
		if ((i > 0) || (i_1_ > 0) || (0 < i_0_) || (0 < i_2_))
		{
			try
			{
				Container container;
				if (aBool51)
				{
					if (Class27.anApplet1 == null)
					{
						container = this;
					}
					else
					{
						container = Class27.anApplet1;
					}
				}
				else
				{
					container = Class38.aFrame_Sub1_1;
				}
				final Graphics graphics = container.getGraphics();
				if (graphics != null)
				{
					graphics.setColor(Color.black);
					if (0 < i)
					{
						graphics.fillRect(0, 0, i, anInt1023);
					}
					if (0 < i_0_)
					{
						graphics.fillRect(0, 0, anInt941, i_0_);
					}
					if (0 < i_1_)
					{
						graphics.fillRect(-i_1_ + anInt941, 0, i_1_, anInt1023);
					}
					if (0 < i_2_)
					{
						graphics.fillRect(0, anInt1023 - i_2_, anInt941, i_2_);
					}
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
	}

	private void method491(final byte i)
	{
		anInt1046++;
		if (anInt899 != 0)
		{
			if (anInt1051 > 450)
			{
				method513(0, "You can't logout during combat!", 0, null, -109, "@cya@", null, false);
			}
			else if (anInt1051 > 0)
			{
				method513(0, "You can't logout for 10 seconds after combat", 0, null, -29, "@cya@", null, false);
			}
			else
			{
				aClass16_Sub1_1.method118(102, 56);
				aClass16_Sub1_1.method126(2);
				anInt970 = 1000;
			}
		}
	}

	private String method492(final int i, final byte i_4_)
	{
		anInt758++;
		final Class20 class20 = Frame_Sub1.aClass32_4.method222(i, -29661);
		while (class20.anInt216 == 0)
		{
			Class7.method51(i_4_ ^ ~0x7b, 50L);
		}
		if (i_4_ != -66)
		{
			return null;
		}
		if ((class20.anInt216 == 1) && (class20.anObject2 != null))
		{
			return (String) class20.anObject2;
		}
		return Class16.method115(i, i_4_ + 151);
	}

	private void method493(final int i)
	{
		anInt773++;
		int i_5_ = 65;
		if (anInt963 != 201)
		{
			i_5_ += 60;
		}
		if (anInt993 > 0)
		{
			i_5_ += 30;
		}
		if (anInt1021 != 0)
		{
			i_5_ += 45;
		}
		aClass46_Sub1_2.method321(-(i_5_ / 2) + 167, 0, i_5_, 400, 56, i);
		int i_6_ = -(i_5_ / 2) + 167;
		i_6_ += 20;
		aClass46_Sub1_2.method362(i_5_, 56, (byte) -57, 400, 16777215, -(i_5_ / 2) + 167);
		aClass46_Sub1_2.method335(16776960, 255, 4,
		        new StringBuilder().append("Welcome to RuneScape ").append(aClass15_1.aString7).toString(), i_6_, 256);
		i_6_ += 30;
		String string;
		if (anInt988 != 0)
		{
			if (anInt988 != 1)
			{
				string = new StringBuilder().append(anInt988).append(" days ago").toString();
			}
			else
			{
				string = "yesterday";
			}
		}
		else
		{
			string = "earlier today";
		}
		if (anInt1021 != 0)
		{
			aClass46_Sub1_2.method335(16777215, 255, 1,
			        new StringBuilder().append("You last logged in ").append(string).toString(), i_6_, 256);
			if (aString36 == null)
			{
				aString36 = method492(anInt1021, (byte) -66);
			}
			i_6_ += 15;
			aClass46_Sub1_2.method335(16777215, 255, 1,
			        new StringBuilder().append("from: ").append(aString36).toString(), i_6_, 256);
			i_6_ += 15;
			i_6_ += 15;
		}
		if (0 < anInt993)
		{
			if (anInt993 == 1)
			{
				aClass46_Sub1_2.method335(16777215, 255, 1,
				        "You have @yel@0@whi@ unread messages in your message-centre", i_6_, 256);
			}
			else
			{
				aClass46_Sub1_2.method335(16777215, i ^ 0xfe, 1, new StringBuilder().append("You have @gre@")
				        .append(anInt993 - 1).append(" unread messages @whi@in your message-centre").toString(), i_6_,
				        256);
			}
			i_6_ += 15;
			i_6_ += 15;
		}
		if (anInt963 != 201)
		{
			if (anInt963 == 200)
			{
				aClass46_Sub1_2.method335(16744448, 255, 1, "You have not yet set any password recovery questions.",
				        i_6_, 256);
				i_6_ += 15;
				aClass46_Sub1_2.method335(16744448, 255, 1,
				        "We strongly recommend you do so now to secure your account.", i_6_, 256);
				i_6_ += 15;
				aClass46_Sub1_2.method335(16744448, 255, 1,
				        "Do this from the 'account management' area on our front webpage", i_6_, 256);
				i_6_ += 15;
			}
			else
			{
				if (anInt963 != 0)
				{
					if (anInt963 == 1)
					{
						string = "Yesterday";
					}
					else
					{
						string = new StringBuilder().append(anInt963).append(" days ago").toString();
					}
				}
				else
				{
					string = "Earlier today";
				}
				aClass46_Sub1_2.method335(16744448, i ^ 0xfe, 1,
				        new StringBuilder().append(string).append(" you changed your recovery questions").toString(),
				        i_6_, 256);
				i_6_ += 15;
				aClass46_Sub1_2.method335(16744448, 255, 1,
				        "If you do not remember making this change then cancel it immediately", i_6_, 256);
				i_6_ += 15;
				aClass46_Sub1_2.method335(16744448, 255, 1,
				        "Do this from the 'account management' area on our front webpage", i_6_, 256);
				i_6_ += 15;
			}
			i_6_ += 15;
		}
		int i_7_ = 16777215;
		if ((this.anInt736 > (i_6_ - 12)) && (i_6_ >= this.anInt736) && (106 < this.anInt739) && (this.anInt739 < 406))
		{
			i_7_ = 16711680;
		}
		aClass46_Sub1_2.method335(i_7_, 255, 1, "Click here to close window", i_6_, 256);
		if (anInt887 == 1)
		{
			if (i_7_ == 16711680)
			{
				aBool91 = false;
			}
			if (((86 > this.anInt739) || (426 < this.anInt739))
			        && (((-(i_5_ / 2) + 167) > this.anInt736) || (this.anInt736 > ((i_5_ / 2) + 167))))
			{
				aBool91 = false;
			}
		}
		anInt887 = 0;
	}

	private void method494(final byte i, final String string)
	{
		if (i != -83)
		{
			anInt963 = -50;
		}
		anInt765++;
		final String string_8_ = Class43.method298((byte) 101, string);
		if (string_8_ != null)
		{
			for (int i_9_ = 0; i_9_ < Class10.anInt129; i_9_++)
			{
				if (string_8_.equals(Class43.method298((byte) -43, (Class41.aStringArray28[i_9_]))))
				{
					Class10.anInt129--;
					for (int i_10_ = i_9_; Class10.anInt129 > i_10_; i_10_++)
					{
						Class46.aStringArray33[i_10_] = Class46.aStringArray33[i_10_ + 1];
						Class41.aStringArray28[i_10_] = Class41.aStringArray28[i_10_ + 1];
						Class6.aStringArray7[i_10_] = Class6.aStringArray7[i_10_ + 1];
						Class3.aStringArray4[i_10_] = Class3.aStringArray4[i_10_];
					}
					aClass16_Sub1_1.method118(241, 101);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, string);
					aClass16_Sub1_1.method126(i + 85);
					break;
				}
			}
		}
	}

	private void method495(final int i)
	{
		try
		{
			aByteArray28 = method468("Sound effects", 90, 10, -21865);
			Class37.method231(22050, false, 1);
			Container container;
			if (Class38.aFrame_Sub1_1 == null)
			{
				if (Class27.anApplet1 != null)
				{
					container = Class27.anApplet1;
				}
				else
				{
					container = this;
				}
			}
			else
			{
				container = Class38.aFrame_Sub1_1;
			}
			aClass37_1 = Class37.method242(Frame_Sub1.aClass32_4, container, 0, 22050);
			anAClass4_Sub2_1 = new AClass4_Sub2();
			aClass37_1.method232(anAClass4_Sub2_1);
		}
		catch (final Throwable throwable)
		{
			System.out.println(new StringBuilder().append("Unable to init sounds:").append(throwable).toString());
		}
		anInt796++;
	}

	private void method496(final int i)
	{
		anInt807++;
		final int i_11_ = 400;
		int i_12_ = 100;
		if (aBool74)
		{
			i_12_ = 450;
			i_12_ = 300;
		}
		aClass46_Sub1_2.method321(-(i_12_ / 2) + 167, 0, i_12_, i_11_, -(i_11_ / 2) + 256, i + 2);
		if (i != -1)
		{
			method524(81, 12, 82);
		}
		aClass46_Sub1_2.method362(i_12_, -(i_11_ / 2) + 256, (byte) 106, i_11_, 16777215, -(i_12_ / 2) + 167);
		aClass46_Sub1_2.method333(187 - (i_12_ / 2), (byte) -7, i_11_ + -40, 1, 16777215, aString38, 256, true);
		final int i_13_ = (i_12_ / 2) + 157;
		int i_14_ = 16777215;
		if ((this.anInt736 > (i_13_ - 12)) && (this.anInt736 <= i_13_) && (106 < this.anInt739)
		        && (this.anInt739 < 406))
		{
			i_14_ = 16711680;
		}
		aClass46_Sub1_2.method335(i_14_, 255, 1, "Click here to close window", i_13_, 256);
		if (anInt887 == 1)
		{
			if (i_14_ == 16711680)
			{
				aBool88 = false;
			}
			if ((((256 - (i_11_ / 2)) > this.anInt739) || (((i_11_ / 2) + 256) < this.anInt739))
			        && ((this.anInt736 < (167 - (i_12_ / 2))) || ((167 - -(i_12_ / 2)) < this.anInt736)))
			{
				aBool88 = false;
			}
		}
		anInt887 = 0;
	}

	private void method497(int i, final int i_15_, final int i_16_)
	{
		i = aClass16_Sub1_1.method122(i, false);
		anInt763++;
		if (i != 131)
		{
			if (i == 4)
			{
				method544(true, (byte) 72);
			}
			else if (i != 183)
			{
				if (i == 189)
				{
					aClass27_Sub1_Sub1_2.anInt608 += 28;
					if (aClass27_Sub1_Sub1_2.method393(0))
					{
						Class2.method3(aClass27_Sub1_Sub1_2.anInt608 + -28, aClass27_Sub1_Sub1_2, true);
					}
				}
				else if (i != 165)
				{
					if (i != 149)
					{
						if (i == 237)
						{
							final String string = aClass27_Sub1_Sub1_2.method398(-1);
							String string_17_ = aClass27_Sub1_Sub1_2.method398(-1);
							if (string_17_.length() == 0)
							{
								string_17_ = string;
							}
							final String string_18_ = aClass27_Sub1_Sub1_2.method398(-1);
							String string_19_ = aClass27_Sub1_Sub1_2.method398(-1);
							if (0 == string_19_.length())
							{
								string_19_ = string;
							}
							final boolean bool = 1 == aClass27_Sub1_Sub1_2.method403(false);
							for (int i_20_ = 0; Class10.anInt129 > i_20_; i_20_++)
							{
								if (!bool)
								{
									if (Class41.aStringArray28[i_20_].equals(string_17_))
									{
										return;
									}
								}
								else if (Class41.aStringArray28[i_20_].equals(string_19_))
								{
									Class46.aStringArray33[i_20_] = string;
									Class41.aStringArray28[i_20_] = string_17_;
									Class6.aStringArray7[i_20_] = string_18_;
									Class3.aStringArray4[i_20_] = string_19_;
									return;
								}
							}
							if (bool)
							{
								System.out.println(new StringBuilder()
								        .append("Error: ignore display name change packet received, but old name '")
								        .append(string_19_).append("' is not on ignore list").toString());
								return;
							}
							Class46.aStringArray33[Class10.anInt129] = string;
							Class41.aStringArray28[Class10.anInt129] = string_17_;
							Class6.aStringArray7[Class10.anInt129] = string_18_;
							Class3.aStringArray4[Class10.anInt129] = string_19_;
							Class10.anInt129++;
						}
						else if (i != 109)
						{
							if (i != 51)
							{
								if (i == 120)
								{
									final String string = aClass27_Sub1_Sub1_2.method398(i_15_ ^ ~0x14);
									final String string_21_ = aClass27_Sub1_Sub1_2.method398(-1);
									final int i_22_ = aClass27_Sub1_Sub1_2.method403(false);
									final long l = aClass27_Sub1_Sub1_2.method396((byte) 126);
									final String string_23_ = Class4.method8(aClass27_Sub1_Sub1_2, i_15_ + -66);
									for (int i_24_ = 0; 100 > i_24_; i_24_++)
									{
										if (l == aLongArray4[i_24_])
										{
											return;
										}
									}
									aLongArray4[anInt911] = l;
									anInt911 = (anInt911 - -1) % 100;
									method513(i_22_, string_23_, 1, string, i_15_ ^ ~0x71, null, string_21_,
									        i_22_ == 2);
								}
								else if (i != 87)
								{
									method547((byte) -34, i, i_16_);
								}
								else
								{
									final String string = aClass27_Sub1_Sub1_2.method398(i_15_ + -21);
									final String string_25_ = Class4.method8(aClass27_Sub1_Sub1_2, -46);
									method513(0, string_25_, 2, string, i_15_ ^ ~0x27, null, string, false);
								}
							}
							else
							{
								anInt904 = aClass27_Sub1_Sub1_2.method403(false);
								anInt908 = aClass27_Sub1_Sub1_2.method403(false);
								anInt890 = aClass27_Sub1_Sub1_2.method403(false);
								anInt934 = aClass27_Sub1_Sub1_2.method403(false);
							}
						}
						else
						{
							Class10.anInt129 = aClass27_Sub1_Sub1_2.method403(false);
							for (int i_26_ = 0; Class10.anInt129 > i_26_; i_26_++)
							{
								Class46.aStringArray33[i_26_] = aClass27_Sub1_Sub1_2.method398(-1);
								Class41.aStringArray28[i_26_] = aClass27_Sub1_Sub1_2.method398(-1);
								Class6.aStringArray7[i_26_] = aClass27_Sub1_Sub1_2.method398(-1);
								Class3.aStringArray4[i_26_] = aClass27_Sub1_Sub1_2.method398(-1);
							}
						}
					}
					else
					{
						final String string = aClass27_Sub1_Sub1_2.method398(-1);
						final String string_27_ = aClass27_Sub1_Sub1_2.method398(i_15_ ^ ~0x14);
						final int i_28_ = aClass27_Sub1_Sub1_2.method403(false);
						final boolean bool = (0x1 & i_28_) != 0;
						final boolean bool_29_ = (0x4 & i_28_) != 0;
						String string_30_ = null;
						if (bool_29_)
						{
							string_30_ = aClass27_Sub1_Sub1_2.method398(-1);
						}
						for (int i_31_ = 0; i_31_ < Class16.anInt185; i_31_++)
						{
							if (!bool)
							{
								if (Class28.aStringArray24[i_31_].equals(string))
								{
									if ((Class10.aStringArray8[i_31_] == null) && bool_29_)
									{
										method513(0,
										        new StringBuilder().append(string).append(" has logged in").toString(),
										        5, null, -97, null, null, false);
									}
									if ((Class10.aStringArray8[i_31_] != null) && !bool_29_)
									{
										method513(0,
										        new StringBuilder().append(string).append(" has logged out").toString(),
										        5, null, -98, null, null, false);
									}
									RuntimeException_Sub1.aStringArray41[i_31_] = string_27_;
									Class10.aStringArray8[i_31_] = string_30_;
									Class7.anIntArray18[i_31_] = i_28_;
									method561((byte) -99);
									return;
								}
							}
							else if (Class28.aStringArray24[i_31_].equals(string_27_))
							{
								if ((Class10.aStringArray8[i_31_] == null) && bool_29_)
								{
									method513(0, new StringBuilder().append(string).append(" has logged in").toString(),
									        5, null, -34, null, null, false);
								}
								if ((Class10.aStringArray8[i_31_] != null) && !bool_29_)
								{
									method513(0,
									        new StringBuilder().append(string).append(" has logged out").toString(), 5,
									        null, -63, null, null, false);
								}
								Class28.aStringArray24[i_31_] = string;
								RuntimeException_Sub1.aStringArray41[i_31_] = string_27_;
								Class10.aStringArray8[i_31_] = string_30_;
								Class7.anIntArray18[i_31_] = i_28_;
								method561((byte) -84);
								return;
							}
						}
						if (bool)
						{
							System.out.println(new StringBuilder()
							        .append("Error: friend display name change packet received, but old name '")
							        .append(string_27_).append("' is not on friend list").toString());
							return;
						}
						Class28.aStringArray24[Class16.anInt185] = string;
						RuntimeException_Sub1.aStringArray41[Class16.anInt185] = string_27_;
						Class10.aStringArray8[Class16.anInt185] = string_30_;
						Class7.anIntArray18[Class16.anInt185] = i_28_;
						Class16.anInt185++;
						method561((byte) -123);
					}
				}
				else
				{
					method544(false, (byte) 72);
				}
			}
			else
			{
				method540((byte) 46);
			}
		}
		else
		{
			final int i_34_ = aClass27_Sub1_Sub1_2.method403(false);
			final int i_35_ = aClass27_Sub1_Sub1_2.method403(false);
			final String string = aClass27_Sub1_Sub1_2.method398(-1);
			String string_36_ = null;
			String string_37_ = null;
			if ((0x1 & i_35_) != 0)
			{
				string_36_ = aClass27_Sub1_Sub1_2.method398(i_15_ ^ ~0x14);
			}
			String string_38_ = null;
			if ((0x1 & i_35_) != 0)
			{
				string_37_ = aClass27_Sub1_Sub1_2.method398(-1);
			}
			if ((0x2 & i_35_) != 0)
			{
				string_38_ = aClass27_Sub1_Sub1_2.method398(-1);
			}
			method513(0, string, i_34_, string_36_, -72, string_38_, string_37_, false);
		}
		if (i_15_ != 20)
		{
			aBool58 = false;
		}
	}

	private void method498(final int i, final byte i_39_)
	{
		anInt830++;
		final Class15 class15 = aClass15Array3[i];
		final String string = class15.aString6;
		int i_40_ = (-anInt1001 - anInt852) + -anInt927 + 2203;
		if ((anInt867 + anInt1030 + anInt894) >= 2640)
		{
			i_40_ = -50;
		}
		String string_41_ = "";
		int i_42_ = 0;
		if ((aClass15_1.anInt151 > 0) && (0 < class15.anInt151))
		{
			i_42_ = (aClass15_1.anInt151 + -class15.anInt151);
		}
		if (0 > i_42_)
		{
			string_41_ = "@or1@";
		}
		if (i_42_ < -3)
		{
			string_41_ = "@or2@";
		}
		if (i_42_ < -6)
		{
			string_41_ = "@or3@";
		}
		if (-9 > i_42_)
		{
			string_41_ = "@red@";
		}
		if (0 < i_42_)
		{
			string_41_ = "@gr1@";
		}
		if (3 < i_42_)
		{
			string_41_ = "@gr2@";
		}
		if (i_42_ > 6)
		{
			string_41_ = "@gr3@";
		}
		if (9 < i_42_)
		{
			string_41_ = "@gre@";
		}
		string_41_ = new StringBuilder().append(" ").append(string_41_).append("(level-").append(class15.anInt151)
		        .append(")").toString();
		if (0 > anInt940)
		{
			if (anInt989 >= 0)
			{
				aClass29_1.method195(new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
				        class15.anInt150,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), 0, anInt989,
				        810);
			}
			else
			{
				if ((0 >= i_40_) || (2203 <= ((((class15.anInt159 + -64) / anInt856) - -anInt852) + anInt927)))
				{
					if (aBool55)
					{
						aClass29_1.method196("Duel with", 2806,
						        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
						        (byte) 91, class15.anInt150);
					}
				}
				else
				{
					aClass29_1.method196("Attack", (i_42_ >= 0) && (5 > i_42_) ? 805 : 2805,
					        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
					        (byte) -65, class15.anInt150);
				}
				aClass29_1.method196("Trade with", 2810,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), (byte) -56,
				        class15.anInt150);
				aClass29_1.method196("Follow", 2820,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), (byte) -122,
				        class15.anInt150);
				aClass29_1.method208(2833, class15.aString7, class15.aString6, (byte) -31, "Report abuse",
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString());
			}
		}
		else if ((Frame_Sub1.anIntArray153[anInt940] == 1) || (Frame_Sub1.anIntArray153[anInt940] == 2))
		{
			aClass29_1.method195(
			        new StringBuilder().append("Cast ").append(Class46_Sub1.aStringArray36[anInt940]).append(" on")
			                .toString(),
			        class15.anInt150, new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
			        0, anInt940, 800);
		}
	}

	@Override
	void method466(final int i, final int i_43_)
	{
		anInt891++;
		if (anInt899 == 0)
		{
			if ((anInt1035 == 0) && (aClass10_7 != null))
			{
				aClass10_7.method86(i, (byte) -45);
			}
			if ((anInt1035 == 2) && (aClass10_5 != null))
			{
				aClass10_5.method86(i, (byte) -4);
			}
		}
		if (anInt899 == 1)
		{
			if (aBool64)
			{
				aClass10_1.method86(i, (byte) -4);
			}
			else if ((anInt1059 == 0) && (anInt994 == 0) && !aBool69 && (anInt971 == 0))
			{
				aClass10_2.method86(i, (byte) -10);
			}
		}
	}

	@Override
	void method478(final int i, final int i_44_, final byte i_45_, final int i_46_)
	{
		anIntArray156[anInt896] = i_44_;
		anInt783++;
		anIntArray154[anInt896] = i;
		anInt896 = (anInt896 + 1) & 0x1fff;
		for (int i_47_ = 10; i_47_ < 4000; i_47_++)
		{
			final int i_48_ = 0x1fff & (-i_47_ + anInt896);
			if ((i_44_ == anIntArray156[i_48_]) && (anIntArray154[i_48_] == i))
			{
				boolean bool = false;
				for (int i_49_ = 1; i_47_ > i_49_; i_49_++)
				{
					final int i_50_ = (-i_49_ + anInt896) & 0x1fff;
					final int i_51_ = (-i_49_ + i_48_) & 0x1fff;
					if ((i_44_ != anIntArray156[i_51_]) || (anIntArray154[i_51_] != i))
					{
						bool = true;
					}
					if ((anIntArray156[i_50_] != anIntArray156[i_51_])
					        || (anIntArray154[i_50_] != anIntArray154[i_51_]))
					{
						break;
					}
					if ((i_49_ == (i_47_ + -1)) && bool && (anInt1051 == 0) && (anInt970 == 0))
					{
						method491((byte) -66);
						return;
					}
				}
			}
		}
	}

	private void method499(final int i)
	{
		anInt913++;
		if (0 < this.aString26.length())
		{
			aString33 = this.aString26.trim();
			anInt1048 = 0;
			anInt994 = 2;
		}
		else
		{
			int i_52_ = 0;
			if ((anInt858 < 2) && (7 > anInt905))
			{
				if (anInt905 >= 5)
				{
					i_52_ = 1;
				}
			}
			else
			{
				i_52_ = 2;
			}
			final int i_53_ = aClass46_Sub1_2.method315((byte) 127, 1);
			final int i_54_ = aClass46_Sub1_2.method315((byte) 109, 4);
			final int i_55_ = 400;
			final int i_56_ = 70 - -(i_52_ > 0 ? i_53_ - -5 : 0);
			final int i_57_ = -(i_55_ / 2) + 256;
			final int i_58_ = -(i_56_ / 2) + 180;
			aClass46_Sub1_2.method321(i_58_, 0, i_56_, i_55_, i_57_, 1);
			aClass46_Sub1_2.method362(i_56_, i_57_, (byte) -108, i_55_, 16777215, i_58_);
			aClass46_Sub1_2.method335(16776960, i + 3900, 1, "Enter the name of the player you wish to report:",
			        i_53_ + i_58_ + 5, 256);
			final int i_59_ = i_53_ + 2;
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i_54_ + (i_58_ - -i_59_) + 5 + 3,
			        256);
			int i_60_ = ((i_59_ + i_58_ + 5 + 3) - -i_54_) + i_53_ + 2;
			int i_61_ = 16777215;
			if (0 < i_52_)
			{
				String string = aBool76 ? "[X]" : "[ ]";
				if (1 < i_52_)
				{
					string = new StringBuilder().append(string).append(" Mute player").toString();
				}
				else
				{
					string = new StringBuilder().append(string).append(" Suggest mute").toString();
				}
				final int i_62_ = aClass46_Sub1_2.method328(string, i ^ 0xe46, 1);
				if ((this.anInt739 > (-(i_62_ / 2) + 256)) && (this.anInt739 < ((i_62_ / 2) + 256))
				        && (this.anInt736 > (-i_53_ + i_60_)) && (this.anInt736 < i_60_))
				{
					i_61_ = 16776960;
					if (anInt887 != 0)
					{
						aBool76 = !aBool76;
						anInt887 = 0;
					}
				}
				aClass46_Sub1_2.method335(i_61_, 255, 1, string, i_60_, 256);
				i_60_ = i_60_ + i_53_ + 10;
			}
			i_61_ = 16777215;
			if ((this.anInt739 > 210) && (228 > this.anInt739) && (this.anInt736 > (-i_53_ + i_60_))
			        && (this.anInt736 < i_60_))
			{
				if (anInt887 != 0)
				{
					this.aString26 = this.aString27;
					anInt887 = 0;
				}
				i_61_ = 16776960;
			}
			aClass46_Sub1_2.method324("OK", i ^ i, 1, i_61_, 210, i_60_);
			i_61_ = 16777215;
			if ((this.anInt739 > 264) && (304 > this.anInt739) && ((-i_53_ + i_60_) < this.anInt736)
			        && (this.anInt736 < i_60_))
			{
				i_61_ = 16776960;
				if (anInt887 != 0)
				{
					anInt994 = 0;
					anInt887 = 0;
				}
			}
			aClass46_Sub1_2.method324("Cancel", 0, 1, i_61_, 264, i_60_);
			if ((anInt887 == 1) && ((i_57_ > this.anInt739) || ((i_55_ + i_57_) < this.anInt739)
			        || (i_58_ > this.anInt736) || (this.anInt736 > (i_58_ - -i_56_))))
			{
				anInt887 = 0;
				anInt994 = 0;
			}
		}
	}

	private void method500(final boolean bool)
	{
		anInt793++;
		if (((0x1 & anInt933) != 1) || !method541(anInt933, -112))
		{
			if (((0x1 & anInt933) == 0) && method541(anInt933, -116))
			{
				if (method541((anInt933 - -1) & 0x7, -103))
				{
					anInt933 = (anInt933 + 1) & 0x7;
				}
				else if (method541(0x7 & (anInt933 + 7), -109))
				{
					anInt933 = 0x7 & (anInt933 + 7);
				}
			}
			else
			{
				final int[] is = { 1, -1, 2, -2, 3, -3, 4 };
				for (int i = 0; i < 7; i++)
				{
					if (method541((anInt933 - (-is[i] - 8)) & 0x7, 104))
					{
						anInt933 = ((anInt933 - -is[i]) + 8) & 0x7;
						break;
					}
				}
				if (((anInt933 & 0x1) == 0) && method541(anInt933, 110))
				{
					if (method541(0x7 & (anInt933 + 1), 29))
					{
						anInt933 = 0x7 & (anInt933 + 1);
					}
					else if (method541(0x7 & (anInt933 + 7), -104))
					{
						anInt933 = (anInt933 + 7) & 0x7;
					}
				}
			}
		}
	}

	private void method501(final String string, final int i)
	{
		anInt869++;
		final String string_63_ = Class43.method298((byte) 92, string);
		if (string_63_ != null)
		{
			for (int i_64_ = 0; Class16.anInt185 > i_64_; i_64_++)
			{
				if (string_63_.equals(Class43.method298((byte) -103, (Class28.aStringArray24[i_64_]))))
				{
					Class16.anInt185--;
					for (int i_65_ = i_64_; Class16.anInt185 > i_65_; i_65_++)
					{
						Class28.aStringArray24[i_65_] = Class28.aStringArray24[i_65_ + 1];
						RuntimeException_Sub1.aStringArray41[i_65_] = RuntimeException_Sub1.aStringArray41[i_65_ + 1];
						Class10.aStringArray8[i_65_] = Class10.aStringArray8[i_65_ - -1];
						Class7.anIntArray18[i_65_] = Class7.anIntArray18[i_65_ + 1];
					}
					aClass16_Sub1_1.method118(167, 94);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, string);
					aClass16_Sub1_1.method126(2);
					break;
				}
			}
			if (i < 103)
			{
				anInt1016 = -23;
			}
		}
	}

	private void method502(final String string, final int i)
	{
		anInt776++;
		if (i >= (Class10.anInt129 ^ 0xffffffff))
		{
			method513(0, "Ignore list full", 0, null, i + 80, null, null, false);
		}
		else
		{
			final String string_66_ = Class43.method298((byte) -41, string);
			if (string_66_ != null)
			{
				for (int i_67_ = 0; Class10.anInt129 > i_67_; i_67_++)
				{
					if (string_66_.equals(Class43.method298((byte) -47, (Class46.aStringArray33[i_67_]))))
					{
						method513(0,
						        new StringBuilder().append(string).append(" is already on your ignore list").toString(),
						        0, null, -22, null, null, false);
						return;
					}
					if ((Class6.aStringArray7[i_67_] != null)
					        && string_66_.equals(Class43.method298((byte) 106, (Class6.aStringArray7[i_67_]))))
					{
						method513(0,
						        new StringBuilder().append(string).append(" is already on your ignore list").toString(),
						        0, null, -93, null, null, false);
						return;
					}
				}
				for (int i_68_ = 0; i_68_ < Class16.anInt185; i_68_++)
				{
					if (string_66_.equals(Class43.method298((byte) 99, (Class28.aStringArray24[i_68_]))))
					{
						method513(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your friends list first").toString(),
						        0, null, -18, null, null, false);
						return;
					}
					if ((RuntimeException_Sub1.aStringArray41[i_68_] != null) && (string_66_
					        .equals(Class43.method298((byte) 75, (RuntimeException_Sub1.aStringArray41[i_68_])))))
					{
						method513(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your friends list first").toString(),
						        0, null, -8, null, null, false);
						return;
					}
				}
				if (string_66_.equals(Class43.method298((byte) 113, (aClass15_1.aString7))))
				{
					method513(0, "You can't add yourself to your ignore list", 0, null, -38, null, null, false);
				}
				else
				{
					aClass16_Sub1_1.method118(132, 98);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(i ^ ~0x64, string);
					aClass16_Sub1_1.method126(2);
				}
			}
		}
	}

	private void method503(final int i, final int i_69_, final int i_70_)
	{
		anInt857++;
		boolean bool = false;
		int i_71_ = 0;
		final int i_72_ = anIntArray194[i_69_];
		for (int i_73_ = 0; i_73_ < anInt1049; i_73_++)
		{
			if (i_72_ == anIntArray180[i_73_])
			{
				if (Class1.anIntArray1[i_72_] == 0)
				{
					if (0 > i)
					{
						for (int i_74_ = 0; anInt1036 > i_74_; i_74_++)
						{
							if (anIntArray164[i_73_] < anIntArray166[i_69_])
							{
								anIntArray164[i_73_]++;
							}
							bool = true;
						}
					}
					else
					{
						anIntArray164[i_73_] += i;
						bool = true;
						if (anIntArray164[i_73_] > anIntArray166[i_69_])
						{
							anIntArray164[i_73_] = anIntArray166[i_69_];
						}
					}
				}
				else
				{
					i_71_++;
				}
			}
		}
		final int i_75_ = method584(i_72_, false);
		if (i_70_ == 2)
		{
			if (i_71_ >= i_75_)
			{
				bool = true;
			}
			if (Class6.anIntArray10[i_72_] == 1)
			{
				method513(0, "This object cannot be traded with other players", 0, null, -17, null, null, false);
				bool = true;
			}
			if (!bool)
			{
				if (0 <= i)
				{
					for (int i_76_ = 0; (i > i_76_) && (12 > anInt1049) && (i_71_ < i_75_); i_76_++)
					{
						anIntArray180[anInt1049] = i_72_;
						anIntArray164[anInt1049] = 1;
						anInt1049++;
						bool = true;
						i_71_++;
						if ((i_76_ == 0) && (Class1.anIntArray1[i_72_] == 0))
						{
							anIntArray164[anInt1049 + -1] = (i <= anIntArray166[i_69_] ? i : anIntArray166[i_69_]);
							break;
						}
					}
				}
				else if (12 > anInt1049)
				{
					anIntArray180[anInt1049] = i_72_;
					anIntArray164[anInt1049] = 1;
					anInt1049++;
					bool = true;
				}
			}
			if (bool)
			{
				aClass16_Sub1_1.method118(46, i_70_ + 77);
				aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i_70_ ^ ~0x7b4f, anInt1049);
				for (int i_77_ = 0; i_77_ < anInt1049; i_77_++)
				{
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray180[i_77_], (byte) 71);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(anIntArray164[i_77_], true);
				}
				aClass16_Sub1_1.method126(i_70_ + 0);
				aBool68 = false;
				aBool67 = false;
			}
		}
	}

	private void method504(final byte i, final String string)
	{
		aClass16_Sub1_1.method118(216, 55);
		anInt929++;
		Class39.method255((aClass16_Sub1_1.aClass27_Sub1_Sub1_1), false, string);
		aClass16_Sub1_1.method126(2);
	}

	void method505(final int i, final int i_78_, final int i_79_, final int i_80_, final int i_81_, int i_82_,
	        final byte i_83_, final int i_84_)
	{
		anInt801++;
		final Class15 class15 = aClass15Array5[i_78_];
		int i_85_ = (class15.anInt160 - -((anInt843 - -16) / 32)) & 0x7;
		boolean bool = false;
		int i_86_ = i_85_;
		if (i_86_ != 5)
		{
			if (i_86_ == 6)
			{
				bool = true;
				i_86_ = 2;
			}
			else if (i_86_ == 7)
			{
				i_86_ = 1;
				bool = true;
			}
		}
		else
		{
			i_86_ = 3;
			bool = true;
		}
		int i_87_ = (i_86_ * 3) + anIntArray196[((class15.anInt146 / (Class10.anIntArray32[class15.anInt161])) % 4)];
		if (class15.anInt160 == 8)
		{
			i_82_ -= ((i_79_ * Class26.anIntArray80[class15.anInt161]) / 100);
			i_86_ = 5;
			i_85_ = 2;
			bool = false;
			i_87_ = anIntArray162[(anInt930 / ((Class36.anIntArray86[class15.anInt161]) - 1)) % 8] + (i_86_ * 3);
		}
		else if (class15.anInt160 == 9)
		{
			i_82_ += ((i_79_ * Class26.anIntArray80[class15.anInt161]) / 100);
			i_86_ = 5;
			bool = true;
			i_85_ = 2;
			i_87_ = (i_86_ * 3) + anIntArray168[(anInt930 / (Class36.anIntArray86[(class15.anInt161)])) % 8];
		}
		for (int i_88_ = 0; i_88_ < 12; i_88_++)
		{
			final int i_89_ = anIntArrayArray21[i_85_][i_88_];
			final int i_90_ = (Class38.anIntArrayArray12[class15.anInt161][i_89_]);
			if (0 <= i_90_)
			{
				int i_91_ = 0;
				int i_92_ = 0;
				int i_93_ = i_87_;
				if (bool && (1 <= i_86_) && (i_86_ <= 3) && (Class9.anIntArray20[i_90_] == 1))
				{
					i_93_ += 15;
				}
				if ((i_86_ != 5) || (Class5.anIntArray7[i_90_] == 1))
				{
					final int i_94_ = i_93_ - -Class24.anIntArray78[i_90_];
					final int i_95_ = (aClass46_Sub1_2.anIntArray125[i_94_]);
					final int i_96_ = (aClass46_Sub1_2.anIntArray122[i_94_]);
					final int i_97_ = (aClass46_Sub1_2.anIntArray125[Class24.anIntArray78[i_90_]]);
					if ((i_95_ != 0) && (i_96_ != 0) && (i_97_ != 0))
					{
						i_92_ = (i_81_ * i_92_) / i_96_;
						i_91_ = (i_91_ * i_84_) / i_95_;
						final int i_98_ = (i_84_ * (aClass46_Sub1_2.anIntArray125[i_94_])) / i_97_;
						i_91_ -= (i_98_ + -i_84_) / 2;
						int i_99_ = Class48.anIntArray137[i_90_];
						int i_100_ = 0;
						if (i_99_ != 1)
						{
							if (i_99_ == 2)
							{
								i_99_ = (Class3.anIntArray3[class15.anInt161]);
								i_100_ = (Class35.anIntArray85[class15.anInt161]);
							}
							else if (i_99_ == 3)
							{
								i_100_ = (Class35.anIntArray85[class15.anInt161]);
								i_99_ = (RuntimeException_Sub1.anIntArray150[class15.anInt161]);
							}
						}
						else
						{
							i_99_ = (Class46.anIntArray132[class15.anInt161]);
							i_100_ = (Class35.anIntArray85[class15.anInt161]);
						}
						aClass46_Sub1_2.method348(bool, i_100_, -118, i_81_, i_92_ + i_80_, i_98_, i, i_94_, i_99_,
						        i_91_ + i_82_);
					}
				}
			}
		}
		if (class15.anInt165 > 0)
		{
			anIntArray158[anInt978] = aClass46_Sub1_2.method328(class15.aString8, -100, 1) / 2;
			if (anIntArray158[anInt978] > 150)
			{
				anIntArray158[anInt978] = 150;
			}
			anIntArray187[anInt978] = ((aClass46_Sub1_2.method328(class15.aString8, -126, 1) / 300)
			        * aClass46_Sub1_2.method315((byte) 123, 1));
			anIntArray195[anInt978] = i_82_ - -(i_84_ / 2);
			anIntArray203[anInt978] = i_80_;
			aStringArray47[anInt978++] = class15.aString8;
		}
		if ((class15.anInt160 == 8) || (class15.anInt160 == 9) || (class15.anInt145 != 0))
		{
			if (0 < class15.anInt145)
			{
				int i_101_ = i_82_;
				if (class15.anInt160 != 8)
				{
					if (class15.anInt160 == 9)
					{
						i_101_ += (i_79_ * 20) / 100;
					}
				}
				else
				{
					i_101_ -= (i_79_ * 20) / 100;
				}
				final int i_102_ = ((class15.anInt143 * 30) / class15.anInt148);
				anIntArray216[anInt977] = i_101_ + (i_84_ / 2);
				anIntArray173[anInt977] = i_80_;
				anIntArray202[anInt977++] = i_102_;
			}
			if (150 < class15.anInt145)
			{
				int i_103_ = i_82_;
				if (class15.anInt160 != 8)
				{
					if (class15.anInt160 == 9)
					{
						i_103_ = ((i_79_ * 10) / 100) + i_103_;
					}
				}
				else
				{
					i_103_ -= (i_79_ * 10) / 100;
				}
				aClass46_Sub1_2.method338(anInt935 + 12, (i_80_ + -12) - -(i_81_ / 2), i_103_ - (-(i_84_ / 2) - -12),
				        (byte) -70);
				aClass46_Sub1_2.method335(16777215, 255, 3,
				        new StringBuilder().append("").append(class15.anInt157).toString(), ((i_81_ / 2) - -5) + i_80_,
				        ((i_84_ / 2) - 1) + i_103_);
			}
		}
		if (i_83_ != -117)
		{
			method492(25, (byte) -62);
		}
	}

	private Class23 method506(final boolean bool, final int i, final int i_104_, final int i_105_, final int i_106_,
	        final int i_107_)
	{
		anInt819++;
		int i_108_ = i_105_;
		int i_109_ = i_106_;
		int i_110_ = i_105_;
		int i_111_ = i_106_;
		final int i_112_ = Class25.anIntArray79[i_104_];
		final int i_113_ = Class3.anIntArray2[i_104_];
		final int i_114_ = Class16_Sub1.anIntArray140[i_104_];
		final Class23 class23 = new Class23(4, 1);
		if (i_107_ == 0)
		{
			i_110_ = i_105_ + 1;
		}
		if (i_107_ == 1)
		{
			i_111_ = i_106_ + 1;
		}
		if (i_107_ == 2)
		{
			i_108_ = i_105_ - -1;
			i_111_ = i_106_ + 1;
		}
		i_108_ *= anInt856;
		i_109_ *= anInt856;
		if (i_107_ == 3)
		{
			i_111_ = i_106_ + 1;
			i_110_ = i_105_ - -1;
		}
		i_111_ *= anInt856;
		i_110_ *= anInt856;
		final int i_115_ = class23.method161((byte) 125, -aClass6_1.method35(i_109_, true, i_108_), i_108_, i_109_);
		final int i_116_ = class23.method161((byte) 126, -aClass6_1.method35(i_109_, true, i_108_) + -i_114_, i_108_,
		        i_109_);
		final int i_117_ = class23.method161((byte) 118, -aClass6_1.method35(i_111_, !bool, i_110_) - i_114_, i_110_,
		        i_111_);
		final int i_118_ = class23.method161((byte) 117, -aClass6_1.method35(i_111_, true, i_110_), i_110_, i_111_);
		final int[] is = { i_115_, i_116_, i_117_, i_118_ };
		class23.method144(is, i_113_, i_112_, -1062, 4);
		class23.method151(-50, 60, 256, 24, bool, -10, -50);
		if ((i_105_ >= 0) && (i_106_ >= 0) && (96 > i_105_) && (96 > i_106_))
		{
			aClass41_2.method267(class23, (byte) 51);
		}
		class23.anInt288 = i + 10000;
		return class23;
	}

	private void method507(final int i)
	{
		aString39 = "";
		aString34 = "";
		anInt899 = 0;
		anInt1035 = 0;
		anInt932 = 0;
		anInt816++;
		anInt1039 = 0;
	}

	private void method508(final byte i)
	{
		aClass46_Sub1_2.method338(anInt935 + 23, anInt879 + -4, 0, (byte) -70);
		anInt794++;
		int i_119_ = Class34.method227(false, 200, 200, 255);
		if (anInt976 == 0)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt1056 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		aClass46_Sub1_2.method335(i_119_, 255, 0, "All messages", anInt879 + 6, 54);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (anInt976 == 1)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt986 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		aClass46_Sub1_2.method335(i_119_, 255, 0, "Chat history", anInt879 + 6, 155);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (anInt976 == 2)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt943 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		aClass46_Sub1_2.method335(i_119_, 255, 0, "Quest history", anInt879 + 6, 255);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (anInt976 == 3)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt981 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		aClass46_Sub1_2.method335(i_119_, 255, 0, "Private history", anInt879 + 6, 355);
		aClass46_Sub1_2.method335(16777215, 255, 0, "Report abuse", anInt879 - -6, 457);
	}

	@Override
	void method477(final byte i, final Runnable runnable)
	{
		Frame_Sub1.aClass32_4.method218(1, 0, runnable);
		anInt777++;
	}

	private void method509(final int i, final int i_120_, final int i_121_, final int i_122_)
	{
		anInt774++;
		aClass46_Sub1_2.method318(i_122_, -13292, i_121_, i_120_);
		aClass46_Sub1_2.method318(i_122_ + -1, -13292, i_121_, i_120_);
		aClass46_Sub1_2.method318(i_122_ + 1, -13292, i_121_, i_120_);
		aClass46_Sub1_2.method318(i_122_, i + -13290, i_121_ + -1, i_120_);
		if (i != -2)
		{
			method584(-25, false);
		}
		aClass46_Sub1_2.method318(i_122_, i ^ 0x33ea, i_121_ + 1, i_120_);
	}

	private boolean method510(final String string, final String string_123_, final int i)
	{
		anInt825++;
		final String string_124_ = Class43.method298((byte) 86, string_123_);
		if (string_124_ == null)
		{
			return false;
		}
		if (string_124_.equals(Class43.method298((byte) -116, (aClass15_1.aString7))))
		{
			return false;
		}
		if (i >= -90)
		{
			return true;
		}
		boolean bool = false;
		boolean bool_125_ = false;
		for (int i_126_ = 0; i_126_ < Class16.anInt185; i_126_++)
		{
			if (string_124_.equals(Class43.method298((byte) 76, (Class28.aStringArray24[i_126_]))))
			{
				if ((0x4 & Class7.anIntArray18[i_126_]) != 0)
				{
					bool_125_ = true;
				}
				bool = true;
				break;
			}
		}
		if (!bool)
		{
			boolean bool_127_ = false;
			for (int i_128_ = 0; Class10.anInt129 > i_128_; i_128_++)
			{
				if (string_124_.equals(Class43.method298((byte) -120, (Class41.aStringArray28[i_128_]))))
				{
					bool_127_ = true;
					break;
				}
			}
			if (!bool_127_)
			{
				aClass29_1.method208(2831, string_123_, string, (byte) -125, "Add friend",
				        new StringBuilder().append("@whi@").append(string).toString());
				aClass29_1.method208(2832, string_123_, string, (byte) -93, "Add ignore",
				        new StringBuilder().append("@whi@").append(string).toString());
			}
		}
		else if (bool_125_)
		{
			aClass29_1.method208(2830, string_123_, string, (byte) -59, "Message",
			        new StringBuilder().append("@whi@").append(string).toString());
		}
		aClass29_1.method208(2833, string_123_, string, (byte) -80, "Report abuse",
		        new StringBuilder().append("@whi@").append(string).toString());
		return true;
	}

	void method511(final int i, final int i_129_, int i_130_, final int i_131_, final int i_132_, final int i_133_,
	        final int i_134_, final int i_135_)
	{
		anInt900++;
		final Class15 class15 = aClass15Array3[i];
		if (class15.anInt155 != 255)
		{
			int i_136_ = 0x7 & (class15.anInt160 + ((anInt843 + 16) / 32));
			boolean bool = false;
			int i_137_ = i_136_;
			if (i_137_ != 5)
			{
				if (i_137_ != 6)
				{
					if (i_137_ == 7)
					{
						bool = true;
						i_137_ = 1;
					}
				}
				else
				{
					i_137_ = 2;
					bool = true;
				}
			}
			else
			{
				bool = true;
				i_137_ = 3;
			}
			int i_138_ = ((i_137_ * 3) + anIntArray196[(class15.anInt146 / 6) % 4]);
			if (class15.anInt160 != 8)
			{
				if (class15.anInt160 == 9)
				{
					bool = true;
					i_136_ = 2;
					i_130_ += (i_131_ * 5) / 100;
					i_137_ = 5;
					i_138_ = (i_137_ * 3) - -anIntArray168[(anInt930 / 6) % 8];
				}
			}
			else
			{
				i_130_ -= (i_131_ * 5) / 100;
				bool = false;
				i_137_ = 5;
				i_136_ = 2;
				i_138_ = anIntArray162[(anInt930 / 5) % 8] + (i_137_ * 3);
			}
			for (int i_139_ = 0; i_139_ < 12; i_139_++)
			{
				final int i_140_ = anIntArrayArray21[i_136_][i_139_];
				final int i_141_ = class15.anIntArray36[i_140_] - 1;
				if (i_141_ >= 0)
				{
					int i_142_ = 0;
					int i_143_ = 0;
					int i_144_ = i_138_;
					if (bool && (i_137_ >= 1) && (3 >= i_137_))
					{
						if (Class9.anIntArray20[i_141_] != 1)
						{
							if ((i_140_ == 4) && (i_137_ == 1))
							{
								i_143_ = -3;
								i_142_ = -22;
								i_144_ = (anIntArray196[((class15.anInt146 / 6) + 2) % 4]) + (i_137_ * 3);
							}
							else if ((i_140_ != 4) || (i_137_ != 2))
							{
								if ((i_140_ != 4) || (i_137_ != 3))
								{
									if ((i_140_ != 3) || (i_137_ != 1))
									{
										if ((i_140_ != 3) || (i_137_ != 2))
										{
											if ((i_140_ == 3) && (i_137_ == 3))
											{
												i_144_ = ((anIntArray196[(((class15.anInt146) / 6) + 2) % 4])
												        + (i_137_ * 3));
												i_143_ = 5;
												i_142_ = -26;
											}
										}
										else
										{
											i_142_ = 0;
											i_143_ = 8;
											i_144_ = ((i_137_ * 3)
											        - -(anIntArray196[(((class15.anInt146) / 6) + 2) % 4]));
										}
									}
									else
									{
										i_144_ = (anIntArray196[((class15.anInt146 / 6) + 2) % 4]) + (i_137_ * 3);
										i_142_ = 22;
										i_143_ = 3;
									}
								}
								else
								{
									i_142_ = 26;
									i_143_ = -5;
									i_144_ = (anIntArray196[((class15.anInt146 / 6) + 2) % 4]) + (i_137_ * 3);
								}
							}
							else
							{
								i_143_ = -8;
								i_142_ = 0;
								i_144_ = (anIntArray196[((class15.anInt146 / 6) + 2) % 4]) + (i_137_ * 3);
							}
						}
						else
						{
							i_144_ += 15;
						}
					}
					if ((i_137_ != 5) || (Class5.anIntArray7[i_141_] == 1))
					{
						final int i_145_ = i_144_ - -Class24.anIntArray78[i_141_];
						final int i_146_ = (aClass46_Sub1_2.anIntArray125[i_145_]);
						final int i_147_ = (aClass46_Sub1_2.anIntArray122[i_145_]);
						final int i_148_ = (aClass46_Sub1_2.anIntArray125[Class24.anIntArray78[i_141_]]);
						if ((i_146_ != 0) && (i_147_ != 0) && (i_148_ != 0))
						{
							i_142_ = (i_132_ * i_142_) / i_146_;
							i_143_ = (i_143_ * i_129_) / i_147_;
							final int i_149_ = (i_132_ * i_146_) / i_148_;
							i_142_ -= (i_149_ + -i_132_) / 2;
							int i_150_ = Class48.anIntArray137[i_141_];
							final int i_151_ = anIntArray197[class15.anInt152];
							if (i_150_ == 1)
							{
								i_150_ = (anIntArray211[class15.anInt153]);
							}
							else if (i_150_ == 2)
							{
								i_150_ = (anIntArray165[class15.anInt163]);
							}
							else if (i_150_ == 3)
							{
								i_150_ = (anIntArray165[class15.anInt155]);
							}
							aClass46_Sub1_2.method348(bool, i_151_, -107, i_129_, i_135_ - -i_143_, i_149_, i_134_,
							        i_145_, i_150_, i_130_ - -i_142_);
						}
					}
				}
			}
			if (0 < class15.anInt165)
			{
				anIntArray158[anInt978] = aClass46_Sub1_2.method328(class15.aString8, -100, 1) / 2;
				if (150 < anIntArray158[anInt978])
				{
					anIntArray158[anInt978] = 150;
				}
				anIntArray187[anInt978] = ((aClass46_Sub1_2.method328(class15.aString8, -106, 1) / 300)
				        * aClass46_Sub1_2.method315((byte) 126, 1));
				anIntArray195[anInt978] = i_130_ + (i_132_ / 2);
				anIntArray203[anInt978] = i_135_;
				aStringArray47[anInt978++] = class15.aString8;
			}
			if (0 < class15.anInt168)
			{
				anIntArray217[anInt960] = i_130_ - -(i_132_ / 2);
				anIntArray218[anInt960] = i_135_;
				anIntArray169[anInt960] = i_131_;
				anIntArray213[anInt960++] = class15.anInt162;
			}
			if ((class15.anInt160 == 8) || (class15.anInt160 == 9) || (class15.anInt145 != 0))
			{
				if (class15.anInt145 > 0)
				{
					int i_152_ = i_130_;
					if (class15.anInt160 != 8)
					{
						if (class15.anInt160 == 9)
						{
							i_152_ += (i_131_ * 20) / 100;
						}
					}
					else
					{
						i_152_ -= (i_131_ * 20) / 100;
					}
					final int i_153_ = ((class15.anInt143 * 30) / class15.anInt148);
					anIntArray216[anInt977] = (i_132_ / 2) + i_152_;
					anIntArray173[anInt977] = i_135_;
					anIntArray202[anInt977++] = i_153_;
				}
				if (150 < class15.anInt145)
				{
					int i_154_ = i_130_;
					if (class15.anInt160 == 8)
					{
						i_154_ -= (i_131_ * 10) / 100;
					}
					else if (class15.anInt160 == 9)
					{
						i_154_ = ((i_131_ * 10) / 100) + i_154_;
					}
					aClass46_Sub1_2.method338(anInt935 + 11, i_135_ + (i_129_ / 2) + -12, (i_132_ / 2) + i_154_ + -12,
					        (byte) -70);
					aClass46_Sub1_2.method335(16777215, 255, 3,
					        new StringBuilder().append("").append(class15.anInt157).toString(),
					        i_135_ + (i_129_ / 2) + 5, (i_154_ - -(i_132_ / 2)) + -1);
				}
			}
			if ((class15.anInt144 == 1) && (class15.anInt168 == 0))
			{
				int i_155_ = i_130_ + (i_132_ / 2) + i_134_;
				if (class15.anInt160 == 8)
				{
					i_155_ -= (i_131_ * 20) / 100;
				}
				else if (class15.anInt160 == 9)
				{
					i_155_ += (i_131_ * 20) / 100;
				}
				final int i_156_ = (i_131_ * 16) / 100;
				final int i_157_ = (i_131_ * 16) / 100;
				aClass46_Sub1_2.method316(i_156_, (i_135_ + -((i_131_ * 10) / 100) + -(i_157_ / 2)), anInt935 + 13,
				        i_155_ - (i_156_ / 2), 64, i_157_);
			}
		}
	}

	private Class15 method512(final int i, final int i_158_, final int i_159_, final int i_160_, final int i_161_,
	        final int i_162_)
	{
		anInt838++;
		if (aClass15Array6[i_159_] == null)
		{
			aClass15Array6[i_159_] = new Class15();
			aClass15Array6[i_159_].anInt150 = i_159_;
		}
		final Class15 class15 = aClass15Array6[i_159_];
		boolean bool = false;
		for (int i_163_ = 0; i_163_ < anInt1007; i_163_++)
		{
			if (i_159_ == aClass15Array4[i_163_].anInt150)
			{
				bool = true;
				break;
			}
		}
		if (!bool)
		{
			class15.anInt150 = i_159_;
			class15.anIntArray38[0] = class15.anInt166 = i_162_;
			class15.anInt149 = 0;
			class15.anInt147 = 0;
			class15.anInt161 = i_160_;
			class15.anInt167 = class15.anInt160 = i_161_;
			class15.anIntArray39[0] = class15.anInt159 = i;
			class15.anInt146 = 0;
		}
		else
		{
			class15.anInt161 = i_160_;
			class15.anInt167 = i_161_;
			int i_164_ = class15.anInt149;
			if ((class15.anIntArray38[i_164_] != i_162_) || (class15.anIntArray39[i_164_] != i))
			{
				class15.anInt149 = i_164_ = (i_164_ - -1) % 10;
				class15.anIntArray38[i_164_] = i_162_;
				class15.anIntArray39[i_164_] = i;
			}
		}
		aClass15Array5[anInt1039++] = class15;
		return class15;
	}

	private void method513(final int i, final String string, final int i_165_, final String string_166_,
	        final int i_167_, final String string_168_, final String string_169_, final boolean bool)
	{
		anInt892++;
		if (((i_165_ == 1) || (i_165_ == 4) || (i_165_ == 6)) && (string_169_ != null) && !bool)
		{
			final String string_170_ = Class43.method298((byte) 125, string_169_);
			if (string_170_ == null)
			{
				return;
			}
			for (int i_171_ = 0; i_171_ < Class10.anInt129; i_171_++)
			{
				if (string_170_.equals(Class43.method298((byte) 50, (Class41.aStringArray28[i_171_]))))
				{
					return;
				}
			}
		}
		String string_172_ = Class26.aStringArray20[i_165_];
		if (string_168_ != null)
		{
			string_172_ = string_168_;
		}
		if (anInt976 != 0)
		{
			if ((i_165_ == 0) || (i_165_ == 7))
			{
				anInt1056 = 200;
			}
			if ((i_165_ == 4) && (anInt976 != 1))
			{
				anInt986 = 200;
			}
			if ((i_165_ == 3) && (anInt976 != 2))
			{
				anInt943 = 200;
			}
			if (((i_165_ == 5) || (i_165_ == 1) || (i_165_ == 2)) && (anInt976 != 3))
			{
				anInt981 = 200;
			}
			if ((i_165_ == 0) && (anInt976 != 0))
			{
				anInt976 = 0;
			}
			if (((i_165_ == 5) || (i_165_ == 1) || (i_165_ == 2)) && (anInt976 != 3) && (anInt976 != 0))
			{
				anInt976 = 0;
			}
		}
		if (i_167_ >= -6)
		{
			method501(null, 51);
		}
		for (int i_173_ = 99; i_173_ > 0; i_173_--)
		{
			Class27_Sub1.anIntArray142[i_173_] = Class27_Sub1.anIntArray142[i_173_ + -1];
			Class29.anIntArray83[i_173_] = Class29.anIntArray83[i_173_ + -1];
			Class46.anIntArray126[i_173_] = Class46.anIntArray126[i_173_ + -1];
			Class13.aStringArray13[i_173_] = Class13.aStringArray13[i_173_ + -1];
			Class27.aStringArray23[i_173_] = Class27.aStringArray23[i_173_ + -1];
			Class2.aStringArray3[i_173_] = Class2.aStringArray3[i_173_ + -1];
			Class26.aStringArray21[i_173_] = Class26.aStringArray21[i_173_ + -1];
		}
		Class27_Sub1.anIntArray142[0] = i_165_;
		Class29.anIntArray83[0] = 300;
		Class46.anIntArray126[0] = i;
		Class13.aStringArray13[0] = string_166_;
		Class27.aStringArray23[0] = string_169_;
		Class2.aStringArray3[0] = string;
		Class26.aStringArray21[0] = string_172_;
		final String string_174_ = new StringBuilder().append(string_172_)
		        .append(Class13.method110(string, string_166_, i_165_, -6187)).toString();
		if (i_165_ == 4)
		{
			if ((aClass10_2.anIntArray24[anInt1052] + -4) != aClass10_2.anIntArray23[anInt1052])
			{
				aClass10_2.method88(anInt1052, string_174_, i, false, string_169_, (byte) -21, string_166_);
			}
			else
			{
				aClass10_2.method88(anInt1052, string_174_, i, true, string_169_, (byte) -21, string_166_);
			}
		}
		if (i_165_ == 3)
		{
			if ((aClass10_2.anIntArray24[anInt987] + -4) != aClass10_2.anIntArray23[anInt987])
			{
				aClass10_2.method88(anInt987, string_174_, 0, false, null, (byte) -21, null);
			}
			else
			{
				aClass10_2.method88(anInt987, string_174_, 0, true, null, (byte) -21, null);
			}
		}
		if ((i_165_ == 1) || (i_165_ == 2))
		{
			int i_175_ = i;
			if (i_165_ != 1)
			{
				i_175_ = 0;
			}
			if ((aClass10_2.anIntArray24[anInt990] + -4) != aClass10_2.anIntArray23[anInt990])
			{
				aClass10_2.method88(anInt990, string_174_, i_175_, false, string_169_, (byte) -21, string_166_);
			}
			else
			{
				aClass10_2.method88(anInt990, string_174_, i_175_, true, string_169_, (byte) -21, string_166_);
			}
		}
	}

	private void method514(final int i)
	{
		anInt828++;
		if (((anInt976 == 1) && aClass10_2.method81(true, anInt1052))
		        || ((anInt976 == 3) && aClass10_2.method81(true, anInt990)))
		{
			final int i_176_ = anInt976 == 1 ? anInt1052 : anInt990;
			final int i_177_ = aClass10_2.method90(i_176_, (byte) 52);
			if (((i_177_ >> 16) == 2) || (aBool83 && ((i_177_ >> 16) == 1)))
			{
				final int i_178_ = i_177_ & 0xffff;
				final String string = aClass10_2.method89(13789, i_176_, i_178_);
				final String string_179_ = aClass10_2.method99(i_178_, i_176_, i + -9918);
				if (method510(string_179_, string, -99))
				{
					return;
				}
			}
		}
		if (anInt976 == 0)
		{
			for (int i_180_ = 0; 100 > i_180_; i_180_++)
			{
				if ((Class29.anIntArray83[i_180_] > 0) && ((Class27_Sub1.anIntArray142[i_180_] == 4)
				        || (Class27_Sub1.anIntArray142[i_180_] == 1) || (Class27_Sub1.anIntArray142[i_180_] == 5)
				        || (Class27_Sub1.anIntArray142[i_180_] == 6)))
				{
					final String string = new StringBuilder().append(Class26.aStringArray21[i_180_])
					        .append(Class13.method110(Class2.aStringArray3[i_180_], (Class13.aStringArray13[i_180_]),
					                (Class27_Sub1.anIntArray142[i_180_]), i ^ ~0x3f3a))
					        .toString();
					if ((this.anInt739 > 7) && (this.anInt739 < (aClass46_Sub1_2.method328(string, -126, 1) + 7))
					        && (this.anInt736 > (-(i_180_ * 12) + anInt879 + -30))
					        && (this.anInt736 < (-(i_180_ * 12) + anInt879 + -18))
					        && ((anInt887 == 2) || (aBool83 && (anInt887 == 1)))
					        && method510(Class13.aStringArray13[i_180_], Class27.aStringArray23[i_180_], -126))
					{
						return;
					}
				}
			}
		}
		aBool82 = false;
		int i_181_ = -1;
		for (int i_182_ = 0; anInt1022 > i_182_; i_182_++)
		{
			aBoolArray13[i_182_] = false;
		}
		for (int i_183_ = 0; i_183_ < anInt957; i_183_++)
		{
			aBoolArray14[i_183_] = false;
		}
		final int i_184_ = aClass41_2.method282(-1);
		final Class23[] class23s = aClass41_2.method295(i + -28238);
		if (i == 10000)
		{
			final int[] is = aClass41_2.method266((byte) -68);
			for (int i_185_ = 0; (i_184_ > i_185_) && (aClass29_1.method198(-116) <= 200); i_185_++)
			{
				int i_186_ = is[i_185_];
				final Class23 class23 = class23s[i_185_];
				if ((65535 >= class23.anIntArray60[i_186_])
				        || ((200000 <= class23.anIntArray60[i_186_]) && (300000 >= class23.anIntArray60[i_186_])))
				{
					if (class23 == aClass41_2.aClass23_3)
					{
						final int i_187_ = class23.anIntArray60[i_186_] % 10000;
						final int i_188_ = class23.anIntArray60[i_186_] / 10000;
						if (i_188_ == 1)
						{
							method498(i_187_, (byte) 127);
						}
						else if (i_188_ != 2)
						{
							if (i_188_ == 3)
							{
								String string = "";
								int i_189_ = -1;
								final int i_190_ = (aClass15Array5[i_187_].anInt161);
								if (Class16_Sub1.anIntArray141[i_190_] > 0)
								{
									final int i_191_ = ((Class47.anIntArray136[i_190_] + Class7.anIntArray19[i_190_]
									        + Class47.anIntArray135[i_190_] + (Class46_Sub1.anIntArray143[i_190_]))
									        / 4);
									final int i_192_ = ((anIntArray200[1] + anIntArray200[2]
									        + ((anIntArray200[3] + anIntArray200[0]) - -27)) / 4);
									i_189_ = -i_191_ + i_192_;
									string = "@yel@";
									if (i_189_ < 0)
									{
										string = "@or1@";
									}
									if (i_189_ < -3)
									{
										string = "@or2@";
									}
									if (-6 > i_189_)
									{
										string = "@or3@";
									}
									if (-9 > i_189_)
									{
										string = "@red@";
									}
									if (0 < i_189_)
									{
										string = "@gr1@";
									}
									if (i_189_ > 3)
									{
										string = "@gr2@";
									}
									if (i_189_ > 6)
									{
										string = "@gr3@";
									}
									if (9 < i_189_)
									{
										string = "@gre@";
									}
									string = new StringBuilder().append(" ").append(string).append("(level-")
									        .append(i_191_).append(")").toString();
								}
								if (anInt940 >= 0)
								{
									if (Frame_Sub1.anIntArray153[anInt940] == 2)
									{
										aClass29_1.method195(new StringBuilder().append("Cast ")
										        .append(Class46_Sub1.aStringArray36[anInt940]).append(" on").toString(),
										        aClass15Array5[i_187_].anInt150,
										        new StringBuilder().append("@yel@").append(
										                Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
										                .toString(),
										        0, anInt940, 700);
									}
								}
								else if (0 > anInt989)
								{
									if (0 < Class16_Sub1.anIntArray141[i_190_])
									{
										aClass29_1.method196("Attack", 0 > i_189_ ? 2715 : 715,
										        new StringBuilder().append("@yel@").append(
										                Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
										                .append(string).toString(),
										        (byte) -57, (aClass15Array5[i_187_]).anInt150);
									}
									aClass29_1.method196("Talk-to", 720,
									        new StringBuilder().append("@yel@")
									                .append(Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
									                .toString(),
									        (byte) -53, (aClass15Array5[i_187_].anInt150));
									if (!Class47.aStringArray34[i_190_].equals(""))
									{
										aClass29_1.method196(Class47.aStringArray34[i_190_], 725,
										        new StringBuilder().append("@yel@").append(
										                Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
										                .toString(),
										        (byte) -48, (aClass15Array5[i_187_]).anInt150);
									}
									aClass29_1.method196("Examine", 3700,
									        new StringBuilder().append("@yel@")
									                .append(Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
									                .toString(),
									        (byte) 96, (aClass15Array5[i_187_].anInt161));
								}
								else
								{
									aClass29_1.method195(
									        new StringBuilder()
									                .append("Use ").append(aString30).append(" with").toString(),
									        (aClass15Array5[i_187_].anInt150),
									        new StringBuilder().append("@yel@")
									                .append(Class22.aStringArray16[(aClass15Array5[i_187_].anInt161)])
									                .toString(),
									        0, anInt989, 710);
								}
							}
						}
						else if (0 > anInt940)
						{
							if (0 > anInt989)
							{
								aClass29_1.method193(anIntArray201[i_187_],
								        new StringBuilder().append("@lre@")
								                .append(Class26.aStringArray19[anIntArray201[i_187_]]).toString(),
								        "Take", 220, anIntArray199[i_187_], 2743, anIntArray192[i_187_]);
								aClass29_1.method196("Examine", 3200,
								        new StringBuilder().append("@lre@")
								                .append(Class26.aStringArray19[(anIntArray201[i_187_])]).toString(),
								        (byte) 91, anIntArray201[i_187_]);
							}
							else
							{
								aClass29_1.method185(
								        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
								        new StringBuilder().append("@lre@")
								                .append(Class26.aStringArray19[anIntArray201[i_187_]]).toString(),
								        anIntArray201[i_187_], anIntArray199[i_187_], 210, anInt989,
								        anIntArray192[i_187_], (byte) -37);
							}
						}
						else if (Frame_Sub1.anIntArray153[anInt940] == 3)
						{
							aClass29_1.method185(
							        new StringBuilder().append("Cast ").append(Class46_Sub1.aStringArray36[anInt940])
							                .append(" on").toString(),
							        new StringBuilder().append("@lre@")
							                .append(Class26.aStringArray19[anIntArray201[i_187_]]).toString(),
							        anIntArray201[i_187_], anIntArray199[i_187_], 200, anInt940, anIntArray192[i_187_],
							        (byte) -37);
						}
					}
					else if ((class23 == null) || (10000 > class23.anInt288))
					{
						if ((class23 != null) && (class23.anInt288 >= 0))
						{
							final int i_193_ = class23.anInt288;
							final int i_194_ = anIntArray178[i_193_];
							if (!aBoolArray13[i_193_])
							{
								if (anInt940 >= 0)
								{
									if (Frame_Sub1.anIntArray153[anInt940] == 5)
									{
										aClass29_1.method213(true, 400, anIntArray171[i_193_],
										        new StringBuilder().append("@cya@")
										                .append(Class38.aStringArray26[i_194_]).toString(),
										        anIntArray170[i_193_], anIntArray178[i_193_], anIntArray191[i_193_],
										        anInt940,
										        new StringBuilder().append("Cast ")
										                .append(Class46_Sub1.aStringArray36[anInt940]).append(" on")
										                .toString());
									}
								}
								else if (anInt989 >= 0)
								{
									aClass29_1.method213(true, 410, anIntArray171[i_193_],
									        new StringBuilder().append("@cya@").append(Class38.aStringArray26[i_194_])
									                .toString(),
									        anIntArray170[i_193_], anIntArray178[i_193_], anIntArray191[i_193_],
									        anInt989, new StringBuilder().append("Use ").append(aString30)
									                .append(" with").toString());
								}
								else
								{
									if (!Class2.aStringArray2[i_194_].equalsIgnoreCase("WalkTo"))
									{
										aClass29_1.method185(Class2.aStringArray2[i_194_],
										        new StringBuilder().append("@cya@")
										                .append(Class38.aStringArray26[i_194_]).toString(),
										        anIntArray171[i_193_], anIntArray170[i_193_], 420,
										        anIntArray178[i_193_], anIntArray191[i_193_], (byte) -37);
									}
									if (!Class45.aStringArray32[i_194_].equalsIgnoreCase("Examine"))
									{
										aClass29_1.method185(Class45.aStringArray32[i_194_],
										        new StringBuilder().append("@cya@")
										                .append(Class38.aStringArray26[i_194_]).toString(),
										        anIntArray171[i_193_], anIntArray170[i_193_], 2400,
										        anIntArray178[i_193_], anIntArray191[i_193_], (byte) -37);
									}
									aClass29_1.method196(
									        "Examine", 3400, new StringBuilder().append("@cya@")
									                .append(Class38.aStringArray26[i_194_]).toString(),
									        (byte) -79, i_194_);
								}
								aBoolArray13[i_193_] = true;
							}
						}
						else
						{
							if (0 <= i_186_)
							{
								i_186_ = (class23.anIntArray60[i_186_] + -200000);
							}
							if (i_186_ >= 0)
							{
								i_181_ = i_186_;
							}
						}
					}
					else
					{
						final int i_195_ = class23.anInt288 + -10000;
						final int i_196_ = anIntArray190[i_195_];
						if (!aBoolArray14[i_195_])
						{
							if (anInt940 >= 0)
							{
								if (Frame_Sub1.anIntArray153[anInt940] == 4)
								{
									aClass29_1.method185(new StringBuilder().append("Cast ")
									        .append(Class46_Sub1.aStringArray36[anInt940]).append(" on").toString(),
									        new StringBuilder().append("@cya@").append(Class23.aStringArray17[i_196_])
									                .toString(),
									        anIntArray163[i_195_], anIntArray167[i_195_], 300, anInt940,
									        anIntArray176[i_195_], (byte) -37);
								}
							}
							else if (0 <= anInt989)
							{
								aClass29_1.method185(
								        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
								        new StringBuilder().append("@cya@").append(Class23.aStringArray17[i_196_])
								                .toString(),
								        anIntArray163[i_195_], anIntArray167[i_195_], 310, anInt989,
								        anIntArray176[i_195_], (byte) -37);
							}
							else
							{
								if (!IOException_Sub1.aStringArray40[i_196_].equalsIgnoreCase("WalkTo"))
								{
									aClass29_1.method193(anIntArray163[i_195_],
									        new StringBuilder().append("@cya@").append(Class23.aStringArray17[i_196_])
									                .toString(),
									        (IOException_Sub1.aStringArray40[i_196_]), 320, anIntArray167[i_195_], 2743,
									        anIntArray176[i_195_]);
								}
								if (!Class18.aStringArray15[i_196_].equalsIgnoreCase("Examine"))
								{
									aClass29_1.method193(anIntArray163[i_195_],
									        new StringBuilder().append("@cya@").append(Class23.aStringArray17[i_196_])
									                .toString(),
									        Class18.aStringArray15[i_196_], 2300, anIntArray167[i_195_], 2743,
									        anIntArray176[i_195_]);
								}
								aClass29_1.method196(
								        "Examine", 3300, new StringBuilder().append("@cya@")
								                .append(Class23.aStringArray17[i_196_]).toString(),
								        (byte) -112, i_196_);
							}
							aBoolArray14[i_195_] = true;
						}
					}
				}
			}
			if ((0 <= anInt940) && (Frame_Sub1.anIntArray153[anInt940] <= 1))
			{
				aClass29_1.method196(new StringBuilder().append("Cast ").append(Class46_Sub1.aStringArray36[anInt940])
				        .append(" on self").toString(), 1000, "", (byte) -41, anInt940);
			}
			if (i_181_ != -1)
			{
				final int i_197_ = i_181_;
				aBool82 = true;
				anInt1032 = aClass6_1.anIntArray14[i_197_] + anInt867;
				anInt958 = aClass6_1.anIntArray11[i_197_] + anInt927;
				if (0 > anInt940)
				{
					if (anInt989 < 0)
					{
						aClass29_1.method195("Walk here", aClass6_1.anIntArray14[i_197_], "", 0,
						        aClass6_1.anIntArray11[i_197_], 920);
					}
				}
				else if (Frame_Sub1.anIntArray153[anInt940] == 6)
				{
					aClass29_1.method193(anInt940, "",
					        new StringBuilder().append("Cast ").append(Class46_Sub1.aStringArray36[anInt940])
					                .append(" on ground").toString(),
					        900, aClass6_1.anIntArray11[i_197_], i ^ 0x2da7, aClass6_1.anIntArray14[i_197_]);
				}
			}
		}
	}

	void method515(final int i, final int i_198_, final int i_199_, final int i_200_, final int i_201_,
	        final int i_202_, final int i_203_)
	{
		anInt759++;
		final int i_205_ = anIntArray214[i_199_];
		final int i_206_ = anIntArray208[i_199_];
		if (i_205_ == 0)
		{
			final int i_207_ = (i_206_ * 1280) + 255;
			aClass46_Sub1_2.method329(i - -(i_202_ / 2), (i_206_ * 2) + 20, i_207_, (i_200_ / 2) + i_203_,
			        -(i_206_ * 5) + 255, (byte) 33);
		}
		if (i_205_ == 1)
		{
			final int i_208_ = (i_206_ * 1280) + 16711680;
			aClass46_Sub1_2.method329((i_202_ / 2) + i, i_206_ + 10, i_208_, i_203_ - -(i_200_ / 2),
			        -(i_206_ * 5) + 255, (byte) 33);
		}
	}

	private void method516(final String[] strings, final int i, final int i_209_, final boolean bool)
	{
		anInt771++;
		method578("", (byte) -107, bool, i, strings);
	}

	private void method517(final boolean bool, final boolean bool_211_)
	{
		anInt770++;
		int i = aClass46_Sub1_2.anInt502 + -248;
		aClass46_Sub1_2.method338(anInt935 + 1, 3, i, (byte) -70);
		for (int i_212_ = 0; i_212_ < anInt973; i_212_++)
		{
			final int i_213_ = i - -((i_212_ % 5) * 49);
			final int i_214_ = ((i_212_ / 5) * 34) + 36;
			if ((anInt1015 <= i_212_) || (anIntArray205[i_212_] != 1))
			{
				aClass46_Sub1_2.method327(i_213_, i_214_, 49, 128, 108, Class34.method227(false, 181, 181, 181), 34);
			}
			else
			{
				aClass46_Sub1_2.method327(i_213_, i_214_, 49, 128, 118, 16711680, 34);
			}
			if (anInt1015 > i_212_)
			{
				aClass46_Sub1_2.method348(false, 0, -89, 32, i_214_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray194[i_212_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray194[i_212_]]), i_213_);
				if (Class1.anIntArray1[anIntArray194[i_212_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray166[i_212_]).toString(),
					        0, 1, 16776960, i_213_ + 1, i_214_ - -10);
				}
			}
		}
		for (int i_215_ = 1; i_215_ <= 4; i_215_++)
		{
			aClass46_Sub1_2.method319(0, (anInt973 / 5) * 34, 36, true, i + (i_215_ * 49));
		}
		for (int i_216_ = 1; ((anInt973 / 5) + -1) >= i_216_; i_216_++)
		{
			aClass46_Sub1_2.method341(245, (byte) -48, (i_216_ * 34) + 36, i, 0);
		}
		if (bool)
		{
			i = 248 - (aClass46_Sub1_2.anInt502 - this.anInt739);
			final int i_217_ = this.anInt736 + -36;
			if ((i >= 0) && (i_217_ >= 0) && (i < 248) && (i_217_ < ((anInt973 / 5) * 34)))
			{
				final int i_218_ = (i / 49) - -((i_217_ / 34) * 5);
				if (anInt1015 > i_218_)
				{
					final int i_219_ = anIntArray194[i_218_];
					if (0 > anInt940)
					{
						if (0 > anInt989)
						{
							if (anIntArray205[i_218_] != 1)
							{
								if (Class6.anIntArray8[i_219_] != 0)
								{
									String string;
									if ((0x18 & Class6.anIntArray8[i_219_]) != 0)
									{
										string = "Wield";
									}
									else
									{
										string = "Wear";
									}
									aClass29_1.method196(
									        string, 630, new StringBuilder().append("@lre@")
									                .append(Class26.aStringArray19[i_219_]).toString(),
									        (byte) -118, i_218_);
								}
							}
							else
							{
								aClass29_1.method196("Remove", 620, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_219_]).toString(), (byte) 77, i_218_);
							}
							if (!Class38.aStringArray27[i_219_].equals(""))
							{
								aClass29_1
								        .method196(Class38.aStringArray27[i_219_], 640,
								                new StringBuilder().append("@lre@")
								                        .append(Class26.aStringArray19[i_219_]).toString(),
								                (byte) 106, i_218_);
							}
							aClass29_1.method196("Use", 650, new StringBuilder().append("@lre@")
							        .append(Class26.aStringArray19[i_219_]).toString(), (byte) 121, i_218_);
							aClass29_1.method196("Drop", 660, new StringBuilder().append("@lre@")
							        .append(Class26.aStringArray19[i_219_]).toString(), (byte) -69, i_218_);
							aClass29_1.method196("Examine", 3600, new StringBuilder().append("@lre@")
							        .append(Class26.aStringArray19[i_219_]).toString(), (byte) 122, i_219_);
						}
						else
						{
							aClass29_1.method195(
							        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
							        i_218_, new StringBuilder().append("@lre@").append(Class26.aStringArray19[i_219_])
							                .toString(),
							        0, anInt989, 610);
						}
					}
					else if (Frame_Sub1.anIntArray153[anInt940] == 3)
					{
						aClass29_1.method195(
						        new StringBuilder().append("Cast ").append(Class46_Sub1.aStringArray36[anInt940])
						                .append(" on").toString(),
						        i_218_,
						        new StringBuilder().append("@lre@").append(Class26.aStringArray19[i_219_]).toString(),
						        0, anInt940, 600);
					}
				}
			}
		}
	}

	private void method518(final boolean bool, final byte i)
	{
		anInt757++;
		int i_220_ = aClass46_Sub1_2.anInt502 + -199;
		int i_221_ = 36;
		aClass46_Sub1_2.method338(anInt935 + 6, 3, i_220_ - 49, (byte) -70);
		int i_222_ = 196;
		aClass46_Sub1_2.method327(i_220_, 36, i_222_, 160, 100, Class34.method227(false, 181, 181, 181), 65);
		aClass46_Sub1_2.method327(i_220_, 101, i_222_, 160, 86, Class34.method227(false, 201, 201, 201), 65);
		aClass46_Sub1_2.method327(i_220_, 166, i_222_, 160, 85, Class34.method227(false, 181, 181, 181), 95);
		aClass46_Sub1_2.method327(i_220_, 261, i_222_, 160, 125, Class34.method227(false, 201, 201, 201),
		        !aBool93 ? 40 : 55);
		int i_224_ = i_220_ + 3;
		int i_225_ = i_221_ + 15;
		aClass46_Sub1_2.method324("Game options - click to toggle", 0, 1, 0, i_224_, i_225_);
		i_225_ += 15;
		if (!aBool86)
		{
			aClass46_Sub1_2.method324("Camera angle mode - @red@Manual", 0, 1, 16777215, i_224_, i_225_);
		}
		else
		{
			aClass46_Sub1_2.method324("Camera angle mode - @gre@Auto", 0, 1, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		if (!aBool83)
		{
			aClass46_Sub1_2.method324("Mouse buttons - @gre@Two", 0, 1, 16777215, i_224_, i_225_);
		}
		else
		{
			aClass46_Sub1_2.method324("Mouse buttons - @red@One", 0, 1, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		if (aBool55)
		{
			if (aBool58)
			{
				aClass46_Sub1_2.method324("Sound effects - @red@off", 0, 1, 16777215, i_224_, i_225_);
			}
			else
			{
				aClass46_Sub1_2.method324("Sound effects - @gre@on", 0, 1, 16777215, i_224_, i_225_);
			}
		}
		i_225_ += 15;
		aClass46_Sub1_2.method324("To change your contact details,", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		aClass46_Sub1_2.method324("password, recovery questions, etc..", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		aClass46_Sub1_2.method324("please select 'account management'", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		if (anInt1018 != 0)
		{
			if (anInt1018 == 1)
			{
				aClass46_Sub1_2.method324("from the link below the gamewindow", 0, 0, 16777215, i_224_, i_225_);
			}
			else
			{
				aClass46_Sub1_2.method324("from the runescape front webpage", 0, 0, 16777215, i_224_, i_225_);
			}
		}
		else
		{
			aClass46_Sub1_2.method324("from the runescape.com front page", 0, 0, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		i_225_ += 5;
		aClass46_Sub1_2.method324("Privacy settings. Will be applied to", 0, 1, 0, i_220_ + 3, i_225_);
		i_225_ += 15;
		aClass46_Sub1_2.method324("all people not on your friends list", 0, 1, 0, i_220_ + 3, i_225_);
		i_225_ += 15;
		if (anInt904 == 0)
		{
			aClass46_Sub1_2.method324("Block chat messages: @red@<off>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			aClass46_Sub1_2.method324("Block chat messages: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		i_225_ += 15;
		if (anInt908 == 0)
		{
			aClass46_Sub1_2.method324("Block private messages: @red@<off>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			aClass46_Sub1_2.method324("Block private messages: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		i_225_ += 15;
		if (anInt890 != 0)
		{
			aClass46_Sub1_2.method324("Block trade requests: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			aClass46_Sub1_2.method324("Block trade requests: @red@<off>", 0, 1, 16777215, i_220_ + 3, i_225_);
		}
		i_225_ += 15;
		if (aBool55)
		{
			if (anInt934 == 0)
			{
				aClass46_Sub1_2.method324("Block duel requests: @red@<off>", 0, 1, 16777215, i_220_ + 3, i_225_);
			}
			else
			{
				aClass46_Sub1_2.method324("Block duel requests: @gre@<on>", 0, 1, 16777215, i_220_ + 3, i_225_);
			}
		}
		i_225_ += 15;
		if (aBool93)
		{
			int i_226_ = 16777215;
			i_225_ += 5;
			if ((this.anInt739 > i_224_) && ((i_224_ - -i_222_) > this.anInt739) && ((i_225_ + -12) < this.anInt736)
			        && (this.anInt736 < (i_225_ + 4)))
			{
				i_226_ = 16776960;
			}
			aClass46_Sub1_2.method324("Skip the tutorial", 0, 1, i_226_, i_224_, i_225_);
			i_225_ += 15;
		}
		i_225_ += 5;
		aClass46_Sub1_2.method324("Always logout when you finish", 0, 1, 0, i_224_, i_225_);
		int i_227_ = 16777215;
		i_225_ += 15;
		if ((this.anInt739 > i_224_) && (this.anInt739 < (i_222_ + i_224_)) && (this.anInt736 > (i_225_ + -12))
		        && (this.anInt736 < (i_225_ + 4)))
		{
			i_227_ = 16776960;
		}
		aClass46_Sub1_2.method324("Click here to logout", 0, 1, i_227_, i_220_ + 3, i_225_);
		if (bool)
		{
			i_220_ = (this.anInt739 + -aClass46_Sub1_2.anInt502 + 199);
			i_221_ = this.anInt736 + -36;
			if ((0 <= i_220_) && (i_221_ >= 0) && (196 > i_220_) && (i_221_ < 265))
			{
				final int i_228_ = aClass46_Sub1_2.anInt502 - 199;
				final int i_229_ = 36;
				i_224_ = i_228_ + 3;
				i_222_ = 196;
				i_225_ = i_229_ + 30;
				if ((this.anInt739 > i_224_) && ((i_222_ + i_224_) > this.anInt739) && (this.anInt736 > (i_225_ - 12))
				        && (this.anInt736 < (i_225_ + 4)) && (anInt887 == 1))
				{
					aBool86 = !aBool86;
					aClass16_Sub1_1.method118(111, 92);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 0);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, !aBool86 ? 0 : 1);
					aClass16_Sub1_1.method126(2);
				}
				i_225_ += 15;
				if ((i_224_ < this.anInt739) && (this.anInt739 < (i_222_ + i_224_)) && (this.anInt736 > (i_225_ - 12))
				        && ((i_225_ + 4) > this.anInt736) && (anInt887 == 1))
				{
					aBool83 = !aBool83;
					aClass16_Sub1_1.method118(111, 98);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 2);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, aBool83 ? 1 : 0);
					aClass16_Sub1_1.method126(2);
				}
				i_225_ += 15;
				if (aBool55 && (i_224_ < this.anInt739) && ((i_224_ - -i_222_) > this.anInt739)
				        && (this.anInt736 > (i_225_ + -12)) && ((i_225_ + 4) > this.anInt736) && (anInt887 == 1))
				{
					aBool58 = !aBool58;
					aClass16_Sub1_1.method118(111, 123);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 3);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, !aBool58 ? 0 : 1);
					aClass16_Sub1_1.method126(2);
				}
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				boolean bool_230_ = false;
				i_225_ += 35;
				if ((this.anInt739 > i_224_) && (this.anInt739 < (i_224_ + i_222_)) && (this.anInt736 > (i_225_ + -12))
				        && ((i_225_ - -4) > this.anInt736) && (anInt887 == 1))
				{
					bool_230_ = true;
					anInt904 = 1 - anInt904;
				}
				i_225_ += 15;
				if ((this.anInt739 > i_224_) && ((i_224_ + i_222_) > this.anInt739) && (this.anInt736 > (i_225_ + -12))
				        && ((i_225_ + 4) > this.anInt736) && (anInt887 == 1))
				{
					anInt908 = 1 - anInt908;
					bool_230_ = true;
				}
				i_225_ += 15;
				if ((this.anInt739 > i_224_) && ((i_224_ - -i_222_) > this.anInt739) && ((i_225_ - 12) < this.anInt736)
				        && (this.anInt736 < (i_225_ - -4)) && (anInt887 == 1))
				{
					bool_230_ = true;
					anInt890 = -anInt890 + 1;
				}
				i_225_ += 15;
				if (aBool55 && (this.anInt739 > i_224_) && (this.anInt739 < (i_222_ + i_224_))
				        && (this.anInt736 > (i_225_ - 12)) && ((i_225_ + 4) > this.anInt736) && (anInt887 == 1))
				{
					anInt934 = -anInt934 + 1;
					bool_230_ = true;
				}
				i_225_ += 15;
				if (bool_230_)
				{
					method592(anInt904, anInt934, true, anInt908, anInt890);
				}
				if (aBool93)
				{
					i_225_ += 5;
					if ((this.anInt739 > i_224_) && (this.anInt739 < (i_222_ + i_224_))
					        && (this.anInt736 > (i_225_ + -12)) && ((i_225_ + 4) > this.anInt736) && (anInt887 == 1))
					{
						method516(Applet_Sub1.aStringArray43, 9, -118, false);
						anInt939 = 0;
					}
					i_225_ += 15;
				}
				i_225_ += 20;
				if ((this.anInt739 > i_224_) && (this.anInt739 < (i_224_ - -i_222_)) && ((i_225_ + -12) < this.anInt736)
				        && ((i_225_ - -4) > this.anInt736) && (anInt887 == 1))
				{
					method491((byte) 75);
				}
				anInt887 = 0;
			}
		}
	}

	private void method519(final int i, final String string, final String string_231_, final boolean bool)
	{
		anInt839++;
		if (anInt902 > 0)
		{
			method533("Please wait...", "Connecting to server", false);
			try
			{
				Class7.method51(67, 2000L);
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			method533("Sorry! The server is currently full.", "Please try again later", false);
		}
		else
		{
			while_12_: do
			{
				for (;;)
				{
					if (0 >= anInt850)
					{
						break while_12_;
					}
					try
					{
						aString34 = string_231_;
						aString39 = string;
						String string_232_ = Class18.method131(20, string, 97);
						if (0 == aString34.trim().length())
						{
							method533("You must enter both a username", "and a password - Please try again", false);
						}
						else
						{
							if (bool)
							{
								method570(2, "Connection lost! Please wait...", "Attempting to re-establish");
							}
							else
							{
								method533("Please wait...", "Connecting to server", false);
							}
							final int i_233_ = 1 < anInt850 ? anInt799 : anInt786;
							aClass16_Sub1_1 = new Class16_Sub1(method522((byte) -128, aString28, i_233_), this);
							aClass16_Sub1_1.anInt192 = Class35.anInt377;
							int i_234_ = 0;
							try
							{
								if (Class38.aFrame_Sub1_1 == null)
								{
									final String string_235_ = getParameter("limit30");
									if (string_235_.equals("1"))
									{
										i_234_ = 1;
									}
								}
							}
							catch (final Exception exception)
							{
								/* empty */
							}
							final int[] is = new int[4];
							is[0] = (int) (Math.random() * 9.9999999E7);
							is[2] = (int) (Math.random() * 9.9999999E7);
							is[3] = (int) (9.9999999E7 * Math.random());
							is[1] = (int) (Math.random() * 9.9999999E7);
							aClass16_Sub1_1.method118(0, 67);
							if (!bool)
							{
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 0);
							}
							else
							{
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 1);
							}
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(Class51.anInt583, true);
							final Class27_Sub1 class27_sub1 = new Class27_Sub1(500);
							class27_sub1.method388(-31566, 10);
							class27_sub1.method395(is[0], true);
							class27_sub1.method395(is[1], true);
							class27_sub1.method395(is[2], true);
							class27_sub1.method395(is[3], true);
							class27_sub1.method402(false, string_232_);
							for (int i_236_ = 0; i_236_ < 5; i_236_++)
							{
								class27_sub1.method395((int) (9.9999999E7 * Math.random()), true);
							}
							class27_sub1.method386(0, (int) (Math.random() * 9.9999999E7));
							class27_sub1.method399((byte) 93, (RuntimeException_Sub1.aBigInteger2),
							        AClass1.aBigInteger1);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method394(class27_sub1.anInt608,
							        class27_sub1.aByteArray24, (byte) -107, 0);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(0, (byte) 64);
							final int i_237_ = ((aClass16_Sub1_1.aClass27_Sub1_Sub1_1).anInt608);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_234_);
							Class39.method251((aClass16_Sub1_1.aClass27_Sub1_Sub1_1), -1);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method402(false, aString34);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method408(-85, i_237_, is,
							        (aClass16_Sub1_1.aClass27_Sub1_Sub1_1).anInt608);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method401(97,
							        (aClass16_Sub1_1.aClass27_Sub1_Sub1_1).anInt608 + -i_237_);
							aClass16_Sub1_1.method120(97);
							aClass16_Sub1_1.method116(is, (byte) 45);
							final int i_238_ = aClass16_Sub1_1.method129(-76);
							System.out.println(new StringBuilder().append("login response:").append(i_238_).toString());
							if ((i_238_ & 0x40) != 0)
							{
								anInt850 = 0;
								anInt905 = (i_238_ >> 2) & 0xf;
								anInt858 = 0x3 & i_238_;
								method581((byte) -123);
							}
							else
							{
								if (i_238_ == 1)
								{
									anInt850 = 0;
									method549(127);
								}
								else
								{
									if (!bool)
									{
										if (i_238_ == -1)
										{
											method533("Error unable to login.", "Server timed out", false);
										}
										else if (i_238_ == 3)
										{
											method533("Invalid username or password.",
											        "Try again, or create a new account", false);
										}
										else if (i_238_ != 4)
										{
											if (i_238_ == 5)
											{
												method533("The client has been updated.", "Please reload this page",
												        false);
											}
											else if (i_238_ == 6)
											{
												method533("You may only use 1 character at once.",
												        "Your ip-address is already in use", false);
											}
											else if (i_238_ == 7)
											{
												method533("Login attempts exceeded!", "Please try again in 5 minutes",
												        false);
											}
											else if (i_238_ == 8)
											{
												method533("Error unable to login.", "Server rejected session", false);
											}
											else if (i_238_ == 9)
											{
												method533("Error unable to login.",
												        "Under 13 accounts cannot access RuneScape Classic", false);
											}
											else if (i_238_ == 10)
											{
												method533("That username is already in use.",
												        "Wait 60 seconds then retry", false);
											}
											else if (i_238_ == 11)
											{
												method533("Account temporarily disabled.",
												        "Check your message inbox for details", false);
											}
											else if (i_238_ == 12)
											{
												method533("Account permanently disabled.",
												        "Check your message inbox for details", false);
											}
											else if (i_238_ == 14)
											{
												method533("Sorry! This world is currently full.",
												        "Please try a different world", false);
												anInt902 = 1500;
											}
											else if (i_238_ == 15)
											{
												method533("You need a members account", "to login to this world",
												        false);
											}
											else if (i_238_ != 16)
											{
												if (i_238_ != 17)
												{
													if (i_238_ != 18)
													{
														if (i_238_ == 20)
														{
															method533("Error - loginserver mismatch",
															        "Please try a different world", false);
														}
														else if (i_238_ == 21)
														{
															method533("That is not a veteran RS-Classic account.",
															        "Please try a non-veterans world.", false);
														}
														else if (i_238_ != 22)
														{
															if (i_238_ == 23)
															{
																method533("You need to set your display name.",
																        "Please go to the Account Management page to do this.",
																        false);
															}
															else if (i_238_ != 24)
															{
																if (i_238_ != 25)
																{
																	method533("Error unable to login.",
																	        "Unrecognised response code", false);
																}
																else
																{
																	method533("None of your characters can log in.",
																	        "Contact customer support", false);
																}
															}
															else
															{
																method533("This world does not accept new players.",
																        "Please see the launch page for help", false);
															}
														}
														else
														{
															method533("Password suspected stolen.",
															        "Press 'change your password' on front page.",
															        false);
														}
													}
													else
													{
														method533("Account suspected stolen.",
														        "Press 'recover a locked account' on front page.",
														        false);
													}
												}
												else
												{
													method533("Error - failed to decode profile.",
													        "Contact customer support", false);
												}
											}
											else
											{
												method533("Error - no reply from loginserver.", "Please try again",
												        false);
											}
										}
										else
										{
											method533("That username is already logged in.",
											        "Wait 60 seconds then retry", false);
										}
									}
									else
									{
										aString34 = "";
										string_232_ = "";
										method529(-111);
									}
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					catch (final Exception exception)
					{
						System.out.println(new StringBuilder().append("").append(exception).toString());
						if (anInt850 > 0)
						{
							try
							{
								Class7.method51(88, 5000L);
							}
							catch (final Exception exception_239_)
							{
								/* empty */
							}
							anInt850--;
						}
						else if (bool)
						{
							aString39 = "";
							aString34 = "";
							method529(-104);
						}
						else
						{
							Class9.method61(exception, 85, "Error while connecting");
							method533("Sorry! Unable to connect.", "Check internet settings or try another world",
							        false);
						}
					}
				}
				return;
			}
			while (false);
		}
	}

	private void method520(final byte i)
	{
		anInt769++;
		aClass10_1.method85(this.anInt737, this.anInt736, this.anInt738, (byte) -124, this.anInt739);
		if (aClass10_1.method81(true, anInt968))
		{
			do
			{
				anInt1047 = ((anInt1047 + -1) - -Class38.anInt396) % Class38.anInt396;
			}
			while (((Class6.anIntArray13[anInt1047] & 0x3) != 1)
			        || ((Class6.anIntArray13[anInt1047] & (anInt1028 * 4)) == 0));
		}
		if (aClass10_1.method81(true, anInt974))
		{
			do
			{
				anInt1047 = (anInt1047 + 1) % Class38.anInt396;
			}
			while (((Class6.anIntArray13[anInt1047] & 0x3) != 1)
			        || (((anInt1028 * 4) & Class6.anIntArray13[anInt1047]) == 0));
		}
		if (aClass10_1.method81(true, anInt991))
		{
			anInt999 = ((anIntArray211.length + anInt999) - 1) % anIntArray211.length;
		}
		if (aClass10_1.method81(true, anInt954))
		{
			anInt999 = (anInt999 + 1) % anIntArray211.length;
		}
		if (aClass10_1.method81(true, anInt996) || aClass10_1.method81(true, anInt956))
		{
			for (anInt1028 = -anInt1028 + 3; (((Class6.anIntArray13[anInt1047] & 0x3) != 1)
			        || ((Class6.anIntArray13[anInt1047] & (anInt1028 * 4)) == 0)); anInt1047 = (anInt1047 + 1)
			                % Class38.anInt396)
			{
				/* empty */
			}
			for (/**/; (((0x3 & Class6.anIntArray13[anInt962]) != 2)
			        || (((anInt1028 * 4) & Class6.anIntArray13[anInt962]) == 0)); anInt962 = (anInt962 + 1)
			                % Class38.anInt396)
			{
				/* empty */
			}
		}
		if (aClass10_1.method81(true, anInt969))
		{
			anInt1057 = (((anInt1057 - -anIntArray165.length) + -1) % anIntArray165.length);
		}
		if (aClass10_1.method81(true, anInt945))
		{
			anInt1057 = (anInt1057 + 1) % anIntArray165.length;
		}
		if (aClass10_1.method81(true, anInt1020))
		{
			anInt961 = (((anInt961 + -1) - -anIntArray197.length) % anIntArray197.length);
		}
		if (aClass10_1.method81(true, anInt966))
		{
			anInt961 = (anInt961 + 1) % anIntArray197.length;
		}
		if (aClass10_1.method81(true, anInt947))
		{
			anInt965 = ((anIntArray165.length + (anInt965 - 1)) % anIntArray165.length);
		}
		if (aClass10_1.method81(true, anInt1044))
		{
			anInt965 = (anInt965 + 1) % anIntArray165.length;
		}
		if (aClass10_1.method81(true, anInt1029))
		{
			aClass16_Sub1_1.method118(235, 81);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1028);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1047);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt962);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt948);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt999);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1057);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt965);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt961);
			aClass16_Sub1_1.method126(2);
			aClass46_Sub1_2.method331(-1964300920);
			aBool64 = false;
		}
	}

	private void method521(final byte i)
	{
		anInt897++;
		boolean bool = false;
		if (anInt970 == 0)
		{
			if (!aBool91)
			{
				if (aBool88)
				{
					method496(-1);
				}
				else if (anInt979 == 1)
				{
					method585(false);
				}
				else if (!aBool81 || (anInt1051 != 0))
				{
					if (aBool57 && (anInt1051 == 0))
					{
						method546((byte) 82);
					}
					else if (aBool89)
					{
						method543(false);
					}
					else if (!aBool84)
					{
						if (aBool92)
						{
							method579(-14534);
						}
						else if (aBool72)
						{
							method555((byte) 121);
						}
						else if (anInt994 != 1)
						{
							if (anInt994 != 2)
							{
								if (anInt1059 == 0)
								{
									bool = true;
								}
								else
								{
									method527(false);
								}
							}
							else
							{
								method588(15);
							}
						}
						else
						{
							method499(-3645);
						}
					}
					else
					{
						method528(1);
					}
				}
				else
				{
					method567(1);
				}
			}
			else
			{
				method493(1);
			}
		}
		else
		{
			method572(137);
		}
		if (anInt971 != 0)
		{
			method535(-72);
		}
		if (bool)
		{
			if (aBool70)
			{
				method562(8409088);
			}
			if ((aClass15_1.anInt160 == 8) || (aClass15_1.anInt160 == 9))
			{
				method595((byte) -2);
			}
			method596(-106);
			final boolean bool_241_ = !aBool70 && !aBool61;
			if (bool_241_)
			{
				aClass29_1.method190(true);
			}
			if ((anInt939 == 0) && bool_241_)
			{
				method514(10000);
			}
			if (anInt939 == 1)
			{
				method517(bool_241_, false);
			}
			if (anInt939 == 2)
			{
				method577(bool_241_, -20183);
			}
			if (anInt939 == 3)
			{
				method556(false, bool_241_);
			}
			if (anInt939 == 4)
			{
				method594(2, bool_241_);
			}
			if (anInt939 == 5)
			{
				method532((byte) -103, bool_241_);
			}
			if (anInt939 == 6)
			{
				method518(bool_241_, (byte) 37);
			}
			if (!aBool61 && !aBool70)
			{
				method590(0);
			}
			if (aBool61 && !aBool70)
			{
				method534(16508);
			}
		}
		anInt887 = 0;
	}

	private Socket method522(final byte i, final String string, final int i_242_) throws IOException
	{
		anInt846++;
		Socket socket;
		if ((Class38.aFrame_Sub1_1 != null) || (Class27.anApplet1 == null))
		{
			if (Class38.aFrame_Sub1_1 != null)
			{
				socket = new Socket(InetAddress.getByName(string), i_242_);
			}
			else
			{
				socket = new Socket(InetAddress.getByName(getCodeBase().getHost()), i_242_);
			}
		}
		else
		{
			final Class20 class20 = Frame_Sub1.aClass32_4.method221(string, 0, i_242_);
			while (class20.anInt216 == 0)
			{
				Class7.method51(58, 50L);
			}
			if (class20.anInt216 != 1)
			{
				throw new IOException();
			}
			socket = (Socket) class20.anObject2;
			if (socket == null)
			{
				throw new IOException();
			}
		}
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		return socket;
	}

	private void method523(final int i, final int i_243_, final int i_244_)
	{
		anInt815++;
		final int i_245_ = anIntArray180[i_243_];
		final int i_246_ = 0 <= i ? i : anInt1036;
		if (Class1.anIntArray1[i_245_] != 0)
		{
			int i_247_ = 0;
			for (int i_248_ = 0; (i_248_ < anInt1049) && (i_246_ > i_247_); i_248_++)
			{
				if (i_245_ == anIntArray180[i_248_])
				{
					anInt1049--;
					i_247_++;
					for (int i_249_ = i_248_; anInt1049 > i_249_; i_249_++)
					{
						anIntArray180[i_249_] = anIntArray180[i_249_ + 1];
						anIntArray164[i_249_] = anIntArray164[i_249_ - -1];
					}
					i_248_--;
				}
			}
		}
		else
		{
			anIntArray164[i_243_] -= i_246_;
			if (anIntArray164[i_243_] <= 0)
			{
				anInt1049--;
				for (int i_250_ = i_243_; anInt1049 > i_250_; i_250_++)
				{
					anIntArray180[i_250_] = anIntArray180[i_250_ + 1];
					anIntArray164[i_250_] = anIntArray164[i_250_ + 1];
				}
			}
		}
		aClass16_Sub1_1.method118(46, 110);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1049);
		int i_251_ = 0;
		if (i_244_ != 348)
		{
			method527(false);
		}
		for (/**/; anInt1049 > i_251_; i_251_++)
		{
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray180[i_251_], (byte) 119);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(anIntArray164[i_251_], true);
		}
		aClass16_Sub1_1.method126(i_244_ ^ 0x15e);
		aBool67 = false;
		aBool68 = false;
	}

	private void method524(final int i, final int i_252_, final int i_253_)
	{
		anInt874++;
		boolean bool = false;
		int i_254_ = 0;
		final int i_255_ = anIntArray194[i_252_];
		for (int i_256_ = i; i_256_ < anInt1061; i_256_++)
		{
			if (i_255_ == anIntArray182[i_256_])
			{
				if (Class1.anIntArray1[i_255_] == 0)
				{
					if (i_253_ < 0)
					{
						for (int i_257_ = 0; i_257_ < anInt1036; i_257_++)
						{
							bool = true;
							if (anIntArray166[i_252_] > anIntArray198[i_256_])
							{
								anIntArray198[i_256_]++;
							}
						}
					}
					else
					{
						anIntArray198[i_256_] += i_253_;
						if (anIntArray198[i_256_] > anIntArray166[i_252_])
						{
							anIntArray198[i_256_] = anIntArray166[i_252_];
						}
						bool = true;
					}
				}
				else
				{
					i_254_++;
				}
			}
		}
		final int i_258_ = method584(i_255_, false);
		if (i_258_ <= i_254_)
		{
			bool = true;
		}
		if (Class6.anIntArray10[i_255_] == 1)
		{
			method513(0, "This object cannot be added to a duel offer", 0, null, -100, null, null, false);
			bool = true;
		}
		if (!bool)
		{
			if (0 > i_253_)
			{
				if (8 > anInt1061)
				{
					anIntArray182[anInt1061] = i_255_;
					anIntArray198[anInt1061] = 1;
					bool = true;
					anInt1061++;
				}
			}
			else
			{
				for (int i_259_ = 0; (i_259_ < i_253_) && (8 > anInt1061) && (i_254_ < i_258_); i_259_++)
				{
					anIntArray182[anInt1061] = i_255_;
					anIntArray198[anInt1061] = 1;
					bool = true;
					i_254_++;
					anInt1061++;
					if ((i_259_ == 0) && (Class1.anIntArray1[i_255_] == 0))
					{
						anIntArray198[anInt1061 + -1] = (anIntArray166[i_252_] >= i_253_ ? i_253_
						        : anIntArray166[i_252_]);
						break;
					}
				}
			}
		}
		if (bool)
		{
			aClass16_Sub1_1.method118(33, 123);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i + -31566, anInt1061);
			for (int i_260_ = 0; i_260_ < anInt1061; i_260_++)
			{
				aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray182[i_260_], (byte) 58);
				aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(anIntArray198[i_260_], true);
			}
			aClass16_Sub1_1.method126(2);
			aBool75 = false;
			aBool59 = false;
		}
	}

	private void method525(final byte i)
	{
		if (i == -73)
		{
			for (int i_261_ = 0; i_261_ < anInt978; i_261_++)
			{
				final int i_262_ = aClass46_Sub1_2.method315((byte) 85, 1);
				final int i_263_ = anIntArray195[i_261_];
				int i_264_ = anIntArray203[i_261_];
				final int i_265_ = anIntArray158[i_261_];
				final int i_266_ = anIntArray187[i_261_];
				boolean bool = true;
				while (bool)
				{
					bool = false;
					for (int i_267_ = 0; i_261_ > i_267_; i_267_++)
					{
						if (((i_264_ + i_266_) > (-i_262_ + anIntArray203[i_267_]))
						        && ((-i_262_ + i_264_) < (anIntArray203[i_267_] + anIntArray187[i_267_]))
						        && ((anIntArray158[i_267_] + anIntArray195[i_267_]) > (-i_265_ + i_263_))
						        && ((-anIntArray158[i_267_] + anIntArray195[i_267_]) < (i_265_ + i_263_))
						        && ((-i_262_ + (anIntArray203[i_267_] - i_266_)) < i_264_))
						{
							bool = true;
							i_264_ = anIntArray203[i_267_] - i_262_ - i_266_;
						}
					}
				}
				anIntArray203[i_261_] = i_264_;
				aClass46_Sub1_2.method333(i_264_, (byte) -7, 300, 1, 16776960, aStringArray47[i_261_], i_263_, false);
			}
			anInt775++;
			for (int i_268_ = 0; i_268_ < anInt960; i_268_++)
			{
				final int i_269_ = anIntArray217[i_268_];
				final int i_270_ = anIntArray218[i_268_];
				final int i_271_ = anIntArray169[i_268_];
				final int i_272_ = anIntArray213[i_268_];
				final int i_273_ = (i_271_ * 39) / 100;
				final int i_274_ = (i_271_ * 27) / 100;
				final int i_275_ = -i_274_ + i_270_;
				aClass46_Sub1_2.method311(i_269_ - (i_273_ / 2), i_273_, i_274_, 85, anInt935 + 9, (byte) 110, i_275_);
				final int i_276_ = (i_271_ * 36) / 100;
				final int i_277_ = (i_271_ * 24) / 100;
				aClass46_Sub1_2.method348(false, 0, i + -34, i_277_, (i_274_ / 2) + i_275_ + -(i_277_ / 2), i_276_, 0,
				        (AClass1_Sub1.anIntArray144[i_272_] + anInt863), Class46.anIntArray133[i_272_],
				        i_269_ + -(i_276_ / 2));
			}
			for (int i_278_ = 0; i_278_ < anInt977; i_278_++)
			{
				final int i_279_ = anIntArray216[i_278_];
				final int i_280_ = anIntArray173[i_278_];
				final int i_281_ = anIntArray202[i_278_];
				aClass46_Sub1_2.method327(i_279_ + -15, i_280_ - 3, i_281_, 192, i ^ ~0x28, 65280, 5);
				aClass46_Sub1_2.method327(i_279_ + i_281_ + -15, i_280_ + -3, -i_281_ + 30, 192, 111, 16711680, 5);
			}
		}
	}

	private boolean method526(final int i, final byte i_282_, final int i_283_)
	{
		anInt789++;
		if ((i_283_ != 31)
		        || (!method565((byte) 97, 197) && !method565((byte) -44, 615) && !method565((byte) 108, 682)))
		{
			if ((i_283_ != 32)
			        || (!method565((byte) -30, 102) && !method565((byte) -24, 616) && !method565((byte) 91, 683)))
			{
				if ((i_283_ != 33)
				        || (!method565((byte) 94, 101) && !method565((byte) 88, 617) && !method565((byte) -32, 684)))
				{
					if ((i_283_ == 34) && (method565((byte) -75, 103) || method565((byte) -113, 618)
					        || method565((byte) -72, 685)))
					{
						return true;
					}
				}
				else
				{
					return true;
				}
			}
			else
			{
				return true;
			}
		}
		else
		{
			return true;
		}
		if (method584(i_283_, false) >= i)
		{
			return true;
		}
		return false;
	}

	private void method527(final boolean bool)
	{
		anInt837++;
		if (anInt887 != 0)
		{
			anInt887 = 0;
			if ((anInt1059 == 1) && ((this.anInt739 < 106) || (this.anInt736 < 145) || (406 < this.anInt739)
			        || (215 < this.anInt736)))
			{
				anInt1059 = 0;
				return;
			}
			if ((anInt1059 == 2)
			        && ((this.anInt739 < 6) || (145 > this.anInt736) || (506 < this.anInt739) || (215 < this.anInt736)))
			{
				anInt1059 = 0;
				return;
			}
			if ((anInt1059 == 3) && ((this.anInt739 < 106) || (145 > this.anInt736) || (406 < this.anInt739)
			        || (215 < this.anInt736)))
			{
				anInt1059 = 0;
				return;
			}
			if ((236 < this.anInt739) && (this.anInt739 < 276) && (193 < this.anInt736) && (213 > this.anInt736))
			{
				anInt1059 = 0;
				return;
			}
		}
		int i = 145;
		if (anInt1059 == 1)
		{
			aClass46_Sub1_2.method321(i, 0, 70, 300, 106, 1);
			aClass46_Sub1_2.method362(70, 106, (byte) 97, 300, 16777215, i);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4, "Enter name to add to friends list", i, 256);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i, 256);
			final String string = Class43.method298((byte) -112, aClass15_1.aString7);
			if ((string != null) && (0 < this.aString26.length()))
			{
				final String string_284_ = this.aString26.trim();
				anInt1059 = 0;
				this.aString26 = "";
				this.aString27 = "";
				if ((0 < string_284_.length()) && !string.equals(Class43.method298((byte) -54, string_284_)))
				{
					method586(-113, string_284_);
				}
			}
		}
		if (anInt1059 == 2)
		{
			aClass46_Sub1_2.method321(i, 0, 70, 500, 6, 1);
			aClass46_Sub1_2.method362(70, 6, (byte) 120, 500, 16777215, i);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append("Enter message to send to ").append(aString29).toString(), i, 256);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append(this.aString24).append("*").toString(), i, 256);
			if (this.aString25.length() > 0)
			{
				final String string = this.aString25;
				this.aString24 = "";
				anInt1059 = 0;
				this.aString25 = "";
				method542(string, 218, aString29);
			}
		}
		if (anInt1059 == 3)
		{
			aClass46_Sub1_2.method321(i, 0, 70, 300, 106, 1);
			aClass46_Sub1_2.method362(70, 106, (byte) 125, 300, 16777215, i);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4, "Enter name to add to ignore list", i, 256);
			i += 20;
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i, 256);
			final String string = Class43.method298((byte) 57, aClass15_1.aString7);
			if ((string != null) && (this.aString26.length() > 0))
			{
				final String string_285_ = this.aString26.trim();
				anInt1059 = 0;
				this.aString26 = "";
				this.aString27 = "";
				if ((string_285_.length() > 0) && !string.equals(Class43.method298((byte) 71, string_285_)))
				{
					method502(string_285_, -101);
				}
			}
		}
		int i_286_ = 16777215;
		if ((236 < this.anInt739) && (this.anInt739 < 276) && (this.anInt736 > 193) && (213 > this.anInt736))
		{
			i_286_ = 16776960;
		}
		aClass46_Sub1_2.method335(i_286_, 255, 1, "Cancel", 208, 256);
	}

	private void method528(final int i)
	{
		anInt766++;
		int i_287_ = -1;
		if ((anInt887 != 0) && aBool87)
		{
			i_287_ = aClass29_2.method197(this.anInt739, this.anInt736, anInt1058, anInt944, 0);
		}
		if (i_287_ < 0)
		{
			if (anInt971 == 0)
			{
				if ((anInt887 == 1) && (anInt1036 == 0))
				{
					anInt1036 = 1;
				}
				final int i_288_ = this.anInt739 + -22;
				final int i_289_ = this.anInt736 + -36;
				if ((i_288_ >= 0) && (i_289_ >= 0) && (i_288_ < 468) && (i_289_ < 262))
				{
					if (anInt1036 > 0)
					{
						if ((i_288_ > 216) && (30 < i_289_) && (i_288_ < 462) && (i_289_ < 235))
						{
							final int i_290_ = (((i_288_ - 217) / 49) + (((i_289_ + -31) / 34) * 5));
							if ((0 <= i_290_) && (anInt1015 > i_290_))
							{
								method503(-1, i_290_, 2);
							}
						}
						if ((i_288_ > 8) && (30 < i_289_) && (i_288_ < 205) && (i_289_ < 133))
						{
							final int i_291_ = ((i_288_ + -9) / 49) + (((i_289_ + -31) / 34) * 4);
							if ((0 <= i_291_) && (anInt1049 > i_291_))
							{
								method523(-1, i_291_, 348);
							}
						}
						if ((217 <= i_288_) && (i_289_ >= 238) && (i_288_ <= 286) && (259 >= i_289_))
						{
							aBool68 = true;
							aClass16_Sub1_1.method118(55, 66);
							aClass16_Sub1_1.method126(2);
						}
						if ((394 <= i_288_) && (238 <= i_289_) && (i_288_ < 463) && (i_289_ < 259))
						{
							aBool84 = false;
							aClass16_Sub1_1.method118(230, 123);
							aClass16_Sub1_1.method126(2);
						}
						anInt1036 = 0;
						anInt887 = 0;
					}
					if (anInt887 == 2)
					{
						if ((216 < i_288_) && (i_289_ > 30) && (462 > i_288_) && (235 > i_289_))
						{
							final int i_292_ = aClass29_1.method207(true);
							final int i_293_ = aClass29_1.method210(i + -1);
							anInt955 = this.anInt739 + -(i_292_ / 2);
							anInt984 = this.anInt736 + -7;
							aBool61 = true;
							if (anInt984 < 0)
							{
								anInt984 = 0;
							}
							if (anInt955 < 0)
							{
								anInt955 = 0;
							}
							if (510 < (i_292_ + anInt955))
							{
								anInt955 = -i_292_ + 510;
							}
							if ((anInt984 - -i_293_) > 315)
							{
								anInt984 = -i_293_ + 315;
							}
							final int i_294_ = (((i_288_ + -217) / 49) + (((i_289_ + -31) / 34) * 5));
							if ((i_294_ >= 0) && (anInt1015 > i_294_))
							{
								final int i_295_ = anIntArray194[i_294_];
								aBool87 = true;
								aClass29_2.method190(true);
								aClass29_2.method195("Offer 1", i_295_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_295_]).toString(), 0, 1, 1);
								aClass29_2.method195("Offer 5", i_295_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_295_]).toString(), 0, 5, 1);
								aClass29_2.method195("Offer 10", i_295_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_295_]).toString(), 0, 10, 1);
								aClass29_2.method195("Offer All", i_295_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_295_]).toString(), i ^ 0x1, -1, 1);
								aClass29_2.method195("Offer X", i_295_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_295_]).toString(), 0, -2, 1);
								final int i_296_ = aClass29_2.method207(true);
								final int i_297_ = aClass29_2.method210(0);
								anInt1058 = this.anInt736 + -7;
								anInt944 = this.anInt739 + -(i_296_ / 2);
								if (anInt1058 < 0)
								{
									anInt1058 = 0;
								}
								if (anInt944 < 0)
								{
									anInt944 = 0;
								}
								if (510 < (i_296_ + anInt944))
								{
									anInt944 = -i_296_ + 510;
								}
								if ((anInt1058 - -i_297_) > 315)
								{
									anInt1058 = 315 - i_297_;
								}
							}
						}
						if ((i_288_ > 8) && (30 < i_289_) && (i_288_ < 205) && (133 > i_289_))
						{
							final int i_298_ = (((i_288_ + -9) / 49) - -(((i_289_ - 31) / 34) * 4));
							if ((i_298_ >= 0) && (anInt1049 > i_298_))
							{
								final int i_299_ = anIntArray180[i_298_];
								aBool87 = true;
								aClass29_2.method190(true);
								aClass29_2.method195("Remove 1", i_299_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_299_]).toString(), 0, 1, 2);
								aClass29_2.method195("Remove 5", i_299_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_299_]).toString(), 0, 5, 2);
								aClass29_2.method195("Remove 10", i_299_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_299_]).toString(), 0, 10, 2);
								aClass29_2.method195("Remove All", i_299_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_299_]).toString(), 0, -1, 2);
								aClass29_2.method195("Remove X", i_299_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_299_]).toString(), 0, -2, 2);
								final int i_300_ = aClass29_2.method207(true);
								final int i_301_ = aClass29_2.method210(0);
								anInt944 = this.anInt739 - (i_300_ / 2);
								anInt1058 = this.anInt736 - 7;
								if (anInt1058 < 0)
								{
									anInt1058 = 0;
								}
								if (0 > anInt944)
								{
									anInt944 = 0;
								}
								if (315 < (i_301_ + anInt1058))
								{
									anInt1058 = -i_301_ + 315;
								}
								if (510 < (i_300_ + anInt944))
								{
									anInt944 = -i_300_ + 510;
								}
							}
						}
						anInt887 = 0;
					}
					if (aBool87)
					{
						final int i_302_ = aClass29_2.method207(true);
						final int i_303_ = aClass29_2.method210(0);
						if ((this.anInt739 < (anInt944 + -10)) || (this.anInt736 < (anInt1058 - 10))
						        || (this.anInt739 > (i_302_ + anInt944 + 10))
						        || (this.anInt736 > ((anInt1058 - -i_303_) + 10)))
						{
							aBool87 = false;
						}
					}
				}
				else if (anInt887 != 0)
				{
					aBool84 = false;
					aClass16_Sub1_1.method118(230, i + 88);
					aClass16_Sub1_1.method126(i ^ 0x3);
				}
			}
		}
		else
		{
			anInt887 = 0;
			aBool87 = false;
			final int i_304_ = aClass29_2.method203(0, i_287_);
			final int i_305_ = aClass29_2.method214(i_287_, (byte) 80);
			int i_306_ = -1;
			int i_307_ = 0;
			if (i_304_ == 1)
			{
				for (int i_308_ = 0; anInt1015 > i_308_; i_308_++)
				{
					if (i_305_ == anIntArray194[i_308_])
					{
						if (i_306_ < 0)
						{
							i_306_ = i_308_;
						}
						if (Class1.anIntArray1[i_305_] == 0)
						{
							i_307_ = anIntArray166[i_308_];
							break;
						}
						i_307_++;
					}
				}
			}
			else
			{
				for (int i_309_ = 0; i_309_ < anInt1049; i_309_++)
				{
					if (i_305_ == anIntArray180[i_309_])
					{
						if (0 > i_306_)
						{
							i_306_ = i_309_;
						}
						if (Class1.anIntArray1[i_305_] == 0)
						{
							i_307_ = anIntArray164[i_309_];
							break;
						}
						i_307_++;
					}
				}
			}
			if (i_306_ >= 0)
			{
				int i_310_ = aClass29_2.method186(i_287_, (byte) -93);
				if (i_310_ == -2)
				{
					anInt980 = i_306_;
					if (i_304_ == 1)
					{
						method516(AClass1_Sub1.aStringArray38, 1, -127, true);
					}
					else
					{
						method516(Class16.aStringArray14, 2, -128, true);
					}
				}
				else
				{
					if (i_310_ == -1)
					{
						i_310_ = i_307_;
					}
					if (i_304_ == 1)
					{
						method503(i_310_, i_306_, 2);
					}
					else
					{
						method523(i_310_, i_306_, i ^ 0x15d);
					}
				}
			}
		}
		if (aBool84)
		{
			final int i_311_ = 22;
			final int i_312_ = 36;
			aClass46_Sub1_2.method321(i_312_, 192, 12, 468, i_311_, 1);
			final int i_313_ = 10000536;
			aClass46_Sub1_2.method327(i_311_, i_312_ + 12, 468, 160, i + 85, i_313_, 18);
			aClass46_Sub1_2.method327(i_311_, i_312_ + 30, 8, 160, 73, i_313_, 248);
			aClass46_Sub1_2.method327(i_311_ - -205, i_312_ + 30, 11, 160, i + 73, i_313_, 248);
			aClass46_Sub1_2.method327(i_311_ - -462, i_312_ + 30, 6, 160, 114, i_313_, 248);
			aClass46_Sub1_2.method327(i_311_ + 8, i_312_ - -133, 197, 160, 84, i_313_, 22);
			aClass46_Sub1_2.method327(i_311_ - -8, i_312_ + 258, 197, 160, i ^ 0x5a, i_313_, 20);
			aClass46_Sub1_2.method327(i_311_ - -216, i_312_ + 235, 246, 160, 103, i_313_, 43);
			final int i_314_ = 13684944;
			aClass46_Sub1_2.method327(i_311_ + 8, i_312_ - -30, 197, 160, i + 122, i_314_, 103);
			aClass46_Sub1_2.method327(i_311_ + 8, i_312_ + 155, 197, 160, 121, i_314_, 103);
			aClass46_Sub1_2.method327(i_311_ + 216, i_312_ + 30, 246, 160, 73, i_314_, 205);
			for (int i_315_ = 0; 4 > i_315_; i_315_++)
			{
				aClass46_Sub1_2.method341(197, (byte) -33, (i_312_ - -(i_315_ * 34)) + 30, i_311_ + 8, 0);
			}
			for (int i_316_ = 0; i_316_ < 4; i_316_++)
			{
				aClass46_Sub1_2.method341(197, (byte) -26, i_312_ + (i_316_ * 34) + 155, i_311_ - -8, 0);
			}
			for (int i_317_ = 0; i_317_ < 7; i_317_++)
			{
				aClass46_Sub1_2.method341(246, (byte) -7, i_312_ + (i_317_ * 34) + 30, i_311_ - -216, 0);
			}
			for (int i_318_ = 0; i_318_ < 6; i_318_++)
			{
				if (i_318_ < 5)
				{
					aClass46_Sub1_2.method319(0, 103, i_312_ - -30, true, (i_311_ + 8) - -(i_318_ * 49));
				}
				if (i_318_ < 5)
				{
					aClass46_Sub1_2.method319(0, 103, i_312_ + 155, true, i_311_ - (-(i_318_ * 49) + -8));
				}
				aClass46_Sub1_2.method319(0, 205, i_312_ + 30, true, (i_311_ + 216) - -(i_318_ * 49));
			}
			aClass46_Sub1_2.method324(new StringBuilder().append("Trading with: ").append(aString40).toString(), 0, 1,
			        16777215, i_311_ + i, i_312_ - -10);
			aClass46_Sub1_2.method324("Your Offer", i ^ 0x1, 4, 16777215, i_311_ + 9, i_312_ + 27);
			aClass46_Sub1_2.method324("Opponent's Offer", 0, 4, 16777215, i_311_ - -9, i_312_ - -152);
			aClass46_Sub1_2.method324("Your Inventory", 0, 4, 16777215, i_311_ + 216, i_312_ - -27);
			if (!aBool68)
			{
				aClass46_Sub1_2.method338(anInt935 + 25, i_312_ + 238, i_311_ + 217, (byte) -70);
			}
			aClass46_Sub1_2.method338(anInt935 + 26, i_312_ + 238, i_311_ + 394, (byte) -70);
			if (aBool67)
			{
				aClass46_Sub1_2.method335(16777215, 255, 1, "Other player", i_312_ + 246, i_311_ + 341);
				aClass46_Sub1_2.method335(16777215, 255, 1, "has accepted", i_312_ + 256, i_311_ - -341);
			}
			if (aBool68)
			{
				aClass46_Sub1_2.method335(16777215, 255, 1, "Waiting for", i_312_ - -246, (i_311_ + 35) - -217);
				aClass46_Sub1_2.method335(16777215, 255, 1, "other player", i_312_ + 256, i_311_ + 217 + 35);
			}
			for (int i_319_ = 0; i_319_ < anInt1015; i_319_++)
			{
				final int i_320_ = i_311_ + ((i_319_ % 5) * 49) + 217;
				final int i_321_ = i_312_ + ((i_319_ / 5) * 34) + 31;
				aClass46_Sub1_2.method348(false, 0, -101, 32, i_321_, 48, 0,
				        (anInt863 - -(AClass1_Sub1.anIntArray144[anIntArray194[i_319_]])),
				        (Class46.anIntArray133[anIntArray194[i_319_]]), i_320_);
				if (Class1.anIntArray1[anIntArray194[i_319_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray166[i_319_]).toString(),
					        0, 1, 16776960, i_320_ + 1, i_321_ + 10);
				}
			}
			for (int i_322_ = 0; anInt1049 > i_322_; i_322_++)
			{
				final int i_323_ = (i_311_ - -((i_322_ % 4) * 49)) + 9;
				final int i_324_ = (i_312_ - -((i_322_ / 4) * 34)) + 31;
				aClass46_Sub1_2.method348(false, 0, i + -85, 32, i_324_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray180[i_322_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray180[i_322_]]), i_323_);
				if (Class1.anIntArray1[anIntArray180[i_322_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray164[i_322_]).toString(),
					        0, 1, 16776960, i_323_ + 1, i_324_ - -10);
				}
				if ((i_323_ < this.anInt739) && ((i_323_ + 48) > this.anInt739) && (this.anInt736 > i_324_)
				        && (this.anInt736 < (i_324_ + 32)))
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[anIntArray180[i_322_]]).append(": @whi@")
					                .append(Class28.aStringArray25[anIntArray180[i_322_]]).toString(),
					        0, 1, 16776960, i_311_ + 8, i_312_ - -273);
				}
			}
			for (int i_325_ = 0; i_325_ < anInt1026; i_325_++)
			{
				final int i_326_ = (9 - -i_311_) + ((i_325_ % 4) * 49);
				final int i_327_ = i_312_ + ((i_325_ / 4) * 34) + 156;
				aClass46_Sub1_2.method348(false, 0, -65, 32, i_327_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray181[i_325_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray181[i_325_]]), i_326_);
				if (Class1.anIntArray1[anIntArray181[i_325_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray209[i_325_]).toString(),
					        i ^ 0x1, 1, 16776960, i_326_ + 1, i_327_ - -10);
				}
				if ((this.anInt739 > i_326_) && ((i_326_ + 48) > this.anInt739) && (this.anInt736 > i_327_)
				        && (this.anInt736 < (i_327_ + 32)))
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[anIntArray181[i_325_]]).append(": @whi@")
					                .append(Class28.aStringArray25[anIntArray181[i_325_]]).toString(),
					        0, 1, 16776960, i_311_ + 8, i_312_ - -273);
				}
			}
			if (aBool87)
			{
				aClass29_2.method204(anInt944, anInt1058, (byte) -41, this.anInt739, this.anInt736);
			}
		}
	}

	private void method529(final int i)
	{
		anInt924++;
		anInt899 = 0;
		if (i < -97)
		{
			anInt1035 = 0;
			anInt970 = 0;
			anInt949 = 0;
		}
	}

	void method530(final boolean bool, final int i, final int i_328_, final int i_329_, final int i_330_,
	        final int i_331_, final int i_332_)
	{
		anInt881++;
		final int i_333_ = AClass1_Sub1.anIntArray144[i_328_] + anInt863;
		final int i_334_ = Class46.anIntArray133[i_328_];
		aClass46_Sub1_2.method348(false, 0, -90, i_329_, i_330_, i_332_, 0, i_333_, i_334_, i_331_);
	}

	private void method531(final int i)
	{
		anInt909++;
		final int i_335_ = 0;
		final int i_336_ = 50;
		final int i_337_ = 50;
		aClass6_1.method11((byte) 91, (i_336_ * 48) + 23, i_335_, (i_337_ * 48) - -23);
		aClass6_1.method29(aClass23Array6, 121);
		int i_338_ = 9728;
		int i_339_ = 1100;
		int i_340_ = 6400;
		aClass41_2.anInt465 = 1;
		aClass41_2.anInt426 = 4000;
		aClass41_2.anInt464 = 4100;
		aClass41_2.anInt437 = 4100;
		int i_341_ = 888;
		aClass41_2.method269(-aClass6_1.method35(i_340_, true, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 57, 0);
		aClass41_2.method290(true);
		aClass46_Sub1_2.method343(i ^ ~0x4a678d54);
		aClass46_Sub1_2.method343(-1248297852);
		aClass46_Sub1_2.method321(0, 0, 6, 512, 0, 1);
		for (int i_342_ = 6; i_342_ >= 1; i_342_--)
		{
			aClass46_Sub1_2.method325(512, 0, i_342_, 0, true, i_342_, 8);
		}
		aClass46_Sub1_2.method321(194, 0, 20, 512, 0, 1);
		for (int i_343_ = 6; 1 <= i_343_; i_343_--)
		{
			aClass46_Sub1_2.method325(512, 0, i_343_, 0, true, 194 - i_343_, 8);
		}
		aClass46_Sub1_2.method338(anInt935 + 10, 15, 15, (byte) -70);
		aClass46_Sub1_2.method353(0, 200, 0, 512, anInt893, -95);
		aClass46_Sub1_2.method306(anInt893, 10);
		i_339_ = 1100;
		i_341_ = 888;
		i_338_ = 9216;
		i_340_ = 9216;
		aClass41_2.anInt437 = 4100;
		aClass41_2.anInt426 = 4000;
		aClass41_2.anInt465 = 1;
		aClass41_2.anInt464 = 4100;
		aClass41_2.method269(-aClass6_1.method35(i_340_, true, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 29, 0);
		aClass41_2.method290(true);
		aClass46_Sub1_2.method343(i ^ ~0x4a678d54);
		aClass46_Sub1_2.method343(-1248297852);
		aClass46_Sub1_2.method321(0, 0, 6, 512, 0, 1);
		for (int i_344_ = 6; 1 <= i_344_; i_344_--)
		{
			aClass46_Sub1_2.method325(512, 0, i_344_, 0, true, i_344_, 8);
		}
		aClass46_Sub1_2.method321(194, 0, 20, 512, 0, 1);
		for (int i_345_ = 6; i_345_ >= 1; i_345_--)
		{
			aClass46_Sub1_2.method325(512, 0, i_345_, 0, true, -i_345_ + 194, 8);
		}
		aClass46_Sub1_2.method338(anInt935 + 10, 15, 15, (byte) -70);
		aClass46_Sub1_2.method353(0, 200, 0, 512, anInt893 + 1, -70);
		aClass46_Sub1_2.method306(anInt893 + 1, 89);
		i_340_ = 10368;
		i_338_ = 11136;
		for (int i_346_ = 0; i_346_ < 64; i_346_++)
		{
			aClass41_2.method294((aClass6_1.aClass23ArrayArray2[0][i_346_]), 1);
			aClass41_2.method294((aClass6_1.aClass23ArrayArray1[1][i_346_]), 1);
			aClass41_2.method294((aClass6_1.aClass23ArrayArray2[1][i_346_]), 1);
			aClass41_2.method294((aClass6_1.aClass23ArrayArray1[2][i_346_]), i + -3630);
			aClass41_2.method294((aClass6_1.aClass23ArrayArray2[2][i_346_]), 1);
		}
		i_341_ = 376;
		i_339_ = 500;
		aClass41_2.anInt437 = 4100;
		aClass41_2.anInt465 = 1;
		aClass41_2.anInt464 = 4100;
		aClass41_2.anInt426 = 4000;
		aClass41_2.method269(-aClass6_1.method35(i_340_, true, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 33, 0);
		aClass41_2.method290(true);
		aClass46_Sub1_2.method343(-1248297852);
		aClass46_Sub1_2.method343(i + -1248301483);
		aClass46_Sub1_2.method321(0, 0, 6, 512, 0, 1);
		if (i == 3631)
		{
			for (int i_347_ = 6; 1 <= i_347_; i_347_--)
			{
				aClass46_Sub1_2.method325(512, 0, i_347_, 0, true, i_347_, 8);
			}
			aClass46_Sub1_2.method321(194, 0, 20, 512, 0, i ^ 0xe2e);
			for (int i_348_ = 6; 1 <= i_348_; i_348_--)
			{
				aClass46_Sub1_2.method325(512, 0, i_348_, 0, true, 194, 8);
			}
			aClass46_Sub1_2.method338(anInt935 + 10, 15, 15, (byte) -70);
			aClass46_Sub1_2.method353(0, 200, 0, 512, anInt935 + 10, -120);
			aClass46_Sub1_2.method306(anInt935 + 10, 59);
		}
	}

	private void method532(final byte i, final boolean bool)
	{
		anInt798++;
		int i_349_ = aClass46_Sub1_2.anInt502 - 199;
		aClass46_Sub1_2.method338(anInt935 - -5, 3, i_349_ + -49, (byte) -70);
		int i_350_ = 36;
		final int i_351_ = 196;
		final int i_352_ = 182;
		int i_354_;
		int i_353_ = i_354_ = Class34.method227(false, 160, 160, 160);
		if (anInt1042 == 0)
		{
			i_353_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_354_ = Class34.method227(false, 220, 220, 220);
		}
		aClass46_Sub1_2.method327(i_349_, i_350_, i_351_ / 2, 128, i + 172, i_353_, 24);
		if (i != -103)
		{
			anIntArray176 = null;
		}
		aClass46_Sub1_2.method327((i_351_ / 2) + i_349_, i_350_, i_351_ / 2, 128, 93, i_354_, 24);
		aClass46_Sub1_2.method327(i_349_, i_350_ + 24, i_351_, 128, i + 187, Class34.method227(false, 220, 220, 220),
		        i_352_ + -24);
		aClass46_Sub1_2.method341(i_351_, (byte) -120, i_350_ - -24, i_349_, 0);
		aClass46_Sub1_2.method319(0, 24, i_350_ - 0, true, (i_351_ / 2) + i_349_);
		aClass46_Sub1_2.method341(i_351_, (byte) -110, i_352_ + (i_350_ - 16), i_349_, 0);
		aClass46_Sub1_2.method335(0, 255, 4, "Friends", i_350_ + 16, i_349_ + (i_351_ / 4));
		aClass46_Sub1_2.method335(0, 255, 4, "Ignore", i_350_ - -16, (i_349_ + (i_351_ / 4)) - -(i_351_ / 2));
		aClass10_4.method75(0, anInt951);
		if (anInt1042 == 0)
		{
			for (int i_355_ = 0; i_355_ < Class16.anInt185; i_355_++)
			{
				String string;
				if ((0x2 & Class7.anIntArray18[i_355_]) == 0)
				{
					if ((0x4 & Class7.anIntArray18[i_355_]) == 0)
					{
						string = "@red@";
					}
					else
					{
						string = "@yel@";
					}
				}
				else
				{
					string = "@gre@";
				}
				String string_356_ = Class28.aStringArray24[i_355_];
				int i_357_ = 0;
				final int i_358_ = Class28.aStringArray24[i_355_].length();
				for (/**/; aClass46_Sub1_2.method328(string_356_, -123, 1) > 120; string_356_ = new StringBuilder()
				        .append(Class28.aStringArray24[i_355_].substring(0, -i_357_ + i_358_)).append("...").toString())
				{
					i_357_++;
				}
				aClass10_4.method68(null, anInt951, null, 0, i_355_, 0, new StringBuilder().append(string)
				        .append(string_356_).append("~439~@whi@Remove         WWWWWWWWWW").toString());
			}
		}
		if (anInt1042 == 1)
		{
			for (int i_359_ = 0; i_359_ < Class10.anInt129; i_359_++)
			{
				String string = Class46.aStringArray33[i_359_];
				int i_360_ = 0;
				final int i_361_ = Class46.aStringArray33[i_359_].length();
				for (/**/; aClass46_Sub1_2.method328(string, -117, 1) > 120; string = new StringBuilder()
				        .append(Class46.aStringArray33[i_359_].substring(0, -i_360_ + i_361_)).append("...").toString())
				{
					i_360_++;
				}
				aClass10_4.method68(null, anInt951, null, 0, i_359_, i + 103, new StringBuilder().append("@yel@")
				        .append(string).append("~439~@whi@Remove         WWWWWWWWWW").toString());
			}
		}
		aClass10_4.method71(-6);
		anInt997 = -1;
		anInt1016 = -1;
		if (anInt1042 == 0)
		{
			final int i_362_ = aClass10_4.method92(false, anInt951);
			if ((i_362_ >= 0) && (489 > this.anInt739))
			{
				if (this.anInt739 <= 429)
				{
					anInt1016 = i_362_;
				}
				else
				{
					anInt1016 = -(2 - -i_362_);
				}
			}
			aClass46_Sub1_2.method335(16777215, i + 358, 1, "Click a name to send a message", i_350_ - -35,
			        (i_351_ / 2) + i_349_);
			int i_363_;
			if ((i_349_ >= this.anInt739) || ((i_349_ + i_351_) <= this.anInt739)
			        || (this.anInt736 <= (i_352_ + i_350_ + -16)) || (this.anInt736 >= (i_350_ + i_352_)))
			{
				i_363_ = 16777215;
			}
			else
			{
				i_363_ = 16776960;
			}
			aClass46_Sub1_2.method335(i_363_, i ^ ~0x99, 1, "Click here to add a friend", i_352_ + i_350_ + -3,
			        (i_351_ / 2) + i_349_);
		}
		if (anInt1042 == 1)
		{
			final int i_364_ = aClass10_4.method92(false, anInt951);
			if ((i_364_ >= 0) && (489 > this.anInt739))
			{
				if (429 < this.anInt739)
				{
					anInt997 = -(i_364_ + 2);
				}
				else
				{
					anInt997 = i_364_;
				}
			}
			aClass46_Sub1_2.method335(16777215, 255, 1, "Blocking messages from:", i_350_ + 35, (i_351_ / 2) + i_349_);
			int i_365_;
			if ((i_349_ < this.anInt739) && ((i_349_ + i_351_) > this.anInt739)
			        && ((i_352_ + i_350_ + -16) < this.anInt736) && (this.anInt736 < (i_352_ + i_350_)))
			{
				i_365_ = 16776960;
			}
			else
			{
				i_365_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_365_, 255, 1, "Click here to add a name", i_352_ + i_350_ + -3,
			        i_349_ - -(i_351_ / 2));
		}
		if (bool)
		{
			i_349_ = (-aClass46_Sub1_2.anInt502 - (-199 - this.anInt739));
			i_350_ = this.anInt736 + -36;
			if ((0 <= i_349_) && (i_350_ >= 0) && (i_349_ < 196) && (182 > i_350_))
			{
				aClass10_4.method85(this.anInt737, i_350_ + 36, this.anInt738, (byte) -97,
				        (aClass46_Sub1_2.anInt502 + i_349_ + -199));
				if ((24 >= i_350_) && (anInt887 == 1))
				{
					if ((98 <= i_349_) || (anInt1042 != 1))
					{
						if ((i_349_ > 98) && (anInt1042 == 0))
						{
							anInt1042 = 1;
							aClass10_4.method101(anInt951, (byte) -117);
						}
					}
					else
					{
						anInt1042 = 0;
						aClass10_4.method101(anInt951, (byte) -117);
					}
				}
				if ((anInt887 == 1) && (anInt1042 == 0))
				{
					final int i_366_ = aClass10_4.method92(false, anInt951);
					if ((0 <= i_366_) && (489 > this.anInt739))
					{
						if (429 < this.anInt739)
						{
							method501(Class28.aStringArray24[i_366_], 109);
						}
						else if ((0x4 & Class7.anIntArray18[i_366_]) != 0)
						{
							anInt1059 = 2;
							aString29 = Class28.aStringArray24[i_366_];
							this.aString24 = "";
							this.aString25 = "";
						}
					}
				}
				if ((anInt887 == 1) && (anInt1042 == 1))
				{
					final int i_367_ = aClass10_4.method92(false, anInt951);
					if ((0 <= i_367_) && (489 > this.anInt739) && (429 < this.anInt739))
					{
						method494((byte) -83, Class41.aStringArray28[i_367_]);
					}
				}
				if ((i_350_ > 166) && (anInt887 == 1) && (anInt1042 == 0))
				{
					this.aString27 = "";
					anInt1059 = 1;
					this.aString26 = "";
				}
				if ((166 < i_350_) && (anInt887 == 1) && (anInt1042 == 1))
				{
					this.aString26 = "";
					this.aString27 = "";
					anInt1059 = 3;
				}
				anInt887 = 0;
			}
		}
	}

	@Override
	void method473(final boolean bool)
	{
		if (this.aBool37)
		{
			method599(-17269);
			this.aBool37 = false;
		}
		anInt780++;
		if (aBool52)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 16));
				graphics.setColor(Color.yellow);
				int i = 35;
				graphics.drawString("Sorry, an error has occured whilst loading RuneScape", 30, i);
				graphics.setColor(Color.white);
				i += 50;
				graphics.drawString("To fix this try the following (in order):", 30, i);
				graphics.setColor(Color.white);
				i += 50;
				graphics.setFont(new Font("Helvetica", 1, 12));
				graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, i);
				i += 30;
				graphics.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, i);
				i += 30;
				graphics.drawString("3: Try using a different game-world", 30, i);
				i += 30;
				graphics.drawString("4: Try rebooting your computer", 30, i);
				i += 30;
				graphics.drawString("5: Try selecting a different version of Java from the play-game menu", 30, i);
				method474(123, 1);
			}
		}
		else if (aBool50)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 20));
				graphics.setColor(Color.white);
				graphics.drawString("Error - unable to load game!", 50, 50);
				graphics.drawString("To play RuneScape make sure you play from", 50, 100);
				graphics.drawString("http://www.runescape.com", 50, 150);
				method474(123, 1);
			}
		}
		else if (aBool54)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 20));
				graphics.setColor(Color.white);
				graphics.drawString("Error - out of memory!", 50, 50);
				graphics.drawString("Close ALL unnecessary programs", 50, 100);
				graphics.drawString("and windows before loading the game", 50, 150);
				graphics.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
				method474(123, 1);
			}
		}
		else
		{
			try
			{
				if (aClass46_Sub1_2 != null)
				{
					if (anInt899 == 0)
					{
						aClass46_Sub1_2.aBool27 = false;
						method593((byte) 58);
					}
					if (anInt899 == 1)
					{
						aClass46_Sub1_2.aBool27 = true;
						method573(-121);
					}
				}
			}
			catch (final OutOfMemoryError outofmemoryerror)
			{
				aBool54 = true;
			}
		}
	}

	private void method533(final String string, final String string_368_, final boolean bool)
	{
		if (anInt1035 == 2)
		{
			if ((string_368_ == null) || (string_368_.length() < 1))
			{
				aClass10_5.method98(true, string, anInt1037);
			}
			else
			{
				aClass10_5.method98(true, string, anInt1005);
				aClass10_5.method98(!bool, string_368_, anInt1037);
			}
		}
		anInt832++;
		method593((byte) 44);
		if (bool)
		{
			aClass15Array5 = null;
		}
		method481(-110);
	}

	private void method534(final int i)
	{
		anInt870++;
		if (anInt887 != 0)
		{
			final int i_369_ = aClass29_1.method197(this.anInt739, this.anInt736, anInt984, anInt955, 0);
			if (i_369_ >= 0)
			{
				method569(i_369_, i ^ 0x4215);
			}
			anInt887 = 0;
			aBool61 = false;
		}
		else if (i == 16508)
		{
			final int i_370_ = aClass29_1.method207(true);
			final int i_371_ = aClass29_1.method210(0);
			if ((this.anInt739 < (anInt955 + -10)) || (this.anInt736 < (anInt984 + -10))
			        || (this.anInt739 > (i_370_ + anInt955 + 10)) || (((i_371_ - -10) + anInt984) < this.anInt736))
			{
				aBool61 = false;
			}
			else
			{
				aClass29_1.method204(anInt955, anInt984, (byte) -41, this.anInt739, this.anInt736);
			}
		}
	}

	private void method535(final int i)
	{
		anInt811++;
		if ((this.aString26.length() <= 0) && !aBool60)
		{
			if ((anInt971 >= 1) && (anInt971 <= 8))
			{
				String string = "";
				for (int i_372_ = 0; this.aString27.length() > i_372_; i_372_++)
				{
					final char c = this.aString27.charAt(i_372_);
					if (Character.isDigit(c))
					{
						string = new StringBuilder().append(string).append(c).toString();
					}
				}
				this.aString27 = string;
			}
		}
		else
		{
			final String string = this.aString26.trim();
			this.aString27 = "";
			this.aString26 = "";
			do
			{
				if (anInt971 == 1)
				{
					try
					{
						method503(Integer.parseInt(string), anInt980, 2);
						break;
					}
					catch (final NumberFormatException numberformatexception)
					{
						break;
					}
				}
				if (anInt971 != 2)
				{
					if (anInt971 != 3)
					{
						if (anInt971 != 4)
						{
							if (anInt971 == 5)
							{
								try
								{
									final int i_373_ = anIntArray179[anInt972];
									if (i_373_ != -1)
									{
										final int i_374_ = Integer.parseInt(string);
										aClass16_Sub1_1.method118(236, 101);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_373_, (byte) 66);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray219[anInt972],
										        (byte) 92);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_374_, (byte) 81);
										aClass16_Sub1_1.method126(2);
									}
									break;
								}
								catch (final NumberFormatException numberformatexception)
								{
									break;
								}
							}
							if (anInt971 != 6)
							{
								if (anInt971 == 7)
								{
									try
									{
										method524(0, anInt1011, Integer.parseInt(string));
										break;
									}
									catch (final NumberFormatException numberformatexception)
									{
										break;
									}
								}
								if (anInt971 != 8)
								{
									if (anInt971 == 9)
									{
										aClass16_Sub1_1.method118(84, 83);
										aClass16_Sub1_1.method126(2);
									}
								}
								else
								{
									try
									{
										method538(-20, Integer.parseInt(string), anInt1011);
									}
									catch (final NumberFormatException numberformatexception)
									{
										/* empty */
									}
								}
							}
							else
							{
								try
								{
									final int i_375_ = anIntArray179[anInt972];
									if (i_375_ != -1)
									{
										final int i_376_ = Integer.parseInt(string);
										aClass16_Sub1_1.method118(221, 108);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray179[anInt972],
										        (byte) 123);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray219[anInt972],
										        (byte) 79);
										aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_376_, (byte) 88);
										aClass16_Sub1_1.method126(2);
									}
								}
								catch (final NumberFormatException numberformatexception)
								{
									/* empty */
								}
							}
						}
						else
						{
							try
							{
								int i_377_;
								if (anInt983 < 0)
								{
									i_377_ = -1;
								}
								else
								{
									i_377_ = anIntArray210[anInt983];
								}
								final int i_378_ = Integer.parseInt(string);
								aClass16_Sub1_1.method118(23, 107);
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_377_, (byte) 63);
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(i_378_, true);
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
								aClass16_Sub1_1.method126(2);
							}
							catch (final NumberFormatException numberformatexception)
							{
								/* empty */
							}
						}
					}
					else
					{
						try
						{
							int i_379_;
							if (0 <= anInt983)
							{
								i_379_ = anIntArray210[anInt983];
							}
							else
							{
								i_379_ = -1;
							}
							final int i_380_ = Integer.parseInt(string);
							aClass16_Sub1_1.method118(22, 87);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_379_, (byte) 123);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(i_380_, true);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
							aClass16_Sub1_1.method126(2);
						}
						catch (final NumberFormatException numberformatexception)
						{
							/* empty */
						}
					}
				}
				else
				{
					try
					{
						method523(Integer.parseInt(string), anInt980, 348);
					}
					catch (final NumberFormatException numberformatexception)
					{
						/* empty */
					}
				}
			}
			while (false);
			anInt971 = 0;
			return;
		}
		final int i_381_ = -(anInt985 / 2) + 256;
		final int i_382_ = 180 - (anInt1060 / 2);
		aClass46_Sub1_2.method321(i_382_, 0, anInt1060, anInt985, i_381_, 1);
		aClass46_Sub1_2.method362(anInt1060, i_381_, (byte) -76, anInt985, 16777215, i_382_);
		final int i_383_ = aClass46_Sub1_2.method315((byte) 101, 1);
		final int i_384_ = aClass46_Sub1_2.method315((byte) 112, 4);
		final int i_385_ = i_383_ + 2;
		int i_386_ = 118 / ((i - 1) / 58);
		for (int i_387_ = 0; i_387_ < aStringArray49.length; i_387_++)
		{
			aClass46_Sub1_2.method335(16776960, 255, 1, aStringArray49[i_387_],
			        i_382_ - ((-5 - i_383_) + -(i_385_ * i_387_)), 256);
		}
		if (aBool62)
		{
			aClass46_Sub1_2.method335(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(),
			        (((i_382_ + (aStringArray49.length * i_385_) + 5) - -3) + i_384_), 256);
		}
		i_386_ = 16777215;
		final int i_388_ = (((aStringArray49.length * i_385_) + i_383_ + (i_382_ - -5) + 2) - (-i_384_ + -3));
		if ((this.anInt739 > 230) && (this.anInt739 < 248) && ((i_388_ - i_383_) < this.anInt736)
		        && (this.anInt736 < i_388_))
		{
			if (anInt887 != 0)
			{
				this.aString26 = this.aString27;
				aBool60 = true;
				anInt887 = 0;
			}
			i_386_ = 16776960;
		}
		aClass46_Sub1_2.method324("OK", 0, 1, i_386_, 230, i_388_);
		i_386_ = 16777215;
		if ((264 < this.anInt739) && (304 > this.anInt739) && (this.anInt736 > (i_388_ - i_383_))
		        && (this.anInt736 < i_388_))
		{
			i_386_ = 16776960;
			if (anInt887 != 0)
			{
				anInt971 = 0;
				anInt887 = 0;
			}
		}
		aClass46_Sub1_2.method324("Cancel", 0, 1, i_386_, 264, i_388_);
		if ((anInt887 == 1) && ((this.anInt739 < i_381_) || ((i_381_ + anInt985) < this.anInt739)
		        || (this.anInt736 < i_382_) || ((i_382_ + anInt1060) < this.anInt736)))
		{
			anInt887 = 0;
			anInt971 = 0;
		}
	}

	private boolean method536(final byte i)
	{
		anInt818++;
		return true;
	}

	private void method537(final boolean bool)
	{
		aClass10_7 = new Class10(aClass46_Sub1_2, 50);
		anInt822++;
		int i = 40;
		aClass10_7.method72(255, i + 200, bool, 4, 256, "Welcome to RuneScape Classic");
		String string = null;
		if (!aBool55)
		{
			if (aBool56)
			{
				string = "You need a veteran Classic account to use this server";
			}
		}
		else if (!aBool56)
		{
			string = "You need a members account to use this server";
		}
		else
		{
			string = "You need a veteran Classic members account to use this server";
		}
		if (string != null)
		{
			aClass10_7.method72(255, 215 - -i, true, 4, 256, string);
		}
		aClass10_7.method78(-126, 35, 200, 250 - -i, 256);
		aClass10_7.method72(255, i + 250, false, 5, 256, "Click here to login");
		anInt1040 = aClass10_7.method65(i + 250, 35, (byte) 126, 256, 200);
		aClass10_5 = new Class10(aClass46_Sub1_2, 50);
		i = 230;
		anInt1005 = aClass10_5.method72(255, i - 30, true, 4, 256, "");
		anInt1037 = aClass10_5.method72(255, i + -10, true, 4, 256, "Please enter your username and password");
		i += 28;
		aClass10_5.method78(-127, 40, 200, i, 140);
		aClass10_5.method72(255, i + -10, false, 4, 140, "Username:");
		anInt1002 = aClass10_5.method96(140, -98, 4, 320, 40, false, i + 10, false, 200);
		i += 47;
		aClass10_5.method78(-125, 40, 200, i, 190);
		aClass10_5.method72(255, i + -10, false, 4, 190, "Password:");
		anInt942 = aClass10_5.method96(190, -27, 4, 20, 40, false, i + 10, true, 200);
		i -= 55;
		aClass10_5.method78(-125, 25, 120, i, 410);
		aClass10_5.method72(255, i, false, 4, 410, "Ok");
		anInt1008 = aClass10_5.method65(i, 25, (byte) 109, 410, 120);
		i += 30;
		aClass10_5.method78(-127, 25, 120, i, 410);
		aClass10_5.method72(255, i, false, 4, 410, "Cancel");
		anInt1033 = aClass10_5.method65(i, 25, (byte) 106, 410, 120);
		i += 30;
		aClass10_5.method91((byte) 94, anInt1002);
	}

	private void method538(final int i, final int i_389_, final int i_390_)
	{
		anInt831++;
		final int i_391_ = anIntArray182[i_390_];
		final int i_392_ = 0 > i_389_ ? anInt1036 : i_389_;
		if (Class1.anIntArray1[i_391_] == 0)
		{
			anIntArray198[i_390_] -= i_392_;
			if (0 >= anIntArray198[i_390_])
			{
				anInt1061--;
				for (int i_393_ = i_390_; anInt1061 > i_393_; i_393_++)
				{
					anIntArray182[i_393_] = anIntArray182[i_393_ - -1];
					anIntArray198[i_393_] = anIntArray198[i_393_ + 1];
				}
			}
		}
		else
		{
			int i_394_ = 0;
			for (int i_395_ = 0; (anInt1061 > i_395_) && (i_392_ > i_394_); i_395_++)
			{
				if (i_391_ == anIntArray182[i_395_])
				{
					i_394_++;
					anInt1061--;
					for (int i_396_ = i_395_; i_396_ < anInt1061; i_396_++)
					{
						anIntArray182[i_396_] = anIntArray182[i_396_ + 1];
						anIntArray198[i_396_] = anIntArray198[i_396_ - -1];
					}
					i_395_--;
				}
			}
		}
		aClass16_Sub1_1.method118(33, 66);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1061);
		for (int i_398_ = 0; anInt1061 > i_398_; i_398_++)
		{
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray182[i_398_], (byte) 118);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(anIntArray198[i_398_], true);
		}
		aClass16_Sub1_1.method126(2);
		aBool75 = false;
		aBool59 = false;
	}

	private void method539(final int i, final int i_399_, final String string)
	{
		anInt889++;
		final int i_400_ = anIntArray191[i];
		final int i_401_ = anIntArray170[i];
		final int i_402_ = i_400_ + -(aClass15_1.anInt166 / 128);
		final int i_403_ = i_401_ + -(aClass15_1.anInt159 / 128);
		final int i_404_ = 7;
		if ((0 <= i_400_) && (0 <= i_401_) && (96 > i_400_) && (i_401_ < 96) && (-i_404_ < i_402_) && (i_404_ > i_402_)
		        && (-i_404_ < i_403_) && (i_404_ > i_403_))
		{
			aClass41_2.method294(aClass23Array4[i], 1);
			final int i_405_ = AClass1_Sub1.method422(string, -93);
			final Class23 class23 = aClass23Array6[i_405_].method166(112);
			aClass41_2.method267(class23, (byte) 47);
			class23.method151(-50, 48, 256, 48, true, -10, -50);
			class23.method159(-128, aClass23Array4[i]);
			class23.anInt288 = i;
			aClass23Array4[i] = class23;
		}
	}

	private void method540(final byte i)
	{
		anInt781++;
		if (i != 46)
		{
			anIntArray189 = null;
		}
		anInt970 = 0;
		method513(0, "Sorry, you can't logout at the moment", 0, null, -108, "@cya@", null, false);
	}

	private boolean method541(final int i, final int i_406_)
	{
		anInt767++;
		final int i_408_ = aClass15_1.anInt166 / 128;
		final int i_409_ = aClass15_1.anInt159 / 128;
		for (int i_410_ = 2; i_410_ >= 1; i_410_--)
		{
			if ((i == 1) && ((((aClass6_1.anIntArrayArray4[i_408_][-i_410_ + i_409_]) & 0x80) == 128)
			        || (((aClass6_1.anIntArrayArray4[i_408_ - i_410_][i_409_]) & 0x80) == 128)
			        || (((aClass6_1.anIntArrayArray4[-i_410_ + i_408_][i_409_ - i_410_]) & 0x80) == 128)))
			{
				return false;
			}
			if ((i == 3) && (((0x80 & (aClass6_1.anIntArrayArray4[i_408_][i_409_ + i_410_])) == 128)
			        || (((aClass6_1.anIntArrayArray4[-i_410_ + i_408_][i_409_]) & 0x80) == 128)
			        || (((aClass6_1.anIntArrayArray4[i_408_ - i_410_][i_409_ + i_410_]) & 0x80) == 128)))
			{
				return false;
			}
			if ((i == 5) && ((((aClass6_1.anIntArrayArray4[i_408_][i_409_ - -i_410_]) & 0x80) == 128)
			        || ((0x80 & (aClass6_1.anIntArrayArray4[i_410_ + i_408_][i_409_])) == 128)
			        || ((0x80 & (aClass6_1.anIntArrayArray4[i_408_ + i_410_][i_409_ + i_410_])) == 128)))
			{
				return false;
			}
			if ((i == 7) && ((((aClass6_1.anIntArrayArray4[i_408_][-i_410_ + i_409_]) & 0x80) == 128)
			        || (((aClass6_1.anIntArrayArray4[i_410_ + i_408_][i_409_]) & 0x80) == 128)
			        || ((0x80 & (aClass6_1.anIntArrayArray4[i_410_ + i_408_][-i_410_ + i_409_])) == 128)))
			{
				return false;
			}
			if ((i == 0) && ((0x80 & (aClass6_1.anIntArrayArray4[i_408_][-i_410_ + i_409_])) == 128))
			{
				return false;
			}
			if ((i == 2) && (((aClass6_1.anIntArrayArray4[-i_410_ + i_408_][i_409_]) & 0x80) == 128))
			{
				return false;
			}
			if ((i == 4) && (((aClass6_1.anIntArrayArray4[i_408_][i_410_ + i_409_]) & 0x80) == 128))
			{
				return false;
			}
			if ((i == 6) && (((aClass6_1.anIntArrayArray4[i_410_ + i_408_][i_409_]) & 0x80) == 128))
			{
				return false;
			}
		}
		return true;
	}

	private void method542(final String string, final int i, final String string_411_)
	{
		anInt826++;
		aClass16_Sub1_1.method118(i, 67);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, string_411_);
		Class39.method255((aClass16_Sub1_1.aClass27_Sub1_Sub1_1), false, string);
		aClass16_Sub1_1.method126(2);
	}

	private void method543(final boolean bool)
	{
		anInt833++;
		final int i = 22;
		final int i_412_ = 36;
		aClass46_Sub1_2.method321(i_412_, 192, 16, 468, i, 1);
		final int i_413_ = 10000536;
		aClass46_Sub1_2.method327(i, i_412_ - -16, 468, 160, 71, i_413_, 246);
		aClass46_Sub1_2.method335(16777215, 255, 1,
		        new StringBuilder().append("Please confirm your trade with @yel@").append(aString31).toString(),
		        i_412_ + 12, i + 234);
		aClass46_Sub1_2.method335(16776960, 255, 1, "You are about to give:", i_412_ + 30, i + 117);
		for (int i_414_ = 0; i_414_ < anInt1038; i_414_++)
		{
			String string = Class26.aStringArray19[anIntArray172[i_414_]];
			if (Class1.anIntArray1[anIntArray172[i_414_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Class10.method79(1, anIntArray160[i_414_])).toString();
			}
			aClass46_Sub1_2.method335(16777215, 255, 1, string, (i_412_ + 42) - -(i_414_ * 12), i + 117);
		}
		if (anInt1038 == 0)
		{
			aClass46_Sub1_2.method335(16777215, 255, 1, "Nothing!", i_412_ + 42, i + 117);
		}
		aClass46_Sub1_2.method335(16776960, 255, 1, "In return you will receive:", i_412_ + 30, i + 351);
		for (int i_415_ = 0; anInt998 > i_415_; i_415_++)
		{
			String string = Class26.aStringArray19[anIntArray159[i_415_]];
			if (Class1.anIntArray1[anIntArray159[i_415_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Class10.method79(1, anIntArray220[i_415_])).toString();
			}
			aClass46_Sub1_2.method335(16777215, 255, 1, string, i_412_ - (-42 - (i_415_ * 12)), i + 351);
		}
		if (anInt998 == 0)
		{
			aClass46_Sub1_2.method335(16777215, 255, 1, "Nothing!", i_412_ + 42, i + 351);
		}
		aClass46_Sub1_2.method335(65535, 255, 4, "Are you sure you want to do this?", i_412_ + 200, i - -234);
		aClass46_Sub1_2.method335(16777215, 255, 1, "There is NO WAY to reverse a trade if you change your mind.",
		        i_412_ - -215, i - -234);
		aClass46_Sub1_2.method335(16777215, 255, 1, "Remember that not all players are trustworthy", i_412_ - -230,
		        i - -234);
		if (aBool63)
		{
			aClass46_Sub1_2.method335(16776960, 255, 1, "Waiting for other player...", i_412_ - -250, i + 234);
		}
		else
		{
			aClass46_Sub1_2.method338(anInt935 + 25, i_412_ + 238, i + 118 + -35, (byte) -70);
			aClass46_Sub1_2.method338(anInt935 + 26, i_412_ + 238, (i - 35) + 352, (byte) -70);
		}
		if (anInt887 == 1)
		{
			if ((this.anInt739 < i) || (i_412_ > this.anInt736) || ((i + 468) < this.anInt739)
			        || ((i_412_ + 262) < this.anInt736))
			{
				aBool89 = false;
				aClass16_Sub1_1.method118(230, 62);
				aClass16_Sub1_1.method126(2);
			}
			if (((i + 83) <= this.anInt739) && (this.anInt739 <= (i - -118 - -70)) && ((i_412_ + 238) <= this.anInt736)
			        && ((i_412_ + 21 + 238) >= this.anInt736))
			{
				aBool63 = true;
				aClass16_Sub1_1.method118(104, 107);
				aClass16_Sub1_1.method126(2);
			}
			if (((i + -35 + 352) <= this.anInt739) && (((i - -70) + 353) >= this.anInt739)
			        && (this.anInt736 >= (i_412_ + 238)) && (this.anInt736 <= ((i_412_ + 21) - -238)))
			{
				aBool89 = false;
				aClass16_Sub1_1.method118(230, 118);
				aClass16_Sub1_1.method126(2);
			}
			anInt887 = 0;
		}
	}

	private void method544(final boolean bool, final byte i)
	{
		if (i != 72)
		{
			method538(-39, -41, -43);
		}
		anInt871++;
		if (bool && (aClass16_Sub1_1 != null))
		{
			try
			{
				aClass16_Sub1_1.method118(31, 91);
				aClass16_Sub1_1.method120(119);
			}
			catch (final IOException ioexception)
			{
				/* empty */
			}
		}
		aString34 = "";
		aString39 = "";
		method529(i ^ ~0x2a);
	}

	private void method545(final int i, final int i_416_, final int i_417_, final int i_418_, final boolean bool,
	        final byte i_419_)
	{
		anInt817++;
		if (!method557(i, i_418_, i_418_, i_417_, i_419_ + 229, bool, i_416_, false, i_417_))
		{
			method552(i_417_, bool, i_418_, i, i_418_, i_417_, i_416_, true, true);
			if (i_419_ != -110)
			{
				method471(-2);
			}
		}
	}

	private void method546(final byte i)
	{
		anInt872++;
		if ((anInt887 != 0) && (anInt971 == 0))
		{
			anInt887 = 0;
			final int i_420_ = this.anInt739 + -52;
			final int i_421_ = this.anInt736 - 44;
			if ((0 > i_420_) || (12 > i_421_) || (i_420_ >= 408) || (i_421_ >= 246))
			{
				aClass16_Sub1_1.method118(166, 112);
				aClass16_Sub1_1.method126(2);
				aBool57 = false;
				return;
			}
			int i_422_ = 0;
			for (int i_423_ = 0; 5 > i_423_; i_423_++)
			{
				for (int i_424_ = 0; 8 > i_424_; i_424_++)
				{
					final int i_425_ = 7 - -(i_424_ * 49);
					final int i_426_ = (i_423_ * 34) + 28;
					if ((i_420_ > i_425_) && (i_420_ < (i_425_ + 49)) && (i_426_ < i_421_) && (i_421_ < (i_426_ + 34))
					        && (anIntArray179[i_422_] != -1))
					{
						anInt972 = i_422_;
						anInt1006 = anIntArray179[i_422_];
					}
					i_422_++;
				}
			}
			if (0 <= anInt972)
			{
				final int i_427_ = anIntArray179[anInt972];
				if (i_427_ != -1)
				{
					final int i_428_ = anIntArray219[anInt972];
					if ((i_428_ > 0) && (204 <= i_421_) && (i_421_ <= 215))
					{
						int i_429_ = 0;
						if ((318 < i_420_) && (i_420_ < 330))
						{
							i_429_ = 1;
						}
						if ((5 <= i_428_) && (i_420_ > 333) && (i_420_ < 345))
						{
							i_429_ = 5;
						}
						if ((i_428_ >= 10) && (i_420_ > 348) && (i_420_ < 365))
						{
							i_429_ = 10;
						}
						if ((388 < i_420_) && (400 > i_420_))
						{
							method516(Class44.aStringArray30, 5, 70, true);
						}
						if ((50 <= i_428_) && (368 < i_420_) && (385 > i_420_))
						{
							i_429_ = 50;
						}
						if (i_429_ > 0)
						{
							aClass16_Sub1_1.method118(236, 120);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray179[anInt972], (byte) 97);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_428_, (byte) 70);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_429_, (byte) 71);
							aClass16_Sub1_1.method126(2);
						}
					}
					final int i_430_ = method584(i_427_, false);
					if ((0 < i_430_) && (229 <= i_421_) && (i_421_ <= 240))
					{
						int i_431_ = 0;
						if ((318 < i_420_) && (i_420_ < 330))
						{
							i_431_ = 1;
						}
						if ((i_430_ >= 5) && (i_420_ > 333) && (i_420_ < 345))
						{
							i_431_ = 5;
						}
						if ((i_430_ >= 10) && (348 < i_420_) && (i_420_ < 365))
						{
							i_431_ = 10;
						}
						if ((388 < i_420_) && (400 > i_420_))
						{
							method516(Class4.aStringArray5, 6, 83, true);
						}
						if ((i_430_ >= 50) && (i_420_ > 368) && (i_420_ < 385))
						{
							i_431_ = 50;
						}
						if (0 < i_431_)
						{
							aClass16_Sub1_1.method118(221, 77);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anIntArray179[anInt972], (byte) 112);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_428_, (byte) 121);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_431_, (byte) 63);
							aClass16_Sub1_1.method126(2);
						}
					}
				}
			}
		}
		final int i_432_ = 52;
		final int i_433_ = 44;
		aClass46_Sub1_2.method321(i_433_, 192, 12, 408, i_432_, 1);
		final int i_434_ = 10000536;
		aClass46_Sub1_2.method327(i_432_, i_433_ - -12, 408, 160, 86, i_434_, 17);
		aClass46_Sub1_2.method327(i_432_, i_433_ - -29, 8, 160, 111, i_434_, 170);
		aClass46_Sub1_2.method327(i_432_ - -399, i_433_ + 29, 9, 160, 80, i_434_, 170);
		aClass46_Sub1_2.method327(i_432_, i_433_ - -199, 408, 160, 75, i_434_, 47);
		aClass46_Sub1_2.method324("Buying and selling items", 0, 1, 16777215, i_432_ + 1, i_433_ - -10);
		int i_435_ = 16777215;
		if ((this.anInt739 > (i_432_ + 320)) && (i_433_ <= this.anInt736) && ((i_432_ + 408) > this.anInt739)
		        && (this.anInt736 < (i_433_ + 12)))
		{
			i_435_ = 16711680;
		}
		aClass46_Sub1_2.method313(i_435_, i_432_ + 406, 1, (byte) 114, i_433_ - -10, "Close window");
		aClass46_Sub1_2.method324("Shops stock in green", 0, 1, 65280, i_432_ + 2, i_433_ + 24);
		aClass46_Sub1_2.method324("Number you own in blue", 0, 1, 65535, i_432_ - -135, i_433_ + 24);
		aClass46_Sub1_2.method324(
		        new StringBuilder().append("Your money: ").append(method584(10, false)).append("gp").toString(), 0, 1,
		        16776960, i_432_ + 280, i_433_ + 24);
		final int i_436_ = 13684944;
		int i_437_ = 0;
		for (int i_438_ = 0; i_438_ < 5; i_438_++)
		{
			for (int i_439_ = 0; i_439_ < 8; i_439_++)
			{
				final int i_440_ = (i_432_ + 7) - -(i_439_ * 49);
				final int i_441_ = (i_438_ * 34) + i_433_ + 28;
				if (i_437_ == anInt972)
				{
					aClass46_Sub1_2.method327(i_440_, i_441_, 49, 160, 84, 16711680, 34);
				}
				else
				{
					aClass46_Sub1_2.method327(i_440_, i_441_, 49, 160, 69, i_436_, 34);
				}
				aClass46_Sub1_2.method362(35, i_440_, (byte) -114, 50, 0, i_441_);
				if (anIntArray179[i_437_] != -1)
				{
					aClass46_Sub1_2.method348(false, 0, -73, 32, i_441_, 48, 0,
					        (anInt863 - -(AClass1_Sub1.anIntArray144[anIntArray179[i_437_]])),
					        (Class46.anIntArray133[anIntArray179[i_437_]]), i_440_);
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray219[i_437_]).toString(),
					        0, 1, 65280, i_440_ + 1, i_441_ - -10);
					aClass46_Sub1_2.method313(65535, i_440_ - -47, 1, (byte) -94, i_441_ - -10, new StringBuilder()
					        .append("").append(method584((anIntArray179[i_437_]), false)).toString());
				}
				i_437_++;
			}
		}
		aClass46_Sub1_2.method341(398, (byte) -63, i_433_ - -222, i_432_ + 5, 0);
		if (anInt972 == -1)
		{
			aClass46_Sub1_2.method335(16776960, 255, 3, "Select an object to buy or sell", i_433_ - -214, i_432_ + 204);
		}
		else
		{
			final int i_442_ = anIntArray179[anInt972];
			if (i_442_ != -1)
			{
				final int i_443_ = anIntArray219[anInt972];
				if (i_443_ > 0)
				{
					final int i_444_ = Class35.method228(anInt1024, Class15.anIntArray40[i_442_], 1, true, i_443_,
					        anInt959, anIntArray174[anInt972], 123);
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[i_442_]).append(": buy for ")
					                .append(i_444_).append("gp each").toString(),
					        0, 1, 16776960, i_432_ + 2, i_433_ + 214);
					final boolean bool = ((this.anInt736 >= (i_433_ + 204)) && ((i_433_ + 215) >= this.anInt736));
					i_435_ = 16777215;
					aClass46_Sub1_2.method324("Buy:", 0, 3, 16777215, i_432_ + 285, i_433_ + 214);
					if (bool && (this.anInt739 > (i_432_ + 318)) && (this.anInt739 < (i_432_ + 330)))
					{
						i_435_ = 16711680;
					}
					aClass46_Sub1_2.method324("1", 0, 3, i_435_, i_432_ - -320, i_433_ + 214);
					if (5 <= i_443_)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 333) < this.anInt739) && (this.anInt739 < (i_432_ + 345)))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("5", 0, 3, i_435_, i_432_ + 335, i_433_ + 214);
					}
					if (i_443_ >= 10)
					{
						i_435_ = 16777215;
						if (bool && (this.anInt739 > (i_432_ + 348)) && (this.anInt739 < (i_432_ + 365)))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("10", 0, 3, i_435_, i_432_ + 350, i_433_ - -214);
					}
					if (i_443_ >= 50)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 368) < this.anInt739) && (this.anInt739 < (i_432_ - -385)))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("50", 0, 3, i_435_, i_432_ + 370, i_433_ + 214);
					}
					i_435_ = 16777215;
					if (bool && ((i_432_ - -388) < this.anInt739) && ((i_432_ + 400) > this.anInt739))
					{
						i_435_ = 16711680;
					}
					aClass46_Sub1_2.method324("X", 0, 3, i_435_, i_432_ - -390, i_433_ - -214);
				}
				else
				{
					aClass46_Sub1_2.method335(16776960, 255, 3, "This item is not currently available to buy",
					        i_433_ + 214, i_432_ + 204);
				}
				final int i_445_ = method584(i_442_, false);
				if (i_445_ <= 0)
				{
					aClass46_Sub1_2.method335(16776960, 255, 3, "You do not have any of this item to sell",
					        i_433_ + 239, i_432_ + 204);
				}
				else
				{
					final int i_446_ = Class35.method228(anInt1013, Class15.anIntArray40[i_442_], 1, false, i_443_,
					        anInt959, anIntArray174[anInt972], 112);
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[i_442_]).append(": sell for ")
					                .append(i_446_).append("gp each").toString(),
					        0, 1, 16776960, i_432_ + 2, i_433_ + 239);
					final boolean bool = ((this.anInt736 >= (i_433_ - -229)) && (this.anInt736 <= (i_433_ - -240)));
					aClass46_Sub1_2.method324("Sell:", 0, 3, 16777215, i_432_ + 285, i_433_ + 239);
					i_435_ = 16777215;
					if (bool && (this.anInt739 > (i_432_ + 318)) && (this.anInt739 < (i_432_ + 330)))
					{
						i_435_ = 16711680;
					}
					aClass46_Sub1_2.method324("1", 0, 3, i_435_, i_432_ + 320, i_433_ + 239);
					if (5 <= i_445_)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 333) < this.anInt739) && ((i_432_ + 345) > this.anInt739))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("5", 0, 3, i_435_, i_432_ + 335, i_433_ + 239);
					}
					if (10 <= i_445_)
					{
						i_435_ = 16777215;
						if (bool && (this.anInt739 > (i_432_ + 348)) && ((i_432_ + 365) > this.anInt739))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("10", 0, 3, i_435_, i_432_ + 350, i_433_ + 239);
					}
					if (i_445_ >= 50)
					{
						i_435_ = 16777215;
						if (bool && (this.anInt739 > (i_432_ + 368)) && ((i_432_ + 385) > this.anInt739))
						{
							i_435_ = 16711680;
						}
						aClass46_Sub1_2.method324("50", 0, 3, i_435_, i_432_ - -370, i_433_ + 239);
					}
					i_435_ = 16777215;
					if (bool && (this.anInt739 > (i_432_ + 388)) && (this.anInt739 < (i_432_ - -400)))
					{
						i_435_ = 16711680;
					}
					aClass46_Sub1_2.method324("X", 0, 3, i_435_, i_432_ + 390, i_433_ + 239);
				}
			}
		}
	}

	private void method547(final byte i, final int i_447_, final int i_448_)
	{
		anInt805++;
		if (i_447_ == 191)
		{
			anInt859 = anInt932;
			for (int i_449_ = 0; i_449_ < anInt859; i_449_++)
			{
				aClass15Array1[i_449_] = aClass15Array3[i_449_];
			}
			aClass27_Sub1_Sub1_2.method454(-1192);
			anInt1030 = aClass27_Sub1_Sub1_2.method456(116, 11);
			anInt1001 = aClass27_Sub1_Sub1_2.method456(-117, 13);
			int i_450_ = aClass27_Sub1_Sub1_2.method456(-69, 4);
			final boolean bool = method580(684, anInt1030, anInt1001);
			anInt1001 -= anInt927;
			anInt1030 -= anInt867;
			int i_451_ = (anInt1030 * anInt856) + 64;
			int i_452_ = (anInt856 * anInt1001) - -64;
			if (bool)
			{
				aClass15_1.anInt166 = aClass15_1.anIntArray38[0] = i_451_;
				aClass15_1.anInt149 = 0;
				aClass15_1.anInt147 = 0;
				aClass15_1.anInt159 = aClass15_1.anIntArray39[0] = i_452_;
			}
			anInt932 = 0;
			aClass15_1 = method548(i_452_, false, i_451_, anInt1010, i_450_);
			final int i_453_ = aClass27_Sub1_Sub1_2.method456(i ^ ~0x5f, 8);
			for (int i_454_ = 0; i_453_ > i_454_; i_454_++)
			{
				final Class15 class15 = aClass15Array1[i_454_ + 1];
				final int i_455_ = aClass27_Sub1_Sub1_2.method456(-90, 1);
				if (i_455_ != 0)
				{
					final int i_456_ = aClass27_Sub1_Sub1_2.method456(108, 1);
					if (i_456_ == 0)
					{
						final int i_457_ = aClass27_Sub1_Sub1_2.method456(-108, 3);
						int i_458_ = class15.anInt149;
						int i_459_ = class15.anIntArray38[i_458_];
						int i_460_ = class15.anIntArray39[i_458_];
						if ((i_457_ == 2) || (i_457_ == 1) || (i_457_ == 3))
						{
							i_459_ += anInt856;
						}
						if ((i_457_ == 6) || (i_457_ == 5) || (i_457_ == 7))
						{
							i_459_ -= anInt856;
						}
						if ((i_457_ == 4) || (i_457_ == 3) || (i_457_ == 5))
						{
							i_460_ += anInt856;
						}
						if ((i_457_ == 0) || (i_457_ == 1) || (i_457_ == 7))
						{
							i_460_ -= anInt856;
						}
						class15.anInt149 = i_458_ = (i_458_ - -1) % 10;
						class15.anInt167 = i_457_;
						class15.anIntArray38[i_458_] = i_459_;
						class15.anIntArray39[i_458_] = i_460_;
					}
					else
					{
						final int i_461_ = aClass27_Sub1_Sub1_2.method456(113, 2);
						if (i_461_ == 3)
						{
							continue;
						}
						class15.anInt167 = aClass27_Sub1_Sub1_2.method456(85, 2) + (i_461_ << 2);
					}
				}
				aClass15Array3[anInt932++] = class15;
			}
			while ((24 + aClass27_Sub1_Sub1_2.method457(32253)) < (i_448_ * 8))
			{
				final int i_462_ = aClass27_Sub1_Sub1_2.method456(i + 106, 11);
				int i_463_ = aClass27_Sub1_Sub1_2.method456(i + 144, 5);
				if (i_463_ > 15)
				{
					i_463_ -= 32;
				}
				int i_464_ = aClass27_Sub1_Sub1_2.method456(-91, 5);
				i_450_ = aClass27_Sub1_Sub1_2.method456(83, 4);
				if (15 < i_464_)
				{
					i_464_ -= 32;
				}
				i_452_ = ((i_464_ + anInt1001) * anInt856) + 64;
				i_451_ = ((i_463_ + anInt1030) * anInt856) + 64;
				method548(i_452_, false, i_451_, i_462_, i_450_);
			}
			aClass27_Sub1_Sub1_2.method458((byte) 78);
		}
		else if (i_447_ == 99)
		{
			while (aClass27_Sub1_Sub1_2.anInt608 < i_448_)
			{
				if (aClass27_Sub1_Sub1_2.method403(false) != 255)
				{
					aClass27_Sub1_Sub1_2.anInt608--;
					int i_465_ = aClass27_Sub1_Sub1_2.method392(false);
					final int i_466_ = anInt1030 - -aClass27_Sub1_Sub1_2.method406(-1);
					final int i_467_ = (anInt1001 - -aClass27_Sub1_Sub1_2.method406(i ^ 0x21));
					if ((0x8000 & i_465_) == 0)
					{
						anIntArray192[anInt1062] = i_466_;
						anIntArray199[anInt1062] = i_467_;
						anIntArray201[anInt1062] = i_465_;
						anIntArray175[anInt1062] = 0;
						for (int i_468_ = 0; anInt1022 > i_468_; i_468_++)
						{
							if ((i_466_ == anIntArray191[i_468_]) && (i_467_ == anIntArray170[i_468_]))
							{
								anIntArray175[anInt1062] = (Class4.anIntArray5[anIntArray178[i_468_]]);
								break;
							}
						}
						anInt1062++;
					}
					else
					{
						i_465_ &= 0x7fff;
						int i_469_ = 0;
						for (int i_470_ = 0; anInt1062 > i_470_; i_470_++)
						{
							if ((i_466_ != anIntArray192[i_470_]) || (i_467_ != anIntArray199[i_470_])
							        || (i_465_ != anIntArray201[i_470_]))
							{
								if (i_470_ != i_469_)
								{
									anIntArray192[i_469_] = anIntArray192[i_470_];
									anIntArray199[i_469_] = anIntArray199[i_470_];
									anIntArray201[i_469_] = anIntArray201[i_470_];
									anIntArray175[i_469_] = anIntArray175[i_470_];
								}
								i_469_++;
							}
							else
							{
								i_465_ = -123;
							}
						}
						anInt1062 = i_469_;
					}
				}
				else
				{
					int i_471_ = 0;
					final int i_472_ = ((anInt1030 + aClass27_Sub1_Sub1_2.method406(i ^ 0x21)) >> 3);
					final int i_473_ = (anInt1001 + aClass27_Sub1_Sub1_2.method406(-1)) >> 3;
					for (int i_474_ = 0; anInt1062 > i_474_; i_474_++)
					{
						final int i_475_ = (anIntArray192[i_474_] >> 3) + -i_472_;
						final int i_476_ = (anIntArray199[i_474_] >> 3) + -i_473_;
						if ((i_475_ != 0) || (i_476_ != 0))
						{
							if (i_474_ != i_471_)
							{
								anIntArray192[i_471_] = anIntArray192[i_474_];
								anIntArray199[i_471_] = anIntArray199[i_474_];
								anIntArray201[i_471_] = anIntArray201[i_474_];
								anIntArray175[i_471_] = anIntArray175[i_474_];
							}
							i_471_++;
						}
					}
					anInt1062 = i_471_;
				}
			}
		}
		else if (i_447_ == 48)
		{
			while (i_448_ > aClass27_Sub1_Sub1_2.anInt608)
			{
				if (255 == aClass27_Sub1_Sub1_2.method403(false))
				{
					int i_477_ = 0;
					final int i_478_ = (anInt1030 - -aClass27_Sub1_Sub1_2.method406(-1)) >> 3;
					final int i_479_ = (anInt1001 + aClass27_Sub1_Sub1_2.method406(-1)) >> 3;
					for (int i_480_ = 0; i_480_ < anInt1022; i_480_++)
					{
						final int i_481_ = (anIntArray191[i_480_] >> 3) + -i_478_;
						final int i_482_ = (anIntArray170[i_480_] >> 3) + -i_479_;
						if ((i_481_ != 0) || (i_482_ != 0))
						{
							if (i_480_ != i_477_)
							{
								aClass23Array4[i_477_] = aClass23Array4[i_480_];
								aClass23Array4[i_477_].anInt288 = i_477_;
								anIntArray191[i_477_] = anIntArray191[i_480_];
								anIntArray170[i_477_] = anIntArray170[i_480_];
								anIntArray178[i_477_] = anIntArray178[i_480_];
								anIntArray171[i_477_] = anIntArray171[i_480_];
							}
							i_477_++;
						}
						else
						{
							aClass41_2.method294(aClass23Array4[i_480_], 1);
							aClass6_1.method26(anIntArray178[i_480_], anIntArray170[i_480_], anIntArray191[i_480_],
							        -30895);
						}
					}
					anInt1022 = i_477_;
				}
				else
				{
					aClass27_Sub1_Sub1_2.anInt608--;
					final int i_483_ = aClass27_Sub1_Sub1_2.method392(false);
					final int i_484_ = anInt1030 + aClass27_Sub1_Sub1_2.method406(-1);
					final int i_485_ = anInt1001 + aClass27_Sub1_Sub1_2.method406(-1);
					int i_486_ = 0;
					for (int i_487_ = 0; i_487_ < anInt1022; i_487_++)
					{
						if ((i_484_ != anIntArray191[i_487_]) || (i_485_ != anIntArray170[i_487_]))
						{
							if (i_486_ != i_487_)
							{
								aClass23Array4[i_486_] = aClass23Array4[i_487_];
								aClass23Array4[i_486_].anInt288 = i_486_;
								anIntArray191[i_486_] = anIntArray191[i_487_];
								anIntArray170[i_486_] = anIntArray170[i_487_];
								anIntArray178[i_486_] = anIntArray178[i_487_];
								anIntArray171[i_486_] = anIntArray171[i_487_];
							}
							i_486_++;
						}
						else
						{
							aClass41_2.method294(aClass23Array4[i_487_], 1);
							aClass6_1.method26(anIntArray178[i_487_], anIntArray170[i_487_], anIntArray191[i_487_],
							        i ^ 0x788f);
						}
					}
					anInt1022 = i_486_;
					if (i_483_ != 60000)
					{
						final int i_488_ = aClass6_1.method13(i_485_, i_484_, (byte) 20);
						int i_489_;
						int i_490_;
						if ((i_488_ == 0) || (i_488_ == 4))
						{
							i_490_ = Class45.anIntArray115[i_483_];
							i_489_ = Class7.anIntArray17[i_483_];
						}
						else
						{
							i_489_ = Class45.anIntArray115[i_483_];
							i_490_ = Class7.anIntArray17[i_483_];
						}
						final int i_491_ = (((i_484_ + i_484_) - -i_490_) * anInt856) / 2;
						final int i_492_ = ((i_489_ + i_485_ + i_485_) * anInt856) / 2;
						final int i_493_ = IOException_Sub1.anIntArray149[i_483_];
						final Class23 class23 = aClass23Array6[i_493_].method166(114);
						aClass41_2.method267(class23, (byte) -100);
						class23.anInt288 = anInt1022;
						class23.method141(-26160, 0, i_488_ * 32, 0);
						class23.method137(1, i_492_, -aClass6_1.method35(i_492_, true, i_491_), i_491_);
						class23.method151(-50, 48, 256, 48, true, -10, -50);
						aClass6_1.method31(i_483_, (byte) -58, i_484_, i_485_);
						if (i_483_ == 74)
						{
							class23.method137(1, 0, -480, 0);
						}
						anIntArray191[anInt1022] = i_484_;
						anIntArray170[anInt1022] = i_485_;
						anIntArray178[anInt1022] = i_483_;
						anIntArray171[anInt1022] = i_488_;
						aClass23Array4[anInt1022++] = class23;
					}
				}
			}
		}
		else if (i_447_ == 111)
		{
			aBool93 = aClass27_Sub1_Sub1_2.method403(false) != 0;
		}
		else if (i_447_ == 53)
		{
			anInt1015 = aClass27_Sub1_Sub1_2.method403(false);
			for (int i_494_ = 0; i_494_ < anInt1015; i_494_++)
			{
				final int i_495_ = aClass27_Sub1_Sub1_2.method392(false);
				anIntArray194[i_494_] = Class52.method378(i_495_, 32767);
				anIntArray205[i_494_] = i_495_ / 32768;
				if (Class1.anIntArray1[i_495_ & 0x7fff] == 0)
				{
					anIntArray166[i_494_] = aClass27_Sub1_Sub1_2.method387(18381);
				}
				else
				{
					anIntArray166[i_494_] = 1;
				}
			}
		}
		else if (i_447_ == 234)
		{
			final int i_496_ = aClass27_Sub1_Sub1_2.method392(false);
			for (int i_497_ = 0; i_496_ > i_497_; i_497_++)
			{
				final int i_498_ = aClass27_Sub1_Sub1_2.method392(false);
				final Class15 class15 = aClass15Array2[i_498_];
				final byte i_499_ = aClass27_Sub1_Sub1_2.method406(i + 33);
				if (i_499_ != 0)
				{
					if (i_499_ == 1)
					{
						if (class15 != null)
						{
							final int i_500_ = aClass27_Sub1_Sub1_2.method403(false);
							final String string = Class4.method8(aClass27_Sub1_Sub1_2, -46);
							boolean bool = false;
							final String string_501_ = Class43.method298((byte) 122, (class15.aString7));
							if (string_501_ != null)
							{
								for (int i_502_ = 0; i_502_ < Class10.anInt129; i_502_++)
								{
									if (string_501_
									        .equals(Class43.method298((byte) -54, (Class41.aStringArray28[i_502_]))))
									{
										bool = true;
										break;
									}
								}
							}
							if (!bool)
							{
								class15.anInt165 = 150;
								class15.aString8 = string;
								method513(i_500_, class15.aString8, 4, class15.aString6, -105, null, class15.aString7,
								        i_500_ == 2);
							}
						}
					}
					else if (i_499_ == 2)
					{
						final int i_503_ = aClass27_Sub1_Sub1_2.method403(false);
						final int i_504_ = aClass27_Sub1_Sub1_2.method403(false);
						final int i_505_ = aClass27_Sub1_Sub1_2.method403(false);
						if (class15 != null)
						{
							class15.anInt157 = i_503_;
							class15.anInt145 = 200;
							class15.anInt148 = i_505_;
							class15.anInt143 = i_504_;
							if (class15 == aClass15_1)
							{
								anIntArray185[3] = i_504_;
								anIntArray200[3] = i_505_;
								aBool88 = false;
								aBool91 = false;
							}
						}
					}
					else if (i_499_ == 3)
					{
						final int i_506_ = aClass27_Sub1_Sub1_2.method392(false);
						final int i_507_ = aClass27_Sub1_Sub1_2.method392(false);
						if (class15 != null)
						{
							class15.anInt158 = anInt855;
							class15.anInt169 = -1;
							class15.anInt164 = i_506_;
							class15.anInt154 = i_507_;
						}
					}
					else if (i_499_ == 4)
					{
						final int i_508_ = aClass27_Sub1_Sub1_2.method392(false);
						final int i_509_ = aClass27_Sub1_Sub1_2.method392(false);
						if (class15 != null)
						{
							class15.anInt154 = -1;
							class15.anInt169 = i_509_;
							class15.anInt158 = anInt855;
							class15.anInt164 = i_508_;
						}
					}
					else if (i_499_ != 5)
					{
						if ((i_499_ == 6) && (class15 != null))
						{
							final String string = Class4.method8(aClass27_Sub1_Sub1_2, -46);
							class15.aString8 = string;
							class15.anInt165 = 150;
							if (class15 == aClass15_1)
							{
								method513(0, class15.aString8, 3, class15.aString6, -92, null, class15.aString7, false);
							}
						}
					}
					else if (class15 == null)
					{
						aClass27_Sub1_Sub1_2.method392(false);
						aClass27_Sub1_Sub1_2.method398(i ^ 0x21);
						aClass27_Sub1_Sub1_2.method398(-1);
						final int i_510_ = aClass27_Sub1_Sub1_2.method403(false);
						aClass27_Sub1_Sub1_2.anInt608 += 6 + i_510_;
					}
					else
					{
						aClass27_Sub1_Sub1_2.method392(false);
						class15.aString6 = aClass27_Sub1_Sub1_2.method398(-1);
						class15.aString7 = aClass27_Sub1_Sub1_2.method398(-1);
						final int i_511_ = aClass27_Sub1_Sub1_2.method403(false);
						for (int i_512_ = 0; i_511_ > i_512_; i_512_++)
						{
							class15.anIntArray36[i_512_] = aClass27_Sub1_Sub1_2.method403(false);
						}
						for (int i_513_ = i_511_; i_513_ < 12; i_513_++)
						{
							class15.anIntArray36[i_513_] = 0;
						}
						class15.anInt153 = aClass27_Sub1_Sub1_2.method403(false);
						class15.anInt163 = aClass27_Sub1_Sub1_2.method403(false);
						class15.anInt155 = aClass27_Sub1_Sub1_2.method403(false);
						class15.anInt152 = aClass27_Sub1_Sub1_2.method403(false);
						class15.anInt151 = aClass27_Sub1_Sub1_2.method403(false);
						class15.anInt144 = aClass27_Sub1_Sub1_2.method403(false);
					}
				}
				else
				{
					final int i_514_ = aClass27_Sub1_Sub1_2.method392(false);
					if (class15 != null)
					{
						class15.anInt168 = 150;
						class15.anInt162 = i_514_;
					}
				}
			}
		}
		else if (i_447_ == 91)
		{
			while (i_448_ > aClass27_Sub1_Sub1_2.anInt608)
			{
				if (aClass27_Sub1_Sub1_2.method403(false) != 255)
				{
					aClass27_Sub1_Sub1_2.anInt608--;
					final int i_515_ = aClass27_Sub1_Sub1_2.method392(false);
					final int i_516_ = anInt1030 + aClass27_Sub1_Sub1_2.method406(-1);
					final int i_517_ = anInt1001 + aClass27_Sub1_Sub1_2.method406(-1);
					final int i_518_ = aClass27_Sub1_Sub1_2.method406(-1);
					int i_519_ = 0;
					for (int i_520_ = 0; anInt957 > i_520_; i_520_++)
					{
						if ((i_516_ != anIntArray176[i_520_]) || (i_517_ != anIntArray167[i_520_])
						        || (i_518_ != anIntArray163[i_520_]))
						{
							if (i_519_ != i_520_)
							{
								aClass23Array5[i_519_] = aClass23Array5[i_520_];
								aClass23Array5[i_519_].anInt288 = i_519_ + 10000;
								anIntArray176[i_519_] = anIntArray176[i_520_];
								anIntArray167[i_519_] = anIntArray167[i_520_];
								anIntArray163[i_519_] = anIntArray163[i_520_];
								anIntArray190[i_519_] = anIntArray190[i_520_];
							}
							i_519_++;
						}
						else
						{
							aClass41_2.method294(aClass23Array5[i_520_], 1);
							aClass6_1.method42(anIntArray163[i_520_], anIntArray176[i_520_], false,
							        anIntArray190[i_520_], anIntArray167[i_520_]);
						}
					}
					anInt957 = i_519_;
					if (i_515_ != 65535)
					{
						aClass6_1.method15(16, i_518_, i_516_, i_515_, i_517_);
						final Class23 class23 = method506(false, anInt957, i_515_, i_516_, i_517_, i_518_);
						aClass23Array5[anInt957] = class23;
						anIntArray176[anInt957] = i_516_;
						anIntArray167[anInt957] = i_517_;
						anIntArray190[anInt957] = i_515_;
						anIntArray163[anInt957++] = i_518_;
					}
				}
				else
				{
					int i_521_ = 0;
					final int i_522_ = (anInt1030 + aClass27_Sub1_Sub1_2.method406(-1)) >> 3;
					final int i_523_ = (anInt1001 - -aClass27_Sub1_Sub1_2.method406(-1)) >> 3;
					for (int i_524_ = 0; anInt957 > i_524_; i_524_++)
					{
						final int i_525_ = (anIntArray176[i_524_] >> 3) + -i_522_;
						final int i_526_ = (anIntArray167[i_524_] >> 3) + -i_523_;
						if ((i_525_ != 0) || (i_526_ != 0))
						{
							if (i_524_ != i_521_)
							{
								aClass23Array5[i_521_] = aClass23Array5[i_524_];
								aClass23Array5[i_521_].anInt288 = i_521_ - -10000;
								anIntArray176[i_521_] = anIntArray176[i_524_];
								anIntArray167[i_521_] = anIntArray167[i_524_];
								anIntArray163[i_521_] = anIntArray163[i_524_];
								anIntArray190[i_521_] = anIntArray190[i_524_];
							}
							i_521_++;
						}
						else
						{
							aClass41_2.method294(aClass23Array5[i_524_], 1);
							aClass6_1.method42(anIntArray163[i_524_], anIntArray176[i_524_], false,
							        anIntArray190[i_524_], anIntArray167[i_524_]);
						}
					}
					anInt957 = i_521_;
				}
			}
		}
		else if (i_447_ == 79)
		{
			anInt1007 = anInt1039;
			anInt1039 = 0;
			for (int i_527_ = 0; anInt1007 > i_527_; i_527_++)
			{
				aClass15Array4[i_527_] = aClass15Array5[i_527_];
			}
			aClass27_Sub1_Sub1_2.method454(i + -1158);
			final int i_528_ = aClass27_Sub1_Sub1_2.method456(80, 8);
			for (int i_529_ = 0; i_528_ > i_529_; i_529_++)
			{
				final Class15 class15 = aClass15Array4[i_529_];
				final int i_530_ = aClass27_Sub1_Sub1_2.method456(-108, 1);
				if (i_530_ != 0)
				{
					final int i_531_ = aClass27_Sub1_Sub1_2.method456(108, 1);
					if (i_531_ != 0)
					{
						final int i_532_ = aClass27_Sub1_Sub1_2.method456(-95, 2);
						if (i_532_ == 3)
						{
							continue;
						}
						class15.anInt167 = ((i_532_ << 2) + aClass27_Sub1_Sub1_2.method456(-100, 2));
					}
					else
					{
						final int i_533_ = aClass27_Sub1_Sub1_2.method456(i ^ 0x4f, 3);
						int i_534_ = class15.anInt149;
						int i_535_ = class15.anIntArray38[i_534_];
						int i_536_ = class15.anIntArray39[i_534_];
						if ((i_533_ == 2) || (i_533_ == 1) || (i_533_ == 3))
						{
							i_535_ += anInt856;
						}
						if ((i_533_ == 6) || (i_533_ == 5) || (i_533_ == 7))
						{
							i_535_ -= anInt856;
						}
						if ((i_533_ == 4) || (i_533_ == 3) || (i_533_ == 5))
						{
							i_536_ += anInt856;
						}
						class15.anInt149 = i_534_ = (i_534_ + 1) % 10;
						class15.anInt167 = i_533_;
						if ((i_533_ == 0) || (i_533_ == 1) || (i_533_ == 7))
						{
							i_536_ -= anInt856;
						}
						class15.anIntArray38[i_534_] = i_535_;
						class15.anIntArray39[i_534_] = i_536_;
					}
				}
				aClass15Array5[anInt1039++] = class15;
			}
			while ((i_448_ * 8) > (aClass27_Sub1_Sub1_2.method457(i + 32287) + 34))
			{
				final int i_537_ = aClass27_Sub1_Sub1_2.method456(-57, 12);
				int i_538_ = aClass27_Sub1_Sub1_2.method456(-114, 5);
				if (i_538_ > 15)
				{
					i_538_ -= 32;
				}
				int i_539_ = aClass27_Sub1_Sub1_2.method456(117, 5);
				if (15 < i_539_)
				{
					i_539_ -= 32;
				}
				final int i_540_ = aClass27_Sub1_Sub1_2.method456(i ^ ~0x5e, 4);
				final int i_541_ = ((i_538_ + anInt1030) * anInt856) + 64;
				final int i_542_ = ((i_539_ + anInt1001) * anInt856) + 64;
				int i_543_ = aClass27_Sub1_Sub1_2.method456(i ^ ~0x77, 10);
				if (i_543_ >= Class35.anInt376)
				{
					i_543_ = 24;
				}
				method512(i_542_, -82, i_537_, i_543_, i_540_, i_541_);
			}
			aClass27_Sub1_Sub1_2.method458((byte) -67);
		}
		else if (i_447_ == 104)
		{
			final int i_544_ = aClass27_Sub1_Sub1_2.method392(false);
			for (int i_545_ = 0; i_544_ > i_545_; i_545_++)
			{
				final int i_546_ = aClass27_Sub1_Sub1_2.method392(false);
				final Class15 class15 = aClass15Array6[i_546_];
				final int i_547_ = aClass27_Sub1_Sub1_2.method403(false);
				if (i_547_ != 1)
				{
					if (i_547_ == 2)
					{
						final int i_548_ = aClass27_Sub1_Sub1_2.method403(false);
						final int i_549_ = aClass27_Sub1_Sub1_2.method403(false);
						final int i_550_ = aClass27_Sub1_Sub1_2.method403(false);
						if (class15 != null)
						{
							class15.anInt148 = i_550_;
							class15.anInt145 = 200;
							class15.anInt157 = i_548_;
							class15.anInt143 = i_549_;
						}
					}
				}
				else
				{
					final int i_551_ = aClass27_Sub1_Sub1_2.method392(false);
					if (class15 != null)
					{
						final String string = Class4.method8(aClass27_Sub1_Sub1_2, i + -12);
						class15.aString8 = string;
						class15.anInt165 = 150;
						if (aClass15_1.anInt150 == i_551_)
						{
							method513(0, new StringBuilder().append(Class22.aStringArray16[class15.anInt161])
							        .append(": ").append(class15.aString8).toString(), 3, null, -98, "@yel@", null,
							        false);
						}
					}
				}
			}
		}
		else if (i_447_ == 245)
		{
			aBool70 = true;
			final int i_552_ = aClass27_Sub1_Sub1_2.method403(false);
			anInt953 = i_552_;
			for (int i_553_ = 0; i_553_ < i_552_; i_553_++)
			{
				aStringArray45[i_553_] = aClass27_Sub1_Sub1_2.method398(-1);
			}
		}
		else if (i_447_ == 252)
		{
			aBool70 = false;
		}
		else if (i_447_ == 25)
		{
			aBool78 = true;
			anInt1010 = aClass27_Sub1_Sub1_2.method392(false);
			anInt894 = aClass27_Sub1_Sub1_2.method392(false);
			anInt852 = aClass27_Sub1_Sub1_2.method392(false);
			anInt901 = aClass27_Sub1_Sub1_2.method392(false);
			anInt915 = aClass27_Sub1_Sub1_2.method392(false);
			anInt852 -= anInt915 * anInt901;
		}
		else if (i_447_ == 156)
		{
			for (int i_554_ = 0; i_554_ < 18; i_554_++)
			{
				anIntArray185[i_554_] = aClass27_Sub1_Sub1_2.method403(false);
			}
			for (int i_555_ = 0; 18 > i_555_; i_555_++)
			{
				anIntArray200[i_555_] = aClass27_Sub1_Sub1_2.method403(false);
			}
			for (int i_556_ = 0; i_556_ < 18; i_556_++)
			{
				anIntArray189[i_556_] = aClass27_Sub1_Sub1_2.method404((byte) -122);
			}
			anInt975 = aClass27_Sub1_Sub1_2.method403(false);
		}
		else if (i_447_ == 153)
		{
			for (int i_557_ = 0; 5 > i_557_; i_557_++)
			{
				anIntArray186[i_557_] = aClass27_Sub1_Sub1_2.method403(false);
			}
		}
		else if (i_447_ == 83)
		{
			anInt1000 = 250;
		}
		else if (i_447_ == 211)
		{
			final int i_558_ = (i_448_ - 1) / 4;
			for (int i_559_ = 0; i_558_ > i_559_; i_559_++)
			{
				final int i_560_ = ((anInt1030 - -aClass27_Sub1_Sub1_2.method407((byte) 73)) >> 3);
				final int i_561_ = ((anInt1001 - -aClass27_Sub1_Sub1_2.method407((byte) 73)) >> 3);
				int i_562_ = 0;
				for (int i_563_ = 0; i_563_ < anInt1062; i_563_++)
				{
					final int i_564_ = (anIntArray192[i_563_] >> 3) + -i_560_;
					final int i_565_ = (anIntArray199[i_563_] >> 3) + -i_561_;
					if ((i_564_ != 0) || (i_565_ != 0))
					{
						if (i_562_ != i_563_)
						{
							anIntArray192[i_562_] = anIntArray192[i_563_];
							anIntArray199[i_562_] = anIntArray199[i_563_];
							anIntArray201[i_562_] = anIntArray201[i_563_];
							anIntArray175[i_562_] = anIntArray175[i_563_];
						}
						i_562_++;
					}
				}
				anInt1062 = i_562_;
				i_562_ = 0;
				for (int i_566_ = 0; i_566_ < anInt1022; i_566_++)
				{
					final int i_567_ = (anIntArray191[i_566_] >> 3) + -i_560_;
					final int i_568_ = (anIntArray170[i_566_] >> 3) + -i_561_;
					if ((i_567_ != 0) || (i_568_ != 0))
					{
						if (i_566_ != i_562_)
						{
							aClass23Array4[i_562_] = aClass23Array4[i_566_];
							aClass23Array4[i_562_].anInt288 = i_562_;
							anIntArray191[i_562_] = anIntArray191[i_566_];
							anIntArray170[i_562_] = anIntArray170[i_566_];
							anIntArray178[i_562_] = anIntArray178[i_566_];
							anIntArray171[i_562_] = anIntArray171[i_566_];
						}
						i_562_++;
					}
					else
					{
						aClass41_2.method294(aClass23Array4[i_566_], 1);
						aClass6_1.method26(anIntArray178[i_566_], anIntArray170[i_566_], anIntArray191[i_566_], -30895);
					}
				}
				anInt1022 = i_562_;
				i_562_ = 0;
				for (int i_569_ = 0; i_569_ < anInt957; i_569_++)
				{
					final int i_570_ = (anIntArray176[i_569_] >> 3) - i_560_;
					final int i_571_ = (anIntArray167[i_569_] >> 3) + -i_561_;
					if ((i_570_ == 0) && (i_571_ == 0))
					{
						aClass41_2.method294(aClass23Array5[i_569_], i ^ ~0x20);
						aClass6_1.method42(anIntArray163[i_569_], anIntArray176[i_569_], false, anIntArray190[i_569_],
						        anIntArray167[i_569_]);
					}
					else
					{
						if (i_569_ != i_562_)
						{
							aClass23Array5[i_562_] = aClass23Array5[i_569_];
							aClass23Array5[i_562_].anInt288 = i_562_ + 10000;
							anIntArray176[i_562_] = anIntArray176[i_569_];
							anIntArray167[i_562_] = anIntArray167[i_569_];
							anIntArray163[i_562_] = anIntArray163[i_569_];
							anIntArray190[i_562_] = anIntArray190[i_569_];
						}
						i_562_++;
					}
				}
				anInt957 = i_562_;
			}
		}
		else if (i_447_ == 59)
		{
			aBool64 = true;
		}
		else if (i_447_ == 92)
		{
			final int i_572_ = aClass27_Sub1_Sub1_2.method392(false);
			if (aClass15Array2[i_572_] != null)
			{
				aString40 = aClass15Array2[i_572_].aString6;
			}
			aBool68 = false;
			anInt1026 = 0;
			aBool84 = true;
			anInt1049 = 0;
			aBool67 = false;
		}
		else if (i_447_ == 128)
		{
			aBool84 = false;
			aBool89 = false;
		}
		else if (i_447_ == 97)
		{
			anInt1026 = aClass27_Sub1_Sub1_2.method403(false);
			for (int i_573_ = 0; anInt1026 > i_573_; i_573_++)
			{
				anIntArray181[i_573_] = aClass27_Sub1_Sub1_2.method392(false);
				anIntArray209[i_573_] = aClass27_Sub1_Sub1_2.method404((byte) 124);
			}
			aBool68 = false;
			aBool67 = false;
		}
		else if (i_447_ == 162)
		{
			final int i_574_ = aClass27_Sub1_Sub1_2.method403(false);
			if (i_574_ != 1)
			{
				aBool67 = false;
			}
			else
			{
				aBool67 = true;
			}
		}
		else if (i_447_ == 101)
		{
			aBool57 = true;
			final int i_575_ = aClass27_Sub1_Sub1_2.method403(false);
			final byte i_576_ = aClass27_Sub1_Sub1_2.method406(-1);
			anInt1013 = aClass27_Sub1_Sub1_2.method403(false);
			anInt1024 = aClass27_Sub1_Sub1_2.method403(false);
			anInt959 = aClass27_Sub1_Sub1_2.method403(false);
			for (int i_577_ = 0; 40 > i_577_; i_577_++)
			{
				anIntArray179[i_577_] = -1;
			}
			for (int i_578_ = 0; i_575_ > i_578_; i_578_++)
			{
				anIntArray179[i_578_] = aClass27_Sub1_Sub1_2.method392(false);
				anIntArray219[i_578_] = aClass27_Sub1_Sub1_2.method392(false);
				anIntArray174[i_578_] = aClass27_Sub1_Sub1_2.method392(false);
			}
			if (i_576_ == 1)
			{
				int i_579_ = 39;
				for (int i_580_ = 0; (anInt1015 > i_580_) && (i_575_ <= i_579_); i_580_++)
				{
					boolean bool = false;
					for (int i_581_ = 0; i_581_ < 40; i_581_++)
					{
						if (anIntArray179[i_581_] == anIntArray194[i_580_])
						{
							bool = true;
							break;
						}
					}
					if (anIntArray194[i_580_] == 10)
					{
						bool = true;
					}
					if (!bool)
					{
						anIntArray179[i_579_] = Class52.method378(anIntArray194[i_580_], 32767);
						anIntArray219[i_579_] = 0;
						anIntArray174[i_579_] = 0;
						i_579_--;
					}
				}
			}
			if ((anInt972 >= 0) && (40 > anInt972) && (anIntArray179[anInt972] != anInt1006))
			{
				anInt972 = -1;
				anInt1006 = -2;
			}
		}
		else if (i_447_ == 137)
		{
			aBool57 = false;
		}
		else if (i_447_ == 15)
		{
			final byte i_582_ = aClass27_Sub1_Sub1_2.method406(-1);
			if (i_582_ != 1)
			{
				aBool68 = false;
			}
			else
			{
				aBool68 = true;
			}
		}
		else if (i_447_ == 240)
		{
			aBool86 = aClass27_Sub1_Sub1_2.method403(false) == 1;
			aBool83 = 1 == aClass27_Sub1_Sub1_2.method403(false);
			aBool58 = 1 == aClass27_Sub1_Sub1_2.method403(false);
		}
		else if (i_447_ == 206)
		{
			for (int i_583_ = 0; i_583_ < (i_448_ + -1); i_583_++)
			{
				final boolean bool = 1 == aClass27_Sub1_Sub1_2.method406(-1);
				if (!aBoolArray11[i_583_] && bool)
				{
					method564((byte) 124, "prayeron");
				}
				if (aBoolArray11[i_583_] && !bool)
				{
					method564((byte) 103, "prayeroff");
				}
				aBoolArray11[i_583_] = bool;
			}
		}
		else if (i_447_ == 5)
		{
			for (int i_584_ = 0; i_584_ < 50; i_584_++)
			{
				aBoolArray12[i_584_] = 1 == aClass27_Sub1_Sub1_2.method406(Class47.method369(i, 33));
			}
		}
		else if (i_447_ == 42)
		{
			aBool81 = true;
			anInt952 = aClass27_Sub1_Sub1_2.method403(false);
			anInt1017 = aClass27_Sub1_Sub1_2.method403(false);
			for (int i_585_ = 0; anInt952 > i_585_; i_585_++)
			{
				anIntArray177[i_585_] = aClass27_Sub1_Sub1_2.method392(false);
				anIntArray207[i_585_] = aClass27_Sub1_Sub1_2.method387(i + 18415);
			}
			method589((byte) -128);
		}
		else if (i_447_ == 203)
		{
			aBool81 = false;
		}
		else if (i_447_ == 33)
		{
			final int i_586_ = aClass27_Sub1_Sub1_2.method403(false);
			anIntArray189[i_586_] = aClass27_Sub1_Sub1_2.method404((byte) -54);
		}
		else
		{
			if (i != -34)
			{
				anInt960 = -19;
			}
			if (i_447_ == 176)
			{
				final int i_587_ = aClass27_Sub1_Sub1_2.method392(false);
				if (aClass15Array2[i_587_] != null)
				{
					aString32 = aClass15Array2[i_587_].aString6;
				}
				aBool71 = false;
				aBool59 = false;
				aBool65 = false;
				aBool85 = false;
				aBool75 = false;
				aBool72 = true;
				anInt967 = 0;
				anInt1061 = 0;
				aBool79 = false;
			}
			else if (i_447_ == 225)
			{
				aBool92 = false;
				aBool72 = false;
			}
			else if (i_447_ == 20)
			{
				aBool63 = false;
				aBool89 = true;
				aBool84 = false;
				aString31 = aClass27_Sub1_Sub1_2.method398(-1);
				anInt998 = aClass27_Sub1_Sub1_2.method403(false);
				for (int i_588_ = 0; i_588_ < anInt998; i_588_++)
				{
					anIntArray159[i_588_] = aClass27_Sub1_Sub1_2.method392(false);
					anIntArray220[i_588_] = aClass27_Sub1_Sub1_2.method404((byte) 84);
				}
				anInt1038 = aClass27_Sub1_Sub1_2.method403(false);
				for (int i_589_ = 0; i_589_ < anInt1038; i_589_++)
				{
					anIntArray172[i_589_] = aClass27_Sub1_Sub1_2.method392(false);
					anIntArray160[i_589_] = aClass27_Sub1_Sub1_2.method404((byte) -128);
				}
			}
			else if (i_447_ == 6)
			{
				anInt967 = aClass27_Sub1_Sub1_2.method403(false);
				for (int i_590_ = 0; anInt967 > i_590_; i_590_++)
				{
					anIntArray212[i_590_] = aClass27_Sub1_Sub1_2.method392(false);
					anIntArray193[i_590_] = aClass27_Sub1_Sub1_2.method404((byte) -128);
				}
				aBool75 = false;
				aBool59 = false;
			}
			else if (i_447_ == 30)
			{
				if (1 != aClass27_Sub1_Sub1_2.method403(false))
				{
					aBool85 = false;
				}
				else
				{
					aBool85 = true;
				}
				if (1 == aClass27_Sub1_Sub1_2.method403(false))
				{
					aBool65 = true;
				}
				else
				{
					aBool65 = false;
				}
				if (1 == aClass27_Sub1_Sub1_2.method403(false))
				{
					aBool71 = true;
				}
				else
				{
					aBool71 = false;
				}
				if (aClass27_Sub1_Sub1_2.method403(false) == 1)
				{
					aBool79 = true;
				}
				else
				{
					aBool79 = false;
				}
				aBool75 = false;
				aBool59 = false;
			}
			else if (i_447_ == 249)
			{
				final int i_591_ = aClass27_Sub1_Sub1_2.method403(false);
				final int i_592_ = aClass27_Sub1_Sub1_2.method392(false);
				final int i_593_ = aClass27_Sub1_Sub1_2.method387(18381);
				if (i_593_ == 0)
				{
					anInt952--;
					for (int i_594_ = i_591_; i_594_ < anInt952; i_594_++)
					{
						anIntArray177[i_594_] = anIntArray177[i_594_ + 1];
						anIntArray207[i_594_] = anIntArray207[i_594_ + 1];
					}
				}
				else
				{
					anIntArray177[i_591_] = i_592_;
					anIntArray207[i_591_] = i_593_;
					if (i_591_ >= anInt952)
					{
						anInt952 = i_591_ + 1;
					}
				}
				method589((byte) -111);
			}
			else if (i_447_ == 90)
			{
				int i_595_ = 1;
				final int i_596_ = aClass27_Sub1_Sub1_2.method403(false);
				final int i_597_ = aClass27_Sub1_Sub1_2.method392(false);
				if (Class1.anIntArray1[i_597_ & 0x7fff] == 0)
				{
					i_595_ = aClass27_Sub1_Sub1_2.method387(18381);
				}
				anIntArray194[i_596_] = Class52.method378(32767, i_597_);
				anIntArray205[i_596_] = i_597_ / 32768;
				anIntArray166[i_596_] = i_595_;
				if (anInt1015 <= i_596_)
				{
					anInt1015 = i_596_ + 1;
				}
			}
			else if (i_447_ == 123)
			{
				final int i_598_ = aClass27_Sub1_Sub1_2.method403(false);
				anInt1015--;
				for (int i_599_ = i_598_; i_599_ < anInt1015; i_599_++)
				{
					anIntArray194[i_599_] = anIntArray194[i_599_ + 1];
					anIntArray166[i_599_] = anIntArray166[i_599_ - -1];
					anIntArray205[i_599_] = anIntArray205[i_599_ - -1];
				}
			}
			else if (i_447_ == 159)
			{
				final int i_600_ = aClass27_Sub1_Sub1_2.method403(false);
				anIntArray185[i_600_] = aClass27_Sub1_Sub1_2.method403(false);
				anIntArray200[i_600_] = aClass27_Sub1_Sub1_2.method403(false);
				anIntArray189[i_600_] = aClass27_Sub1_Sub1_2.method404((byte) 124);
			}
			else if (i_447_ == 253)
			{
				final byte i_601_ = aClass27_Sub1_Sub1_2.method406(i ^ 0x21);
				if (i_601_ != 1)
				{
					aBool75 = false;
				}
				else
				{
					aBool75 = true;
				}
			}
			else if (i_447_ == 210)
			{
				final byte i_602_ = aClass27_Sub1_Sub1_2.method406(-1);
				if (i_602_ != 1)
				{
					aBool59 = false;
				}
				else
				{
					aBool59 = true;
				}
			}
			else if (i_447_ == 172)
			{
				aBool66 = false;
				aBool92 = true;
				aBool72 = false;
				aString37 = aClass27_Sub1_Sub1_2.method398(-1);
				anInt1053 = aClass27_Sub1_Sub1_2.method403(false);
				for (int i_603_ = 0; anInt1053 > i_603_; i_603_++)
				{
					anIntArray221[i_603_] = aClass27_Sub1_Sub1_2.method392(false);
					anIntArray206[i_603_] = aClass27_Sub1_Sub1_2.method404((byte) 94);
				}
				anInt992 = aClass27_Sub1_Sub1_2.method403(false);
				for (int i_604_ = 0; anInt992 > i_604_; i_604_++)
				{
					anIntArray215[i_604_] = aClass27_Sub1_Sub1_2.method392(false);
					anIntArray183[i_604_] = aClass27_Sub1_Sub1_2.method404((byte) 78);
				}
				anInt995 = aClass27_Sub1_Sub1_2.method403(false);
				anInt1004 = aClass27_Sub1_Sub1_2.method403(false);
				anInt1025 = aClass27_Sub1_Sub1_2.method403(false);
				anInt1034 = aClass27_Sub1_Sub1_2.method403(false);
			}
			else if (i_447_ == 204)
			{
				final String string = aClass27_Sub1_Sub1_2.method398(i + 33);
				method564((byte) -93, string);
			}
			else if (i_447_ == 36)
			{
				if (anInt1012 < 50)
				{
					final int i_605_ = aClass27_Sub1_Sub1_2.method403(false);
					final int i_606_ = aClass27_Sub1_Sub1_2.method406(-1) + anInt1030;
					final int i_607_ = aClass27_Sub1_Sub1_2.method406(-1) - -anInt1001;
					anIntArray214[anInt1012] = i_605_;
					anIntArray208[anInt1012] = 0;
					anIntArray188[anInt1012] = i_606_;
					anIntArray204[anInt1012] = i_607_;
					anInt1012++;
				}
			}
			else if (i_447_ == 182)
			{
				if (!aBool77)
				{
					anInt1021 = aClass27_Sub1_Sub1_2.method404((byte) 112);
					anInt988 = aClass27_Sub1_Sub1_2.method392(false);
					anInt963 = aClass27_Sub1_Sub1_2.method403(false);
					anInt993 = aClass27_Sub1_Sub1_2.method392(false);
					aBool77 = true;
					aString36 = null;
					aBool91 = true;
				}
			}
			else if (i_447_ == 89)
			{
				aString38 = aClass27_Sub1_Sub1_2.method398(-1);
				aBool74 = false;
				aBool88 = true;
			}
			else if (i_447_ == 222)
			{
				aString38 = aClass27_Sub1_Sub1_2.method398(-1);
				aBool74 = true;
				aBool88 = true;
			}
			else if (i_447_ == 114)
			{
				anInt950 = aClass27_Sub1_Sub1_2.method392(false);
			}
			else if (i_447_ == 117)
			{
				if (!aBool69)
				{
					anInt1055 = anInt950;
				}
				this.aString26 = "";
				aBool69 = true;
				this.aString27 = "";
				aClass46_Sub1_2.method360((byte) -47, aClass27_Sub1_Sub1_2.aByteArray24, anInt925 + 1);
				aString35 = null;
			}
			else if (i_447_ == 244)
			{
				anInt1055 = aClass27_Sub1_Sub1_2.method392(false);
			}
			else if (i_447_ == 84)
			{
				aBool69 = false;
			}
			else if (i_447_ == 194)
			{
				aString35 = "Incorrect - Please wait...";
			}
			else if (i_447_ == 52)
			{
				anInt949 = aClass27_Sub1_Sub1_2.method392(false) * 32;
			}
			else if (i_447_ != 213)
			{
				Class9.method61(null, 112,
				        new StringBuilder().append("T1 - ").append(i_447_).append(" - ").append(i_448_).toString());
				method544(true, (byte) 72);
			}
		}
	}

	private Class15 method548(final int i, final boolean bool, final int i_608_, final int i_609_, final int i_610_)
	{
		anInt809++;
		if (aClass15Array2[i_609_] == null)
		{
			aClass15Array2[i_609_] = new Class15();
			aClass15Array2[i_609_].anInt150 = i_609_;
		}
		final Class15 class15 = aClass15Array2[i_609_];
		boolean bool_611_ = bool;
		for (int i_612_ = 0; anInt859 > i_612_; i_612_++)
		{
			if (i_609_ == aClass15Array1[i_612_].anInt150)
			{
				bool_611_ = true;
				break;
			}
		}
		if (bool_611_)
		{
			class15.anInt167 = i_610_;
			int i_613_ = class15.anInt149;
			if ((i_608_ != class15.anIntArray38[i_613_]) || (class15.anIntArray39[i_613_] != i))
			{
				class15.anInt149 = i_613_ = (i_613_ + 1) % 10;
				class15.anIntArray38[i_613_] = i_608_;
				class15.anIntArray39[i_613_] = i;
			}
		}
		else
		{
			class15.anInt149 = 0;
			class15.anIntArray38[0] = class15.anInt166 = i_608_;
			class15.anInt150 = i_609_;
			class15.anInt147 = 0;
			class15.anInt146 = 0;
			class15.anIntArray39[0] = class15.anInt159 = i;
			class15.anInt167 = class15.anInt160 = i_610_;
		}
		aClass15Array3[anInt932++] = class15;
		return class15;
	}

	private void method549(final int i)
	{
		anInt792++;
	}

	private void method550(final byte i)
	{
		anInt851++;
		final byte[] is = method468("Textures", 50, 11, -21865);
		if (is == null)
		{
			aBool52 = true;
		}
		else
		{
			final byte[] is_614_ = Class41.method292(is, 0, "index.dat", 293484812);
			aClass41_2.method293(11, 13803, Class12.anInt140, 7);
			int i_615_ = 0;
			for (/**/; Class12.anInt140 > i_615_; i_615_++)
			{
				final String string = Class46_Sub1.aStringArray37[i_615_];
				byte[] is_617_ = Class41.method292(is, 0, new StringBuilder().append(string).append(".dat").toString(),
				        293484812);
				aClass46_Sub1_2.method350(anInt925, 82, is_614_, is_617_, 1);
				aClass46_Sub1_2.method321(0, 16711935, 128, 128, 0, 1);
				aClass46_Sub1_2.method338(anInt925, 0, 0, (byte) -70);
				final int i_618_ = aClass46_Sub1_2.anIntArray125[anInt925];
				final String string_619_ = Class4.aStringArray6[i_615_];
				if ((string_619_ != null) && (0 < string_619_.length()))
				{
					is_617_ = Class41.method292(is, 0,
					        new StringBuilder().append(string_619_).append(".dat").toString(), 293484812);
					aClass46_Sub1_2.method350(anInt925, -104, is_614_, is_617_, 1);
					aClass46_Sub1_2.method338(anInt925, 0, 0, (byte) -70);
				}
				aClass46_Sub1_2.method353(0, i_618_, 0, i_618_, i_615_ + anInt910, -69);
				final int i_620_ = i_618_ * i_618_;
				for (int i_621_ = 0; i_620_ > i_621_; i_621_++)
				{
					if ((aClass46_Sub1_2.anIntArrayArray20[i_615_ + anInt910][i_621_]) == 65280)
					{
						aClass46_Sub1_2.anIntArrayArray20[i_615_ + anInt910][i_621_] = 16711935;
					}
				}
				aClass46_Sub1_2.method306(i_615_ + anInt910, -22);
				aClass41_2.method271(i_615_, (i_618_ / 64) + -1, false,
				        (aClass46_Sub1_2.anIntArrayArray19[i_615_ + anInt910]),
				        (aClass46_Sub1_2.aByteArrayArray13[anInt910 - -i_615_]));
			}
		}
	}

	@Override
	public void init()
	{
		try
		{
			Class27_Sub1_Sub1.anInt664 = Integer.parseInt(getParameter("nodeid"));
			anInt808++;
			Class34.aClass38_5 = Class15.method113(-119, Integer.parseInt(getParameter("modewhere")));
			if (Class34.aClass38_5 == null)
			{
				Class34.aClass38_5 = Class22.aClass38_3;
			}
			RuntimeException_Sub1.aClass24_4 = Class45.method304(Integer.parseInt(getParameter("modewhat")), 0);
			if (RuntimeException_Sub1.aClass24_4 == null)
			{
				RuntimeException_Sub1.aClass24_4 = Class42.aClass24_1;
			}
			super.method479((byte) -82, 32 - -(RuntimeException_Sub1.aClass24_4.anInt293), anInt879 + 12,
			        Class51.anInt583, anInt853);
		}
		catch (final RuntimeException runtimeexception)
		{
			throw Class21.method133(runtimeexception, "client.init()");
		}
	}

	private void method551(final int i)
	{
		anInt841++;
		final byte[] is = method468("people and monsters", 30, 1, -21865);
		if (is == null)
		{
			aBool52 = true;
		}
		else
		{
			final byte[] is_624_ = Class41.method292(is, 0, "index.dat", 293484812);
			byte[] is_625_ = null;
			byte[] is_626_ = null;
			if (aBool55)
			{
				is_625_ = method468("member graphics", 45, 2, -21865);
				if (is_625_ == null)
				{
					aBool52 = true;
					return;
				}
				is_626_ = Class41.method292(is_625_, 0, "index.dat", 293484812);
			}
			anInt1050 = 0;
			int i_627_ = 0;
			anInt946 = anInt1050;
			while_14_: for (int i_628_ = 0; Class38.anInt396 > i_628_; i_628_++)
			{
				final String string = Class10.aStringArray11[i_628_];
				for (int i_629_ = 0; i_629_ < i_628_; i_629_++)
				{
					if (Class10.aStringArray11[i_629_].equalsIgnoreCase(string))
					{
						Class24.anIntArray78[i_628_] = Class24.anIntArray78[i_629_];
						continue while_14_;
					}
				}
				byte[] is_630_ = Class41.method292(is, 0, new StringBuilder().append(string).append(".dat").toString(),
				        293484812);
				byte[] is_631_ = is_624_;
				if ((is_630_ == null) && aBool55)
				{
					is_631_ = is_626_;
					is_630_ = Class41.method292(is_625_, 0,
					        new StringBuilder().append(string).append(".dat").toString(), 293484812);
				}
				if (is_630_ != null)
				{
					aClass46_Sub1_2.method350(anInt946, -79, is_631_, is_630_, 15);
					i_627_ += 15;
					if (Class5.anIntArray7[i_628_] == 1)
					{
						byte[] is_632_ = Class41.method292(is, 0,
						        new StringBuilder().append(string).append("a.dat").toString(), 293484812);
						is_631_ = is_624_;
						if ((is_632_ == null) && aBool55)
						{
							is_631_ = is_626_;
							is_632_ = Class41.method292(is_625_, 0,
							        new StringBuilder().append(string).append("a.dat").toString(), 293484812);
						}
						aClass46_Sub1_2.method350(anInt946 - -15, -89, is_631_, is_632_, 3);
						i_627_ += 3;
					}
					if (Class9.anIntArray20[i_628_] == 1)
					{
						is_631_ = is_624_;
						byte[] is_633_ = Class41.method292(is, 0,
						        new StringBuilder().append(string).append("f.dat").toString(), 293484812);
						if ((is_633_ == null) && aBool55)
						{
							is_633_ = Class41.method292(is_625_, 0,
							        new StringBuilder().append(string).append("f.dat").toString(), 293484812);
							is_631_ = is_626_;
						}
						i_627_ += 9;
						aClass46_Sub1_2.method350(anInt946 - -18, -91, is_631_, is_633_, 9);
					}
					if (Class6.anIntArray13[i_628_] != 0)
					{
						for (int i_634_ = anInt946; i_634_ < (anInt946 + 27); i_634_++)
						{
							aClass46_Sub1_2.method364((byte) -127, i_634_);
						}
					}
				}
				Class24.anIntArray78[i_628_] = anInt946;
				anInt946 += 27;
			}
			System.out.println(
			        new StringBuilder().append("Loaded: ").append(i_627_).append(" frames of animation").toString());
		}
	}

	private boolean method552(final int i, final boolean bool, final int i_635_, int i_636_, final int i_637_,
	        final int i_638_, int i_639_, final boolean bool_640_, final boolean bool_641_)
	{
		anInt877++;
		int i_642_ = aClass6_1.method46(i, i_635_, bool_641_, i_639_, i_636_, anIntArray155, i_637_, i_638_,
		        anIntArray157, (byte) -108);
		if (i_642_ == -1)
		{
			if (!bool)
			{
				return false;
			}
			i_642_ = 1;
			anIntArray157[0] = i_637_;
			anIntArray155[0] = i_638_;
		}
		i_642_--;
		i_639_ = anIntArray157[i_642_];
		i_636_ = anIntArray155[i_642_];
		if (bool)
		{
			aClass16_Sub1_1.method118(16, 96);
		}
		else
		{
			aClass16_Sub1_1.method118(187, 64);
		}
		i_642_--;
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_639_ + anInt867, (byte) 86);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_636_ - -anInt927, (byte) 126);
		if (bool && (i_642_ == -1) && (((i_639_ + anInt867) % 5) == 0))
		{
			i_642_ = 0;
		}
		for (int i_643_ = i_642_; (i_643_ >= 0) && (i_643_ > (i_642_ + -25)); i_643_--)
		{
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anIntArray157[i_643_] + -i_639_);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, -i_636_ + anIntArray155[i_643_]);
		}
		if (bool_640_ != true)
		{
			anInt1051 = -99;
		}
		aClass16_Sub1_1.method126(2);
		anInt928 = -24;
		anInt854 = this.anInt739;
		anInt888 = this.anInt736;
		return true;
	}

	private void method553(final byte i)
	{
		anInt840++;
		final byte[] is = method468("Configuration", 10, 0, -21865);
		if (is == null)
		{
			aBool52 = true;
		}
		else
		{
			Class17.method130(is, aBool55, 0);
		}
	}

	private void method554(final int i)
	{
		anInt827++;
		final long l = Class52.method377(0);
		if (aClass16_Sub1_1.method128(86))
		{
			aLong17 = l;
		}
		if ((l - aLong17) > 5000L)
		{
			aLong17 = l;
			aClass16_Sub1_1.method118(67, 96);
			aClass16_Sub1_1.method126(2);
		}
		try
		{
			aClass16_Sub1_1.method124((byte) 82, i);
		}
		catch (final IOException ioexception)
		{
			method575(25630);
			return;
		}
		if (method536((byte) -96))
		{
			final int i_644_ = aClass16_Sub1_1.method125(i + -20, aClass27_Sub1_Sub1_2);
			if (i_644_ > 0)
			{
				method497(aClass27_Sub1_Sub1_2.method403(false), 20, i_644_);
			}
		}
	}

	private void method555(final byte i)
	{
		anInt795++;
		int i_645_ = -1;
		if ((anInt887 != 0) && aBool90)
		{
			i_645_ = aClass29_3.method197(this.anInt739, this.anInt736, anInt1063, anInt1014, 0);
		}
		if (i_645_ < 0)
		{
			if (anInt971 == 0)
			{
				if ((anInt887 == 1) && (anInt1036 == 0))
				{
					anInt1036 = 1;
				}
				final int i_646_ = this.anInt739 + -22;
				final int i_647_ = this.anInt736 + -36;
				if ((0 > i_646_) || (i_647_ < 0) || (i_646_ >= 468) || (262 <= i_647_))
				{
					if (anInt887 != 0)
					{
						aBool72 = false;
						aClass16_Sub1_1.method118(197, 92);
						aClass16_Sub1_1.method126(2);
					}
				}
				else
				{
					if (anInt1036 > 0)
					{
						if ((i_646_ > 216) && (i_647_ > 30) && (i_646_ < 462) && (i_647_ < 235))
						{
							final int i_648_ = ((((i_647_ + -31) / 34) * 5) + ((i_646_ - 217) / 49));
							if ((i_648_ >= 0) && (i_648_ < anInt1015))
							{
								method524(0, i_648_, -1);
							}
						}
						if ((8 < i_646_) && (i_647_ > 30) && (i_646_ < 205) && (i_647_ < 129))
						{
							final int i_649_ = (((i_646_ + -9) / 49) - -(((i_647_ + -31) / 34) * 4));
							if ((i_649_ >= 0) && (anInt1061 > i_649_))
							{
								method538(-111, -1, i_649_);
							}
						}
						boolean bool = false;
						if ((i_646_ >= 93) && (i_647_ >= 221) && (i_646_ <= 104) && (i_647_ <= 232))
						{
							bool = true;
							aBool85 = !aBool85;
						}
						if ((i_646_ >= 93) && (240 <= i_647_) && (104 >= i_646_) && (251 >= i_647_))
						{
							bool = true;
							aBool65 = !aBool65;
						}
						if ((191 <= i_646_) && (221 <= i_647_) && (202 >= i_646_) && (232 >= i_647_))
						{
							aBool71 = !aBool71;
							bool = true;
						}
						if ((191 <= i_646_) && (i_647_ >= 240) && (i_646_ <= 202) && (251 >= i_647_))
						{
							aBool79 = !aBool79;
							bool = true;
						}
						if (bool)
						{
							aClass16_Sub1_1.method118(8, 84);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, aBool85 ? 1 : 0);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, !aBool65 ? 0 : 1);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, !aBool71 ? 0 : 1);
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, !aBool79 ? 0 : 1);
							aClass16_Sub1_1.method126(2);
							aBool59 = false;
							aBool75 = false;
						}
						if ((i_646_ >= 217) && (i_647_ >= 238) && (i_646_ <= 286) && (i_647_ <= 259))
						{
							aBool59 = true;
							aClass16_Sub1_1.method118(176, 126);
							aClass16_Sub1_1.method126(2);
						}
						if ((i_646_ >= 394) && (i_647_ >= 238) && (463 > i_646_) && (259 > i_647_))
						{
							aBool72 = false;
							aClass16_Sub1_1.method118(197, 91);
							aClass16_Sub1_1.method126(2);
						}
						anInt887 = 0;
						anInt1036 = 0;
					}
					if (anInt887 == 2)
					{
						if ((216 < i_646_) && (i_647_ > 30) && (i_646_ < 462) && (235 > i_647_))
						{
							final int i_650_ = aClass29_1.method207(true);
							final int i_651_ = aClass29_1.method210(0);
							aBool61 = true;
							anInt984 = this.anInt736 + -7;
							anInt955 = this.anInt739 + -(i_650_ / 2);
							if (0 > anInt984)
							{
								anInt984 = 0;
							}
							if (0 > anInt955)
							{
								anInt955 = 0;
							}
							if (510 < (anInt955 - -i_650_))
							{
								anInt955 = -i_650_ + 510;
							}
							if ((anInt984 - -i_651_) > 315)
							{
								anInt984 = -i_651_ + 315;
							}
							final int i_652_ = (((i_646_ + -217) / 49) + (((i_647_ + -31) / 34) * 5));
							if ((i_652_ >= 0) && (anInt1015 > i_652_))
							{
								final int i_653_ = anIntArray194[i_652_];
								aBool90 = true;
								aClass29_3.method190(true);
								aClass29_3.method195("Stake 1", i_653_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_653_]).toString(), 0, 1, 3);
								aClass29_3.method195("Stake 5", i_653_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_653_]).toString(), 0, 5, 3);
								aClass29_3.method195("Stake 10", i_653_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_653_]).toString(), 0, 10, 3);
								aClass29_3.method195("Stake All", i_653_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_653_]).toString(), 0, -1, 3);
								aClass29_3.method195("Stake X", i_653_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_653_]).toString(), 0, -2, 3);
								final int i_654_ = aClass29_3.method207(true);
								final int i_655_ = aClass29_3.method210(0);
								anInt1063 = this.anInt736 + -7;
								anInt1014 = this.anInt739 + -(i_654_ / 2);
								if (anInt1014 < 0)
								{
									anInt1014 = 0;
								}
								if (0 > anInt1063)
								{
									anInt1063 = 0;
								}
								if (510 < (i_654_ + anInt1014))
								{
									anInt1014 = -i_654_ + 510;
								}
								if (315 < (i_655_ + anInt1063))
								{
									anInt1063 = -i_655_ + 315;
								}
							}
						}
						if ((8 < i_646_) && (30 < i_647_) && (i_646_ < 205) && (i_647_ < 133))
						{
							final int i_656_ = ((i_646_ + -9) / 49) + (((i_647_ + -31) / 34) * 4);
							if ((i_656_ >= 0) && (i_656_ < anInt1061))
							{
								final int i_657_ = anIntArray182[i_656_];
								aBool90 = true;
								aClass29_3.method190(true);
								aClass29_3.method195("Remove 1", i_657_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_657_]).toString(), 0, 1, 4);
								aClass29_3.method195("Remove 5", i_657_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_657_]).toString(), 0, 5, 4);
								aClass29_3.method195("Remove 10", i_657_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_657_]).toString(), 0, 10, 4);
								aClass29_3.method195("Remove All", i_657_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_657_]).toString(), 0, -1, 4);
								aClass29_3.method195("Remove X", i_657_, new StringBuilder().append("@lre@")
								        .append(Class26.aStringArray19[i_657_]).toString(), 0, -2, 4);
								final int i_658_ = aClass29_3.method207(true);
								final int i_659_ = aClass29_3.method210(0);
								anInt1063 = this.anInt736 + -7;
								anInt1014 = this.anInt739 + -(i_658_ / 2);
								if (anInt1014 < 0)
								{
									anInt1014 = 0;
								}
								if (anInt1063 < 0)
								{
									anInt1063 = 0;
								}
								if ((i_658_ + anInt1014) > 510)
								{
									anInt1014 = -i_658_ + 510;
								}
								if ((i_659_ + anInt1063) > 315)
								{
									anInt1063 = -i_659_ + 315;
								}
							}
						}
						anInt887 = 0;
					}
					if (aBool90)
					{
						final int i_660_ = aClass29_3.method207(true);
						final int i_661_ = aClass29_3.method210(0);
						if ((this.anInt739 < (anInt1014 + -10)) || (this.anInt736 < (anInt1063 + -10))
						        || ((i_660_ + anInt1014 + 10) < this.anInt739)
						        || (((i_661_ - -10) + anInt1063) < this.anInt736))
						{
							aBool90 = false;
						}
					}
				}
			}
		}
		else
		{
			aBool90 = false;
			anInt887 = 0;
			final int i_662_ = aClass29_3.method203(0, i_645_);
			final int i_663_ = aClass29_3.method214(i_645_, (byte) 80);
			int i_664_ = -1;
			int i_665_ = 0;
			if (i_662_ != 3)
			{
				for (int i_666_ = 0; anInt1061 > i_666_; i_666_++)
				{
					if (i_663_ == anIntArray182[i_666_])
					{
						if (0 > i_664_)
						{
							i_664_ = i_666_;
						}
						if (Class1.anIntArray1[i_663_] != 0)
						{
							i_665_++;
						}
						else
						{
							i_665_ = anIntArray198[i_666_];
							break;
						}
					}
				}
			}
			else
			{
				for (int i_667_ = 0; i_667_ < anInt1015; i_667_++)
				{
					if (i_663_ == anIntArray194[i_667_])
					{
						if (0 > i_664_)
						{
							i_664_ = i_667_;
						}
						if (Class1.anIntArray1[i_663_] == 0)
						{
							i_665_ = anIntArray166[i_667_];
							break;
						}
						i_665_++;
					}
				}
			}
			if (0 <= i_664_)
			{
				int i_668_ = aClass29_3.method186(i_645_, (byte) -125);
				if (i_668_ != -2)
				{
					if (i_668_ == -1)
					{
						i_668_ = i_665_;
					}
					if (i_662_ != 3)
					{
						method538(-95, i_668_, i_664_);
					}
					else
					{
						method524(0, i_664_, i_668_);
					}
				}
				else
				{
					anInt1011 = i_664_;
					if (i_662_ == 3)
					{
						method516(Class27_Sub1_Sub1.aStringArray39, 7, 5, true);
					}
					else
					{
						method516(Class27.aStringArray22, 8, -127, true);
					}
				}
			}
		}
		if (aBool72)
		{
			final int i_669_ = 22;
			final int i_670_ = 36;
			aClass46_Sub1_2.method321(i_670_, 13175581, 12, 468, i_669_, 1);
			final int i_671_ = 10000536;
			aClass46_Sub1_2.method327(i_669_, i_670_ + 12, 468, 160, 90, i_671_, 18);
			aClass46_Sub1_2.method327(i_669_, i_670_ + 30, 8, 160, 120, i_671_, 248);
			aClass46_Sub1_2.method327(i_669_ - -205, i_670_ + 30, 11, 160, 71, i_671_, 248);
			aClass46_Sub1_2.method327(i_669_ - -462, i_670_ - -30, 6, 160, 120, i_671_, 248);
			aClass46_Sub1_2.method327(i_669_ + 8, i_670_ + 99, 197, 160, 99, i_671_, 24);
			aClass46_Sub1_2.method327(i_669_ - -8, i_670_ + 192, 197, 160, 70, i_671_, 23);
			aClass46_Sub1_2.method327(i_669_ + 8, i_670_ - -258, 197, 160, 69, i_671_, 20);
			aClass46_Sub1_2.method327(i_669_ - -216, i_670_ + 235, 246, 160, 88, i_671_, 43);
			final int i_672_ = 13684944;
			aClass46_Sub1_2.method327(i_669_ + 8, i_670_ + 30, 197, 160, 101, i_672_, 69);
			aClass46_Sub1_2.method327(i_669_ + 8, i_670_ + 123, 197, 160, 98, i_672_, 69);
			aClass46_Sub1_2.method327(i_669_ + 8, i_670_ - -215, 197, 160, 119, i_672_, 43);
			aClass46_Sub1_2.method327(i_669_ + 216, i_670_ + 30, 246, 160, 112, i_672_, 205);
			for (int i_673_ = 0; 3 > i_673_; i_673_++)
			{
				aClass46_Sub1_2.method341(197, (byte) -54, (i_673_ * 34) + i_670_ + 30, i_669_ + 8, 0);
			}
			for (int i_674_ = 0; 3 > i_674_; i_674_++)
			{
				aClass46_Sub1_2.method341(197, (byte) -63, (i_670_ + 123) - -(i_674_ * 34), i_669_ + 8, 0);
			}
			for (int i_676_ = 0; 7 > i_676_; i_676_++)
			{
				aClass46_Sub1_2.method341(246, (byte) -76, (i_676_ * 34) + i_670_ + 30, i_669_ + 216, 0);
			}
			for (int i_677_ = 0; i_677_ < 6; i_677_++)
			{
				if (i_677_ < 5)
				{
					aClass46_Sub1_2.method319(0, 69, i_670_ - -30, true, i_669_ + (i_677_ * 49) + 8);
				}
				if (5 > i_677_)
				{
					aClass46_Sub1_2.method319(0, 69, i_670_ + 123, true, i_669_ + (i_677_ * 49) + 8);
				}
				aClass46_Sub1_2.method319(0, 205, i_670_ + 30, true, i_669_ + (i_677_ * 49) + 216);
			}
			aClass46_Sub1_2.method341(197, (byte) -33, i_670_ + 215, i_669_ + 8, 0);
			aClass46_Sub1_2.method341(197, (byte) -43, i_670_ + 257, i_669_ + 8, 0);
			aClass46_Sub1_2.method319(0, 43, i_670_ + 215, true, i_669_ + 8);
			aClass46_Sub1_2.method319(0, 43, i_670_ + 215, true, i_669_ + 204);
			aClass46_Sub1_2.method324(
			        new StringBuilder().append("Preparing to duel with: ").append(aString32).toString(), 0, 1, 16777215,
			        i_669_ + 1, i_670_ - -10);
			aClass46_Sub1_2.method324("Your Stake", 0, 4, 16777215, i_669_ + 9, i_670_ - -27);
			aClass46_Sub1_2.method324("Opponent's Stake", 0, 4, 16777215, i_669_ - -9, i_670_ + 120);
			aClass46_Sub1_2.method324("Duel Options", 0, 4, 16777215, i_669_ + 9, i_670_ + 212);
			aClass46_Sub1_2.method324("Your Inventory", 0, 4, 16777215, i_669_ + 216, i_670_ - -27);
			aClass46_Sub1_2.method324("No retreating", 0, 3, 16776960, i_669_ + 1 + 8, (i_670_ - -215) + 16);
			aClass46_Sub1_2.method324("No magic", 0, 3, 16776960, i_669_ + 1 + 8, i_670_ + 215 + 35);
			aClass46_Sub1_2.method324("No prayer", 0, 3, 16776960, (i_669_ - -8) + 102, (i_670_ - -215) + 16);
			aClass46_Sub1_2.method324("No weapons", 0, 3, 16776960, (i_669_ + 8) - -102, i_670_ + 250);
			aClass46_Sub1_2.method362(11, i_669_ + 93, (byte) 64, 11, 16776960, i_670_ + 221);
			if (aBool85)
			{
				aClass46_Sub1_2.method321(i_670_ + 215 + 8, 16776960, 7, 7, i_669_ + 95, 1);
			}
			aClass46_Sub1_2.method362(11, i_669_ + 93, (byte) 72, 11, 16776960, i_670_ + 215 + 25);
			if (aBool65)
			{
				aClass46_Sub1_2.method321(i_670_ + 215 + 27, 16776960, 7, 7, i_669_ + 95, 1);
			}
			aClass46_Sub1_2.method362(11, i_669_ + 191, (byte) -69, 11, 16776960, (i_670_ - -215) + 6);
			if (aBool71)
			{
				aClass46_Sub1_2.method321(i_670_ + 223, 16776960, 7, 7, i_669_ + 193, 1);
			}
			aClass46_Sub1_2.method362(11, i_669_ + 191, (byte) 110, 11, 16776960, i_670_ + 215 + 25);
			if (aBool79)
			{
				aClass46_Sub1_2.method321(i_670_ + 242, 16776960, 7, 7, i_669_ + 193, 1);
			}
			if (!aBool59)
			{
				aClass46_Sub1_2.method338(anInt935 + 25, i_670_ + 238, i_669_ + 217, (byte) -70);
			}
			aClass46_Sub1_2.method338(anInt935 - -26, i_670_ - -238, i_669_ + 394, (byte) -70);
			if (aBool75)
			{
				aClass46_Sub1_2.method335(16777215, 255, 1, "Other player", i_670_ - -246, i_669_ + 341);
				aClass46_Sub1_2.method335(16777215, 255, 1, "has accepted", i_670_ + 256, i_669_ + 341);
			}
			if (aBool59)
			{
				aClass46_Sub1_2.method335(16777215, 255, 1, "Waiting for", i_670_ - -246, i_669_ + 217 + 35);
				aClass46_Sub1_2.method335(16777215, 255, 1, "other player", i_670_ + 256, i_669_ + 217 + 35);
			}
			for (int i_678_ = 0; i_678_ < anInt1015; i_678_++)
			{
				final int i_679_ = i_669_ + ((i_678_ % 5) * 49) + 217;
				final int i_680_ = i_670_ + ((i_678_ / 5) * 34) + 31;
				aClass46_Sub1_2.method348(false, 0, -113, 32, i_680_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray194[i_678_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray194[i_678_]]), i_679_);
				if (Class1.anIntArray1[anIntArray194[i_678_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray166[i_678_]).toString(),
					        0, 1, 16776960, i_679_ - -1, i_680_ - -10);
				}
			}
			for (int i_681_ = 0; i_681_ < anInt1061; i_681_++)
			{
				final int i_682_ = (((i_681_ % 4) * 49) + 9) - -i_669_;
				final int i_683_ = i_670_ + ((i_681_ / 4) * 34) + 31;
				aClass46_Sub1_2.method348(false, 0, -124, 32, i_683_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray182[i_681_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray182[i_681_]]), i_682_);
				if (Class1.anIntArray1[anIntArray182[i_681_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray198[i_681_]).toString(),
					        0, 1, 16776960, i_682_ + 1, i_683_ + 10);
				}
				if ((i_682_ < this.anInt739) && (this.anInt739 < (i_682_ + 48)) && (i_683_ < this.anInt736)
				        && ((i_683_ + 32) > this.anInt736))
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[anIntArray182[i_681_]]).append(": @whi@")
					                .append(Class28.aStringArray25[anIntArray182[i_681_]]).toString(),
					        0, 1, 16776960, i_669_ + 8, i_670_ + 273);
				}
			}
			for (int i_684_ = 0; i_684_ < anInt967; i_684_++)
			{
				final int i_685_ = i_669_ + ((i_684_ % 4) * 49) + 9;
				final int i_686_ = (124 - -i_670_) + ((i_684_ / 4) * 34);
				aClass46_Sub1_2.method348(false, 0, -68, 32, i_686_, 48, 0,
				        (AClass1_Sub1.anIntArray144[anIntArray212[i_684_]]) + anInt863,
				        (Class46.anIntArray133[anIntArray212[i_684_]]), i_685_);
				if (Class1.anIntArray1[anIntArray212[i_684_]] == 0)
				{
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray193[i_684_]).toString(),
					        0, 1, 16776960, i_685_ - -1, i_686_ + 10);
				}
				if ((this.anInt739 > i_685_) && (this.anInt739 < (i_685_ - -48)) && (i_686_ < this.anInt736)
				        && (this.anInt736 < (i_686_ - -32)))
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(Class26.aStringArray19[anIntArray212[i_684_]]).append(": @whi@")
					                .append(Class28.aStringArray25[anIntArray212[i_684_]]).toString(),
					        0, 1, 16776960, i_669_ + 8, i_670_ + 273);
				}
			}
			if (aBool90)
			{
				aClass29_3.method204(anInt1014, anInt1063, (byte) -41, this.anInt739, this.anInt736);
			}
		}
	}

	private void method556(final boolean bool, final boolean bool_687_)
	{
		anInt814++;
		int i = aClass46_Sub1_2.anInt502 + -199;
		int i_688_ = 36;
		aClass46_Sub1_2.method338(anInt935 + 3, 3, i + -49, (byte) -70);
		final int i_689_ = 196;
		final int i_690_ = 275;
		int i_692_;
		int i_691_ = i_692_ = Class34.method227(bool, 160, 160, 160);
		if (anInt938 != 0)
		{
			i_692_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_691_ = Class34.method227(false, 220, 220, 220);
		}
		aClass46_Sub1_2.method327(i, i_688_, i_689_ / 2, 128, 73, i_691_, 24);
		aClass46_Sub1_2.method327((i_689_ / 2) + i, i_688_, i_689_ / 2, 128, 79, i_692_, 24);
		aClass46_Sub1_2.method327(i, i_688_ + 24, i_689_, 128, 102, Class34.method227(false, 220, 220, 220),
		        i_690_ - 24);
		aClass46_Sub1_2.method341(i_689_, (byte) -88, i_688_ + 24, i, 0);
		aClass46_Sub1_2.method319(0, 24, i_688_ + 0, true, (i_689_ / 2) + i);
		aClass46_Sub1_2.method335(0, 255, 4, "Stats", i_688_ - -16, i - -(i_689_ / 4));
		aClass46_Sub1_2.method335(0, 255, 4, "Quests", i_688_ - -16, (i_689_ / 2) + (i - -(i_689_ / 4)));
		if (anInt938 == 0)
		{
			int i_693_ = 72;
			int i_694_ = -1;
			aClass46_Sub1_2.method324("Skills", 0, 3, 16776960, i + 5, i_693_);
			i_693_ += 13;
			for (int i_695_ = 0; i_695_ < 9; i_695_++)
			{
				int i_696_ = 16777215;
				if ((this.anInt739 > (i - -3)) && ((i_693_ - 11) <= this.anInt736) && ((i_693_ + 2) > this.anInt736)
				        && (this.anInt739 < (i + 90)))
				{
					i_694_ = i_695_;
					i_696_ = 16711680;
				}
				aClass46_Sub1_2.method324(
				        new StringBuilder().append(aStringArray51[i_695_]).append(":@yel@")
				                .append(anIntArray185[i_695_]).append("/").append(anIntArray200[i_695_]).toString(),
				        0, 1, i_696_, i + 5, i_693_);
				i_696_ = 16777215;
				if (((i + 90) <= this.anInt739) && (((i_693_ + -11) - 13) <= this.anInt736)
				        && (((i_693_ - -2) + -13) > this.anInt736) && (this.anInt739 < (i - -196)))
				{
					i_696_ = 16711680;
					i_694_ = i_695_ - -9;
				}
				aClass46_Sub1_2.method324(new StringBuilder().append(aStringArray51[i_695_ + 9]).append(":@yel@")
				        .append(anIntArray185[i_695_ + 9]).append("/").append(anIntArray200[i_695_ + 9]).toString(), 0,
				        1, i_696_, ((i_689_ / 2) + i) - 5, i_693_ + -13);
				i_693_ += 13;
			}
			aClass46_Sub1_2.method324(new StringBuilder().append("Quest Points:@yel@").append(anInt975).toString(), 0,
			        1, 16777215, (i_689_ / 2) + i + -5, i_693_ + -13);
			i_693_ += 12;
			aClass46_Sub1_2.method324(
			        new StringBuilder().append("Fatigue: @yel@").append((anInt950 * 100) / 750).append("%").toString(),
			        0, 1, 16777215, i + 5, i_693_ - 13);
			i_693_ += 8;
			aClass46_Sub1_2.method324("Equipment Status", 0, 3, 16776960, i + 5, i_693_);
			i_693_ += 12;
			for (int i_697_ = 0; i_697_ < 3; i_697_++)
			{
				aClass46_Sub1_2.method324(new StringBuilder().append(aStringArray50[i_697_]).append(":@yel@")
				        .append(anIntArray186[i_697_]).toString(), 0, 1, 16777215, i + 5, i_693_);
				if (i_697_ < 2)
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(aStringArray50[i_697_ + 3]).append(":@yel@")
					                .append(anIntArray186[i_697_ + 3]).toString(),
					        0, 1, 16777215, ((i_689_ / 2) + i) - -25, i_693_);
				}
				i_693_ += 13;
			}
			i_693_ += 6;
			aClass46_Sub1_2.method341(i_689_, (byte) -19, i_693_ + -15, i, 0);
			if (i_694_ != -1)
			{
				aClass46_Sub1_2.method324(
				        new StringBuilder().append(aStringArray48[i_694_]).append(" skill").toString(), 0, 1, 16776960,
				        i + 5, i_693_);
				i_693_ += 12;
				int i_698_ = anIntArray161[0];
				for (int i_699_ = 0; 98 > i_699_; i_699_++)
				{
					if (anIntArray189[i_694_] >= anIntArray161[i_699_])
					{
						i_698_ = anIntArray161[i_699_ + 1];
					}
				}
				aClass46_Sub1_2.method324(
				        new StringBuilder().append("Total xp: ").append(anIntArray189[i_694_] / 4).toString(), 0, 1,
				        16777215, i + 5, i_693_);
				i_693_ += 12;
				aClass46_Sub1_2.method324(new StringBuilder().append("Next level at: ").append(i_698_ / 4).toString(),
				        0, 1, 16777215, i + 5, i_693_);
			}
			else
			{
				aClass46_Sub1_2.method324("Overall levels", 0, 1, 16776960, i + 5, i_693_);
				i_693_ += 12;
				int i_700_ = 0;
				for (int i_701_ = 0; 18 > i_701_; i_701_++)
				{
					i_700_ += anIntArray200[i_701_];
				}
				aClass46_Sub1_2.method324(new StringBuilder().append("Skill total: ").append(i_700_).toString(), 0, 1,
				        16777215, i + 5, i_693_);
				i_693_ += 12;
				aClass46_Sub1_2.method324(
				        new StringBuilder().append("Combat level: ").append(aClass15_1.anInt151).toString(), 0, 1,
				        16777215, i + 5, i_693_);
				i_693_ += 12;
			}
		}
		if (anInt938 == 1)
		{
			aClass10_6.method75(0, anInt1064);
			aClass10_6.method68(null, anInt1064, null, 0, 0, 0, "@whi@Quest-list (green=completed)");
			for (int i_702_ = 0; i_702_ < 50; i_702_++)
			{
				aClass10_6.method68(null, anInt1064, null, 0, i_702_ + 1, 0, new StringBuilder()
				        .append(!aBoolArray12[i_702_] ? "@red@" : "@gre@").append(aStringArray46[i_702_]).toString());
			}
			aClass10_6.method71(-6);
		}
		if (bool_687_)
		{
			i_688_ = this.anInt736 + -36;
			i = (-aClass46_Sub1_2.anInt502 - (-199 - this.anInt739));
			if ((0 <= i) && (0 <= i_688_) && (i_689_ > i) && (i_688_ < i_690_))
			{
				if (anInt938 == 1)
				{
					aClass10_6.method85(this.anInt737, i_688_ + 36, this.anInt738, (byte) -99,
					        ((aClass46_Sub1_2.anInt502) + i) - 199);
				}
				if ((i_688_ <= 24) && (anInt887 == 1))
				{
					if (i < 98)
					{
						anInt938 = 0;
					}
					else if (98 < i)
					{
						anInt938 = 1;
					}
				}
			}
		}
	}

	private boolean method557(int i, final int i_703_, final int i_704_, final int i_705_, final int i_706_,
	        final boolean bool, int i_707_, final boolean bool_708_, final int i_709_)
	{
		anInt764++;
		int i_710_ = aClass6_1.method46(i_709_, i_704_, bool_708_, i_707_, i, anIntArray155, i_703_, i_705_,
		        anIntArray157, (byte) -99);
		if (i_710_ == -1)
		{
			return false;
		}
		i_710_--;
		i_707_ = anIntArray157[i_710_];
		i = anIntArray155[i_710_];
		if (i_706_ <= 111)
		{
			return false;
		}
		if (!bool)
		{
			aClass16_Sub1_1.method118(187, 89);
		}
		else
		{
			aClass16_Sub1_1.method118(16, 83);
		}
		i_710_--;
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_707_ + anInt867, (byte) 95);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anInt927 + i, (byte) 112);
		if (bool && (i_710_ == -1) && (((i_707_ + anInt867) % 5) == 0))
		{
			i_710_ = 0;
		}
		for (int i_711_ = i_710_; (0 <= i_711_) && ((i_710_ + -25) < i_711_); i_711_--)
		{
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anIntArray157[i_711_] + -i_707_);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, -i + anIntArray155[i_711_]);
		}
		aClass16_Sub1_1.method126(2);
		anInt928 = -24;
		anInt888 = this.anInt736;
		anInt854 = this.anInt739;
		return true;
	}

	private void method558(final int i, final int i_712_, final int i_713_, final int i_714_)
	{
		if (i_713_ <= 35)
		{
			method510(null, null, 119);
		}
		if (i != 0)
		{
			if (i == 1)
			{
				method552(i_712_, true, i_714_, anInt1001, i_714_ + -1, i_712_, anInt1030, true, false);
			}
			else
			{
				method552(i_712_, true, i_714_, anInt1001, i_714_, i_712_, anInt1030, true, true);
			}
		}
		else
		{
			method552(i_712_, true, i_714_, anInt1001, i_714_, i_712_ - 1, anInt1030, true, false);
		}
		anInt865++;
	}

	private void method559(final int i)
	{
		aClass10_2 = new Class10(aClass46_Sub1_2, 10);
		anInt824++;
		anInt1052 = aClass10_2.method74(1, 502, 56, 100, 5, 269, true, 20);
		anInt1019 = aClass10_2.method76(80, 324, 498, 7, true, 14, 1, 5, false);
		if (i == -23945)
		{
			anInt987 = aClass10_2.method74(1, 502, 56, i + 24067, 5, 269, true, 20);
			anInt990 = aClass10_2.method74(1, 502, 56, -110, 5, 269, true, 20);
			aClass10_2.method91((byte) 123, anInt1019);
		}
	}

	private void method560(final boolean bool, final int i, final boolean bool_715_, final int i_716_, final int i_717_,
	        final int i_718_)
	{
		anInt782++;
		method552(i_716_, bool, i_718_, i, i_718_, i_716_, i_717_, bool_715_, false);
	}

	private void method561(final byte i)
	{
		anInt768++;
		boolean bool = true;
		while (bool)
		{
			bool = false;
			for (int i_719_ = 0; (Class16.anInt185 + -1) > i_719_; i_719_++)
			{
				if ((((0x2 & Class7.anIntArray18[i_719_]) == 0) && ((0x2 & Class7.anIntArray18[i_719_ + 1]) != 0))
				        || (((Class7.anIntArray18[i_719_] & 0x4) == 0)
				                && ((Class7.anIntArray18[i_719_ + 1] & 0x4) != 0)))
				{
					final String string = Class10.aStringArray8[i_719_];
					Class10.aStringArray8[i_719_] = Class10.aStringArray8[i_719_ + 1];
					Class10.aStringArray8[i_719_ + 1] = string;
					String string_720_ = Class28.aStringArray24[i_719_];
					Class28.aStringArray24[i_719_] = Class28.aStringArray24[i_719_ - -1];
					Class28.aStringArray24[i_719_ + 1] = string_720_;
					string_720_ = RuntimeException_Sub1.aStringArray41[i_719_];
					RuntimeException_Sub1.aStringArray41[i_719_] = RuntimeException_Sub1.aStringArray41[i_719_ + 1];
					RuntimeException_Sub1.aStringArray41[i_719_ + 1] = string_720_;
					final int i_721_ = Class7.anIntArray18[i_719_];
					Class7.anIntArray18[i_719_] = Class7.anIntArray18[i_719_ + 1];
					bool = true;
					Class7.anIntArray18[i_719_ + 1] = i_721_;
				}
			}
		}
	}

	private void method562(final int i)
	{
		anInt848++;
		if (anInt887 != 0)
		{
			for (int i_722_ = 0; i_722_ < anInt953; i_722_++)
			{
				if ((this.anInt739 < aClass46_Sub1_2.method328(aStringArray45[i_722_], -116, 1))
				        && (this.anInt736 > (i_722_ * 12)) && ((12 - -(i_722_ * 12)) > this.anInt736))
				{
					aClass16_Sub1_1.method118(116, i ^ 0x80507d);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i + -8440654, i_722_);
					aClass16_Sub1_1.method126(2);
					break;
				}
			}
			aBool70 = false;
			anInt887 = 0;
		}
		else
		{
			if (i != 8409088)
			{
				anInt949 = 4;
			}
			for (int i_723_ = 0; i_723_ < anInt953; i_723_++)
			{
				int i_724_ = 65535;
				if ((this.anInt739 < aClass46_Sub1_2.method328(aStringArray45[i_723_], i ^ ~0x805065, 1))
				        && (this.anInt736 > (i_723_ * 12)) && (this.anInt736 < ((i_723_ * 12) + 12)))
				{
					i_724_ = 16711680;
				}
				aClass46_Sub1_2.method324(aStringArray45[i_723_], i + -8409088, 1, i_724_, 6, (i_723_ * 12) + 12);
			}
		}
	}

	private void method563(final String string, final int i)
	{
		aClass16_Sub1_1.method118(38, i + 11411);
		anInt778++;
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(i + 11350, string);
		if (i != -11350)
		{
			anInt1004 = -61;
		}
		aClass16_Sub1_1.method126(2);
	}

	private void method564(final byte i, final String string)
	{
		anInt779++;
		if ((anAClass4_Sub2_1 != null) && !aBool58)
		{
			final int i_726_ = RuntimeException_Sub1
			        .method461(new StringBuilder().append(string).append(".pcm").toString(), aByteArray28, false);
			final int i_727_ = Frame_Sub1.method487((byte) 113,
			        new StringBuilder().append(string).append(".pcm").toString(), aByteArray28);
			if (i_727_ != 0)
			{
				final AClass3_Sub1 aclass3_sub1 = new AClass3_Sub1(8000,
				        Class28.method180(i_727_, (byte) 99, aByteArray28, i_726_), 0, i_727_);
				anAClass4_Sub2_1.method450(aclass3_sub1, 100, 256);
			}
		}
	}

	private boolean method565(final byte i, final int i_728_)
	{
		anInt898++;
		for (int i_729_ = 0; i_729_ < anInt1015; i_729_++)
		{
			if ((i_728_ == anIntArray194[i_729_]) && (anIntArray205[i_729_] == 1))
			{
				return true;
			}
		}
		return false;
	}

	private void method566(final byte i)
	{
		this.aString25 = "";
		anInt875++;
		this.aString24 = "";
	}

	private void method567(final int i)
	{
		anInt785++;
		final int i_731_ = 408;
		final int i_732_ = 334;
		if ((0 < anInt1045) && (anInt982 <= 48))
		{
			anInt1045 = 0;
		}
		if ((anInt1045 > 1) && (96 >= anInt982))
		{
			anInt1045 = 1;
		}
		if ((anInt1045 > 2) && (anInt982 <= 144))
		{
			anInt1045 = 2;
		}
		if ((anInt982 <= anInt983) || (anInt983 < 0))
		{
			anInt983 = -1;
		}
		if ((anInt983 != -1) && (anIntArray210[anInt983] != anInt1031))
		{
			anInt983 = -1;
			anInt1031 = -2;
		}
		if ((anInt971 == 0) && (anInt887 != 0))
		{
			anInt887 = 0;
			int i_733_ = this.anInt739 - 256 - -(i_731_ / 2);
			int i_734_ = this.anInt736 - (-(i_732_ / 2) + 170);
			if ((i_733_ >= 0) && (i_734_ >= 12) && (i_733_ < 408) && (280 > i_734_))
			{
				int i_735_ = anInt1045 * 48;
				for (int i_736_ = 0; 6 > i_736_; i_736_++)
				{
					for (int i_737_ = 0; 8 > i_737_; i_737_++)
					{
						final int i_738_ = (i_737_ * 49) + 7;
						final int i_739_ = (i_736_ * 34) + 28;
						if ((i_738_ < i_733_) && (i_733_ < (i_738_ + 49)) && (i_734_ > i_739_)
						        && (i_734_ < (i_739_ - -34)) && (anInt982 > i_735_) && (anIntArray210[i_735_] != -1))
						{
							anInt1031 = anIntArray210[i_735_];
							anInt983 = i_735_;
						}
						i_735_++;
					}
				}
				i_733_ = -(i_731_ / 2) + 256;
				i_734_ = -(i_732_ / 2) + 170;
				int i_740_;
				if (0 <= anInt983)
				{
					i_740_ = anIntArray210[anInt983];
				}
				else
				{
					i_740_ = -1;
				}
				if (i_740_ != -1)
				{
					i_735_ = anIntArray184[anInt983];
					if ((i_735_ >= 1) && (this.anInt739 >= (i_733_ - -220)) && ((i_734_ + 238) <= this.anInt736)
					        && (this.anInt739 < (i_733_ + 250)) && (this.anInt736 <= (i_734_ + 249)))
					{
						aClass16_Sub1_1.method118(22, 67);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 86);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(1, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
						aClass16_Sub1_1.method126(i ^ 0x3);
					}
					if ((i_735_ >= 5) && ((i_733_ + 250) <= this.anInt739) && (this.anInt736 >= (i_734_ + 238))
					        && ((i_733_ + 280) > this.anInt739) && ((i_734_ - -249) >= this.anInt736))
					{
						aClass16_Sub1_1.method118(22, 127);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 72);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(5, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((10 <= i_735_) && (this.anInt739 >= (i_733_ + 280)) && ((i_734_ + 238) <= this.anInt736)
					        && (this.anInt739 < (i_733_ + 305)) && ((i_734_ + 249) >= this.anInt736))
					{
						aClass16_Sub1_1.method118(22, 66);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 62);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(10, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((i_735_ >= 50) && (this.anInt739 >= (i_733_ + 305)) && ((i_734_ + 238) <= this.anInt736)
					        && ((i_733_ + 335) > this.anInt739) && (this.anInt736 <= (i_734_ - -249)))
					{
						aClass16_Sub1_1.method118(22, 102);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 118);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(50, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((this.anInt739 >= (i_733_ + 335)) && (this.anInt736 >= (i_734_ - -238))
					        && ((i_733_ - -368) > this.anInt739) && (this.anInt736 <= (i_734_ + 249)))
					{
						method516(Class43.aStringArray29, 3, -128, true);
					}
					if (((i_733_ + 370) <= this.anInt739) && ((i_734_ + 238) <= this.anInt736)
					        && ((i_733_ + 400) > this.anInt739) && (this.anInt736 <= (i_734_ + 249)))
					{
						aClass16_Sub1_1.method118(22, 83);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 96);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(i_735_, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(305419896, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((1 <= method584(i_740_, false)) && ((i_733_ - -220) <= this.anInt739)
					        && ((i_734_ - -263) <= this.anInt736) && ((i_733_ + 250) > this.anInt739)
					        && ((i_734_ + 274) >= this.anInt736))
					{
						aClass16_Sub1_1.method118(23, 76);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 58);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(1, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((5 <= method584(i_740_, false)) && ((i_733_ + 250) <= this.anInt739)
					        && (this.anInt736 >= (i_734_ + 263)) && (this.anInt739 < (i_733_ + 280))
					        && ((i_734_ + 274) >= this.anInt736))
					{
						aClass16_Sub1_1.method118(23, 125);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 57);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(5, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
						aClass16_Sub1_1.method126(2);
					}
					if ((10 <= method584(i_740_, false)) && (this.anInt739 >= (i_733_ + 280))
					        && ((i_734_ + 263) <= this.anInt736) && ((i_733_ + 305) > this.anInt739)
					        && ((i_734_ + 274) >= this.anInt736))
					{
						aClass16_Sub1_1.method118(23, 124);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 105);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(10, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
						aClass16_Sub1_1.method126(i + 1);
					}
					if ((50 <= method584(i_740_, false)) && ((i_733_ + 305) <= this.anInt739)
					        && ((i_734_ + 263) <= this.anInt736) && ((i_733_ + 335) > this.anInt739)
					        && (this.anInt736 <= (i_734_ + 274)))
					{
						aClass16_Sub1_1.method118(23, i ^ 0x75);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 103);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(50, true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
						aClass16_Sub1_1.method126(i + 1);
					}
					if (((i_733_ + 335) <= this.anInt739) && ((i_734_ - -263) <= this.anInt736)
					        && ((i_733_ + 368) > this.anInt739) && (this.anInt736 <= (i_734_ + 274)))
					{
						method516(Class45.aStringArray31, 4, 68, true);
					}
					if (((i_733_ + 370) <= this.anInt739) && ((i_734_ + 263) <= this.anInt736)
					        && ((i_733_ + 400) > this.anInt739) && (this.anInt736 <= (i_734_ + 274)))
					{
						aClass16_Sub1_1.method118(23, i ^ 0x4a);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_740_, (byte) 70);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(method584(i_740_, false), true);
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method395(-2023406815, true);
						aClass16_Sub1_1.method126(2);
					}
				}
			}
			else if ((anInt982 > 48) && (50 <= i_733_) && (115 >= i_733_) && (12 >= i_734_))
			{
				anInt1045 = 0;
			}
			else if ((anInt982 <= 48) || (115 > i_733_) || (180 < i_733_) || (12 < i_734_))
			{
				if ((anInt982 <= 96) || (i_733_ < 180) || (i_733_ > 245) || (12 < i_734_))
				{
					if ((anInt982 > 144) && (i_733_ >= 245) && (i_733_ <= 310) && (i_734_ <= 12))
					{
						anInt1045 = 3;
					}
					else
					{
						aClass16_Sub1_1.method118(212, 118);
						aClass16_Sub1_1.method126(2);
						aBool81 = false;
						return;
					}
				}
				else
				{
					anInt1045 = 2;
				}
			}
			else
			{
				anInt1045 = 1;
			}
		}
		final int i_741_ = -(i_731_ / 2) + 256;
		final int i_742_ = -(i_732_ / 2) + 170;
		aClass46_Sub1_2.method321(i_742_, 192, 12, 408, i_741_, i ^ 0x0);
		final int i_743_ = 10000536;
		aClass46_Sub1_2.method327(i_741_, i_742_ + 12, 408, 160, 118, i_743_, 17);
		aClass46_Sub1_2.method327(i_741_, i_742_ + 29, 8, 160, 110, i_743_, 204);
		aClass46_Sub1_2.method327(i_741_ + 399, i_742_ + 29, 9, 160, 102, i_743_, 204);
		aClass46_Sub1_2.method327(i_741_, i_742_ - -233, 408, 160, 74, i_743_, 47);
		aClass46_Sub1_2.method324("Bank", 0, i, 16777215, i_741_ + 1, i_742_ - -10);
		int i_744_ = 50;
		if (anInt982 > 48)
		{
			int i_745_ = 16777215;
			if (anInt1045 != 0)
			{
				if ((this.anInt739 > (i_744_ + i_741_)) && (this.anInt736 >= i_742_)
				        && (this.anInt739 < ((i_741_ - -i_744_) + 65)) && ((i_742_ + 12) > this.anInt736))
				{
					i_745_ = 16776960;
				}
			}
			else
			{
				i_745_ = 16711680;
			}
			aClass46_Sub1_2.method324("<page 1>", 0, 1, i_745_, i_741_ + i_744_, i_742_ + 10);
			i_744_ += 65;
			i_745_ = 16777215;
			if (anInt1045 == 1)
			{
				i_745_ = 16711680;
			}
			else if (((i_744_ + i_741_) < this.anInt739) && (this.anInt736 >= i_742_)
			        && (this.anInt739 < (i_741_ + i_744_ + 65)) && (this.anInt736 < (i_742_ + 12)))
			{
				i_745_ = 16776960;
			}
			aClass46_Sub1_2.method324("<page 2>", 0, 1, i_745_, i_744_ + i_741_, i_742_ + 10);
			i_744_ += 65;
		}
		if (96 < anInt982)
		{
			int i_746_ = 16777215;
			if (anInt1045 == 2)
			{
				i_746_ = 16711680;
			}
			else if (((i_744_ + i_741_) < this.anInt739) && (i_742_ <= this.anInt736)
			        && ((i_741_ + (i_744_ - -65)) > this.anInt739) && (this.anInt736 < (i_742_ + 12)))
			{
				i_746_ = 16776960;
			}
			aClass46_Sub1_2.method324("<page 3>", i + -1, 1, i_746_, i_741_ + i_744_, i_742_ + 10);
			i_744_ += 65;
		}
		if (144 < anInt982)
		{
			int i_747_ = 16777215;
			if (anInt1045 == 3)
			{
				i_747_ = 16711680;
			}
			else if ((this.anInt739 > (i_744_ + i_741_)) && (i_742_ <= this.anInt736)
			        && ((i_741_ + i_744_ + 65) > this.anInt739) && ((i_742_ + 12) > this.anInt736))
			{
				i_747_ = 16776960;
			}
			aClass46_Sub1_2.method324("<page 4>", 0, 1, i_747_, i_744_ + i_741_, i_742_ + 10);
			i_744_ += 65;
		}
		int i_748_ = 16777215;
		if (((i_741_ + 320) < this.anInt739) && (this.anInt736 >= i_742_) && (this.anInt739 < (i_741_ + 408))
		        && ((i_742_ + 12) > this.anInt736))
		{
			i_748_ = 16711680;
		}
		aClass46_Sub1_2.method313(i_748_, i_741_ + 406, 1, (byte) -49, i_742_ - -10, "Close window");
		aClass46_Sub1_2.method324("Number in bank in green", 0, 1, 65280, i_741_ - -7, i_742_ + 24);
		aClass46_Sub1_2.method324("Number held in blue", i + -1, 1, 65535, i_741_ - -289, i_742_ + 24);
		final int i_749_ = 13684944;
		int i_750_ = anInt1045 * 48;
		for (int i_751_ = 0; i_751_ < 6; i_751_++)
		{
			for (int i_752_ = 0; i_752_ < 8; i_752_++)
			{
				final int i_753_ = (i_741_ + 7) - -(i_752_ * 49);
				final int i_754_ = i_742_ + (28 - -(i_751_ * 34));
				if (i_750_ != anInt983)
				{
					aClass46_Sub1_2.method327(i_753_, i_754_, 49, 160, i + 75, i_749_, 34);
				}
				else
				{
					aClass46_Sub1_2.method327(i_753_, i_754_, 49, 160, i ^ 0x65, 16711680, 34);
				}
				aClass46_Sub1_2.method362(35, i_753_, (byte) -69, 50, 0, i_754_);
				if ((i_750_ < anInt982) && (anIntArray210[i_750_] != -1))
				{
					aClass46_Sub1_2.method348(false, 0, -75, 32, i_754_, 48, 0,
					        ((AClass1_Sub1.anIntArray144[anIntArray210[i_750_]]) + anInt863),
					        (Class46.anIntArray133[anIntArray210[i_750_]]), i_753_);
					aClass46_Sub1_2.method324(new StringBuilder().append("").append(anIntArray184[i_750_]).toString(),
					        0, 1, 65280, i_753_ + 1, i_754_ + 10);
					aClass46_Sub1_2.method313(65535, i_753_ - -47, 1, (byte) -72, i_754_ - -29, new StringBuilder()
					        .append("").append(method584((anIntArray210[i_750_]), false)).toString());
				}
				i_750_++;
			}
		}
		aClass46_Sub1_2.method341(398, (byte) -73, i_742_ + 256, i_741_ + 5, 0);
		if (anInt983 == -1)
		{
			aClass46_Sub1_2.method335(16776960, i ^ 0xfe, 3, "Select an object to withdraw or deposit", i_742_ + 248,
			        i_741_ + 204);
		}
		else
		{
			int i_755_;
			if (0 > anInt983)
			{
				i_755_ = -1;
			}
			else
			{
				i_755_ = anIntArray210[anInt983];
			}
			if (i_755_ != -1)
			{
				i_750_ = anIntArray184[anInt983];
				if ((Class1.anIntArray1[i_755_] == 1) && (1 < i_750_))
				{
					i_750_ = 1;
				}
				if (i_750_ > 0)
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append("Withdraw ").append(Class26.aStringArray19[i_755_]).toString(),
					        0, 1, 16777215, i_741_ + 2, i_742_ + 248);
					i_748_ = 16777215;
					if ((this.anInt739 >= (i_741_ + 220)) && (this.anInt736 >= (i_742_ + 238))
					        && (this.anInt739 < (i_741_ + 250)) && (this.anInt736 <= (i_742_ + 249)))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("One", 0, 1, i_748_, i_741_ + 222, i_742_ + 248);
					if (i_750_ >= 5)
					{
						i_748_ = 16777215;
						if ((this.anInt739 >= (i_741_ + 250)) && ((i_742_ + 238) <= this.anInt736)
						        && ((i_741_ + 280) > this.anInt739) && ((i_742_ + 249) >= this.anInt736))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("Five", 0, 1, i_748_, i_741_ + 252, i_742_ - -248);
					}
					if (10 <= i_750_)
					{
						i_748_ = 16777215;
						if (((i_741_ + 280) <= this.anInt739) && (this.anInt736 >= (i_742_ + 238))
						        && (this.anInt739 < (i_741_ + 305)) && ((i_742_ + 249) >= this.anInt736))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("10", 0, 1, i_748_, i_741_ - -282, i_742_ + 248);
					}
					if (i_750_ >= 50)
					{
						i_748_ = 16777215;
						if ((this.anInt739 >= (i_741_ - -305)) && (this.anInt736 >= (i_742_ - -238))
						        && ((i_741_ + 335) > this.anInt739) && (this.anInt736 <= (i_742_ + 249)))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("50", 0, 1, i_748_, i_741_ - -307, i_742_ + 248);
					}
					i_748_ = 16777215;
					if ((this.anInt739 >= (i_741_ + 335)) && ((i_742_ + 238) <= this.anInt736)
					        && ((i_741_ - -368) > this.anInt739) && ((i_742_ + 249) >= this.anInt736))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("X", 0, 1, i_748_, i_741_ + 337, i_742_ - -248);
					i_748_ = 16777215;
					if (((i_741_ + 370) <= this.anInt739) && (this.anInt736 >= (i_742_ + 238))
					        && ((i_741_ + 400) > this.anInt739) && (this.anInt736 <= (i_742_ + 249)))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("All", 0, 1, i_748_, i_741_ + 370, i_742_ + 248);
				}
				if (0 < method584(i_755_, false))
				{
					aClass46_Sub1_2.method324(
					        new StringBuilder().append("Deposit ").append(Class26.aStringArray19[i_755_]).toString(),
					        i ^ 0x1, 1, 16777215, i_741_ + 2, i_742_ + 273);
					i_748_ = 16777215;
					if (((i_741_ + 220) <= this.anInt739) && ((i_742_ + 263) <= this.anInt736)
					        && (this.anInt739 < (i_741_ + 250)) && (this.anInt736 <= (i_742_ + 274)))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("One", 0, 1, i_748_, i_741_ - -222, i_742_ + 273);
					if (5 <= method584(i_755_, false))
					{
						i_748_ = 16777215;
						if ((this.anInt739 >= (i_741_ + 250)) && (this.anInt736 >= (i_742_ + 263))
						        && (this.anInt739 < (i_741_ - -280)) && (this.anInt736 <= (i_742_ + 274)))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("Five", 0, 1, i_748_, i_741_ - -252, i_742_ + 273);
					}
					if (method584(i_755_, false) >= 10)
					{
						i_748_ = 16777215;
						if (((i_741_ + 280) <= this.anInt739) && (this.anInt736 >= (i_742_ + 263))
						        && (this.anInt739 < (i_741_ + 305)) && (this.anInt736 <= (i_742_ + 274)))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("10", 0, 1, i_748_, i_741_ + 282, i_742_ - -273);
					}
					if (50 <= method584(i_755_, false))
					{
						i_748_ = 16777215;
						if (((i_741_ + 305) <= this.anInt739) && ((i_742_ + 263) <= this.anInt736)
						        && (this.anInt739 < (i_741_ + 335)) && ((i_742_ + 274) >= this.anInt736))
						{
							i_748_ = 16711680;
						}
						aClass46_Sub1_2.method324("50", 0, 1, i_748_, i_741_ - -307, i_742_ - -273);
					}
					i_748_ = 16777215;
					if ((this.anInt739 >= (i_741_ - -335)) && ((i_742_ + 263) <= this.anInt736)
					        && (this.anInt739 < (i_741_ + 368)) && ((i_742_ - -274) >= this.anInt736))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("X", 0, 1, i_748_, i_741_ + 337, i_742_ + 273);
					i_748_ = 16777215;
					if (((i_741_ + 370) <= this.anInt739) && (this.anInt736 >= (i_742_ + 263))
					        && ((i_741_ + 400) > this.anInt739) && (this.anInt736 <= (i_742_ + 274)))
					{
						i_748_ = 16711680;
					}
					aClass46_Sub1_2.method324("All", 0, 1, i_748_, i_741_ - -370, i_742_ + 273);
				}
			}
		}
	}

	private void method568(final int i)
	{
		anInt760++;
		aClass6_1.aByteArray4 = method468("map", 70, 4, -21865);
		if (aBool55)
		{
			aClass6_1.aByteArray1 = method468("members map", 75, 5, -21865);
		}
		aClass6_1.aByteArray3 = method468("landscape", 80, 6, -21865);
		if (aBool55)
		{
			aClass6_1.aByteArray2 = method468("members landscape", 85, 7, -21865);
		}
	}

	private void method569(final int i, final int i_756_)
	{
		anInt895++;
		final int i_757_ = aClass29_1.method203(i_756_ + -617, i);
		final int i_758_ = aClass29_1.method214(i, (byte) 80);
		final int i_759_ = aClass29_1.method186(i, (byte) -115);
		final int i_760_ = aClass29_1.method211(true, i);
		final int i_761_ = aClass29_1.method200(true, i);
		final int i_762_ = aClass29_1.method192(i_756_ + 1274, i);
		final String string = aClass29_1.method187(i, 57);
		if (i_757_ == 200)
		{
			method545(anInt1001, anInt1030, i_759_, i_758_, true, (byte) -110);
			aClass16_Sub1_1.method118(249, 116);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 90);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 125);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_760_, (byte) 57);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_761_, (byte) 80);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 210)
		{
			method545(anInt1001, anInt1030, i_759_, i_758_, true, (byte) -110);
			aClass16_Sub1_1.method118(53, 125);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ - -anInt867, (byte) 59);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 101);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_760_, (byte) 55);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_761_, (byte) 54);
			aClass16_Sub1_1.method126(2);
			anInt989 = -1;
		}
		if (i_757_ == 220)
		{
			method545(anInt1001, anInt1030, i_759_, i_758_, true, (byte) -110);
			aClass16_Sub1_1.method118(247, i_756_ ^ 0x254);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 72);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 58);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_760_, (byte) 109);
			aClass16_Sub1_1.method126(i_756_ + -615);
		}
		if ((i_757_ == 3600) || (i_757_ == 3200))
		{
			method513(0, Class28.aStringArray25[i_758_], 0, null, i_756_ ^ ~0x204, null, null, false);
		}
		if (i_757_ == 300)
		{
			method558(i_760_, i_759_, 47, i_758_);
			aClass16_Sub1_1.method118(180, 75);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 72);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 102);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i_756_ + -32183, i_760_);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_761_, (byte) 104);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 310)
		{
			method558(i_760_, i_759_, 49, i_758_);
			aClass16_Sub1_1.method118(161, 92);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ - -anInt867, (byte) 54);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 58);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i_756_ ^ ~0x7924, i_760_);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_761_, (byte) 122);
			aClass16_Sub1_1.method126(2);
			anInt989 = -1;
		}
		if (i_757_ == 320)
		{
			method558(i_760_, i_759_, 84, i_758_);
			aClass16_Sub1_1.method118(14, 124);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 112);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ - -anInt927, (byte) 85);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i_756_ + -32183, i_760_);
			aClass16_Sub1_1.method126(i_756_ ^ 0x26b);
		}
		if (i_757_ == 2300)
		{
			method558(i_760_, i_759_, i_756_ + -500, i_758_);
			aClass16_Sub1_1.method118(127, 100);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 96);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 118);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_760_);
			aClass16_Sub1_1.method126(i_756_ + -615);
		}
		if (i_757_ == 3300)
		{
			method513(0, Applet_Sub1.aStringArray44[i_758_], 0, null, -127, null, null, false);
		}
		if (i_757_ == 400)
		{
			method576((byte) 119, i_760_, i_758_, i_759_, i_761_);
			aClass16_Sub1_1.method118(99, 77);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 63);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 59);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_762_, (byte) 71);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 410)
		{
			method576((byte) 119, i_760_, i_758_, i_759_, i_761_);
			aClass16_Sub1_1.method118(115, 101);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ - -anInt867, (byte) 80);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 98);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_762_, (byte) 127);
			aClass16_Sub1_1.method126(2);
			anInt989 = -1;
		}
		if (i_757_ == 420)
		{
			method576((byte) 103, i_760_, i_758_, i_759_, i_761_);
			aClass16_Sub1_1.method118(136, i_756_ ^ 0x257);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 123);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ - -anInt927, (byte) 124);
			aClass16_Sub1_1.method126(i_756_ + -615);
		}
		if (i_757_ == 2400)
		{
			method576((byte) 123, i_760_, i_758_, i_759_, i_761_);
			aClass16_Sub1_1.method118(79, 81);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 114);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ + anInt927, (byte) 113);
			aClass16_Sub1_1.method126(i_756_ ^ 0x26b);
		}
		if (i_757_ == 3400)
		{
			method513(0, Class10.aStringArray10[i_758_], 0, null, -85, null, null, false);
		}
		if (i_757_ == 600)
		{
			aClass16_Sub1_1.method118(4, 80);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 101);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 125);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 610)
		{
			aClass16_Sub1_1.method118(91, 107);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 106);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 106);
			aClass16_Sub1_1.method126(2);
			anInt989 = -1;
		}
		if (i_757_ == 620)
		{
			aClass16_Sub1_1.method118(170, 107);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 75);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 630)
		{
			aClass16_Sub1_1.method118(169, i_756_ + -520);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 100);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 640)
		{
			aClass16_Sub1_1.method118(90, 60);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 75);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 650)
		{
			anInt939 = 0;
			anInt989 = i_758_;
			aString30 = Class26.aStringArray19[anIntArray194[anInt989]];
		}
		if (i_757_ == 660)
		{
			aClass16_Sub1_1.method118(246, 99);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 56);
			aClass16_Sub1_1.method126(2);
			anInt939 = 0;
			anInt989 = -1;
			method513(0, new StringBuilder().append("Dropping ").append(Class26.aStringArray19[anIntArray194[i_758_]])
			        .toString(), 7, null, -88, null, null, false);
		}
		if (i_757_ == 700)
		{
			final Class15 class15 = method582((byte) -94, i_758_);
			final int i_763_ = (class15.anInt166 + -64) / anInt856;
			final int i_764_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_764_, anInt1030, i_763_);
			aClass16_Sub1_1.method118(50, 110);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 76);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 79);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 710)
		{
			final Class15 class15 = method582((byte) -65, i_758_);
			final int i_765_ = (class15.anInt166 + -64) / anInt856;
			final int i_766_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_766_, anInt1030, i_765_);
			aClass16_Sub1_1.method118(135, 104);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 122);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 58);
			aClass16_Sub1_1.method126(2);
			anInt989 = -1;
		}
		if (i_757_ == 720)
		{
			final Class15 class15 = method582((byte) -88, i_758_);
			final int i_767_ = (class15.anInt166 - 64) / anInt856;
			final int i_768_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_768_, anInt1030, i_767_);
			aClass16_Sub1_1.method118(153, 89);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 103);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 725)
		{
			final Class15 class15 = method582((byte) -77, i_758_);
			final int i_769_ = (class15.anInt166 + -64) / anInt856;
			final int i_770_ = (class15.anInt159 - 64) / anInt856;
			method560(true, anInt1001, true, i_770_, anInt1030, i_769_);
			aClass16_Sub1_1.method118(202, 109);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 106);
			aClass16_Sub1_1.method126(i_756_ ^ 0x26b);
		}
		if ((i_757_ == 2715) || (i_757_ == 715))
		{
			final Class15 class15 = method582((byte) -68, i_758_);
			final int i_771_ = (class15.anInt166 + -64) / anInt856;
			final int i_772_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_772_, anInt1030, i_771_);
			aClass16_Sub1_1.method118(190, i_756_ + -541);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 76);
			aClass16_Sub1_1.method126(i_756_ + -615);
		}
		if (i_757_ == 3700)
		{
			method513(0, Class24.aStringArray18[i_758_], 0, null, -21, null, null, false);
		}
		if (i_757_ == 800)
		{
			final Class15 class15 = method597(-65281, i_758_);
			final int i_773_ = (class15.anInt166 + -64) / anInt856;
			final int i_774_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_774_, anInt1030, i_773_);
			aClass16_Sub1_1.method118(229, 123);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 119);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 126);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 810)
		{
			final Class15 class15 = method597(-65281, i_758_);
			final int i_775_ = (class15.anInt166 + -64) / anInt856;
			final int i_776_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_776_, anInt1030, i_775_);
			aClass16_Sub1_1.method118(113, 106);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 117);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_, (byte) 86);
			aClass16_Sub1_1.method126(i_756_ ^ 0x26b);
			anInt989 = -1;
		}
		if ((i_757_ == 2805) || (i_757_ == 805))
		{
			final Class15 class15 = method597(-65281, i_758_);
			final int i_777_ = (class15.anInt166 + -64) / anInt856;
			final int i_778_ = (class15.anInt159 + -64) / anInt856;
			method560(true, anInt1001, true, i_778_, anInt1030, i_777_);
			aClass16_Sub1_1.method118(171, i_756_ ^ 0x20d);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 80);
			aClass16_Sub1_1.method126(i_756_ ^ 0x26b);
		}
		if (i_757_ == 2806)
		{
			aClass16_Sub1_1.method118(103, 93);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 113);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 2810)
		{
			aClass16_Sub1_1.method118(142, 115);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 99);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 2820)
		{
			aClass16_Sub1_1.method118(165, i_756_ ^ 0x216);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 92);
			aClass16_Sub1_1.method126(2);
		}
		if (i_757_ == 2833)
		{
			this.aString26 = "";
			this.aString27 = string;
			anInt994 = 1;
		}
		if (i_757_ == 2831)
		{
			method586(i_756_ ^ ~0x216, string);
		}
		if (i_757_ == 2832)
		{
			method502(string, -101);
		}
		if (i_757_ == 2830)
		{
			this.aString24 = "";
			this.aString25 = "";
			anInt1059 = 2;
			aString29 = string;
		}
		if (i_757_ == 900)
		{
			method560(true, anInt1001, true, i_759_, anInt1030, i_758_);
			aClass16_Sub1_1.method118(158, 76);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_ + anInt867, (byte) 127);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_759_ - -anInt927, (byte) 65);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_760_, (byte) 94);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_757_ == 920)
		{
			method560(false, anInt1001, true, i_759_, anInt1030, i_758_);
			if (anInt928 == -24)
			{
				anInt928 = 24;
			}
		}
		if (i_757_ == 1000)
		{
			aClass16_Sub1_1.method118(137, i_756_ ^ 0x228);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(i_758_, (byte) 112);
			aClass16_Sub1_1.method126(2);
			anInt940 = -1;
		}
		if (i_756_ == 617)
		{
			if (i_757_ == 4000)
			{
				anInt940 = -1;
				anInt989 = -1;
			}
		}
	}

	private void method570(final int i, final String string, final String string_779_)
	{
		anInt784++;
		final Graphics graphics = getGraphics();
		if (graphics != null)
		{
			graphics.translate(this.anInt720, this.anInt694);
			final Font font = new Font("Helvetica", 1, 15);
			final int i_780_ = 512;
			graphics.setColor(Color.black);
			final int i_781_ = 344;
			graphics.fillRect((i_780_ / 2) + -140, (i_781_ / 2) - 25, 280, 50);
			graphics.setColor(Color.white);
			graphics.drawRect((i_780_ / 2) - 140, (i_781_ / 2) + -25, 280, 50);
			method465(i_780_ / 2, true, graphics, font, string, (i_781_ / i) + -10);
			method465(i_780_ / 2, true, graphics, font, string_779_, (i_781_ / 2) + 10);
		}
	}

	private void method571(final byte i)
	{
		anInt823++;
		final byte[] is = method468("2d graphics", 20, 8, -21865);
		if (is == null)
		{
			aBool52 = true;
		}
		else
		{
			final byte[] is_782_ = Class41.method292(is, 0, "index.dat", 293484812);
			aClass46_Sub1_2.method350(anInt935, -83, is_782_, Class41.method292(is, 0, "inv1.dat", 293484812), 1);
			aClass46_Sub1_2.method350(anInt935 + 1, -100, is_782_, Class41.method292(is, 0, "inv2.dat", 293484812), 6);
			aClass46_Sub1_2.method350(anInt935 - -9, -124, is_782_, Class41.method292(is, 0, "bubble.dat", 293484812),
			        1);
			aClass46_Sub1_2.method350(anInt935 + 10, 56, is_782_, Class41.method292(is, 0, "runescape.dat", 293484812),
			        1);
			aClass46_Sub1_2.method350(anInt935 - -11, 5, is_782_, Class41.method292(is, 0, "splat.dat", 293484812), 3);
			aClass46_Sub1_2.method350(anInt935 + 14, -121, is_782_, Class41.method292(is, 0, "icon.dat", 293484812), 8);
			aClass46_Sub1_2.method350(anInt935 + 22, -128, is_782_, Class41.method292(is, 0, "hbar.dat", 293484812), 1);
			aClass46_Sub1_2.method350(anInt935 + 23, 48, is_782_, Class41.method292(is, 0, "hbar2.dat", 293484812), 1);
			aClass46_Sub1_2.method350(anInt935 + 24, -85, is_782_, Class41.method292(is, 0, "compass.dat", 293484812),
			        1);
			aClass46_Sub1_2.method350(anInt935 + 25, 28, is_782_, Class41.method292(is, 0, "buttons.dat", 293484812),
			        2);
			aClass46_Sub1_2.method350(anInt873, -126, is_782_, Class41.method292(is, 0, "scrollbar.dat", 293484812), 2);
			aClass46_Sub1_2.method350(anInt873 + 2, 121, is_782_, Class41.method292(is, 0, "corners.dat", 293484812),
			        4);
			aClass46_Sub1_2.method350(anInt873 + 6, 27, is_782_, Class41.method292(is, 0, "arrows.dat", 293484812), 2);
			aClass46_Sub1_2.method350(anInt903, -128, is_782_, Class41.method292(is, 0, "projectile.dat", 293484812),
			        Class45.anInt494);
			aClass46_Sub1_2.method350(anInt931, -91, is_782_, Class41.method292(is, 0, "crowns.dat", 293484812), 2);
			aClass46_Sub1_2.method339(anInt931, 124);
			int i_783_ = Class1.anInt1;
			int i_784_ = 1;
			while (i_783_ > 0)
			{
				int i_785_ = i_783_;
				i_783_ -= 30;
				if (30 < i_785_)
				{
					i_785_ = 30;
				}
				aClass46_Sub1_2.method350((i_784_ * 30) + anInt863 + -30, -81, is_782_, Class41.method292(is, 0,
				        new StringBuilder().append("objects").append(i_784_).append(".dat").toString(), 293484812),
				        i_785_);
				i_784_++;
			}
			aClass46_Sub1_2.method364((byte) -128, anInt935);
			aClass46_Sub1_2.method364((byte) -125, anInt935 + 9);
			for (int i_786_ = 11; 26 >= i_786_; i_786_++)
			{
				aClass46_Sub1_2.method364((byte) -118, i_786_ + anInt935);
			}
			for (int i_788_ = 0; i_788_ < Class45.anInt494; i_788_++)
			{
				aClass46_Sub1_2.method364((byte) -119, i_788_ + anInt903);
			}
			for (int i_789_ = 0; i_789_ < Class1.anInt1; i_789_++)
			{
				aClass46_Sub1_2.method364((byte) -121, anInt863 - -i_789_);
			}
		}
	}

	private void method572(final int i)
	{
		anInt847++;
		aClass46_Sub1_2.method321(137, 0, 60, 260, 126, i + -136);
		aClass46_Sub1_2.method362(60, 126, (byte) 92, 260, 16777215, i);
		aClass46_Sub1_2.method335(16777215, i ^ 0x76, 5, "Logging out...", 173, 256);
	}

	private void method573(final int i)
	{
		anInt806++;
		if (anInt1000 != 0)
		{
			aClass46_Sub1_2.method343(-1248297852);
			aClass46_Sub1_2.method335(16711680, 255, 7, "Oh dear! You are dead...", anInt879 / 2, anInt853 / 2);
			method508((byte) 57);
			aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -112);
		}
		else if (aBool64)
		{
			method598((byte) 25);
		}
		else if (aBool69)
		{
			aClass46_Sub1_2.method343(-1248297852);
			if (0.15 > Math.random())
			{
				aClass46_Sub1_2.method335((int) (1.6777215E7 * Math.random()), 255, 5, "ZZZ",
				        (int) (334.0 * Math.random()), (int) (Math.random() * 80.0));
			}
			if (Math.random() < 0.15)
			{
				aClass46_Sub1_2.method335((int) (1.6777215E7 * Math.random()), 255, 5, "ZZZ",
				        (int) (334.0 * Math.random()), -(int) (Math.random() * 80.0) + 512);
			}
			aClass46_Sub1_2.method321(160, 0, 40, 200, (anInt853 / 2) + -100, 1);
			aClass46_Sub1_2.method335(16776960, 255, 7, "You are sleeping", 50, anInt853 / 2);
			aClass46_Sub1_2.method335(16776960, 255, 7,
			        new StringBuilder().append("Fatigue: ").append((anInt1055 * 100) / 750).append("%").toString(), 90,
			        anInt853 / 2);
			aClass46_Sub1_2.method335(16777215, 255, 5, "When you want to wake up just use your", 140, anInt853 / 2);
			aClass46_Sub1_2.method335(16777215, 255, 5, "keyboard to type the word in the box below", 160,
			        anInt853 / 2);
			aClass46_Sub1_2.method335(65535, 255, 5, new StringBuilder().append(this.aString27).append("*").toString(),
			        180, anInt853 / 2);
			if (aString35 == null)
			{
				aClass46_Sub1_2.method338(anInt925 + 1, 230, (anInt853 / 2) + -127, (byte) -70);
			}
			else
			{
				aClass46_Sub1_2.method335(16711680, 255, 5, aString35, 260, anInt853 / 2);
			}
			aClass46_Sub1_2.method362(42, (anInt853 / 2) + -128, (byte) -77, 257, 16777215, 229);
			method508((byte) 119);
			aClass46_Sub1_2.method335(16777215, 255, 1, "If you can't read the word", 290, anInt853 / 2);
			aClass46_Sub1_2.method335(16777215, 255, 1, "@yel@click here@whi@ to get a different one", 305,
			        anInt853 / 2);
			aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -117);
		}
		else if (aClass6_1.aBool2)
		{
			for (int i_790_ = 0; i_790_ < 64; i_790_++)
			{
				aClass41_2.method294((aClass6_1.aClass23ArrayArray2[anInt866][i_790_]), 1);
				if (anInt866 == 0)
				{
					aClass41_2.method294((aClass6_1.aClass23ArrayArray1[1][i_790_]), 1);
					aClass41_2.method294((aClass6_1.aClass23ArrayArray2[1][i_790_]), 1);
					aClass41_2.method294((aClass6_1.aClass23ArrayArray1[2][i_790_]), 1);
					aClass41_2.method294((aClass6_1.aClass23ArrayArray2[2][i_790_]), 1);
				}
				aBool53 = true;
				if ((anInt866 == 0)
				        && (((aClass6_1.anIntArrayArray4[aClass15_1.anInt166 / 128][aClass15_1.anInt159 / 128])
				                & 0x80) == 0))
				{
					aClass41_2.method267((aClass6_1.aClass23ArrayArray2[anInt866][i_790_]), (byte) 56);
					if (anInt866 == 0)
					{
						aClass41_2.method267((aClass6_1.aClass23ArrayArray1[1][i_790_]), (byte) 111);
						aClass41_2.method267((aClass6_1.aClass23ArrayArray2[1][i_790_]), (byte) 40);
						aClass41_2.method267((aClass6_1.aClass23ArrayArray1[2][i_790_]), (byte) -121);
						aClass41_2.method267((aClass6_1.aClass23ArrayArray2[2][i_790_]), (byte) 125);
					}
					aBool53 = false;
				}
			}
			if (anInt914 != anInt880)
			{
				anInt914 = anInt880;
				for (int i_791_ = 0; i_791_ < anInt1022; i_791_++)
				{
					if (anIntArray178[i_791_] == 97)
					{
						method539(i_791_, -50, new StringBuilder().append("firea").append(anInt880 - -1).toString());
					}
					if (anIntArray178[i_791_] == 274)
					{
						method539(i_791_, -50,
						        new StringBuilder().append("fireplacea").append(anInt880 - -1).toString());
					}
					if (anIntArray178[i_791_] == 1031)
					{
						method539(i_791_, -50, new StringBuilder().append("lightning").append(anInt880 + 1).toString());
					}
					if (anIntArray178[i_791_] == 1036)
					{
						method539(i_791_, -50, new StringBuilder().append("firespell").append(anInt880 + 1).toString());
					}
					if (anIntArray178[i_791_] == 1147)
					{
						method539(i_791_, -50,
						        new StringBuilder().append("spellcharge").append(anInt880 + 1).toString());
					}
				}
			}
			if (anInt849 != anInt868)
			{
				anInt849 = anInt868;
				for (int i_792_ = 0; anInt1022 > i_792_; i_792_++)
				{
					if (anIntArray178[i_792_] == 51)
					{
						method539(i_792_, -50, new StringBuilder().append("torcha").append(anInt868 + 1).toString());
					}
					if (anIntArray178[i_792_] == 143)
					{
						method539(i_792_, -50,
						        new StringBuilder().append("skulltorcha").append(anInt868 - -1).toString());
					}
				}
			}
			if (anInt936 != anInt912)
			{
				anInt912 = anInt936;
				for (int i_793_ = 0; anInt1022 > i_793_; i_793_++)
				{
					if (anIntArray178[i_793_] == 1142)
					{
						method539(i_793_, -50, new StringBuilder().append("clawspell").append(anInt936 + 1).toString());
					}
				}
			}
			aClass41_2.method283(anInt916, (byte) -38);
			anInt916 = 0;
			for (int i_794_ = 0; anInt932 > i_794_; i_794_++)
			{
				final Class15 class15 = aClass15Array3[i_794_];
				if (class15.anInt155 != 255)
				{
					final int i_795_ = class15.anInt166;
					final int i_796_ = class15.anInt159;
					final int i_797_ = -aClass6_1.method35(i_796_, true, i_795_);
					final int i_798_ = aClass41_2.method265(145, i_795_, i_796_, i_797_, 220, i_794_ + 10000, 119,
					        5000 - -i_794_);
					anInt916++;
					if (class15 == aClass15_1)
					{
						aClass41_2.method277(i_798_, -1);
					}
					if (class15.anInt160 == 8)
					{
						aClass41_2.method281((byte) -61, i_798_, -30);
					}
					if (class15.anInt160 == 9)
					{
						aClass41_2.method281((byte) -61, i_798_, 30);
					}
				}
			}
			for (int i_799_ = 0; anInt932 > i_799_; i_799_++)
			{
				final Class15 class15 = aClass15Array3[i_799_];
				if (class15.anInt158 > 0)
				{
					Class15 class15_800_ = null;
					if (class15.anInt154 != -1)
					{
						class15_800_ = aClass15Array6[class15.anInt154];
					}
					else if (class15.anInt169 != -1)
					{
						class15_800_ = aClass15Array2[class15.anInt169];
					}
					if (class15_800_ != null)
					{
						final int i_801_ = class15.anInt166;
						final int i_802_ = class15.anInt159;
						final int i_803_ = -aClass6_1.method35(i_802_, true, i_801_) + -110;
						final int i_804_ = class15_800_.anInt166;
						final int i_805_ = class15_800_.anInt159;
						final int i_806_ = (-aClass6_1.method35(i_805_, true, i_804_)
						        - ((AClass1.anIntArray81[class15_800_.anInt161]) / 2));
						final int i_807_ = (((i_801_ * class15.anInt158) - -(i_804_ * (anInt855 - class15.anInt158)))
						        / anInt855);
						final int i_808_ = (((i_803_ * class15.anInt158) + (i_806_ * (anInt855 + -class15.anInt158)))
						        / anInt855);
						final int i_809_ = (((i_805_ * (anInt855 - class15.anInt158)) + (i_802_ * class15.anInt158))
						        / anInt855);
						aClass41_2.method265(32, i_807_, i_809_, i_808_, 32, 0, 123, anInt903 - -(class15.anInt164));
						anInt916++;
					}
				}
			}
			for (int i_810_ = 0; i_810_ < anInt1039; i_810_++)
			{
				final Class15 class15 = aClass15Array5[i_810_];
				final int i_811_ = class15.anInt166;
				final int i_812_ = class15.anInt159;
				final int i_813_ = -aClass6_1.method35(i_812_, true, i_811_);
				final int i_814_ = aClass41_2.method265((Class38.anIntArray89[class15.anInt161]), i_811_, i_812_,
				        i_813_, (AClass1.anIntArray81[class15.anInt161]), i_810_ + 30000, 122, i_810_ + 20000);
				anInt916++;
				if (class15.anInt160 == 8)
				{
					aClass41_2.method281((byte) -61, i_814_, -30);
				}
				if (class15.anInt160 == 9)
				{
					aClass41_2.method281((byte) -61, i_814_, 30);
				}
			}
			for (int i_815_ = 0; i_815_ < anInt1062; i_815_++)
			{
				final int i_816_ = (anInt856 * anIntArray192[i_815_]) + 64;
				final int i_817_ = (anInt856 * anIntArray199[i_815_]) + 64;
				aClass41_2.method265(96, i_816_, i_817_,
				        (-aClass6_1.method35(i_817_, true, i_816_) + -anIntArray175[i_815_]), 64, i_815_ + 20000, 125,
				        anIntArray201[i_815_] + 40000);
				anInt916++;
			}
			for (int i_818_ = 0; anInt1012 > i_818_; i_818_++)
			{
				final int i_819_ = (anInt856 * anIntArray188[i_818_]) + 64;
				final int i_820_ = (anInt856 * anIntArray204[i_818_]) - -64;
				final int i_821_ = anIntArray214[i_818_];
				if (i_821_ == 0)
				{
					aClass41_2.method265(128, i_819_, i_820_, -aClass6_1.method35(i_820_, true, i_819_), 256,
					        i_818_ + 50000, 126, i_818_ + 50000);
					anInt916++;
				}
				if (i_821_ == 1)
				{
					aClass41_2.method265(128, i_819_, i_820_, -aClass6_1.method35(i_820_, true, i_819_), 64,
					        i_818_ + 50000, 119, 50000 - -i_818_);
					anInt916++;
				}
			}
			aClass46_Sub1_2.aBool28 = false;
			aClass46_Sub1_2.method331(-1964300920);
			aClass46_Sub1_2.aBool28 = this.aBool39;
			if (anInt866 == 3)
			{
				final int i_822_ = 40 + (int) (Math.random() * 3.0);
				final int i_823_ = (int) (7.0 * Math.random()) + 40;
				aClass41_2.method261(-10, -50, i_823_, i_822_, (byte) -110, -50);
			}
			anInt978 = 0;
			anInt977 = 0;
			anInt960 = 0;
			if (!aBool80)
			{
				if (aBool86 && !aBool53)
				{
					method500(false);
				}
				if (true == !this.aBool39)
				{
					aClass41_2.anInt464 = 2400;
					aClass41_2.anInt426 = 2300;
					aClass41_2.anInt437 = 2400;
					aClass41_2.anInt465 = 1;
				}
				else
				{
					aClass41_2.anInt426 = 2100;
					aClass41_2.anInt464 = 2200;
					aClass41_2.anInt465 = 1;
					aClass41_2.anInt437 = 2200;
				}
				final int i_824_ = anInt906 - -anInt882;
				final int i_825_ = anInt907 - -anInt923;
				aClass41_2.method269(-aClass6_1.method35(i_825_, true, i_824_), i_824_, anInt843 * 4, 912, i_825_,
				        anInt845 * 2, 20, 0);
			}
			else
			{
				if (aBool86 && !aBool53)
				{
					final int i_826_ = anInt933;
					method500(false);
					if (i_826_ != anInt933)
					{
						anInt906 = aClass15_1.anInt166;
						anInt907 = aClass15_1.anInt159;
					}
				}
				aClass41_2.anInt437 = 3000;
				aClass41_2.anInt464 = 3000;
				aClass41_2.anInt426 = 2800;
				aClass41_2.anInt465 = 1;
				anInt843 = anInt933 * 32;
				final int i_827_ = anInt882 + anInt906;
				final int i_828_ = anInt923 + anInt907;
				aClass41_2.method269(-aClass6_1.method35(i_828_, true, i_827_), i_827_, anInt843 * 4, 912, i_828_, 2000,
				        112, 0);
			}
			aClass41_2.method290(true);
			method525((byte) -73);
			if (0 < anInt928)
			{
				aClass46_Sub1_2.method338(((-anInt928 + 24) / 6) + anInt935 + 14, anInt888 + -8, anInt854 + -8,
				        (byte) -70);
			}
			if (anInt928 < 0)
			{
				aClass46_Sub1_2.method338(((24 - -anInt928) / 6) + anInt935 + 18, anInt888 - 8, anInt854 - 8,
				        (byte) -70);
			}
			if (anInt949 != 0)
			{
				int i_829_ = anInt949 / 50;
				final int i_830_ = i_829_ / 60;
				i_829_ %= 60;
				if (10 <= i_829_)
				{
					aClass46_Sub1_2.method335(16776960, 255, 1, new StringBuilder().append("System update in: ")
					        .append(i_830_).append(":").append(i_829_).toString(), anInt879 - 7, 256);
				}
				else
				{
					aClass46_Sub1_2.method335(16776960, 255, 1, new StringBuilder().append("System update in: ")
					        .append(i_830_).append(":0").append(i_829_).toString(), anInt879 + -7, 256);
				}
			}
			if (!aBool78)
			{
				int i_831_ = -anInt852 + -anInt1001 + -anInt927 + 2203;
				if ((anInt1030 + anInt894 + anInt867) >= 2640)
				{
					i_831_ = -50;
				}
				if (i_831_ > 0)
				{
					final int i_832_ = (i_831_ / 6) + 1;
					aClass46_Sub1_2.method338(anInt935 + 13, anInt879 - 56, 453, (byte) -70);
					aClass46_Sub1_2.method335(16776960, 255, 1, "Wilderness", anInt879 - 20, 465);
					aClass46_Sub1_2.method335(16776960, 255, 1,
					        new StringBuilder().append("Level: ").append(i_832_).toString(), anInt879 - 7, 465);
					if (anInt979 == 0)
					{
						anInt979 = 2;
					}
				}
				if ((anInt979 == 0) && (-10 < i_831_) && (0 >= i_831_))
				{
					anInt979 = 1;
				}
			}
			if (anInt976 == 0)
			{
				for (int i_833_ = 0; i_833_ < 100; i_833_++)
				{
					if (Class29.anIntArray83[i_833_] > 0)
					{
						final String string = new StringBuilder().append(Class26.aStringArray21[i_833_])
						        .append(Class13.method110(Class2.aStringArray3[i_833_], Class13.aStringArray13[i_833_],
						                Class27_Sub1.anIntArray142[i_833_], -6187))
						        .toString();
						aClass46_Sub1_2.method361(-107, string, Class46.anIntArray126[i_833_], 1,
						        -(i_833_ * 12) + anInt879 + -18, 7, 16776960);
					}
				}
			}
			aClass10_2.method66(2, anInt1052);
			aClass10_2.method66(2, anInt987);
			aClass10_2.method66(2, anInt990);
			if (anInt976 == 1)
			{
				aClass10_2.method69(anInt1052, (byte) -51);
			}
			else if (anInt976 == 2)
			{
				aClass10_2.method69(anInt987, (byte) -103);
			}
			else if (anInt976 == 3)
			{
				aClass10_2.method69(anInt990, (byte) -69);
			}
			Class46.anInt568 = 2;
			aClass10_2.method71(-6);
			Class46.anInt568 = 0;
			aClass46_Sub1_2.method320((byte) 111, (aClass46_Sub1_2.anInt502) + -3 + -197, anInt935, 3, 128);
			method521((byte) -123);
			aClass46_Sub1_2.aBool27 = false;
			method508((byte) 92);
			aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -45);
		}
	}

	private void method574(final byte i)
	{
		anInt810++;
		aClass10_1 = new Class10(aClass46_Sub1_2, 100);
		aClass10_1.method72(255, 10, true, 4, 256, "Please design Your Character");
		int i_834_ = 140;
		int i_835_ = 34;
		i_834_ += 116;
		i_835_ -= 10;
		aClass10_1.method72(255, i_835_ + 110, true, 3, i_834_ + -55, "Front");
		aClass10_1.method72(255, i_835_ + 110, true, 3, i_834_, "Side");
		aClass10_1.method72(255, i_835_ + 110, true, 3, i_834_ + 55, "Back");
		final int i_836_ = 54;
		i_835_ += 145;
		aClass10_1.method95((byte) 43, -i_836_ + i_834_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_ - 8, true, 1, -i_836_ + i_834_, "Head");
		aClass10_1.method72(255, i_835_ + 8, true, 1, i_834_ - i_836_, "Type");
		aClass10_1.method73(Class33.anInt368 + 7, (i_834_ - 40) + -i_836_, (byte) 116, i_835_);
		anInt968 = aClass10_1.method65(i_835_, 20, (byte) 112, -i_836_ + i_834_ + -40, 20);
		aClass10_1.method73(Class33.anInt368 - -6, (-i_836_ + i_834_) - -40, (byte) 123, i_835_);
		anInt974 = aClass10_1.method65(i_835_, 20, (byte) 116, (-i_836_ + i_834_) - -40, 20);
		aClass10_1.method95((byte) -95, i_834_ - -i_836_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_ - 8, true, 1, i_836_ + i_834_, "Hair");
		aClass10_1.method72(255, i_835_ + 8, true, 1, i_836_ + i_834_, "Color");
		aClass10_1.method73(Class33.anInt368 + 7, i_834_ + i_836_ + -40, (byte) 120, i_835_);
		anInt991 = aClass10_1.method65(i_835_, 20, (byte) 111, (i_834_ - -i_836_) + -40, 20);
		aClass10_1.method73(Class33.anInt368 + 6, i_836_ + i_834_ + 40, (byte) 116, i_835_);
		anInt954 = aClass10_1.method65(i_835_, 20, (byte) 112, i_836_ + i_834_ + 40, 20);
		i_835_ += 50;
		aClass10_1.method95((byte) -119, -i_836_ + i_834_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_, true, 1, -i_836_ + i_834_, "Gender");
		aClass10_1.method73(Class33.anInt368 + 7, (i_834_ - i_836_) + -40, (byte) 112, i_835_);
		anInt996 = aClass10_1.method65(i_835_, 20, (byte) 117, -i_836_ + i_834_ + -40, 20);
		aClass10_1.method73(Class33.anInt368 + 6, -i_836_ + i_834_ + 40, (byte) 112, i_835_);
		anInt956 = aClass10_1.method65(i_835_, 20, (byte) 113, -i_836_ + i_834_ + 40, 20);
		aClass10_1.method95((byte) -82, i_836_ + i_834_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_ + -8, true, 1, i_834_ + i_836_, "Top");
		aClass10_1.method72(255, i_835_ + 8, true, 1, i_834_ + i_836_, "Color");
		aClass10_1.method73(Class33.anInt368 + 7, (i_834_ - -i_836_) + -40, (byte) 124, i_835_);
		anInt969 = aClass10_1.method65(i_835_, 20, (byte) 125, i_836_ + i_834_ + -40, 20);
		aClass10_1.method73(Class33.anInt368 - -6, i_836_ + i_834_ + 40, (byte) 121, i_835_);
		anInt945 = aClass10_1.method65(i_835_, 20, (byte) 112, i_834_ + i_836_ + 40, 20);
		i_835_ += 50;
		aClass10_1.method95((byte) -91, i_834_ - i_836_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_ - 8, true, 1, -i_836_ + i_834_, "Skin");
		aClass10_1.method72(255, i_835_ + 8, true, 1, i_834_ - i_836_, "Color");
		aClass10_1.method73(Class33.anInt368 + 7, (-i_836_ - 40) + i_834_, (byte) 123, i_835_);
		anInt1020 = aClass10_1.method65(i_835_, 20, (byte) 111, -i_836_ + i_834_ + -40, 20);
		aClass10_1.method73(Class33.anInt368 + 6, (i_834_ + 40) - i_836_, (byte) 123, i_835_);
		anInt966 = aClass10_1.method65(i_835_, 20, (byte) 108, -i_836_ + i_834_ + 40, 20);
		aClass10_1.method95((byte) 36, i_836_ + i_834_, i_835_, 41, 53);
		aClass10_1.method72(255, i_835_ + -8, true, 1, i_836_ + i_834_, "Bottom");
		aClass10_1.method72(255, i_835_ - -8, true, 1, i_836_ + i_834_, "Color");
		aClass10_1.method73(Class33.anInt368 - -7, (i_834_ + -40) - -i_836_, (byte) 118, i_835_);
		anInt947 = aClass10_1.method65(i_835_, 20, (byte) 121, (i_834_ + -40) - -i_836_, 20);
		aClass10_1.method73(Class33.anInt368 + 6, i_836_ + i_834_ + 40, (byte) 120, i_835_);
		anInt1044 = aClass10_1.method65(i_835_, 20, (byte) 113, i_836_ + i_834_ + 40, 20);
		i_835_ += 82;
		i_835_ -= 35;
		aClass10_1.method78(-125, 30, 200, i_835_, i_834_);
		aClass10_1.method72(255, i_835_, false, 4, i_834_, "Accept");
		anInt1029 = aClass10_1.method65(i_835_, 30, (byte) 108, i_834_, 200);
	}

	private void method575(final int i)
	{
		if (i != 25630)
		{
			anInt910 = -59;
		}
		anInt949 = 0;
		anInt788++;
		if (anInt970 != 0)
		{
			method529(-127);
		}
		else
		{
			System.out.println("Lost connection");
			anInt850 = 10;
			method519(99, aString39, aString34, true);
		}
	}

	private void method576(final byte i, final int i_838_, int i_839_, int i_840_, final int i_841_)
	{
		anInt917++;
		int i_842_;
		int i_843_;
		if ((i_838_ == 0) || (i_838_ == 4))
		{
			i_843_ = Class45.anIntArray115[i_841_];
			i_842_ = Class7.anIntArray17[i_841_];
		}
		else
		{
			i_842_ = Class45.anIntArray115[i_841_];
			i_843_ = Class7.anIntArray17[i_841_];
		}
		if ((Class46.anIntArray134[i_841_] == 2) || (Class46.anIntArray134[i_841_] == 3))
		{
			if (i_838_ == 0)
			{
				i_843_++;
				i_839_--;
			}
			if (i_838_ == 2)
			{
				i_842_++;
			}
			if (i_838_ == 4)
			{
				i_843_++;
			}
			if (i_838_ == 6)
			{
				i_842_++;
				i_840_--;
			}
			method552(i_842_ + i_840_ + -1, true, i_839_ - -i_843_ - 1, anInt1001, i_839_, i_840_, anInt1030, true,
			        false);
		}
		else
		{
			method552(i_842_ + i_840_ + -1, true, (i_839_ + -1) - -i_843_, anInt1001, i_839_, i_840_, anInt1030, true,
			        true);
		}
	}

	public static void main(final String[] strings)
	{
		try
		{
			Class34.aClass38_5 = Class16_Sub1.aClass38_7;
			Class27_Sub1_Sub1.anInt664 = Integer.parseInt(strings[0]);
			if (!strings[1].equals("live"))
			{
				if (!strings[1].equals("rc"))
				{
					if (strings[1].equals("wip"))
					{
						RuntimeException_Sub1.aClass24_4 = Class45.aClass24_2;
					}
				}
				else
				{
					RuntimeException_Sub1.aClass24_4 = RuntimeException_Sub1.aClass24_3;
				}
			}
			else
			{
				RuntimeException_Sub1.aClass24_4 = Class42.aClass24_1;
			}
			final Client var_client = new Client();
			var_client.aBool51 = false;
			for (int i = 2; strings.length > i; i++)
			{
				if (strings[i].equals("members"))
				{
					var_client.aBool55 = true;
				}
				if (strings[i].equals("veterans"))
				{
					var_client.aBool56 = true;
				}
			}
			var_client.method484((byte) 113, false, Class51.anInt583, var_client.anInt879 + 12,
			        Class27_Sub1_Sub1.anInt664 + 7000, var_client.anInt853, "RuneScape Classic",
			        (RuntimeException_Sub1.aClass24_4.anInt293) + 32, "classic");
			var_client.anInt740 = 10;
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 125, null);
		}
		anInt762++;
	}

	@Override
	void method471(final int i)
	{
		anInt797++;
		method544(true, (byte) 72);
		if (aClass37_1 != null)
		{
			aClass37_1.method243();
		}
	}

	private void method577(final boolean bool, final int i)
	{
		anInt834++;
		int i_845_ = aClass46_Sub1_2.anInt502 + -199;
		int i_846_ = 156;
		aClass46_Sub1_2.method338(anInt935 + 2, 3, i_845_ + -49, (byte) -70);
		int i_847_ = 152;
		i_845_ += 40;
		aClass46_Sub1_2.method321(36, 0, i_847_, i_846_, i_845_, i + 20184);
		aClass46_Sub1_2.method357(36, i_847_ + 36, i_845_, i_846_ + i_845_, 1743849672);
		int i_848_ = anInt1041 + 192;
		int i_849_ = 0xff & (anInt843 + anInt964);
		int i_850_ = (i_848_ * (aClass15_1.anInt166 + -6040) * 3) / 2048;
		int i_851_ = (i_848_ * (aClass15_1.anInt159 + -6040) * 3) / 2048;
		int i_852_ = Applet_Sub1.anIntArray151[(-(i_849_ * 4) + 1024) & 0x3ff];
		int i_853_ = Applet_Sub1.anIntArray151[(0x3ff & (-(i_849_ * 4) + 1024)) + 1024];
		int i_854_ = ((i_852_ * i_851_) + (i_850_ * i_853_)) >> 18;
		i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
		if (i == -20183)
		{
			i_850_ = i_854_;
			aClass46_Sub1_2.method351((i_846_ / 2) + -i_850_ + i_845_, i_848_, anInt935 + -1,
			        (i_847_ / 2) + i_851_ + 36, (i_849_ + 64) & 0xff, 15262);
			for (int i_855_ = 0; anInt1022 > i_855_; i_855_++)
			{
				i_851_ = ((((anInt856 * anIntArray170[i_855_]) + -aClass15_1.anInt159 + 64) * i_848_ * 3) / 2048);
				i_850_ = ((((anInt856 * anIntArray191[i_855_]) + -aClass15_1.anInt166 + 64) * i_848_ * 3) / 2048);
				i_854_ = ((i_852_ * i_851_) - -(i_850_ * i_853_)) >> 18;
				i_851_ = ((i_853_ * i_851_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 65535, 36 - (-(i_847_ / 2) - -i_851_), (i_846_ / 2) + i_850_ + i_845_);
			}
			for (int i_856_ = 0; anInt1062 > i_856_; i_856_++)
			{
				i_850_ = (i_848_ * ((anInt856 * anIntArray192[i_856_]) + -aClass15_1.anInt166 + 64) * 3) / 2048;
				i_851_ = ((((anInt856 * anIntArray199[i_856_]) + -aClass15_1.anInt159 + 64) * i_848_ * 3) / 2048);
				i_854_ = ((i_850_ * i_853_) + (i_851_ * i_852_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 16711680, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + (i_845_ - -i_850_));
			}
			for (int i_857_ = 0; i_857_ < anInt1039; i_857_++)
			{
				final Class15 class15 = aClass15Array5[i_857_];
				i_850_ = (i_848_ * (class15.anInt166 - aClass15_1.anInt166) * 3) / 2048;
				i_851_ = (i_848_ * (class15.anInt159 - aClass15_1.anInt159) * 3) / 2048;
				i_854_ = ((i_851_ * i_852_) + (i_853_ * i_850_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 16776960, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + i_850_ + i_845_);
			}
			for (int i_858_ = 0; anInt932 > i_858_; i_858_++)
			{
				final Class15 class15 = aClass15Array3[i_858_];
				i_850_ = (i_848_ * (class15.anInt166 + -aClass15_1.anInt166) * 3) / 2048;
				i_851_ = (i_848_ * (class15.anInt159 + -aClass15_1.anInt159) * 3) / 2048;
				i_854_ = ((i_852_ * i_851_) + (i_853_ * i_850_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_850_ * i_852_)) >> 18;
				i_850_ = i_854_;
				int i_859_ = 16777215;
				final String string = Class43.method298((byte) 45, class15.aString7);
				if (string != null)
				{
					for (int i_860_ = 0; i_860_ < Class16.anInt185; i_860_++)
					{
						if (string.equals(Class43.method298((byte) -50, (Class28.aStringArray24[i_860_])))
						        && ((Class7.anIntArray18[i_860_] & 0x2) != 0))
						{
							i_859_ = 65280;
							break;
						}
					}
				}
				method509(-2, i_859_, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + i_845_ + i_850_);
			}
			aClass46_Sub1_2.method329((i_846_ / 2) + i_845_, 2, 16777215, 36 - -(i_847_ / 2), 255, (byte) 33);
			aClass46_Sub1_2.method351(i_845_ + 19, 128, anInt935 + 24, 55, 0xff & (anInt843 + 128), 15262);
			aClass46_Sub1_2.method357(0, anInt879 + 12, 0, anInt853, 1743849672);
			if (bool)
			{
				i_845_ = (this.anInt739 + -aClass46_Sub1_2.anInt502 + 199);
				final int i_861_ = this.anInt736 - 36;
				if ((i_845_ >= 40) && (i_861_ >= 0) && (196 > i_845_) && (152 > i_861_))
				{
					i_845_ = aClass46_Sub1_2.anInt502 - 199;
					i_847_ = 152;
					i_846_ = 156;
					i_849_ = 0xff & (anInt964 + anInt843);
					i_848_ = anInt1041 + 192;
					i_845_ += 40;
					i_851_ = (((this.anInt736 + -(i_847_ / 2) + -36) * 16384) / (i_848_ * 3));
					i_853_ = (Applet_Sub1.anIntArray151[((1024 - (i_849_ * 4)) & 0x3ff) + 1024]);
					i_850_ = ((((-(i_846_ / 2) - i_845_) + this.anInt739) * 16384) / (i_848_ * 3));
					i_852_ = (Applet_Sub1.anIntArray151[(-(i_849_ * 4) + 1024) & 0x3ff]);
					i_854_ = ((i_851_ * i_852_) + (i_850_ * i_853_)) >> 15;
					i_851_ = ((i_853_ * i_851_) + -(i_850_ * i_852_)) >> 15;
					i_850_ = i_854_;
					i_851_ = aClass15_1.anInt159 - i_851_;
					i_850_ = aClass15_1.anInt166 + i_850_;
					if (anInt887 == 1)
					{
						method560(false, anInt1001, true, i_851_ / 128, anInt1030, i_850_ / 128);
					}
					anInt887 = 0;
				}
			}
		}
	}

	private void method578(final String string, final byte i, final boolean bool, final int i_862_,
	        final String[] strings)
	{
		anInt878++;
		aStringArray49 = strings;
		anInt985 = 400;
		for (int i_863_ = 0; strings.length > i_863_; i_863_++)
		{
			final int i_864_ = 10 + aClass46_Sub1_2.method328(strings[i_863_], -116, 1);
			if (anInt985 < i_864_)
			{
				anInt985 = i_864_;
			}
		}
		anInt1060 = (((2 + aClass46_Sub1_2.method315((byte) 106, 1)) * (1 + strings.length))
		        + (15 - -aClass46_Sub1_2.method315((byte) 116, 4)));
		anInt971 = i_862_;
		aBool60 = false;
		aBool62 = bool;
		this.aString27 = string;
		this.aString26 = "";
	}

	private void method579(final int i)
	{
		anInt861++;
		final int i_866_ = 22;
		final int i_867_ = 36;
		aClass46_Sub1_2.method321(i_867_, 192, 16, 468, i_866_, i ^ ~0x38c4);
		final int i_868_ = 10000536;
		aClass46_Sub1_2.method327(i_866_, i_867_ + 16, 468, 160, i ^ ~0x3894, i_868_, 246);
		aClass46_Sub1_2.method335(16777215, 255, 1,
		        new StringBuilder().append("Please confirm your duel with @yel@").append(aString37).toString(),
		        i_867_ - -12, i_866_ + 234);
		if (i != -14534)
		{
			anIntArray172 = null;
		}
		aClass46_Sub1_2.method335(16776960, 255, 1, "Your stake:", i_867_ - -30, i_866_ + 117);
		for (int i_869_ = 0; anInt992 > i_869_; i_869_++)
		{
			String string = Class26.aStringArray19[anIntArray215[i_869_]];
			if (Class1.anIntArray1[anIntArray215[i_869_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Class10.method79(1, anIntArray183[i_869_])).toString();
			}
			aClass46_Sub1_2.method335(16777215, 255, 1, string, i_867_ + (i_869_ * 12) + 42, i_866_ - -117);
		}
		if (anInt992 == 0)
		{
			aClass46_Sub1_2.method335(16777215, 255, 1, "Nothing!", i_867_ - -42, i_866_ - -117);
		}
		aClass46_Sub1_2.method335(16776960, 255, 1, "Your opponent's stake:", i_867_ + 30, i_866_ - -351);
		for (int i_870_ = 0; i_870_ < anInt1053; i_870_++)
		{
			String string = Class26.aStringArray19[anIntArray221[i_870_]];
			if (Class1.anIntArray1[anIntArray221[i_870_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Class10.method79(1, anIntArray206[i_870_])).toString();
			}
			aClass46_Sub1_2.method335(16777215, 255, 1, string, (i_867_ - -(i_870_ * 12)) + 42, i_866_ + 351);
		}
		if (anInt1053 == 0)
		{
			aClass46_Sub1_2.method335(16777215, 255, 1, "Nothing!", i_867_ + 42, i_866_ + 351);
		}
		if (anInt995 != 0)
		{
			aClass46_Sub1_2.method335(16711680, 255, 1, "No retreat is possible!", i_867_ - -180, i_866_ + 234);
		}
		else
		{
			aClass46_Sub1_2.method335(65280, i ^ ~0x383a, 1, "You can retreat from this duel", i_867_ - -180,
			        i_866_ + 234);
		}
		if (anInt1004 == 0)
		{
			aClass46_Sub1_2.method335(65280, 255, 1, "Magic may be used", i_867_ + 192, i_866_ + 234);
		}
		else
		{
			aClass46_Sub1_2.method335(16711680, 255, 1, "Magic cannot be used", i_867_ + 192, i_866_ + 234);
		}
		if (anInt1025 == 0)
		{
			aClass46_Sub1_2.method335(65280, 255, 1, "Prayer may be used", i_867_ + 204, i_866_ - -234);
		}
		else
		{
			aClass46_Sub1_2.method335(16711680, 255, 1, "Prayer cannot be used", i_867_ + 204, i_866_ + 234);
		}
		if (anInt1034 != 0)
		{
			aClass46_Sub1_2.method335(16711680, 255, 1, "Weapons cannot be used", i_867_ + 216, i_866_ - -234);
		}
		else
		{
			aClass46_Sub1_2.method335(65280, 255, 1, "Weapons may be used", i_867_ - -216, i_866_ - -234);
		}
		aClass46_Sub1_2.method335(16777215, 255, 1, "If you are sure click 'Accept' to begin the duel", i_867_ - -230,
		        i_866_ + 234);
		if (!aBool66)
		{
			aClass46_Sub1_2.method338(anInt935 + 25, i_867_ + 238, (i_866_ - -118) + -35, (byte) -70);
			aClass46_Sub1_2.method338(anInt935 + 26, i_867_ + 238, i_866_ + -35 + 352, (byte) -70);
		}
		else
		{
			aClass46_Sub1_2.method335(16776960, 255, 1, "Waiting for other player...", i_867_ + 250, i_866_ + 234);
		}
		if (anInt887 == 1)
		{
			if ((this.anInt739 < i_866_) || (i_867_ > this.anInt736) || (this.anInt739 > (i_866_ + 468))
			        || (this.anInt736 > (i_867_ + 262)))
			{
				aBool92 = false;
				aClass16_Sub1_1.method118(230, 95);
				aClass16_Sub1_1.method126(2);
			}
			if ((this.anInt739 >= (i_866_ + 118 + -35)) && (((i_866_ + 118) - -70) >= this.anInt739)
			        && ((i_867_ + 238) <= this.anInt736) && (this.anInt736 <= ((i_867_ - -238) + 21)))
			{
				aBool66 = true;
				aClass16_Sub1_1.method118(77, 77);
				aClass16_Sub1_1.method126(2);
			}
			if ((this.anInt739 >= ((i_866_ + 352) - 35)) && (this.anInt739 <= (i_866_ + 353 + 70))
			        && ((i_867_ + 238) <= this.anInt736) && (((i_867_ - -21) + 238) >= this.anInt736))
			{
				aBool92 = false;
				aClass16_Sub1_1.method118(197, 84);
				aClass16_Sub1_1.method126(2);
			}
			anInt887 = 0;
		}
	}

	private boolean method580(final int i, int i_871_, int i_872_)
	{
		anInt836++;
		if (anInt1000 != 0)
		{
			aClass6_1.aBool2 = false;
			return false;
		}
		i_871_ += anInt894;
		aBool78 = false;
		i_872_ += anInt852;
		if ((anInt866 == anInt901) && (anInt922 < i_871_) && (i_871_ < anInt876) && (i_872_ > anInt926)
		        && (i_872_ < anInt921))
		{
			aClass6_1.aBool2 = true;
			return false;
		}
		aClass46_Sub1_2.method335(16777215, i ^ 0x253, 1, "Loading... Please wait", 192, 256);
		method508((byte) 94);
		aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -22);
		final int i_873_ = anInt867;
		final int i_874_ = anInt927;
		final int i_875_ = (i_871_ - -24) / 48;
		anInt866 = anInt901;
		anInt867 = (i_875_ * 48) + -48;
		final int i_876_ = (i_872_ + 24) / 48;
		anInt927 = (i_876_ * 48) + -48;
		anInt922 = (i_875_ * 48) + -32;
		anInt876 = (i_875_ * 48) + 32;
		anInt926 = (i_876_ * 48) + -32;
		if (i != 684)
		{
			return false;
		}
		anInt921 = (i_876_ * 48) + 32;
		aClass6_1.method11((byte) 113, i_871_, anInt866, i_872_);
		anInt867 -= anInt894;
		anInt927 -= anInt852;
		final int i_877_ = -i_873_ + anInt867;
		final int i_878_ = -i_874_ + anInt927;
		for (int i_879_ = 0; anInt1022 > i_879_; i_879_++)
		{
			anIntArray191[i_879_] -= i_877_;
			anIntArray170[i_879_] -= i_878_;
			final int i_880_ = anIntArray191[i_879_];
			final int i_881_ = anIntArray170[i_879_];
			final int i_882_ = anIntArray178[i_879_];
			final Class23 class23 = aClass23Array4[i_879_];
			final int i_883_ = anIntArray171[i_879_];
			int i_884_;
			int i_885_;
			if ((i_883_ != 0) && (i_883_ != 4))
			{
				i_884_ = Class45.anIntArray115[i_882_];
				i_885_ = Class7.anIntArray17[i_882_];
			}
			else
			{
				i_884_ = Class7.anIntArray17[i_882_];
				i_885_ = Class45.anIntArray115[i_882_];
			}
			final int i_886_ = ((i_880_ - (-i_880_ + -i_885_)) * anInt856) / 2;
			final int i_887_ = ((i_884_ + i_881_ + i_881_) * anInt856) / 2;
			if ((0 <= i_880_) && (i_881_ >= 0) && (96 > i_880_) && (96 > i_881_))
			{
				aClass41_2.method267(class23, (byte) -113);
				class23.method164(i_887_, -aClass6_1.method35(i_887_, true, i_886_), 54, i_886_);
				aClass6_1.method31(i_882_, (byte) -58, i_880_, i_881_);
				if (i_882_ == 74)
				{
					class23.method137(1, 0, -480, 0);
				}
			}
		}
		for (int i_888_ = 0; i_888_ < anInt957; i_888_++)
		{
			anIntArray176[i_888_] -= i_877_;
			anIntArray167[i_888_] -= i_878_;
			final int i_889_ = anIntArray176[i_888_];
			final int i_890_ = anIntArray167[i_888_];
			final int i_891_ = anIntArray190[i_888_];
			final int i_892_ = anIntArray163[i_888_];
			aClass6_1.method15(16, i_892_, i_889_, i_891_, i_890_);
			final Class23 class23 = method506(false, i_888_, i_891_, i_889_, i_890_, i_892_);
			aClass23Array5[i_888_] = class23;
		}
		for (int i_893_ = 0; anInt1062 > i_893_; i_893_++)
		{
			anIntArray192[i_893_] -= i_877_;
			anIntArray199[i_893_] -= i_878_;
		}
		for (int i_894_ = 0; i_894_ < anInt932; i_894_++)
		{
			final Class15 class15 = aClass15Array3[i_894_];
			class15.anInt159 -= i_878_ * anInt856;
			class15.anInt166 -= i_877_ * anInt856;
			for (int i_895_ = 0; class15.anInt149 >= i_895_; i_895_++)
			{
				class15.anIntArray38[i_895_] -= i_877_ * anInt856;
				class15.anIntArray39[i_895_] -= i_878_ * anInt856;
			}
		}
		for (int i_896_ = 0; anInt1039 > i_896_; i_896_++)
		{
			final Class15 class15 = aClass15Array5[i_896_];
			class15.anInt159 -= i_878_ * anInt856;
			class15.anInt166 -= i_877_ * anInt856;
			for (int i_897_ = 0; class15.anInt149 >= i_897_; i_897_++)
			{
				class15.anIntArray38[i_897_] -= i_877_ * anInt856;
				class15.anIntArray39[i_897_] -= i_878_ * anInt856;
			}
		}
		aClass6_1.aBool2 = true;
		return true;
	}

	private void method581(final byte i)
	{
		anInt899 = 1;
		anInt803++;
		anInt1035 = 0;
		anInt970 = 0;
		anInt1054 = 0;
		anInt949 = 0;
		method566((byte) 115);
		aClass46_Sub1_2.method331(-1964300920);
		aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -30);
		for (int i_898_ = 0; anInt1022 > i_898_; i_898_++)
		{
			aClass41_2.method294(aClass23Array4[i_898_], 1);
			aClass6_1.method26(anIntArray178[i_898_], anIntArray170[i_898_], anIntArray191[i_898_], -30895);
		}
		for (int i_899_ = 0; anInt957 > i_899_; i_899_++)
		{
			aClass41_2.method294(aClass23Array5[i_899_], 1);
			aClass6_1.method42(anIntArray163[i_899_], anIntArray176[i_899_], false, anIntArray190[i_899_],
			        anIntArray167[i_899_]);
		}
		anInt932 = 0;
		anInt1062 = 0;
		anInt957 = 0;
		anInt1022 = 0;
		for (int i_900_ = 0; 4000 > i_900_; i_900_++)
		{
			aClass15Array2[i_900_] = null;
		}
		for (int i_901_ = 0; 500 > i_901_; i_901_++)
		{
			aClass15Array3[i_901_] = null;
		}
		anInt1039 = 0;
		for (int i_902_ = 0; 5000 > i_902_; i_902_++)
		{
			aClass15Array6[i_902_] = null;
		}
		for (int i_903_ = 0; i_903_ < 500; i_903_++)
		{
			aClass15Array5[i_903_] = null;
		}
		for (int i_904_ = 0; 50 > i_904_; i_904_++)
		{
			aBoolArray11[i_904_] = false;
		}
		aBool81 = false;
		this.anInt738 = 0;
		this.anInt737 = 0;
		anInt994 = 0;
		anInt887 = 0;
		Class16.anInt185 = 0;
		aBool69 = false;
		aBool57 = false;
		for (int i_905_ = 0; i_905_ < 100; i_905_++)
		{
			Class2.aStringArray3[i_905_] = null;
			Class29.anIntArray83[i_905_] = 0;
			Class13.aStringArray13[i_905_] = null;
			Class46.anIntArray126[i_905_] = 0;
			Class27.aStringArray23[i_905_] = null;
			Class26.aStringArray21[i_905_] = null;
			Class27_Sub1.anIntArray142[i_905_] = 0;
		}
		aClass10_2.method75(0, anInt1052);
		aClass10_2.method75(0, anInt987);
		aClass10_2.method75(0, anInt990);
	}

	private Class15 method582(final byte i, final int i_906_)
	{
		anInt884++;
		int i_907_ = 0;
		if (i >= -31)
		{
			aClass10_6 = null;
		}
		for (/**/; anInt1039 > i_907_; i_907_++)
		{
			if (i_906_ == aClass15Array5[i_907_].anInt150)
			{
				return aClass15Array5[i_907_];
			}
		}
		return null;
	}

	private void method583(final byte i)
	{
		AClass1_Sub1.method422("torcha2", -109);
		anInt835++;
		AClass1_Sub1.method422("torcha3", -124);
		AClass1_Sub1.method422("torcha4", -123);
		AClass1_Sub1.method422("skulltorcha2", -114);
		AClass1_Sub1.method422("skulltorcha3", -123);
		AClass1_Sub1.method422("skulltorcha4", -124);
		AClass1_Sub1.method422("firea2", -107);
		AClass1_Sub1.method422("firea3", -85);
		AClass1_Sub1.method422("fireplacea2", -109);
		AClass1_Sub1.method422("fireplacea3", -113);
		AClass1_Sub1.method422("firespell2", -106);
		AClass1_Sub1.method422("firespell3", -126);
		AClass1_Sub1.method422("lightning2", -110);
		AClass1_Sub1.method422("lightning3", -124);
		AClass1_Sub1.method422("clawspell2", -98);
		AClass1_Sub1.method422("clawspell3", -85);
		AClass1_Sub1.method422("clawspell4", -90);
		AClass1_Sub1.method422("clawspell5", -103);
		AClass1_Sub1.method422("spellcharge2", -112);
		AClass1_Sub1.method422("spellcharge3", -127);
		if (Class38.aFrame_Sub1_1 == null)
		{
			final byte[] is = method468("3d models", 60, 9, -21865);
			if (is == null)
			{
				aBool52 = true;
			}
			else
			{
				for (int i_908_ = 0; Class4.anInt11 > i_908_; i_908_++)
				{
					final int i_909_ = (RuntimeException_Sub1.method461(
					        new StringBuilder().append(Class2.aStringArray1[i_908_]).append(".ob3").toString(), is,
					        false));
					if (i_909_ != 0)
					{
						aClass23Array6[i_908_] = new Class23(is, i_909_, true);
					}
					else
					{
						aClass23Array6[i_908_] = new Class23(1, 1);
					}
					if (Class2.aStringArray1[i_908_].equals("giantcrystal"))
					{
						aClass23Array6[i_908_].aBool10 = true;
					}
				}
			}
		}
		else
		{
			method482(70, 97, "Loading 3d models");
			for (int i_910_ = 0; Class4.anInt11 > i_910_; i_910_++)
			{
				aClass23Array6[i_910_] = new Class23(new StringBuilder().append("../content/src/models/")
				        .append(Class2.aStringArray1[i_910_]).append(".ob2").toString());
				if (Class2.aStringArray1[i_910_].equals("giantcrystal"))
				{
					aClass23Array6[i_910_].aBool10 = true;
				}
			}
		}
	}

	private int method584(final int i, final boolean bool)
	{
		anInt804++;
		int i_911_ = 0;
		for (int i_912_ = 0; i_912_ < anInt1015; i_912_++)
		{
			if (anIntArray194[i_912_] == i)
			{
				if (Class1.anIntArray1[i] != 1)
				{
					i_911_ += anIntArray166[i_912_];
				}
				else
				{
					i_911_++;
				}
			}
		}
		return i_911_;
	}

	private void method585(final boolean bool)
	{
		anInt821++;
		int i = 97;
		aClass46_Sub1_2.method321(77, 0, 180, 340, 86, 1);
		aClass46_Sub1_2.method362(180, 86, (byte) -93, 340, 16777215, 77);
		aClass46_Sub1_2.method335(16711680, 255, 4, "Warning! Proceed with caution", i, 256);
		i += 26;
		aClass46_Sub1_2.method335(16777215, 255, 1, "If you go much further north you will enter the", i, 256);
		i += 13;
		aClass46_Sub1_2.method335(16777215, 255, 1, "wilderness. This a very dangerous area where", i, 256);
		i += 13;
		aClass46_Sub1_2.method335(16777215, 255, 1, "other players can attack you!", i, 256);
		i += 22;
		aClass46_Sub1_2.method335(16777215, 255, 1, "The further north you go the more dangerous it", i, 256);
		i += 13;
		aClass46_Sub1_2.method335(16777215, 255, 1, "becomes, but the more treasure you will find.", i, 256);
		i += 22;
		aClass46_Sub1_2.method335(16777215, 255, 1, "In the wilderness an indicator at the bottom-right", i, 256);
		i += 13;
		aClass46_Sub1_2.method335(16777215, 255, 1, "of the screen will show the current level of danger", i, 256);
		i += 22;
		int i_913_ = 16777215;
		if (((i + -12) < this.anInt736) && (i >= this.anInt736) && (181 < this.anInt739) && (this.anInt739 < 331))
		{
			i_913_ = 16711680;
		}
		aClass46_Sub1_2.method335(i_913_, 255, 1, "Click here to close window", i, 256);
		if (anInt887 != 0)
		{
			if (((i - 12) < this.anInt736) && (this.anInt736 <= i) && (this.anInt739 > 181) && (this.anInt739 < 331))
			{
				anInt979 = 2;
			}
			anInt887 = 0;
			if ((86 > this.anInt739) || (this.anInt739 > 426) || (this.anInt736 < 77) || (this.anInt736 > 257))
			{
				anInt979 = 2;
			}
		}
	}

	private void method586(final int i, final String string)
	{
		anInt772++;
		if ((!aBool55 ? 100 : 200) <= Class16.anInt185)
		{
			method513(0, "Friend list is full", 0, null, -107, null, null, false);
		}
		else
		{
			if (i >= -108)
			{
				anInt1051 = 2;
			}
			final String string_914_ = Class43.method298((byte) 74, string);
			if (string_914_ != null)
			{
				for (int i_915_ = 0; Class16.anInt185 > i_915_; i_915_++)
				{
					if (string_914_.equals(Class43.method298((byte) -105, (Class28.aStringArray24[i_915_]))))
					{
						method513(0, new StringBuilder().append(string).append(" is already on your friend list.")
						        .toString(), 0, null, -33, null, null, false);
						return;
					}
					if ((RuntimeException_Sub1.aStringArray41[i_915_] != null) && (string_914_
					        .equals(Class43.method298((byte) 87, (RuntimeException_Sub1.aStringArray41[i_915_])))))
					{
						method513(0, new StringBuilder().append(string).append(" is already on your friend list.")
						        .toString(), 0, null, -115, null, null, false);
						return;
					}
				}
				for (int i_916_ = 0; i_916_ < Class10.anInt129; i_916_++)
				{
					if (string_914_.equals(Class43.method298((byte) 72, (Class46.aStringArray33[i_916_]))))
					{
						method513(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your ignore list first.").toString(),
						        0, null, -19, null, null, false);
						return;
					}
					if ((Class6.aStringArray7[i_916_] != null)
					        && string_914_.equals(Class43.method298((byte) 96, (Class6.aStringArray7[i_916_]))))
					{
						method513(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your ignore list first.").toString(),
						        0, null, -87, null, null, false);
						return;
					}
				}
				if (string_914_.equals(Class43.method298((byte) -86, (aClass15_1.aString7))))
				{
					method513(0, "You can't add yourself to your own friend list.", 0, null, -24, null, null, false);
				}
				else
				{
					aClass16_Sub1_1.method118(195, 104);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, string);
					aClass16_Sub1_1.method126(2);
				}
			}
		}
	}

	private void method587(final byte i)
	{
		anInt920++;
		if (anInt902 > 0)
		{
			anInt902--;
		}
		if (anInt1035 == 0)
		{
			aClass10_7.method85(this.anInt737, this.anInt736, this.anInt738, (byte) -95, this.anInt739);
			if (aClass10_7.method81(true, anInt1040))
			{
				anInt1035 = 2;
				aClass10_5.method98(true, "", anInt1005);
				aClass10_5.method98(true, "Please enter your username and password", anInt1037);
				aClass10_5.method98(true, "", anInt1002);
				aClass10_5.method98(true, "", anInt942);
				aClass10_5.method91((byte) 88, anInt1002);
			}
		}
		else if (anInt1035 == 2)
		{
			aClass10_5.method85(this.anInt737, this.anInt736, this.anInt738, (byte) -117, this.anInt739);
			if (aClass10_5.method81(true, anInt1033))
			{
				anInt1035 = 0;
			}
			if (aClass10_5.method81(true, anInt1002))
			{
				aClass10_5.method91((byte) 91, anInt942);
			}
			if (aClass10_5.method81(true, anInt942) || aClass10_5.method81(true, anInt1008))
			{
				aString34 = aClass10_5.method100(125, anInt1002);
				aString39 = aClass10_5.method100(125, anInt942);
				anInt850 = 2;
				method519(-126, aString39, aString34, false);
			}
		}
	}

	@Override
	void method470(final int i)
	{
		anInt842++;
		if (!aBool50 && !aBool54 && !aBool52)
		{
			if (aClass37_1 != null)
			{
				aClass37_1.method234();
			}
			try
			{
				anInt930++;
				if (anInt899 == 0)
				{
					this.anInt722 = 0;
					method587((byte) -108);
				}
				if (anInt899 == 1)
				{
					this.anInt722++;
					method591(56);
				}
				this.anInt738 = 0;
				anInt937++;
				if (anInt937 > 500)
				{
					anInt937 = 0;
					final int i_917_ = (int) (Math.random() * 4.0);
					if ((i_917_ & 0x1) == 1)
					{
						anInt882 += anInt886;
					}
					if ((i_917_ & 0x2) == 2)
					{
						anInt923 += anInt864;
					}
				}
				if (anInt882 < -50)
				{
					anInt886 = 2;
				}
				if (anInt882 > 50)
				{
					anInt886 = -2;
				}
				if (-50 > anInt923)
				{
					anInt864 = 2;
				}
				if (anInt943 > 0)
				{
					anInt943--;
				}
				if (anInt1056 > 0)
				{
					anInt1056--;
				}
				if (anInt981 > 0)
				{
					anInt981--;
				}
				if (anInt923 > 50)
				{
					anInt864 = -2;
				}
				if (anInt986 > 0)
				{
					anInt986--;
				}
			}
			catch (final OutOfMemoryError outofmemoryerror)
			{
				aBool54 = true;
			}
		}
	}

	private void method588(final int i)
	{
		anInt862++;
		anInt1048 = 0;
		boolean bool = true;
		if ((this.anInt739 >= 36) && (this.anInt739 < 176))
		{
			anInt1048 = 1;
		}
		else if ((this.anInt739 < 186) || (326 <= this.anInt739))
		{
			if ((336 > this.anInt739) || (this.anInt739 >= 476))
			{
				bool = false;
			}
			else
			{
				anInt1048 = 12;
			}
		}
		else
		{
			anInt1048 = 7;
		}
		int i_918_ = 156;
		if (bool)
		{
			bool = false;
			for (int i_919_ = 0; 6 > i_919_; i_919_++)
			{
				final int i_920_ = i_919_ == 0 ? 30 : 18;
				if (((i_918_ + -12) < this.anInt736) && (this.anInt736 < ((i_918_ - 12) + i_920_)))
				{
					if (anInt1048 == 1)
					{
						bool = true;
						anInt1048 += i_919_;
						break;
					}
					if (anInt1048 == 7)
					{
						if (i_919_ < 5)
						{
							anInt1048 += i_919_;
							bool = true;
						}
						break;
					}
					if (anInt1048 == 12)
					{
						if (3 > i_919_)
						{
							anInt1048 += i_919_;
							bool = true;
						}
						break;
					}
				}
				i_918_ = i_918_ + i_920_ + 2;
			}
		}
		if (!bool)
		{
			anInt1048 = 0;
		}
		if ((anInt887 != 0) && (anInt1048 != 0))
		{
			aClass16_Sub1_1.method118(206, i + 62);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, aString33);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1048);
			aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(i + -31581, aBool76 ? 1 : 0);
			aClass16_Sub1_1.method126(2);
			anInt994 = 0;
			anInt887 = 0;
			this.aString26 = "";
			this.aString27 = "";
		}
		else
		{
			i_918_ += 15;
			if (anInt887 != 0)
			{
				anInt887 = 0;
				if ((this.anInt739 < 31) || (this.anInt736 < 35) || (481 < this.anInt739) || (310 < this.anInt736))
				{
					anInt994 = 0;
					return;
				}
				if ((66 < this.anInt739) && (this.anInt739 < 446) && ((i_918_ - 15) <= this.anInt736)
				        && ((i_918_ + 5) > this.anInt736))
				{
					anInt994 = 0;
					return;
				}
			}
			aClass46_Sub1_2.method321(35, 0, 275, 450, 31, 1);
			i_918_ = 50;
			aClass46_Sub1_2.method362(275, 31, (byte) -126, 450, 16777215, 35);
			aClass46_Sub1_2.method335(16777215, i ^ 0xf0, 1,
			        "This form is for reporting players who are breaking our rules", i_918_, 256);
			i_918_ += 15;
			aClass46_Sub1_2.method335(16777215, 255, 1,
			        "Using it sends a snapshot of the last 60 seconds of activity to us", i_918_, 256);
			i_918_ += 15;
			aClass46_Sub1_2.method335(16744448, 255, 1, "If you misuse this form, you will be banned.", i_918_, 256);
			i_918_ += 15;
			i_918_ += 10;
			aClass46_Sub1_2.method335(16776960, 255, 1,
			        "Click on the most suitable option from the Rules of RuneScape.", i_918_, 256);
			i_918_ += i;
			aClass46_Sub1_2.method335(16776960, 255, 1,
			        "This will send a report to our Player Support team for investigation.", i_918_, 256);
			i_918_ += 18;
			aClass46_Sub1_2.method335(16711680, 255, 4, "Honour", i_918_, 106);
			aClass46_Sub1_2.method335(16711680, 255, 4, "Respect", i_918_, 256);
			aClass46_Sub1_2.method335(16711680, i ^ 0xf0, 4, "Security", i_918_, 406);
			i_918_ += 18;
			if (anInt1048 == 1)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 30, 140, 36, 1);
			}
			aClass46_Sub1_2.method362(30, 36, (byte) 81, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 7)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 30, 140, 186, 1);
			}
			aClass46_Sub1_2.method362(30, 186, (byte) 106, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 12)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 30, 140, 336, 1);
			}
			aClass46_Sub1_2.method362(30, 336, (byte) -78, 140, 4210752, i_918_ + -12);
			int i_921_;
			if (anInt1048 == 1)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Buying or", i_918_, 106);
			if (anInt1048 == 7)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Seriously offensive", i_918_, 256);
			if (anInt1048 == 12)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Asking for or providing", i_918_, 406);
			if (anInt1048 == 1)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			i_918_ += 12;
			aClass46_Sub1_2.method335(i_921_, 255, 0, "selling an account", i_918_, 106);
			if (anInt1048 != 7)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, i ^ 0xf0, 0, "language", i_918_, 256);
			if (anInt1048 != 12)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, i + 240, 0, "contact information", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 2)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			aClass46_Sub1_2.method362(18, 36, (byte) -105, 140, 4210752, i_918_ - 12);
			if (anInt1048 == 8)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 186, 1);
			}
			aClass46_Sub1_2.method362(18, 186, (byte) -90, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 13)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 336, i ^ 0xe);
			}
			aClass46_Sub1_2.method362(18, 336, (byte) -95, 140, 4210752, i_918_ + -12);
			if (anInt1048 != 2)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Encouraging rule-breaking", i_918_, 106);
			if (anInt1048 != 8)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Solicitation", i_918_, 256);
			if (anInt1048 != 13)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Breaking real-world laws", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 3)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			aClass46_Sub1_2.method362(18, 36, (byte) -120, 140, 4210752, i_918_ - 12);
			if (anInt1048 == 9)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 186, i ^ 0xe);
			}
			aClass46_Sub1_2.method362(18, 186, (byte) 112, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 14)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 336, 1);
			}
			aClass46_Sub1_2.method362(18, 336, (byte) -105, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 3)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Staff impersonation", i_918_, 106);
			if (anInt1048 != 9)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Disruptive behaviour", i_918_, 256);
			if (anInt1048 != 14)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, i ^ 0xf0, 0, "Advertising websites", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 4)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 36, i + -14);
			}
			aClass46_Sub1_2.method362(18, 36, (byte) 126, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 10)
			{
				aClass46_Sub1_2.method321(i_918_ - 12, 3158064, 18, 140, 186, i + -14);
			}
			aClass46_Sub1_2.method362(18, 186, (byte) -75, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 4)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Macroing or use of bots", i_918_, 106);
			if (anInt1048 == 10)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Offensive account name", i_918_, 256);
			i_918_ += 20;
			if (anInt1048 == 5)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			aClass46_Sub1_2.method362(18, 36, (byte) 56, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 11)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 186, i + -14);
			}
			aClass46_Sub1_2.method362(18, 186, (byte) 120, 140, 4210752, i_918_ - 12);
			if (anInt1048 != 5)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Scamming", i_918_, 106);
			if (anInt1048 != 11)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Real-life threats", i_918_, 256);
			i_918_ += 20;
			if (anInt1048 == 6)
			{
				aClass46_Sub1_2.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			aClass46_Sub1_2.method362(18, 36, (byte) -71, 140, 4210752, i_918_ + -12);
			if (anInt1048 != 6)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 0, "Exploiting a bug", i_918_, 106);
			i_918_ += 18;
			i_918_ += 15;
			i_921_ = 16777215;
			if ((this.anInt739 > 196) && (316 > this.anInt739) && ((i_918_ + -15) < this.anInt736)
			        && (this.anInt736 < (i_918_ - -5)))
			{
				i_921_ = 16776960;
			}
			aClass46_Sub1_2.method335(i_921_, 255, 1, "Click here to cancel", i_918_, 256);
		}
	}

	private void method589(final byte i)
	{
		anInt982 = anInt952;
		anInt802++;
		for (int i_922_ = 0; i_922_ < anInt952; i_922_++)
		{
			anIntArray210[i_922_] = anIntArray177[i_922_];
			anIntArray184[i_922_] = anIntArray207[i_922_];
		}
		for (int i_923_ = 0; (anInt1015 > i_923_) && (anInt982 < anInt1017); i_923_++)
		{
			final int i_924_ = anIntArray194[i_923_];
			boolean bool = false;
			for (int i_925_ = 0; anInt982 > i_925_; i_925_++)
			{
				if (i_924_ == anIntArray210[i_925_])
				{
					bool = true;
					break;
				}
			}
			if (!bool)
			{
				anIntArray210[anInt982] = i_924_;
				anIntArray184[anInt982] = 0;
				anInt982++;
			}
		}
	}

	private void method590(final int i)
	{
		anInt919++;
		if ((0 <= anInt940) || (0 <= anInt989))
		{
			aClass29_1.method209("Cancel", (byte) -66, "", 4000);
		}
		aClass29_1.method199(i + 10);
		final int i_926_ = aClass29_1.method198(-104);
		for (int i_927_ = i_926_; 20 < i_927_; i_927_--)
		{
			aClass29_1.method202(i_927_ + -1, 5139);
		}
		if (anInt939 == 5)
		{
			String string = null;
			if ((anInt1042 == 0) && (anInt1016 != -1))
			{
				if (0 > anInt1016)
				{
					final int i_928_ = -(anInt1016 + 2);
					string = new StringBuilder().append("Click to remove ").append(Class28.aStringArray24[i_928_])
					        .toString();
					if ((RuntimeException_Sub1.aStringArray41[i_928_] != null)
					        && (0 < RuntimeException_Sub1.aStringArray41[i_928_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(RuntimeException_Sub1.aStringArray41[i_928_]).append(")").toString();
					}
				}
				else
				{
					String string_929_ = "";
					final int i_930_ = anInt1016;
					if ((0x4 & Class7.anIntArray18[i_930_]) == 0)
					{
						string = Class28.aStringArray24[i_930_];
						string_929_ = " is offline";
					}
					else
					{
						if (Class10.aStringArray8[i_930_] != null)
						{
							string_929_ = new StringBuilder().append(" on ").append(Class10.aStringArray8[i_930_])
							        .toString();
						}
						string = new StringBuilder().append("Click to message ").append(Class28.aStringArray24[i_930_])
						        .toString();
					}
					if ((RuntimeException_Sub1.aStringArray41[i_930_] != null)
					        && (0 < RuntimeException_Sub1.aStringArray41[i_930_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(RuntimeException_Sub1.aStringArray41[i_930_]).append(")").append(string_929_)
						        .toString();
					}
					else
					{
						string = new StringBuilder().append(string).append(string_929_).toString();
					}
				}
			}
			if ((anInt1042 == 1) && (anInt997 != -1))
			{
				if (anInt997 < 0)
				{
					final int i_931_ = -(anInt997 - -2);
					string = new StringBuilder().append("Click to remove ").append(Class46.aStringArray33[i_931_])
					        .toString();
					if ((Class6.aStringArray7[i_931_] != null) && (0 < Class6.aStringArray7[i_931_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(Class6.aStringArray7[i_931_]).append(")").toString();
					}
				}
				else
				{
					final int i_932_ = anInt997;
					string = new StringBuilder().append("Ignoring ").append(Class46.aStringArray33[i_932_]).toString();
					if ((Class6.aStringArray7[i_932_] != null) && (0 < Class6.aStringArray7[i_932_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(Class6.aStringArray7[i_932_]).append(")").toString();
					}
				}
			}
			if (string != null)
			{
				aClass46_Sub1_2.method324(string, 0, 1, 16776960, 6, 14);
			}
		}
		final int i_933_ = aClass29_1.method198(-124);
		if (i < i_933_)
		{
			int i_934_ = -1;
			for (int i_935_ = 0; i_933_ > i_935_; i_935_++)
			{
				final String string = aClass29_1.method201(0, i_935_);
				if ((string != null) && (string.length() > 0))
				{
					i_934_ = i_935_;
					break;
				}
			}
			String string = null;
			if (((anInt989 < 0) && (0 > anInt940)) || (i_933_ != 1))
			{
				if (((0 <= anInt989) || (0 <= anInt940)) && (1 < i_933_))
				{
					string = new StringBuilder().append("@whi@").append(aClass29_1.method205(0, (byte) 118)).append(" ")
					        .append(aClass29_1.method201(i ^ 0x0, 0)).toString();
				}
				else if (i_934_ != -1)
				{
					string = new StringBuilder().append(aClass29_1.method201(0, i_934_)).append(": @whi@")
					        .append(aClass29_1.method205(0, (byte) 126)).toString();
				}
			}
			else
			{
				string = "Choose a target";
			}
			if ((i_933_ == 2) && (string != null))
			{
				string = new StringBuilder().append(string).append("@whi@ / 1 more option").toString();
			}
			if ((i_933_ > 2) && (string != null))
			{
				string = new StringBuilder().append(string).append("@whi@ / ").append(i_933_ + -1)
				        .append(" more options").toString();
			}
			if (string != null)
			{
				aClass46_Sub1_2.method324(string, i ^ 0x0, 1, 16776960, 6, 14);
			}
			if ((!aBool83 && (anInt887 == 1)) || (aBool83 && (anInt887 == 1) && (i_933_ == 1)))
			{
				if (!this.aBool44 || !this.aBool42 || !aBool82)
				{
					method569(0, 617);
				}
				else
				{
					aClass16_Sub1_1.method118(59, 124);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anInt1032, (byte) 79);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method397(anInt958, (byte) 87);
					aClass16_Sub1_1.method126(2);
				}
				anInt887 = 0;
			}
			else if ((!aBool83 && (anInt887 == 2)) || (aBool83 && (anInt887 == 1)))
			{
				final int i_936_ = aClass29_1.method207(true);
				final int i_937_ = aClass29_1.method210(0);
				anInt984 = this.anInt736 + -7;
				anInt955 = this.anInt739 + -(i_936_ / 2);
				aBool61 = true;
				if (0 > anInt955)
				{
					anInt955 = 0;
				}
				if (0 > anInt984)
				{
					anInt984 = 0;
				}
				if ((i_937_ + anInt984) > 315)
				{
					anInt984 = -i_937_ + 315;
				}
				anInt887 = 0;
				if ((anInt955 - -i_936_) > 510)
				{
					anInt955 = -i_936_ + 510;
				}
			}
		}
	}

	private void method591(final int i)
	{
		anInt791++;
		if (1 < anInt949)
		{
			anInt949--;
		}
		method554(20);
		if (anInt970 > 0)
		{
			anInt970--;
		}
		if ((15000 < this.anInt722) && (anInt1051 == 0) && (anInt970 == 0))
		{
			this.anInt722 -= 15000;
			method491((byte) -125);
		}
		else
		{
			if ((aClass15_1.anInt160 == 8) || (aClass15_1.anInt160 == 9))
			{
				anInt1051 = 500;
			}
			if (0 < anInt1051)
			{
				anInt1051--;
			}
			if (aBool64)
			{
				method520((byte) -128);
			}
			else
			{
				for (int i_938_ = 0; i_938_ < anInt932; i_938_++)
				{
					final Class15 class15 = aClass15Array3[i_938_];
					final int i_939_ = (class15.anInt149 - -1) % 10;
					if (i_939_ != class15.anInt147)
					{
						int i_940_ = -1;
						final int i_941_ = class15.anInt147;
						int i_942_;
						if (i_939_ <= i_941_)
						{
							i_942_ = i_939_ + (10 - i_941_);
						}
						else
						{
							i_942_ = -i_941_ + i_939_;
						}
						int i_943_ = 4;
						if (2 < i_942_)
						{
							i_943_ = (i_942_ * 4) + -4;
						}
						if (((anInt856 * 3) >= (class15.anIntArray38[i_941_] + -class15.anInt166))
						        && ((class15.anIntArray39[i_941_] - class15.anInt159) <= (anInt856 * 3))
						        && ((class15.anIntArray38[i_941_] + -class15.anInt166) >= (-anInt856 * 3))
						        && ((class15.anIntArray39[i_941_] + -class15.anInt159) >= (-anInt856 * 3))
						        && (i_942_ <= 8))
						{
							if (class15.anIntArray38[i_941_] > class15.anInt166)
							{
								i_940_ = 2;
								class15.anInt166 += i_943_;
								class15.anInt146++;
							}
							else if (class15.anInt166 > (class15.anIntArray38[i_941_]))
							{
								class15.anInt166 -= i_943_;
								i_940_ = 6;
								class15.anInt146++;
							}
							if (((-class15.anIntArray38[i_941_] + class15.anInt166) < i_943_)
							        && ((class15.anInt166 - (class15.anIntArray38[i_941_])) > -i_943_))
							{
								class15.anInt166 = class15.anIntArray38[i_941_];
							}
							if (class15.anIntArray39[i_941_] <= class15.anInt159)
							{
								if (class15.anIntArray39[i_941_] < class15.anInt159)
								{
									class15.anInt159 -= i_943_;
									if (i_940_ == -1)
									{
										i_940_ = 0;
									}
									else if (i_940_ == 2)
									{
										i_940_ = 1;
									}
									else
									{
										i_940_ = 7;
									}
									class15.anInt146++;
								}
							}
							else
							{
								class15.anInt159 += i_943_;
								class15.anInt146++;
								if (i_940_ == -1)
								{
									i_940_ = 4;
								}
								else if (i_940_ == 2)
								{
									i_940_ = 3;
								}
								else
								{
									i_940_ = 5;
								}
							}
							if (((-class15.anIntArray39[i_941_] + class15.anInt159) < i_943_)
							        && ((-class15.anIntArray39[i_941_] + class15.anInt159) > -i_943_))
							{
								class15.anInt159 = class15.anIntArray39[i_941_];
							}
						}
						else
						{
							class15.anInt166 = class15.anIntArray38[i_941_];
							class15.anInt159 = class15.anIntArray39[i_941_];
						}
						if (i_940_ != -1)
						{
							class15.anInt160 = i_940_;
						}
						if ((class15.anInt166 == class15.anIntArray38[i_941_])
						        && (class15.anInt159 == class15.anIntArray39[i_941_]))
						{
							class15.anInt147 = (i_941_ + 1) % 10;
						}
					}
					else
					{
						class15.anInt160 = class15.anInt167;
					}
					if (0 < class15.anInt145)
					{
						class15.anInt145--;
					}
					if (class15.anInt165 > 0)
					{
						class15.anInt165--;
					}
					if (0 < class15.anInt168)
					{
						class15.anInt168--;
					}
					if (anInt1000 > 0)
					{
						anInt1000--;
						if (anInt1000 == 0)
						{
							method513(0, "You have been granted another life. Be more careful this time!", 0, null, -39,
							        null, null, false);
						}
						if (anInt1000 == 0)
						{
							method513(0, "You retain your skills. Your objects land where you died", 0, null, -69, null,
							        null, false);
						}
					}
				}
				for (int i_944_ = 0; anInt1039 > i_944_; i_944_++)
				{
					final Class15 class15 = aClass15Array5[i_944_];
					final int i_945_ = (class15.anInt149 - -1) % 10;
					if (i_945_ == class15.anInt147)
					{
						if (class15.anInt161 == 43)
						{
							class15.anInt146++;
						}
						class15.anInt160 = class15.anInt167;
					}
					else
					{
						int i_946_ = -1;
						final int i_947_ = class15.anInt147;
						int i_948_;
						if (i_945_ > i_947_)
						{
							i_948_ = -i_947_ + i_945_;
						}
						else
						{
							i_948_ = -i_947_ + i_945_ + 10;
						}
						int i_949_ = 4;
						if (i_948_ > 2)
						{
							i_949_ = (i_948_ + -1) * 4;
						}
						if (((class15.anIntArray38[i_947_] + -class15.anInt166) <= (anInt856 * 3))
						        && ((class15.anIntArray39[i_947_] + -class15.anInt159) <= (anInt856 * 3))
						        && ((-anInt856 * 3) <= (class15.anIntArray38[i_947_] + -class15.anInt166))
						        && ((-anInt856 * 3) <= (class15.anIntArray39[i_947_] - class15.anInt159))
						        && (i_948_ <= 8))
						{
							if (class15.anInt166 < class15.anIntArray38[i_947_])
							{
								i_946_ = 2;
								class15.anInt166 += i_949_;
								class15.anInt146++;
							}
							else if (class15.anInt166 > (class15.anIntArray38[i_947_]))
							{
								class15.anInt166 -= i_949_;
								i_946_ = 6;
								class15.anInt146++;
							}
							if ((i_949_ > (-class15.anIntArray38[i_947_] + class15.anInt166))
							        && ((-class15.anIntArray38[i_947_] + class15.anInt166) > -i_949_))
							{
								class15.anInt166 = class15.anIntArray38[i_947_];
							}
							if (class15.anInt159 >= class15.anIntArray39[i_947_])
							{
								if (class15.anInt159 > (class15.anIntArray39[i_947_]))
								{
									class15.anInt146++;
									if (i_946_ == -1)
									{
										i_946_ = 0;
									}
									else if (i_946_ != 2)
									{
										i_946_ = 7;
									}
									else
									{
										i_946_ = 1;
									}
									class15.anInt159 -= i_949_;
								}
							}
							else
							{
								class15.anInt159 += i_949_;
								if (i_946_ == -1)
								{
									i_946_ = 4;
								}
								else if (i_946_ == 2)
								{
									i_946_ = 3;
								}
								else
								{
									i_946_ = 5;
								}
								class15.anInt146++;
							}
							if ((i_949_ > (-class15.anIntArray39[i_947_] + class15.anInt159))
							        && (-i_949_ < (-(class15.anIntArray39[i_947_]) + class15.anInt159)))
							{
								class15.anInt159 = class15.anIntArray39[i_947_];
							}
						}
						else
						{
							class15.anInt166 = class15.anIntArray38[i_947_];
							class15.anInt159 = class15.anIntArray39[i_947_];
						}
						if (i_946_ != -1)
						{
							class15.anInt160 = i_946_;
						}
						if ((class15.anInt166 == class15.anIntArray38[i_947_])
						        && (class15.anInt159 == class15.anIntArray39[i_947_]))
						{
							class15.anInt147 = (i_947_ - -1) % 10;
						}
					}
					if (0 < class15.anInt168)
					{
						class15.anInt168--;
					}
					if (0 < class15.anInt145)
					{
						class15.anInt145--;
					}
					if (0 < class15.anInt165)
					{
						class15.anInt165--;
					}
				}
				if (anInt939 != 2)
				{
					if (0 < Class46.anInt569)
					{
						anInt1027++;
					}
					Class46.anInt569 = 0;
					if (Class3.anInt7 > 0)
					{
						anInt1027 = 0;
					}
					Class3.anInt7 = 0;
				}
				for (int i_950_ = 0; i_950_ < anInt932; i_950_++)
				{
					final Class15 class15 = aClass15Array3[i_950_];
					if (class15.anInt158 > 0)
					{
						class15.anInt158--;
					}
				}
				if (anInt1027 > 20)
				{
					anInt1027 = 0;
					aBool73 = false;
				}
				if (!aBool80)
				{
					if ((-500 > (anInt906 + -aClass15_1.anInt166)) || (500 < (anInt906 + -aClass15_1.anInt166))
					        || (-500 > (anInt907 - aClass15_1.anInt159)) || (500 < (anInt907 + -aClass15_1.anInt159)))
					{
						anInt906 = aClass15_1.anInt166;
						anInt907 = aClass15_1.anInt159;
					}
					if (aClass15_1.anInt159 != anInt907)
					{
						anInt907 += ((-anInt907 + aClass15_1.anInt159) / (((anInt845 - 500) / 15) + 16));
					}
					if (aClass15_1.anInt166 != anInt906)
					{
						anInt906 += ((-anInt906 + aClass15_1.anInt166) / (((-500 + anInt845) / 15) + 16));
					}
					if (aBool86)
					{
						final int i_951_ = anInt933 * 32;
						int i_952_ = i_951_ + -anInt843;
						int i_953_ = 1;
						if (i_952_ == 0)
						{
							anInt885 = 0;
						}
						else
						{
							if (i_952_ <= 128)
							{
								if (0 < i_952_)
								{
									i_953_ = 1;
								}
								else if (-128 > i_952_)
								{
									i_953_ = 1;
									i_952_ = 256 - -i_952_;
								}
								else if (i_952_ < 0)
								{
									i_952_ = -i_952_;
									i_953_ = -1;
								}
							}
							else
							{
								i_953_ = -1;
								i_952_ = -i_952_ + 256;
							}
							anInt885++;
							anInt843 += i_953_ * (((i_952_ * anInt885) + 255) / 256);
							anInt843 &= 0xff;
						}
					}
				}
				else if (((anInt906 + -aClass15_1.anInt166) < -500) || (500 < (anInt906 + -aClass15_1.anInt166))
				        || ((anInt907 + -aClass15_1.anInt159) < -500) || (500 < (anInt907 - aClass15_1.anInt159)))
				{
					anInt906 = aClass15_1.anInt166;
					anInt907 = aClass15_1.anInt159;
				}
				if (aBool69)
				{
					if (this.aString26.length() > 0)
					{
						if (this.aString26.equalsIgnoreCase("::lostcon") && !aBool51)
						{
							aClass16_Sub1_1.method119((byte) -122);
						}
						else if (!this.aString26.equalsIgnoreCase("::closecon") || aBool51)
						{
							aClass16_Sub1_1.method118(45, i ^ 0x75);
							if (!aBool73)
							{
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 0);
								aBool73 = true;
							}
							else
							{
								aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 1);
							}
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, this.aString26);
							aClass16_Sub1_1.method126(2);
							this.aString26 = "";
							aString35 = "Please wait...";
							this.aString27 = "";
						}
						else
						{
							method544(true, (byte) 72);
						}
					}
					if ((this.anInt738 == 1) && (275 < this.anInt736) && (310 > this.anInt736) && (this.anInt739 > 56)
					        && (456 > this.anInt739))
					{
						aClass16_Sub1_1.method118(45, 101);
						if (aBool73)
						{
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 1);
						}
						else
						{
							aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, 0);
							aBool73 = true;
						}
						aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method389(0, "-null-");
						aClass16_Sub1_1.method126(i ^ 0x3a);
						aString35 = "Please wait...";
						this.aString26 = "";
						this.aString27 = "";
					}
					this.anInt738 = 0;
				}
				else
				{
					if (this.anInt736 > (anInt879 + -4))
					{
						if ((15 < this.anInt739) && (96 > this.anInt739) && (this.anInt738 == 1))
						{
							anInt976 = 0;
						}
						if ((this.anInt739 > 110) && (this.anInt739 < 194) && (this.anInt738 == 1))
						{
							anInt976 = 1;
							aClass10_2.anIntArray23[anInt1052] = 999999;
						}
						if ((215 < this.anInt739) && (this.anInt739 < 295) && (this.anInt738 == 1))
						{
							anInt976 = 2;
							aClass10_2.anIntArray23[anInt987] = 999999;
						}
						if ((this.anInt739 > 315) && (395 > this.anInt739) && (this.anInt738 == 1))
						{
							anInt976 = 3;
							aClass10_2.anIntArray23[anInt990] = 999999;
						}
						if ((this.anInt739 > 417) && (497 > this.anInt739) && (this.anInt738 == 1))
						{
							this.aString26 = "";
							this.aString27 = "";
							anInt994 = 1;
						}
						this.anInt738 = 0;
						this.anInt737 = 0;
					}
					aClass10_2.method85(this.anInt737, this.anInt736, this.anInt738, (byte) -63, this.anInt739);
					if ((anInt976 > 0) && (this.anInt739 >= 494) && (this.anInt736 >= (anInt879 + -66)))
					{
						this.anInt738 = 0;
					}
					if (aClass10_2.method81(true, anInt1019))
					{
						final String string = aClass10_2.method100(127, anInt1019);
						aClass10_2.method98(true, "", anInt1019);
						if (string.startsWith("::"))
						{
							if (string.equalsIgnoreCase("::closecon") && !aBool51)
							{
								aClass16_Sub1_1.method119((byte) -122);
							}
							else if (string.equalsIgnoreCase("::logout") && !aBool51)
							{
								method544(true, (byte) 72);
							}
							else if (!string.equalsIgnoreCase("::lostcon") || aBool51)
							{
								method563(string.substring(2), -11350);
							}
							else
							{
								method575(i ^ 0x6426);
							}
						}
						else
						{
							method504((byte) 127, string);
						}
					}
					if (i == 56)
					{
						for (int i_954_ = 0; 100 > i_954_; i_954_++)
						{
							if (0 < Class29.anIntArray83[i_954_])
							{
								Class29.anIntArray83[i_954_]--;
							}
						}
						if (!aBool84 && !aBool72)
						{
							anInt1036 = 0;
							anInt1009 = 0;
						}
						else
						{
							if (this.anInt737 != 0)
							{
								anInt1009++;
							}
							else
							{
								anInt1009 = 0;
							}
							if (anInt1009 <= 600)
							{
								if (450 < anInt1009)
								{
									anInt1036 += 500;
								}
								else if (300 < anInt1009)
								{
									anInt1036 += 50;
								}
								else if (anInt1009 <= 150)
								{
									if (50 >= anInt1009)
									{
										if ((anInt1009 > 20) && ((anInt1009 & 0x5) == 0))
										{
											anInt1036++;
										}
									}
									else
									{
										anInt1036++;
									}
								}
								else
								{
									anInt1036 += 5;
								}
							}
							else
							{
								anInt1036 += 5000;
							}
						}
						if (anInt1000 != 0)
						{
							this.anInt738 = 0;
						}
						if (this.anInt738 == 1)
						{
							anInt887 = 1;
						}
						else if (this.anInt738 == 2)
						{
							anInt887 = 2;
						}
						aClass41_2.method286(this.anInt736, this.anInt739, (byte) -19);
						this.anInt738 = 0;
						if (aBool86)
						{
							if ((anInt885 == 0) || aBool80)
							{
								if (this.aBool41)
								{
									this.aBool41 = false;
									anInt933 = 0x7 & (anInt933 + 1);
									if (!aBool53)
									{
										if ((0x1 & anInt933) == 0)
										{
											anInt933 = 0x7 & (anInt933 - -1);
										}
										for (int i_955_ = 0; ((i_955_ < 8) && !method541(anInt933, -103)); i_955_++)
										{
											anInt933 = 0x7 & (anInt933 - -1);
										}
									}
								}
								if (this.aBool43)
								{
									anInt933 = 0x7 & (anInt933 + 7);
									this.aBool43 = false;
									if (!aBool53)
									{
										if ((0x1 & anInt933) == 0)
										{
											anInt933 = 0x7 & (anInt933 + 7);
										}
										for (int i_956_ = 0; ((i_956_ < 8) && !method541(anInt933, -127)); i_956_++)
										{
											anInt933 = (anInt933 + 7) & 0x7;
										}
									}
								}
							}
						}
						else if (!this.aBool41)
						{
							if (this.aBool43)
							{
								anInt843 = (anInt843 + -2) & 0xff;
							}
						}
						else
						{
							anInt843 = (anInt843 - -2) & 0xff;
						}
						if (!aBool53 || (550 >= anInt845))
						{
							if (!aBool53 && (anInt845 < 750))
							{
								anInt845 += 4;
							}
						}
						else
						{
							anInt845 -= 4;
						}
						if (anInt928 <= 0)
						{
							if (anInt928 < 0)
							{
								anInt928++;
							}
						}
						else
						{
							anInt928--;
						}
						aClass41_2.method270(1041214728, 17);
						anInt918++;
						if (5 < anInt918)
						{
							anInt880 = (anInt880 + 1) % 3;
							anInt868 = (anInt868 + 1) % 4;
							anInt936 = (anInt936 - -1) % 5;
							anInt918 = 0;
						}
						for (int i_957_ = 0; anInt1022 > i_957_; i_957_++)
						{
							final int i_958_ = anIntArray191[i_957_];
							final int i_959_ = anIntArray170[i_957_];
							if ((0 <= i_958_) && (0 <= i_959_) && (96 > i_958_) && (96 > i_959_)
							        && (anIntArray178[i_957_] == 74))
							{
								aClass23Array4[i_957_].method141(-26160, 0, 0, 1);
							}
						}
						for (int i_960_ = 0; anInt1012 > i_960_; i_960_++)
						{
							anIntArray208[i_960_]++;
							if (anIntArray208[i_960_] > 50)
							{
								anInt1012--;
								for (int i_961_ = i_960_; anInt1012 > i_961_; i_961_++)
								{
									anIntArray188[i_961_] = anIntArray188[i_961_ + 1];
									anIntArray204[i_961_] = anIntArray204[i_961_ + 1];
									anIntArray208[i_961_] = anIntArray208[i_961_ + 1];
									anIntArray214[i_961_] = anIntArray214[i_961_ + 1];
								}
							}
						}
					}
				}
			}
		}
	}

	private void method592(final int i, final int i_962_, final boolean bool, final int i_963_, final int i_964_)
	{
		anInt883++;
		aClass16_Sub1_1.method118(64, 77);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_963_);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_964_);
		aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_962_);
		aClass16_Sub1_1.method126(2);
	}

	private void method593(final byte i)
	{
		anInt844++;
		aClass46_Sub1_2.aBool28 = false;
		aBool77 = false;
		aClass46_Sub1_2.method331(-1964300920);
		if ((anInt1035 == 0) || (anInt1035 == 1) || (anInt1035 == 2) || (anInt1035 == 3))
		{
			final int i_965_ = (anInt930 * 2) % 3072;
			if (i_965_ >= 1024)
			{
				if (2048 > i_965_)
				{
					aClass46_Sub1_2.method338(anInt893 - -1, 10, 0, (byte) -70);
					if (i_965_ > 1792)
					{
						aClass46_Sub1_2.method320((byte) 124, 0, anInt935 + 10, 10, i_965_ - 1792);
					}
				}
				else
				{
					aClass46_Sub1_2.method338(anInt935 - -10, 10, 0, (byte) -70);
					if (2816 < i_965_)
					{
						aClass46_Sub1_2.method320((byte) 120, 0, anInt893, 10, i_965_ + -2816);
					}
				}
			}
			else
			{
				aClass46_Sub1_2.method338(anInt893, 10, 0, (byte) -70);
				if (768 < i_965_)
				{
					aClass46_Sub1_2.method320((byte) 110, 0, anInt893 + 1, 10, i_965_ + -768);
				}
			}
		}
		if (anInt1035 == 0)
		{
			aClass10_7.method71(-6);
		}
		if (anInt1035 == 2)
		{
			final String string = aClass10_5.method100(127, anInt1005);
			if ((string != null) && (string.length() > 0))
			{
				aClass46_Sub1_2.method327(0, 185, anInt853, 100, 85, 0, 30);
			}
			aClass10_5.method71(-6);
		}
		aClass46_Sub1_2.method338(anInt935 + 22, anInt879, 0, (byte) -70);
		aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -37);
	}

	private void method594(final int i, final boolean bool)
	{
		anInt790++;
		int i_966_ = aClass46_Sub1_2.anInt502 + -199;
		aClass46_Sub1_2.method338(anInt935 - -4, 3, i_966_ + -49, (byte) -70);
		int i_967_ = 36;
		final int i_968_ = 196;
		final int i_969_ = 182;
		int i_971_;
		int i_970_ = i_971_ = Class34.method227(false, 160, 160, 160);
		if (anInt1003 == 0)
		{
			i_970_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_971_ = Class34.method227(false, 220, 220, 220);
		}
		aClass46_Sub1_2.method327(i_966_, i_967_, i_968_ / i, 128, 82, i_970_, 24);
		aClass46_Sub1_2.method327((i_968_ / 2) + i_966_, i_967_, i_968_ / 2, 128, 113, i_971_, 24);
		aClass46_Sub1_2.method327(i_966_, i_967_ + 24, i_968_, 128, 125, Class34.method227(false, 220, 220, 220), 90);
		aClass46_Sub1_2.method327(i_966_, (i_967_ - -24) + 90, i_968_, 128, 108,
		        Class34.method227(false, 160, 160, 160), (i_969_ - 90) + -24);
		aClass46_Sub1_2.method341(i_968_, (byte) -30, i_967_ + 24, i_966_, 0);
		aClass46_Sub1_2.method319(0, 24, i_967_ - 0, true, (i_968_ / 2) + i_966_);
		aClass46_Sub1_2.method341(i_968_, (byte) -82, i_967_ + 113, i_966_, 0);
		aClass46_Sub1_2.method335(0, 255, 4, "Magic", i_967_ + 16, i_966_ - -(i_968_ / 4));
		aClass46_Sub1_2.method335(0, 255, 4, "Prayers", i_967_ - -16, (i_968_ / 2) + i_966_ + (i_968_ / 4));
		if (anInt1003 == 0)
		{
			aClass10_3.method75(0, anInt1043);
			int i_972_ = 0;
			for (int i_973_ = 0; i_973_ < Class43.anInt486; i_973_++)
			{
				String string = "@yel@";
				for (int i_974_ = 0; i_974_ < Class48.anIntArray138[i_973_]; i_974_++)
				{
					final int i_975_ = Class42.anIntArrayArray18[i_973_][i_974_];
					if (!method526(Class1.anIntArrayArray1[i_973_][i_974_], (byte) 109, i_975_))
					{
						string = "@whi@";
						break;
					}
				}
				final int i_976_ = anIntArray185[6];
				if (i_976_ < Class16_Sub1.anIntArray139[i_973_])
				{
					string = "@bla@";
				}
				aClass10_3.method68(null, anInt1043, null, 0, i_972_++, 0,
				        new StringBuilder().append(string).append("Level ").append(Class16_Sub1.anIntArray139[i_973_])
				                .append(": ").append(Class46_Sub1.aStringArray36[i_973_]).toString());
			}
			aClass10_3.method71(-6);
			final int i_977_ = aClass10_3.method92(false, anInt1043);
			if (i_977_ == -1)
			{
				aClass46_Sub1_2.method324("Point at a spell for a description", 0, 1, 0, i_966_ - -2, i_967_ + 124);
			}
			else
			{
				aClass46_Sub1_2.method324(
				        new StringBuilder().append("Level ").append(Class16_Sub1.anIntArray139[i_977_]).append(": ")
				                .append(Class46_Sub1.aStringArray36[i_977_]).toString(),
				        0, 1, 16776960, i_966_ + 2, i_967_ + 124);
				aClass46_Sub1_2.method324(Class13.aStringArray12[i_977_], 0, 0, 16777215, i_966_ + 2, i_967_ + 136);
				for (int i_978_ = 0; i_978_ < Class48.anIntArray138[i_977_]; i_978_++)
				{
					final int i_979_ = Class42.anIntArrayArray18[i_977_][i_978_];
					aClass46_Sub1_2.method338(anInt863 - -(AClass1_Sub1.anIntArray144[i_979_]), i_967_ + 150,
					        (i_966_ - -2) + (i_978_ * 44), (byte) -70);
					final int i_980_ = method584(i_979_, false);
					final int i_981_ = Class1.anIntArrayArray1[i_977_][i_978_];
					String string = "@red@";
					if (method526(i_981_, (byte) 109, i_979_))
					{
						string = "@gre@";
					}
					aClass46_Sub1_2.method324(
					        new StringBuilder().append(string).append(i_980_).append("/").append(i_981_).toString(), 0,
					        1, 16777215, i_966_ - (-2 - (i_978_ * 44)), i_967_ + 150);
				}
			}
		}
		if (anInt1003 == 1)
		{
			aClass10_3.method75(0, anInt1043);
			int i_982_ = 0;
			for (int i_983_ = 0; i_983_ < AClass1_Sub1.anInt639; i_983_++)
			{
				String string = "@whi@";
				if (anIntArray200[5] < AClass1_Sub1.anIntArray145[i_983_])
				{
					string = "@bla@";
				}
				if (aBoolArray11[i_983_])
				{
					string = "@gre@";
				}
				aClass10_3.method68(null, anInt1043, null, 0, i_982_++, i ^ 0x2,
				        new StringBuilder().append(string).append("Level ").append(AClass1_Sub1.anIntArray145[i_983_])
				                .append(": ").append(Class16_Sub1.aStringArray35[i_983_]).toString());
			}
			aClass10_3.method71(i + -8);
			final int i_984_ = aClass10_3.method92(false, anInt1043);
			if (i_984_ != -1)
			{
				aClass46_Sub1_2.method335(16776960, 255, 1,
				        new StringBuilder().append("Level ").append(AClass1_Sub1.anIntArray145[i_984_]).append(": ")
				                .append(Class16_Sub1.aStringArray35[i_984_]).toString(),
				        i_967_ + 130, (i_968_ / 2) + i_966_);
				aClass46_Sub1_2.method335(16777215, 255, 0, (RuntimeException_Sub1.aStringArray42[i_984_]),
				        i_967_ + 145, (i_968_ / 2) + i_966_);
				aClass46_Sub1_2.method335(0, 255, 1,
				        new StringBuilder().append("Drain rate: ").append(Class28.anIntArray82[i_984_]).toString(),
				        i_967_ + 160, (i_968_ / 2) + i_966_);
			}
			else
			{
				aClass46_Sub1_2.method324("Point at a prayer for a description", i + -2, 1, 0, i_966_ + 2,
				        i_967_ - -124);
			}
		}
		if (bool)
		{
			i_966_ = ((-aClass46_Sub1_2.anInt502 - -199) + this.anInt739);
			i_967_ = this.anInt736 + -36;
			if ((0 <= i_966_) && (0 <= i_967_) && (196 > i_966_) && (i_967_ < 182))
			{
				aClass10_3.method85(this.anInt737, i_967_ + 36, this.anInt738, (byte) -52,
				        (i_966_ - 199 - -(aClass46_Sub1_2.anInt502)));
				if ((i_967_ <= 24) && (anInt887 == 1))
				{
					if ((i_966_ < 98) && (anInt1003 == 1))
					{
						anInt1003 = 0;
						aClass10_3.method101(anInt1043, (byte) -104);
					}
					else if ((98 < i_966_) && (anInt1003 == 0))
					{
						anInt1003 = 1;
						aClass10_3.method101(anInt1043, (byte) -116);
					}
				}
				if ((anInt887 == 1) && (anInt1003 == 0))
				{
					final int i_985_ = aClass10_3.method92(false, anInt1043);
					if (i_985_ != -1)
					{
						final int i_986_ = anIntArray185[6];
						if (Class16_Sub1.anIntArray139[i_985_] <= i_986_)
						{
							int i_987_;
							for (i_987_ = 0; i_987_ < Class48.anIntArray138[i_985_]; i_987_++)
							{
								final int i_988_ = (Class42.anIntArrayArray18[i_985_][i_987_]);
								if (!method526((Class1.anIntArrayArray1[i_985_][i_987_]), (byte) 109, i_988_))
								{
									method513(0, "You don't have all the reagents you need for this spell", 0, null, -9,
									        null, null, false);
									i_987_ = -1;
									break;
								}
							}
							if (Class48.anIntArray138[i_985_] == i_987_)
							{
								anInt940 = i_985_;
								anInt989 = -1;
							}
						}
						else
						{
							method513(0, "Your magic ability is not high enough for this spell", 0, null, i ^ ~0x7e,
							        null, null, false);
						}
					}
				}
				if ((anInt887 == 1) && (anInt1003 == 1))
				{
					final int i_989_ = aClass10_3.method92(false, anInt1043);
					if (i_989_ != -1)
					{
						final int i_990_ = anIntArray200[5];
						if (AClass1_Sub1.anIntArray145[i_989_] <= i_990_)
						{
							if (anIntArray185[5] != 0)
							{
								if (!aBoolArray11[i_989_])
								{
									aClass16_Sub1_1.method118(60, 62);
									aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_989_);
									aClass16_Sub1_1.method126(2);
									aBoolArray11[i_989_] = true;
									method564((byte) -56, "prayeron");
								}
								else
								{
									aClass16_Sub1_1.method118(254, 96);
									aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, i_989_);
									aClass16_Sub1_1.method126(i + 0);
									aBoolArray11[i_989_] = false;
									method564((byte) -75, "prayeroff");
								}
							}
							else
							{
								method513(0, "You have run out of prayer points. Return to a church to recharge", 0,
								        null, i + -44, null, null, false);
							}
						}
						else
						{
							method513(0, "Your prayer ability is not high enough for this prayer", 0, null, -63, null,
							        null, false);
						}
					}
				}
				anInt887 = 0;
			}
		}
	}

	@Override
	void method467(final int i)
	{
		anInt812++;
		if (aBool51)
		{
			final String string = getDocumentBase().getHost().toLowerCase();
			if (!string.equals("runescape.com") && !string.endsWith(".runescape.com"))
			{
				aBool50 = true;
				return;
			}
		}
		method599(i + -10805);
		if (!method469(false))
		{
			aBool52 = true;
		}
		else
		{
			Class27_Sub1.method391(i + 1993319904, Class34.aClass44_1);
			if (i != -6464)
			{
				anInt1037 = 76;
			}
			try
			{
				if (Frame_Sub1.aClass32_4.aClass28_1 != null)
				{
					Class27_Sub1_Sub1.aClass39_5 = new Class39((Frame_Sub1.aClass32_4.aClass28_1), 24, 0);
					Frame_Sub1.aClass32_4.aClass28_1 = null;
				}
			}
			catch (final IOException ioexception)
			{
				Class27_Sub1_Sub1.aClass39_5 = null;
			}
			int i_991_ = 0;
			for (int i_992_ = 0; 99 > i_992_; i_992_++)
			{
				final int i_993_ = i_992_ - -1;
				final int i_994_ = (int) ((Math.pow(2.0, i_993_ / 7.0) * 300.0) + i_993_);
				i_991_ += i_994_;
				anIntArray161[i_992_] = Class52.method378(i_991_, 268435452);
			}
			try
			{
				final String string = getParameter("referid");
				anInt1018 = Integer.parseInt(string);
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			try
			{
				final String string = getParameter("servertype");
				final int i_995_ = Integer.parseInt(string);
				if ((0x2 & i_995_) != 0)
				{
					aBool56 = true;
				}
				if ((0x1 & i_995_) != 0)
				{
					aBool55 = true;
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			if (Class34.aClass38_5 == Class22.aClass38_3)
			{
				aString28 = getCodeBase().getHost();
				anInt786 = 443;
				anInt799 = 43594;
			}
			else if (Class46.method342(Class34.aClass38_5, 20903))
			{
				aString28 = getCodeBase().getHost();
				anInt786 = Class27_Sub1_Sub1.anInt664 + 50000;
				anInt799 = 40000 - -Class27_Sub1_Sub1.anInt664;
			}
			else if (Class34.aClass38_5 == Class16_Sub1.aClass38_7)
			{
				anInt799 = Class27_Sub1_Sub1.anInt664 + 40000;
				anInt786 = 50000 - -Class27_Sub1_Sub1.anInt664;
				aString28 = "local.runescape.com";
			}
			Class35.anInt377 = 1000;
			method553((byte) 74);
			if (!aBool52)
			{
				anInt935 = 2000;
				anInt873 = anInt935 + 100;
				anInt863 = anInt873 + 50;
				anInt893 = anInt863 - -1000;
				anInt903 = anInt893 - -10;
				anInt925 = anInt903 - -50;
				anInt931 = anInt925 - -10;
				anInt910 = anInt931 + 5;
				aGraphics2 = getGraphics();
				method474(123, 50);
				aClass46_Sub1_2 = new Class46_Sub1(anInt853, anInt879 + 12, 4000, this);
				aClass46_Sub1_2.aclient1 = this;
				aClass46_Sub1_2.method357(0, anInt879 + 12, 0, anInt853, 1743849672);
				aClass29_1 = new Class29(aClass46_Sub1_2, 1, "Choose option");
				aClass29_2 = new Class29(aClass46_Sub1_2, 1);
				aClass29_3 = new Class29(aClass46_Sub1_2, 1);
				Class24.aBool16 = false;
				Class33.anInt368 = anInt873;
				aClass10_3 = new Class10(aClass46_Sub1_2, 5);
				final int i_996_ = aClass46_Sub1_2.anInt502 - 199;
				final int i_997_ = 36;
				anInt1043 = aClass10_3.method80((byte) 106, i_997_ + 24, 500, i_996_, true, 90, 1, 196);
				aClass10_4 = new Class10(aClass46_Sub1_2, 5);
				anInt951 = aClass10_4.method80((byte) -58, i_997_ + 40, 500, i_996_, true, 126, 1, 196);
				aClass10_6 = new Class10(aClass46_Sub1_2, 5);
				anInt1064 = aClass10_6.method80((byte) 127, i_997_ + 24, 500, i_996_, true, 251, 1, 196);
				method571((byte) 40);
				if (!aBool52)
				{
					method551(77);
					if (!aBool52)
					{
						aClass41_2 = new Class41(aClass46_Sub1_2, 15000, 15000, 1000);
						aClass41_2.method278(anInt853 / 2, 256, anInt879 / 2, anInt879 / 2, anInt860, anInt853 / 2,
						        anInt853);
						aClass41_2.anInt465 = 1;
						aClass41_2.anInt437 = 2400;
						aClass41_2.anInt426 = 2300;
						aClass41_2.anInt464 = 2400;
						aClass41_2.method274(-10, -50, -50, (byte) -70);
						aClass6_1 = new Class6(aClass41_2, aClass46_Sub1_2);
						aClass6_1.anInt16 = anInt935;
						method550((byte) 123);
						if (!aBool52)
						{
							method583((byte) -86);
							if (!aBool52)
							{
								method568(118);
								if (!aBool52)
								{
									if (aBool55)
									{
										method495(40);
									}
									if (!aBool52)
									{
										method482(100, 97, "Starting game...");
										method559(-23945);
										method537(true);
										method574((byte) 118);
										method507(78);
										method476(98);
										method531(3631);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void method595(final byte i)
	{
		if (i != -2)
		{
			method551(-18);
		}
		anInt761++;
		final int i_998_ = 7;
		final int i_999_ = 15;
		final int i_1000_ = 175;
		if (anInt887 != 0)
		{
			for (int i_1001_ = 0; 5 > i_1001_; i_1001_++)
			{
				if ((i_1001_ > 0) && (i_998_ < this.anInt739) && (this.anInt739 < (i_1000_ + i_998_))
				        && (this.anInt736 > (i_999_ + (i_1001_ * 20)))
				        && ((i_999_ + (i_1001_ * 20) + 20) > this.anInt736))
				{
					anInt887 = 0;
					anInt1054 = i_1001_ - 1;
					aClass16_Sub1_1.method118(29, i ^ ~0x7a);
					aClass16_Sub1_1.aClass27_Sub1_Sub1_1.method388(-31566, anInt1054);
					aClass16_Sub1_1.method126(2);
					break;
				}
			}
		}
		for (int i_1002_ = 0; 5 > i_1002_; i_1002_++)
		{
			if ((anInt1054 - -1) != i_1002_)
			{
				aClass46_Sub1_2.method327(i_998_, i_999_ + (i_1002_ * 20), i_1000_, 128, 87,
				        Class34.method227(false, 190, 190, 190), 20);
			}
			else
			{
				aClass46_Sub1_2.method327(i_998_, i_999_ + (i_1002_ * 20), i_1000_, 128, 101,
				        Class34.method227(false, 0, 255, 0), 20);
			}
			aClass46_Sub1_2.method341(i_1000_, (byte) -88, i_999_ - -(i_1002_ * 20), i_998_, 0);
			aClass46_Sub1_2.method341(i_1000_, (byte) -38, i_999_ - (-(i_1002_ * 20) - 20), i_998_, 0);
		}
		aClass46_Sub1_2.method335(16777215, 255, 3, "Select combat style", i_999_ + 16, i_998_ - -(i_1000_ / 2));
		aClass46_Sub1_2.method335(0, i + 257, 3, "Controlled (+1 of each)", i_999_ + 36, (i_1000_ / 2) + i_998_);
		aClass46_Sub1_2.method335(0, 255, 3, "Aggressive (+3 strength)", i_999_ + 56, i_998_ - -(i_1000_ / 2));
		aClass46_Sub1_2.method335(0, i + 257, 3, "Accurate   (+3 attack)", i_999_ + 76, (i_1000_ / 2) + i_998_);
		aClass46_Sub1_2.method335(0, 255, 3, "Defensive  (+3 defense)", i_999_ + 96, (i_1000_ / 2) + i_998_);
	}

	private void method596(final int i)
	{
		anInt829++;
		if ((anInt939 == 0) && ((aClass46_Sub1_2.anInt502 + -35) <= this.anInt739) && (3 <= this.anInt736)
		        && ((aClass46_Sub1_2.anInt502 - 3) > this.anInt739) && (35 > this.anInt736))
		{
			anInt939 = 1;
		}
		if ((anInt939 == 0) && (this.anInt739 >= (aClass46_Sub1_2.anInt502 + -35 + -33)) && (this.anInt736 >= 3)
		        && (this.anInt739 < (aClass46_Sub1_2.anInt502 + -3 + -33)) && (35 > this.anInt736))
		{
			anInt1041 = -11 + (int) (23.0 * Math.random());
			anInt939 = 2;
			anInt964 = -6 + (int) (13.0 * Math.random());
		}
		if ((anInt939 == 0) && ((aClass46_Sub1_2.anInt502 + -101) <= this.anInt739) && (3 <= this.anInt736)
		        && (((aClass46_Sub1_2.anInt502 - 3) + -66) > this.anInt739) && (35 > this.anInt736))
		{
			anInt939 = 3;
		}
		if ((anInt939 == 0) && ((aClass46_Sub1_2.anInt502 - 35 - 99) <= this.anInt739) && (this.anInt736 >= 3)
		        && ((aClass46_Sub1_2.anInt502 + -102) > this.anInt739) && (35 > this.anInt736))
		{
			anInt939 = 4;
		}
		if ((anInt939 == 0) && (this.anInt739 >= (aClass46_Sub1_2.anInt502 + -132 + -35)) && (this.anInt736 >= 3)
		        && ((aClass46_Sub1_2.anInt502 + -135) > this.anInt739) && (this.anInt736 < 35))
		{
			anInt939 = 5;
		}
		if ((anInt939 == 0) && (this.anInt739 >= (aClass46_Sub1_2.anInt502 + -200)) && (3 <= this.anInt736)
		        && (this.anInt739 < (aClass46_Sub1_2.anInt502 - 168)) && (this.anInt736 < 35))
		{
			anInt939 = 6;
		}
		if ((anInt939 != 0) && (this.anInt739 >= (aClass46_Sub1_2.anInt502 - 35)) && (this.anInt736 >= 3)
		        && ((aClass46_Sub1_2.anInt502 + -3) > this.anInt739) && (this.anInt736 < 26))
		{
			anInt939 = 1;
		}
		if ((anInt939 != 0) && (anInt939 != 2) && (this.anInt739 >= ((aClass46_Sub1_2.anInt502 + -35) - 33))
		        && (this.anInt736 >= 3) && (this.anInt739 < ((aClass46_Sub1_2.anInt502 + -3) - 33))
		        && (26 > this.anInt736))
		{
			anInt939 = 2;
			anInt964 = -6 + (int) (13.0 * Math.random());
			anInt1041 = (int) (Math.random() * 23.0) - 11;
		}
		if ((anInt939 != 0) && (this.anInt739 >= (aClass46_Sub1_2.anInt502 + -66 + -35)) && (3 <= this.anInt736)
		        && (this.anInt739 < (aClass46_Sub1_2.anInt502 + -69)) && (this.anInt736 < 26))
		{
			anInt939 = 3;
		}
		if ((anInt939 != 0) && (((aClass46_Sub1_2.anInt502 - 99) + -35) <= this.anInt739) && (3 <= this.anInt736)
		        && (this.anInt739 < (aClass46_Sub1_2.anInt502 + -3 + -99)) && (26 > this.anInt736))
		{
			anInt939 = 4;
		}
		if ((anInt939 != 0) && (this.anInt739 >= ((aClass46_Sub1_2.anInt502 + -132) - 35)) && (3 <= this.anInt736)
		        && (((aClass46_Sub1_2.anInt502 - 3) + -132) > this.anInt739) && (this.anInt736 < 26))
		{
			anInt939 = 5;
		}
		if ((anInt939 != 0) && ((aClass46_Sub1_2.anInt502 + -165 + -35) <= this.anInt739) && (3 <= this.anInt736)
		        && (((aClass46_Sub1_2.anInt502 - 165) + -3) > this.anInt739) && (this.anInt736 < 26))
		{
			anInt939 = 6;
		}
		if ((anInt939 == 1) && (((aClass46_Sub1_2.anInt502 + -248) > this.anInt739)
		        || ((((anInt973 / 5) * 34) + 36) < this.anInt736)))
		{
			anInt939 = 0;
		}
		if ((anInt939 == 3) && (((aClass46_Sub1_2.anInt502 + -199) > this.anInt739) || (316 < this.anInt736)))
		{
			anInt939 = 0;
		}
		if (((anInt939 == 2) || (anInt939 == 4) || (anInt939 == 5))
		        && (((aClass46_Sub1_2.anInt502 + -199) > this.anInt739) || (240 < this.anInt736)))
		{
			anInt939 = 0;
		}
		if ((anInt939 == 6) && (((aClass46_Sub1_2.anInt502 + -199) > this.anInt739) || (311 < this.anInt736)))
		{
			anInt939 = 0;
		}
	}

	private Class15 method597(final int i, final int i_1003_)
	{
		if (i != -65281)
		{
			anInt899 = -107;
		}
		anInt820++;
		for (int i_1004_ = 0; anInt932 > i_1004_; i_1004_++)
		{
			if (i_1003_ == aClass15Array3[i_1004_].anInt150)
			{
				return aClass15Array3[i_1004_];
			}
		}
		return null;
	}

	private void method598(final byte i)
	{
		anInt800++;
		aClass46_Sub1_2.aBool28 = false;
		aClass46_Sub1_2.method331(-1964300920);
		aClass10_1.method71(-6);
		int i_1005_ = 140;
		i_1005_ += 116;
		if (i != 25)
		{
			anIntArray177 = null;
		}
		int i_1006_ = 50;
		i_1006_ -= 25;
		aClass46_Sub1_2.method347((byte) -118, i_1006_, i_1005_ + -87, 102, 64, Class24.anIntArray78[anInt948],
		        anIntArray165[anInt965]);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], -128, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt962], anIntArray165[anInt1057], i_1005_ + -32 + -55);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], -68, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt1047], anIntArray211[anInt999], (i_1005_ - 32) + -55);
		aClass46_Sub1_2.method347((byte) -20, i_1006_, i_1005_ - 32, 102, 64, Class24.anIntArray78[anInt948] + 6,
		        anIntArray165[anInt965]);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], -119, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt962] + 6, anIntArray165[anInt1057], i_1005_ + -32);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], -72, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt1047] + 6, anIntArray211[anInt999], i_1005_ + -32);
		aClass46_Sub1_2.method347((byte) -19, i_1006_, i_1005_ + 23, 102, 64, Class24.anIntArray78[anInt948] + 12,
		        anIntArray165[anInt965]);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], i ^ ~0x53, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt962] + 12, anIntArray165[anInt1057], (i_1005_ - -55) + -32);
		aClass46_Sub1_2.method348(false, anIntArray197[anInt961], -89, 102, i_1006_, 64, 0,
		        Class24.anIntArray78[anInt1047] - -12, anIntArray211[anInt999], i_1005_ + 23);
		aClass46_Sub1_2.method338(anInt935 + 22, anInt879, 0, (byte) -70);
		aClass46_Sub1_2.method363(aGraphics2, this.anInt720, this.anInt694, -71);
	}

	private void method599(final int i)
	{
		anInt813++;
		Container container;
		if (!aBool51)
		{
			container = Class38.aFrame_Sub1_1;
		}
		else if (Class27.anApplet1 == null)
		{
			container = this;
		}
		else
		{
			container = Class27.anApplet1;
		}
		if (i == -17269)
		{
			anInt941 = container.getSize().width;
			anInt1023 = container.getSize().height;
			this.anInt694 = 0;
			this.anInt720 = (anInt941 + -anInt853) / 2;
			method490(true);
		}
	}

	public Client()
	{
		aClass15Array1 = new Class15[500];
		anInt887 = 0;
		anInt856 = 128;
		anInt885 = 0;
		aBool52 = false;
		anInt855 = 40;
		anInt864 = 2;
		anInt880 = 0;
		anInt868 = 0;
		anInt879 = 334;
		anInt882 = 0;
		anInt849 = -1;
		anInt901 = -1;
		anIntArray156 = new int[8192];
		anInt859 = 0;
		aBool51 = true;
		aBool54 = false;
		anInt894 = 0;
		anInt854 = 0;
		aLongArray4 = new long[100];
		anInt843 = 128;
		aClass15Array2 = new Class15[4000];
		anIntArray154 = new int[8192];
		anInt860 = 9;
		aClass15Array3 = new Class15[500];
		anInt890 = 0;
		anInt915 = 0;
		aBool55 = false;
		anInt852 = 0;
		anInt896 = 0;
		aBool50 = false;
		anInt905 = 0;
		anInt916 = 0;
		anIntArray155 = new int[8000];
		anInt908 = 0;
		anInt923 = 0;
		anInt912 = -1;
		anInt888 = 0;
		anInt902 = 0;
		anInt906 = 0;
		anInt886 = 2;
		anInt858 = 0;
		anInt928 = 0;
		anInt911 = 0;
		anInt932 = 0;
		anInt907 = 0;
		anInt899 = 0;
		anInt845 = 550;
		anInt904 = 0;
		anInt934 = 0;
		anInt918 = 0;
		anInt850 = 0;
		aBool56 = false;
		anInt933 = 1;
		anIntArray157 = new int[8000];
		anInt930 = 0;
		anInt937 = 0;
		anInt866 = -1;
		anInt914 = -1;
		anInt936 = 0;
		aClass15_1 = new Class15();
		anInt939 = 0;
		anIntArray158 = new int[50];
		anIntArray165 = new int[] { 16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528,
		        14680288, 3158064, 6307840, 8409088, 16777215 };
		anIntArray166 = new int[35];
		anIntArray159 = new int[14];
		anIntArray168 = new int[] { 0, 0, 0, 0, 0, 1, 2, 1 };
		anInt949 = 0;
		anIntArray162 = new int[] { 0, 1, 2, 1, 0, 0, 0, 0 };
		aStringArray47 = new String[50];
		anInt959 = 0;
		anInt971 = 0;
		anIntArray176 = new int[500];
		aClass15Array4 = new Class15[500];
		anIntArray175 = new int[5000];
		aBool66 = false;
		aClass23Array4 = new Class23[1500];
		anInt957 = 0;
		anIntArray169 = new int[50];
		anInt972 = -1;
		anInt976 = 0;
		aBool60 = false;
		anInt960 = 0;
		anIntArray163 = new int[500];
		anInt982 = 0;
		anInt964 = 0;
		anInt955 = 0;
		aBool67 = false;
		aBool64 = false;
		aBool59 = false;
		anInt986 = 0;
		aBool58 = false;
		aStringArray45 = new String[5];
		anIntArray187 = new int[50];
		aBool71 = false;
		anIntArray160 = new int[14];
		aClass15Array5 = new Class15[500];
		anIntArray180 = new int[14];
		anIntArray183 = new int[8];
		anInt952 = 0;
		aStringArray46 = (new String[] { "Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest",
		        "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure",
		        "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword",
		        "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)", "Lost city (members)",
		        "Hero's quest (members)", "Druidic ritual (members)", "Merlin's crystal (members)",
		        "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)",
		        "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)",
		        "Clock tower (members)", "The Holy Grail (members)", "Fight Arena (members)",
		        "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)",
		        "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)",
		        "Jungle potion (members)", "Grand tree (members)", "Shilo village (members)",
		        "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)",
		        "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)",
		        "Gertrude's Cat (members)", "Legend's Quest (members)" });
		anInt997 = -1;
		anInt948 = 2;
		aStringArray48 = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking",
		        "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw",
		        "Agility", "Thieving" };
		anIntArray178 = new int[1500];
		anInt978 = 0;
		aBool70 = false;
		anIntArray174 = new int[256];
		aBool79 = false;
		aBoolArray14 = new boolean[500];
		anIntArray190 = new int[500];
		anInt967 = 0;
		aBoolArray12 = new boolean[50];
		anInt1000 = 0;
		anIntArray167 = new int[500];
		anInt984 = 0;
		aBool75 = false;
		anIntArray182 = new int[8];
		aBoolArray13 = new boolean[1500];
		aString33 = "";
		anIntArray191 = new int[1500];
		anInt963 = 0;
		anInt1016 = -1;
		aBool68 = false;
		aString32 = "";
		aClass23Array5 = new Class23[500];
		anInt961 = 0;
		aBool57 = false;
		anInt985 = 0;
		aString30 = "";
		anInt1012 = 0;
		anIntArray170 = new int[1500];
		aBool77 = false;
		anIntArray192 = new int[5000];
		anIntArray199 = new int[5000];
		aString34 = "";
		anIntArray193 = new int[8];
		aClass15Array6 = new Class15[5000];
		anIntArray173 = new int[50];
		anIntArray188 = new int[50];
		aStringArray50 = new String[] { "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer" };
		aStringArray49 = null;
		anIntArray197 = new int[] { 15523536, 13415270, 11766848, 10056486, 9461792 };
		anIntArray203 = new int[50];
		aBool69 = false;
		anInt973 = 30;
		anInt989 = -1;
		anInt975 = 0;
		anInt1013 = 0;
		anIntArray204 = new int[50];
		aBool82 = false;
		aBool62 = true;
		anInt1027 = 0;
		anInt999 = 2;
		anIntArray200 = new int[18];
		anInt1003 = 0;
		anInt1028 = 1;
		anInt950 = 0;
		anInt1007 = 0;
		anInt1009 = 0;
		anInt965 = 14;
		anInt946 = 0;
		anInt953 = 0;
		anInt993 = 0;
		anInt1018 = 0;
		anIntArray179 = new int[256];
		anIntArray189 = new int[18];
		anIntArray201 = new int[5000];
		aBool65 = false;
		anInt970 = 0;
		anIntArrayArray21 = new int[][] { { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 },
		        { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 }, { 11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4 },
		        { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 },
		        { 4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3 },
		        { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3 } };
		aBool74 = false;
		aBool73 = true;
		anIntArray161 = new int[99];
		aBool86 = true;
		anIntArray198 = new int[8];
		anInt983 = -1;
		anIntArray181 = new int[14];
		aString35 = null;
		anIntArray164 = new int[14];
		anIntArray171 = new int[1500];
		anInt1041 = 0;
		anInt1022 = 0;
		anInt1021 = 0;
		aBool81 = false;
		anIntArray208 = new int[50];
		anInt1010 = -1;
		anIntArray213 = new int[50];
		aBool87 = false;
		anInt1031 = -2;
		anInt998 = 0;
		anIntArray202 = new int[50];
		anInt1045 = 0;
		anInt977 = 0;
		anIntArray211 = new int[] { 16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280,
		        65535 };
		anInt1017 = 48;
		aBool72 = false;
		anInt1006 = -2;
		anInt943 = 0;
		anIntArray206 = new int[8];
		anInt1035 = 0;
		anIntArray196 = new int[] { 0, 1, 2, 1 };
		anIntArray195 = new int[50];
		aBool63 = false;
		anInt1042 = 0;
		anInt938 = 0;
		aBool83 = false;
		anInt1038 = 0;
		anIntArray209 = new int[14];
		aBool85 = false;
		anIntArray215 = new int[8];
		anIntArray185 = new int[18];
		aClass23Array6 = new Class23[1000];
		anIntArray194 = new int[35];
		anIntArray172 = new int[14];
		anIntArray210 = new int[256];
		aBool88 = false;
		aBool89 = false;
		aByteArray28 = null;
		anInt981 = 0;
		anInt1054 = 0;
		anInt1036 = 0;
		anInt1047 = 0;
		aBool90 = false;
		anInt1053 = 0;
		anInt1057 = 8;
		aBool78 = false;
		aBool91 = false;
		anIntArray186 = new int[5];
		aString38 = "";
		anInt1026 = 0;
		anInt992 = 0;
		aString39 = "";
		anInt1056 = 0;
		anInt1049 = 0;
		anInt940 = -1;
		anInt1051 = 0;
		anIntArray205 = new int[35];
		aString40 = "";
		aBool76 = false;
		anInt1048 = 0;
		anIntArray218 = new int[50];
		anIntArray177 = new int[256];
		anInt988 = 0;
		anIntArray214 = new int[50];
		aBool84 = false;
		anIntArray207 = new int[256];
		aBool61 = false;
		anInt1055 = 0;
		anInt1050 = 0;
		aBool80 = false;
		anInt1060 = 0;
		aString36 = null;
		anIntArray217 = new int[50];
		anIntArray220 = new int[14];
		anIntArray219 = new int[256];
		anIntArray184 = new int[256];
		anInt979 = 0;
		aBoolArray11 = new boolean[50];
		aBool92 = false;
		anInt1024 = 0;
		anInt1059 = 0;
		anInt1061 = 0;
		aStringArray51 = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking",
		        "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility",
		        "Thieving" };
		anInt994 = 0;
		aBool93 = false;
		anInt962 = 1;
		anIntArray212 = new int[8];
		anInt1062 = 0;
		anIntArray221 = new int[8];
		anInt1039 = 0;
		anIntArray216 = new int[50];
	}
}
