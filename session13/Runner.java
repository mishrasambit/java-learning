class Runner{
    public static void main(String[] args){
        Car wagonr = new Car();
        wagonr.getCarName();
        wagonr.getOdometer();
        wagonr.getMilaage();
        wagonr.getFuel();        
        int distanceResult = wagonr.distanceCanBeCovered();
        System.out.println("Runner distance can be covered:"+distanceResult);
        //wagonr.distanceCanBeCovered();
        
        // wagonr.setCarsDetails(1,2,"baleno",3);
        // wagonr.getCarName();
        // wagonr.getOdometer();
        // wagonr.getMilaage();
        // wagonr.getFuel();

        //wagonr.getOdometer();
        wagonr.runCar(10);
        wagonr.getFuel();
        wagonr.getOdometer();
        distanceResult = wagonr.distanceCanBeCovered();
        System.out.println("Runner distance can be covered:"+distanceResult);
        
    }
}