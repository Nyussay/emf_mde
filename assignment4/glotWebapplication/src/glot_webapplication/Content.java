/**
 */
package glot_webapplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Content#getEntity <em>Entity</em>}</li>
 *   <li>{@link glot_webapplication.Content#getLinks <em>Links</em>}</li>
 *   <li>{@link glot_webapplication.Content#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link glot_webapplication.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see glot_webapplication.Glot_webapplicationPackage#getContent_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link glot_webapplication.Links}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see glot_webapplication.Glot_webapplicationPackage#getContent_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Links> getLinks();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link glot_webapplication.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see glot_webapplication.Glot_webapplicationPackage#getContent_Forms()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Form> getForms();

} // Content
