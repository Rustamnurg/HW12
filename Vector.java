public class Vector{
    public double x, y ,z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void sum(Vector vector){
        x+= vector.x;
        y+= vector.y;
        z+= vector.z;
    }
    public void multiplication(double k){
        x*= k;
        y*= k;
        z*= k;
    }

    public double getScalarProduct(Vector vector){
        return this.x * vector.x + this.x * vector.x + this.z * vector.z;
    }

    public double getModuleVector(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void printMultiplication(double k){
        System.out.print("(" + x + ", " + y + ", " + z + ") * " + k + " = (");
        x*= k;
        y*= k;
        z*= k;
        System.out.println(x + ", " + y + ", " + z + ")");
    }

    public void printScalarProduct(Vector vector){
        System.out.println(getScalarProduct(vector));
    }

    public String toString()
    {
        return "Vector " + Double.toString(x) + " " + Double.toString(y) + " " + Double.toString(z);
    }
}

