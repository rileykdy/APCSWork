//2

import processing.core.*;
import java.util.*;
  


public class Gameover implements Scene
{
    public Gameover(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(180);
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 200);
      p.textSize(40);
      p.text("Why did you do that??", p.width/2, 275);
      p.textSize(15);
      p.text("Press shift to restart.", p.width/2, 475);
      
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

