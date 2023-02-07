package br.dev.tsantana.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.tsantana.hrpayroll.feignclients.WorkerFeignClient;
import br.dev.tsantana.hrpayroll.model.Payment;
import br.dev.tsantana.hrpayroll.model.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
