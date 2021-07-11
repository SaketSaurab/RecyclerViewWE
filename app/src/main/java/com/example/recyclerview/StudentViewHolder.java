package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvRollNo;

    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvName = this.itemView.findViewById(R.id.tvname);
        mTvAge = this.itemView.findViewById(R.id.tvage);
        mTvRollNo = this.itemView.findViewById(R.id.tvRollno);
    }

    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRollNo()+"");
    }
}
