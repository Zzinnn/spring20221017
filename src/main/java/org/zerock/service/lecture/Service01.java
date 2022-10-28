package org.zerock.service.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.mapper.lecture.Mapper11;

// @Component  //class 객체를 만들어줌
@Service //@Component 포함되어 있다 비즈니스 계층에 있는 빈으로 만들어줌 
//mvc 관련 설정 servlet-context.xml
//service는 root-context.xml
public class Service01 {

	@Autowired
	private Mapper11 mapper;
	
	public JavaBean18 getCustomer(int id) {
		// 비지니스 로직
		return mapper.getCustomerById(id);
		
	}
	
	@Transactional
	//transaction 설정 root.context.xml
	public void transferMoney() {
		// 1번 고객의 돈을(500원)
		// 2번 고객에게 전달
		int cnt = mapper.updateBank(1, -500);
		System.out.println(cnt + "건 성공");
		int a = 3/0;
		
		mapper.updateBank(2, 500);
	}

}





