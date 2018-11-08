package six.support.lottie.model.animatable;

import android.graphics.Path;

import six.support.lottie.value.Keyframe;
import six.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import six.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import six.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
