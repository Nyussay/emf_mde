/**
 */
package glot_webapplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link glot_webapplication.Entity#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link glot_webapplication.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see glot_webapplication.Glot_webapplicationPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(References)
	 * @see glot_webapplication.Glot_webapplicationPackage#getEntity_References()
	 * @model containment="true"
	 * @generated
	 */
	References getReferences();

	/**
	 * Sets the value of the '{@link glot_webapplication.Entity#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(References value);

} // Entity
