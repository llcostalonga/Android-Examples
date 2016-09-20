package br.ufes.llcostalonga.android.exemplo.ratingbartutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingbar1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ratingbar1 = (RatingBar) findViewById(R.id.ratingBar1);
        button = (Button) findViewById(R.id.button1);

        //Performing action on Button Click
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                String rating = String.valueOf(ratingbar1.getRating());
                Toast.makeText(getApplicationContext(), "Android RatingBar Example Value..." + rating, Toast.LENGTH_LONG).show();
            }

        });*/
    }
}
