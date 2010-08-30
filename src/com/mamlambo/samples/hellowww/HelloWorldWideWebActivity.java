package com.mamlambo.samples.hellowww;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HelloWorldWideWebActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void launchBrowser(View view) {
        Uri uriUrl = Uri.parse("http://androidbook.blogspot.com/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void searchBrowserGoogle(View view) {
        Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
        search.putExtra(SearchManager.QUERY, "pygmy goats");
        startActivity(search);
    }

}