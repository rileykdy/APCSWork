//0

import processing.core.*;
import java.util.*;



public class Menu implements Scene
{
    
    public Menu(Game p)
    {
        this.p = p;
        
    }

    public void display()
    {
    
    p.textAlign(PApplet.CENTER);
    if (p.getF() > 0){
    p.textFont(p.getFont(), 1);
    p.textAlign(PApplet.CENTER, PApplet.CENTER);
    
    }
    else;
    p.background(p.getColor1(), p.getColor2(), p.getColor3());
      
      p.fill(p.getTC1(), p.getTC2(), p.getTC3());
      p.textSize(200);
      p.text("THE GAME", p.width/2, 400);
      p.textSize(25);
      p.text("Welcome to THE GAME! Press tab to begin.", p.width/2, 575);
      
    }
    
    

    public void handleKeyPressed()
    {

if(p.key == PApplet.TAB){
        p.key = PApplet.ENTER;
        p.changeScene(1);
        }
        
    }
    
    public void handleMousePressed(){
    
    }
    
    
    private Game p;
   

    }

    

