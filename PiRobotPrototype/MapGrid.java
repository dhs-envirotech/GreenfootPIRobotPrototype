/**
 * Write a description of class MapGrid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
interface MapGrid  
{
    // instance variables - replace the example below with your own
 

// These setters need to mark the corners of an area that define where a robot
// can navigate.  The variables themselves need to be static, so that one copy
// is shared across all robots.  In an actual (not model) implementation the
// values would be long and lat coordinates. Since the variables will be static,
// getters may not be required, but will keep them for now.   In the model
// version the variables will just represent the x, y positions of the various
// points.  
   int setX1();
   int setX2();  
   int setY1();
   int setY2(); 
   
   int getX1();
   int getX2();  
   int getY1();
   int getY2(); 
   
   boolean inBounds();
   boolean atLeftEdge();
   boolean atRightEdge();
   boolean atTopEdge();
   boolean atBottomEdge();
   
   
}
