package org.zerock.domain.lecture;

import lombok.Data;

@Data
public class JavaBean09 {
	private String Id;
	private String Name;
	private double price;
	private JavaBean10 Supplier;
}
