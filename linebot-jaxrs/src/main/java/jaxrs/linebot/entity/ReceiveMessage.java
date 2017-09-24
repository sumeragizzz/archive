package jaxrs.linebot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReceiveMessage {

    public ReceiveMessage() {
        result = new ArrayList<>();
    }

    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public void addResult(Result result) {
        this.result.add(result);
    }

    public static class Result {

        public Result() {
        }

        private Content content;

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

    }

    public static class Content {

        private BigDecimal contentType;

        private String from;

        private String text;

        public Content() {
        }

        public BigDecimal getContentType() {
            return contentType;
        }

        public void setContentType(BigDecimal contentType) {
            this.contentType = contentType;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

}
