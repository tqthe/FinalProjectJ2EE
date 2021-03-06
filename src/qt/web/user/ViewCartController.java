/**
 * 
 */
package qt.web.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;

import qt.dto.CartItem;

/**
 * @author tqthe
 * 
 */
public class ViewCartController implements Controller {

	protected final Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("Handle view cart request at " + new Date());
		
		// get current HttpSession to store a cart item
		HttpSession session = request.getSession(false);

		if (session == null) {
			return new ModelAndView(new RedirectView("requiredLogin.html"));
		}
		
		// get current cart
		Map<Integer, Object> cart = (Map<Integer, Object>) session
				.getAttribute("cart");
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		if (cart != null) {
			double total = 0.0;
			Iterator<Entry<Integer, Object>> iter = cart.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<Integer, Object> e = iter.next();
				CartItem item = (CartItem) e.getValue();
				total += item.getProduct().getGiaHienHanh() * item.getQuantity();
			}
			model.put("total", total);
		}
		
		return new ModelAndView("user/viewCart", "model", model);
	}

}
