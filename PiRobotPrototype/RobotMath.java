/**
 * Write a description of class RobotMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class RobotMath  
{
 
     public static double getSlope(int x1, int x2, int y1, int y2) {
  
         return (y2 - y1) / (x2 - x1); 
   }
   public static double getIntercept(double m, int x, int y){
       // y = mx + b, solve vor and return b
       return y - (m*x);
   }
   /**
    * Takes a given point (the current location of a robot and determines if
    * it is on the inside, or outside of a boundary defined by corner points
    * of a grid.
    */
   public static boolean isInbounds  (double x1,double y1, 
                               double x2,double y2,
                               double x3,double y3,
                               double x4,double y4,
                               double x, double y){
    // for initial simplicity we can require that x1=x3, y1=y3, x2=x4 & y2=y4
    // and that the boundary is rectangular. Two refinements would be to 
    // allow for rectangular grids not aligned with underlying grid. A second
    // refinement would be to calculate which side of the defining lines
    // a robot point were on.
    if ((x>x1) && (x<x2) && (y>y1)&&(y<y3))
      return true;
    return false;
                                                       
   }
   
  /**
   Here is the equation of a line in the 2D plane: Y=MX+B
   where M, the slope, is either a positive or a negative value. 
   Because of this, you know the "slant" of the line as it goes from 
   left to right.

For an arbitrary point not lying on the line, plug its X
value into your line equation. It will yield a corresponding Y value. 
This is the Y value of a point that lies on the line. Let's call that 
YL. Let's call the Y value of your arbitrary point YP

. Take the difference between the two:

      YL−YP=ΔY

      If ΔY

   is positive and M is positive, your point lies below and to the right 
   of the line.

    If ΔY
    is positive and M is negative, your point lies below and to the left 
    of the line.
    If ΔY
    is negative and M is positive, your point lies above and to the left 
    of the line.
    If ΔY is negative and M is negative, your point lies above and to the 
    right of the line.
**/

}
