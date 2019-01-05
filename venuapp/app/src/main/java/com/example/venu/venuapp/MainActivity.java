package com.example.venu.venuapp;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Comment below code because we do not want to use layout xml to build android ui.
        //setContentView(R.layout.activity_main);

        // We use a LinearLayout object as the root view object.
        LinearLayout rootView = new LinearLayout(this);
        // Set root view properties such as background color, gravity and orientation.
        rootView.setBackgroundColor(Color.GREEN);
        // Display child view in center both horizontal and vertical.
        rootView.setGravity(Gravity.CENTER);
        // Align child view in horizontal direction.
        rootView.setOrientation(LinearLayout.HORIZONTAL);

        // Create a LinearLayout parames object.
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(10, 10, 10, 10);

        // Use LinearLayout object as root view
        setContentView(rootView, layoutParams);

        // Create a EditText ui component.
        final EditText editText = new EditText(this);
        // Set editText id from ids.xml resource file.
        editText.setId(R.id.id_edit_text);
        // Set edit text hint text.
        editText.setHint(R.string.edit_text_hint);
        // Set hint text color.
        editText.setHintTextColor(Color.BLUE);

        /* Because every android device's screen density is different,
           so android use dp as the width or height unit in layout xml file.
           Use dp as length unit can make UI component display and behave same in different android devices.
           But in java code editText.setWidth()'s input parameter is pixel,
           so we need to translate dp to pixel first. */

        // Get Resources object.
        Resources r = getResources();
        // Get 200dp correspond px value.
        int widthInPx = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        editText.setWidth(widthInPx);
        // Add edittext as root view's child.
        rootView.addView(editText);

        // Create a button.
        Button button = new Button(this);
        // Set submit button id from resource file.
        button.setId(R.id.id_submit_button);
        // Set button text by string resource id.
        button.setText(R.string.submit_button_text);
        // Show button text by original character case.
        button.setAllCaps(false);
        // Add button to the root view.
        rootView.addView(button);

        // When this button is clicked.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get user input email.
                String email = editText.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    // If email is empty.
                    Toast.makeText(getApplicationContext(), "Email cannot be empty.", Toast.LENGTH_LONG).show();
                } else {
                    // If email is not empty.
                    Toast.makeText(getApplicationContext(), "Your email has been submitted.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}
