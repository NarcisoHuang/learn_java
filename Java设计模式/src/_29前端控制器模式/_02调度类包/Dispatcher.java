package _29前端控制器模式._02调度类包;

import _29前端控制器模式._01视图包.HomeView;
import _29前端控制器模式._01视图包.StudentView;

public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
