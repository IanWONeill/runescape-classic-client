Note: Work in progress.

The command ids are encoded using an [Isaac cipher](https://en.wikipedia.org/wiki/ISAAC_(cipher)). See: `com.classic.Isaac`.

For larger packets, those with a length (minus first 2-bytes) of 160 or greater, the structure is as follows.

Offset | Description
------ | --------------
| 0 | Length-2
| 2 | Command
| 3 | Payload

For smaller packets the structure is as follows.

Offset | Description
------ | --------------
| 0 | Length-2
| 1 | Last byte of the payload
| 2 | Command
| 3 | Payload (excluding last byte)

The reason why the last byte of the payload is at offset 1 is presumably for performance reasons. The final length of the packet isn't known until the packet is constructed; therefore two bytes are reserved for the length. After the packet is constructed the final byte of the payload is moved to the unused length byte which avoids having to shift the bytes over.

For packets without a payload the structure is as follows.

Offset | Description
------ | --------------
| 0 | Length-2
| 1 | Command
