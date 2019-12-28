package lathigara.harsh.mvvm;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class ViewModelActivityGenerator extends ViewModel {

    private String TAG = this.getClass().getSimpleName();

    // liveData
    private MutableLiveData<String> myRandomNumber;

    public  MutableLiveData<String> getNumber(){
        Log.d(TAG, "getNumber: ");
        if (myRandomNumber == null){
            myRandomNumber = new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber() {
        Log.d(TAG, "createNumber: ");
        Random random = new Random();
       // myRandomNumber =
        myRandomNumber.setValue("Number" +(random.nextInt(10-1)+1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "onCleared: viewModel Cleared");
    }
}
