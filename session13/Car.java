class Car{
    String name = "wagonr";
    int odometer=30;
    int milage=10;
    int fuel=50;

    public void getCarName(){
        System.out.println("car name:"+name);
    }

    public void getOdometer(){
        System.out.println("odometer:"+odometer);
    }
    public void getMilaage(){
        System.out.println("milage:"+milage);
    }
    public void getFuel(){
        System.out.println("fuel:"+fuel);
    }

    public int distanceCanBeCovered(){
        int distance = milage * fuel;
        return distance;
        //1 lt 10km
        //50lt 10*50
        //System.out.println("distance can be covered:"+distance);
    }

    public void runCar(int kmCovered){
        odometer = odometer + kmCovered;
        //10km with 1lt
        // 1 km with 1/10
        // 10 km with 1/10*10
        fuel = fuel - (kmCovered/milage);

    }

    public void setCarsDetails(int odometerValue, 
                    int milageValue, String carName,
                    int fuelValue){
        name = carName;
        odometer = odometerValue;
        milage = milageValue;
        fuel = fuelValue;
    }
}