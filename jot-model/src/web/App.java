/**
 */
package web;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link web.App#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see web.WebPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference.
	 * @see #setPackages(PackageResource)
	 * @see web.WebPackage#getApp_Packages()
	 * @model
	 * @generated
	 */
	PackageResource getPackages();

	/**
	 * Sets the value of the '{@link web.App#getPackages <em>Packages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(PackageResource value);

} // App
