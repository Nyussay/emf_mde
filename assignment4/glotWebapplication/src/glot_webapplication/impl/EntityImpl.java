/**
 */
package glot_webapplication.impl;

import glot_webapplication.Attribute;
import glot_webapplication.Entity;
import glot_webapplication.Glot_webapplicationPackage;
import glot_webapplication.References;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link glot_webapplication.impl.EntityImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected References references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, Glot_webapplicationPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public References getReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(References newReferences, NotificationChain msgs) {
		References oldReferences = references;
		references = newReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.ENTITY__REFERENCES, oldReferences, newReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(References newReferences) {
		if (newReferences != references) {
			NotificationChain msgs = null;
			if (references != null)
				msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Glot_webapplicationPackage.ENTITY__REFERENCES, null, msgs);
			if (newReferences != null)
				msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Glot_webapplicationPackage.ENTITY__REFERENCES, null, msgs);
			msgs = basicSetReferences(newReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.ENTITY__REFERENCES, newReferences, newReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot_webapplicationPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.ENTITY__REFERENCES:
				return basicSetReferences(null, msgs);
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
			case Glot_webapplicationPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case Glot_webapplicationPackage.ENTITY__REFERENCES:
				return getReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Glot_webapplicationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Glot_webapplicationPackage.ENTITY__REFERENCES:
				setReferences((References)newValue);
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
			case Glot_webapplicationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case Glot_webapplicationPackage.ENTITY__REFERENCES:
				setReferences((References)null);
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
			case Glot_webapplicationPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case Glot_webapplicationPackage.ENTITY__REFERENCES:
				return references != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
