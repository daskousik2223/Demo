import java.io.*;


public class ReadDirectory {

	public static void main(String[] args) {

		File fdir = new File("");
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(new File("d:/utilityworkspace/filesize.txt")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
