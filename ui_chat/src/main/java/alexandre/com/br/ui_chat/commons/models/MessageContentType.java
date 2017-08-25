package alexandre.com.br.ui_chat.commons.models;

public interface MessageContentType extends IMessage {

    /**
     * Default media type for image message.
     */
    interface Image extends IMessage {
        String getImageUrl();
    }

    // other default types will be here

}
