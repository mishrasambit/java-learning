class Prog2{
    public static void main(String[] args){
        //Typecasting
        //narrowing or widening
        int a=32768;
        short b=(short)a;//narrowing- explicit typecasting

        //widening
        short x = 32767;
        int y = x;//implicit typcasting widening

        System.out.println("a int ="+a);
        System.out.println("b short ="+b);
        System.out.println("x short ="+x);
        System.out.println("y int ="+y);
    }
}