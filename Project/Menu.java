//0

import processing.core.*;
import java.util.*;



public class Menu implements Scene
{
    
    public Menu(Game p)
    {
        this.p = p;
        /*
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        */
    }

    public void display()
    {
    //p.textFont(titleFont);
    p.background(p.getColor1(), p.getColor2(), p.getColor3());
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

    

