package com.example.listviewpictures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String [] pictures ={
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200",
            "https://picsum.photos/200"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);
        ListView listView = findViewById(R.id.list_view_id);
        listView.setAdapter(new ListViewAdapter(MainActivity.this, pictures));

    }
}