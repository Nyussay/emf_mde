/**
 */
package glot_webapplication.impl;

import glot_webapplication.Content;
import glot_webapplication.Element;
import glot_webapplication.Entity;
import glot_webapplication.Form;
import glot_webapplication.Glot_webapplicationPackage;

import glot_webapplication.Links;
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
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.ElementImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link glot_webapplication.impl.ElementImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link glot_webapplication.impl.ElementImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link glot_webapplication.impl.ElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link glot_webapplication.impl.ElementImpl#getTooltips <em>Tooltips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends NamedElementImpl implements Element {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltips() <em>Tooltips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltips()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltips() <em>Tooltips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltips()
	 * @generated
	 * @ordered
	 */
	protected String tooltips = TOOLTIPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, Glot_webapplicationPackage.ELEMENT__ENTITY);
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
			links = new EObjectContainmentEList<Links>(Links.class, this, Glot_webapplicationPackage.ELEMENT__LINKS);
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
			forms = new EObjectContainmentEList<Form>(Form.class, this, Glot_webapplicationPackage.ELEMENT__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.ELEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltips() {
		return tooltips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltips(String newTooltips) {
		String oldTooltips = tooltips;
		tooltips = newTooltips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot_webapplicationPackage.ELEMENT__TOOLTIPS, oldTooltips, tooltips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot_webapplicationPackage.ELEMENT__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.ELEMENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.ELEMENT__FORMS:
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
			case Glot_webapplicationPackage.ELEMENT__ENTITY:
				return getEntity();
			case Glot_webapplicationPackage.ELEMENT__LINKS:
				return getLinks();
			case Glot_webapplicationPackage.ELEMENT__FORMS:
				return getForms();
			case Glot_webapplicationPackage.ELEMENT__LABEL:
				return getLabel();
			case Glot_webapplicationPackage.ELEMENT__TOOLTIPS:
				return getTooltips();
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
			case Glot_webapplicationPackage.ELEMENT__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case Glot_webapplicationPackage.ELEMENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Links>)newValue);
				return;
			case Glot_webapplicationPackage.ELEMENT__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case Glot_webapplicationPackage.ELEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case Glot_webapplicationPackage.ELEMENT__TOOLTIPS:
				setTooltips((String)newValue);
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
			case Glot_webapplicationPackage.ELEMENT__ENTITY:
				getEntity().clear();
				return;
			case Glot_webapplicationPackage.ELEMENT__LINKS:
				getLinks().clear();
				return;
			case Glot_webapplicationPackage.ELEMENT__FORMS:
				getForms().clear();
				return;
			case Glot_webapplicationPackage.ELEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Glot_webapplicationPackage.ELEMENT__TOOLTIPS:
				setTooltips(TOOLTIPS_EDEFAULT);
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
			case Glot_webapplicationPackage.ELEMENT__ENTITY:
				return entity != null && !entity.isEmpty();
			case Glot_webapplicationPackage.ELEMENT__LINKS:
				return links != null && !links.isEmpty();
			case Glot_webapplicationPackage.ELEMENT__FORMS:
				return forms != null && !forms.isEmpty();
			case Glot_webapplicationPackage.ELEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Glot_webapplicationPackage.ELEMENT__TOOLTIPS:
				return TOOLTIPS_EDEFAULT == null ? tooltips != null : !TOOLTIPS_EDEFAULT.equals(tooltips);
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
				case Glot_webapplicationPackage.ELEMENT__ENTITY: return Glot_webapplicationPackage.CONTENT__ENTITY;
				case Glot_webapplicationPackage.ELEMENT__LINKS: return Glot_webapplicationPackage.CONTENT__LINKS;
				case Glot_webapplicationPackage.ELEMENT__FORMS: return Glot_webapplicationPackage.CONTENT__FORMS;
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
				case Glot_webapplicationPackage.CONTENT__ENTITY: return Glot_webapplicationPackage.ELEMENT__ENTITY;
				case Glot_webapplicationPackage.CONTENT__LINKS: return Glot_webapplicationPackage.ELEMENT__LINKS;
				case Glot_webapplicationPackage.CONTENT__FORMS: return Glot_webapplicationPackage.ELEMENT__FORMS;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", tooltips: ");
		result.append(tooltips);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
