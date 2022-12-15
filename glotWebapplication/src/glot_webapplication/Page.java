/**
 */
package glot_webapplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.Page#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see glot_webapplication.Glot_webapplicationPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link glot_webapplication.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see glot_webapplication.Glot_webapplicationPackage#getPage_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContents();

} // Page
