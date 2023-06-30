public class SquareArea {

    public static void main (String[] args){

        float square1 = getAreaSquare(15,50);
        float square2 = getAreaSquare(255,20);

        System.out.print("Area of square 1: " + square1 + "" + " Area of square 2: " + square2);


    }

    public static float getAreaSquare(float width,float high){
        return width*high;
    }
}
