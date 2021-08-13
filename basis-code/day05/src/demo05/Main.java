package demo05;

public class Main {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");
        hero.setSkill(new Skill() {//匿名对象+匿名内部类
            @Override
            public void use() {
                System.out.println("万剑齐发");
            }
        });
        hero.attack();
    }
}
