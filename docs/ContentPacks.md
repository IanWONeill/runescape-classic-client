#### contentcrcs

File offset | Description
----------- | --------------
| 0 | CRC32 of content pack #0
| 4 | CRC32 of content pack #1
| 8 | CRC32 of content pack #2
| 12 | CRC32 of content pack #3
| 16 | CRC32 of content pack #4
| 20 | CRC32 of content pack #5
| 24 | CRC32 of content pack #6
| 28 | CRC32 of content pack #7
| 32 | CRC32 of content pack #8
| 36 | CRC32 of content pack #9
| 40 | CRC32 of content pack #10
| 44 | CRC32 of content pack #11
| 48 | CRC32 of previous 48-bytes
| 52 | Unknown 6-bytes (all zeroes)

Content pack files have the following structure.

File offset | Description
----------- | --------------
| 0 | Decompressed size of Data
| 3 | Compressed size of Data
| 6 | Data

The decompressed size and compressed size may be the same to indicate that no compression is used.

The Data contained within a content pack file is a [Jagex Archive](./JagexArchive.md), and each file within the archive is optionally compressed.

#### content0_229aa476 - "Configuration"

The [Jagex Archive](./JagexArchive.md) contains two uncompressed files.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
0 | 825f205e (string.dat) | 22 | 174875
1 | 87be8881 (integer.dat) | 174897 | 62392

Both files are read from when loading entity definitions and is done so in a very specific order. See EntityHandler#load.

As the names suggest, strings are read from string.dat and integers are read from integer.dat.
The string.dat file contains contiguous null-terminated strings.

#### content1_1c9fa8c3 - "people and monsters"

#### content2_2fdddb3c - "member graphics"

#### content3_5181c9f5 - "Jagex library"

The [Jagex Archive](./JagexArchive.md) contains a single uncompressed [.tga](https://en.wikipedia.org/wiki/Truevision_TGA) file.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
0 | 97899353 (logo.tga) | 12 | 25192

#### content4_ffffffffaaca2b0d - "map"

#### content5_6a1d6b00 - "members map"

#### [content6_ffffffffe997514b](./content6_ffffffffe997514b.md) - "landscape"

The [Jagex Archive](./JagexArchive.md) contains landscape data in .hei files.

For a complete listing of all files in this archive, see [content6_ffffffffe997514b](./content6_ffffffffe997514b.md).

#### [content7_3fc5d9e3](./content7_3fc5d9e3.md) - "members landscape"

The [Jagex Archive](./JagexArchive.md) contains landscape data in .hei files.

For a complete listing of all files in this archive, see [content7_3fc5d9e3](./content7_3fc5d9e3.md).

#### content8_ffffffffb03e2a0c - "2d graphics"

#### [content9_ffffffffe0e19e2c](./content9_ffffffffe0e19e2c.md) - "3d models"

The [Jagex Archive](./JagexArchive.md) contains model data in [.ob3](./ob3.md) files.

There are a couple interesting things of note about this content pack.
- There are 25 unnamed/unused files in this archive.
- There is also one named file ("runiteruck1.ob3") that does not exist in the archive.

For a complete listing of all files in this archive, including those that are unused, see [content9_ffffffffe0e19e2c](./content9_ffffffffe0e19e2c.md).

#### [content10_ffffffffa95e7195](./content10_ffffffffa95e7195.md) - "Sound effects"

The [Jagex Archive](./JagexArchive.md) contains raw audio data in [.pcm](https://en.wikipedia.org/wiki/Pulse-code_modulation) files.

For a complete listing of all files in this archive, see [content10_ffffffffa95e7195](./content10_ffffffffa95e7195.md).

#### content11_7d5437c5 - "Textures"
