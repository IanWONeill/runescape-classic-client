Note: Work in progress.

Content pack files have the following structure.

File offset | Description
----------- | --------------
| 0 | Decompressed size of Data
| 3 | Compressed size of Data
| 6 | Data

The decompressed size and compressed size may be the same to indicate that no compression is used.

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

This file is a [JagexArchive.md](./JagexArchive.md) containing a single uncompressed [.tga](https://en.wikipedia.org/wiki/Truevision_TGA) file.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
0 | 97899353 (logo.tga) | 12 | 25192

#### content4_ffffffffaaca2b0d - "map"

#### content5_6a1d6b00 - "members map"

#### content6_ffffffffe997514b - "landscape"

This file is a [JagexArchive.md](./JagexArchive.md) containing landscape data in .hei files.

This exact archive file contains the following files and has no compressed entries.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
0 | 9c493cd (m05250.hei) | 1202 | 1403
1 | 4952c7a9 (m04952.hei) | 2605 | 3198
2 | df40fa49 (m35246.hei) | 5803 | 960
3 | dd33f4b7 (m05247.hei) | 6763 | 2371
4 | 1d145ce9 (m04848.hei) | 9134 | 3620
5 | 16fb435c (m04942.hei) | 12754 | 3678
6 | d965ce78 (m05141.hei) | 16432 | 3649
7 | d5f56183 (m05441.hei) | 20081 | 3863
8 | deaba2b4 (m05046.hei) | 23944 | 1263
9 | db8d6a15 (m05245.hei) | 25207 | 3921
10 | ddc94c4c (m35447.hei) | 29128 | 995
11 | d94276c7 (m05445.hei) | 30123 | 3510
12 | d9c387c2 (m05547.hei) | 33633 | 1986
13 | de9c919d (m35448.hei) | 35619 | 38
14 | ac82fb0c (m05239.hei) | 35657 | 2317
15 | bbd52c5 (m05151.hei) | 37974 | 2175
16 | dffff900 (m05149.hei) | 40149 | 2930
17 | deeec5f3 (m35347.hei) | 43079 | 1304
18 | dae90169 (m05447.hei) | 44383 | 1863
19 | 1beee342 (m04948.hei) | 46246 | 2552
20 | 1627fe0b (m04941.hei) | 48798 | 3953
21 | 1d28a383 (m34946.hei) | 52751 | 496
22 | d9e6df73 (m05243.hei) | 53247 | 3721
23 | da96cd13 (m05548.hei) | 56968 | 1958
24 | d54cc50 (m35555.hei) | 58926 | 2306
25 | 52ead31 (m05650.hei) | 61232 | 1059
26 | 1b1b9df1 (m04947.hei) | 62291 | 1942
27 | d4ac902b (m05845.hei) | 64233 | 1650
28 | d64795d9 (m05340.hei) | 65883 | 3814
29 | da8b481f (m05041.hei) | 69697 | 3296
30 | d71adb2a (m05341.hei) | 72993 | 3663
31 | b6b1e6f (m05252.hei) | 76656 | 2726
32 | d76d0f80 (m05240.hei) | 79382 | 3597
33 | b2d30b3 (m35451.hei) | 82979 | 889
34 | e0143f9a (m35247.hei) | 83868 | 671
35 | 1554b8ba (m04940.hei) | 84539 | 3499
36 | de073a08 (m05248.hei) | 88038 | 765
37 | d782401 (m35251.hei) | 88803 | 48
38 | db3b35bf (m05346.hei) | 88851 | 2503
39 | 1a4858a0 (m04946.hei) | 91354 | 1995
40 | 18a1cdfe (m04944.hei) | 93349 | 3781
41 | d994ab1d (m05344.hei) | 97130 | 3733
42 | de596e5e (m05147.hei) | 100863 | 2142
43 | d8c165cc (m05343.hei) | 103005 | 3460
44 | ada874b3 (m05139.hei) | 106465 | 2565
45 | 89f1a26 (m05350.hei) | 109030 | 1000
46 | dbbc46ba (m05448.hei) | 110030 | 1362
47 | dc60af66 (m05246.hei) | 111392 | 2613
48 | a45a4c8 (m05352.hei) | 114005 | 650
49 | db6a1264 (m05549.hei) | 114655 | 1262
50 | 9725f77 (m05351.hei) | 115917 | 778
51 | 4dc78db (m05751.hei) | 116695 | 2208
52 | dc8f8c0b (m05449.hei) | 118903 | 616
53 | dd86290d (m05146.hei) | 119519 | 1838
54 | dbdf9e6b (m05144.hei) | 121357 | 3845
55 | df7ee805 (m05047.hei) | 125202 | 924
56 | e18bed97 (m35046.hei) | 126126 | 1989
57 | 1975134f (m04945.hei) | 128115 | 3617
58 | e0522d56 (m05048.hei) | 131732 | 2054
59 | dd051812 (m05044.hei) | 133786 | 3421
60 | ddd85d63 (m05045.hei) | 137207 | 3748
61 | dc0e7b10 (m05347.hei) | 140955 | 2669
62 | e139b941 (m35147.hei) | 143624 | 38
63 | ce2cc6c (m05051.hei) | 143662 | 3074
64 | aa3807be (m05439.hei) | 146736 | 2072
65 | c52aa5a (m35351.hei) | 148808 | 484
66 | d79bec25 (m05443.hei) | 149292 | 3308
67 | 80ef814 (m35650.hei) | 152600 | 691
68 | c0f871b (m05050.hei) | 153291 | 2879
69 | 487f8258 (m04951.hei) | 156170 | 2006
70 | 84ce5d0 (m05451.hei) | 158176 | 997
71 | daba24c4 (m05244.hei) | 159173 | 3611
72 | 7276c29 (m05551.hei) | 162784 | 1784
73 | e12572a7 (m05049.hei) | 164568 | 2657
74 | 8e23d65 (m35651.hei) | 167225 | 1195
75 | da15bc18 (m05446.hei) | 168420 | 3163
76 | da3913c9 (m05142.hei) | 171583 | 3742
77 | 409338a (m05750.hei) | 175325 | 996
78 | 9202b21 (m05452.hei) | 176321 | 638
79 | deda7f59 (m05249.hei) | 176959 | 1138
80 | e0e784eb (m35248.hei) | 178097 | 38
81 | b7f6509 (m35350.hei) | 178135 | 38
82 | 779a07f (m05450.hei) | 178173 | 2379
83 | d86f3176 (m05444.hei) | 180552 | 3912
84 | e06673f0 (m35146.hei) | 184464 | 1510
85 | 1cc22893 (m04949.hei) | 185974 | 2652
86 | df2cb3af (m05148.hei) | 188626 | 2079
87 | aea0d74 (m05150.hei) | 190705 | 3019
88 | d9b802ce (m05040.hei) | 193724 | 3750
89 | da4498bd (m05649.hei) | 197474 | 786
90 | d84054d1 (m05241.hei) | 198260 | 3570
91 | 6974a17 (m35851.hei) | 201830 | 44
92 | 93471bb (m35550.hei) | 201874 | 38
93 | db0c591a (m05143.hei) | 201912 | 3049
94 | 65426d8 (m05550.hei) | 204961 | 1092
95 | d5221c32 (m05440.hei) | 206053 | 3696
96 | dfc20b44 (m35348.hei) | 209749 | 1311
97 | e25f32e8 (m35047.hei) | 211060 | 38
98 | a97d91e (m05251.hei) | 211098 | 256
99 | aecdee5a (m05039.hei) | 211354 | 2799
100 | dcb2e3bc (m05145.hei) | 214153 | 3917
101 | eefd1fe (m35050.hei) | 218070 | 43
102 | ddb505b2 (m05349.hei) | 218113 | 1326
103 | d6c8a6d4 (m05442.hei) | 219439 | 3375
104 | e3327839 (m35048.hei) | 222814 | 38
105 | 1c411798 (m04847.hei) | 222852 | 3553
106 | d8928927 (m05140.hei) | 226405 | 3817
107 | d8f04271 (m05546.hei) | 230222 | 1710
108 | ad1852a1 (m35439.hei) | 231932 | 251
109 | db5e8d70 (m05042.hei) | 232183 | 3831
110 | ab5d8165 (m05339.hei) | 236014 | 2352
111 | 17ce88ad (m04943.hei) | 238366 | 3835
112 | 47ac3d07 (m04950.hei) | 242201 | 2835
113 | dce1c061 (m05348.hei) | 245036 | 678
114 | ea6aa446 (m04939.hei) | 245714 | 2085
115 | d7ee207b (m05342.hei) | 247799 | 3206
116 | dc31d2c1 (m05043.hei) | 251005 | 3801
117 | 601f282 (m05651.hei) | 254806 | 2715
118 | da67f06e (m05345.hei) | 257521 | 3656
119 | d9139a22 (m05242.hei) | 261177 | 3684

#### content7_3fc5d9e3 - "members landscape"

#### content8_ffffffffb03e2a0c - "2d graphics"

#### content9_ffffffffe0e19e2c - "3d models"

This file is a [JagexArchive.md](./JagexArchive.md) containing model data in .ob3 files.

Interestingly, there are 25 unnamed/unused files in this archive.

\* Indicates unnamed files in the archive whose names were obtained by bruteforcing.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
57 | c0cb0507 (unknown) | 104975 | 38
70 | 7fb9eef7 (unknown) | 132461 | 1399
101 | 2d84499b (unknown) | 166745 | 2182
117 | e950681c (unknown) | 183535 | 476
125 | aabb013b (unknown) | 197304 | 15190
146 | d3cab1c6 (*test.ob3) | 250835 | 2408
148 | 62c8ac90 (unknown) | 254793 | 540
167 | 50567072 (unknown) | 288981 | 2272
190 | 6694b27d (unknown) | 321830 | 38
192 | 20ccd54d (*vine1.ob3) | 322338 | 1755
194 | 21a01a9e (*vine2.ob3) | 325476 | 1197
203 | 2015d1bd (*nails.ob3) | 340190 | 217
210 | b4b316bf (unknown) | 347311 | 682
213 | 5a24082f (unknown) | 350021 | 4112
214 | 5af74d80 (unknown) | 354133 | 3250
216 | 5bca92d1 (unknown) | 359955 | 467
221 | 1eb9269e (unknown) | 368131 | 2474
223 | 1f8c6bef (unknown) | 374619 | 2486
246 | 4928895e (unknown) | 420593 | 268
255 | 326e7013 (unknown) | 445806 | 1354
289 | bd7bd403 (unknown) | 518257 | 358
322 | 2304a6de (unknown) | 627115 | 9630
359 | b73d1505 (unknown) | 697073 | 1122
366 | d814f0de (unknown) | 705225 | 38
440 | 3dd4e679 (unknown) | 852020 | 638

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

\* Indicates unnamed files in the archive whose names were obtained by bruteforcing.

Index | Hash | Offset | Length
----- | ---- | ------ | -------
0 | db168ce5 (1-1light.ob3) | 4532 | 252
1 | f67bf043 (gnomefence2.ob3) | 4784 | 342
2 | 3241f414 (obstical_pipe.ob3) | 5126 | 682
3 | 7034d7db (signpost2.ob3) | 5808 | 410
4 | d6ae64df (cave bridge support.ob3) | 6218 | 938
5 | 3f800a89 (saradominstone.ob3) | 7156 | 334
6 | ad18dfd9 (bush1.ob3) | 7490 | 482
7 | adec252a (bush2.ob3) | 7972 | 390
8 | b43d0559 (ropeforclimbingbot.ob3) | 8362 | 358
9 | bebf72b0 (wallpost.ob3) | 8720 | 190
10 | e36fa28c (cave rocktrap1.ob3) | 8910 | 1149
11 | 768fd868 (ropeladder.ob3) | 10059 | 2290
12 | 9b01f2c2 (well.ob3) | 12349 | 1000
13 | 3b422c54 (vine.ob3) | 13349 | 538
14 | 76c28196 (mudpile.ob3) | 13887 | 1054
15 | b8329ce1 (spinningwheel.ob3) | 14941 | 4056
16 | f7b93856 (tree.ob3) | 18997 | 980
17 | 9d7eb5e5 (oaktree.ob3) | 19977 | 910
18 | a223a641 (cave bloodwell.ob3) | 20887 | 3460
19 | d0c08dd4 (sandyfootsteps.ob3) | 24347 | 332
20 | 9d7517ea (clockpolepurple.ob3) | 24679 | 230
21 | e7162460 (cave grilltrapa up.ob3) | 24909 | 1542
22 | 7f707f8d (landscape.ob3) | 26451 | 674
23 | 89220a47 (cave snaptrapa.ob3) | 27125 | 1872
24 | 3f103823 (treestump.ob3) | 28997 | 438
25 | e05680e6 (palm2.ob3) | 29435 | 1126
26 | 407b4995 (tree_with_vines.ob3) | 30561 | 2000
27 | f33d0d9b (magearena wall.ob3) | 32561 | 366
28 | b460b6fd (bridge section 1.ob3) | 32927 | 540
29 | 8565bb54 (small caveentrance2.ob3) | 33467 | 623
30 | 127dc5fe (cave bridge supportbase.ob3) | 34090 | 726
31 | b533fc4e (bridge section 2.ob3) | 34816 | 632
32 | bb72499d (totemtreerotten2.ob3) | 35448 | 2080
33 | 4d547dea (counter.ob3) | 37528 | 190
34 | b607419f (bridge section 3.ob3) | 37718 | 372
35 | bc458eee (totemtreerotten3.ob3) | 38090 | 2704
36 | bd18d43f (totemtreerotten4.ob3) | 40794 | 2146
37 | cc9ce630 (tribalstature.ob3) | 42940 | 2916
38 | bdec1990 (totemtreerotten5.ob3) | 45856 | 3228
39 | f59e8899 (henge.ob3) | 49084 | 910
40 | 4b18dcb0 (obstical_ropeswing.ob3) | 49994 | 638
41 | 15a0ca0a (grand treeinside-lev 0.ob3) | 50632 | 5802
42 | c50e4c8 (pipe&drain.ob3) | 56434 | 752
43 | 16740f5b (grand treeinside-lev 1.ob3) | 57186 | 12322
44 | 174754ac (grand treeinside-lev 2.ob3) | 69508 | 12896
45 | 2238aff4 (wallpipe.ob3) | 82404 | 776
46 | 34d36d21 (cave pillar.ob3) | 83180 | 868
47 | 385e5f4f (cave grillcage.ob3) | 84048 | 1174
48 | b11d9cc4 (gnomecage.ob3) | 85222 | 2408
49 | bb39a852 (logbridgecurvedhigh.ob3) | 87630 | 5968
50 | 946ad939 (cactus.ob3) | 93598 | 588
51 | 85ddd70a (altar.ob3) | 94186 | 2088
52 | 3a55d9aa (2-1light.ob3) | 96274 | 476
53 | 5523831f (ardoungewall.ob3) | 96750 | 1366
54 | 25aa2495 (coffin2.ob3) | 98116 | 335
55 | 71a85125 (cave platform small2.ob3) | 98451 | 4948
56 | 1246d6cf (magearena colomn.ob3) | 103399 | 1576
57 | c0cb0507 (unknown) | 104975 | 38
58 | ff4b7656 (market.ob3) | 105013 | 894
59 | cff46d6a (roundtable.ob3) | 105907 | 638
60 | 10dd822f (dugupsoil1.ob3) | 106545 | 493
61 | 1adb4577 (wheat.ob3) | 107038 | 184
62 | 11b0c780 (dugupsoil2.ob3) | 107222 | 310
63 | 12840cd1 (dugupsoil3.ob3) | 107532 | 450
64 | ef6f1adc (cave temple.ob3) | 107982 | 14342
65 | e41eacf5 (fishingcranerot1.ob3) | 122324 | 2474
66 | e4f1f246 (fishingcranerot2.ob3) | 124798 | 2474
67 | ca9a0451 (cave old bridge.ob3) | 127272 | 1092
68 | 342bf017 (animalskull.ob3) | 128364 | 2395
69 | 7c0dd3a5 (jungle fly trap.ob3) | 130759 | 1702
70 | 7fb9eef7 (unknown) | 132461 | 1399
71 | f0f85fb (brokenpillar.ob3) | 133860 | 2088
72 | 5e0be697 (shipleak.ob3) | 135948 | 426
73 | 9f517409 (mapletree.ob3) | 136374 | 1046
74 | 85a492d7 (jungle spikey fern.ob3) | 137420 | 280
75 | 5a65172e (sinkingshipfront.ob3) | 137700 | 3882
76 | d74d8e67 (compost.ob3) | 141582 | 382
77 | 85b82bc8 (rowboat.ob3) | 141964 | 1341
78 | 97594e7f (yewtree.ob3) | 143305 | 1046
79 | f2af7b45 (chair.ob3) | 144351 | 715
80 | 66d192b7 (adamiterock1.ob3) | 145066 | 528
81 | 29351a79 (wallclockface.ob3) | 145594 | 1905
82 | 1e02cb4d (hornedskull.ob3) | 147499 | 666
83 | 83710212 (telescope.ob3) | 148165 | 2952
84 | 88ff1ae1 (deadtree2base.ob3) | 151117 | 861
85 | 24025a61 (woodengateopen.ob3) | 151978 | 1280
86 | 52876d32 (brokenlograft.ob3) | 153258 | 700
87 | ba8f224f (cave speartrap.ob3) | 153958 | 287
88 | 605db8a4 (rock3.ob3) | 154245 | 505
89 | 7364f512 (potterywheel.ob3) | 154750 | 584
90 | 23b24647 (totemtreeevil.ob3) | 155334 | 1290
91 | 889f6975 (cave rock1.ob3) | 156624 | 360
92 | edf65f19 (sinkingbarrel.ob3) | 156984 | 754
93 | 1442095a (sewervalve.ob3) | 157738 | 1608
94 | 1982e2de (largeurn.ob3) | 159346 | 2470
95 | 2e98456b (beam.ob3) | 161816 | 102
96 | 11ffc29b (sink.ob3) | 161918 | 1784
97 | 5e480047 (copperrock1.ob3) | 163702 | 528
98 | 3870db80 (supportnw.ob3) | 164230 | 657
99 | 61ddd365 (cave old bridgedown.ob3) | 164887 | 1116
100 | 6194bdf3 (bridge section collapsed.ob3) | 166003 | 742
101 | 2d84499b (unknown) | 166745 | 2182
102 | 4887e3b (cave wallgrill.ob3) | 168927 | 846
103 | 69e0eda7 (giantcrystal.ob3) | 169773 | 283
104 | e98392aa (cave large stagatite.ob3) | 170056 | 420
105 | be39801b (magearena plain wall.ob3) | 170476 | 102
106 | c50b05dd (gnomefence.ob3) | 170578 | 342
107 | e0c36902 (stonedisc.ob3) | 170920 | 194
108 | 624cfae9 (Shamancave.ob3) | 171114 | 1352
109 | f9038699 (nastyfungus.ob3) | 172466 | 2492
110 | c6d10fd1 (firespell1.ob3) | 174958 | 1567
111 | 8aaf943d (blueflower.ob3) | 176525 | 894
112 | c7a45522 (firespell2.ob3) | 177419 | 1567
113 | c8779a73 (firespell3.ob3) | 178986 | 1567
114 | 89ed083c (palm.ob3) | 180553 | 888
115 | e5292625 (potteryoven.ob3) | 181441 | 1128
116 | 734dc621 (obstical_net.ob3) | 182569 | 966
117 | e950681c (unknown) | 183535 | 476
118 | 9617de0f (1-1dark.ob3) | 184011 | 102
119 | 1e144cef (corner_ledge.ob3) | 184113 | 172
120 | a78e76be (doubledoorsclosed.ob3) | 184285 | 2414
121 | fbb00d85 (hazeeltomb.ob3) | 186699 | 7312
122 | 56846b3d (magearena tallcorner.ob3) | 194011 | 1597
123 | 44eb2de (cave extra large stagatite.ob3) | 195608 | 420
124 | aee9e6dd (gnomeglidercrashed.ob3) | 196028 | 1276
125 | aabb013b (unknown) | 197304 | 15190
126 | c6c7581 (ent.ob3) | 212494 | 5570
127 | b6130f54 (cupboardopen.ob3) | 218064 | 1018
128 | 48eef5d2 (jungle medium size plant.ob3) | 219082 | 2650
129 | 2759e6f2 (trawlernet.ob3) | 221732 | 556
130 | c828cc5f (cave tubetrapa rope.ob3) | 222288 | 1268
131 | 4e334a8 (torcha1.ob3) | 223556 | 1446
132 | 5b679f9 (torcha2.ob3) | 225002 | 1446
133 | 689bf4a (torcha3.ob3) | 226448 | 1446
134 | 75d049b (torcha4.ob3) | 227894 | 1446
135 | 7d49a467 (barrelredcross.ob3) | 229340 | 884
136 | 56a0dcd1 (trackbuffer.ob3) | 230224 | 988
137 | 15f3e529 (stonestairs.ob3) | 231212 | 6756
138 | 93d1c61b (windmillsail.ob3) | 237968 | 4656
139 | 2eeaad1 (clockpolered.ob3) | 242624 | 230
140 | ff21e6f1 (skeletonwithbag.ob3) | 242854 | 1678
141 | 7411a5a6 (clockpoleblue.ob3) | 244532 | 230
142 | 2018ad95 (cactuswatered.ob3) | 244762 | 572
143 | 6ae2116f (logbridgelow.ob3) | 245334 | 4946
144 | 209f2e9c (straight_ledge.ob3) | 250280 | 125
145 | b5524f9 (leverup.ob3) | 250405 | 430
146 | d3cab1c6 (*test.ob3) | 250835 | 2408
147 | 1dd6da5e (furnace.ob3) | 253243 | 1550
148 | 62c8ac90 (unknown) | 254793 | 540
149 | 2b9db0b0 (metalgateclosed.ob3) | 255333 | 1694
150 | 4d92ff18 (largetreeplatformlow.ob3) | 257027 | 11240
151 | 40d655b5 (cave rocktrap1a.ob3) | 268267 | 1462
152 | 44f0ad55 (signpost.ob3) | 269729 | 383
153 | ca267707 (2-2light.ob3) | 270112 | 102
154 | f295aa7d (target.ob3) | 270214 | 426
155 | 39c297c6 (wallbench.ob3) | 270640 | 236
156 | acfe10a2 (floorweb.ob3) | 270876 | 31
157 | 86022f49 (logbridgehigh.ob3) | 270907 | 4946
158 | 43f953ca (doubledoorsopen.ob3) | 275853 | 1932
159 | cac8ff94 (hillsidedoor.ob3) | 277785 | 2414
160 | 599cf384 (woodenrailing.ob3) | 280199 | 932
161 | 58c6f068 (ardoungewallcorner.ob3) | 281131 | 566
162 | c232d413 (rocktile.ob3) | 281697 | 752
163 | d92b7be4 (candles.ob3) | 282449 | 1428
164 | 432a7ab7 (magearena cornerfill.ob3) | 283877 | 220
165 | 2b9690a5 (jungle statue.ob3) | 284097 | 3573
166 | 6e0363b (ScaffoldsupportRope.ob3) | 287670 | 1311
167 | 50567072 (unknown) | 288981 | 2272
168 | 566bc589 (crate.ob3) | 291253 | 124
169 | 184c4633 (smashedtable.ob3) | 291377 | 953
170 | 48de7502 (ladder.ob3) | 292330 | 868
171 | c4a8d987 (trawlernet-l.ob3) | 293198 | 800
172 | c4f02fbd (stonestairsdown.ob3) | 293998 | 6756
173 | c2b4353e (barrel.ob3) | 300754 | 754
174 | e5ba0a7f (bigegg.ob3) | 301508 | 884
175 | 31ad66b5 (lograft.ob3) | 302392 | 906
176 | 66c06a3c (waterfall.ob3) | 303298 | 2926
177 | 613bc906 (shipspray1.ob3) | 306224 | 31
178 | 620f0e57 (shipspray2.ob3) | 306255 | 31
179 | c99c796d (trawlernet-r.ob3) | 306286 | 800
180 | bdf6d5e (logbridgejunction lev0.ob3) | 307086 | 3742
181 | cb2b2af (logbridgejunction lev1.ob3) | 310828 | 3742
182 | df2df1d2 (vinejunction.ob3) | 314570 | 724
183 | 8d841570 (eggs.ob3) | 315294 | 2020
184 | a2b61cea (hole.ob3) | 317314 | 450
185 | e1ed65dc (fallentree.ob3) | 317764 | 975
186 | c4860d9b (cave grilltrapa.ob3) | 318739 | 1542
187 | 42ad6551 (1-3dark.ob3) | 320281 | 102
188 | a1520f5 (Scaffoldsupport.ob3) | 320383 | 843
189 | d6099d22 (logpile.ob3) | 321226 | 604
190 | 6694b27d (unknown) | 321830 | 38
191 | b290798c (bigtable.ob3) | 321868 | 470
192 | 20ccd54d (*vine1.ob3) | 322338 | 1755
193 | 4561fa6d (dolmen.ob3) | 324093 | 1383
194 | 21a01a9e (*vine2.ob3) | 325476 | 1197
195 | f8f1182e (barrier1.ob3) | 326673 | 248
196 | 434dcdfd (rocks1.ob3) | 326921 | 528
197 | 6112cddf (gnomegoal.ob3) | 327449 | 3271
198 | 4421134e (rocks2.ob3) | 330720 | 489
199 | 132381d5 (vinecorner.ob3) | 331209 | 756
200 | e99e687e (watchtower.ob3) | 331965 | 2739
201 | d9a3a824 (blurberrybar.ob3) | 334704 | 1552
202 | 13d0240c (chaosaltar.ob3) | 336256 | 3934
203 | 2015d1bd (*nails.ob3) | 340190 | 217
204 | 59410777 (gnomeglider.ob3) | 340407 | 1144
205 | 7be42b07 (Shipfront.ob3) | 341551 | 2492
206 | 2a3eafd8 (wallgrill.ob3) | 344043 | 406
207 | 97d43a05 (largesewerpipe.ob3) | 344449 | 776
208 | 9fdf718 (tree2.ob3) | 345225 | 980
209 | ecb12ac5 (cave tubetrapa.ob3) | 346205 | 1106
210 | b4b316bf (unknown) | 347311 | 682
211 | 6c42200f (range.ob3) | 347993 | 1626
212 | da562b0e (cave smashedcage.ob3) | 349619 | 402
213 | 5a24082f (unknown) | 350021 | 4112
214 | 5af74d80 (unknown) | 354133 | 3250
215 | 3e5ef4e9 (cave furnace.ob3) | 357383 | 2572
216 | 5bca92d1 (unknown) | 359955 | 467
217 | c74f8f88 (totemtreegood.ob3) | 360422 | 1290
218 | fc017352 (rams skull dooropen.ob3) | 361712 | 5152
219 | 882f48a1 (flower.ob3) | 366864 | 894
220 | 33df21e3 (cave swamprocks.ob3) | 367758 | 373
221 | 1eb9269e (unknown) | 368131 | 2474
222 | 6555ec58 (logbridge lev0.ob3) | 370605 | 4014
223 | 1f8c6bef (unknown) | 374619 | 2486
224 | 662931a9 (logbridge lev1.ob3) | 377105 | 4014
225 | 66fc76fa (logbridge lev2.ob3) | 381119 | 4014
226 | fab7c79f (1-3light.ob3) | 385133 | 102
227 | db0ca352 (rockpoolwater.ob3) | 385235 | 496
228 | 45599b73 (rowboatsinking.ob3) | 385731 | 1193
229 | 4ad6dd90 (cart.ob3) | 386924 | 5098
230 | 9719d921 (halfburiedskeleton.ob3) | 392022 | 1912
231 | 59c5052a (cave carvings.ob3) | 393934 | 594
232 | 8bac0618 (jungle tree 1.ob3) | 394528 | 1010
233 | 89886067 (wallshield.ob3) | 395538 | 1030
234 | aa7e1503 (khazardwall.ob3) | 396568 | 172
235 | 8c7f4b69 (jungle tree 2.ob3) | 396740 | 1174
236 | 3e786518 (rocksteps.ob3) | 397914 | 894
237 | 4500f3a (mudpiledown.ob3) | 398808 | 1054
238 | a414f97f (sacks.ob3) | 399862 | 1536
239 | 799f55ec (willowtree.ob3) | 401398 | 2104
240 | d9d5ba54 (woodenstairsdown.ob3) | 403502 | 1944
241 | 2c5e3227 (marblearch.ob3) | 405446 | 2364
242 | 1b9277ed (cave platform verysmall.ob3) | 407810 | 2754
243 | 11f7177b (treeplatformhigh.ob3) | 410564 | 7690
244 | 4747245c (trackpoints.ob3) | 418254 | 1709
245 | 159181db (cave lever.ob3) | 419963 | 630
246 | 4928895e (unknown) | 420593 | 268
247 | 6d2e79a0 (magearena tallwall.ob3) | 420861 | 2021
248 | 6676813a (dwarf multicannon part1.ob3) | 422882 | 322
249 | 6749c68b (dwarf multicannon part2.ob3) | 423204 | 5246
250 | f75a0ccf (clayrock1.ob3) | 428450 | 528
251 | 681d0bdc (dwarf multicannon part3.ob3) | 428978 | 13532
252 | 51b7ec14 (mill.ob3) | 442510 | 1710
253 | a2c0fe3a (cupboard.ob3) | 444220 | 928
254 | 61002b99 (rockcounter.ob3) | 445148 | 658
255 | 326e7013 (unknown) | 445806 | 1354
256 | 941b77af (treeroot1.ob3) | 447160 | 976
257 | 94eebd00 (treeroot2.ob3) | 448136 | 1446
258 | 1167362a (clawspell1.ob3) | 449582 | 2740
259 | e963a578 (ogre standard.ob3) | 452322 | 2068
260 | 123a7b7b (clawspell2.ob3) | 454390 | 2740
261 | 26a97eaf (spikedpit.ob3) | 457130 | 1060
262 | 130dc0cc (clawspell3.ob3) | 458190 | 948
263 | e0695690 (magearena corner.ob3) | 459138 | 234
264 | 13e1061d (clawspell4.ob3) | 459372 | 2068
265 | 42edbb5 (dramentree.ob3) | 461440 | 878
266 | 14b44b6e (clawspell5.ob3) | 462318 | 3100
267 | f39c94e9 (baxtorianchalicelow.ob3) | 465418 | 1172
268 | 2e341b0 (zodiac.ob3) | 466590 | 4266
269 | a2a6993f (gnomewatchtower lev0.ob3) | 470856 | 6568
270 | c77ff565 (coalrock1.ob3) | 477424 | 528
271 | b9cf0fa0 (cave swampbubbles.ob3) | 477952 | 578
272 | a379de90 (gnomewatchtower lev1.ob3) | 478530 | 6568
273 | a44d23e1 (gnomewatchtower lev2.ob3) | 485098 | 6568
274 | b5df4057 (ChestOpen.ob3) | 491666 | 1710
275 | 8dfbcfdf (baxtorianchalice.ob3) | 493376 | 1172
276 | 86847b70 (cave temple alter.ob3) | 494548 | 5486
277 | dd9124b9 (cave small stagamite.ob3) | 500034 | 165
278 | 7c2b971e (fishing.ob3) | 500199 | 202
279 | bd45a847 (curvedbone.ob3) | 500401 | 399
280 | 8e66d304 (climbing_rocks.ob3) | 500800 | 556
281 | 8a2ad08e (largetreeplatformhigh.ob3) | 501356 | 11240
282 | 4044777 (halfburiedskeleton2.ob3) | 512596 | 1447
283 | a9c83066 (ladderdown.ob3) | 514043 | 868
284 | 7f04b840 (mossyrock.ob3) | 514911 | 630
285 | 311820d9 (2-2dark.ob3) | 515541 | 102
286 | ff5eb05d (shopsign.ob3) | 515643 | 714
287 | fe27cda2 (throne.ob3) | 516357 | 1702
288 | 79f2fa57 (brokenwall.ob3) | 518059 | 198
289 | bd7bd403 (unknown) | 518257 | 358
290 | 933bb72a (gemrock.ob3) | 518615 | 528
291 | f7efd801 (Shipmiddle.ob3) | 519143 | 1686
292 | 8357c72c (cave speartrapa.ob3) | 520829 | 695
293 | 28f9b192 (bench.ob3) | 521524 | 1178
294 | d9aaa874 (totemtree1.ob3) | 522702 | 818
295 | da7dedc5 (totemtree2.ob3) | 523520 | 818
296 | db513316 (totemtree3.ob3) | 524338 | 766
297 | dc247867 (totemtree4.ob3) | 525104 | 208
298 | b34431d5 (runiterock1.ob3) | 525312 | 528
299 | dcf7bdb8 (totemtree5.ob3) | 525840 | 1290
300 | 829cb5bb (Shipback.ob3) | 527130 | 7124
301 | 7939dad8 (rams skull door.ob3) | 534254 | 4640
302 | e459466e (fountain.ob3) | 538894 | 2666
303 | 2a89ae97 (coffin.ob3) | 541560 | 251
304 | 8ab654be (grand tree-lev 0.ob3) | 541811 | 15154
305 | 62f2dc77 (caveentrance2.ob3) | 556965 | 623
306 | e4ac269d (rock cake counter.ob3) | 557588 | 5290
307 | 8b899a0f (grand tree-lev 1.ob3) | 562878 | 15154
308 | 96b2eb63 (gallows.ob3) | 578032 | 3091
309 | 8c5cdf60 (grand tree-lev 2.ob3) | 581123 | 15154
310 | 8d3024b1 (grand tree-lev 3.ob3) | 596277 | 18214
311 | aff1a64c (liftbed.ob3) | 614491 | 1330
312 | e8acd0d2 (smashedchair.ob3) | 615821 | 1226
313 | e36dd296 (spellshock.ob3) | 617047 | 248
314 | 2531fe89 (brokencart.ob3) | 617295 | 5122
315 | 2ee111c2 (cave planks.ob3) | 622417 | 298
316 | 4abc51c6 (spikedpit-low.ob3) | 622715 | 1094
317 | 17edf929 (flax.ob3) | 623809 | 1146
318 | 1ddbb40d (jungle fern textured 2.ob3) | 624955 | 544
319 | f34bcc52 (ironrock1.ob3) | 625499 | 528
320 | 1eaef95e (jungle fern textured 3.ob3) | 626027 | 544
321 | 1f823eaf (jungle fern textured 4.ob3) | 626571 | 544
322 | 2304a6de (unknown) | 627115 | 9630
323 | 15e1b1db (bullrushes.ob3) | 636745 | 774
324 | ace44194 (doubledoorframe.ob3) | 637519 | 1270
325 | ea1ede5d (sandpit.ob3) | 638789 | 382
326 | b3f44104 (fourwayplatform-lev 0.ob3) | 639171 | 8862
327 | b4c78655 (fourwayplatform-lev 1.ob3) | 648033 | 8562
328 | 31209fe (beehive.ob3) | 656595 | 578
329 | 51cad04 (goldrock1.ob3) | 657173 | 528
330 | 16877ea3 (milltop.ob3) | 657701 | 1702
331 | 2e89c433 (ChestClosed.ob3) | 659403 | 1380
332 | 23f389e6 (jungle fern.ob3) | 660783 | 931
333 | 6d76efac (leverdown.ob3) | 661714 | 440
334 | 706b3298 (bigroundtable.ob3) | 662154 | 994
335 | 857f6ca8 (anvil.ob3) | 663148 | 748
336 | 5a9e2da9 (trackstraight.ob3) | 663896 | 492
337 | ac3a2fe8 (manholeclosed.ob3) | 664388 | 688
338 | 6b80ce8e (liftwinch.ob3) | 665076 | 1668
339 | 36f3497 (ceilingweb.ob3) | 666744 | 31
340 | afd45657 (magearena door.ob3) | 666775 | 1342
341 | 7ae05c90 (woodenstairs.ob3) | 668117 | 1944
342 | b4e04120 (Doormat.ob3) | 670061 | 194
343 | a931d238 (guthixstone.ob3) | 670255 | 538
344 | 9e278427 (fireplacea1.ob3) | 670793 | 671
345 | 9efac978 (fireplacea2.ob3) | 671464 | 671
346 | 9fce0ec9 (fireplacea3.ob3) | 672135 | 671
347 | 9efcb138 (mushroom.ob3) | 672806 | 456
348 | a324a39c (stalagmites.ob3) | 673262 | 469
349 | 58406891 (madmachine.ob3) | 673731 | 3976
350 | d188b706 (cauldron.ob3) | 677707 | 1098
351 | 45a9fd96 (carcass.ob3) | 678805 | 3872
352 | 3d94e6b1 (bed.ob3) | 682677 | 1062
353 | 2940ae97 (stool.ob3) | 683739 | 458
354 | dbe59425 (obstical_frame.ob3) | 684197 | 632
355 | 5b1a626a (cave grilltrap.ob3) | 684829 | 762
356 | 8283a831 (cave well.ob3) | 685591 | 2570
357 | eb988e2e (tree_with_rope.ob3) | 688161 | 1804
358 | b6e508d7 (catabow.ob3) | 689965 | 7108
359 | b73d1505 (unknown) | 697073 | 1122
360 | 9a639ced (bookcase.ob3) | 698195 | 220
361 | d8e89c3f (magictree.ob3) | 698415 | 980
362 | b3681658 (barpumps.ob3) | 699395 | 4062
363 | 83f09d4b (portrait.ob3) | 703457 | 674
364 | ffbdd42 (smallfern.ob3) | 704131 | 490
365 | 223ae542 (jungle strange plant.ob3) | 704621 | 604
366 | d814f0de (unknown) | 705225 | 38
367 | 4d1805fa (catabowarrow.ob3) | 705263 | 181
368 | 311b4af6 (cave templedooropen.ob3) | 705444 | 13340
369 | 1ff9086 (cave snaptrap.ob3) | 718784 | 1600
370 | 71f04083 (clockpoleblack.ob3) | 720384 | 230
371 | b5ede574 (waterfalllev1.ob3) | 720614 | 3050
372 | b6c12ac5 (waterfalllev2.ob3) | 723664 | 2926
373 | f96c4667 (cave platform small.ob3) | 726590 | 6268
374 | 2fb5463d (cave bolder.ob3) | 732858 | 578
375 | 2a1d6c3 (millbase.ob3) | 733436 | 656
376 | 61580acc (cave bridge stairs.ob3) | 734092 | 940
377 | d56f2e19 (potato.ob3) | 735032 | 496
378 | 2f0a0096 (metalgateopen2.ob3) | 735528 | 1042
379 | b1129034 (jungle strange plant 2.ob3) | 736570 | 2609
380 | 1ccf8cdc (cave tubetrap.ob3) | 739179 | 1084
381 | 8c22973 (clawsofiban.ob3) | 740263 | 2740
382 | f40f3b2c (cave small stagatite.ob3) | 743003 | 165
383 | 6bb17c95 (shipleak2.ob3) | 743168 | 426
384 | 7bfbbcc6 (longtable.ob3) | 743594 | 2274
385 | c9cd23c5 (bridge section corner.ob3) | 745868 | 974
386 | 6f8360ad (fern.ob3) | 746842 | 736
387 | 5772ef95 (gravestone1.ob3) | 747578 | 548
388 | e52cff83 (lightning1.ob3) | 748126 | 284
389 | 584634e6 (gravestone2.ob3) | 748410 | 436
390 | b6282d5d (poorbed.ob3) | 748846 | 496
391 | e60044d4 (lightning2.ob3) | 749342 | 284
392 | c567551 (Spellcharge1.ob3) | 749626 | 1044
393 | e6d38a25 (lightning3.ob3) | 750670 | 884
394 | d29baa2 (spellcharge2.ob3) | 751554 | 1044
395 | 168f1221 (caveentrance.ob3) | 752598 | 2878
396 | dfcfff3 (spellcharge3.ob3) | 755476 | 1044
397 | 703fb676 (elventomb.ob3) | 756520 | 7550
398 | abf3f8d (woodengateclosed.ob3) | 764070 | 1256
399 | 22f170d4 (mudpatch.ob3) | 765326 | 268
400 | 270cc6cf (obelisk.ob3) | 765594 | 134
401 | ebd34689 (stonestand.ob3) | 765728 | 276
402 | 486e0bad (spearwall.ob3) | 766004 | 826
403 | 8b3751ac (metalgateopen.ob3) | 766830 | 1694
404 | fb6c589e (largegrave.ob3) | 768524 | 2172
405 | ef469b89 (treeplatformlow.ob3) | 770696 | 7682
406 | 2a654680 (toplesstree.ob3) | 778378 | 876
407 | f420a272 (gnomehamek.ob3) | 779254 | 682
408 | 434ccd81 (bridge section collapsed2.ob3) | 779936 | 786
409 | fbfdaa7f (glarialsstatue.ob3) | 780722 | 1546
410 | 3033c143 (skulltorcha1.ob3) | 782268 | 2008
411 | 6fd75f73 (rockpool.ob3) | 784276 | 1475
412 | aee20c23 (silverrock1.ob3) | 785751 | 528
413 | 31070694 (skulltorcha2.ob3) | 786279 | 2008
414 | 31da4be5 (skulltorcha3.ob3) | 788287 | 2008
415 | de6c7c13 (jungle fern textured.ob3) | 790295 | 544
416 | 32ad9136 (skulltorcha4.ob3) | 790839 | 2008
417 | 1d4af80 (trackcurve.ob3) | 792847 | 1108
418 | 1eec0e97 (Foodtrough.ob3) | 793955 | 714
419 | e38d9476 (firea1.ob3) | 794669 | 965
420 | e460d9c7 (firea2.ob3) | 795634 | 965
421 | 507f72b5 (gnomesign.ob3) | 796599 | 574
422 | e5341f18 (firea3.ob3) | 797173 | 965
423 | 84289316 (cave ledge.ob3) | 798138 | 692
424 | 2048aed (sworddummy.ob3) | 798830 | 1858
425 | ed0ad981 (deadtree1.ob3) | 800688 | 878
426 | 8e8082d9 (marblepillar.ob3) | 801566 | 920
427 | e21bf764 (leverbracket.ob3) | 802486 | 268
428 | c8ccf6ee (dwarf multicannon.ob3) | 802754 | 15080
429 | edde1ed2 (deadtree2.ob3) | 817834 | 740
430 | 616bc924 (manholeopen.ob3) | 818574 | 1482
431 | 817f03a7 (mithrilrock1.ob3) | 820056 | 528
432 | 82019ee7 (Bigbed.ob3) | 820584 | 2562
433 | 224ef0a6 (table.ob3) | 823146 | 454
434 | 6ae9a3f (treeplatformlow2.ob3) | 823600 | 9888
435 | 9dbc5438 (zamorakstone.ob3) | 833488 | 604
436 | 4abc22e9 (treeplatformhigh2.ob3) | 834092 | 9904
437 | 479b8521 (brownclimbingrocks.ob3) | 843996 | 360
438 | f63f4e2c (logbridgecurvedlow.ob3) | 844356 | 5968
439 | 676ea48a (metalgateclosed2.ob3) | 850324 | 1696
440 | 3dd4e679 (unknown) | 852020 | 638
441 | 5a5346bd (minecart.ob3) | 852658 | 2110
442 | f738d099 (tree_for_rope.ob3) | 854768 | 1608
443 | 7d7f5f3c (cave templedoor.ob3) | 856376 | 12864
444 | 90206a4d (tinrock1.ob3) | 869240 | 528
445 | bbaea4af (fishingcrane.ob3) | 869768 | 2468
446 | 749b0cfa (log_balance1.ob3) | 872236 | 466
447 | 756e524b (log_balance2.ob3) | 872702 | 466
448 | 5ad3ee89 (largebone.ob3) | 873168 | 624
449 | 80419760 (dangersign.ob3) | 873792 | 1067
450 | ff9c1a98 (cave grillcageup.ob3) | 874859 | 1198
451 | d3057c37 (cave large stagamite.ob3) | 876057 | 434
452 | c3bed90d (bluriterock1.ob3) | 876491 | 528

#### content10_ffffffffa95e7195 - "Sound effects"

This file is a [JagexArchive.md](./JagexArchive.md) containing raw audio data in [.pcm](https://en.wikipedia.org/wiki/Pulse-code_modulation) files.

This exact archive file contains the following files and has no compressed entries.

Index | Hash | Offset | Length
------ | ---- | ------ | -------
0 | c7b2f180 (combat2b.pcm) | 372 | 4215
1 | f937307c (combat3a.pcm) | 4587 | 4604
2 | fa0a75cd (combat3b.pcm) | 9191 | 4575
3 | b949bc72 (takeobject.pcm) | 13766 | 640
4 | 175ec4be (prayeron.pcm) | 14406 | 1200
5 | 3ade8727 (recharge.pcm) | 15606 | 4000
6 | 3c463e4c (death.pcm) | 19606 | 7972
7 | 67a77ddf (filljug.pcm) | 27578 | 6719
8 | 7dfacc78 (eat.pcm) | 34297 | 9904
9 | d0a99a1c (closedoor.pcm) | 44201 | 3506
10 | 9148bdf9 (retreat.pcm) | 47707 | 4000
11 | ed079bf6 (victory.pcm) | 51707 | 4113
12 | e1f9d3cc (cooking.pcm) | 55820 | 12163
13 | 22c8a45e (chisel.pcm) | 67983 | 635
14 | ad836ec (mix.pcm) | 68618 | 9064
15 | 98516d58 (fish.pcm) | 77682 | 2886
16 | 7702c183 (shoot.pcm) | 80568 | 1819
17 | b0a01e57 (mine.pcm) | 82387 | 1798
18 | 5e62ab71 (outofammo.pcm) | 84185 | 6915
19 | fc8aae32 (coins.pcm) | 91100 | 6161
20 | a9aef9cc (underattack.pcm) | 97261 | 3200
21 | 4a7cef40 (spellok.pcm) | 100461 | 5499
22 | 9df7cabc (click.pcm) | 105960 | 342
23 | 56c0634 (opendoor.pcm) | 106302 | 6505
24 | fb758c9c (secretdoor.pcm) | 112807 | 7528
25 | 857f7b88 (anvil.pcm) | 120335 | 10498
26 | 57494cfb (mechanical.pcm) | 130833 | 6427
27 | 10cab19c (advance.pcm) | 137260 | 6036
28 | a58d871a (prospect.pcm) | 143296 | 3602
29 | 7226f18f (foundgem.pcm) | 146898 | 8000
30 | 7e6b845a (spellfail.pcm) | 154898 | 5307
31 | d56f3cf9 (potato.pcm) | 160205 | 872
32 | c4fa97a (dropobject.pcm) | 161077 | 3610
33 | 1232374c (prayeroff.pcm) | 164687 | 1200
34 | 948827e2 (combat1a.pcm) | 165887 | 1519
35 | 955b6d33 (combat1b.pcm) | 167406 | 1285
36 | c6dfac2f (combat2a.pcm) | 168691 | 2780

#### content11_7d5437c5 - "Textures"
