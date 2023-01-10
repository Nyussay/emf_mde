/**
 */
package glot_webapplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webapplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Webapplication#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getWebapplication()
 * @model
 * @generated
 */
public interface Webapplication extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference.
	 * @see #setPages(Page)
	 * @see glot_webapplication.Glot_webapplicationPackage#getWebapplication_Pages()
	 * @model containment="true"
	 * @generated
	 */
	Page getPages();

	/**
	 * Sets the value of the '{@link glot_webapplication.Webapplication#getPages <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' containment reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(Page value);

} // Webapplication
