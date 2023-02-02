package work.payment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value = "/work/payment/payment.do", method=RequestMethod.GET)
	public ModelAndView fwdPaymentPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/paymentDone.do")
	public ModelAndView fwdPaymentSuccessPage() {
		return new ModelAndView("paymentSuccess");
	}
	
	@RequestMapping(value = "/paymentProcess.do")
	public void paymentDone(@RequestBody PaymentVO vo) {
		paymentService.insertPaymentSuccess(vo);
	}
	
	@RequestMapping(value = {"/goMain.do", "/"})
	public ModelAndView goMain() {
		return new ModelAndView("payment");
	}
}
