package com.example.leedongjun.a3_7phonecell;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.leedongjun.a3_7phonecell.adapter.JobAdapter;
import com.example.leedongjun.a3_7phonecell.model.Job;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
    implements AdapterView.OnItemClickListener {
        List<Job> list;
        JobAdapter adapter;
        ListView listView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            list = new ArrayList<Job>();
            adapter = new JobAdapter(this, R.layout.list_item, list);
            listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);

            addData();
        }

        public void addData() {
            adapter.add(new Job("1. 수행평가", "-수행평가 일정.안내자료를 확인할수있는 곳!!", R.drawable.notice));
            adapter.add(new Job("2. 연락망", "-친구들의 정보가 있는 곳!!", R.drawable.cell));
            adapter.add(new Job("3. 시간표", "-고정시간표를 알수있는 곳!!", R.drawable.calsstime));
            adapter.add(new Job("4. 건의사항", "-건의사항을 입력하여서 보낼수 있는 곳!!", R.drawable.hope));
            adapter.add(new Job("5. 학교홈페이지", "-(금파중학교)홈페이지를 바로 갈수 있는 곳!!", R.drawable.school));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position) {
            case 0:
                Toast.makeText(this,"알림장 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent0 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://kumpa9.wixsite.com/kumpa-307"));
                startActivity(intent0);
                break;
            case 1:
                Toast.makeText(this,"연락망 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this,phonecell.class);
                startActivity(intent1);
                break;
            case 2:
                Toast.makeText(this,"시간표 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this,classtime.class);
                startActivity(intent2);
                break;
            case 3:
                Toast.makeText(this,"건의사항 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this,say.class);
                startActivity(intent3);
                break;
            case 4:
                Toast.makeText(this,"학교홈페이지 페이지로 이동합니다~",
                        Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://kumpa.ms.kr"));
                startActivity(intent4);
                break;
        }
    }
}
