//1


import processing.core.*;
import java.util.*;



public class Choice implements Scene
{
    public Choice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
      p.background(180);
      p.textAlign(PApplet.CENTER);
      p.fill(255);
      p.stroke(13, 168, 42);
      p.rect(p.width/4 - 55, p.height*3/4 -40, 110, 50);
      p.stroke(181, 20, 14);
      p.rect(p.width*3/4 - 55, p.height*3/4 -40, 110, 50);

      p.fill(0);
      p.textSize(100);
      p.text("Ready to play?", p.width/2, 200);
      p.textSize(50);
      p.text("YES!", p.width/4, p.height*3/4 );
      p.text("NO!", p.width*3/4, p.height*3/4 );

    }
    
    

    public void handleKeyPressed()
    {


        }
        
        public void handleMousePressed(){
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 55 && p.mouseX < p.width/4 + 55
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(3);
        
        }
      
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 55 && p.mouseX < p.width*3/4 + 55
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        //p.key = PApplet.ENTER;
        p.changeScene(2);
        
        }
    }
    
        
    private Game p;
   
}


