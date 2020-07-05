package com.example.leedongjun.a3_7phonecell;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class say extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say);

        editText1 = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.button1:
                String message = editText1.getText().toString().trim();

                SmsManager sms = SmsManager.getDefault();
                Toast.makeText(this, "건의사항이 전송완료되었습니다.",
                        Toast.LENGTH_SHORT).show();
                sms.sendTextMessage("01046156192", null, "-건의사항-"+message,null,null);
                break;
        }
    }
}
