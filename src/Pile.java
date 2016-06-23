/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author t.bohl
 */
public class Pile {

    private int initialCount;
    private int count;
    private int xPosition;
    private int yPosition;
    private int diameter;
    private Color color;

    public void drawBall(Graphics g) {
        g.setColor(color);
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }

    public Pile(int initialCount) {
        count = initialCount;
    }

    public int getSize() {
        return count;
    }

    public void remove(int count) {
        this.count -= count;
    }

    public void drawPile(Graphics g, int x, int y) {
        
        int originalX = x;
        for (int i = 1; i <= count; i++) {

            g.setColor(Color.RED);
            g.fillOval(x, y, 10, 10);
            
            x = originalX + (i % 10)*12;
            if (i % 10 == 0) {
                y += 12;
                x = originalX;
            }

        }

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setXPosition(int x) {
        xPosition = x;
    }

    public void setYPosition(int y) {
        yPosition = y;
    }

    public void printPile() {

        for (int j = 0; j < count; j++) {
            System.out.print("* ");
            if (j % 5 == 1) {
                System.out.println("");
            }

        }
    }

}
