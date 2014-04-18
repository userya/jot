/**
 */
package jot.model.project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jot.model.project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.jot.org/project/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectPackage eINSTANCE = jot.model.project.impl.ProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link jot.model.project.impl.ProjectsImpl <em>Projects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.project.impl.ProjectsImpl
	 * @see jot.model.project.impl.ProjectPackageImpl#getProjects()
	 * @generated
	 */
	int PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTS__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jot.model.project.impl.ProjectResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jot.model.project.impl.ProjectResourceImpl
	 * @see jot.model.project.impl.ProjectPackageImpl#getProjectResource()
	 * @generated
	 */
	int PROJECT_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_RESOURCE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_RESOURCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jot.model.project.Projects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projects</em>'.
	 * @see jot.model.project.Projects
	 * @generated
	 */
	EClass getProjects();

	/**
	 * Returns the meta object for the reference '{@link jot.model.project.Projects#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resources</em>'.
	 * @see jot.model.project.Projects#getResources()
	 * @see #getProjects()
	 * @generated
	 */
	EReference getProjects_Resources();

	/**
	 * Returns the meta object for class '{@link jot.model.project.ProjectResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see jot.model.project.ProjectResource
	 * @generated
	 */
	EClass getProjectResource();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.project.ProjectResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jot.model.project.ProjectResource#getName()
	 * @see #getProjectResource()
	 * @generated
	 */
	EAttribute getProjectResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link jot.model.project.ProjectResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see jot.model.project.ProjectResource#getResource()
	 * @see #getProjectResource()
	 * @generated
	 */
	EAttribute getProjectResource_Resource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectFactory getProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jot.model.project.impl.ProjectsImpl <em>Projects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.project.impl.ProjectsImpl
		 * @see jot.model.project.impl.ProjectPackageImpl#getProjects()
		 * @generated
		 */
		EClass PROJECTS = eINSTANCE.getProjects();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTS__RESOURCES = eINSTANCE.getProjects_Resources();

		/**
		 * The meta object literal for the '{@link jot.model.project.impl.ProjectResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jot.model.project.impl.ProjectResourceImpl
		 * @see jot.model.project.impl.ProjectPackageImpl#getProjectResource()
		 * @generated
		 */
		EClass PROJECT_RESOURCE = eINSTANCE.getProjectResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_RESOURCE__NAME = eINSTANCE.getProjectResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_RESOURCE__RESOURCE = eINSTANCE.getProjectResource_Resource();

	}

} //ProjectPackage
