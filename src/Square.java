public class Square extends Shape implements Colorable {
    private int side;
    private String color;
    private Boolean filled;
    public Square(){};
    public Square(String color, Boolean filled, int side){
        super(color,filled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public  int getArea(){
        return side*side;
    }

    @Override
    public String howToColor() {
        return "Colored "+getColor()+" four side";
    }
    @Override
    public String toString(){
        return super.toString() + ". This square has side = " + getSide();
    }
}
