package com.ms.directX;

public class DirectSoundBuffer {

    public DirectSoundBuffer() {
    }

    public void stop() {
        System.out.println("DirectSoundBuffer.stop");
    }

    public void play(int i) {
        System.out.println("DirectSoundBuffer.play");
    }

    public void writeBuffer(int i, int j, byte[] b, int k) {
        System.out.println("DirectSoundBuffer.writeBuffer");
    }

    public int getCurrentPosition(DSCursors dsCursors) {
        System.out.println("DirectSoundBuffer.getCurrentPosition");
        return 0;
    }
}
