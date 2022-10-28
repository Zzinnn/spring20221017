package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;

public interface Mapper11 {
	// 몇개의 메소드가 실행됐는지 int로 받을 수 있다
	int updateCustomer(JavaBean18 customer);
	
	JavaBean18 getCustomerById(int id);

	int updateSuppliers(JavaBean19 supplier);
	
	JavaBean19 getSupplierById(int id);
	
	int updateSupplier(JavaBean19 supplier);

	void updateBank(int account, int money);
}

