package _04建造者模式._07创建测试类来使用MealBuider类;

import _04建造者模式._05创建具有Item对象的Meal类.Meal;
import _04建造者模式._06创建一个MealBuilder类.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();

        Meal vegMeal = mb.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mb.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
