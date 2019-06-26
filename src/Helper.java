//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.google.api.core.ApiFuture;
////
////import com.google.api.core.ApiFuture;
////import com.google.auth.oauth2.GoogleCredentials;
////import com.google.firebase.FirebaseApp;
////import com.google.firebase.FirebaseOptions;
////import com.google.firebase.cloud.FirestoreClient;
////import com.google.cloud.firestore.DocumentReference;
////import com.google.cloud.firestore.Firestore;
////import com.google.cloud.firestore.WriteResult;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.Firestore;
//
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.cloud.FirestoreClient;
//import com.google.firestore.v1.WriteResult;

import java.sql.*;



/**
 * Modulo "Helper" responsável por metodos de ajuda a serem utilizados dentro das classes do programa.
 * @author adejairjunior
 *  
 */
public class Helper {
	
//	private Firestore db;
	
    public static void connect() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

            System.out.println("Conexão realizada !!!!");

            Statement statement = connection.createStatement();

            // criando uma tabela
            statement.execute("CREATE TABLE IF NOT EXISTS MEDICOS( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR, SEXO VARCHAR, TITULO VARCHAR, SALA INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS PACIENTES( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR, SEXO VARCHAR, MEDICO VARCHAR)");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
	/**
	 * Metodo responsável por inicializar as functions do firebase e conectar no banco de dados.
	 * @throws IOException
//	 */
//	public void initializeFirebase() {
//		try {
//		FileInputStream contaServico = new FileInputStream("clinica-medica-a18f0-firebase-adminsdk-n9pme-a30b331f9b.json");
//		
//		FirebaseOptions opcoes = new FirebaseOptions.Builder()
//			    .setCredentials(GoogleCredentials.fromStream(contaServico))
//			    .setDatabaseUrl("https://clinica-medica-a18f0.firebaseio.com/")
//			    .build();
//		FirebaseApp.initializeApp(opcoes);
//		System.out.println(">> Conectado!!");
//
//		// ...				
//		// result.get() blocks on response
////		System.out.println("Update time : " + result.get().getUpdateTime());
//		
//		// Setando informacoes da instancia para classe helper
//		this.setDb(FirestoreClient.getFirestore());
//		
//		} catch(Exception e) {
//			System.out.println("Nao foi possivel conectar com a database");
//			System.out.println(e);
//		}
//
//	}
//	
//
//	public void setDb(Firestore db) {
//		this.db = db;
//	}
//
//	public Firestore getDb() {
//		return db;
//	}
}
