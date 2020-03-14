package study.demo.demo08;

public class Zi extends Fu {
    //起安全监测的作用
    //子类返回值要小于父类返回值范围
    //子类方法的权限需小于父类方法的权限
    @Override
    public String method() {
        return null;
    }
}
