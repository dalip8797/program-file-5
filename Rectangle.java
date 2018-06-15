/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

public class Rectangle {
    double length;
    double  width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    void calculateArea()
    {
        System.out.println("Area is"+length*width);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.calculateArea();
        // TODO code application logic here
    }
    
}
