//12
//failed minigame ONE

import processing.core.*;
import java.util.*;
  


public class Gameover4 implements Scene
{
    public Gameover4(Game p)
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
      p.textSize(31);
      p.text("I thought the game was too simple. Thanks for proving me wrong.", p.width/2, 300);
      p.text("Now that you chose the minigame, theres no way out except through.", p.width/2, 350);
      p.text("Just keep trying. Or give up and restart so you can choose the work option.", p.width/2, 400);
      p.textSize(15);
      p.text("Press shift to restart or tab to return to the game", p.width/2, 600);
      
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(0);
      }
      
      
if(p.keyCode == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(11);
      }
    }
    
    public void handleMousePressed(){
    
    }
    

    private Game p;
}

