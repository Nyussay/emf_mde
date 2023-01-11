/**
 */
package web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link web.Attribute#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see web.WebPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute.
	 * The literals are from the enumeration {@link web.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute.
	 * @see web.DataType
	 * @see #setTypes(DataType)
	 * @see web.WebPackage#getAttribute_Types()
	 * @model
	 * @generated
	 */
	DataType getTypes();

	/**
	 * Sets the value of the '{@link web.Attribute#getTypes <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' attribute.
	 * @see web.DataType
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(DataType value);

} // Attribute
