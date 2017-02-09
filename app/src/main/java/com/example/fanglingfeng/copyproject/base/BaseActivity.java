package com.example.fanglingfeng.copyproject.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.fanglingfeng.copyproject.widgets.LoadingDialog;

/**
 * Created by fanglingfeng on 2017/2/8.
 */
public class BaseActivity extends AppCompatActivity{
    LoadingDialog loadingDialog;
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadingDialog = new LoadingDialog(this);
        ActivityContainer.add(this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        ActivityContainer.delete(this);
    }
    public void showDialog(){
        if (!loadingDialog.isShowing()) {
            loadingDialog.show();
        }
    }
    public void dismissDialog(){
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }
    public void setLoadingText(String content){
        loadingDialog.setContent(content);
    }
}
