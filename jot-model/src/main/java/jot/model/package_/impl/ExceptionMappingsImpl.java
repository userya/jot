/**
 */
package jot.model.package_.impl;

import java.util.Collection;

import jot.model.package_.ExceptionMapping;
import jot.model.package_.ExceptionMappings;
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
 * An implementation of the model object '<em><b>Exception Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jot.model.package_.impl.ExceptionMappingsImpl#getExceptionMapping <em>Exception Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionMappingsImpl extends EObjectImpl implements ExceptionMappings {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagePackage.Literals.EXCEPTION_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionMapping> getExceptionMapping() {
		if (exceptionMapping == null) {
			exceptionMapping = new EObjectContainmentEList<ExceptionMapping>(ExceptionMapping.class, this, PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING);
		}
		return exceptionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING:
				return ((InternalEList<?>)getExceptionMapping()).basicRemove(otherEnd, msgs);
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
			case PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING:
				return getExceptionMapping();
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
			case PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING:
				getExceptionMapping().clear();
				getExceptionMapping().addAll((Collection<? extends ExceptionMapping>)newValue);
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
			case PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING:
				getExceptionMapping().clear();
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
			case PackagePackage.EXCEPTION_MAPPINGS__EXCEPTION_MAPPING:
				return exceptionMapping != null && !exceptionMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExceptionMappingsImpl
