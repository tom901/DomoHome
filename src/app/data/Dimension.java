/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: engine/Engine.java 2015-03-11 buixuan.
 * Modified 2015/03/26 by :
 * - nicolas.didier.fd@gmail.com
 * - leslie.cha@hotmail.fr
 * - thomas.paraison@me.com
 * ******************************************************/
package app.data;

/**
 * Created by Thomas on 13/03/15.
 *
 * Class setting position, size and radius for objects, rooms and characters
 */
public class Dimension {

    private double x;
    private double y;
    private double width;
    private double height;

    private double radius;

    public  Dimension(double x, double y, double width, double height){
        this.x = x;
        this.y = y ;
        this.width = width;
        this.height = height;
    }

    public  Dimension(double x, double y, double radius){
        this.x = x;
        this.y = y ;
        this.radius = radius;
    }

    public  Dimension(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
