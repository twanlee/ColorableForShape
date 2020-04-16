public class Test {
    public static void main(String[] args) {
        Square[] list = new Square[3];
        list[0] = new Square("Green",true,5);
        list[1] = new Square("Black",true,7);
        list[2] = new Square("Green",true,1);

        for (Square x: list){
            System.out.println(x.howToColor());
            System.out.println(x.toString());
            System.out.println("=======");
        }
    }
}
