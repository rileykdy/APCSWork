import processing.core.*;

public class HPBall
{
    public HPBall(PApplet p, PVector position, PVector velocity)
    {
        this.p = p;
        this.position = position;
        this.velocity = velocity;

    }

    public void display()
    {

        p.ellipse(position.x, position.y, 50, 50);

        position.add(velocity);
        if (position.x<25 || position.x>p.width-25)
            velocity.x *= -1;

        if (position.y<25 || position.y>p.height-25)
            velocity.y *= -1;
    }
private PApplet p;
private PVector position;
private PVector velocity;
}
