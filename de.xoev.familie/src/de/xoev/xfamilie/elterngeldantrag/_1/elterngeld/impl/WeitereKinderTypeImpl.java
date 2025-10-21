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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Weitere Kinder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.WeitereKinderTypeImpl#getAnzahlAllerImHaushaltLebendenKinder <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.WeitereKinderTypeImpl#getAngabenWeiteresKind <em>Angaben Weiteres Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeitereKinderTypeImpl extends MinimalEObjectImpl.Container implements WeitereKinderType {
	/**
	 * The default value of the '{@link #getAnzahlAllerImHaushaltLebendenKinder() <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlAllerImHaushaltLebendenKinder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzahlAllerImHaushaltLebendenKinder() <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlAllerImHaushaltLebendenKinder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anzahlAllerImHaushaltLebendenKinder = ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAngabenWeiteresKind() <em>Angaben Weiteres Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenWeiteresKind()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenWeiteresKindType> angabenWeiteresKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeitereKinderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getWeitereKinderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAnzahlAllerImHaushaltLebendenKinder() {
		return anzahlAllerImHaushaltLebendenKinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlAllerImHaushaltLebendenKinder(BigInteger newAnzahlAllerImHaushaltLebendenKinder) {
		BigInteger oldAnzahlAllerImHaushaltLebendenKinder = anzahlAllerImHaushaltLebendenKinder;
		anzahlAllerImHaushaltLebendenKinder = newAnzahlAllerImHaushaltLebendenKinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER, oldAnzahlAllerImHaushaltLebendenKinder, anzahlAllerImHaushaltLebendenKinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenWeiteresKindType> getAngabenWeiteresKind() {
		if (angabenWeiteresKind == null) {
			angabenWeiteresKind = new EObjectContainmentEList<AngabenWeiteresKindType>(AngabenWeiteresKindType.class, this, ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND);
		}
		return angabenWeiteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND:
				return ((InternalEList<?>)getAngabenWeiteresKind()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER:
				return getAnzahlAllerImHaushaltLebendenKinder();
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND:
				return getAngabenWeiteresKind();
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
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER:
				setAnzahlAllerImHaushaltLebendenKinder((BigInteger)newValue);
				return;
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND:
				getAngabenWeiteresKind().clear();
				getAngabenWeiteresKind().addAll((Collection<? extends AngabenWeiteresKindType>)newValue);
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
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER:
				setAnzahlAllerImHaushaltLebendenKinder(ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER_EDEFAULT);
				return;
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND:
				getAngabenWeiteresKind().clear();
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
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER:
				return ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER_EDEFAULT == null ? anzahlAllerImHaushaltLebendenKinder != null : !ANZAHL_ALLER_IM_HAUSHALT_LEBENDEN_KINDER_EDEFAULT.equals(anzahlAllerImHaushaltLebendenKinder);
			case ElterngeldPackage.WEITERE_KINDER_TYPE__ANGABEN_WEITERES_KIND:
				return angabenWeiteresKind != null && !angabenWeiteresKind.isEmpty();
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
		result.append(" (anzahlAllerImHaushaltLebendenKinder: ");
		result.append(anzahlAllerImHaushaltLebendenKinder);
		result.append(')');
		return result.toString();
	}

} //WeitereKinderTypeImpl
