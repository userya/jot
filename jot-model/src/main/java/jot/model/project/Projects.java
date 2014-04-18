/**
 */
package jot.model.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.project.Projects#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.project.ProjectPackage#getProjects()
 * @model
 * @generated
 */
public interface Projects extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference.
	 * @see #setResources(ProjectResource)
	 * @see jot.model.project.ProjectPackage#getProjects_Resources()
	 * @model
	 * @generated
	 */
	ProjectResource getResources();

	/**
	 * Sets the value of the '{@link jot.model.project.Projects#getResources <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ProjectResource value);

} // Projects
