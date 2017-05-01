import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;
public class Recurrent {
	//reading in image
	int [][] pixelArray;
	int width;
	int height;
	public static void main(String [] args){
		BufferedImage img = null;
		//Scanner scanner = new Scanner(System.in);
		String fileName = args[0];//scanner.nextLine();
		File inputFile = new File(fileName);
		try {
			img = ImageIO.read(inputFile);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		int width = img.getWidth();
		int height = img.getHeight();
		int[][] pixelArray = convertTo2DGetRGB(img);
		for(int i = 0; i<height; i++){
			for(int j = 0; j<width; j++){
				System.out.print(pixelArray[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println("pielArray length " + pixelArray.length);
	}
	 private static int[][] convertTo2DGetRGB(BufferedImage image) {
	      int width = image.getWidth();
	      int height = image.getHeight();
	      int[][] pixelArray = new int[height][width];

	      for (int row = 0; row < height; row++) {
	         for (int col = 0; col < width; col++) {
	            pixelArray[row][col] = image.getRGB(col, row);
	         }
	      }

	      return pixelArray;
	   }
}
