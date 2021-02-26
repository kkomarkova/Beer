package com.example.beer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

    public class DetailActivity extends AppCompatActivity {
        public static final String BEER = "beer";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            Intent intent = getIntent();
            Beer beer = (Beer) intent.getSerializableExtra(BEER);
            Log.d("MYBEER", beer.toString());
            TextView messageView = findViewById(R.id.detailMessageTextView);
            messageView.setText(beer.toString());
        }

        public void goBackButton(View view) {
            finish();
        }
    }

