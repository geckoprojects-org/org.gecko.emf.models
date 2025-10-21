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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AufbewahrungsdauerType;
import de.xoev.domea.domea.DomeaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aufbewahrungsdauer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl#getAnzahlJahre <em>Anzahl Jahre</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl#isUnbefristet <em>Unbefristet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AufbewahrungsdauerTypeImpl extends MinimalEObjectImpl.Container implements AufbewahrungsdauerType {
	/**
	 * The default value of the '{@link #getAnzahlJahre() <em>Anzahl Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlJahre()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_JAHRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlJahre() <em>Anzahl Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlJahre()
	 * @generated
	 * @ordered
	 */
	protected int anzahlJahre = ANZAHL_JAHRE_EDEFAULT;

	/**
	 * This is true if the Anzahl Jahre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anzahlJahreESet;

	/**
	 * The default value of the '{@link #isUnbefristet() <em>Unbefristet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbefristet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNBEFRISTET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnbefristet() <em>Unbefristet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbefristet()
	 * @generated
	 * @ordered
	 */
	protected boolean unbefristet = UNBEFRISTET_EDEFAULT;

	/**
	 * This is true if the Unbefristet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unbefristetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AufbewahrungsdauerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AUFBEWAHRUNGSDAUER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnzahlJahre() {
		return anzahlJahre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlJahre(int newAnzahlJahre) {
		int oldAnzahlJahre = anzahlJahre;
		anzahlJahre = newAnzahlJahre;
		boolean oldAnzahlJahreESet = anzahlJahreESet;
		anzahlJahreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE, oldAnzahlJahre, anzahlJahre, !oldAnzahlJahreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnzahlJahre() {
		int oldAnzahlJahre = anzahlJahre;
		boolean oldAnzahlJahreESet = anzahlJahreESet;
		anzahlJahre = ANZAHL_JAHRE_EDEFAULT;
		anzahlJahreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE, oldAnzahlJahre, ANZAHL_JAHRE_EDEFAULT, oldAnzahlJahreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnzahlJahre() {
		return anzahlJahreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnbefristet() {
		return unbefristet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnbefristet(boolean newUnbefristet) {
		boolean oldUnbefristet = unbefristet;
		unbefristet = newUnbefristet;
		boolean oldUnbefristetESet = unbefristetESet;
		unbefristetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET, oldUnbefristet, unbefristet, !oldUnbefristetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnbefristet() {
		boolean oldUnbefristet = unbefristet;
		boolean oldUnbefristetESet = unbefristetESet;
		unbefristet = UNBEFRISTET_EDEFAULT;
		unbefristetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET, oldUnbefristet, UNBEFRISTET_EDEFAULT, oldUnbefristetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnbefristet() {
		return unbefristetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE:
				return getAnzahlJahre();
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET:
				return isUnbefristet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE:
				setAnzahlJahre((Integer)newValue);
				return;
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET:
				setUnbefristet((Boolean)newValue);
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
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE:
				unsetAnzahlJahre();
				return;
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET:
				unsetUnbefristet();
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
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE:
				return isSetAnzahlJahre();
			case DomeaPackage.AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET:
				return isSetUnbefristet();
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
		result.append(" (anzahlJahre: ");
		if (anzahlJahreESet) result.append(anzahlJahre); else result.append("<unset>");
		result.append(", unbefristet: ");
		if (unbefristetESet) result.append(unbefristet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AufbewahrungsdauerTypeImpl
