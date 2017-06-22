package com.opensw.accountant.accountant.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.opensw.accountant.accountant.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart chart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(100.0f, 0));
        entries.add(new Entry(50.0f, 1));
        entries.add(new Entry(75.0f, 2));
        entries.add(new Entry(63.0f, 3));
        entries.add(new Entry(80.0f, 4));

        LineDataSet set = new LineDataSet(entries, "Company 1");
        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        ArrayList<LineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set);

        ArrayList<String> x = new ArrayList<>();
        x.add("1.0");
        x.add("2.0");
        x.add("3.0");
        x.add("4.0");
        x.add("5.0");

        LineData data = new LineData(x, dataSets);

        chart.setData(data);
        chart.invalidate();
    }

    @Override
    public void initView() {

    }
}
