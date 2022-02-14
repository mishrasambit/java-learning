class Prog4{
    public static void main(String[] args){
        String[] companies = {"Apple", "Tesla", "Facebook", "Amazon"};
        //for(int i=0; i<companies.length;i++)
        //    System.out.println(companies[i]);

        // String company="";
        // for(int i=0; i<companies.length;i++){
        //     company = companies[i];
        //     System.out.println(company);
        // }

        for(String company : companies){
           System.out.println(company); 
        }
    }
}