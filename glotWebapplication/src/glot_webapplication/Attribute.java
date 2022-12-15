/**
 */
package glot_webapplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link glot_webapplication.Attribute#isIsprimarykey <em>Isprimarykey</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link glot_webapplication.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see glot_webapplication.DataType
	 * @see #setType(DataType)
	 * @see glot_webapplication.Glot_webapplicationPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link glot_webapplication.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see glot_webapplication.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Isprimarykey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isprimarykey</em>' attribute.
	 * @see #setIsprimarykey(boolean)
	 * @see glot_webapplication.Glot_webapplicationPackage#getAttribute_Isprimarykey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsprimarykey();

	/**
	 * Sets the value of the '{@link glot_webapplication.Attribute#isIsprimarykey <em>Isprimarykey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isprimarykey</em>' attribute.
	 * @see #isIsprimarykey()
	 * @generated
	 */
	void setIsprimarykey(boolean value);

} // Attribute
