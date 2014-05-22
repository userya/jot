/**
 */
package jot.model.package_.impl;

import java.util.Collection;

import jot.model.package_.Interceptor;
import jot.model.package_.Interceptors;
import jot.model.package_.PackagePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interceptors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jot.model.package_.impl.InterceptorsImpl#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterceptorsImpl extends EObjectImpl implements Interceptors {
	/**
	 * The cached value of the '{@link #getInterceptor() <em>Interceptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Interceptor> interceptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterceptorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.INTERCEPTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interceptor> getInterceptor() {
		if (interceptor == null) {
			interceptor = new EObjectContainmentEList<Interceptor>(Interceptor.class, this, PackagePackage.INTERCEPTORS__INTERCEPTOR);
		}
		return interceptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.INTERCEPTORS__INTERCEPTOR:
				return ((InternalEList<?>)getInterceptor()).basicRemove(otherEnd, msgs);
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
			case PackagePackage.INTERCEPTORS__INTERCEPTOR:
				return getInterceptor();
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
			case PackagePackage.INTERCEPTORS__INTERCEPTOR:
				getInterceptor().clear();
				getInterceptor().addAll((Collection<? extends Interceptor>)newValue);
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
			case PackagePackage.INTERCEPTORS__INTERCEPTOR:
				getInterceptor().clear();
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
			case PackagePackage.INTERCEPTORS__INTERCEPTOR:
				return interceptor != null && !interceptor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterceptorsImpl
