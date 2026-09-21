class Vehicle2010 extends Vehicle 
{
    Vehicle2010() {
        x = 0;
        y = 0;
    }

    void moveLowerLeft() {
        super.moveDown();
        super.moveLeft();
    }

    void moveUpperRight() {
        super.moveUp();
        super.moveRight();
    }

    void moveLowerRight() {
        super.moveDown();
        super.moveRight();
    }
}