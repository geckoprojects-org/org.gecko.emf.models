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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType;

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
 * An implementation of the model object '<em><b>Minijob Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MinijobTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MinijobTypeImpl#getWochenstundenJeTaetigkeitMinijob <em>Wochenstunden Je Taetigkeit Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MinijobTypeImpl#getNachweisMinijob <em>Nachweis Minijob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinijobTypeImpl extends MinimalEObjectImpl.Container implements MinijobType {
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
	 * The default value of the '{@link #getWochenstundenJeTaetigkeitMinijob() <em>Wochenstunden Je Taetigkeit Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitMinijob()
	 * @generated
	 * @ordered
	 */
	protected static final float WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeitMinijob() <em>Wochenstunden Je Taetigkeit Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitMinijob()
	 * @generated
	 * @ordered
	 */
	protected float wochenstundenJeTaetigkeitMinijob = WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB_EDEFAULT;

	/**
	 * This is true if the Wochenstunden Je Taetigkeit Minijob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wochenstundenJeTaetigkeitMinijobESet;

	/**
	 * The cached value of the '{@link #getNachweisMinijob() <em>Nachweis Minijob</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMinijob()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMinijob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinijobTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getMinijobType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM, oldZeitraum, newZeitraum);
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
				msgs = ((InternalEObject)zeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM, null, msgs);
			if (newZeitraum != null)
				msgs = ((InternalEObject)newZeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM, null, msgs);
			msgs = basicSetZeitraum(newZeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM, newZeitraum, newZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWochenstundenJeTaetigkeitMinijob() {
		return wochenstundenJeTaetigkeitMinijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeitMinijob(float newWochenstundenJeTaetigkeitMinijob) {
		float oldWochenstundenJeTaetigkeitMinijob = wochenstundenJeTaetigkeitMinijob;
		wochenstundenJeTaetigkeitMinijob = newWochenstundenJeTaetigkeitMinijob;
		boolean oldWochenstundenJeTaetigkeitMinijobESet = wochenstundenJeTaetigkeitMinijobESet;
		wochenstundenJeTaetigkeitMinijobESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB, oldWochenstundenJeTaetigkeitMinijob, wochenstundenJeTaetigkeitMinijob, !oldWochenstundenJeTaetigkeitMinijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWochenstundenJeTaetigkeitMinijob() {
		float oldWochenstundenJeTaetigkeitMinijob = wochenstundenJeTaetigkeitMinijob;
		boolean oldWochenstundenJeTaetigkeitMinijobESet = wochenstundenJeTaetigkeitMinijobESet;
		wochenstundenJeTaetigkeitMinijob = WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB_EDEFAULT;
		wochenstundenJeTaetigkeitMinijobESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB, oldWochenstundenJeTaetigkeitMinijob, WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB_EDEFAULT, oldWochenstundenJeTaetigkeitMinijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWochenstundenJeTaetigkeitMinijob() {
		return wochenstundenJeTaetigkeitMinijobESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMinijob() {
		if (nachweisMinijob == null) {
			nachweisMinijob = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB);
		}
		return nachweisMinijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM:
				return basicSetZeitraum(null, msgs);
			case ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB:
				return ((InternalEList<?>)getNachweisMinijob()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB:
				return getWochenstundenJeTaetigkeitMinijob();
			case ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB:
				return getNachweisMinijob();
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
			case ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)newValue);
				return;
			case ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB:
				setWochenstundenJeTaetigkeitMinijob((Float)newValue);
				return;
			case ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB:
				getNachweisMinijob().clear();
				getNachweisMinijob().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)null);
				return;
			case ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB:
				unsetWochenstundenJeTaetigkeitMinijob();
				return;
			case ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB:
				getNachweisMinijob().clear();
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
			case ElterngeldPackage.MINIJOB_TYPE__ZEITRAUM:
				return zeitraum != null;
			case ElterngeldPackage.MINIJOB_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_MINIJOB:
				return isSetWochenstundenJeTaetigkeitMinijob();
			case ElterngeldPackage.MINIJOB_TYPE__NACHWEIS_MINIJOB:
				return nachweisMinijob != null && !nachweisMinijob.isEmpty();
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
		result.append(" (wochenstundenJeTaetigkeitMinijob: ");
		if (wochenstundenJeTaetigkeitMinijobESet) result.append(wochenstundenJeTaetigkeitMinijob); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MinijobTypeImpl
