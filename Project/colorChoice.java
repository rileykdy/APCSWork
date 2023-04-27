//17


import processing.core.*;
import java.util.*;



public class colorChoice implements Scene
{
    public colorChoice(Game p)
    {
        this.p = p;
    }

    public void display()
    {
      p.background(p.getColor1(), p.getColor2(), p.getColor3());
      
      p.stroke(255);
      
      p.fill(105, 150, 117);
      p.rect(p.width/4 - 105, p.height*3/4 -40, 210, 50);
      
      p.fill(137, 168, 201);
      p.rect(p.width/2 - 105, p.height*3/4 -40, 210, 50);
      
      p.fill(187, 153, 201);
      p.rect(p.width*3/4 - 105, p.height*3/4 -40, 210, 50);

      p.fill(0);
      p.textSize(60);
      p.text("Pick a new background color!", p.width/2, 200);
      p.textSize(30);
      p.text("Press shift to continue once you are satisfied with your choice.", p.width/2, 800);

    }
    
    

    public void handleKeyPressed()
    {
    if(p.keyCode == PApplet.SHIFT){
        p.key = PApplet.ENTER;
        p.changeScene(18);
       
      }

        }
        
        public void handleMousePressed(){
    //green
    if(p.mousePressed==true
      && p.mouseX > p.width/4 - 105 && p.mouseX < p.width/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        p.changeColor(105, 150, 117);
        
        
        }
      
      //purple
      else if(p.mousePressed==true
      && p.mouseX > p.width*3/4 - 105 && p.mouseX < p.width*3/4 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
         p.changeColor(187, 153, 201);
        
        }
        
    
      //blue
      else if(p.mousePressed==true
      && p.mouseX > p.width/2 - 105 && p.mouseX < p.width/2 + 105
      && p.mouseY > p.height*3/4 -40 && p.mouseY < p.height*3/4 +40){
        
        
         p.changeColor(137, 168, 201);
        
        }
    }
    
        
    private Game p;
   
}


