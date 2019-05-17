package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText_SFUI_Regular extends EditText {

    public EditText_SFUI_Regular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EditText_SFUI_Regular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditText_SFUI_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_regular.ttf");
            setTypeface(tf);
        }
    }

}