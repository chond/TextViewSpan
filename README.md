# TextViewSpan
TextViewSpan是用于解决TextView各种复杂的繁琐配置span，动态的改变TextView的属性，如，大小，颜色，字体，中划线，下划线，背景图片，等等，
更简单的告诉底层，完美的得到想要的结果

## 支持
#### URLSpan
#### UnderlineSpan
#### TypefaceSpan
#### TextAppearanceSpan
#### TabStopSpanStandard
#### SuperscriptSpan
#### SubscriptSpan
#### StrikethroughSpan
#### ScaleXSpan
#### StyleSpan
#### RelativeSizeSpa####n
#### QuoteSpan
#### MaskFilterSpan
#### LeadingMarginSpanStandard
#### ImageSpan
#### IconMarginSpan
#### ForegroundColorSpan
#### DrawableMarginSpan
#### BulletSpan
#### BackgroundColorSpan
#### AlignmentSpanStandard
#### AbsoluteSizeSpan
#### ClickableSpan

## 使用方式

### 1.单一的改变
```
TextViewSpanUtils.Builder builder = TextViewSpanUtils.getBuilder(this, data);
builder.setStrikeThroughSpan(0, 2);
builder.setColorSpan(0, 2, Color.RED);
builder.setStrikeThroughSpan(11, 14);
builder.setUnderlineSpan(15, 18);
builder.setSizeSpan(data.length() - 2, data.length(), 40);
tvTestData.setText(builder.create());
```

### 2.多种层次的改变
```
TextViewSpanUtils.Builder builder = TextViewSpanUtils.getBuilder(this, data);
TextViewModel model = new TextViewModel();
model.setIndex(1);
model.setEnd(2);
model.setTextColor(Color.RED);

TextViewModel model2 = new TextViewModel();
model2.setIndex(4);
model2.setEnd(7);
model2.setTextColor(Color.RED);
builder.add(model2);

builder.add(model);
builder.add(model2);
tvTestData.setText(builder.create());
```

