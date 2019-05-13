package praktikum.devlops.project_pam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import praktikum.devlops.project_pam.Register.Register;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    private void register(View v){
        Intent i=new Intent(login.this, Register.class);
        startActivity(i);
        finish();
    }
}
