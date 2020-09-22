//You can also call this creator(probably better too) but its ur call


public class ConcretePetrolVehicleFactory  implements VehicleFactory{

    @Override
    public Vehicle returnConcreteVehicle(String type, String colour, int seats) {
        Vehicle  vehicle;

        switch (type){
            case "Car":
                vehicle = new Car(seats,colour);
                return vehicle;
            default:
                return  null;
        }
    }

    @Override
    public Vehicle returnConcreteVehicle(String type, String colour) {
        Vehicle  vehicle;

        switch (type){
            case "Ute":
                 vehicle = new Ute(colour);
                 return vehicle;
            case "Motorbike":
                vehicle = new Motorbike(colour);
                return vehicle;
            default:
                return  null;
        }
    }

}
