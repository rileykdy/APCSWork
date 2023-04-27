//28
//THE END

import processing.core.*;
import java.util.*;
  


public class End implements Scene
{
    public End(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      {p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    
    else;
    }
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(150);
      p.text("The End!", p.width/2, 150);
      p.textSize(40);
      p.text("Please feel free to continue changing the graphics", p.width/2, 300);
      p.text("and exploring alternate choice paths.", p.width/2, 350);
      p.textSize(15);
      p.text("Press shift to restart.", p.width/2, 500);
      
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

