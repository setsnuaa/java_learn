package demo04;

public class Main {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero=new Hero();
        //初始化
        hero.setAge(25);
        hero.setName("盖伦");
        hero.setWeapon(new Weapon("大剑"));//匿名对象
        hero.attack();
    }
}
