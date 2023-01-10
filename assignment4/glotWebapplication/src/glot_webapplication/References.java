/**
 */
package glot_webapplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.References#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends NamedElement, Attribute {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(Attribute)
	 * @see glot_webapplication.Glot_webapplicationPackage#getReferences_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link glot_webapplication.References#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

} // References
