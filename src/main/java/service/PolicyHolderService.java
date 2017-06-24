package service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import bo.GenericBo;
import model.PolicyHolder;

@Component
public class PolicyHolderService {

	@Autowired
	@Qualifier("policyHolderBo")
	GenericBo<PolicyHolder, Integer> policyHolderBo;
	
	public void setPolicyHolderBo(GenericBo<PolicyHolder, Integer> policyHolderBo) {
		this.policyHolderBo = policyHolderBo;
	}
	
	/** **/
			
	public void savePolicyHolder(PolicyHolder policyHolder)
	{
		policyHolderBo.save(policyHolder);
	}

	public void removePolicyHolder(PolicyHolder policyHolder)
	{
		policyHolderBo.remove(policyHolder);
	}
	
	public void updatePolicyHolder(PolicyHolder policyHolder)
	{
		policyHolderBo.update(policyHolder);
	}
	
	public List<PolicyHolder> findPolicyHolderByCrit(DetachedCriteria crit)
	{
		List<PolicyHolder> policyHolderList = policyHolderBo.findByCriteria(crit);
		
		if (policyHolderList.isEmpty()) 
			return null;
		else
			return policyHolderList;		
	}
	
	public PolicyHolder findPolicyHolderById (int policyHolderSequence){
		PolicyHolder policyHolder = new PolicyHolder();
		policyHolder = policyHolderBo.findById(policyHolderSequence);
		return policyHolder;

	}
	
	public int getSetNextSequence(){
		
		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(PolicyHolder.class)
				.addOrder(Order.desc("policyHolderSequence"));
		
		List<PolicyHolder> listPolicyHolders = policyHolderBo.findByCriteria(crit);
		
		return listPolicyHolders.get(0).getPolicyHolderSequence() + 1;
	}
	
	 /* Flush and Clear session for batch process
	 */
	public void flushClearSession() {
		policyHolderBo.getCurrentSession().flush();
		policyHolderBo.getCurrentSession().clear();
	}

}
