import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.internal.Nullable;

import javax.swing.JFrame;

public class Telao {
	
	private String numeroTelao;
	private DocumentReference docRef;
	private Firestore db;
	
	Telao(String sala, String nomeMedico, String nomePaciente) {
		this.db = FirestoreClient.getFirestore();
		this.docRef = db.collection("telao").document("tela_atual");
		
		Map<String, Object> data = new HashMap<>();
		this.desenharTelao(nomePaciente, nomeMedico, sala);
	}

	public String getNumeroTelao() {
		return numeroTelao;
	}


	public void setNumeroTelao(String numeroTelao) {
		this.numeroTelao = numeroTelao;
	}
	
	
	public void desenharTelao(String nomePaciente, String medico, String sala) {
		new TelaoFrame(sala, medico ,nomePaciente);
		
	}

}
