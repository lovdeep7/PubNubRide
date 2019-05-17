package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextView_Helvetica_Neue_bold extends TextView {

    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/helvetica-neue-bold.ttf");
            setTypeface(tf);
        }
    }

}