package operation;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import model.PolicyHolder;
import service.PolicyHolderService;

@Component
public class PolicyHolderOperation {

	@Autowired
	private PolicyHolderService policyHolderService;
	
	public void insertPolicyHolder(PolicyHolder policyHolder) {
		if(policyHolder.getSqPolicyHolder() == 0){
			policyHolderService.getSetNextSequence();
		}
		policyHolderService.savePolicyHolder(policyHolder);
		
	}
	//@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Transactional
	public void removePolicyHolder (PolicyHolder policyHolder){
		policyHolderService.removePolicyHolder(policyHolder);
	}
	
	public void updatePolicyHolder (PolicyHolder policyHolder){
		policyHolderService.updatePolicyHolder(policyHolder);
	}
	
	public int getSetNextSequence(){
		return policyHolderService.getSetNextSequence();
	}
	
	public PolicyHolder findPolicyHolderById (int policyHolderSequence){
		
		return policyHolderService.findPolicyHolderById(policyHolderSequence);
		
	}
	
	public List<PolicyHolder> findPolicyHolderByPartnerName (String partnerName){

		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(PolicyHolder.class)
				.add(Restrictions.like("partnerName", partnerName));
				
		List<PolicyHolder> listPolicyHolders = policyHolderService.findPolicyHolderByCrit(crit);
		
		return listPolicyHolders;
	}
	
	public List<PolicyHolder> findPolicyHolderByNIF (String NIFCode){

		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(PolicyHolder.class)
				.add(Restrictions.eq("NIFCode", NIFCode));
				
		List<PolicyHolder> listPolicyHolders = policyHolderService.findPolicyHolderByCrit(crit);
		
		return listPolicyHolders;
	}

	
	public void flushClearSession(){
		policyHolderService.flushClearSession();
	}
}
