import java.util.Arrays;

public class Vector {
    private double[] vector;

    // конструктор размерностью n
    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Поменяйте размерность вектора!");
        }
        this.vector = new double[n];
    }

    // конструктор с массивом
    public Vector(double[] vector) {

        this.vector = vector;
    }

    // конструктор копирования
    public Vector(Vector anotherVector) {
        this.vector = anotherVector.vector;
    }

    //заполнение вектора из массива размерностью n
    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new IllegalArgumentException("Поменяйте размерность вектора!");
        } else if (vector.length > n) {
            this.vector = Arrays.copyOf(vector, n);
        } else {
            this.vector = Arrays.copyOf(vector, vector.length);
        }
    }

    // получение размерности вектора
    public int getSize() {
        return vector.length;
    }

    // реализация метода toString
    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    //сложение векторов
    public Vector add(Vector anotherVector) {
        if (anotherVector.vector.length> vector.length){
            vector= Arrays.copyOf(vector,anotherVector.vector.length);

        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] += anotherVector.vector[i];
        }
        return this;
    }

    //вычитание векторов
    public Vector div(Vector anotherVector) {
        if (anotherVector.vector.length> vector.length){
            vector= Arrays.copyOf(vector,anotherVector.vector.length);
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] - anotherVector.vector[i];
        }
        return this;
    }

    // умножение вектора на скаляр
    public Vector multScalar(double scalar) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] * scalar;
        }
        return this;
    }

    //разврот вектора
    public Vector getRotation() {
        return multScalar(-1);
    }

    // длина вектора
    public double getLenght() {
        double res = 0;
        for (double v : vector) {
            res += Math.pow(v, 2);
        }
        return Math.sqrt(res);
    }

    //получение компонента по индексу
    public double getElement(int index) {
        return vector[index];
    }

    //установка компонента по индексу
    public double setElement(int index, double element) {
        return vector[index] = element;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Vector p = (Vector) obj;
            if (p.vector.length != vector.length) {
                return false;
            }
            for (int i = 0; i < vector.length; i++) {
                if (p.vector[i] != vector[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    //переопределения метода hashCode
    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Arrays.hashCode(vector);
        return hash;
    }

    //скалярное произведение векторов
    public double mult(Vector anotherVector) {
        double s = 0;
        int vectorLenght = Math.max(vector.length, anotherVector.vector.length);
        for (int i = 0; i < vectorLenght; i++) {
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }

    public static double mult(Vector a, Vector b) {
        return a.mult(b);
    }

    //статический метод сложения векторов
    public static Vector add(Vector vector1, Vector anotherVector) {

        return vector1.add(anotherVector);
    }

    //статический метод вычетания векторов
    public static Vector div(Vector vector1, Vector anotherVector) {
        return vector1.div(anotherVector);
    }

}
