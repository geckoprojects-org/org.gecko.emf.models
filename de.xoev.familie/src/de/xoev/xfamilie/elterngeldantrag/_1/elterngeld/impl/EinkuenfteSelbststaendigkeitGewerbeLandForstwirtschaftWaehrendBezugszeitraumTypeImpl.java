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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

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
 * An implementation of the model object '<em><b>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl#getEinkuenfteBeantragterZeitraum <em>Einkuenfte Beantragter Zeitraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType {
	/**
	 * The default value of the '{@link #isSteuerfreibetragSelbstaendigkeit() <em>Steuerfreibetrag Selbstaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetragSelbstaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEUERFREIBETRAG_SELBSTAENDIGKEIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSteuerfreibetragSelbstaendigkeit() <em>Steuerfreibetrag Selbstaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetragSelbstaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetragSelbstaendigkeit = STEUERFREIBETRAG_SELBSTAENDIGKEIT_EDEFAULT;

	/**
	 * This is true if the Steuerfreibetrag Selbstaendigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetragSelbstaendigkeitESet;

	/**
	 * The cached value of the '{@link #getEinkuenfteBeantragterZeitraum() <em>Einkuenfte Beantragter Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteBeantragterZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<EinkuenfteBeantragterZeitraumType> einkuenfteBeantragterZeitraum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSteuerfreibetragSelbstaendigkeit() {
		return steuerfreibetragSelbstaendigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteuerfreibetragSelbstaendigkeit(boolean newSteuerfreibetragSelbstaendigkeit) {
		boolean oldSteuerfreibetragSelbstaendigkeit = steuerfreibetragSelbstaendigkeit;
		steuerfreibetragSelbstaendigkeit = newSteuerfreibetragSelbstaendigkeit;
		boolean oldSteuerfreibetragSelbstaendigkeitESet = steuerfreibetragSelbstaendigkeitESet;
		steuerfreibetragSelbstaendigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT, oldSteuerfreibetragSelbstaendigkeit, steuerfreibetragSelbstaendigkeit, !oldSteuerfreibetragSelbstaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSteuerfreibetragSelbstaendigkeit() {
		boolean oldSteuerfreibetragSelbstaendigkeit = steuerfreibetragSelbstaendigkeit;
		boolean oldSteuerfreibetragSelbstaendigkeitESet = steuerfreibetragSelbstaendigkeitESet;
		steuerfreibetragSelbstaendigkeit = STEUERFREIBETRAG_SELBSTAENDIGKEIT_EDEFAULT;
		steuerfreibetragSelbstaendigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT, oldSteuerfreibetragSelbstaendigkeit, STEUERFREIBETRAG_SELBSTAENDIGKEIT_EDEFAULT, oldSteuerfreibetragSelbstaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSteuerfreibetragSelbstaendigkeit() {
		return steuerfreibetragSelbstaendigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EinkuenfteBeantragterZeitraumType> getEinkuenfteBeantragterZeitraum() {
		if (einkuenfteBeantragterZeitraum == null) {
			einkuenfteBeantragterZeitraum = new EObjectContainmentEList<EinkuenfteBeantragterZeitraumType>(EinkuenfteBeantragterZeitraumType.class, this, ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM);
		}
		return einkuenfteBeantragterZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM:
				return ((InternalEList<?>)getEinkuenfteBeantragterZeitraum()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT:
				return isSteuerfreibetragSelbstaendigkeit();
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM:
				return getEinkuenfteBeantragterZeitraum();
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
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT:
				setSteuerfreibetragSelbstaendigkeit((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM:
				getEinkuenfteBeantragterZeitraum().clear();
				getEinkuenfteBeantragterZeitraum().addAll((Collection<? extends EinkuenfteBeantragterZeitraumType>)newValue);
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
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT:
				unsetSteuerfreibetragSelbstaendigkeit();
				return;
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM:
				getEinkuenfteBeantragterZeitraum().clear();
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
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG_SELBSTAENDIGKEIT:
				return isSetSteuerfreibetragSelbstaendigkeit();
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_BEANTRAGTER_ZEITRAUM:
				return einkuenfteBeantragterZeitraum != null && !einkuenfteBeantragterZeitraum.isEmpty();
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
		result.append(" (steuerfreibetragSelbstaendigkeit: ");
		if (steuerfreibetragSelbstaendigkeitESet) result.append(steuerfreibetragSelbstaendigkeit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeImpl
