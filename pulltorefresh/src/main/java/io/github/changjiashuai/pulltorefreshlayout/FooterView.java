package io.github.changjiashuai.pulltorefreshlayout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 16/8/25 11:46.
 */
public class FooterView extends BaseView{
    public FooterView(Context context) {
        super(context);
    }

    public FooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FooterView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public void begin() {

    }

    @Override
    public void refreshing(int progress) {

    }

    @Override
    public void end() {

    }
}
