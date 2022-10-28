package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;

public interface Mapper10 {
	public int removeCustomer();
	
	public int removeEmployee();
	
	public int removeCustomerById(int id);
	
	public int removeEmployeeById(int id);
	
	int addCustomer();

	int addSupplier();
	
	int insertCustomer(JavaBean18 customer);
	
	int insertSupplier(JavaBean19 supplier);

	public int insertCustomerAndGetKey(JavaBean18 customer);

	public int insertSupplierAndGetKey(JavaBean19 supplier);
}
