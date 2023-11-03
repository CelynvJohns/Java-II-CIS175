package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Characters;

@Configuration
public class BeanConfiguration {
	@Bean
	public Characters character( ) {
		Characters bean= new Characters("Jake", "the Dog");
		bean.setAge(12);
		return bean;
	}
	@Bean
	public Address address() {
		Address bean = new Address("Tree House", "Grasslands", "Land of OOO");
		return bean;
	}
}