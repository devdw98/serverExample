package com.wtw.catfriendsServer.firebase;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.WebpushConfig;
import com.google.firebase.messaging.WebpushNotification;
import com.wtw.catfriendsServer.firebase.fcm.PushNotificationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FCMSample {
    private static final Logger log = LoggerFactory.getLogger(FCMSample.class);

    public void send(final PushNotificationRequest req) throws InterruptedException, ExecutionException {
        Message message = Message.builder()
                .setToken(req.getToken())
                .setWebpushConfig(WebpushConfig.builder().putHeader("ttl", "300")
                        .setNotification(new WebpushNotification(req.getTitle(),
                                req.getMessage()))
                        .build())
                .build();

        String response = FirebaseMessaging.getInstance().sendAsync(message).get();
        log.info("Sent message: " + response);
    }
}

