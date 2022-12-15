/**
 */
package glot_webapplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Form#getMethodtype <em>Methodtype</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement, Content {
	/**
	 * Returns the value of the '<em><b>Methodtype</b></em>' attribute.
	 * The literals are from the enumeration {@link glot_webapplication.MethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodtype</em>' attribute.
	 * @see glot_webapplication.MethodType
	 * @see #setMethodtype(MethodType)
	 * @see glot_webapplication.Glot_webapplicationPackage#getForm_Methodtype()
	 * @model
	 * @generated
	 */
	MethodType getMethodtype();

	/**
	 * Sets the value of the '{@link glot_webapplication.Form#getMethodtype <em>Methodtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodtype</em>' attribute.
	 * @see glot_webapplication.MethodType
	 * @see #getMethodtype()
	 * @generated
	 */
	void setMethodtype(MethodType value);

} // Form
