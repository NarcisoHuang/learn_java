package _06适配器模式._03创建实现MediaPlayer接口的适配器类;

import _06适配器模式._01接口包.AdvancedMediaPlayer;
import _06适配器模式._01接口包.MediaPlayer;
import _06适配器模式._02实现AdvancedMediaPlayer接口的具体实现类.Mp4Player;
import _06适配器模式._02实现AdvancedMediaPlayer接口的具体实现类.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    /**
     * 注意AdvancedMediaPlayer类是抽象类, 不能实例化.
     * AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
     * 是错误的写法
     */
    AdvancedMediaPlayer advancedMediaPlayer;

    // 构造方法
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();  // 实例化对象
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();  // 实例化对象
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
