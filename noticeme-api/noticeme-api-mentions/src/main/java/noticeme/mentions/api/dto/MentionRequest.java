package noticeme.mentions.api.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MentionRequest {
    private @NotEmpty String name;
    private @NotEmpty String content;
}
