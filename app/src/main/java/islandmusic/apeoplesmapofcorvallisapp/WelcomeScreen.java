package islandmusic.apeoplesmapofcorvallisapp;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class WelcomeScreen extends AppCompatActivity {
    //@Override
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
    }

    /** Called when the user clicks the Send button */
    public void startApp(View view) {
        Intent intent = new Intent(this, StartApp.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}