package practicenumber4;

    public abstract class Circle extends Shape{
        protected double radius;

        public Circle() {

        }
        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }

