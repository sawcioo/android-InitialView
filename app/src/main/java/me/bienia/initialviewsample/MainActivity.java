package me.bienia.initialviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import me.bienia.initialview.InitialView;
import me.bienia.initialview.InitialViewPage;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitialView initialView = (InitialView) findViewById(R.id.initialView);

        InitialViewPage page1 = testPage();
        page1.setTitle("Tytuł 1");
        page1.setDescription("Tutaj kiedys bedzie tytuł");

        InitialViewPage page2 = testPage();
        page2.setTitle("Tytuł 2");
        page2.setDescription("Tutaj kiedys bedzie tytuł");

        InitialViewPage page3 = testPage();
        page3.setTitle("Tytuł 3");
        page3.setDescription("Tutaj kiedys bedzie tytuł");

        InitialViewPage page4 = testPage();
        page4.setTitle("Tytuł 4");
        page4.setDescription("Tutaj kiedys bedzie tytuł");

        initialView.addInitialViewPage(page1);
        initialView.addInitialViewPage(page2);
        initialView.addInitialViewPage(page3);
        initialView.addInitialViewPage(page4);
        initialView.reloadData();
    }

    private InitialViewPage testPage() {
        InitialViewPage page = new InitialViewPage();
        page.setTitleTextSize(22);

        return page;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
