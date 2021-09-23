package noticeme.mentions.exception;

public class MentionNotFoundException extends RuntimeException {
    public MentionNotFoundException(Long id) {
        super("mention id " + id + "has not been found");
    }
}
