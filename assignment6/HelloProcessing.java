import processing.core.*;
import java.util.*;


public class HelloProcessing extends PApplet{

public void settings(){
  size(800, 800);
}

public void setup(){
  hpballs = new ArrayList<HPBall>();
  createHPBall();

}

public void createHPBall(){

  PVector position = new PVector(width/2, height/2);
  PVector velocity = new PVector(10, 20);

  HPBall ball = new HPBall(this, position, velocity);
  hpballs.add(ball);
}

public void draw(){
  background(0);
  fill(random(256), random(256), random(256));
  for(HPBall ball : hpballs)
  ball.display();

}

public static void main(String[] args){
  PApplet.main("HelloProcessing");
}

private ArrayList<HPBall> hpballs;

}
