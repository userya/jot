/**
 */
package jot.model.projects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jot.model.projects.Projects#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see jot.model.projects.ProjectPackage#getProjects()
 * @model
 * @generated
 */
public interface Projects extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link jot.model.projects.ProjectResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see jot.model.projects.ProjectPackage#getProjects_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectResource> getProject();

} // Projects
