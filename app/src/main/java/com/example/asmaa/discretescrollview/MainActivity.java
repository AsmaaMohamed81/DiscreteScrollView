package com.example.asmaa.discretescrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.transform.Pivot;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    DiscreteAdapter discreteAdapter;
    ArrayList<DiscreteModel> list;
    DiscreteScrollView discreteScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private void initView() {
        discreteScrollView = findViewById(R.id.picker);

        list=new ArrayList<>();
        discreteAdapter = new DiscreteAdapter(list,this);

        discreteScrollView.setAdapter(discreteAdapter);
        discreteScrollView.setItemTransformer(new ScaleTransformer.Builder()
                .setMaxScale(1.05f)
                .setMinScale(0.8f)
                .setPivotX(Pivot.X.CENTER) // CENTER is a default one
                .setPivotY(Pivot.Y.BOTTOM) // CENTER is a default one
                .build());

        list.addAll(getDircteteList());
        discreteAdapter.notifyDataSetChanged();


    }

    private List<DiscreteModel> getDircteteList() {
        List<DiscreteModel> list1=new ArrayList<>();
        list1.add(new DiscreteModel(R.mipmap.ic_launcher,"saasa"));
        list1.add(new DiscreteModel(R.mipmap.ic_launcher,"fggfh"));
        list1.add(new DiscreteModel(R.mipmap.ic_launcher,"saewe4wrreasa"));
        list1.add(new DiscreteModel(R.mipmap.ic_launcher,"yyyyyyyyyyy"));
        list1.add(new DiscreteModel(R.mipmap.ic_launcher,"saasa"));


        return list1;
    }


}
