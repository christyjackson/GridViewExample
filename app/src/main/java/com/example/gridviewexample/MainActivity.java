 package com.example.gridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList =  new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Data Structure", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("CSE1001", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("CSE1002", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Android Programming", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Ruby Programming", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Computer Networks", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Data Science", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Web Programming", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Mobile app dev", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("MADD", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.vitlogo));
        courseModelArrayList.add(new CourseModel("Soft Computing", R.drawable.vitlogo));
        CourseGVAdapter adapter = new CourseGVAdapter(this,courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}