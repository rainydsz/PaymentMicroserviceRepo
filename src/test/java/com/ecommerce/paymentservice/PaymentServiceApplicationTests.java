package com.ecommerce.paymentservice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ecommerce.paymentservice.dao.PaymentDao;
import com.ecommerce.paymentservice.model.PaymentDetailsModel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class PaymentServiceApplicationTests {

	public class SearchTest {

		@Autowired
		private PaymentDao mapper;

		@Test
		public void firsttest() {
			PaymentDetailsModel pay = new PaymentDetailsModel();
			assertEquals("SUCCESS", pay.getStatus());
		}
	}
}
