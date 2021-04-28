package demo02classOverride;

public class Zi extends Fu{
    public Zi(){
        System.out.println("子类构造");
    }
    @Override
    public void method() {
        super.method();
        System.out.println("显示头像");
    }
}
