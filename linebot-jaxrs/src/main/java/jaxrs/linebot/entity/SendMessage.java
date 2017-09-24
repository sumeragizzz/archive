package jaxrs.linebot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SendMessage {

    private List<String> to;

    private BigDecimal toChannel;

    private String eventType;

    private Content content;

    public SendMessage() {
        to = new ArrayList<>();
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public void addTo(String to) {
        this.to.add(to);
    }

    public BigDecimal getToChannel() {
        return toChannel;
    }

    public void setToChannel(BigDecimal toChannel) {
        this.toChannel = toChannel;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public static class Content {

        private BigDecimal contentType;

        private BigDecimal toType;

        private String text;

        public Content() {
        }

        public BigDecimal getContentType() {
            return contentType;
        }

        public void setContentType(BigDecimal contentType) {
            this.contentType = contentType;
        }

        public BigDecimal getToType() {
            return toType;
        }

        public void setToType(BigDecimal toType) {
            this.toType = toType;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

}
