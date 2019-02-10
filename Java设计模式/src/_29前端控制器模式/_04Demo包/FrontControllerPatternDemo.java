package _29前端控制器模式._04Demo包;

import _29前端控制器模式._03前端控制器包.FrontController;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        System.out.println("\n");
        frontController.dispatchRequest("STUDENT");
    }
}
