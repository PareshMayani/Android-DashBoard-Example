package com.technotalkative.viewstubdemo;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */
import android.os.Bundle;

public class Activity_Eclair extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclair);
        setHeader(getString(R.string.EclairActivityTitle), true, true);
        
    }
}
