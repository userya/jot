/**
 */
package web;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link web.Package#getName <em>Name</em>}</li>
 *   <li>{@link web.Package#getExtends <em>Extends</em>}</li>
 *   <li>{@link web.Package#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link web.Package#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link web.Package#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link web.Package#getActions <em>Actions</em>}</li>
 *   <li>{@link web.Package#getServices <em>Services</em>}</li>
 *   <li>{@link web.Package#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see web.WebPackage#getPackage()
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
	 * @see web.WebPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link web.Package#getName <em>Name</em>}' attribute.
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
	 * @see web.WebPackage#getPackage_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link web.Package#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see web.WebPackage#getPackage_Abstract()
	 * @model
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link web.Package#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exception Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Mappings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Mappings</em>' reference.
	 * @see #setExceptionMappings(exceptionMapping)
	 * @see web.WebPackage#getPackage_ExceptionMappings()
	 * @model
	 * @generated
	 */
	exceptionMapping getExceptionMappings();

	/**
	 * Sets the value of the '{@link web.Package#getExceptionMappings <em>Exception Mappings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Mappings</em>' reference.
	 * @see #getExceptionMappings()
	 * @generated
	 */
	void setExceptionMappings(exceptionMapping value);

	/**
	 * Returns the value of the '<em><b>Interceptors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptors</em>' reference.
	 * @see #setInterceptors(Interceptor)
	 * @see web.WebPackage#getPackage_Interceptors()
	 * @model
	 * @generated
	 */
	Interceptor getInterceptors();

	/**
	 * Sets the value of the '{@link web.Package#getInterceptors <em>Interceptors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interceptors</em>' reference.
	 * @see #getInterceptors()
	 * @generated
	 */
	void setInterceptors(Interceptor value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference.
	 * @see #setActions(Action)
	 * @see web.WebPackage#getPackage_Actions()
	 * @model
	 * @generated
	 */
	Action getActions();

	/**
	 * Sets the value of the '{@link web.Package#getActions <em>Actions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Action value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(Service)
	 * @see web.WebPackage#getPackage_Services()
	 * @model
	 * @generated
	 */
	Service getServices();

	/**
	 * Sets the value of the '{@link web.Package#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Service value);

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
	 * @see web.WebPackage#getPackage_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link web.Package#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Package
