package com.solojet.retrofitcheckup.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.solojet.retrofitcheckup.R;
import com.solojet.retrofitcheckup.models.GetDataService;
import com.solojet.retrofitcheckup.models.Model;
import com.solojet.retrofitcheckup.models.RetrofitClientInstance;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtDisplay = findViewById(R.id.txtDisplay);
        dialog = new ProgressDialog(MainActivity.this);
        dialog.setMessage("Loading....");
        dialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<Model>> call = service.employee();
        call.enqueue(new Callback<List<Model>>() {

            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Successful!", Toast.LENGTH_SHORT).show();
                Model employeeData = response.body().get(0); //index of first employee in the list
                txtDisplay.setText(employeeData.getPolicyNo());
                Log.i("MainActivity", "onResponse: " + employeeData.getPolicyNo());
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.i("MainActivity", "onFailure: "+ t.getMessage());
                dialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
