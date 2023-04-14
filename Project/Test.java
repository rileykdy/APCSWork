//4

import processing.core.*;
import java.util.*;



public class Test implements Scene
{
    public Test(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(180);
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(100);
      p.text("Under Construction", p.width/2, 130);
      p.textSize(25);
      p.text("Press shift to restart.", p.width/2, 275);
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
       
      }
      }
      
      public void handleMousePressed(){
    
    }
    

    private Game p;
}

