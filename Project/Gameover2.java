//6
//Curiosity is rewarded

import processing.core.*;
import java.util.*;
  


public class Gameover2 implements Scene
{
    public Gameover2(Game p)
    {
        this.p = p;
    }

    public void display()
    {p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    else;
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 150);
      p.textSize(45);
      p.text("Curiosity is rewarded.", p.width/2, 300);
      p.text("Don't be complacent in your confusion!", p.width/2, 350);
      p.textSize(15);
      p.text("Press shift to restart or tab to return to the last choice", p.width/2, 500);
      
    }

    public void handleKeyPressed()
    {
//restart
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
//return to choice  
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(5);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

