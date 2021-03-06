package emanuelkrowegoran.gmail.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;



import java.util.Timer;
import java.util.TimerTask;

import emanuelkrowegoran.gmail.com.Login.HomeActivity;
import emanuelkrowegoran.gmail.com.Login.Login;
import emanuelkrowegoran.gmail.com.Login.MainActivity;

public class Splashscreen extends MainActivity {

    LinearLayout l1,l2;
    Animation uptodown,downtoup;


    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context;
        context = this;
        init();
        setContentView(R.layout.activity_splashscreen);

        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);


        // 5 seconds pause on splash page
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(isLoggedIn()){
                    //Redirect to home page
                    Intent intent=new Intent(context,  HomeActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    //Redirect to Login Page
                    Intent intent = new Intent(context, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },3000);

    }
}


