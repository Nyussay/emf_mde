/**
 */
package glot_webapplication.impl;

import glot_webapplication.Attribute;
import glot_webapplication.DataType;
import glot_webapplication.Glot_webapplicationPackage;
import glot_webapplication.References;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.ReferencesImpl#getType <em>Type</em>}</li>
 *   <li>{@link glot_webapplication.impl.ReferencesImpl#isIsprimarykey <em>Isprimarykey</em>}</li>
 *   <li>{@link glot_webapplication.impl.ReferencesImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencesImpl extends NamedElementImpl implements References {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType TYPE_EDEFAULT = DataType.STRING;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsprimarykey() <em>Isprimarykey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsprimarykey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISPRIMARYKEY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsprimarykey() <em>Isprimarykey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsprimarykey()
	 * @generated
	 * @ordered
	 */
	protected boolean isprimarykey = ISPRIMARYKEY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.REFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.REFERENCES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsprimarykey() {
		return isprimarykey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsprimarykey(boolean newIsprimarykey) {
		boolean oldIsprimarykey = isprimarykey;
		isprimarykey = newIsprimarykey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY, oldIsprimarykey, isprimarykey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attribute newAttributes, NotificationChain msgs) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.REFERENCES__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Glot_webapplicationPackage.REFERENCES__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Glot_webapplicationPackage.REFERENCES__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.REFERENCES__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot_webapplicationPackage.REFERENCES__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Glot_webapplicationPackage.REFERENCES__TYPE:
				return getType();
			case Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY:
				return isIsprimarykey();
			case Glot_webapplicationPackage.REFERENCES__ATTRIBUTES:
				return getAttributes();
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
			case Glot_webapplicationPackage.REFERENCES__TYPE:
				setType((DataType)newValue);
				return;
			case Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY:
				setIsprimarykey((Boolean)newValue);
				return;
			case Glot_webapplicationPackage.REFERENCES__ATTRIBUTES:
				setAttributes((Attribute)newValue);
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
			case Glot_webapplicationPackage.REFERENCES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY:
				setIsprimarykey(ISPRIMARYKEY_EDEFAULT);
				return;
			case Glot_webapplicationPackage.REFERENCES__ATTRIBUTES:
				setAttributes((Attribute)null);
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
			case Glot_webapplicationPackage.REFERENCES__TYPE:
				return type != TYPE_EDEFAULT;
			case Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY:
				return isprimarykey != ISPRIMARYKEY_EDEFAULT;
			case Glot_webapplicationPackage.REFERENCES__ATTRIBUTES:
				return attributes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Attribute.class) {
			switch (derivedFeatureID) {
				case Glot_webapplicationPackage.REFERENCES__TYPE: return Glot_webapplicationPackage.ATTRIBUTE__TYPE;
				case Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY: return Glot_webapplicationPackage.ATTRIBUTE__ISPRIMARYKEY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Attribute.class) {
			switch (baseFeatureID) {
				case Glot_webapplicationPackage.ATTRIBUTE__TYPE: return Glot_webapplicationPackage.REFERENCES__TYPE;
				case Glot_webapplicationPackage.ATTRIBUTE__ISPRIMARYKEY: return Glot_webapplicationPackage.REFERENCES__ISPRIMARYKEY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", isprimarykey: ");
		result.append(isprimarykey);
		result.append(')');
		return result.toString();
	}

} //ReferencesImpl
