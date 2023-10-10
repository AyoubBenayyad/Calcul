package ma.ensaf.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void changeTxt(View view){

        EditText firstNameInput= findViewById(R.id.FirstNameInput);
        EditText LastNameInput= findViewById(R.id.LastNameInput);

        TextView firstName= findViewById(R.id.FirstName);
        TextView lastName= findViewById(R.id.LastName);

        firstName.setText(firstNameInput.getText().toString());
        lastName.setText(LastNameInput.getText().toString());

    }
}