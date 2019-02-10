package _29前端控制器模式._03前端控制器包;

import _29前端控制器模式._02调度类包.Dispatcher;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public  void dispatchRequest(String request) {
        trackRequest(request);

        if (isAuthenticUser() ) {
            dispatcher.dispatch(request);
        }
    }

}
