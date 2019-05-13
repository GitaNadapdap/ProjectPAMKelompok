package praktikum.devlops.project_pam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormPenanaman extends AppCompatActivity {

    EditText durasiPenanaman;
    EditText deskripsiPenanaman;
    EditText alatDanBahanTanam;

    Button btnSaveTanam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_penanaman);

        durasiPenanaman = (EditText) findViewById(R.id.durasiPenanaman);
        deskripsiPenanaman = (EditText) findViewById(R.id.deskripsiPenanaman);
        alatDanBahanTanam = (EditText) findViewById(R.id.alatDanBahanTanam);

        btnSaveTanam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
