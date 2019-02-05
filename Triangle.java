import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
 public class Triangle implements SmithShape{
 private int xCord;
 private int yCord;
 private int shapeWidth;
 private int shapeHeight;
 private double shapeAngle;

public Triangle(int x, int y, int width, int height, double angle){
xCord = x;
yCord = y;
shapeWidth = width;
shapeHeight = height;
shapeAngle = angle;
}

public int getY(){
  return yCord;
}
public int getX(){
  return xCord;
}
public int getWidth(){
  return shapeWidth;
}
public int getHeight(){
  return shapeHeight;
}
public double getArea(){
  double area = (shapeWidth * shapeHeight) / 2;
  return area;
}
public double getAngle(){
  return shapeAngle;
}
public Rectangle2D toSquare(){
  double rectSide = Math.sqrt(this.getArea());
  Rectangle2D r = new Rectangle2D.Double(xCord, yCord, rectSide, rectSide);
  return r;
}
@Override
public String toString(){
  String triString = "Width: " + shapeWidth + "\nHeight: " + shapeHeight + "\nAngle: " + shapeAngle;
  return triString;
}
}
/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
