package ajaymehta.xmldesign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // things to remember
        //1.  giving padding to top parent ..squeeze all the child elements..
        //2.  giving margin to particular child ..squeeze that particular child..
        // 3. giving padding to particular child  ..makes it big ..
    }
}
