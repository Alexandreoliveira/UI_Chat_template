
package alexandre.com.br.ui_chat.commons;

import android.widget.ImageView;

/**
 * Callback for implementing images loading in message list
 */
public interface ImageLoader {

    void loadImage(ImageView imageView, String url);

}
