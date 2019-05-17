package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextView_Montserrat_Regular extends TextView {
    public MyTextView_Montserrat_Regular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView_Montserrat_Regular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView_Montserrat_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Montserrat-Regular.ttf");
            setTypeface(tf);
        }
    }
}
