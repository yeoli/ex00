package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
//필수 필드만 파라미터만 갖는 생성자 생성
@RequiredArgsConstructor
public class SampleHotel {
  
  @NonNull
  private Chef chef;
  
	/*
	 * public SampleHotel(Chef chef) { this.chef = chef; }
	 */
}
