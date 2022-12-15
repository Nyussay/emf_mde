/**
 */
package glot_webapplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Element#getLabel <em>Label</em>}</li>
 *   <li>{@link glot_webapplication.Element#getTooltips <em>Tooltips</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends NamedElement, Content {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see glot_webapplication.Glot_webapplicationPackage#getElement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link glot_webapplication.Element#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltips</em>' attribute.
	 * @see #setTooltips(String)
	 * @see glot_webapplication.Glot_webapplicationPackage#getElement_Tooltips()
	 * @model
	 * @generated
	 */
	String getTooltips();

	/**
	 * Sets the value of the '{@link glot_webapplication.Element#getTooltips <em>Tooltips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltips</em>' attribute.
	 * @see #getTooltips()
	 * @generated
	 */
	void setTooltips(String value);

} // Element
