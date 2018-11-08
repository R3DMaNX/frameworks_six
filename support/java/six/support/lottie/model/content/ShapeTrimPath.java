package six.support.lottie.model.content;

import six.support.lottie.LottieDrawable;
import six.support.lottie.animation.content.Content;
import six.support.lottie.animation.content.TrimPathContent;
import six.support.lottie.model.animatable.AnimatableFloatValue;
import six.support.lottie.model.layer.BaseLayer;

public class ShapeTrimPath implements ContentModel {

  public enum Type {
    Simultaneously,
    Individually;

    public static Type forId(int id) {
      switch (id) {
        case 1:
          return Simultaneously;
        case 2:
          return Individually;
        default:
          throw new IllegalArgumentException("Unknown trim path type " + id);
      }
    }
  }

  private final String name;
  private final Type type;
  private final AnimatableFloatValue start;
  private final AnimatableFloatValue end;
  private final AnimatableFloatValue offset;

  public ShapeTrimPath(String name, Type type, AnimatableFloatValue start,
      AnimatableFloatValue end, AnimatableFloatValue offset) {
    this.name = name;
    this.type = type;
    this.start = start;
    this.end = end;
    this.offset = offset;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  public AnimatableFloatValue getEnd() {
    return end;
  }

  public AnimatableFloatValue getStart() {
    return start;
  }

  public AnimatableFloatValue getOffset() {
    return offset;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new TrimPathContent(layer, this);
  }

  @Override public String toString() {
    return "Trim Path: {start: " + start + ", end: " + end + ", offset: " + offset + "}";
  }
}
