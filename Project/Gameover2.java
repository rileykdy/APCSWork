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
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(0);
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 150);
      p.textSize(45);
      p.text("Curiosity is rewarded. Don't be complacent in your confusion!", p.width/2, 300);
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

