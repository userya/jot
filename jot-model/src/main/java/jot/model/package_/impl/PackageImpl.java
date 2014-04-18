/**
 */
package jot.model.package_.impl;

import java.util.Collection;

import jot.model.package_.Action;
import jot.model.package_.ExceptionMapping;
import jot.model.package_.Interceptor;
import jot.model.package_.PackagePackage;
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
 *   <li>{@link jot.model.package_.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getExceptionMapping <em>Exception Mapping</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link jot.model.package_.impl.PackageImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements jot.model.package_.Package {
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
	 * The cached value of the '{@link #getInterceptors() <em>Interceptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptors()
	 * @generated
	 * @ordered
	 */
	protected EList<Interceptor> interceptors;

	/**
	 * The cached value of the '{@link #getExceptionMapping() <em>Exception Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionMapping> exceptionMapping;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	public EList<Interceptor> getInterceptors() {
		if (interceptors == null) {
			interceptors = new EObjectContainmentEList<Interceptor>(Interceptor.class, this, PackagePackage.PACKAGE__INTERCEPTORS);
		}
		return interceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionMapping> getExceptionMapping() {
		if (exceptionMapping == null) {
			exceptionMapping = new EObjectContainmentEList<ExceptionMapping>(ExceptionMapping.class, this, PackagePackage.PACKAGE__EXCEPTION_MAPPING);
		}
		return exceptionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, PackagePackage.PACKAGE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, PackagePackage.PACKAGE__SERVICES);
		}
		return services;
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
				return ((InternalEList<?>)getInterceptors()).basicRemove(otherEnd, msgs);
			case PackagePackage.PACKAGE__EXCEPTION_MAPPING:
				return ((InternalEList<?>)getExceptionMapping()).basicRemove(otherEnd, msgs);
			case PackagePackage.PACKAGE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PackagePackage.PACKAGE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagePackage.PACKAGE__NAME:
				return getName();
			case PackagePackage.PACKAGE__EXTENDS:
				return getExtends();
			case PackagePackage.PACKAGE__NAMESPACE:
				return getNamespace();
			case PackagePackage.PACKAGE__ABSTRACT:
				return isAbstract();
			case PackagePackage.PACKAGE__INTERCEPTORS:
				return getInterceptors();
			case PackagePackage.PACKAGE__EXCEPTION_MAPPING:
				return getExceptionMapping();
			case PackagePackage.PACKAGE__ACTIONS:
				return getActions();
			case PackagePackage.PACKAGE__SERVICES:
				return getServices();
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
			case PackagePackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case PackagePackage.PACKAGE__EXTENDS:
				setExtends((String)newValue);
				return;
			case PackagePackage.PACKAGE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case PackagePackage.PACKAGE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				getInterceptors().clear();
				getInterceptors().addAll((Collection<? extends Interceptor>)newValue);
				return;
			case PackagePackage.PACKAGE__EXCEPTION_MAPPING:
				getExceptionMapping().clear();
				getExceptionMapping().addAll((Collection<? extends ExceptionMapping>)newValue);
				return;
			case PackagePackage.PACKAGE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PackagePackage.PACKAGE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
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
			case PackagePackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				getInterceptors().clear();
				return;
			case PackagePackage.PACKAGE__EXCEPTION_MAPPING:
				getExceptionMapping().clear();
				return;
			case PackagePackage.PACKAGE__ACTIONS:
				getActions().clear();
				return;
			case PackagePackage.PACKAGE__SERVICES:
				getServices().clear();
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
			case PackagePackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PackagePackage.PACKAGE__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case PackagePackage.PACKAGE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case PackagePackage.PACKAGE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case PackagePackage.PACKAGE__INTERCEPTORS:
				return interceptors != null && !interceptors.isEmpty();
			case PackagePackage.PACKAGE__EXCEPTION_MAPPING:
				return exceptionMapping != null && !exceptionMapping.isEmpty();
			case PackagePackage.PACKAGE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PackagePackage.PACKAGE__SERVICES:
				return services != null && !services.isEmpty();
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
