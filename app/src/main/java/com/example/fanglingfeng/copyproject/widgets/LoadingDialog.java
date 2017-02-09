package com.example.fanglingfeng.copyproject.widgets;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.fanglingfeng.copyproject.R;

/**
 * Created by fanglingfeng on 2017/2/8.
 */
public class LoadingDialog {
    Context context;
    Dialog dialog;
    @BindView(R.id.common_dialog_loading_progressbar) ProgressBar progressBar;
    @BindView(R.id.common_dialog_loading_textview) TextView textView;
    @BindView(R.id.common_dialog_loading_relativelayout) RelativeLayout dialogView;
    //构造函数
    public LoadingDialog(Context context) {
        this.context = context;
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.commen_loading);
        ButterKnife.bind(this, dialog);
    }
    //可以带文字
    public LoadingDialog(Context context, String content) {
        this(context);
        setContent(content);
    }
    public LoadingDialog(Context context, int msgId) {
        this(context);
        setContent(msgId);
    }
    //也可以设置文字
    public void setContent(String content) {
        if (null != textView) {
            textView.setText(content);
        }
    }

    public void setContent(int msgId) {
        if (null != textView) {
            textView.setText(msgId);
        }
    }

    //设置背景
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN) public void setBackground(Drawable drawable){
        dialogView.setBackground(drawable);
    }
    public void setBackground(int resourceId){
        dialogView.setBackgroundResource(resourceId);
    }
    //show 和 miss
    public void show(){
        dialog.show();
    }
    public void dismiss(){
        dialog.dismiss();
    }
    //判断是否showing
    public boolean isShowing(){
        return dialog.isShowing();
    }
}
