//27
//Pick text color


import processing.core.*;
import java.util.*;



public class textChoice implements Scene
{
    public textChoice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
      p.background(p.getColor1(), p.getColor2(), p.getColor3());
      
      p.stroke(255);
      
      p.fill(32, 87, 48);
      p.rect(p.width/4 - 105, p.height*3/4 -40, 210, 50);
      
      p.fill(0, 0, 0);
      p.rect(p.width/2 - 105, p.height*3/4 -40, 210, 50);
      
      p.fill(29, 49, 115);
      p.rect(p.width*3/4 - 105, p.height*3/4 -40, 210, 50);

      p.fill(0);
      p.textSize(60);
      p.text("Pick a new text color!", p.width/2, 200);
      p.textSize(30);
      p.text("Press shift to continue once you are satisfied with your choice.", p.width/2, 800);

    }
    
    

    public void handleKeyPressed()
    {
    if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(28);
       
      }

        }
        
        public void handleMousePressed(){
    //green
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 105 && p.mouseX < p.width/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        p.changeTC(32, 87, 48);
        
        
        }
      
      //black
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 105 && p.mouseX < p.width*3/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
         p.changeTC(0, 0, 0);
        
        }
        
    
      //blue
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 105 && p.mouseX < p.width/2 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
         p.changeTC(29, 49, 115);
        
        }
    }
    
        
    private Game p;
   
}
