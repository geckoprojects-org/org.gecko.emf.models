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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType;

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
 * An implementation of the model object '<em><b>Teilzeittaetigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TeilzeittaetigkeitTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TeilzeittaetigkeitTypeImpl#getWochenstundenJeTaetigkeitTeilzeit <em>Wochenstunden Je Taetigkeit Teilzeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TeilzeittaetigkeitTypeImpl#getNachweisTeilzeit <em>Nachweis Teilzeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeilzeittaetigkeitTypeImpl extends MinimalEObjectImpl.Container implements TeilzeittaetigkeitType {
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
	 * The default value of the '{@link #getWochenstundenJeTaetigkeitTeilzeit() <em>Wochenstunden Je Taetigkeit Teilzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitTeilzeit()
	 * @generated
	 * @ordered
	 */
	protected static final float WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeitTeilzeit() <em>Wochenstunden Je Taetigkeit Teilzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitTeilzeit()
	 * @generated
	 * @ordered
	 */
	protected float wochenstundenJeTaetigkeitTeilzeit = WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT_EDEFAULT;

	/**
	 * This is true if the Wochenstunden Je Taetigkeit Teilzeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wochenstundenJeTaetigkeitTeilzeitESet;

	/**
	 * The cached value of the '{@link #getNachweisTeilzeit() <em>Nachweis Teilzeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisTeilzeit()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisTeilzeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeilzeittaetigkeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getTeilzeittaetigkeitType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM, oldZeitraum, newZeitraum);
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
				msgs = ((InternalEObject)zeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM, null, msgs);
			if (newZeitraum != null)
				msgs = ((InternalEObject)newZeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM, null, msgs);
			msgs = basicSetZeitraum(newZeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM, newZeitraum, newZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWochenstundenJeTaetigkeitTeilzeit() {
		return wochenstundenJeTaetigkeitTeilzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeitTeilzeit(float newWochenstundenJeTaetigkeitTeilzeit) {
		float oldWochenstundenJeTaetigkeitTeilzeit = wochenstundenJeTaetigkeitTeilzeit;
		wochenstundenJeTaetigkeitTeilzeit = newWochenstundenJeTaetigkeitTeilzeit;
		boolean oldWochenstundenJeTaetigkeitTeilzeitESet = wochenstundenJeTaetigkeitTeilzeitESet;
		wochenstundenJeTaetigkeitTeilzeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT, oldWochenstundenJeTaetigkeitTeilzeit, wochenstundenJeTaetigkeitTeilzeit, !oldWochenstundenJeTaetigkeitTeilzeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWochenstundenJeTaetigkeitTeilzeit() {
		float oldWochenstundenJeTaetigkeitTeilzeit = wochenstundenJeTaetigkeitTeilzeit;
		boolean oldWochenstundenJeTaetigkeitTeilzeitESet = wochenstundenJeTaetigkeitTeilzeitESet;
		wochenstundenJeTaetigkeitTeilzeit = WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT_EDEFAULT;
		wochenstundenJeTaetigkeitTeilzeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT, oldWochenstundenJeTaetigkeitTeilzeit, WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT_EDEFAULT, oldWochenstundenJeTaetigkeitTeilzeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWochenstundenJeTaetigkeitTeilzeit() {
		return wochenstundenJeTaetigkeitTeilzeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisTeilzeit() {
		if (nachweisTeilzeit == null) {
			nachweisTeilzeit = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT);
		}
		return nachweisTeilzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM:
				return basicSetZeitraum(null, msgs);
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT:
				return ((InternalEList<?>)getNachweisTeilzeit()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT:
				return getWochenstundenJeTaetigkeitTeilzeit();
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT:
				return getNachweisTeilzeit();
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
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)newValue);
				return;
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT:
				setWochenstundenJeTaetigkeitTeilzeit((Float)newValue);
				return;
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT:
				getNachweisTeilzeit().clear();
				getNachweisTeilzeit().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)null);
				return;
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT:
				unsetWochenstundenJeTaetigkeitTeilzeit();
				return;
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT:
				getNachweisTeilzeit().clear();
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
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__ZEITRAUM:
				return zeitraum != null;
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_TEILZEIT:
				return isSetWochenstundenJeTaetigkeitTeilzeit();
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE__NACHWEIS_TEILZEIT:
				return nachweisTeilzeit != null && !nachweisTeilzeit.isEmpty();
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
		result.append(" (wochenstundenJeTaetigkeitTeilzeit: ");
		if (wochenstundenJeTaetigkeitTeilzeitESet) result.append(wochenstundenJeTaetigkeitTeilzeit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TeilzeittaetigkeitTypeImpl
