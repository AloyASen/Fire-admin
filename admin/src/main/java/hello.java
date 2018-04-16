import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.net.URISyntaxException;
import java.net.URL;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
class Hello{
    /**
     * @throws FileNotFoundException
     * @throws URISyntaxException
     * @throws IOException
	 */
    FileInputStream serviceAccount;
	public Hello() throws URISyntaxException, IOException {
        URL resource = getClass().getClassLoader().getResource("iam.json");
        File file = new File(resource.toURI());
        serviceAccount = new FileInputStream(file);
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://test-lab-f7e14.firebaseio.com")
            .build();
        FirebaseApp.initializeApp(options);
    }


	public static void main(String[] args) throws IOException{
        
       
		
        
    }
}