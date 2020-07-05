package com.example.leedongjun.a3_7phonecell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.leedongjun.a3_7phonecell.adapter.phoneAdapter;
import com.example.leedongjun.a3_7phonecell.model.phone;

import java.util.List;
import java.util.ArrayList;

public class phonecell extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    List<phone> list;
    phoneAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonemain);

        list = new ArrayList<phone>();
        adapter = new phoneAdapter(this, R.layout.activity_phonecell, list);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        addData();
    }

    public void addData() {
        adapter.add(new phone("1 : 고보민"));
        adapter.add(new phone("2 : 김재희"));
        adapter.add(new phone("3 : 김하얀"));
        adapter.add(new phone("4 : 도유나"));
        adapter.add(new phone("5 : 마수현"));
        adapter.add(new phone("6 : 명유민"));
        adapter.add(new phone("7 : 박채연"));
        adapter.add(new phone("8 : 백하연"));
        adapter.add(new phone("9 : 오서경"));
        adapter.add(new phone("10 : 이소희"));
        adapter.add(new phone("11 : 장희서"));
        adapter.add(new phone("12 : 전수영"));
        adapter.add(new phone("13 : 조수아"));
        adapter.add(new phone("14 : 최민정"));
        adapter.add(new phone("15 : 최연서"));
        adapter.add(new phone("16 : 강진영"));
        adapter.add(new phone("17 : 권진"));
        adapter.add(new phone("18 : 김민혁"));
        adapter.add(new phone("19 : 김영훈"));
        adapter.add(new phone("20 : 김주현"));
        adapter.add(new phone("21 : 김현우"));
        adapter.add(new phone("22 : 변현수"));
        adapter.add(new phone("23 : 신제민"));
        adapter.add(new phone("24 : 김주현"));
        adapter.add(new phone("25 : 유동희"));
        adapter.add(new phone("26 : 유선재"));
        adapter.add(new phone("27 : 유태호"));
        adapter.add(new phone("28 : 윤병석"));
        adapter.add(new phone("29 : 이동기"));
        adapter.add(new phone("30 : 이동준"));
        adapter.add(new phone("31 : 이종문"));
        adapter.add(new phone("32 : 임운일"));
        adapter.add(new phone("33 : 정재호"));
        adapter.add(new phone("34 : 최건"));


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
            Toast.makeText(this, "고보민의 정보 페이지로 이동합니다~",
                    Toast.LENGTH_SHORT).show();
            Intent intent0 = new Intent(getApplicationContext(),number1.class);
            startActivity(intent0);
                break;
            case 1:
                Toast.makeText(this, "김재희의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this,number2.class);
                startActivity(intent1);
                break;
            case 2:
                Toast.makeText(this, "김하얀의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this,number3.class);
                startActivity(intent2);
                break;
            case 3:
                Toast.makeText(this, "도유나의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, number4.class);
                startActivity(intent3);
                break;
            case 4:
                Toast.makeText(this, "마수현의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, number5.class);
                startActivity(intent4);
                break;
            case 5:
                Toast.makeText(this, "명유민의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(this, number6.class);
                startActivity(intent5);
                break;
            case 6:
                Toast.makeText(this, "박채연의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(this, number7.class);
                startActivity(intent6);
                break;
            case 7:
                Toast.makeText(this, "백하연의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent7 = new Intent(this, number8.class);
                startActivity(intent7);
                break;
            case 8:
                Toast.makeText(this, "오서경의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent8 = new Intent(this, number9.class);
                startActivity(intent8);
                break;
            case 9:
                Toast.makeText(this, "이소희의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent9 = new Intent(this, number10.class);
                startActivity(intent9);
                break;
            case 10:
                Toast.makeText(this, "장희서의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(this, number11.class);
                startActivity(intent10);
                break;
            case 11:
                Toast.makeText(this, "전수영의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(this, number12.class);
                startActivity(intent11);
                break;
            case 12:
                Toast.makeText(this, "조수아의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent12 = new Intent(this, number13.class);
                startActivity(intent12);
                break;
            case 13:
                Toast.makeText(this, "최민정의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent13 = new Intent(this, number14.class);
                startActivity(intent13);
                break;
            case 14:
                Toast.makeText(this, "최연서의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent14 = new Intent(this, number15.class);
                startActivity(intent14);
                break;
            case 15:
                Toast.makeText(this, "강진영의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent15 = new Intent(this, number16.class);
                startActivity(intent15);
                break;
            case 16:
                Toast.makeText(this, "권 진의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent16 = new Intent(this, number17.class);
                startActivity(intent16);
                break;
            case 17:
                Toast.makeText(this, "김민혁의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent17 = new Intent(this, number18.class);
                startActivity(intent17);
                break;
            case 18:
                Toast.makeText(this, "김영훈의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent18 = new Intent(this, number19.class);
                startActivity(intent18);
                break;
            case 19:
                Toast.makeText(this, "김주현의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent19 = new Intent(this, number20.class);
                startActivity(intent19);
                break;
            case 20:
                Toast.makeText(this, "김현우의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent20 = new Intent(this, number21.class);
                startActivity(intent20);
                break;
            case 21:
                Toast.makeText(this, "변현수의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent21 = new Intent(this, number22.class);
                startActivity(intent21);
                break;
            case 22:
                Toast.makeText(this, "신제민의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent22 = new Intent(this, number23.class);
                startActivity(intent22);
                break;
            case 23:
                Toast.makeText(this, "신충호의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent23 = new Intent(this, number24.class);
                startActivity(intent23);
                break;
            case 24:
                Toast.makeText(this, "유동희의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent24 = new Intent(this, number25.class);
                startActivity(intent24);
                break;
            case 25:
                Toast.makeText(this, "유선재의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent25 = new Intent(this, number26.class);
                startActivity(intent25);
                break;
            case 26:
                Toast.makeText(this, "유태호의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent26 = new Intent(this, number27.class);
                startActivity(intent26);
                break;
            case 27:
                Toast.makeText(this, "윤병석의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent27 = new Intent(this, number28.class);
                startActivity(intent27);
                break;
            case 28:
                Toast.makeText(this, "이동기의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent28 = new Intent(this, number29.class);
                startActivity(intent28);
                break;
            case 29:
                Toast.makeText(this, "이동준의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent29 = new Intent(this, number30.class);
                startActivity(intent29);
                break;
            case 30:
                Toast.makeText(this, "이종문의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent30 = new Intent(this, number31.class);
                startActivity(intent30);
                break;
            case 31:
                Toast.makeText(this, "임운일의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent31 = new Intent(this, number32.class);
                startActivity(intent31);
                break;
            case 32:
                Toast.makeText(this, "정재호의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent32 = new Intent(this, number33.class);
                startActivity(intent32);
                break;
            case 33:
                Toast.makeText(this, "최건의 정보 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent33 = new Intent(this, number34.class);
                startActivity(intent33);
                break;
        }
    }
}