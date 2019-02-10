package _27实体模式._02粗颗粒对象包;

import _27实体模式._01依赖对象包.DependentObject1;
import _27实体模式._01依赖对象包.DependentObject2;

public class CoarseGrainedObject {
    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();

    public void setData(String data1, String data2) {
        dependentObject1.setData(data1);
        dependentObject2.setData(data2);
    }

    public String[] getData() {
        return new String[] {dependentObject1.getData(), dependentObject2.getData()};
    }
}
