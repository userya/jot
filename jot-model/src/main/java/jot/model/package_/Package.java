/**
 */
package jot.model.package_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.package_.Package#getExtends <em>Extends</em>}</li>
 *   <li>{@link jot.model.package_.Package#getName <em>Name</em>}</li>
 *   <li>{@link jot.model.package_.Package#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link jot.model.package_.Package#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link jot.model.package_.Package#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link jot.model.package_.Package#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link jot.model.package_.Package#getServices <em>Services</em>}</li>
 *   <li>{@link jot.model.package_.Package#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.package_.PackagePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jot.model.package_.PackagePackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see jot.model.package_.PackagePackage#getPackage_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see jot.model.package_.PackagePackage#getPackage_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see jot.model.package_.PackagePackage#getPackage_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptors</em>' containment reference.
	 * @see #setInterceptors(Interceptors)
	 * @see jot.model.package_.PackagePackage#getPackage_Interceptors()
	 * @model containment="true"
	 * @generated
	 */
	Interceptors getInterceptors();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getInterceptors <em>Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interceptors</em>' containment reference.
	 * @see #getInterceptors()
	 * @generated
	 */
	void setInterceptors(Interceptors value);

	/**
	 * Returns the value of the '<em><b>Exception Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Mappings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Mappings</em>' containment reference.
	 * @see #setExceptionMappings(ExceptionMappings)
	 * @see jot.model.package_.PackagePackage#getPackage_ExceptionMappings()
	 * @model containment="true"
	 * @generated
	 */
	ExceptionMappings getExceptionMappings();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getExceptionMappings <em>Exception Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Mappings</em>' containment reference.
	 * @see #getExceptionMappings()
	 * @generated
	 */
	void setExceptionMappings(ExceptionMappings value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Actions)
	 * @see jot.model.package_.PackagePackage#getPackage_Actions()
	 * @model containment="true"
	 * @generated
	 */
	Actions getActions();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Actions value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see jot.model.package_.PackagePackage#getPackage_Services()
	 * @model containment="true"
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link jot.model.package_.Package#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

} // Package
