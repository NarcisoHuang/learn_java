package _04建造者模式._05创建具有Item对象的Meal类;

import _04建造者模式._01接口包.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();


    /**
     * 像容器对象中添加对象元素
     * @param item 元素对象
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 遍历求的容器中的元素总共的价格
     * @return cost 最终为总价
     */
    public float getCost() {
        float cost = 0.0f;

        for (Item item :
                items) {
            cost += item.price();
        }

        return cost;
    }
    
    public void showItems() {
        for (Item item :
                items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());

        }
    }


}
