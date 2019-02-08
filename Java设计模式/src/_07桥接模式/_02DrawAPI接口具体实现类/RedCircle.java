package _07桥接模式._02DrawAPI接口具体实现类;

import _07桥接模式._01接口包.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
