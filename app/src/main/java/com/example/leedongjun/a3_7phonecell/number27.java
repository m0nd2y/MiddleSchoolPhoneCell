package com.example.leedongjun.a3_7phonecell;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.leedongjun.a3_7phonecell.adapter.phoneAdapter;
import com.example.leedongjun.a3_7phonecell.model.phone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lee Dong Jun on 2017-03-16.
 */
public class number27 extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number27);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        permissionCheck();
    }

    private void permissionCheck() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CALL_PHONE)) {
            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CALL_PHONE}, 100);
            }
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.button1:
                Intent intent1 = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:01076422566"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                Toast.makeText(this, "유태호에게 전화중~",
                        Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:01076422566"));
                intent2.putExtra("sms_body", "내용을 입력하세요.");
                Toast.makeText(this, "유태호에게 문자를보냅니다.",
                        Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                break;
        }
    }
}