An archive file consists of an Archive structure which is
immediately followed a concatenation of the (optionally compressed) contents of each file in the archive.

The archive format is used for 3d models (content9_ffffffffe0e19e2c) and sound effects (content10_ffffffffa95e7195).

```
Archive
{
  u2 NumEntries;
  file_entry Files[NumEntries];
}
```

```
file_entry
{
  u4 Hash;
  u3 DecompressedLen;
  u3 CompressedLen;
}
```

```Hash```

The string is first converted to uppercase and then iterated over to compute the hash.
```
for(int i = 0; i < string.length(); i++)
  Hash = Hash*61 + (string.charAt(i) - 32)
```

```DecompressedLen```
```CompressedLen```

These may have the same value if no compression is used.
