package com.example.beer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mainRecyclerView);
        List<Beer> beerList = Arrays.asList(Beers.getAllBeers());
        RecyclerViewSimpleAdapter<Beer> adapter = new RecyclerViewSimpleAdapter<>(beerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerViewSimpleAdapter.OnItemClickListener<Beer>() {
            @Override
            public void onItemClick(View view, int position, Beer element) {
                // Toast.makeText(getBaseContext(), element.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.BEER, element);
                startActivity(intent);
            }
        });
    }
}