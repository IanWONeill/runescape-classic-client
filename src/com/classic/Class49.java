package com.classic;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class49
{
	private static Hashtable<String, File> aHashtable1;
	private static String aString19;
	private static boolean aBool29 = false;
	private static int anInt580;
	private static String aString20;

	public static File method371(final int i, final String string)
	{
		if (i != -2)
		{
			method371(84, null);
		}
		return method373(string, i + 0, anInt580, aString19);
	}

	public static void method372(final boolean bool, final int i, final String string)
	{
		anInt580 = i;
		aString19 = string;
		try
		{
			aString20 = System.getProperty("user.home");
			if (aString20 != null)
			{
				aString20 = new StringBuilder().append(aString20).append("/").toString();
			}
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		aBool29 = bool;
		if (aString20 == null)
		{
			aString20 = "~/";
		}
	}

	private Class49() throws Throwable
	{
		throw new Error();
	}

	public static File method373(final String string, final int i, final int i_0_, final String string_1_)
	{
		if (!aBool29)
		{
			throw new RuntimeException("");
		}
		final File file = aHashtable1.get(string);
		if (file != null)
		{
			return file;
		}
		final String[] strings = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString20, "/tmp/",
		        "" };
		final String[] strings_2_ = { new StringBuilder().append(".jagex_cache_").append(i_0_).toString(),
		        new StringBuilder().append(".file_store_").append(i_0_).toString() };
		if (i != -2)
		{
			method373(null, -122, 17, null);
		}
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
		{
			for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++)
			{
				for (int i_5_ = 0; i_5_ < strings.length; i_5_++)
				{
					final String string_6_ = new StringBuilder().append(strings[i_5_]).append(strings_2_[i_4_])
					        .append("/")
					        .append(string_1_ != null ? new StringBuilder().append(string_1_).append("/").toString()
					                : "")
					        .append(string).toString();
					RandomAccessFile randomaccessfile = null;
					File file_7_;
					try
					{
						final File file_8_ = new File(string_6_);
						if ((i_3_ == 0) && !file_8_.exists())
						{
							continue;
						}
						final String string_9_ = strings[i_5_];
						if ((i_3_ == 1) && (0 < string_9_.length()) && !new File(string_9_).exists())
						{
							continue;
						}
						new File(new StringBuilder().append(strings[i_5_]).append(strings_2_[i_4_]).toString()).mkdir();
						if (string_1_ != null)
						{
							new File(new StringBuilder().append(strings[i_5_]).append(strings_2_[i_4_]).append("/")
							        .append(string_1_).toString()).mkdir();
						}
						randomaccessfile = new RandomAccessFile(file_8_, "rw");
						final int i_10_ = randomaccessfile.read();
						randomaccessfile.seek(0L);
						randomaccessfile.write(i_10_);
						randomaccessfile.seek(0L);
						randomaccessfile.close();
						aHashtable1.put(string, file_8_);
						file_7_ = file_8_;
					}
					catch (final Exception exception)
					{
						try
						{
							if (randomaccessfile != null)
							{
								randomaccessfile.close();
							}
							continue;
						}
						catch (final Exception exception_11_)
						{
							continue;
						}
					}
					return file_7_;
				}
			}
		}
		throw new RuntimeException();
	}

	static
	{
		aHashtable1 = new Hashtable<String, File>(16);
	}
}
