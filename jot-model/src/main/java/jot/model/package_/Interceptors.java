/**
 */
package jot.model.package_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interceptors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.package_.Interceptors#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.package_.PackagePackage#getInterceptors()
 * @model
 * @generated
 */
public interface Interceptors extends EObject {
	/**
	 * Returns the value of the '<em><b>Interceptor</b></em>' containment reference list.
	 * The list contents are of type {@link jot.model.package_.Interceptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor</em>' containment reference list.
	 * @see jot.model.package_.PackagePackage#getInterceptors_Interceptor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interceptor> getInterceptor();

} // Interceptors
