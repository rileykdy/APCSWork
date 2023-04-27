//7
//There is no game

import processing.core.*;
import java.util.*;



public class noGame implements Scene
{
    public noGame(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(p.getColor1(), p.getColor2(), p.getColor3());
      //p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(0);
      p.textSize(50);
      p.text("Well you didn't think you'd get interesting graphics" , p.width/2, 130);
      p.text("just for opening a game, did you? If you want this", p.width/2, 185);
      p.text(" game to stop looking like it was made in five minutes, ", p.width/2, 240);
      p.text("you'll have to spend at least five minutes on it.", p.width/2, 295);
      p.textSize(25);
      p.text("Press shift to continue.", p.width/2, 700);
    }

    public void handleKeyPressed()
    {
if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(8);
       
      }
      }
      
      public void handleMousePressed(){
    
    }
    

    private Game p;
}
