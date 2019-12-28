package lathigara.harsh.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements LifecycleObserver {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate: Owner ON_CREATE");
       getLifecycle().addObserver(new MainActivityObserver());
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart: Owner ON_START");

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TAG", "onPause: Owner ON_PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("TAG", "onResume: Owner ON_RESUME");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("TAG", "onDestroy: Owner ON_DESTROY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop: Owner ON_STOP");
    }


}
