package _27实体模式._03组合实体包;

import _27实体模式._02粗颗粒对象包.CoarseGrainedObject;

public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return coarseGrainedObject.getData();
    }
}
