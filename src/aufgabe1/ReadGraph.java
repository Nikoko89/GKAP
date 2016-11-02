package aufgabe1;

import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class ReadGraph extends Application {
	
	private Stage stage;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		FileChooser fc = new FileChooser();
		fc.setTitle("Open Graph");
		File file = fc.showOpenDialog(stage);
		System.out.println(file.getAbsolutePath());
		
	}

}
