package com.example.widgetapp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

class MyListView extends ListView {
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // 解决ScrollView嵌套ListView显示不全的问题
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        // heightMeasureSpec 是个32位的值，30位是 Integer.MAX_VALUE >> 2 ， 2位是 MeasureSpec.AT_MOST
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
