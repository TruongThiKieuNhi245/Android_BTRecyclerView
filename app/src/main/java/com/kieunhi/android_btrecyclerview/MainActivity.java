package com.kieunhi.android_btrecyclerview;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myModelList = new ArrayList<>();

        // Thêm nhiều dòng dữ liệu (tên + tuổi)
        myModelList.add(new MyModel("Trương Thị Kiều Nhi", "20"));
        myModelList.add(new MyModel("Nguyễn Văn A", "25"));
        myModelList.add(new MyModel("Lê Thị B", "22"));
        myModelList.add(new MyModel("Phạm Minh C", "30"));
        myModelList.add(new MyModel("Hoàng Thùy D", "28"));
        myModelList.add(new MyModel("Võ Văn E", "24"));
        myModelList.add(new MyModel("Đỗ Thị F", "20"));
        myModelList.add(new MyModel("Trần Văn G", "27"));
        myModelList.add(new MyModel("Phan Thị H", "23"));
        myModelList.add(new MyModel("Bùi Văn I", "26"));
        myModelList.add(new MyModel("Đặng Thị J", "29"));
        myModelList.add(new MyModel("Lý Văn K", "31"));
        myModelList.add(new MyModel("Vũ Thị L", "19"));
        myModelList.add(new MyModel("Hồ Văn M", "32"));
        myModelList.add(new MyModel("Ngô Thị N", "18"));
        myModelList.add(new MyModel("Mai Văn O", "33"));
        myModelList.add(new MyModel("Trịnh Thị P", "34"));
        myModelList.add(new MyModel("Phùng Văn Q", "35"));
        myModelList.add(new MyModel("Dương Thị R", "21"));
        myModelList.add(new MyModel("Cao Văn S", "22"));

        customAdapter = new CustomAdapter(this, myModelList);
        recyclerView.setAdapter(customAdapter);

        // Khi click -> hiện Toast tên người
        customAdapter.setSelectListener(new SelectListener() {
            @Override
            public void onItemClicked(MyModel myModel) {
                Toast.makeText(MainActivity.this, myModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
