package com.ms.directX;

public class DirectSound {

    public DirectSound() {
    }

    public void initialize(Object o) {
        System.out.println("DirectSound.initialize");
    }

    public void setCooperativeLevel(java.awt.Component component, int i) {
        System.out.println("DirectSound.setCooperativeLevel");
    }

    public DirectSoundBuffer createSoundBuffer(DSBufferDesc dsBufferDesc, WaveFormatEx waveFormatEx) {
        System.out.println("DirectSound.createSoundBuffer");
        return new DirectSoundBuffer();
    }
}
