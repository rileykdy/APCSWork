//8
//Rules

import processing.core.*;
import java.util.*;



public class Rules implements Scene
{
    public Rules(Game p)
    {
        this.p = p;
    }

    public void display()
    {
       p.background(p.getColor1(), p.getColor2(), p.getColor3());
     // p.textAlign(PApplet.CENTER, PApplet.CENTER);
      p.fill(0);
      p.textSize(45);
      p.text("Here are the rules of this game, if you could even call it that.", p.width/2, 120);
      p.text("1. Even if you 'restart' and return to the title screen, all the progress that", p.width/2, 185);
      p.text("you've made on the game will remain. The only real way to restart", p.width/2, 240);
      p.text("the game is to press the escape key.", p.width/2, 295);
      p.text("2. There are no dead ends. All choices will lead somewhere, even if", p.width/2, 360);
      p.text("it's somewhere you've already been.", p.width/2, 415);
      p.text("3. The game will send you to a game over screen whenever it wants.", p.width/2, 480);
      p.text("The game also doesn't care if you think that's fair or not.", p.width/2, 535);
      
      p.text("Do you understand the rules?", p.width/2, 640);
        
      
      p.fill(255);
      p.stroke(13, 168, 42);
      p.rect(p.width/4 - 55, 750 -40, 110, 50);
      p.stroke(181, 20, 14);
      p.rect(p.width*3/4 - 55, 750 -40, 110, 50);
      
      
      
      p.textSize(50);
      p.fill(0);
      p.text("YES!", p.width/4, 750 );
      p.text("NO!", p.width*3/4, 750 );
      
      
    }

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
        
    //if yes
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 55 && p.mouseX < p.width/4 + 55
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(10);
        
        }
      
      //if no
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 55 && p.mouseX < p.width*3/4 + 55
      && p.mouseY > 750 -40 && p.mouseY < 750 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(9);
        
        }
    }
    
    

    private Game p;
}
