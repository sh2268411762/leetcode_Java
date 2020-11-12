package 星.交通工具类;

//交通工具抽象类
public interface theTrafficTools
{

}


abstract class AutoMobile implements theTrafficTools
{
    public String name = null;

    public abstract void attack();
    public abstract void showName();
}

abstract class Plane implements theTrafficTools
{
    public String name = null;

    public abstract void attack();
    public abstract void showName();
}

abstract class Ship implements theTrafficTools
{


    public abstract void attack();
    public abstract void showName();
}


//坦克
class Tank extends AutoMobile
{
    public String name = null;

    public Tank(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("坦克具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}
//卡车
class Truck extends AutoMobile
{
    public String name = null;

    public Truck(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("卡车不具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}
//汽车
class Car extends AutoMobile
{
    public String name = null;

    public Car(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("汽车不具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}


//客机
class AirLiner extends Plane
{
    public String name = null;

    public AirLiner(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("客机不具有具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}
//战斗机
class FighterPlane extends Plane
{
    public String name = null;

    public FighterPlane(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("战斗机具有具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}


//游艇
class Yacht extends Ship
{
    public String name = null;

    public Yacht(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("游艇不具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}
//游艇
class WarShip extends Ship
{
    public String name = null;

    public WarShip(String s)
    {
        this.name = s;
    }

    @Override
    public void attack()
    {
        System.out.println("军舰具有攻击功能");
    }

    @Override
    public void showName()
    {
        System.out.println("这是一个" + this.name + "类");
    }
}
