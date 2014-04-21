/**
 */
package jot.model.package_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.package_.ExceptionMappings#getExceptionMapping <em>Exception Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.package_.PackagePackage#getExceptionMappings()
 * @model
 * @generated
 */
public interface ExceptionMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jot.model.package_.ExceptionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Mapping</em>' containment reference list.
	 * @see jot.model.package_.PackagePackage#getExceptionMappings_ExceptionMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionMapping> getExceptionMapping();

} // ExceptionMappings
