//9
//failed rule understanding

import processing.core.*;
import java.util.*;
  


public class Gameover3 implements Scene
{
    public Gameover3(Game p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    else;
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(150);
      p.text("GAME OVER", p.width/2, 150);
      p.textSize(30);
      p.text("The rules couldn't have possibly been explained more clearly.", p.width/2, 300);
      p.text("If you didn't get that I don't think you can make it through the rest of the game.", p.width/2, 355);
      p.text("I don't know what to tell you, maybe go play pac-man or something?", p.width/2, 410);
      p.textSize(15);
      p.text("Press shift to restart or tab to return to the last choice", p.width/2, 700);
      
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
      
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(8);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

