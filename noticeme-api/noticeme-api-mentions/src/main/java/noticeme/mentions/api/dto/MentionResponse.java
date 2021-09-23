package noticeme.mentions.api.dto;

import lombok.Getter;
import noticeme.mentions.domain.Mention;

import java.time.LocalDateTime;

@Getter
public class MentionResponse {

    private Long id;
    private String name;
    private String content;
    private LocalDateTime createdAt;

    public MentionResponse(Mention mention) {
        this.id = mention.getId();
        this.name = mention.getName();
        this.content = mention.getContent();
        this.createdAt = mention.getCreatedAt();
    }

    public static MentionResponse of(Mention mention) {
        return new MentionResponse(mention);
    }
}
