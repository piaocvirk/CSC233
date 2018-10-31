package edu.depauw.csc232;

import java.awt.Color;

/**
 * An Image consisting of a filled Square with center at (0.5, 0.5) and
 * a height and width of 1. That is, it will fill the unit square of the Canvas.
 */
public class Square implements Image {
   /**
    * Construct a square Image that fills the unit square with the given color.
    * 
    * @param color the fill color
    */
   public Square(Color color) {
      this.color = color;
   }

   @Override
   public Color colorAt(double x, double y) {
      if (x <= 1.0 && x >= 0.0 && y <= 1.0 && y >= 0.0) {
         return color;
      } else {
         return CLEAR;
      }
   }

   private Color color;
}