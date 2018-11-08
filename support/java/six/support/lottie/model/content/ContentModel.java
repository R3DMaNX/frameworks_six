package six.support.lottie.model.content;


import android.support.annotation.Nullable;

import six.support.lottie.LottieDrawable;
import six.support.lottie.animation.content.Content;
import six.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
