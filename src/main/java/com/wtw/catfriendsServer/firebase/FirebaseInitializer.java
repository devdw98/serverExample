package com.wtw.catfriendsServer.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;


@Service
@NoArgsConstructor
public class FirebaseInitializer {
    private final Logger log = LoggerFactory.getLogger(FirebaseInitializer.class);
    @Value("${firebase.accountFile}")
    private String accountFile;

    @PostConstruct
    public void initialize(){
        try{
            FileInputStream serviceAccount = new FileInputStream(accountFile);//"service-account.json"
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
            if(FirebaseApp.getApps().isEmpty()){
                FirebaseApp.initializeApp(options);
                log.info("Firebase application has been installed.");
            }

        }catch (IOException e){
            log.error(e.getMessage());
        }
    }

    public static void main(String [] args) throws FirebaseAuthException {
        System.out.println("Hello Auth");
        FirebaseInitializer initializer = new FirebaseInitializer();
        initializer.initialize();

        String uid = "some-uid";
        UserRecord userRecord = FirebaseAuth.getInstance().getUser(uid);
// See the UserRecord reference doc for the contents of userRecord.
        System.out.println("Successfully fetched user data: " + userRecord.getUid());

//        createUserWithUid();
//        getUserById("some-uid");
//        getUserByEmail("user@example.com");
//        getUserByPhoneNumber("+11234567890");
//        updateUser("some-uid");
//        listAllUsers();
//        deleteUser("some-uid");

    }
}
