package praktikum.devlops.project_pam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected  void login(View v){
        Intent i=new Intent(MainActivity.this,login.class);
        startActivity(i);
        finish();
    }
}
