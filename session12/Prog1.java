class Prog1{

    void printCarBrandAndModel(){
        System.out.println("printCarBrandAndModel::brand and model");
    }

    public static void main(String[] args){
        Car baleno = new Car();
        baleno.model="baleno";
        baleno.brand="Suzuki";
        Car i20 = new Car();
        i20.model = "i20";
        i20.brand = "Hyundai";
        int x = 10;
        x =30;
        System.out.println(baleno.brand + " "+baleno.model);
        baleno.brand="Maruti";
        System.out.println(baleno.brand + " "+baleno.model);
        System.out.println(i20.brand+" " +i20.model);

        Prog1 prog1 = new Prog1();
        prog1.printCarBrandAndModel();
    }
}