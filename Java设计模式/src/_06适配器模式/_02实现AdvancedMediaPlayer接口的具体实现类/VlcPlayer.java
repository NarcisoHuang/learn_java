package _06适配器模式._02实现AdvancedMediaPlayer接口的具体实现类;


import _06适配器模式._01接口包.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么都不做
    }
}
