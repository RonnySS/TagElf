package com.redbone.myapplication;

import android.util.Log;

public class LogTag {
    String className;
    public String especialName = "";
    boolean isOpen;
    LogTag(Object self){
        className = self.getClass().getSimpleName();

    }

    LogTag(Object self,String especialName){
        className = self.getClass().getSimpleName();
        this.especialName = especialName;
    }

    public void makeTag(String text){
        if (isOpen){
            Log.d(className+":"+especialName, text);
        }
    }

    public void setOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    public void inspectObj(Object object){
        Log.d(className+":"+especialName, "开始inspect时间");
        if (isOpen){
            ObjectInspect.inspectObject(object);
        }

    }

}



