package _04建造者模式._06创建一个MealBuilder类;

import _04建造者模式._04扩建_03创建的抽象类的具体类._01Burger具体类.ChickenBurger;
import _04建造者模式._04扩建_03创建的抽象类的具体类._01Burger具体类.VegBurger;
import _04建造者模式._04扩建_03创建的抽象类的具体类._02ColdDrink具体类.Coke;
import _04建造者模式._04扩建_03创建的抽象类的具体类._02ColdDrink具体类.Pepsi;
import _04建造者模式._05创建具有Item对象的Meal类.Meal;

/**
 * 负责创建Meal类
 */
public class MealBuilder {
    public Meal prepareVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
