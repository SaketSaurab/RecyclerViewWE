package com.example.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentlist();
        setRecyclerView();
    }

    private void buildStudentlist() {
        studentList = new ArrayList<>();
        Student student1 = new Student("Abhishek",19,"EMP123");
        studentList.add(student1);
        Student student2 = new Student("Rahul",27,"EMP124");
        studentList.add(student2);
        for(int i=0; i<13; i++){
            Student student = new Student("Sanjeev"+i,31,"EMP125");
            studentList.add(student);
        }

    }

    private void setRecyclerView(){
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }


    private void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
    }
}