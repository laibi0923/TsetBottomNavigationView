package com.example.ghostleo_dt.tsetbottomnavigationview;

import com.example.ghostleo_dt.tsetbottomnavigationview.BottomNavigationHelper;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mContent;
    private TextView mContentMsg;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContent = (FrameLayout) findViewById(R.id.content);
        mContentMsg = (TextView) findViewById(R.id.content_msg);
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
		BottomNavigationHelper.disableShiftMode(mBottomNavigationView);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.item1:
                        mContentMsg.setText(item.getTitle());
                        break;

                    case R.id.item2:
                        mContentMsg.setText(item.getTitle());
                        break;

                    case R.id.item3:
                        mContentMsg.setText(item.getTitle());
                        break;
						
					case R.id.item4:
                        mContentMsg.setText(item.getTitle());
                        break;
						
					case R.id.item5:
                        mContentMsg.setText(item.getTitle());
                        break;
                }

                return true;
            }
        });
    }


}
