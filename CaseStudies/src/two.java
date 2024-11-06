class Vector {
    private double x,y,z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public void display() {
        System.out.println("Vector: (" + x + ", " + y + ", " + z + ")");
    }
}

class two {
    public static void main(String[] args) {
        Vector v1 = new Vector(6.0, 2.0, 9.0);
        Vector v2 = new Vector(4.0, 8.0, 6.0);

        v1.display();
        v2.display();

        Vector v3 = v1.add(v2);
        v3.display();
        System.out.println("Magnitude of v3: " + v3.magnitude());
    }
}
