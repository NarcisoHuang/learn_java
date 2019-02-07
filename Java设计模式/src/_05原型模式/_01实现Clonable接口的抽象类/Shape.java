package _05原型模式._01实现Clonable接口的抽象类;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public abstract void draw();

    /**
     * 设置id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 设置type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 输出type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 输出id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 创建克隆对象
     * @return
     */
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
