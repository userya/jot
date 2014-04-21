/**
 */
package jot.model.package_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jot.model.package_.PackageFactory
 * @model kind="package"
 * @generated
 */
public interface PackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "package";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.jot.org/package/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagePackage eINSTANCE = jot.model.package_.impl.PackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.PackageImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXTENDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INTERCEPTORS = 4;

	/**
	 * The feature id for the '<em><b>Exception Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXCEPTION_MAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SERVICES = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ACTIONS = 7;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.BaseElementImpl <em>Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.BaseElementImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.InterceptorImpl <em>Interceptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.InterceptorImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getInterceptor()
	 * @generated
	 */
	int INTERCEPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR__CLASS = BASE_ELEMENT__CLASS;

	/**
	 * The number of structural features of the '<em>Interceptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ExceptionMappingImpl <em>Exception Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ExceptionMappingImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getExceptionMapping()
	 * @generated
	 */
	int EXCEPTION_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPING__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPING__CLASS = BASE_ELEMENT__CLASS;

	/**
	 * The number of structural features of the '<em>Exception Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ActionImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CLASS = BASE_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__METHOD = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ServiceImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLASS = BASE_ELEMENT__CLASS;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link jot.model.package_.impl.InterceptorsImpl <em>Interceptors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.InterceptorsImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getInterceptors()
	 * @generated
	 */
	int INTERCEPTORS = 6;

	/**
	 * The feature id for the '<em><b>Interceptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS__INTERCEPTOR = 0;

	/**
	 * The number of structural features of the '<em>Interceptors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ExceptionMappingsImpl <em>Exception Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ExceptionMappingsImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getExceptionMappings()
	 * @generated
	 */
	int EXCEPTION_MAPPINGS = 7;

	/**
	 * The feature id for the '<em><b>Exception Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPINGS__EXCEPTION_MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Exception Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ServicesImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jot.model.package_.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.package_.impl.ActionsImpl
	 * @see jot.model.package_.impl.PackagePackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 9;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link jot.model.package_.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see jot.model.package_.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jot.model.package_.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.Package#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see jot.model.package_.Package#getExtends()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Extends();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.Package#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see jot.model.package_.Package#getNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.Package#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see jot.model.package_.Package#isAbstract()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link jot.model.package_.Package#getInterceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptors</em>'.
	 * @see jot.model.package_.Package#getInterceptors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Interceptors();

	/**
	 * Returns the meta object for the containment reference '{@link jot.model.package_.Package#getExceptionMappings <em>Exception Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Mappings</em>'.
	 * @see jot.model.package_.Package#getExceptionMappings()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ExceptionMappings();

	/**
	 * Returns the meta object for the containment reference '{@link jot.model.package_.Package#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see jot.model.package_.Package#getActions()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link jot.model.package_.Package#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see jot.model.package_.Package#getServices()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Services();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Interceptor <em>Interceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor</em>'.
	 * @see jot.model.package_.Interceptor
	 * @generated
	 */
	EClass getInterceptor();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.ExceptionMapping <em>Exception Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Mapping</em>'.
	 * @see jot.model.package_.ExceptionMapping
	 * @generated
	 */
	EClass getExceptionMapping();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see jot.model.package_.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.Action#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see jot.model.package_.Action#getMethod()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Method();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see jot.model.package_.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Element</em>'.
	 * @see jot.model.package_.BaseElement
	 * @generated
	 */
	EClass getBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.BaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jot.model.package_.BaseElement#getName()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.package_.BaseElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see jot.model.package_.BaseElement#getClass_()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Class();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Interceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptors</em>'.
	 * @see jot.model.package_.Interceptors
	 * @generated
	 */
	EClass getInterceptors();

	/**
	 * Returns the meta object for the containment reference list '{@link jot.model.package_.Interceptors#getInterceptor <em>Interceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor</em>'.
	 * @see jot.model.package_.Interceptors#getInterceptor()
	 * @see #getInterceptors()
	 * @generated
	 */
	EReference getInterceptors_Interceptor();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.ExceptionMappings <em>Exception Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Mappings</em>'.
	 * @see jot.model.package_.ExceptionMappings
	 * @generated
	 */
	EClass getExceptionMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link jot.model.package_.ExceptionMappings#getExceptionMapping <em>Exception Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Mapping</em>'.
	 * @see jot.model.package_.ExceptionMappings#getExceptionMapping()
	 * @see #getExceptionMappings()
	 * @generated
	 */
	EReference getExceptionMappings_ExceptionMapping();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see jot.model.package_.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the containment reference list '{@link jot.model.package_.Services#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see jot.model.package_.Services#getService()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Service();

	/**
	 * Returns the meta object for class '{@link jot.model.package_.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see jot.model.package_.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the containment reference list '{@link jot.model.package_.Actions#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see jot.model.package_.Actions#getAction()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageFactory getPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.PackageImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__EXTENDS = eINSTANCE.getPackage_Extends();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAMESPACE = eINSTANCE.getPackage_Namespace();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ABSTRACT = eINSTANCE.getPackage_Abstract();

		/**
		 * The meta object literal for the '<em><b>Interceptors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__INTERCEPTORS = eINSTANCE.getPackage_Interceptors();

		/**
		 * The meta object literal for the '<em><b>Exception Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EXCEPTION_MAPPINGS = eINSTANCE.getPackage_ExceptionMappings();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTIONS = eINSTANCE.getPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SERVICES = eINSTANCE.getPackage_Services();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.InterceptorImpl <em>Interceptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.InterceptorImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getInterceptor()
		 * @generated
		 */
		EClass INTERCEPTOR = eINSTANCE.getInterceptor();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ExceptionMappingImpl <em>Exception Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ExceptionMappingImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getExceptionMapping()
		 * @generated
		 */
		EClass EXCEPTION_MAPPING = eINSTANCE.getExceptionMapping();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ActionImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__METHOD = eINSTANCE.getAction_Method();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ServiceImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.BaseElementImpl <em>Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.BaseElementImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getBaseElement()
		 * @generated
		 */
		EClass BASE_ELEMENT = eINSTANCE.getBaseElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__NAME = eINSTANCE.getBaseElement_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__CLASS = eINSTANCE.getBaseElement_Class();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.InterceptorsImpl <em>Interceptors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.InterceptorsImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getInterceptors()
		 * @generated
		 */
		EClass INTERCEPTORS = eINSTANCE.getInterceptors();

		/**
		 * The meta object literal for the '<em><b>Interceptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTORS__INTERCEPTOR = eINSTANCE.getInterceptors_Interceptor();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ExceptionMappingsImpl <em>Exception Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ExceptionMappingsImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getExceptionMappings()
		 * @generated
		 */
		EClass EXCEPTION_MAPPINGS = eINSTANCE.getExceptionMappings();

		/**
		 * The meta object literal for the '<em><b>Exception Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_MAPPINGS__EXCEPTION_MAPPING = eINSTANCE.getExceptionMappings_ExceptionMapping();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ServicesImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__SERVICE = eINSTANCE.getServices_Service();

		/**
		 * The meta object literal for the '{@link jot.model.package_.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.package_.impl.ActionsImpl
		 * @see jot.model.package_.impl.PackagePackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__ACTION = eINSTANCE.getActions_Action();

	}

} //PackagePackage
