/**
 */
package jot.model.package_.impl;

import jot.model.package_.Actions;
import jot.model.package_.ExceptionMappings;
import jot.model.package_.Interceptors;
import java.util.Collection;

import jot.model.package_.Action;
import jot.model.package_.ExceptionMapping;
import jot.model.package_.Interceptor;
import jot.model.package_.PackagePackage;
import jot.model.package_.Services;
import jot.model.package_.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getServices <em>Services</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements jot.model.package_.Package {
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterceptors() <em>Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptors()
	 * @generated
	 * @ordered
	 */
	protected Interceptors interceptors;

	/**
	 * The cached value of the '{@link #getExceptionMappings() <em>Exception Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionMappings()
	 * @generated
	 * @ordered
	 */
	protected ExceptionMappings exceptionMappings;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected Actions actions;

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
		return PackagePackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptors getInterceptors() {
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptors(Interceptors newInterceptors, NotificationChain msgs) {
		Interceptors oldInterceptors = interceptors;
		interceptors = newInterceptors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__INTERCEPTORS, oldInterceptors, newInterceptors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptors(Interceptors newInterceptors) {
		if (newInterceptors != interceptors) {
			NotificationChain msgs = null;
			if (interceptors != null)
				msgs = ((InternalEObject)interceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__INTERCEPTORS, null, msgs);
			if (newInterceptors != null)
				msgs = ((InternalEObject)newInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__INTERCEPTORS, null, msgs);
			msgs = basicSetInterceptors(newInterceptors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__INTERCEPTORS, newInterceptors, newInterceptors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionMappings getExceptionMappings() {
		return exceptionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionMappings(ExceptionMappings newExceptionMappings, NotificationChain msgs) {
		ExceptionMappings oldExceptionMappings = exceptionMappings;
		exceptionMappings = newExceptionMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__EXCEPTION_MAPPINGS, oldExceptionMappings, newExceptionMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionMappings(ExceptionMappings newExceptionMappings) {
		if (newExceptionMappings != exceptionMappings) {
			NotificationChain msgs = null;
			if (exceptionMappings != null)
				msgs = ((InternalEObject)exceptionMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__EXCEPTION_MAPPINGS, null, msgs);
			if (newExceptionMappings != null)
				msgs = ((InternalEObject)newExceptionMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__EXCEPTION_MAPPINGS, null, msgs);
			msgs = basicSetExceptionMappings(newExceptionMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__EXCEPTION_MAPPINGS, newExceptionMappings, newExceptionMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(Actions newActions, NotificationChain msgs) {
		Actions oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(Actions newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.PACKAGE__INTERCEPTORS:
				return basicSetInterceptors(null, msgs);
			case PackagePackage.PACKAGE__EXCEPTION_MAPPINGS:
				return basicSetExceptionMappings(null, msgs);
			case PackagePackage.PACKAGE__SERVICES:
				return basicSetServices(null, msgs);
			case PackagePackage.PACKAGE__ACTIONS:
				return basicSetActions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Services newServices, NotificationChain msgs) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagePackage.PACKAGE__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagePackage.PACKAGE__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagePackage.PACKAGE__EXTENDS:
				return getExtends();
			case PackagePackage.PACKAGE__NAME:
				return getName();
			case PackagePackage.PACKAGE__NAMESPACE:
				return getNamespace();
			case PackagePackage.PACKAGE__ABSTRACT:
				return isAbstract();
			case PackagePackage.PACKAGE__INTERCEPTORS:
				return getInterceptors();
			case PackagePackage.PACKAGE__EXCEPTION_MAPPINGS:
				return getExceptionMappings();
			case PackagePackage.PACKAGE__SERVICES:
				return getServices();
			case PackagePackage.PACKAGE__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackagePackage.PACKAGE__EXTENDS:
				setExtends((String)newValue);
				return;
			case PackagePackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case PackagePackage.PACKAGE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case PackagePackage.PACKAGE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				setInterceptors((Interceptors)newValue);
				return;
			case PackagePackage.PACKAGE__EXCEPTION_MAPPINGS:
				setExceptionMappings((ExceptionMappings)newValue);
				return;
			case PackagePackage.PACKAGE__SERVICES:
				setServices((Services)newValue);
				return;
			case PackagePackage.PACKAGE__ACTIONS:
				setActions((Actions)newValue);
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
			case PackagePackage.PACKAGE__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				setInterceptors((Interceptors)null);
				return;
			case PackagePackage.PACKAGE__EXCEPTION_MAPPINGS:
				setExceptionMappings((ExceptionMappings)null);
				return;
			case PackagePackage.PACKAGE__SERVICES:
				setServices((Services)null);
				return;
			case PackagePackage.PACKAGE__ACTIONS:
				setActions((Actions)null);
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
			case PackagePackage.PACKAGE__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case PackagePackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PackagePackage.PACKAGE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case PackagePackage.PACKAGE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				return interceptors != null;
			case PackagePackage.PACKAGE__EXCEPTION_MAPPINGS:
				return exceptionMappings != null;
			case PackagePackage.PACKAGE__SERVICES:
				return services != null;
			case PackagePackage.PACKAGE__ACTIONS:
				return actions != null;
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
		result.append(" (extends: ");
		result.append(extends_);
		result.append(", name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
