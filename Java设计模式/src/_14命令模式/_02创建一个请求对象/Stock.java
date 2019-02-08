package _14命令模式._02创建一个请求对象;

public class Stock {

    private String name = "Huang";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: " + name +", Quantity: "
                + quantity + "] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: " + name + ", Quantity: "
                + quantity + "] sold");
    }
}
