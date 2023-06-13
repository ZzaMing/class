package org.zerock.bjtotal.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReplyDTO {
    
    private Long rno;
    private Long tno;
    private String reply;
    private String replyer;
    
    @Builder.Default
    private Long gno = 0L;

    private int step;
    
    private LocalDate replyDate;
}