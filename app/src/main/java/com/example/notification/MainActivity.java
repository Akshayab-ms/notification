package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void expandableTextNotification(View view){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,Utils.CHANNEL_ID);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("expandable notification text")
                .setContentText("loree ipsum")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("gcdyuuuuhwhdckjdhwcjkwhdkwhdkjwhdhwdkhwdhjhiglilobhkhdkhwdhwkdhkewhhhchxcjh jbhxwbhhhdhj hswxdhwhebhjhdhdi hdhihnjwdudh")
                        );

        NotificationManagerCompat notificationManagerCompat =NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(Utils.NOTI_ID,builder.build());

    }

    public void expandableImageNotification(View view) {
        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.download);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, Utils.CHANNEL_ID);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("expandable notification image")
                .setContentText("content")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setLargeIcon(image)
                .setStyle(new NotificationCompat.BigPictureStyle()
                        .bigPicture(image)
                        .bigLargeIcon(null));

        NotificationManagerCompat notificationManagerCompat =NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(Utils.NOTI_ID,builder.build());





    }
}