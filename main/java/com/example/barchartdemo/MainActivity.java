package com.example.barchartdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.barchartdemo.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BarChart barChart;
    BarData barData;
    ArrayList barenteries;
    ArrayList year;
    BarDataSet barDataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barChart=findViewById(R.id.barchart);

        getenteries();
        barDataSet=new BarDataSet(barenteries,"My chart data");
        barChart.animateY(5000);
        barData=new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextSize(20f);
        barDataSet.setValueTextColor(Color.BLACK);
    }
    private void getenteries()
    {
        barenteries=new ArrayList();
        barenteries.add(new BarEntry(1f,10));
        barenteries.add(new BarEntry(2f,20));
        barenteries.add(new BarEntry(3f,30));
        barenteries.add(new BarEntry(4f,40));
        barenteries.add(new BarEntry(4.9f,50));
        barenteries.add(new BarEntry(5.9f,60));

    }

}