package io.stonks.postplace.exception.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostPlaceExceptionDTO {

    String title;

    Integer code;

    String message;

}
