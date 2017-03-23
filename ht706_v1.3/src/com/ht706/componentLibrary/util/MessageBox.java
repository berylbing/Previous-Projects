package com.ht706.componentLibrary.util;



public class MessageBox {
	
    private String message = new String(); //提示消息
    private String image = new String(); //提示图片(1--成功提示,2--错误提示,3--严重警告)
    private String redirection = new String(); //最终到达的页面

    public MessageBox() {
    }

    /**
     * 消息框
     * @param message
     * @param image
     * @param redirection
     */
    public MessageBox(String message, String image, String redirection) {
        this.message = message;
        this.image = image;
        this.redirection = redirection;
    }

    /**
     * 确认框
     * @param message
     * @param image
     */
    public MessageBox(String message, String image) {
        this.message = message;
        this.image = image;
    }

    /**
     * 
     * @param message
     */
    public MessageBox(String message) {
        this.message = message;
        this.image = "0";
    }

    /**
     * @return Returns the image.
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image to set.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return Returns the redirection.
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * @param redirection The redirection to set.
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }
}
