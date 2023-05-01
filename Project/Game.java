//Here is the document for my APCS coding project
import processing.core.*;
import java.util.*;


public class Game extends PApplet{

//String gameState;
int current = 0;
int c1 = 180;
int c2 = 180;
int c3 = 180;
int t1 = 0;
int t2 = 0;
int t3 = 0;
int f = 0;

 
  public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
    
        
        Minecraft = createFont("Minecraftia-Regular.ttf", 3);
        Pixel = createFont("04B_30__.TTF", 3);
        
    
        
        scenes = new ArrayList<Scene>(); 
        scenes.add(new Menu(this)); //0
        scenes.add(new Choice(this));
        scenes.add(new Gameover1(this));
        scenes.add(new TripleChoice(this));
        scenes.add(new Test(this));
        scenes.add(new Curious(this)); //5
        scenes.add(new Gameover2(this));
        scenes.add(new noGame(this));
        scenes.add(new Rules(this));
        scenes.add(new Gameover3(this));
        scenes.add(new gameChoiceOne(this)); //10
        scenes.add(new Minigame(this));
        scenes.add(new Gameover4(this));
        scenes.add(new funChoice(this));
        scenes.add(new minigameThanks(this));
        scenes.add(new Gameover5(this)); //15
        scenes.add(new workChoice(this));
        scenes.add(new colorChoice(this));
        scenes.add(new codeExp(this));
        scenes.add(new codeExp2(this));
        scenes.add(new Gameover6(this)); //20
        scenes.add(new Quiz(this));
        scenes.add(new Gameover7(this));
        scenes.add(new gameChoiceTwo(this));
        scenes.add(new miniReturn(this));
        scenes.add(new workChoice2(this)); //25
        scenes.add(new pickFont(this));
        scenes.add(new textChoice(this));
        scenes.add(new End(this));
        scenes.add(new fontMes(this));
        
    }
    
     public void draw()
    {
         
        scenes.get(current).display();
            
    }
    

     public void keyPressed()
    {
        scenes.get(current).handleKeyPressed();
    }
    
    public void mousePressed()
    {
        scenes.get(current).handleMousePressed();
    }
    
    public void changeScene(int n)
    {
        current = n;
        
    }
    
    public void changeColor(int xc1, int xc2, int xc3)
    {
        c1 = xc1;
        c2 = xc2;
        c3 = xc3;
    }
    
    public void changeTC(int xt1, int xt2, int xt3)
    {
        t1 = xt1;
        t2 = xt2;
        t3 = xt3;
    }
    
    public int getColor1()
    {
        return c1;
        
    }
    
    public int getColor2()
    {
        return c2;
        
    }
    
    public int getColor3()
    {
        return c3;
        
    }
    
     public int getTC1()
    {
        return t1;
        
    }
    
    public int getTC2()
    {
        return t2;
        
    }
    
    public int getTC3()
    {
        return t3;
        
    }
    
    public int getF()
    { return f;}
    
    public void changeF(int f1){
        
        f = f1;
    }
    
    public PFont getFont(){
        
        
        if (f == 1){
        return Minecraft;
        }
        
        else if (f == 2){
            return Pixel;
        }
        
        else return null;
        
    }
    
    private ArrayList<Scene> scenes;
    private PFont Minecraft; 
    private PFont Pixel;
    
    public static void main(String[] args)
    {
      
        PApplet.main("Game");
       
    }
}
