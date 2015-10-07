package com.example.dongja94.sampleapplicationcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    public static final String RESULT_MESSAGE = "result";
    TextView messageView;
    String mMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        messageView = (TextView)findViewById(R.id.text_message);
        Button btn= (Button)findViewById(R.id.btn_finish);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(RESULT_MESSAGE, "echo : " + mMessage);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        Intent intent = getIntent();
        mMessage = intent.getStringExtra(EXTRA_MESSAGE);
        messageView.setText(mMessage);

    }
}
