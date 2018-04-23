package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;

import java.util.ArrayList;
import java.util.List;

/**
 * desc：textview工具类
 * time：2018/4/23
 * auth：danshen@2dfire.com
 */
public class TextViewSpanUtils {

    private TextViewSpanUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static TextViewSpanUtils.Builder getBuilder(Context context, @NonNull String text) {
        return new TextViewSpanUtils.Builder(context, text);
    }

    public static class Builder {

        private Context mContext;
        private String mText;
        private SpannableString mSp;
        private List<TextViewModel> mList;

        private Builder(Context context, @NonNull String text) {
            this.mContext = context;
            this.mText = text;
            this.mSp = new SpannableString(text.trim());
            this.mList = new ArrayList<>();
        }

        public Builder setStrikeThroughSpan(int index, int end) {
            if (index > mText.length() || end > mText.length()) {
                return this;
            }
            mSp.setSpan(new StrikethroughSpan(), index, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            return this;
        }

        public Builder setUnderlineSpan(int index, int end) {
            if (index > mText.length() || end > mText.length()) {
                return this;
            }
            mSp.setSpan(new UnderlineSpan(), index, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            return this;
        }

        public Builder setColorSpan(int index, int end, int color) {
            if (index > mText.length() || end > mText.length()) {
                return this;
            }
            mSp.setSpan(new ForegroundColorSpan(color), index, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            return this;
        }

        public Builder setSizeSpan(int index, int end, int size) {
            if (index > mText.length() || end > mText.length()) {
                return this;
            }
            mSp.setSpan(new AbsoluteSizeSpan(size, true), index, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            return this;
        }

        public Builder add(TextViewModel textSpanBean) {
            if (textSpanBean != null) {
                mList.add(textSpanBean);
            }
            return this;
        }

        public Builder addAll(List<TextViewModel> list) {
            if (list != null && list.size() > 0) {
                mList.addAll(list);
            }
            return this;
        }

        public SpannableString create() {
            setSpanModel();
            return mSp;
        }

        private void setSpanModel() {
            if (mList == null || mList.size() == 0) {
                return;
            }
            for (TextViewModel model : mList) {

            }
        }
    }

}
