package com.classic;

final class Class13
{
	static String[] aStringArray12;
	static int anInt141;
	static String[] aStringArray13 = new String[100];
	static int anInt142;

	static synchronized byte[] method109(final int i, final int i_0_)
	{
		anInt141++;
		if ((i_0_ == 100) && (Class6.anInt47 > 0))
		{
			final byte[] is = StreamClass.aByteArrayArray15[--Class6.anInt47];
			StreamClass.aByteArrayArray15[Class6.anInt47] = null;
			return is;
		}
		if (i != 23310)
		{
			method109(53, 27);
		}
		if ((i_0_ == 5000) && (0 < Class38.anInt398))
		{
			final byte[] is = Class17.aByteArrayArray9[--Class38.anInt398];
			Class17.aByteArrayArray9[Class38.anInt398] = null;
			return is;
		}
		if ((i_0_ == 30000) && (0 < Class4.anInt15))
		{
			final byte[] is = Class52.aByteArrayArray14[--Class4.anInt15];
			Class52.aByteArrayArray14[Class4.anInt15] = null;
			return is;
		}
		if (Class22.aByteArrayArrayArray1 != null)
		{
			for (int i_1_ = 0; i_1_ < Class4.anIntArray6.length; i_1_++)
			{
				if ((Class4.anIntArray6[i_1_] == i_0_) && (Class42.anIntArray110[i_1_] > 0))
				{
					final byte[] is = (Class22.aByteArrayArrayArray1[i_1_][--Class42.anIntArray110[i_1_]]);
					Class22.aByteArrayArrayArray1[i_1_][(Class42.anIntArray110[i_1_])] = null;
					return is;
				}
			}
		}
		return new byte[i_0_];
	}

	static String method110(final String string, final String string_2_, final int i, final int i_3_)
	{
		anInt142++;
		final int i_4_ = i;
		while_20_: do
		{
			while_19_: do
			{
				while_18_: do
				{
					while_17_: do
					{
						while_16_: do
						{
							while_15_: do
							{
								do
								{
									if (i_4_ != 0)
									{
										if (i_4_ != 1)
										{
											if (i_4_ != 2)
											{
												if (i_4_ != 3)
												{
													if (i_4_ != 4)
													{
														if (i_4_ != 5)
														{
															if (i_4_ != 6)
															{
																if (i_4_ != 7)
																{
																	break while_20_;
																}
															}
															else
															{
																break while_18_;
															}
															break while_19_;
														}
													}
													else
													{
														break while_16_;
													}
													break while_17_;
												}
											}
											else
											{
												break;
											}
											break while_15_;
										}
									}
									else
									{
										if ((string_2_ != null) && (0 != string_2_.length()))
										{
											return new StringBuilder().append(string_2_).append(": ").append(string)
											        .toString();
										}
										return string;
									}
									if ((string_2_ == null) || (0 == string_2_.length()))
									{
										return string;
									}
									return new StringBuilder().append(string_2_).append(" tells you: ").append(string)
									        .toString();
								}
								while (false);
								if ((string_2_ == null) || (string_2_.length() == 0))
								{
									return string;
								}
								return new StringBuilder().append("You tell ").append(string_2_).append(": ")
								        .append(string).toString();
							}
							while (false);
							if ((string_2_ == null) || (0 == string_2_.length()))
							{
								return string;
							}
							return new StringBuilder().append(string_2_).append(": ").append(string).toString();
						}
						while (false);
						if ((string_2_ == null) || (string_2_.length() == 0))
						{
							return string;
						}
						return new StringBuilder().append(string_2_).append(": ").append(string).toString();
					}
					while (false);
					return string;
				}
				while (false);
				return new StringBuilder().append(string_2_).append(" wishes to trade with you.").toString();
			}
			while (false);
			if ((string_2_ == null) || (0 == string_2_.length()))
			{
				return string;
			}
			return new StringBuilder().append(string_2_).append(": ").append(string).toString();
		}
		while (false);
		if (i_3_ != -6187)
		{
			aStringArray12 = null;
		}
		return "";
	}
}
