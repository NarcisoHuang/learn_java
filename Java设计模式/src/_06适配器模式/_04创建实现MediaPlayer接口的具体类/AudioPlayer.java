package _06适配器模式._04创建实现MediaPlayer接口的具体类;

import _06适配器模式._01接口包.MediaPlayer;
import _06适配器模式._03创建实现MediaPlayer接口的适配器类.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {

        /**
         * MediaPlayer抽象类不能直接实例化.
         */
        MediaAdapter mediaAdapter;

        // 添加支持来播放Mp3文件
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            /**
             * 添加支持vlc和Mp格式的适配器, 用来支持播放这两中种格式的资源
             * 通过MediaAdapter适配器类来自动适配生成合适的类.
             */
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
