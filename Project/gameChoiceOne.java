//10
//Work or minigame 1


import processing.core.*;
import java.util.*;



public class gameChoiceOne implements Scene
{
    public gameChoiceOne(Game p)
    {
        this.p = p;
    }

    public void display()
    {
      p.background(p.getColor1(), p.getColor2(), p.getColor3());
      p.textAlign(PApplet.CENTER);
      p.fill(255);
      p.stroke(13, 168, 42);
      p.rect(p.width/4 - 155, p.height*3/4 -40, 310, 50);
      p.stroke(181, 20, 14);
      p.rect(p.width*3/4 - 155, p.height*3/4 -40, 310, 50);

      p.fill(0);
      p.textSize(45);
      p.text("You've got some time to work on your game, but if you're like some students ", p.width/2, 200);
      p.text("you'd rather procrastinate and do something else. So in it's endless", p.width/2, 255);
      p.text("generosity, the game has provided you with an optional minigame.", p.width/2, 310);
      p.textSize(40);
      p.text("Play a minigame", p.width/4, p.height*3/4 );
      p.text("Work on this game", p.width*3/4, p.height*3/4 );

    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
        
    //if yes
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 155 && p.mouseX < p.width/4 + 155
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(11);
        
        }
      
      //if no
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 155 && p.mouseX < p.width*3/4 + 155
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(16);
        
        }
    }
    
        
    private Game p;
   
}


