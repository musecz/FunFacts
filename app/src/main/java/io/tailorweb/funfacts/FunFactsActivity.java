package io.tailorweb.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        // Affect the Views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.ShowFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);
        // Add a listener on the button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                // Update the screen with our dynamic Fact
                mFactTextView.setText(fact);
                // Update the background Color
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
//        Toast.makeText(this, "This is a cool toast", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"this is example of debugging");
    }
}
