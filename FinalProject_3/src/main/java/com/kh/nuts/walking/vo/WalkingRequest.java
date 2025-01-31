package com.kh.nuts.walking.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class WalkingRequest {

	int wr_no;             	  //번호   
	String contents;          //신청 내용
	String stat;              //상태   
	String respone_id;        //받는 사람
	String request_id;        //신청자  
	String party_no;		  //모임번호
                                   
}
