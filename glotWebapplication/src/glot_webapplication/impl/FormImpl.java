/**
 */
package glot_webapplication.impl;

import glot_webapplication.Content;
import glot_webapplication.Entity;
import glot_webapplication.Form;
import glot_webapplication.Glot_webapplicationPackage;
import glot_webapplication.Links;
import glot_webapplication.MethodType;

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
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.FormImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link glot_webapplication.impl.FormImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link glot_webapplication.impl.FormImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link glot_webapplication.impl.FormImpl#getMethodtype <em>Methodtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends NamedElementImpl implements Form {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Links> links;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The default value of the '{@link #getMethodtype() <em>Methodtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodtype()
	 * @generated
	 * @ordered
	 */
	protected static final MethodType METHODTYPE_EDEFAULT = MethodType.POST;

	/**
	 * The cached value of the '{@link #getMethodtype() <em>Methodtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodtype()
	 * @generated
	 * @ordered
	 */
	protected MethodType methodtype = METHODTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, Glot_webapplicationPackage.FORM__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Links> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Links>(Links.class, this, Glot_webapplicationPackage.FORM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, Glot_webapplicationPackage.FORM__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType getMethodtype() {
		return methodtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodtype(MethodType newMethodtype) {
		MethodType oldMethodtype = methodtype;
		methodtype = newMethodtype == null ? METHODTYPE_EDEFAULT : newMethodtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.FORM__METHODTYPE, oldMethodtype, methodtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot_webapplicationPackage.FORM__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.FORM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.FORM__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
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
			case Glot_webapplicationPackage.FORM__ENTITY:
				return getEntity();
			case Glot_webapplicationPackage.FORM__LINKS:
				return getLinks();
			case Glot_webapplicationPackage.FORM__FORMS:
				return getForms();
			case Glot_webapplicationPackage.FORM__METHODTYPE:
				return getMethodtype();
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
			case Glot_webapplicationPackage.FORM__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case Glot_webapplicationPackage.FORM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Links>)newValue);
				return;
			case Glot_webapplicationPackage.FORM__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case Glot_webapplicationPackage.FORM__METHODTYPE:
				setMethodtype((MethodType)newValue);
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
			case Glot_webapplicationPackage.FORM__ENTITY:
				getEntity().clear();
				return;
			case Glot_webapplicationPackage.FORM__LINKS:
				getLinks().clear();
				return;
			case Glot_webapplicationPackage.FORM__FORMS:
				getForms().clear();
				return;
			case Glot_webapplicationPackage.FORM__METHODTYPE:
				setMethodtype(METHODTYPE_EDEFAULT);
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
			case Glot_webapplicationPackage.FORM__ENTITY:
				return entity != null && !entity.isEmpty();
			case Glot_webapplicationPackage.FORM__LINKS:
				return links != null && !links.isEmpty();
			case Glot_webapplicationPackage.FORM__FORMS:
				return forms != null && !forms.isEmpty();
			case Glot_webapplicationPackage.FORM__METHODTYPE:
				return methodtype != METHODTYPE_EDEFAULT;
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
		if (baseClass == Content.class) {
			switch (derivedFeatureID) {
				case Glot_webapplicationPackage.FORM__ENTITY: return Glot_webapplicationPackage.CONTENT__ENTITY;
				case Glot_webapplicationPackage.FORM__LINKS: return Glot_webapplicationPackage.CONTENT__LINKS;
				case Glot_webapplicationPackage.FORM__FORMS: return Glot_webapplicationPackage.CONTENT__FORMS;
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
		if (baseClass == Content.class) {
			switch (baseFeatureID) {
				case Glot_webapplicationPackage.CONTENT__ENTITY: return Glot_webapplicationPackage.FORM__ENTITY;
				case Glot_webapplicationPackage.CONTENT__LINKS: return Glot_webapplicationPackage.FORM__LINKS;
				case Glot_webapplicationPackage.CONTENT__FORMS: return Glot_webapplicationPackage.FORM__FORMS;
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
		result.append(" (methodtype: ");
		result.append(methodtype);
		result.append(')');
		return result.toString();
	}

} //FormImpl
