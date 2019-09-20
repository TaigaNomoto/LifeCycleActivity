package jp.aoyama.a5816071.lifecycleactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends Activity {
    private static final String TAG = " LifeCycleActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Restart");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Start");
    }
}