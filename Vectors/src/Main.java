public class Main {
    public static void main(String[] args) {

        double[] array = {1, 5, 2, 4, 7, 9};
        double[] array2 = {1, 5, 2, 4, 7, 9};
        double[] array3 = {7, 2, 3, 5, 8, 6};
        int n = array.length;

        Vector vector = new Vector(array);
        Vector vector1 = new Vector(vector);
        Vector vector2 = new Vector(n);
        Vector vector3 = new Vector(n, array);

        Vector vector4 = new Vector(array2);
        Vector vector5 = new Vector(array3);

        System.out.println("vector = " + vector);
        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);
        System.out.println("vector3 = " + vector3);
        System.out.println("vector5 = " + vector5);

        System.out.println("Vector size = " + vector.getSize());
        System.out.println("Adding another vector to a vector = " + vector.add(vector4));
        System.out.println("Subtracting another vector from a vector(vector3-vector5) " + vector3.div(vector5));

        double skalar=3;
        System.out.println("Multiplying a vector by a scalar = "+vector3.multScalar(skalar));
        System.out.println("Vector reverse = "+vector1.getRotation());
        System.out.println("Get lenght vector = "+vector.getLenght());

        System.out.println(vector);
        System.out.println(vector.getElement(2));
        System.out.println(vector.setElement(2,10));
        System.out.println(vector);

        System.out.println(vector+"  "+vector1+"  "+vector2+"  "+vector3+"  "+vector4+"  "+vector5);
        System.out.println("Equals = " + vector.equals(vector1));
        System.out.println("Static additional of vectors = "+Vector.add(vector3,vector4));
        System.out.println("Static substracting of vectors = "+Vector.div(vector,vector5));
        System.out.println("Scalar multiplied of vectors = "+Vector.mult(vector3,vector5));


    }
}
