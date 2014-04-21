/**
 */
package jot.model.package_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.package_.Actions#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.package_.PackagePackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link jot.model.package_.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see jot.model.package_.PackagePackage#getActions_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Actions
