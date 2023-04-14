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
    p.background(180);
      p.textAlign(PApplet.CENTER);
      p.fill(0);
      p.textSize(200);
      p.text("THE GAME", p.width/2, 200);
      p.textSize(25);
      p.text("Welcome to THE GAME! Press tab to begin.", p.width/2, 275);
      
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

    

