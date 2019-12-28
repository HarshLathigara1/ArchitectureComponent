package lathigara.harsh.mvvm;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class ViewModelActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel);
        textView = findViewById(R.id.textView);
        ViewModelActivityGenerator model = ViewModelProviders.of(this).get(ViewModelActivityGenerator.class);

       // ViewModelActivityGenerator model = new ViewModelActivityGenerator();
        String MyRandomNumber =model.getNumber();
        textView.setText(MyRandomNumber);

        Log.d("TAG", "onCreate: random number seted");
    }
}
