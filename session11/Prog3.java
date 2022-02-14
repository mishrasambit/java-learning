class Prog3{
    public static void main(String[] args){
        //blocks {}
        int a = 1;
        {
            int x = 10;
            System.out.println("block1");
            System.out.println("x="+x);
        }
        {
            int x = 20;
            System.out.println("block2");
            System.out.println("x="+x);
        }
        {
            int x = 30;
            System.out.println("block3");
            System.out.println("x="+x);
        }
    }
}