An ob3 file consists of a single Model structure.

```
Model
{
  u2 VertexCount;
  u2 FaceCount;
  
  s2 VerticesX[VertexCount];
  s2 VerticesY[VertexCount];
  s2 VerticesZ[VertexCount];
  
  u1 FaceIndicesCount[FaceCount];
  s2 FaceFrontTexture[FaceCount];
  s2 FaceBackTexture[FaceCount];
  u8 FaceDiffuseLight[FaceCount];
  
  union
  {
    u1 FaceIndices[FaceCount][];
    u2 FaceIndices[FaceCount][];
  }
}
```

``
FaceIndicesCount
``

Each element in the array corresponds to the number of indices (columns) for a given face in the `FaceIndices` array.

`FaceFrontTexture` `FaceBackTexture`

If the value is positive then the face will be textured otherwise the value represents a color.

The value 32767 (2^15-1) is a special value which should be interpreted as being transparent.
The game stores these values as integers and replaces this value (332767) with the constant *12345678*.

``
FaceIndices
``

The columns of the array specify indices into the vertex arrays.

The type of FaceIndices is dependant on the value of VertexCount.
If the highest vertex index does not fit within a u1 then FaceIndices is of the type u2.
In other words, if VertexCount >= 256 then FaceIndices is of the type u2.
