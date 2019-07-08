package com.classic;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.IndexColorModel;

final class Class33
{
	static int anInt368 = 0;
	static int[] anIntArray84;

	static Image method223(final Component component, final byte[] is, final byte i)
	{
		Class7.anInt60 = (is[15] * 256) + is[14];
		IOException_Sub1.anInt672 = (is[13] * 256) - -is[12];
		final byte[] is_0_ = new byte[256];
		final byte[] is_1_ = new byte[256];
		final byte[] is_2_ = new byte[256];
		for (int i_3_ = 0; i_3_ < 256; i_3_++)
		{
			is_0_[i_3_] = is[(i_3_ * 3) + 20];
			is_1_[i_3_] = is[(i_3_ * 3) + 19];
			is_2_[i_3_] = is[(i_3_ * 3) + 18];
		}
		Camera.aColorModel1 = new IndexColorModel(8, 256, is_0_, is_1_, is_2_);
		if (i >= -110)
		{
			method223(null, null, (byte) 125);
		}
		final byte[] is_4_ = new byte[Class7.anInt60 * IOException_Sub1.anInt672];
		int i_5_ = 0;
		for (int i_6_ = Class7.anInt60 - 1; 0 <= i_6_; i_6_--)
		{
			for (int i_7_ = 0; i_7_ < IOException_Sub1.anInt672; i_7_++)
			{
				is_4_[i_5_++] = is[i_7_ + (i_6_ * IOException_Sub1.anInt672) + 786];
			}
		}
		final Image image = component.createImage(Class22.aClass36_1);
		Class2.method4(is_4_);
		component.prepareImage(image, Class22.aClass36_1);
		Class2.method4(is_4_);
		component.prepareImage(image, Class22.aClass36_1);
		Class2.method4(is_4_);
		component.prepareImage(image, Class22.aClass36_1);
		return image;
	}

	static int method224(final int i, final int i_8_, final CharSequence charsequence, final int i_10_, final byte[] is)
	{
		final int i_11_ = -i + i_10_;
		for (int i_12_ = 0; i_11_ > i_12_; i_12_++)
		{
			final char c = charsequence.charAt(i + i_12_);
			if ((('\0' < c) && ('\u0080' > c)) || ((c >= '\u00a0') && ('\u00ff' >= c)))
			{
				is[i_8_ - -i_12_] = (byte) c;
			}
			else if (c == '\u20ac')
			{
				is[i_12_ + i_8_] = (byte) -128;
			}
			else if (c == '\u201a')
			{
				is[i_12_ + i_8_] = (byte) -126;
			}
			else if (c != '\u0192')
			{
				if (c != '\u201e')
				{
					if (c == '\u2026')
					{
						is[i_8_ - -i_12_] = (byte) -123;
					}
					else if (c != '\u2020')
					{
						if (c == '\u2021')
						{
							is[i_8_ - -i_12_] = (byte) -121;
						}
						else if (c == '\u02c6')
						{
							is[i_12_ + i_8_] = (byte) -120;
						}
						else if (c != '\u2030')
						{
							if (c == '\u0160')
							{
								is[i_12_ + i_8_] = (byte) -118;
							}
							else if (c == '\u2039')
							{
								is[i_12_ + i_8_] = (byte) -117;
							}
							else if (c != '\u0152')
							{
								if (c == '\u017d')
								{
									is[i_12_ + i_8_] = (byte) -114;
								}
								else if (c != '\u2018')
								{
									if (c != '\u2019')
									{
										if (c != '\u201c')
										{
											if (c == '\u201d')
											{
												is[i_12_ + i_8_] = (byte) -108;
											}
											else if (c != '\u2022')
											{
												if (c != '\u2013')
												{
													if (c == '\u2014')
													{
														is[i_12_ + i_8_] = (byte) -105;
													}
													else if (c != '\u02dc')
													{
														if (c == '\u2122')
														{
															is[i_8_ - -i_12_] = (byte) -103;
														}
														else if (c != '\u0161')
														{
															if (c != '\u203a')
															{
																if (c == '\u0153')
																{
																	is[(i_12_ + i_8_)] = (byte) -100;
																}
																else if (c == '\u017e')
																{
																	is[(i_12_ + i_8_)] = (byte) -98;
																}
																else if (c == '\u0178')
																{
																	is[(i_12_ + i_8_)] = (byte) -97;
																}
																else
																{
																	is[(i_12_ + i_8_)] = (byte) 63;
																}
															}
															else
															{
																is[(i_12_ + i_8_)] = (byte) -101;
															}
														}
														else
														{
															is[i_12_ + i_8_] = (byte) -102;
														}
													}
													else
													{
														is[i_8_ - -i_12_] = (byte) -104;
													}
												}
												else
												{
													is[i_12_ + i_8_] = (byte) -106;
												}
											}
											else
											{
												is[i_12_ + i_8_] = (byte) -107;
											}
										}
										else
										{
											is[i_8_ - -i_12_] = (byte) -109;
										}
									}
									else
									{
										is[i_12_ + i_8_] = (byte) -110;
									}
								}
								else
								{
									is[i_12_ + i_8_] = (byte) -111;
								}
							}
							else
							{
								is[i_8_ - -i_12_] = (byte) -116;
							}
						}
						else
						{
							is[i_12_ + i_8_] = (byte) -119;
						}
					}
					else
					{
						is[i_12_ + i_8_] = (byte) -122;
					}
				}
				else
				{
					is[i_12_ + i_8_] = (byte) -124;
				}
			}
			else
			{
				is[i_8_ - -i_12_] = (byte) -125;
			}
		}
		return i_11_;
	}
}
