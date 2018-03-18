package corporation.darkshadow.allone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button home,publisher,newapp,aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (Button)findViewById(R.id.home);
        publisher = (Button)findViewById(R.id.publisher);
        newapp = (Button)findViewById(R.id.newapp);
        aboutus = (Button)findViewById(R.id.aboutus);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
