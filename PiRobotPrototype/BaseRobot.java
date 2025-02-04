import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseRobot extends Actor
{
    
    // static vars across all instances of BaseRobots that define a bounding
    // grid, and whether or not the corners can be set.
    static double x1, x2, y1, y2, x3,y3,x4,y4;
    static boolean canSetGrid;
    
    public void act()
    {
           if (Greenfoot.isKeyDown("l")){
               if(canSetGrid ) 
                   canSetGrid=false;
               else
                 canSetGrid=true;
               }
        if (Greenfoot.isKeyDown("m")){
            String c=Greenfoot.ask("which corner (1 upper left, 4 lower right)");
            setcorner(Integer. valueOf(c));
        }
         
        // Add your action code here.
        if (!RobotMath.isInbounds(x1,y1,x2,y2,x3,y3,x4,y4,(double)this.getX(),(double)this.getY())){
            String ans=Greenfoot.ask("check to see if inbounds?");
         
         turn(180);
        }
        if (canMove())
           move(1);
        else {
           turn(180);
           move(1);
        }
           
        if (Greenfoot.getRandomNumber(100)>98)
           turnRandom();
        
    }
    
  public boolean canMove(){
        // check to see if at a wall. If Greenfoot, this would be a difference
        // between max or min x (or y) and robot x (or y).
        // Other tests would be to see if an object (including other robots) are
        // in the way
        if(!getObjectsInRange(10, BaseRobot.class).isEmpty()) {
            turn(Greenfoot.getRandomNumber(90));
            move(5);
            return false;
        
        };
        if (getX()==0 ||  getX()==getWorld().getWidth())
          return false;
        if (getY()==0 ||  getY()==getWorld().getHeight())
          return false;
        return true;
    }
    private void turnRandom(){
        int turnAngle=Greenfoot.getRandomNumber(360);
        turn(turnAngle);
    
        
    }
    
    public void setCanSetGrid(boolean v){
        canSetGrid=v;
    }
    
    public void setcorner(int cornerNum){
        if (canSetGrid){
        if (cornerNum==1) {
            x1=(double)getX();
            y1=(double)getY();
        }
         if (cornerNum==2) {
            x2=(double)getX();
            y2=(double)getY();
        }
                
         if (cornerNum==3) {
            x3=(double)getX();
            y3=(double)getY();
        }
        if (cornerNum==4) {
            x4=(double)getX();
            y4=(double)getY();
        }
    }
            
            
        }
        
    }

