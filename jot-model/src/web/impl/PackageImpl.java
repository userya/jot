/**
 */
package web.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import web.Action;
import web.Interceptor;
import web.Service;
import web.WebPackage;
import web.exceptionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link web.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getServices <em>Services</em>}</li>
 *   <li>{@link web.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements web.Package {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExceptionMappings() <em>Exception Mappings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionMappings()
	 * @generated
	 * @ordered
	 */
	protected exceptionMapping exceptionMappings;

	/**
	 * The cached value of the '{@link #getInterceptors() <em>Interceptors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptors()
	 * @generated
	 * @ordered
	 */
	protected Interceptor interceptors;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected Action actions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Service services;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionMapping getExceptionMappings() {
		if (exceptionMappings != null && exceptionMappings.eIsProxy()) {
			InternalEObject oldExceptionMappings = (InternalEObject)exceptionMappings;
			exceptionMappings = (exceptionMapping)eResolveProxy(oldExceptionMappings);
			if (exceptionMappings != oldExceptionMappings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.PACKAGE__EXCEPTION_MAPPINGS, oldExceptionMappings, exceptionMappings));
			}
		}
		return exceptionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exceptionMapping basicGetExceptionMappings() {
		return exceptionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionMappings(exceptionMapping newExceptionMappings) {
		exceptionMapping oldExceptionMappings = exceptionMappings;
		exceptionMappings = newExceptionMappings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__EXCEPTION_MAPPINGS, oldExceptionMappings, exceptionMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptor getInterceptors() {
		if (interceptors != null && interceptors.eIsProxy()) {
			InternalEObject oldInterceptors = (InternalEObject)interceptors;
			interceptors = (Interceptor)eResolveProxy(oldInterceptors);
			if (interceptors != oldInterceptors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.PACKAGE__INTERCEPTORS, oldInterceptors, interceptors));
			}
		}
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptor basicGetInterceptors() {
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptors(Interceptor newInterceptors) {
		Interceptor oldInterceptors = interceptors;
		interceptors = newInterceptors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__INTERCEPTORS, oldInterceptors, interceptors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActions() {
		if (actions != null && actions.eIsProxy()) {
			InternalEObject oldActions = (InternalEObject)actions;
			actions = (Action)eResolveProxy(oldActions);
			if (actions != oldActions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.PACKAGE__ACTIONS, oldActions, actions));
			}
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(Action newActions) {
		Action oldActions = actions;
		actions = newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__ACTIONS, oldActions, actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject)services;
			services = (Service)eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.PACKAGE__SERVICES, oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Service newServices) {
		Service oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.PACKAGE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.PACKAGE__NAME:
				return getName();
			case WebPackage.PACKAGE__EXTENDS:
				return getExtends();
			case WebPackage.PACKAGE__ABSTRACT:
				return getAbstract();
			case WebPackage.PACKAGE__EXCEPTION_MAPPINGS:
				if (resolve) return getExceptionMappings();
				return basicGetExceptionMappings();
			case WebPackage.PACKAGE__INTERCEPTORS:
				if (resolve) return getInterceptors();
				return basicGetInterceptors();
			case WebPackage.PACKAGE__ACTIONS:
				if (resolve) return getActions();
				return basicGetActions();
			case WebPackage.PACKAGE__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
			case WebPackage.PACKAGE__NAMESPACE:
				return getNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case WebPackage.PACKAGE__EXTENDS:
				setExtends((String)newValue);
				return;
			case WebPackage.PACKAGE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case WebPackage.PACKAGE__EXCEPTION_MAPPINGS:
				setExceptionMappings((exceptionMapping)newValue);
				return;
			case WebPackage.PACKAGE__INTERCEPTORS:
				setInterceptors((Interceptor)newValue);
				return;
			case WebPackage.PACKAGE__ACTIONS:
				setActions((Action)newValue);
				return;
			case WebPackage.PACKAGE__SERVICES:
				setServices((Service)newValue);
				return;
			case WebPackage.PACKAGE__NAMESPACE:
				setNamespace((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebPackage.PACKAGE__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case WebPackage.PACKAGE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case WebPackage.PACKAGE__EXCEPTION_MAPPINGS:
				setExceptionMappings((exceptionMapping)null);
				return;
			case WebPackage.PACKAGE__INTERCEPTORS:
				setInterceptors((Interceptor)null);
				return;
			case WebPackage.PACKAGE__ACTIONS:
				setActions((Action)null);
				return;
			case WebPackage.PACKAGE__SERVICES:
				setServices((Service)null);
				return;
			case WebPackage.PACKAGE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebPackage.PACKAGE__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case WebPackage.PACKAGE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case WebPackage.PACKAGE__EXCEPTION_MAPPINGS:
				return exceptionMappings != null;
			case WebPackage.PACKAGE__INTERCEPTORS:
				return interceptors != null;
			case WebPackage.PACKAGE__ACTIONS:
				return actions != null;
			case WebPackage.PACKAGE__SERVICES:
				return services != null;
			case WebPackage.PACKAGE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", extends: ");
		result.append(extends_);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
