import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.DecimalFormat;

/**
 * Test class.
 * 
 * @author Administrator
 */
public class Test {
	/**
	 * Instantiates a new test.
	 */
	public Test() {
		System.out.println("Test class instance is create");
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		/* System.out.println("Hello World"); */
		System.out.println("Integer.parseInt('00000012')="
				+ Integer.parseInt("00000012"));
		System.out.println("new DecimalFormat('00000000').format(maxItemCd)="
				+ new DecimalFormat("00000000").format(16.0));
	}

	public static void loadingClass() {
		// Create a File object on the root of the directory containing the
		// class file
		File file = new File("c:\\myclasses\\");

		try {
			// Convert File to a URL
			URL url = file.toURL(); // file:/c:/myclasses/
			URL[] urls = new URL[] { url };

			// Create a new class loader with the directory
			ClassLoader cl = new URLClassLoader(urls);

			// Load in the class; MyClass.class should be located in
			// the directory file:/c:/myclasses/com/mycompany
			Class cls = cl.loadClass("com.mycompany.MyClass");
		} catch (MalformedURLException e) {
		} catch (ClassNotFoundException e) {
		}
	}
}
