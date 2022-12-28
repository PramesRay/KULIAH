public class Area extends Shape{
    @Override
    public float rectangleArea(float p, float l) {
        return (p*l);
    }

    @Override
    public float squareArea(float s) {
        return (s*s);
    }

    @Override
    public float circleArea(float r) {
        float pi = 22/7;
        return (pi*r*r);
    }
}
