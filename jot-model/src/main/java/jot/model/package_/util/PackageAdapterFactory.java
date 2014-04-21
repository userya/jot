/**
 */
package jot.model.package_.util;

import jot.model.package_.Action;
import jot.model.package_.Actions;
import jot.model.package_.BaseElement;
import jot.model.package_.ExceptionMapping;
import jot.model.package_.ExceptionMappings;
import jot.model.package_.Interceptor;
import jot.model.package_.Interceptors;
import jot.model.package_.PackagePackage;
import jot.model.package_.Service;

import jot.model.package_.Services;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jot.model.package_.PackagePackage
 * @generated
 */
public class PackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageSwitch<Adapter> modelSwitch =
		new PackageSwitch<Adapter>() {
			@Override
			public Adapter casePackage(jot.model.package_.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseInterceptor(Interceptor object) {
				return createInterceptorAdapter();
			}
			@Override
			public Adapter caseExceptionMapping(ExceptionMapping object) {
				return createExceptionMappingAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseInterceptors(Interceptors object) {
				return createInterceptorsAdapter();
			}
			@Override
			public Adapter caseExceptionMappings(ExceptionMappings object) {
				return createExceptionMappingsAdapter();
			}
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Interceptor <em>Interceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Interceptor
	 * @generated
	 */
	public Adapter createInterceptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.ExceptionMapping <em>Exception Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.ExceptionMapping
	 * @generated
	 */
	public Adapter createExceptionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Interceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Interceptors
	 * @generated
	 */
	public Adapter createInterceptorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.ExceptionMappings <em>Exception Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.ExceptionMappings
	 * @generated
	 */
	public Adapter createExceptionMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jot.model.package_.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jot.model.package_.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PackageAdapterFactory
