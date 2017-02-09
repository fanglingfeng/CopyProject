package com.example.fanglingfeng.copyproject.base;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanglingfeng on 2017/2/8.
 * 便于一次退出应用
 */
public class ActivityContainer {
    public static List<AppCompatActivity> activitys = new ArrayList<>();

    public static void add(AppCompatActivity activity) {
        activitys.add(activity);
    }

    public static void delete(AppCompatActivity activity) {
        activitys.remove(activity);
    }

    public static void finishActivitys() {
        for (AppCompatActivity act : activitys) {
            if (act != null && !act.isFinishing()) {
                act.finish();
            }
        }
    }
}
