//3


import processing.core.*;
import java.util.*;



public class TripleChoice implements Scene
{
    public TripleChoice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
      p.background(180);
      p.textAlign(PApplet.CENTER);
      p.fill(255);
      p.stroke(82, 140, 222);
      p.rect(p.width/4 - 105, p.height*3/4 -40, 210, 50);
      p.rect(p.width/2 - 105, p.height*3/4 -40, 210, 50);
      p.rect(p.width*3/4 - 105, p.height*3/4 -40, 210, 50);

      p.fill(0);
      p.textSize(100);
      p.text("Ready to play?", p.width/2, 200);
      p.textSize(50);
      p.text("OPTION 1", p.width/4, p.height*3/4 );
      p.text("OPTION 2", p.width/2, p.height*3/4 );
      p.text("OPTION 3", p.width*3/4, p.height*3/4 );

    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 105 && p.mouseX < p.width/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(4);
        
        }
      
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 105 && p.mouseX < p.width*3/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(4);
        
        }
        
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 105 && p.mouseX < p.width/2 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(4);
        
        }
    }
    
        
    private Game p;
   
}


