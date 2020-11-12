package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public interface EmailService {

	public void sendMail(String toAddress,String fromAddress,String  content);

}
