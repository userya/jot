/**
 */
package jot.model.package_.impl;

import jot.model.package_.Action;
import jot.model.package_.Actions;
import jot.model.package_.ExceptionMapping;
import jot.model.package_.ExceptionMappings;
import jot.model.package_.Interceptor;
import jot.model.package_.Interceptors;
import jot.model.package_.PackageFactory;
import jot.model.package_.PackagePackage;
import jot.model.package_.Service;

import jot.model.package_.Services;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageFactoryImpl extends EFactoryImpl implements PackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageFactory init() {
		try {
			PackageFactory thePackageFactory = (PackageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jot.org/package/1.0"); 
			if (thePackageFactory != null) {
				return thePackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PackagePackage.PACKAGE: return createPackage();
			case PackagePackage.INTERCEPTOR: return createInterceptor();
			case PackagePackage.EXCEPTION_MAPPING: return createExceptionMapping();
			case PackagePackage.ACTION: return createAction();
			case PackagePackage.SERVICE: return createService();
			case PackagePackage.INTERCEPTORS: return createInterceptors();
			case PackagePackage.EXCEPTION_MAPPINGS: return createExceptionMappings();
			case PackagePackage.SERVICES: return createServices();
			case PackagePackage.ACTIONS: return createActions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jot.model.package_.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptor createInterceptor() {
		InterceptorImpl interceptor = new InterceptorImpl();
		return interceptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionMapping createExceptionMapping() {
		ExceptionMappingImpl exceptionMapping = new ExceptionMappingImpl();
		return exceptionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptors createInterceptors() {
		InterceptorsImpl interceptors = new InterceptorsImpl();
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionMappings createExceptionMappings() {
		ExceptionMappingsImpl exceptionMappings = new ExceptionMappingsImpl();
		return exceptionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagePackage getPackagePackage() {
		return (PackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackagePackage getPackage() {
		return PackagePackage.eINSTANCE;
	}

} //PackageFactoryImpl
