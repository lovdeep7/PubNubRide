package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class HelveticaNeueCondObl extends TextView {

    public HelveticaNeueCondObl(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public HelveticaNeueCondObl(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HelveticaNeueCondObl(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/HelveticaNeue-CondObl.ttf");
            setTypeface(tf);
        }
    }

}
