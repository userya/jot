/**
 */
package jot.model.package_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.package_.Services#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.package_.PackagePackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link jot.model.package_.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see jot.model.package_.PackagePackage#getServices_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

} // Services
