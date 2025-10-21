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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType;

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
 * An implementation of the model object '<em><b>Midijob Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MidijobTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MidijobTypeImpl#getWochenstundenJeTaetigkeitMidijob <em>Wochenstunden Je Taetigkeit Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MidijobTypeImpl#getNachweisMidijob <em>Nachweis Midijob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MidijobTypeImpl extends MinimalEObjectImpl.Container implements MidijobType {
	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType zeitraum;

	/**
	 * The default value of the '{@link #getWochenstundenJeTaetigkeitMidijob() <em>Wochenstunden Je Taetigkeit Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitMidijob()
	 * @generated
	 * @ordered
	 */
	protected static final float WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeitMidijob() <em>Wochenstunden Je Taetigkeit Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitMidijob()
	 * @generated
	 * @ordered
	 */
	protected float wochenstundenJeTaetigkeitMidijob = WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB_EDEFAULT;

	/**
	 * This is true if the Wochenstunden Je Taetigkeit Midijob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wochenstundenJeTaetigkeitMidijobESet;

	/**
	 * The cached value of the '{@link #getNachweisMidijob() <em>Nachweis Midijob</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMidijob()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMidijob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidijobTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getMidijobType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getZeitraum() {
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitraum(ZeitraumType newZeitraum, NotificationChain msgs) {
		ZeitraumType oldZeitraum = zeitraum;
		zeitraum = newZeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM, oldZeitraum, newZeitraum);
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
	public void setZeitraum(ZeitraumType newZeitraum) {
		if (newZeitraum != zeitraum) {
			NotificationChain msgs = null;
			if (zeitraum != null)
				msgs = ((InternalEObject)zeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM, null, msgs);
			if (newZeitraum != null)
				msgs = ((InternalEObject)newZeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM, null, msgs);
			msgs = basicSetZeitraum(newZeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM, newZeitraum, newZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWochenstundenJeTaetigkeitMidijob() {
		return wochenstundenJeTaetigkeitMidijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeitMidijob(float newWochenstundenJeTaetigkeitMidijob) {
		float oldWochenstundenJeTaetigkeitMidijob = wochenstundenJeTaetigkeitMidijob;
		wochenstundenJeTaetigkeitMidijob = newWochenstundenJeTaetigkeitMidijob;
		boolean oldWochenstundenJeTaetigkeitMidijobESet = wochenstundenJeTaetigkeitMidijobESet;
		wochenstundenJeTaetigkeitMidijobESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB, oldWochenstundenJeTaetigkeitMidijob, wochenstundenJeTaetigkeitMidijob, !oldWochenstundenJeTaetigkeitMidijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWochenstundenJeTaetigkeitMidijob() {
		float oldWochenstundenJeTaetigkeitMidijob = wochenstundenJeTaetigkeitMidijob;
		boolean oldWochenstundenJeTaetigkeitMidijobESet = wochenstundenJeTaetigkeitMidijobESet;
		wochenstundenJeTaetigkeitMidijob = WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB_EDEFAULT;
		wochenstundenJeTaetigkeitMidijobESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB, oldWochenstundenJeTaetigkeitMidijob, WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB_EDEFAULT, oldWochenstundenJeTaetigkeitMidijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWochenstundenJeTaetigkeitMidijob() {
		return wochenstundenJeTaetigkeitMidijobESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMidijob() {
		if (nachweisMidijob == null) {
			nachweisMidijob = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB);
		}
		return nachweisMidijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM:
				return basicSetZeitraum(null, msgs);
			case ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB:
				return ((InternalEList<?>)getNachweisMidijob()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB:
				return getWochenstundenJeTaetigkeitMidijob();
			case ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB:
				return getNachweisMidijob();
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
			case ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)newValue);
				return;
			case ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB:
				setWochenstundenJeTaetigkeitMidijob((Float)newValue);
				return;
			case ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB:
				getNachweisMidijob().clear();
				getNachweisMidijob().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)null);
				return;
			case ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB:
				unsetWochenstundenJeTaetigkeitMidijob();
				return;
			case ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB:
				getNachweisMidijob().clear();
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
			case ElterngeldPackage.MIDIJOB_TYPE__ZEITRAUM:
				return zeitraum != null;
			case ElterngeldPackage.MIDIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MIDIJOB:
				return isSetWochenstundenJeTaetigkeitMidijob();
			case ElterngeldPackage.MIDIJOB_TYPE__NACHWEIS_MIDIJOB:
				return nachweisMidijob != null && !nachweisMidijob.isEmpty();
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
		result.append(" (wochenstundenJeTaetigkeitMidijob: ");
		if (wochenstundenJeTaetigkeitMidijobESet) result.append(wochenstundenJeTaetigkeitMidijob); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MidijobTypeImpl
