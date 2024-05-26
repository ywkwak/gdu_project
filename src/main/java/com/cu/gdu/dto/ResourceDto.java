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
@ToString
@Builder
public class ResourceDto {

	private int resNo;
	private String resType;
	private String resName;
	private String resDetail;
	private String useStatus;
	private String resGps;
	private String registDate;
	private String modifyDate;
	private int stock;
	private String status;
	private String delContent;
}
