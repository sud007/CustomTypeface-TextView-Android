package com.example.beerparty;

import com.example.customfonttextview.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FontTextView extends TextView {

	private AttributeSet mAttrs;
	private Context mContext;
	private TextView mFontTextView;
	private String mFont;

	public FontTextView(Context context) {
		super(context);
		mContext = context;
		initializeView();
	}

	public FontTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		mAttrs = attrs;
		initializeView();
	}

	public FontTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
		mAttrs = attrs;
		initializeView();
	}

	private void initializeView() {

		if (mContext == null) {
			return;
		}
		LayoutInflater mLayoutInflator = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mLayoutInflator.inflate(R.layout.font_text_view, null, true);

		mFontTextView = (TextView) findViewById(R.id.fonttextview);
		getAttributesFromXmlAndStoreLocally();
		setupTextView();
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

	}

	private void getAttributesFromXmlAndStoreLocally() {
		TypedArray attributesFromXmlLayout = mContext.obtainStyledAttributes(
				mAttrs, R.styleable.FontTextView);
		if (attributesFromXmlLayout == null) {
			return;
		}
		mFont = attributesFromXmlLayout
				.getString(R.styleable.FontTextView_setFontFromAssets);
		attributesFromXmlLayout.recycle();
	}

	

	private void setupTextView() {

		Typeface face = Typeface.createFromAsset(mContext.getAssets(),
				mFont);
		this.setTypeface(face);
	}
}