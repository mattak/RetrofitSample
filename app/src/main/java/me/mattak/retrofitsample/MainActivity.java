package me.mattak.retrofitsample;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import retrofit.Call;
import retrofit.Callback;
import retrofit.MoshiConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ifconfig.me")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        IfconfigApi api = retrofit.create(IfconfigApi.class);
        Call<AllEntity> callback = api.all();
        callback.enqueue(new ApiCallback());
    }

    class ApiCallback implements Callback<AllEntity> {
        @Override
        public void onResponse(Response<AllEntity> response, Retrofit retrofit) {
            TextView view = (TextView)findViewById(R.id.content_text);
            view.setText(response.body().toString());
        }

        @Override
        public void onFailure(Throwable t) {
            TextView view = (TextView)findViewById(R.id.content_text);
            view.setText(t.toString());
        }
    }
}