/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erwerbstaetigkeit Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl#getResturlaub <em>Resturlaub</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl#getBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ErwerbstaetigkeitBezugszeitraumTypeImpl#getTagespflege <em>Tagespflege</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErwerbstaetigkeitBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements ErwerbstaetigkeitBezugszeitraumType {
	/**
	 * The default value of the '{@link #isEinkuenfteErwerbstaetigkeitBezugszeitraum() <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkuenfteErwerbstaetigkeitBezugszeitraum() <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteErwerbstaetigkeitBezugszeitraum = EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_EDEFAULT;

	/**
	 * This is true if the Einkuenfte Erwerbstaetigkeit Bezugszeitraum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteErwerbstaetigkeitBezugszeitraumESet;

	/**
	 * The cached value of the '{@link #getResturlaub() <em>Resturlaub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResturlaub()
	 * @generated
	 * @ordered
	 */
	protected EList<ResturlaubType> resturlaub;

	/**
	 * The cached value of the '{@link #getBerufsbildung() <em>Berufsbildung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected BerufsbildungType berufsbildung;

	/**
	 * The cached value of the '{@link #getTagespflege() <em>Tagespflege</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagespflege()
	 * @generated
	 * @ordered
	 */
	protected TagespflegeType tagespflege;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErwerbstaetigkeitBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getErwerbstaetigkeitBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkuenfteErwerbstaetigkeitBezugszeitraum() {
		return einkuenfteErwerbstaetigkeitBezugszeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkuenfteErwerbstaetigkeitBezugszeitraum(boolean newEinkuenfteErwerbstaetigkeitBezugszeitraum) {
		boolean oldEinkuenfteErwerbstaetigkeitBezugszeitraum = einkuenfteErwerbstaetigkeitBezugszeitraum;
		einkuenfteErwerbstaetigkeitBezugszeitraum = newEinkuenfteErwerbstaetigkeitBezugszeitraum;
		boolean oldEinkuenfteErwerbstaetigkeitBezugszeitraumESet = einkuenfteErwerbstaetigkeitBezugszeitraumESet;
		einkuenfteErwerbstaetigkeitBezugszeitraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, oldEinkuenfteErwerbstaetigkeitBezugszeitraum, einkuenfteErwerbstaetigkeitBezugszeitraum, !oldEinkuenfteErwerbstaetigkeitBezugszeitraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkuenfteErwerbstaetigkeitBezugszeitraum() {
		boolean oldEinkuenfteErwerbstaetigkeitBezugszeitraum = einkuenfteErwerbstaetigkeitBezugszeitraum;
		boolean oldEinkuenfteErwerbstaetigkeitBezugszeitraumESet = einkuenfteErwerbstaetigkeitBezugszeitraumESet;
		einkuenfteErwerbstaetigkeitBezugszeitraum = EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_EDEFAULT;
		einkuenfteErwerbstaetigkeitBezugszeitraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, oldEinkuenfteErwerbstaetigkeitBezugszeitraum, EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_EDEFAULT, oldEinkuenfteErwerbstaetigkeitBezugszeitraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkuenfteErwerbstaetigkeitBezugszeitraum() {
		return einkuenfteErwerbstaetigkeitBezugszeitraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResturlaubType> getResturlaub() {
		if (resturlaub == null) {
			resturlaub = new EObjectContainmentEList<ResturlaubType>(ResturlaubType.class, this, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB);
		}
		return resturlaub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BerufsbildungType getBerufsbildung() {
		return berufsbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBerufsbildung(BerufsbildungType newBerufsbildung, NotificationChain msgs) {
		BerufsbildungType oldBerufsbildung = berufsbildung;
		berufsbildung = newBerufsbildung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG, oldBerufsbildung, newBerufsbildung);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBerufsbildung(BerufsbildungType newBerufsbildung) {
		if (newBerufsbildung != berufsbildung) {
			NotificationChain msgs = null;
			if (berufsbildung != null)
				msgs = ((InternalEObject)berufsbildung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG, null, msgs);
			if (newBerufsbildung != null)
				msgs = ((InternalEObject)newBerufsbildung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG, null, msgs);
			msgs = basicSetBerufsbildung(newBerufsbildung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG, newBerufsbildung, newBerufsbildung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagespflegeType getTagespflege() {
		return tagespflege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagespflege(TagespflegeType newTagespflege, NotificationChain msgs) {
		TagespflegeType oldTagespflege = tagespflege;
		tagespflege = newTagespflege;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE, oldTagespflege, newTagespflege);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagespflege(TagespflegeType newTagespflege) {
		if (newTagespflege != tagespflege) {
			NotificationChain msgs = null;
			if (tagespflege != null)
				msgs = ((InternalEObject)tagespflege).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE, null, msgs);
			if (newTagespflege != null)
				msgs = ((InternalEObject)newTagespflege).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE, null, msgs);
			msgs = basicSetTagespflege(newTagespflege, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE, newTagespflege, newTagespflege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB:
				return ((InternalEList<?>)getResturlaub()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG:
				return basicSetBerufsbildung(null, msgs);
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE:
				return basicSetTagespflege(null, msgs);
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
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				return isEinkuenfteErwerbstaetigkeitBezugszeitraum();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB:
				return getResturlaub();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG:
				return getBerufsbildung();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE:
				return getTagespflege();
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
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				setEinkuenfteErwerbstaetigkeitBezugszeitraum((Boolean)newValue);
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB:
				getResturlaub().clear();
				getResturlaub().addAll((Collection<? extends ResturlaubType>)newValue);
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG:
				setBerufsbildung((BerufsbildungType)newValue);
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE:
				setTagespflege((TagespflegeType)newValue);
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
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				unsetEinkuenfteErwerbstaetigkeitBezugszeitraum();
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB:
				getResturlaub().clear();
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG:
				setBerufsbildung((BerufsbildungType)null);
				return;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE:
				setTagespflege((TagespflegeType)null);
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
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__EINKUENFTE_ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				return isSetEinkuenfteErwerbstaetigkeitBezugszeitraum();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__RESTURLAUB:
				return resturlaub != null && !resturlaub.isEmpty();
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__BERUFSBILDUNG:
				return berufsbildung != null;
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE__TAGESPFLEGE:
				return tagespflege != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (einkuenfteErwerbstaetigkeitBezugszeitraum: ");
		if (einkuenfteErwerbstaetigkeitBezugszeitraumESet) result.append(einkuenfteErwerbstaetigkeitBezugszeitraum); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErwerbstaetigkeitBezugszeitraumTypeImpl
