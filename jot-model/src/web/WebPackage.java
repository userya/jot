/**
 */
package web;

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
 * @see web.WebFactory
 * @model kind="package"
 * @generated
 */
public interface WebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "web";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://web/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "web";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebPackage eINSTANCE = web.impl.WebPackageImpl.init();

	/**
	 * The meta object id for the '{@link web.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.SystemImpl
	 * @see web.impl.WebPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPS = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link web.impl.AppResourceImpl <em>App Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.AppResourceImpl
	 * @see web.impl.WebPackageImpl#getAppResource()
	 * @generated
	 */
	int APP_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESOURCE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>App Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link web.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.AppImpl
	 * @see web.impl.WebPackageImpl#getApp()
	 * @generated
	 */
	int APP = 2;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link web.impl.PackageResourceImpl <em>Package Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.PackageResourceImpl
	 * @see web.impl.WebPackageImpl#getPackageResource()
	 * @generated
	 */
	int PACKAGE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOURCE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Package Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link web.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.PackageImpl
	 * @see web.impl.WebPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Exception Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXCEPTION_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Interceptors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INTERCEPTORS = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SERVICES = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACE = 7;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link web.impl.InterceptorImpl <em>Interceptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.InterceptorImpl
	 * @see web.impl.WebPackageImpl#getInterceptor()
	 * @generated
	 */
	int INTERCEPTOR = 5;

	/**
	 * The number of structural features of the '<em>Interceptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link web.impl.exceptionMappingImpl <em>exception Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.exceptionMappingImpl
	 * @see web.impl.WebPackageImpl#getexceptionMapping()
	 * @generated
	 */
	int EXCEPTION_MAPPING = 6;

	/**
	 * The number of structural features of the '<em>exception Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link web.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.ActionImpl
	 * @see web.impl.WebPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__METHOD = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link web.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see web.impl.ServiceImpl
	 * @see web.impl.WebPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link web.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see web.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference '{@link web.System#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apps</em>'.
	 * @see web.System#getApps()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Apps();

	/**
	 * Returns the meta object for class '{@link web.AppResource <em>App Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Resource</em>'.
	 * @see web.AppResource
	 * @generated
	 */
	EClass getAppResource();

	/**
	 * Returns the meta object for the attribute '{@link web.AppResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see web.AppResource#getName()
	 * @see #getAppResource()
	 * @generated
	 */
	EAttribute getAppResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link web.AppResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see web.AppResource#getResource()
	 * @see #getAppResource()
	 * @generated
	 */
	EAttribute getAppResource_Resource();

	/**
	 * Returns the meta object for class '{@link web.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see web.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the reference '{@link web.App#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Packages</em>'.
	 * @see web.App#getPackages()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Packages();

	/**
	 * Returns the meta object for class '{@link web.PackageResource <em>Package Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Resource</em>'.
	 * @see web.PackageResource
	 * @generated
	 */
	EClass getPackageResource();

	/**
	 * Returns the meta object for the attribute '{@link web.PackageResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see web.PackageResource#getName()
	 * @see #getPackageResource()
	 * @generated
	 */
	EAttribute getPackageResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link web.PackageResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see web.PackageResource#getResource()
	 * @see #getPackageResource()
	 * @generated
	 */
	EAttribute getPackageResource_Resource();

	/**
	 * Returns the meta object for class '{@link web.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see web.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link web.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see web.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link web.Package#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see web.Package#getExtends()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Extends();

	/**
	 * Returns the meta object for the attribute '{@link web.Package#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see web.Package#getAbstract()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Abstract();

	/**
	 * Returns the meta object for the reference '{@link web.Package#getExceptionMappings <em>Exception Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Mappings</em>'.
	 * @see web.Package#getExceptionMappings()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ExceptionMappings();

	/**
	 * Returns the meta object for the reference '{@link web.Package#getInterceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interceptors</em>'.
	 * @see web.Package#getInterceptors()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Interceptors();

	/**
	 * Returns the meta object for the reference '{@link web.Package#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actions</em>'.
	 * @see web.Package#getActions()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Actions();

	/**
	 * Returns the meta object for the reference '{@link web.Package#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see web.Package#getServices()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Services();

	/**
	 * Returns the meta object for the attribute '{@link web.Package#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see web.Package#getNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Namespace();

	/**
	 * Returns the meta object for class '{@link web.Interceptor <em>Interceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor</em>'.
	 * @see web.Interceptor
	 * @generated
	 */
	EClass getInterceptor();

	/**
	 * Returns the meta object for class '{@link web.exceptionMapping <em>exception Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exception Mapping</em>'.
	 * @see web.exceptionMapping
	 * @generated
	 */
	EClass getexceptionMapping();

	/**
	 * Returns the meta object for class '{@link web.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see web.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link web.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see web.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link web.Action#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see web.Action#getClass_()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Class();

	/**
	 * Returns the meta object for the attribute '{@link web.Action#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see web.Action#getMethod()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Method();

	/**
	 * Returns the meta object for class '{@link web.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see web.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link web.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see web.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link web.Service#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see web.Service#getClass_()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebFactory getWebFactory();

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
		 * The meta object literal for the '{@link web.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.SystemImpl
		 * @see web.impl.WebPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__APPS = eINSTANCE.getSystem_Apps();

		/**
		 * The meta object literal for the '{@link web.impl.AppResourceImpl <em>App Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.AppResourceImpl
		 * @see web.impl.WebPackageImpl#getAppResource()
		 * @generated
		 */
		EClass APP_RESOURCE = eINSTANCE.getAppResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_RESOURCE__NAME = eINSTANCE.getAppResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_RESOURCE__RESOURCE = eINSTANCE.getAppResource_Resource();

		/**
		 * The meta object literal for the '{@link web.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.AppImpl
		 * @see web.impl.WebPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__PACKAGES = eINSTANCE.getApp_Packages();

		/**
		 * The meta object literal for the '{@link web.impl.PackageResourceImpl <em>Package Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.PackageResourceImpl
		 * @see web.impl.WebPackageImpl#getPackageResource()
		 * @generated
		 */
		EClass PACKAGE_RESOURCE = eINSTANCE.getPackageResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_RESOURCE__NAME = eINSTANCE.getPackageResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_RESOURCE__RESOURCE = eINSTANCE.getPackageResource_Resource();

		/**
		 * The meta object literal for the '{@link web.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.PackageImpl
		 * @see web.impl.WebPackageImpl#getPackage()
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
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ABSTRACT = eINSTANCE.getPackage_Abstract();

		/**
		 * The meta object literal for the '<em><b>Exception Mappings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EXCEPTION_MAPPINGS = eINSTANCE.getPackage_ExceptionMappings();

		/**
		 * The meta object literal for the '<em><b>Interceptors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__INTERCEPTORS = eINSTANCE.getPackage_Interceptors();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTIONS = eINSTANCE.getPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SERVICES = eINSTANCE.getPackage_Services();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAMESPACE = eINSTANCE.getPackage_Namespace();

		/**
		 * The meta object literal for the '{@link web.impl.InterceptorImpl <em>Interceptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.InterceptorImpl
		 * @see web.impl.WebPackageImpl#getInterceptor()
		 * @generated
		 */
		EClass INTERCEPTOR = eINSTANCE.getInterceptor();

		/**
		 * The meta object literal for the '{@link web.impl.exceptionMappingImpl <em>exception Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.exceptionMappingImpl
		 * @see web.impl.WebPackageImpl#getexceptionMapping()
		 * @generated
		 */
		EClass EXCEPTION_MAPPING = eINSTANCE.getexceptionMapping();

		/**
		 * The meta object literal for the '{@link web.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.ActionImpl
		 * @see web.impl.WebPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CLASS = eINSTANCE.getAction_Class();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__METHOD = eINSTANCE.getAction_Method();

		/**
		 * The meta object literal for the '{@link web.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see web.impl.ServiceImpl
		 * @see web.impl.WebPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__CLASS = eINSTANCE.getService_Class();

	}

} //WebPackage
