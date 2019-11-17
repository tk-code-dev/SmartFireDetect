package com.tk.code.smartfiredetect.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tk.code.smartfiredetect.Model.SampleData;
import com.tk.code.smartfiredetect.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageActivity extends AppCompatActivity {

    SampleData sampleData = new SampleData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_employees);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // use this setting to improve performance
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);

        // copy to ArrayList
        final List<String> iName = new ArrayList<>(Arrays.asList(sampleData.names));

        final List<Integer> intSOSs = new ArrayList<>(Arrays.asList(sampleData.intSOS));

        // specify an adapter
        final RecyclerView.Adapter rAdapter = new MyAdapter(iName,  intSOSs);
        recyclerView.setAdapter(rAdapter);
    }
}
