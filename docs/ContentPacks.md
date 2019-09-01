Note: Work in progress.

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

#### content0_229aa476 - "Configuration"

#### content1_1c9fa8c3 - "people and monsters"

#### content2_2fdddb3c - "member graphics"

#### content3_5181c9f5 - "Jagex library"

#### content4_ffffffffaaca2b0d - "map"

#### content5_6a1d6b00 - "members map"

#### content6_ffffffffe997514b - "landscape"

#### content7_3fc5d9e3 - "members landscape"

#### content8_ffffffffb03e2a0c - "2d graphics"

#### content9_ffffffffe0e19e2c - "3d models"

This file is a [JagexArchive.md](./JagexArchive.md) containing model data in .ob3 files.

Interestingly, there are 25 unnamed/unused files in this archive.
There is also one named file ("runiteruck1.ob3") that does not exist in the archive,
which is a duplicate (except for the modelName of course) of the "runiterock1" Objectdef.

name | description	| command1 | command2 | modelName | type | width | height | groundItemVar
---- | ------------ | -------- | -------- | --------- | ---- | ----- | ------ | -------------
Rock | A rocky outcrop | Mine | Prospect | runiterock1 | 1 | 1 | 1 | 0
Rock | A rocky outcrop | Mine | Prospect | runiteruck1 | 1 | 1 | 1 | 0

Models names are specified in two ways:

1). Directly hardcoded in the source code. See: mudclient#loadModels<br/>
2). There is a model name associated with every Objectdef which is loaded from content0_229aa476. See: EntityHandler#load.

This exact archive file contains the following files and has no compressed entries.

(not yet added)

#### content10_ffffffffa95e7195 - "Sound effects"

This file is a [JagexArchive.md](./JagexArchive.md) containing raw audio data in [.pcm](https://en.wikipedia.org/wiki/Pulse-code_modulation) files.

This exact archive file contains the following files and has no compressed entries.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
1 | c7b2f180 (combat2b.pcm) | 372 | 4215
2 | f937307c (combat3a.pcm) | 4587 | 4604
3 | fa0a75cd (combat3b.pcm) | 9191 | 4575
4 | b949bc72 (takeobject.pcm) | 13766 | 640
5 | 175ec4be (prayeron.pcm) | 14406 | 1200
6 | 3ade8727 (recharge.pcm) | 15606 | 4000
7 | 3c463e4c (death.pcm) | 19606 | 7972
8 | 67a77ddf (filljug.pcm) | 27578 | 6719
9 | 7dfacc78 (eat.pcm) | 34297 | 9904
10 | d0a99a1c (closedoor.pcm) | 44201 | 3506
11 | 9148bdf9 (retreat.pcm) | 47707 | 4000
12 | ed079bf6 (victory.pcm) | 51707 | 4113
13 | e1f9d3cc (cooking.pcm) | 55820 | 12163
14 | 22c8a45e (chisel.pcm) | 67983 | 635
15 | ad836ec (mix.pcm) | 68618 | 9064
16 | 98516d58 (fish.pcm) | 77682 | 2886
17 | 7702c183 (shoot.pcm) | 80568 | 1819
18 | b0a01e57 (mine.pcm) | 82387 | 1798
19 | 5e62ab71 (outofammo.pcm) | 84185 | 6915
20 | fc8aae32 (coins.pcm) | 91100 | 6161
21 | a9aef9cc (underattack.pcm) | 97261 | 3200
22 | 4a7cef40 (spellok.pcm) | 100461 | 5499
23 | 9df7cabc (click.pcm) | 105960 | 342
24 | 56c0634 (opendoor.pcm) | 106302 | 6505
25 | fb758c9c (secretdoor.pcm) | 112807 | 7528
26 | 857f7b88 (anvil.pcm) | 120335 | 10498
27 | 57494cfb (mechanical.pcm) | 130833 | 6427
28 | 10cab19c (advance.pcm) | 137260 | 6036
29 | a58d871a (prospect.pcm) | 143296 | 3602
30 | 7226f18f (foundgem.pcm) | 146898 | 8000
31 | 7e6b845a (spellfail.pcm) | 154898 | 5307
32 | d56f3cf9 (potato.pcm) | 160205 | 872
33 | c4fa97a (dropobject.pcm) | 161077 | 3610
34 | 1232374c (prayeroff.pcm) | 164687 | 1200
35 | 948827e2 (combat1a.pcm) | 165887 | 1519
36 | 955b6d33 (combat1b.pcm) | 167406 | 1285
37 | c6dfac2f (combat2a.pcm) | 168691 | 2780

#### content11_7d5437c5 - "Textures"
