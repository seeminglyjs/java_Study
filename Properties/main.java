package Properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class main {

	public static void main(String[] args) throws Exception {
		Properties pr = new Properties();
		
		String path = main.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "UTF-8");
		pr.load(new FileReader(path));
		
		String driver = pr.getProperty("driver");
		String url = pr.getProperty("url");
		
		System.out.println(driver + " / " + url);
	}

}
