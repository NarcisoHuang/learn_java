package _16中介人模式._01创建聊天室类;

import _16中介人模式._02创建用户类.User;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " ["
                + user.getName() + "] : " + message);
    }
}
