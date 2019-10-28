package x27.com.submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle( "Data Diri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Buah buah = getIntent().getParcelableExtra("key");
    }
}
