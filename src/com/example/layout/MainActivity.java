package com.example.layout;
//专门用来做“淘无线”正式版本的UI的
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends Activity {
	ImageView account;
	ImageView dianxin;
	ImageView yidong;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account=(ImageView)findViewById(R.id.account);
        dianxin=(ImageView)findViewById(R.id.dianxin);
        yidong=(ImageView)findViewById(R.id.yidong);
        
        account.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
        dianxin.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
        yidong.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
