package practiceJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("C:\\eclipse-workspace\\SeleniumTraining\\src\\test\\resources\\config.properties");
		Properties p = new Properties();
		try {
			p.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("URL"));
	}

}
