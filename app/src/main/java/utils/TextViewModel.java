package utils;

import java.io.Serializable;

/**
 * desc：组装业务
 * time：2018/4/23
 * auth：danshen@2dfire.com
 */
public class TextViewModel implements Serializable {

    private int type;
    private int index;
    private int end;
    private int textColor;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}
