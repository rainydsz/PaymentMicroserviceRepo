/*
	@Created by Prashant,Tauseef,Tarun and Rainy
*/

package com.ecommerce.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

	// @Autowired
	// JdbcTemplate jdbcTemplate;

	/*
	 * @Override public void run(String... strings) throws Exception {
	 * 
	 * 
	 * jdbcTemplate.execute("CREATE TABLE orders (" +
	 * "order_id SERIAL, user_id VARCHAR(255), order_details VARCHAR(255), order_time TIMESTAMP, order_total DOUBLE)"
	 * );
	 * 
	 * 
	 * jdbcTemplate.execute("CREATE TABLE payment_details (" +
	 * "payment_id SERIAL, status VARCHAR(255), order_id  VARCHAR(255), order_amount VARCHAR(255), order_details VARCHAR(255))"
	 * );
	 * 
	 * 
	 * }
	 */

}
