USER Class
/**
 * 
 */

/** 
 * @author STUDENT
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DeliveryPerson {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer assignedOrders;

	/** 
	 * @return the assignedOrders
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getAssignedOrders() {
		// begin-user-code
		return assignedOrders;
		// end-user-code
	}

	/** 
	 * @param theAssignedOrders the assignedOrders to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAssignedOrders(Integer theAssignedOrders) {
		// begin-user-code
		assignedOrders = theAssignedOrders;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String currentlocation;

	/** 
	 * @return the currentlocation
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getCurrentlocation() {
		// begin-user-code
		return currentlocation;
		// end-user-code
	}

	/** 
	 * @param theCurrentlocation the currentlocation to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCurrentlocation(String theCurrentlocation) {
		// begin-user-code
		currentlocation = theCurrentlocation;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;

	/** 
	 * @return the name
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/** 
	 * @param theName the name to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setName(String theName) {
		// begin-user-code
		name = theName;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer deliverypersonid;

	/** 
	 * @return the deliverypersonid
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getDeliverypersonid() {
		// begin-user-code
		return deliverypersonid;
		// end-user-code
	}

	/** 
	 * @param theDeliverypersonid the deliverypersonid to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDeliverypersonid(Integer theDeliverypersonid) {
		// begin-user-code
		deliverypersonid = theDeliverypersonid;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Manager manager;

	/** 
	 * @return the manager
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Manager getManager() {
		// begin-user-code
		return manager;
		// end-user-code
	}

	/** 
	 * @param theManager the manager to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setManager(Manager theManager) {
		// begin-user-code
		manager = theManager;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DeliveryOrders deliveryorders;

	/** 
	 * @return the deliveryorders
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DeliveryOrders getDeliveryorders() {
		// begin-user-code
		return deliveryorders;
		// end-user-code
	}
	// Version 2 update - added method to show delivery info
	public void showDeliveryInfo() {
	System.out.println("Delivery Person ID: " + deliverypersonid);
	System.out.println("Name: " + name);
	System.out.println("Current Location: " + currentlocation);
	}

	/** 
	 * @param theDeliveryorders the deliveryorders to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDeliveryorders(DeliveryOrders theDeliveryorders) {
		// begin-user-code
		deliveryorders = theDeliveryorders;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void UpdateDeliveryStatus() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void viewAssignedDeliveries() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}
