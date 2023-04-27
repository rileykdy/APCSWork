//4
//under construction

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
    p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    else;
       p.background(p.getColor1(), p.getColor2(), p.getColor3());
      
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
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

