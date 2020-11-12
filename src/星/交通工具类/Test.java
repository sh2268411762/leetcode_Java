package 星.交通工具类;

public class Test implements theTrafficTools
{
    public static void main(String[] args)
    {
        AutoMobile truck = new Truck("truck");
        AutoMobile tank = new Truck("truck");
        AutoMobile car = new Truck("truck");
        truck.attack();
        truck.showName();
        tank.attack();
        tank.showName();
        car.attack();
        car.showName();


        Plane airLiner = new AirLiner("airliner");
        Plane fighterPlane = new AirLiner("fighterPlane");
        airLiner.attack();
        airLiner.showName();
        fighterPlane.attack();
        fighterPlane.showName();


        Ship yacht = new Yacht("yacht");
        Ship warShip = new Yacht("warShip");
        yacht.attack();
        yacht.showName();
        warShip.attack();
        warShip.showName();
    }
}
