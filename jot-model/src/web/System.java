/**
 */
package web;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link web.System#getApps <em>Apps</em>}</li>
 * </ul>
 * </p>
 *
 * @see web.WebPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Apps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' reference.
	 * @see #setApps(AppResource)
	 * @see web.WebPackage#getSystem_Apps()
	 * @model
	 * @generated
	 */
	AppResource getApps();

	/**
	 * Sets the value of the '{@link web.System#getApps <em>Apps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apps</em>' reference.
	 * @see #getApps()
	 * @generated
	 */
	void setApps(AppResource value);

} // System
