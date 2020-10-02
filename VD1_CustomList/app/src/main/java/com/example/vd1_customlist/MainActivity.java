package com.example.vd1_customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.fonts.Font;
import android.os.Bundle;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

import java.sql.ClientInfoStatus;

public class MainActivity extends Activity
{
    ListView list;


    String[] name =
            {
                    "Phạm Vinh",
                    "Nguyễn Hồng Bảo Thư",
                    "Trần Thị Nam Phương",
                    "Nguyễn Văn Long",
                    "Phùng Văn Việt"
            };
    String[] chucvu =
            {
                    "Giám đốc",
                    "Phó giám đốc",
                    "Trưởng phòng hành chính",
                    "Trưởng phòng kinh doanh",
                    "Trưởng phòng marketing"
            };
    Integer[] hesoluong =
            {
                    4,
                    3,
                    2,
                    2,
                    2
            };

    Integer[] imageId =
            {
                    R.drawable.giamdoc,
                    R.drawable.phogiamdoc,
                    R.drawable.truongphonghanhchinh,
                    R.drawable.truongphongkinhdoanh,
                    R.drawable.truongphongmarketing
            };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomList adapter = new CustomList(MainActivity.this, name, imageId,chucvu,hesoluong);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView <? > parent, View view,
                                    int position, long id)
            {

                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + name[+position] +", Chức vụ:" + chucvu[+position] +","
                        + "\n" +"Hệ số lương:" + hesoluong[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}