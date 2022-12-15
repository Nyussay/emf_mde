/**
 */
package glot_webapplication.impl;

import glot_webapplication.Content;
import glot_webapplication.Entity;
import glot_webapplication.Form;
import glot_webapplication.Glot_webapplicationPackage;
import glot_webapplication.Links;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glot_webapplication.impl.ContentImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link glot_webapplication.impl.ContentImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link glot_webapplication.impl.ContentImpl#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends NamedElementImpl implements Content {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot_webapplicationPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, Glot_webapplicationPackage.CONTENT__ENTITY);
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
			links = new EObjectContainmentEList<Links>(Links.class, this, Glot_webapplicationPackage.CONTENT__LINKS);
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
			forms = new EObjectContainmentEList<Form>(Form.class, this, Glot_webapplicationPackage.CONTENT__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot_webapplicationPackage.CONTENT__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.CONTENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Glot_webapplicationPackage.CONTENT__FORMS:
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
			case Glot_webapplicationPackage.CONTENT__ENTITY:
				return getEntity();
			case Glot_webapplicationPackage.CONTENT__LINKS:
				return getLinks();
			case Glot_webapplicationPackage.CONTENT__FORMS:
				return getForms();
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
			case Glot_webapplicationPackage.CONTENT__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case Glot_webapplicationPackage.CONTENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Links>)newValue);
				return;
			case Glot_webapplicationPackage.CONTENT__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
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
			case Glot_webapplicationPackage.CONTENT__ENTITY:
				getEntity().clear();
				return;
			case Glot_webapplicationPackage.CONTENT__LINKS:
				getLinks().clear();
				return;
			case Glot_webapplicationPackage.CONTENT__FORMS:
				getForms().clear();
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
			case Glot_webapplicationPackage.CONTENT__ENTITY:
				return entity != null && !entity.isEmpty();
			case Glot_webapplicationPackage.CONTENT__LINKS:
				return links != null && !links.isEmpty();
			case Glot_webapplicationPackage.CONTENT__FORMS:
				return forms != null && !forms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentImpl
