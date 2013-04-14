package com.technotalkative.viewstubdemo;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */

import android.os.Bundle;

public class Activity_Gingerbread extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gingerbread);
        setHeader(getString(R.string.GingerbreadActivityTitle), true, true);
        
    }
}
