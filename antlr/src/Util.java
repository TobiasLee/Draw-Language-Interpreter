/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public  class Util {

    public  static Double calcCoordX(double x, double y, double originX,double scaleX,
                                       double rotAngle) {
        x *= scaleX;
        x = x * Math.cos(rotAngle) + y * Math.sin(rotAngle);
        x += originX;
        return x;
    }
    public  static Double calcCoordY(double x, double y, double originY, double scaleY,
                                      double rotAngle) {
        y *= scaleY;
        y = y * Math.cos(rotAngle) - x * Math.sin(rotAngle);
        y += originY;
        y = 600 - y ; // flip back
        return y;
    }

}
