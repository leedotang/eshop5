package work.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO dao;
	
	@Override
	public void insertPaymentSuccess(PaymentVO vo) {
		
		dao.insertPaymentSuccess(vo);
		
	}
	
}
