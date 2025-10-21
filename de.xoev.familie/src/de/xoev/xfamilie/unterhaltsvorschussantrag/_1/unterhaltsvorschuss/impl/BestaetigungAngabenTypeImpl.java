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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bestaetigung Angaben Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BestaetigungAngabenTypeImpl#isWahrheitsgemaesseAngaben <em>Wahrheitsgemaesse Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BestaetigungAngabenTypeImpl#isVerpflichtungAenderungsmitteilungen <em>Verpflichtung Aenderungsmitteilungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BestaetigungAngabenTypeImpl extends MinimalEObjectImpl.Container implements BestaetigungAngabenType {
	/**
	 * The default value of the '{@link #isWahrheitsgemaesseAngaben() <em>Wahrheitsgemaesse Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWahrheitsgemaesseAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAHRHEITSGEMAESSE_ANGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWahrheitsgemaesseAngaben() <em>Wahrheitsgemaesse Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWahrheitsgemaesseAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean wahrheitsgemaesseAngaben = WAHRHEITSGEMAESSE_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Wahrheitsgemaesse Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wahrheitsgemaesseAngabenESet;

	/**
	 * The default value of the '{@link #isVerpflichtungAenderungsmitteilungen() <em>Verpflichtung Aenderungsmitteilungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerpflichtungAenderungsmitteilungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerpflichtungAenderungsmitteilungen() <em>Verpflichtung Aenderungsmitteilungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerpflichtungAenderungsmitteilungen()
	 * @generated
	 * @ordered
	 */
	protected boolean verpflichtungAenderungsmitteilungen = VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN_EDEFAULT;

	/**
	 * This is true if the Verpflichtung Aenderungsmitteilungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verpflichtungAenderungsmitteilungenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BestaetigungAngabenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getBestaetigungAngabenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWahrheitsgemaesseAngaben() {
		return wahrheitsgemaesseAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWahrheitsgemaesseAngaben(boolean newWahrheitsgemaesseAngaben) {
		boolean oldWahrheitsgemaesseAngaben = wahrheitsgemaesseAngaben;
		wahrheitsgemaesseAngaben = newWahrheitsgemaesseAngaben;
		boolean oldWahrheitsgemaesseAngabenESet = wahrheitsgemaesseAngabenESet;
		wahrheitsgemaesseAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN, oldWahrheitsgemaesseAngaben, wahrheitsgemaesseAngaben, !oldWahrheitsgemaesseAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWahrheitsgemaesseAngaben() {
		boolean oldWahrheitsgemaesseAngaben = wahrheitsgemaesseAngaben;
		boolean oldWahrheitsgemaesseAngabenESet = wahrheitsgemaesseAngabenESet;
		wahrheitsgemaesseAngaben = WAHRHEITSGEMAESSE_ANGABEN_EDEFAULT;
		wahrheitsgemaesseAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN, oldWahrheitsgemaesseAngaben, WAHRHEITSGEMAESSE_ANGABEN_EDEFAULT, oldWahrheitsgemaesseAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWahrheitsgemaesseAngaben() {
		return wahrheitsgemaesseAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerpflichtungAenderungsmitteilungen() {
		return verpflichtungAenderungsmitteilungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerpflichtungAenderungsmitteilungen(boolean newVerpflichtungAenderungsmitteilungen) {
		boolean oldVerpflichtungAenderungsmitteilungen = verpflichtungAenderungsmitteilungen;
		verpflichtungAenderungsmitteilungen = newVerpflichtungAenderungsmitteilungen;
		boolean oldVerpflichtungAenderungsmitteilungenESet = verpflichtungAenderungsmitteilungenESet;
		verpflichtungAenderungsmitteilungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN, oldVerpflichtungAenderungsmitteilungen, verpflichtungAenderungsmitteilungen, !oldVerpflichtungAenderungsmitteilungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerpflichtungAenderungsmitteilungen() {
		boolean oldVerpflichtungAenderungsmitteilungen = verpflichtungAenderungsmitteilungen;
		boolean oldVerpflichtungAenderungsmitteilungenESet = verpflichtungAenderungsmitteilungenESet;
		verpflichtungAenderungsmitteilungen = VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN_EDEFAULT;
		verpflichtungAenderungsmitteilungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN, oldVerpflichtungAenderungsmitteilungen, VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN_EDEFAULT, oldVerpflichtungAenderungsmitteilungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerpflichtungAenderungsmitteilungen() {
		return verpflichtungAenderungsmitteilungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN:
				return isWahrheitsgemaesseAngaben();
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN:
				return isVerpflichtungAenderungsmitteilungen();
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
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN:
				setWahrheitsgemaesseAngaben((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN:
				setVerpflichtungAenderungsmitteilungen((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN:
				unsetWahrheitsgemaesseAngaben();
				return;
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN:
				unsetVerpflichtungAenderungsmitteilungen();
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
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__WAHRHEITSGEMAESSE_ANGABEN:
				return isSetWahrheitsgemaesseAngaben();
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE__VERPFLICHTUNG_AENDERUNGSMITTEILUNGEN:
				return isSetVerpflichtungAenderungsmitteilungen();
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
		result.append(" (wahrheitsgemaesseAngaben: ");
		if (wahrheitsgemaesseAngabenESet) result.append(wahrheitsgemaesseAngaben); else result.append("<unset>");
		result.append(", verpflichtungAenderungsmitteilungen: ");
		if (verpflichtungAenderungsmitteilungenESet) result.append(verpflichtungAenderungsmitteilungen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BestaetigungAngabenTypeImpl
