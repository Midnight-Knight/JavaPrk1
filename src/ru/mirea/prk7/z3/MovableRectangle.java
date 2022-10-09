package ru.mirea.prk7.z3;

public class MovableRectangle implements Movable
{
    private MovablePoint A;
    private MovablePoint B;
    private MovablePoint C;
    private MovablePoint D;
    private MovablePoint center;

    public MovableRectangle(int x, int y,int width,int height,int xSpeed, int ySpeed)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        A = new MovablePoint((x-(width/2)),(y+(height/2)),xSpeed,ySpeed);
        B = new MovablePoint((x+(width/2)),(y+(height/2)),xSpeed,ySpeed);
        C = new MovablePoint((x+(width/2)),(y-(height/2)),xSpeed,ySpeed);
        D = new MovablePoint((x-(width/2)),(y-(height/2)),xSpeed,ySpeed);
    }

    public boolean SpeedTest(MovableRectangle x)
    {
        if ((center.getxSpeed() == x.getCenter().getxSpeed()) && (center.getySpeed() == x.getCenter().getySpeed()))
        {
            return true;
        }
        return false;

    }

    public MovablePoint getCenter()
    {
        return center;
    }

    @Override
    public String toString() {
        return "A: "+A.toString()+"\nB: "+B.toString()+"\nC: "+C.toString()+"\nD: "+D.toString()+"\nCenter: "+center.toString()+"\n";
    }

    @Override
    public void moveUp() {
        center.moveUp();
        A.moveUp();
        B.moveUp();
        C.moveUp();
        D.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
        A.moveDown();
        B.moveDown();
        C.moveDown();
        D.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
        A.moveLeft();
        B.moveLeft();
        C.moveLeft();
        D.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
        A.moveRight();
        B.moveRight();
        C.moveRight();
        D.moveRight();
    }
}
