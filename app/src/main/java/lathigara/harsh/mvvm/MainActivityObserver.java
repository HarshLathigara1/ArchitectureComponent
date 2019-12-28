package lathigara.harsh.mvvm;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent(){
        Log.d("TAG", "onCreate:  Observer " );

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent(){
       // Log.d(TAG, "onStartEvent: onStart Observer " );
        Log.d("TAG", "onStartEvent: onStart Observer " );
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent(){
        Log.d("TAG", "onPauseEvent:  onPause Observer");

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent(){
        Log.d("TAG", "OnResumeEvent: onResume Observer ");

    }





    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent(){
        Log.d("TAG", "onDestroyEvent: ");

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent(){
        Log.d("TAG", "onStopEvent: ");

    }










}
