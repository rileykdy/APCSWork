//11
//MINIGAME ONE

import processing.core.*;
import java.util.*;



public class Minigame implements Scene
{
    public Minigame(Game p)
    {
        this.p = p;
        this.position = new PVector(200, 200);
        this.velocity = new PVector(8, 8);
        
    }

    public void display()
    {
      p.fill(0);
      p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.textSize(45);
      p.text("Click on the ball to win.", p.width/2, 200);
      
      position.x = position.x + velocity.x;
      position.y = position.y + velocity.y;
      
      p.fill(200, 0, 0);
      if(position.x > p.width - 50 || position.x < 50)
      velocity.x = -velocity.x; 
      if(position.y > p.height - 50 || position.y < 50)
      velocity.y = -velocity.y; 
      p.ellipse(position.x, position.y, 50, 50);
      
    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
        
    //if hit
    if(p.mousePressed==true
      && p.dist(p.mouseX, p.mouseY, position.x, position.y) < 50.0 
      ){
        
        
        p.changeScene(13);
        
        }
      
      //if miss
      else if(p.mousePressed==true
      && p.dist(p.mouseX, p.mouseY, position.x, position.y) > 50.0 
      ){
        
        
        p.changeScene(12);
        
        }
    }
    
        
    private Game p;
    private PVector position;
    private PVector velocity;
   
}
