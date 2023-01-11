/**
 */
package web.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import web.Attribute;
import web.Index;
import web.WebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link web.impl.IndexImpl#getIndexattributes <em>Indexattributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends NamedElementImpl implements Index {
	/**
	 * The cached value of the '{@link #getIndexattributes() <em>Indexattributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexattributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute indexattributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getIndexattributes() {
		if (indexattributes != null && indexattributes.eIsProxy()) {
			InternalEObject oldIndexattributes = (InternalEObject)indexattributes;
			indexattributes = (Attribute)eResolveProxy(oldIndexattributes);
			if (indexattributes != oldIndexattributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.INDEX__INDEXATTRIBUTES, oldIndexattributes, indexattributes));
			}
		}
		return indexattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetIndexattributes() {
		return indexattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexattributes(Attribute newIndexattributes) {
		Attribute oldIndexattributes = indexattributes;
		indexattributes = newIndexattributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.INDEX__INDEXATTRIBUTES, oldIndexattributes, indexattributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.INDEX__INDEXATTRIBUTES:
				if (resolve) return getIndexattributes();
				return basicGetIndexattributes();
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
			case WebPackage.INDEX__INDEXATTRIBUTES:
				setIndexattributes((Attribute)newValue);
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
			case WebPackage.INDEX__INDEXATTRIBUTES:
				setIndexattributes((Attribute)null);
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
			case WebPackage.INDEX__INDEXATTRIBUTES:
				return indexattributes != null;
		}
		return super.eIsSet(featureID);
	}

} //IndexImpl
