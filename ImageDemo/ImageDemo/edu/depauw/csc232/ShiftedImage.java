package edu.depauw.csc232;

import java.awt.Color;

/**
 * Modifies an Image to be shifted by given dx and dy.
 */
public final class ShiftedImage implements Image {
   /**
    * Construct an Image based on the given one, but shift it dx and dy 
    * from the center
    * 
    * @param image The original image to be shifted
    * @param dx    the distance for the x-coordinates
    * @param dy    the distance for the y-coordinates
    */
   public ShiftedImage(Image image, double dx, double dy) {
      this.image = image;
      this.dy = dy;
      this.dx = dx;
   }

   @Override
   public Color colorAt(double x, double y) {
      // Convert a request for the color at a shifted position into a
      // request for the corresponding color in the original Image.
      return image.colorAt(x - dx, y - dy);
   }

   private final Image image;
   private final double dx;
   private final double dy;
}