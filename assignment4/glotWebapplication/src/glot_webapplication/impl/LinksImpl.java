/**
 */
package glot_webapplication.impl;

import glot_webapplication.Attribute;
import glot_webapplication.Glot_webapplicationPackage;
import glot_webapplication.Links;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.LinksImpl#getAttributelink <em>Attributelink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinksImpl extends NamedElementImpl implements Links {
	/**
	 * The cached value of the '{@link #getAttributelink() <em>Attributelink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributelink()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributelink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributelink() {
		if (attributelink != null && attributelink.eIsProxy()) {
			InternalEObject oldAttributelink = (InternalEObject)attributelink;
			attributelink = (Attribute)eResolveProxy(oldAttributelink);
			if (attributelink != oldAttributelink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Glot_webapplicationPackage.LINKS__ATTRIBUTELINK, oldAttributelink, attributelink));
			}
		}
		return attributelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributelink() {
		return attributelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributelink(Attribute newAttributelink) {
		Attribute oldAttributelink = attributelink;
		attributelink = newAttributelink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.LINKS__ATTRIBUTELINK, oldAttributelink, attributelink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Glot_webapplicationPackage.LINKS__ATTRIBUTELINK:
				if (resolve) return getAttributelink();
				return basicGetAttributelink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Glot_webapplicationPackage.LINKS__ATTRIBUTELINK:
				setAttributelink((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Glot_webapplicationPackage.LINKS__ATTRIBUTELINK:
				setAttributelink((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Glot_webapplicationPackage.LINKS__ATTRIBUTELINK:
				return attributelink != null;
		}
		return super.eIsSet(featureID);
	}

} //LinksImpl
