public class TrialgeArea {


    public static void main (String[] args){

    float triangle1 = getTriangleArea(15,50);
    float triangle2 = getTriangleArea(255,20);

    System.out.print("Area of Triangle 1: " + triangle1 + "" + " Area of square 2: " + triangle2);


}

    public static float getTriangleArea(float base,float high){
        return (base*high)/2;
    }
}