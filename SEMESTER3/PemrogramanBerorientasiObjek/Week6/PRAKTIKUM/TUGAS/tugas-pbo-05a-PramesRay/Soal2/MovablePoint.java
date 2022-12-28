public class MovablePoint extends AbstractMovablePoint{
    private int x, y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + this.x + ", y = " + this.y;
    }

    @Override
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }
}
