package com.example.matala2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Exceptions
    private static final String EXCEPTION_MESSAGE = "Custom exception occurred.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // קריאה לפונקציות
        try {
            function1();
            function2();
            function3();
        } catch (Exception e) {
            // מטפל ב-Exception
            TextView textView = findViewById(R.id.textView1);
            textView.setText("Exception handled: " + e.getMessage());
        }
    }

    // פונקציה ראשונה
    private void function1() {
        // הכנסת קוד פונקציה כאן
    }

    // פונקציה שנייה
    private void function2() {
        // הכנסת קוד פונקציה כאן
    }

    // פונקציה שלישית
    private void function3() throws Exception {
        // יצירת Exception
        throw new Exception(EXCEPTION_MESSAGE);
    }
}