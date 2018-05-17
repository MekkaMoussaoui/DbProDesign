package dz.youcefmegoura.test.databasepro.Views.Menu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dz.youcefmegoura.test.databasepro.R;
import dz.youcefmegoura.test.databasepro.Views.MainActivity;

/**
 * Created by Youcef Mégoura and Moussaoui Mekka on 05/05/2018.
 */

public class SplashScreen extends AppCompatActivity{
    private static final int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*************** Splash Screen **************/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        },SPLASH_TIME_OUT);
        /******************************************/

    }
}
