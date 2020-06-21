package kesava;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {

	public static void main(String[] args) {

		ITesseract image = new Tesseract();
		try {
			String str = image.doOCR(new File("C://Users//kesava//Desktop//kesava.png"));
			System.out.println("Data from string is " + str);

		} catch (TesseractException e) {

			System.out.println("Exception details is " + e.getMessage());

		}

	}

}
