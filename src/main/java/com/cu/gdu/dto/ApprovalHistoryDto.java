package com.cu.gdu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ApprovalHistoryDto {
	
	private String appYn;
	private String appDate;
	private int appHistoryNo;
	private MemberDto approver;
	private String approverNo;
	private String nowApprover;
	private String comment;

}
