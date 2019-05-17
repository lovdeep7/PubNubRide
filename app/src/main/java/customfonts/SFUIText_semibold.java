package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class SFUIText_semibold extends EditText {

    public SFUIText_semibold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public SFUIText_semibold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SFUIText_semibold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_semibold.ttf");
            setTypeface(tf);
        }
    }

}