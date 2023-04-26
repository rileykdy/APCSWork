//15
//didn't like the minigame

import processing.core.*;
import java.util.*;
  


public class Gameover5 implements Scene
{
    public Gameover5(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 200);
      p.textSize(40);
      p.text("Rude. Just for that you can play through the whole game again.", p.width/2, 300);
      p.text("No more returning to the last choice for you.", p.width/2, 350);
      p.textSize(15);
      p.text("Press shift to restart", p.width/2, 500);
      
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

