package six.support.lottie.model.animatable;

import six.support.lottie.value.Keyframe;
import six.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import six.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import six.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
