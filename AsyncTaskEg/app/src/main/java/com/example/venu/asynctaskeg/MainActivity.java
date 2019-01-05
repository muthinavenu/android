package com.example.venu.asynctaskeg;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MainActivity extends AppCompatActivity {
    String apiUrl = "http://mobileappdatabase.in/demo/smartnews/app_dashboard/jsonUrl/single-article.php?article-id=72";
    String title, image, category;
    Button displaydata;
    TextView categoryTextView, titleTextView;
    ImageView imageView;
    ProgressDialog progessDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        categoryTextView = (TextView) findViewById(R.id.categoryTextView);
        displaydata = (Button) findViewById(R.id.displaydata);
        imageView = (ImageView) findViewById(R.id.imageView);

        displaydata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTasks myasynctasks = new MyAsyncTasks();
                myasynctasks.execute();
            }
        });
    }

    public class MyAsyncTasks extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progessDialog = new ProgressDialog(MainActivity.this);
            progessDialog.setMessage("Please Wait");
            progessDialog.setCancelable(false);
            progessDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {
            String current = "";
            try {
                URL url;
                HttpURLConnection urlConnection = null;
                try {
                    url = new URL(apiUrl);
                    urlConnection = (HttpURLConnection) url.openConnection();
                    InputStream is = urlConnection.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    int data = isr.read();
                    while (data != -1) {
                        current += (char) data;
                        data = isr.read();
                        System.out.print(current);
                    }
                    return current;

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (urlConnection != null) {
                        urlConnection.disconnect();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Exception:" + e.getMessage();
            }
            return current;
        }


        @Override
        protected void onPostExecute(String s) {
            Log.d("data", s.toString());
            progessDialog.dismiss();
            try {
                JSONArray jsonArray = new JSONArray(s);
                JSONObject oneObject = jsonArray.getJSONObject(0);
                title = oneObject.getString("title");
                category = oneObject.getString("category");
                image = oneObject.getString("image");
                titleTextView.setText("Title : " + title);
                categoryTextView.setText("Category : " + category);
                Picasso.with(getApplicationContext())
                        .load(image)
                        .into(imageView);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }

}